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

package com.sforce.ws.bind;

import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * Test to verify that specific elements exist in the WSDL file.
 * This ensures that manually added elements required for proper serialization are present.
 */
public class WsdlXPathTest {

    /**
     * Helper method to set up the document and XPath for WSDL testing
     */
    private Document setupDocumentAndXPath(XPath xpath) throws ParserConfigurationException, IOException, SAXException {
        // Path to the WSDL file
        File wsdlFile = new File("src/main/resources/metadata_with_rlm.wsdl");

        // Parse the XML file
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true); // Enable namespace awareness
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(wsdlFile);

        // Set up namespace context
        xpath.setNamespaceContext(new NamespaceContext() {
            @Override
            public String getNamespaceURI(String prefix) {
                if ("xsd".equals(prefix)) {
                    return "http://www.w3.org/2001/XMLSchema";
                }
                return null;
            }

            @Override
            public String getPrefix(String namespaceURI) {
                return null;
            }

            @Override
            public Iterator<String> getPrefixes(String namespaceURI) {
                return null;
            }
        });

        return document;
    }

    /**
     * Test to verify that the processType element exists in ExpressionSetDefinitionVersion.
     * This element is required for subcomponents calculation to prevent serialization errors.
     */
    @Test
    public void testExpressionSetDefinitionVersionProcessTypeExists() throws ParserConfigurationException, IOException, SAXException {
        // Create XPath instance
        XPath xpath = XPathFactory.newInstance().newXPath();
        Document document = setupDocumentAndXPath(xpath);

        try {
            // Check if the processType element exists in ExpressionSetDefinitionVersion
            Object result = xpath.evaluate(
                "//xsd:complexType[@name='ExpressionSetDefinitionVersion']//xsd:element[@name='processType']",
                document,
                XPathConstants.NODE
            );

            // Assert that the element exists
            assertNotNull(
                "ERROR: The processType element in ExpressionSetDefinitionVersion was not found. " +
                "This element was added manually and MUST be present or the subcomponents calculation " +
                "will fail due to serialization errors. Do not remove this element!",
                result
            );
        } catch (XPathExpressionException e) {
            fail("XPath expression evaluation failed: " + e.getMessage());
        }
    }

    /**
     * Test to verify the complete path ExpressionSetDefinition->versions->processType.
     * This ensures that the relationship between these elements is correctly defined.
     */
    @Test
    public void testExpressionSetDefinitionVersionsProcessTypePath() throws ParserConfigurationException, IOException, SAXException {
        // Create XPath instance
        XPath xpath = XPathFactory.newInstance().newXPath();
        Document document = setupDocumentAndXPath(xpath);

        try {
            // Check if ExpressionSetDefinition has a versions element of type ExpressionSetDefinitionVersion
            Object versionsResult = xpath.evaluate(
                "//xsd:complexType[@name='ExpressionSetDefinition']//xsd:element[@name='versions'][@type='tns:ExpressionSetDefinitionVersion']",
                document,
                XPathConstants.NODE
            );

            // Assert that the versions element exists with the correct type
            assertNotNull(
                "The versions element in ExpressionSetDefinition with type ExpressionSetDefinitionVersion was not found. " +
                "This relationship is required for proper serialization.",
                versionsResult
            );

            // Check if ExpressionSetDefinitionVersion has a processType element
            Object processTypeResult = xpath.evaluate(
                "//xsd:complexType[@name='ExpressionSetDefinitionVersion']//xsd:element[@name='processType']",
                document,
                XPathConstants.NODE
            );

            // Assert that the processType element exists
            assertNotNull(
                "ERROR: The processType element in ExpressionSetDefinitionVersion was not found. " +
                "This element was added manually and MUST be present or the subcomponents calculation " +
                "will fail due to serialization errors. Do not remove this element!",
                processTypeResult
            );
        } catch (XPathExpressionException e) {
            fail("XPath expression evaluation failed: " + e.getMessage());
        }
    }

    /**
     * Test to verify that the interfaceSourceType element exists in ExpressionSetDefinitionVersion.
     * This element is required for subcomponents calculation to prevent serialization errors.
     */
    @Test
    public void testExpressionSetDefinitionVersionInterfaceSourceTypeExists() throws ParserConfigurationException, IOException, SAXException {
        // Create XPath instance
        XPath xpath = XPathFactory.newInstance().newXPath();
        Document document = setupDocumentAndXPath(xpath);

        try {
            // Check if the interfaceSourceType element exists in ExpressionSetDefinitionVersion
            Object result = xpath.evaluate(
                "//xsd:complexType[@name='ExpressionSetDefinitionVersion']//xsd:element[@name='interfaceSourceType']",
                document,
                XPathConstants.NODE
            );

            // Assert that the element exists
            assertNotNull(
                "ERROR: The interfaceSourceType element in ExpressionSetDefinitionVersion was not found. " +
                "This element was added manually and MUST be present or the subcomponents calculation " +
                "will fail due to serialization errors. Do not remove this element!",
                result
            );
        } catch (XPathExpressionException e) {
            fail("XPath expression evaluation failed: " + e.getMessage());
        }
    }

    /**
     * Test to verify the complete path ExpressionSetDefinition->versions->interfaceSourceType.
     * This ensures that the relationship between these elements is correctly defined.
     */
    @Test
    public void testExpressionSetDefinitionVersionsInterfaceSourceTypePath() throws ParserConfigurationException, IOException, SAXException {
        // Create XPath instance
        XPath xpath = XPathFactory.newInstance().newXPath();
        Document document = setupDocumentAndXPath(xpath);

        try {
            // Check if ExpressionSetDefinition has a versions element of type ExpressionSetDefinitionVersion
            Object versionsResult = xpath.evaluate(
                "//xsd:complexType[@name='ExpressionSetDefinition']//xsd:element[@name='versions'][@type='tns:ExpressionSetDefinitionVersion']",
                document,
                XPathConstants.NODE
            );

            // Assert that the versions element exists with the correct type
            assertNotNull(
                "The versions element in ExpressionSetDefinition with type ExpressionSetDefinitionVersion was not found. " +
                "This relationship is required for proper serialization.",
                versionsResult
            );

            // Check if ExpressionSetDefinitionVersion has an interfaceSourceType element
            Object interfaceSourceTypeResult = xpath.evaluate(
                "//xsd:complexType[@name='ExpressionSetDefinitionVersion']//xsd:element[@name='interfaceSourceType']",
                document,
                XPathConstants.NODE
            );

            // Assert that the interfaceSourceType element exists
            assertNotNull(
                "ERROR: The interfaceSourceType element in ExpressionSetDefinitionVersion was not found. " +
                "This element was added manually and MUST be present or the subcomponents calculation " +
                "will fail due to serialization errors. Do not remove this element!",
                interfaceSourceTypeResult
            );
        } catch (XPathExpressionException e) {
            fail("XPath expression evaluation failed: " + e.getMessage());
        }
    }
}
