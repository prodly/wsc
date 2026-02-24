/*
 * Copyright (c) 2017, salesforce.com, inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided
 * that the following conditions are met:
 *
 *    Redistributions of source code must retain the above copyright notice, this list of conditions and the
 *    following disclaimer.
 *
 *    Redistributions in binary form must reproduce the above copyright notice, this list of conditions and
 *    the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *    Neither the name of salesforce.com, inc. nor the names of its contributors may be used to endorse or
 *    promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package com.sforce.bulk;

import com.sforce.ws.ConnectionException;
import com.sforce.ws.util.FileUtil;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * This class is a helper to authenticate using the OAuth2 username-password flow.
 * The Salesforce SOAP Partner API login() call was removed from API versions 65.0
 * and later; this implementation uses the /services/oauth2/token endpoint instead.
 *
 * <p/>
 * User: mcheenath
 * Date: Dec 10, 2010
 */
public class LoginHelper {
    private static final String SALESFORCE_VERSION =  "66.0";
    private static final String GRANT_TYPE_PASSWORD = "grant_type=password";
    private static final String PARAM_CLIENT_ID = "&client_id=";
    private static final String PARAM_CLIENT_SECRET = "&client_secret=";
    private static final String PARAM_USERNAME = "&username=";
    private static final String PARAM_PASSWORD = "&password=";
    private static final String HTTP_METHOD_POST = "POST";
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    private static final String CONTENT_TYPE_FORM_URLENCODED = "application/x-www-form-urlencoded";
    private static final String JSON_FIELD_ACCESS_TOKEN = "access_token";
    private static final String JSON_FIELD_INSTANCE_URL = "instance_url";

    private final StreamHandler handler;

    LoginHelper(StreamHandler handler) {
        this.handler = handler;
    }

    void doLogin() throws IOException, StreamException {
        String authEndpoint = handler.getConfig().getAuthEndpoint();
        if (authEndpoint == null || authEndpoint.isEmpty()) {
            throw new StreamException("authEndpoint is required. Set it via ConnectorConfig.setAuthEndpoint().");
        }

        String username = handler.getConfig().getUsername();
        if (username == null || username.isEmpty()) {
            throw new StreamException("username is required. Set it via ConnectorConfig.setUsername().");
        }

        String password = handler.getConfig().getPassword();
        if (password == null || password.isEmpty()) {
            throw new StreamException("password is required. Set it via ConnectorConfig.setPassword().");
        }

        String baseUrl = deriveBaseUrl(authEndpoint);
        String apiVersion = deriveApiVersion(authEndpoint);
        String tokenUrl = baseUrl + "/services/oauth2/token";

        handler.info("Calling OAuth2 login on: " + tokenUrl);

        String clientId = handler.getConfig().getClientId();
        String clientSecret = handler.getConfig().getClientSecret();

        if (clientId == null || clientId.isEmpty()) {
            throw new StreamException(
                "clientId is required for OAuth2 authentication. " +
                "Set it via ConnectorConfig.setClientId() with your Connected App consumer key.");
        }

        String body = GRANT_TYPE_PASSWORD
                + PARAM_CLIENT_ID + URLEncoder.encode(clientId, StandardCharsets.UTF_8)
                + PARAM_CLIENT_SECRET + URLEncoder.encode(clientSecret != null ? clientSecret : "", StandardCharsets.UTF_8)
                + PARAM_USERNAME + URLEncoder.encode(username, StandardCharsets.UTF_8)
                + PARAM_PASSWORD + URLEncoder.encode(password, StandardCharsets.UTF_8);

        URL url;
        try {
            url = new URL(tokenUrl);
        } catch (MalformedURLException e) {
            throw new StreamException("Invalid OAuth2 token URL: " + tokenUrl);
        }

        HttpURLConnection conn;
        conn = handler.getConfig().createConnection(url, null, false);

        conn.setRequestMethod(HTTP_METHOD_POST);
        conn.setRequestProperty(HEADER_CONTENT_TYPE, CONTENT_TYPE_FORM_URLENCODED);
        conn.setDoOutput(true);

        try (OutputStream os = conn.getOutputStream()) {
            os.write(body.getBytes(StandardCharsets.UTF_8));
        }

        int status = conn.getResponseCode();
        InputStream errorStream = conn.getErrorStream();
        InputStream responseStream = status == 200 ? conn.getInputStream() : errorStream;
        byte[] responseBytes = responseStream != null ? FileUtil.toBytes(responseStream) : new byte[0];
        String response = new String(responseBytes, StandardCharsets.UTF_8);

        if (status != 200) {
            throw new StreamException("OAuth2 login failed (HTTP " + status + "): " + response);
        }

        String accessToken = extractJsonStringValue(JSON_FIELD_ACCESS_TOKEN, response);
        String instanceUrl = extractJsonStringValue(JSON_FIELD_INSTANCE_URL, response);

        if (accessToken == null || instanceUrl == null) {
            throw new StreamException("Failed to parse OAuth2 response: " + response);
        }

        handler.getConfig().setSessionId(accessToken);
        handler.info("Access token obtained successfully.");

        String bulkUrl = instanceUrl + "/services/async/" + apiVersion + "/";
        handler.getConfig().setRestEndpoint(bulkUrl);
        handler.info("Bulk API Server Url: " + bulkUrl);
    }

    /**
     * Extracts the base URL (scheme + host + optional port) from a SOAP auth endpoint such as
     * https://login.salesforce.com/services/Soap/u/66.0, or falls back to URL parsing.
     */
    private String deriveBaseUrl(String authEndpoint) throws StreamException {
        int idx = authEndpoint.indexOf("/services/");
        if (idx != -1) {
            return authEndpoint.substring(0, idx);
        }
        try {
            URL u = new URL(authEndpoint);
            int port = u.getPort();
            return u.getProtocol() + "://" + u.getHost() + (port != -1 ? ":" + port : "");
        } catch (MalformedURLException e) {
            throw new StreamException("Cannot derive base URL from authEndpoint: " + authEndpoint);
        }
    }

    /**
     * Extracts the API version from a SOAP auth endpoint such as
     * https://login.salesforce.com/services/Soap/u/66.0 → "66.0".
     */
    private String deriveApiVersion(String authEndpoint) {
        String soapPath = "/services/Soap/u/";
        int idx = authEndpoint.indexOf(soapPath);
        if (idx != -1) {
            String tail = authEndpoint.substring(idx + soapPath.length());
            int slash = tail.indexOf('/');
            return slash != -1 ? tail.substring(0, slash) : tail;
        }
        return SALESFORCE_VERSION;
    }

    /**
     * Minimal JSON string-value extractor for flat OAuth2 responses.
     * Handles escaped quotes within the value are not expected in these fields.
     */
    private String extractJsonStringValue(String key, String json) {
        String search = "\"" + key + "\"";
        int idx = json.indexOf(search);
        if (idx == -1) return null;
        int colon = json.indexOf(':', idx + search.length());
        if (colon == -1) return null;
        int start = json.indexOf('"', colon + 1);
        if (start == -1) return null;
        int end = json.indexOf('"', start + 1);
        if (end == -1) return null;
        return json.substring(start + 1, end);
    }
}
