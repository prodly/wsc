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

package com.sforce.async;

/**
 * StatusCode --
 *
 * @author mcheenath
 * @since 160
 */
public enum StatusCode {
    ALERT_NOTIFICATION_LIMIT_EXCEEDED,
    ALL_OR_NONE_OPERATION_ROLLED_BACK,
    ALREADY_APPLIED,
    ALREADY_IN_PROCESS,
    ALREADY_REDEEMED_VOUCHER,
    APEX_DATA_ACCESS_RESTRICTION,
    APEX_FAILED,
    APPLICATION_ALREADY_EXISTS,
    ASSIGNEE_TYPE_REQUIRED,
    ATTRIBUTE_DEFINITION_LIMIT_EXCEEDED,
    AURA_COMPILE_ERROR,
    AUTH_PROVIDER_NEEDS_AUTH,
    AUTH_PROVIDER_NOT_FOUND,
    B2B_SEARCH_ADMIN_ERROR,
    BAD_CUSTOM_ENTITY_PARENT_DOMAIN,
    BCC_NOT_ALLOWED_IF_BCC_COMPLIANCE_ENABLED,
    BLOCKED_EXCLUSIVE,
    CANNOT_CASCADE_PRODUCT_ACTIVE,
    CANNOT_CHANGE_FIELD_TYPE_OF_APEX_REFERENCED_FIELD,
    CANNOT_CHANGE_FIELD_TYPE_OF_REFERENCED_FIELD,
    CANNOT_CREATE_ANOTHER_MANAGED_PACKAGE,
    CANNOT_DEACTIVATE_DIVISION,
    CANNOT_DELETE_GLOBAL_ACTION_LIST,
    CANNOT_DELETE_LAST_DATED_CONVERSION_RATE,
    CANNOT_DELETE_MANAGED_OBJECT,
    CANNOT_DISABLE_LAST_ADMIN,
    CANNOT_ENABLE_IP_RESTRICT_REQUESTS,
    CANNOT_EXECUTE_FLOW_TRIGGER,
    CANNOT_FREEZE_SELF,
    CANNOT_INSERT_UPDATE_ACTIVATE_ENTITY,
    CANNOT_MODIFY_MANAGED_OBJECT,
    CANNOT_PASSWORD_LOCKOUT,
    CANNOT_POST_TO_ARCHIVED_GROUP,
    CANNOT_RENAME_APEX_REFERENCED_FIELD,
    CANNOT_RENAME_APEX_REFERENCED_OBJECT,
    CANNOT_RENAME_REFERENCED_FIELD,
    CANNOT_RENAME_REFERENCED_OBJECT,
    CANNOT_REPARENT_RECORD,
    CANNOT_UPDATE_CONVERTED_LEAD,
    CANNOT_UPDATE_IS_THIRD_PARTY,
    CANNOT_UPDATE_PAYMENT_METHOD_SET,
    CANT_DISABLE_CORP_CURRENCY,
    CANT_UNSET_CORP_CURRENCY,
    CART_DELIVERY_GROUP_NOT_FOUND,
    CART_ITEM_NOT_FOUND,
    CART_NOT_FOUND,
    CHECKOUT_CONFLICT,
    CHECKOUT_EXPIRED,
    CHECKOUT_INVALIDATED,
    CHECKOUT_LOCKED,
    CHECKOUT_NOT_FOUND,
    CHECKOUT_UNAUTHORIZED,
    CHILD_SHARE_FAILS_PARENT,
    CIRCULAR_DEPENDENCY,
    CLEAN_SERVICE_ERROR,
    CLM_INSUFFICIENT_ACCESS,
    CLM_RECORD_NOT_FOUND,
    CLONE_FIELD_INTEGRITY_EXCEPTION,
    CLONE_NOT_SUPPORTED,
    CMS_FOLDER_ITEM_MOVE_FAILED,
    COLLISION_DETECTED,
    COMMERCE_SEARCH_INDEXING_SYSTEM_ERROR,
    COMMERCE_SEARCH_MQ_ERROR,
    COMMERCE_SEARCH_PROVIDER_LIMIT_EXCEEDED,
    COMMERCE_SEARCH_RESOURCE_NOT_FOUND,
    COMMERCIAL_CONTROL_ERROR,
    COMMUNITY_NOT_ACCESSIBLE,
    CONFLICT,
    CONFLICTING_ENVIRONMENT_HUB_MEMBER,
    CONFLICTING_SSO_USER_MAPPING,
    CONTENT_NOT_FOUND,
    CONTENT_SEARCH_NOT_ENABLED,
    CONTENT_TYPE_DISABLED_FOR_API,
    CONTENT_TYPE_NOT_FOUND,
    COUPON_REDEMPTION_LIMIT_EXCEEDED,
    CUSTOM_APEX_ERROR,
    CUSTOM_CLOB_FIELD_LIMIT_EXCEEDED,
    CUSTOM_ENTITY_OR_FIELD_LIMIT,
    CUSTOM_FIELD_INDEX_LIMIT_EXCEEDED,
    CUSTOM_INDEX_EXISTS,
    CUSTOM_LINK_LIMIT_EXCEEDED,
    CUSTOM_METADATA_LIMIT_EXCEEDED,
    CUSTOM_METADATA_REL_FIELD_MANAGEABILITY,
    CUSTOM_SETTINGS_LIMIT_EXCEEDED,
    CUSTOM_TAB_LIMIT_EXCEEDED,
    DATAASSESSMENT_CONFIG_ASSESSMENT_IN_PROGRESS_ERROR,
    DATAASSESSMENT_CONFIG_SERVICE_ERROR,
    DATACLOUDADDRESS_NO_RECORDS_FOUND,
    DATACLOUDADDRESS_PROCESSING_ERROR,
    DATACLOUDADDRESS_SERVER_ERROR,
    DATA_MAPPING_NOT_FOUND,
    DATA_MAPPING_SCHEMA_NOT_FOUND,
    DATA_TRANSFER_RECORD_LIMIT_EXCEEDED,
    DATA_TYPE_NOT_SUPPORTED,
    DATE_OUT_OF_RANGE,
    DELETE_FAILED,
    DELETE_NOT_ALLOWED,
    DELETE_OPERATION_TOO_LARGE,
    DELETE_REQUIRED_ON_CASCADE,
    DEPENDENCY_EXISTS,
    DUPLICATES_DETECTED,
    DUPLICATE_CASE_SOLUTION,
    DUPLICATE_COMM_NICKNAME,
    DUPLICATE_CUSTOM_ENTITY_DEFINITION,
    DUPLICATE_CUSTOM_TAB_MOTIF,
    DUPLICATE_DEVELOPER_NAME,
    DUPLICATE_EXTERNAL_ID,
    DUPLICATE_MASTER_LABEL,
    DUPLICATE_SENDER_DISPLAY_NAME,
    DUPLICATE_USERNAME,
    DUPLICATE_VALUE,
    EMAIL_ADDRESS_BOUNCED,
    EMAIL_EXTERNAL_TRANSPORT_CONNECTION_ERROR,
    EMAIL_EXTERNAL_TRANSPORT_PERMISSION_ERROR,
    EMAIL_EXTERNAL_TRANSPORT_TOKEN_ERROR,
    EMAIL_EXTERNAL_TRANSPORT_TOO_LARGE_ERROR,
    EMAIL_EXTERNAL_TRANSPORT_TOO_MANY_REQUESTS_ERROR,
    EMAIL_EXTERNAL_TRANSPORT_UNKNOWN_ERROR,
    EMAIL_NOT_PROCESSED_DUE_TO_PRIOR_ERROR,
    EMAIL_OPTED_OUT,
    EMAIL_TEMPLATE_FORMULA_ERROR,
    EMAIL_TEMPLATE_MERGEFIELD_ACCESS_ERROR,
    EMAIL_TEMPLATE_MERGEFIELD_ERROR,
    EMAIL_TEMPLATE_MERGEFIELD_VALUE_ERROR,
    EMAIL_TEMPLATE_PROCESSING_ERROR,
    EMPTY_CATALOG,
    EMPTY_INGESTION_JOB,
    EMPTY_SCONTROL_FILE_NAME,
    ENHANCED_EMAIL_TEMPLATE_COMPILATION_ERROR,
    ENTITY_FAILED_IFLASTMODIFIED_ON_UPDATE,
    ENTITY_IS_ARCHIVED,
    ENTITY_IS_DELETED,
    ENTITY_IS_LOCKED,
    ENTITY_SAVE_ERROR,
    ENTITY_SAVE_VALIDATION_ERROR,
    ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT,
    ENVIRONMENT_HUB_MEMBERSHIP_ERROR_JOINING_HUB,
    ENVIRONMENT_HUB_MEMBERSHIP_USER_ALREADY_IN_HUB,
    ENVIRONMENT_HUB_MEMBERSHIP_USER_NOT_ORG_ADMIN,
    ERROR_CALCULATING_EXPIRY_DATE,
    ERROR_IN_MAILER,
    EXCEEDED_MAX_SEMIJOIN_SUBSELECTS_WRITE,
    EXCHANGE_WEB_SERVICES_URL_INVALID,
    EXTERNAL_RESOURCE_FORBIDDEN,
    FAILED_ACTIVATION,
    FAILED_DUE_TO_OTHER_INPUTS,
    FAILED_TO_RESOLVE_MAPPING,
    FAILED_TO_RESOLVE_SCHEMA_INFORMATION,
    FIELD_CUSTOM_VALIDATION_EXCEPTION,
    FIELD_FILTER_VALIDATION_EXCEPTION,
    FIELD_INTEGRITY_EXCEPTION,
    FIELD_KEYWORD_LIST_MATCH_LIMIT,
    FIELD_MAPPING_ERROR,
    FIELD_MODERATION_RULE_BLOCK,
    FIELD_NOT_UPDATABLE,
    FILE_EXTENSION_NOT_ALLOWED,
    FILE_SIZE_LIMIT_EXCEEDED,
    FILTERED_LOOKUP_LIMIT_EXCEEDED,
    FIND_DUPLICATES_ERROR,
    FLOW_EXCEPTION,
    FUNCTIONALITY_NOT_ENABLED,
    GET_EINSTEIN_TENANT_ERROR,
    GUEST_INSUFFICIENT_ACCESS,
    HAS_PUBLIC_REFERENCES,
    HTML_FILE_UPLOAD_NOT_ALLOWED,
    IAS_AM_AUTH_BAD_REQUEST,
    IAS_AM_AUTH_UNAUTHORIZED,
    IAS_INVALID_AUTH,
    IAS_INVALID_REQUEST_PARAMETER,
    IAS_RECORD_DOES_NOT_EXIST,
    IAS_TENANT_NOT_PROVISIONED,
    IAS_UNCOMMITTED_WORK,
    IMAGE_TOO_LARGE,
    INACTIVE_OWNER_OR_USER,
    INACTIVE_RULE_ERROR,
    INDEX_ITEM_LIMIT_EXCEEDED,
    INDEX_PAYLOAD_NOT_FOUND,
    INGESTION_JOB_RECORDS_LIMIT_EXCEEDED,
    INGESTION_TOTAL_FILE_SIZE_LIMIT_EXCEEDED,
    INPUTPARAM_INCOMPATIBLE_DATATYPE,
    INSERT_UPDATE_DELETE_NOT_ALLOWED_DURING_MAINTENANCE,
    INSUFFICIENT_ACCESS,
    INSUFFICIENT_ACCESS_ON_CROSS_REFERENCE_ENTITY,
    INSUFFICIENT_ACCESS_OR_READONLY,
    INSUFFICIENT_ACCESS_TO_INSIGHTSEXTERNALDATA,
    INSUFFICIENT_BALANCE,
    INSUFFICIENT_BENEFIT_REMAINING,
    INSUFFICIENT_CREDITS,
    INTEGRATION_CANCELLED,
    INTERNAL_ERROR,
    INVALID_ACCESS_LEVEL,
    INVALID_ACCESS_TOKEN,
    INVALID_ACCOUNT,
    INVALID_ACTION_VERSION,
    INVALID_API_INPUT,
    INVALID_ARGUMENT_TYPE,
    INVALID_ASSIGNEE_TYPE,
    INVALID_ASSIGNMENT_RULE,
    INVALID_AUTH_HEADER,
    INVALID_BATCH_OPERATION,
    INVALID_BUSINESS_HOURS_NAME,
    INVALID_CATEGORY_NETWORK,
    INVALID_CHECKOUT_INPUT,
    INVALID_CONTACT,
    INVALID_CONTENT_TYPE,
    INVALID_CREDIT_CARD_INFO,
    INVALID_CROSS_REFERENCE_KEY,
    INVALID_CROSS_REFERENCE_TYPE_FOR_FIELD,
    INVALID_CURRENCY_CONV_RATE,
    INVALID_CURRENCY_CORP_RATE,
    INVALID_CURRENCY_ISO,
    INVALID_DATASET_REFERENCE_INPUT,
    INVALID_DATA_CATEGORY_GROUP_REFERENCE,
    INVALID_DATA_URI,
    INVALID_EBV_OPERATION,
    INVALID_EMAIL_ADDRESS,
    INVALID_EMPTY_KEY_OWNER,
    INVALID_ENTITY_FOR_MATCH_ENGINE_ERROR,
    INVALID_ENTITY_FOR_MATCH_OPERATION_ERROR,
    INVALID_ENTITY_FOR_UPSERT,
    INVALID_ENVIRONMENT_HUB_MEMBER,
    INVALID_EVENT_DELIVERY,
    INVALID_EVENT_INPUT,
    INVALID_EVENT_SUBSCRIPTION,
    INVALID_EXTENSION_ID,
    INVALID_EXTERNAL_ID_FIELD_NAME,
    INVALID_FIELD,
    INVALID_FIELD_FOR_INSERT_UPDATE,
    INVALID_FIELD_WHEN_USING_TEMPLATE,
    INVALID_FILTER_ACTION,
    INVALID_GOOGLE_DOCS_URL,
    INVALID_ID_FIELD,
    INVALID_INET_ADDRESS,
    INVALID_INPUT,
    INVALID_INPUT_FORMAT,
    INVALID_KEY_FIELD_INPUT,
    INVALID_LINEITEM_CLONE_STATE,
    INVALID_MARKUP,
    INVALID_MASTER_OR_TRANSLATED_SOLUTION,
    INVALID_MERCHANT_ACCOUNT_MODE,
    INVALID_MERCHANT_ACCOUNT_MODE_OR_STATUS,
    INVALID_MERGE_RECORD,
    INVALID_MESSAGE_ID_REFERENCE,
    INVALID_NAMESPACE_PREFIX,
    INVALID_OAUTH_URL,
    INVALID_OPERATION,
    INVALID_OPERATOR,
    INVALID_OR_NULL_FOR_RESTRICTED_PICKLIST,
    INVALID_OWNER,
    INVALID_PACKAGE_LICENSE,
    INVALID_PACKAGE_VERSION,
    INVALID_PARTNER_NETWORK_STATUS,
    INVALID_PAYLOAD_VERSION,
    INVALID_PERSON_ACCOUNT_OPERATION,
    INVALID_PROFILE,
    INVALID_PROMOTION,
    INVALID_PROVIDER_TYPE,
    INVALID_QUERY_KEY,
    INVALID_QUERY_LOCATOR,
    INVALID_QUERY_VALUE,
    INVALID_READ_ONLY_USER_DML,
    INVALID_RECEIVEDDOCUMENTID_ATTACHMENT,
    INVALID_RECORD_ATTRIBUTE_VALUE,
    INVALID_RECORD_TYPE,
    INVALID_REFRESH_TOKEN,
    INVALID_REORDER_PORTAL_RECORD_ASSOCIATION,
    INVALID_REQUEST_STATE,
    INVALID_RUNTIME_VALUE,
    INVALID_SAVE_AS_ACTIVITY_FLAG,
    INVALID_SCS_INBOUND_USER,
    INVALID_SEARCH_PROVIDER_REQUEST,
    INVALID_SESSION_ID,
    INVALID_SETUP_OWNER,
    INVALID_SIGNUP_COUNTRY,
    INVALID_SIGNUP_OPTION,
    INVALID_SITE_DELETE_EXCEPTION,
    INVALID_SITE_FILE_IMPORTED_EXCEPTION,
    INVALID_SITE_FILE_TYPE_EXCEPTION,
    INVALID_SOURCE_OBJECT_ID,
    INVALID_STATUS,
    INVALID_SUBDOMAIN,
    INVALID_TARGET_OBJECT_NAME,
    INVALID_TEXT_REPRESENTATION,
    INVALID_TYPE,
    INVALID_TYPE_FOR_OPERATION,
    INVALID_TYPE_ON_FIELD_IN_RECORD,
    INVALID_UNMERGE_RECORD,
    INVALID_USERID,
    INVALID_USER_OBJECT,
    IP_RANGE_LIMIT_EXCEEDED,
    ITEM_NOT_FOUND,
    JIGSAW_IMPORT_LIMIT_EXCEEDED,
    LICENSE_LIMIT_EXCEEDED,
    LIGHT_PORTAL_USER_EXCEPTION,
    LIMIT_EXCEEDED,
    LIST_PRICE_NOT_FOUND,
    MALFORMED_ID,
    MANAGER_NOT_DEFINED,
    MASSMAIL_RETRY_LIMIT_EXCEEDED,
    MASS_MAIL_LIMIT_EXCEEDED,
    MATCH_DEFINITION_ERROR,
    MATCH_OPERATION_ERROR,
    MATCH_OPERATION_INVALID_ENGINE_ERROR,
    MATCH_OPERATION_INVALID_RULE_ERROR,
    MATCH_OPERATION_MISSING_ENGINE_ERROR,
    MATCH_OPERATION_MISSING_OBJECT_TYPE_ERROR,
    MATCH_OPERATION_MISSING_OPTIONS_ERROR,
    MATCH_OPERATION_MISSING_RULE_ERROR,
    MATCH_OPERATION_UNKNOWN_RULE_ERROR,
    MATCH_OPERATION_UNSUPPORTED_VERSION_ERROR,
    MATCH_PRECONDITION_FAILED,
    MATCH_PRECONDITION_REQUIRED,
    MATCH_RUNTIME_ERROR,
    MATCH_SERVICE_ERROR,
    MATCH_SERVICE_TIMED_OUT,
    MATCH_SERVICE_UNAVAILABLE_ERROR,
    MAXIMUM_CCEMAILS_EXCEEDED,
    MAXIMUM_DASHBOARD_COMPONENTS_EXCEEDED,
    MAXIMUM_HIERARCHY_CHILDREN_REACHED,
    MAXIMUM_HIERARCHY_LEVELS_REACHED,
    MAXIMUM_HIERARCHY_TREE_SIZE_REACHED,
    MAXIMUM_SIZE_OF_ATTACHMENT,
    MAXIMUM_SIZE_OF_DOCUMENT,
    MAX_ACTIONS_PER_RULE_EXCEEDED,
    MAX_ACTIVE_RULES_EXCEEDED,
    MAX_APPROVAL_STEPS_EXCEEDED,
    MAX_DEPTH_IN_FLOW_EXECUTION,
    MAX_FORMULAS_PER_RULE_EXCEEDED,
    MAX_LIMIT_EXCEEDED,
    MAX_LOCALES_EXCEEDED,
    MAX_RULES_EXCEEDED,
    MAX_RULE_ENTRIES_EXCEEDED,
    MAX_TASK_DESCRIPTION_EXCEEEDED,
    MAX_TM_RULES_EXCEEDED,
    MAX_TM_RULE_ITEMS_EXCEEDED,
    MAX_TRIGGERS_EXCEEDED,
    MERGE_FAILED,
    METADATA_FIELD_UPDATE_ERROR,
    METHOD_NOT_ALLOWED,
    MISMATCHING_TYPES,
    MISSING_ARGUMENT,
    MISSING_OMNI_PROCESS_ID,
    MISSING_PAY_NOW_SITE_URL_ORG_VALUE,
    MISSING_RECEIVEDDOCUMENTID_ATTACHMENT,
    MISSING_RECORD,
    MIXED_DML_OPERATION,
    MODEL_NOT_ACTIVE,
    MULTIPLE_CONTENT_FOUND,
    MULTIPLE_VOUCHERS,
    NONUNIQUE_SHIPPING_ADDRESS,
    NOT_FOUND,
    NOT_RECOVERABLE_SEARCH_PROVIDER_ERROR,
    NO_ACCESS_TOKEN,
    NO_ACCESS_TOKEN_FROM_REFRESH,
    NO_APPLICABLE_PROCESS,
    NO_ATTACHMENT_PERMISSION,
    NO_AUTH_PROVIDER,
    NO_BUSINESS_HOURS_FOUND,
    NO_INACTIVE_DIVISION_MEMBERS,
    NO_MASS_MAIL_PERMISSION,
    NO_MESSAGE_TYPE_MESSAGES,
    NO_PARTNER_PERMISSION,
    NO_REFRESH_TOKEN,
    NO_SEARCH_ATTRIBUTES,
    NO_SINGLE_MAIL_PERMISSION,
    NO_SORT_PRICEBOOK_ASSOCIATED_ERROR,
    NO_SUCH_USER_EXISTS,
    NO_TOKEN_ENDPOINT,
    NUMBER_OUTSIDE_VALID_RANGE,
    NUM_HISTORY_FIELDS_BY_SOBJECT_EXCEEDED,
    OCR_INVALID_REQUEST,
    OPERATION_ENQUEUED,
    OPERATION_WITH_CALLBACK_ENQUEUED,
    OPTED_OUT_OF_MASS_MAIL,
    OP_WITH_INVALID_USER_TYPE_EXCEPTION,
    ORCHESTRATION_INVALID,
    ORDER_MANAGEMENT_ACTION_NOT_ALLOWED,
    ORDER_MANAGEMENT_INVALID_RECORD,
    ORDER_MANAGEMENT_RECORD_EXISTS,
    ORDER_MANAGEMENT_RECORD_NOT_FOUND,
    ORG_SETTING_REQUIRED,
    PACKAGE_DISABLED,
    PACKAGE_LICENSE_REQUIRED,
    PACKAGING_API_INSTALL_FAILED,
    PACKAGING_API_UNINSTALL_FAILED,
    PALI_INVALID_ACTION_ID,
    PALI_INVALID_ACTION_NAME,
    PALI_INVALID_ACTION_TYPE,
    PAL_INVALID_ASSISTANT_RECOMMENDATION_TYPE_ID,
    PAL_INVALID_ENTITY_ID,
    PAL_INVALID_FLEXIPAGE_ID,
    PAL_INVALID_LAYOUT_ID,
    PAL_INVALID_PARAMETERS,
    PARAMETER_TOO_LARGE,
    PARTICIPANT_RELATIONSHIP_EXISTS,
    PAYLOAD_SIZE_EXCEEDED,
    PA_API_EXCEPTION,
    PA_AXIS_FAULT,
    PA_INVALID_ID_EXCEPTION,
    PA_NO_ACCESS_EXCEPTION,
    PA_NO_DATA_FOUND_EXCEPTION,
    PA_URI_SYNTAX_EXCEPTION,
    PA_VISIBLE_ACTIONS_FILTER_ORDERING_EXCEPTION,
    PENDING_COMMIT,
    PICKLIST_INACTIVE_VALUES_EXCEEDED,
    PLATFORM_EVENT_ENCRYPTION_ERROR,
    PLATFORM_EVENT_PUBLISHING_UNAVAILABLE,
    PLATFORM_EVENT_PUBLISH_FAILED,
    PORTAL_NO_ACCESS,
    PORTAL_USER_ALREADY_EXISTS_FOR_CONTACT,
    PORTAL_USER_CREATION_RESTRICTED_WITH_ENCRYPTION,
    PRICE_NOT_FOUND,
    PRIVATE_CONTACT_ON_ASSET,
    PROCESSING_HALTED,
    PROGRAM_PROGRESS_NOT_ACTIVE,
    PROMOTION_NOT_FOUND,
    QA_INVALID_CREATE_FEED_ITEM,
    QA_INVALID_SUCCESS_MESSAGE,
    QUERY_REFINEMENT_VALUE_LIMIT_EXCEEDED,
    QUERY_TIMEOUT,
    QUERY_TOKEN_COUNT_LIMIT_EXCEEDED,
    QUICK_ACTION_LIST_ITEM_NOT_ALLOWED,
    QUICK_ACTION_LIST_NOT_ALLOWED,
    RECORD_CREATION_FAILED,
    RECORD_IN_USE_BY_WORKFLOW,
    RECORD_MISSING_REQUIRED_FIELD,
    RECORD_TYPE_LIMIT_EXCEEDED,
    RECORD_UPDATE_FAILED,
    RECOVERABLE_SEARCH_PROVIDER_ERROR,
    REFRESH_FAILED,
    RELATED_ENTITY_FILTER_VALIDATION_EXCEPTION,
    REL_FIELD_BAD_ACCESSIBILITY,
    REPUTATION_MINIMUM_NUMBER_NOT_REACHED,
    REQUEST_RUNNING_TOO_LONG,
    REQUIRED_FEATURE_MISSING,
    REQUIRED_FIELD_MISSING,
    REQUIRE_CONNECTED_APP_SCS,
    REQUIRE_CONNECTED_APP_SESSION_SCS,
    REQUIRE_RUNAS_USER,
    RESOURCE_NOT_AVAILABLE,
    RETRIEVE_EXCHANGE_ATTACHMENT_FAILED,
    RETRIEVE_EXCHANGE_EMAIL_FAILED,
    RETRIEVE_EXCHANGE_EVENT_FAILED,
    RETRIEVE_GOOGLE_EMAIL_FAILED,
    RETRIEVE_GOOGLE_EVENT_FAILED,
    RETRIEVE_USER_CONFIG_ERROR,
    ROUTES_EVALUATION_LIMIT_EXCEEDED,
    SALESFORCE_INBOX_TRANSPORT_CONNECTION_ERROR,
    SALESFORCE_INBOX_TRANSPORT_INVALID_INPUT_ERROR,
    SALESFORCE_INBOX_TRANSPORT_TOKEN_ERROR,
    SALESFORCE_INBOX_TRANSPORT_UNKNOWN_ERROR,
    SCHEMA_OBJECT_NOT_FOUND,
    SCREEN_POP_REQUIRED_INPUT_MISSING,
    SEARCH_INCLUDE_RULES_MAX_RULE_DEFINITION_LIMIT_EXCEEDED,
    SEARCH_INCLUDE_RULES_MIN_RULE_DEFINITION_NOT_MET,
    SEARCH_PROVIDER_PATH_LIMIT_EXCEEDED,
    SEARCH_PROVIDER_REQUEST_RATE_EXCEEDED,
    SEGMENT_COUNT_LIMIT_EXCEEDED,
    SELF_REFERENCE_FROM_FLOW,
    SELF_REFERENCE_FROM_TRIGGER,
    SERVICE_UNAVAILABLE,
    SESSION_EXPIRED,
    SESSION_INVALIDATED,
    SHARE_NEEDED_FOR_CHILD_OWNER,
    SINGLE_EMAIL_LIMIT_EXCEEDED,
    SLACK_API_ERROR,
    SOCIAL_ACCOUNT_NOT_FOUND,
    SOCIAL_ACTION_INVALID,
    SOCIAL_PERSONA_NOT_FOUND,
    SOCIAL_POST_INVALID,
    SOCIAL_POST_NOT_FOUND,
    SPECIFICATION_GENERATION_EXCEPTION,
    STANDARD_PRICE_NOT_DEFINED,
    STORAGE_LIMIT_EXCEEDED,
    STRING_TOO_LONG,
    SUBDOMAIN_IN_USE,
    TABSET_LIMIT_EXCEEDED,
    TEMPLATE_NOT_ACTIVE,
    TEMPLATE_NOT_FOUND,
    TERMS_OF_SERVICE_UNREAD,
    TERRITORY_REALIGN_IN_PROGRESS,
    TEXT_DATA_OUTSIDE_SUPPORTED_CHARSET,
    TEXT_TO_PICKLIST_VALUES_EXCEEDED,
    TOO_MANY_APEX_REQUESTS,
    TOO_MANY_ENUM_VALUE,
    TOO_MANY_JOBS,
    TOO_MANY_POSSIBLE_USERS_EXIST,
    TRANSFER_REQUIRES_READ,
    TXN_SECURITY_NO_ACCESS,
    UISF_ENTITY_QUERY_FAILED,
    UISF_NO_MAPPINGS_FOUND,
    UISF_TOKEN_NOT_FOUND,
    UISF_UNKNOWN_EXCEPTION,
    UISF_USER_MAPPING_FAILED,
    UNABLE_TO_LOCK_ROW,
    UNAUTHORIZED_SEARCH_PROVIDER_REQUEST,
    UNAVAILABLE_RECORDTYPE_EXCEPTION,
    UNAVAILABLE_REF,
    UNDEFINED_MAPPING_DEFINITION,
    UNDELETE_FAILED,
    UNKNOWN_EXCEPTION,
    UNKNOWN_TOKEN_ERROR,
    UNPROCESSABLE_REQUEST,
    UNQUALIFIED_CART,
    UNRESOLVABLE_PAY_NOW_WEBSTORE,
    UNSAFE_HTML_CONTENT,
    UNSPECIFIED_EMAIL_ADDRESS,
    UNSUPPORTED_APEX_TRIGGER_OPERATON,
    UNSUPPORTED_MODE,
    UNSUPPORTED_PAYMENT_GATEWAY_TYPE,
    UNSUPPORTED_PAYMENT_REQUEST_TYPE,
    UNSUPPORTED_SITE,
    UNSUPPORTED_SITE_FILE_IMPORTED_EXCEPTION,
    UNSUPPORTED_SOCIAL_PROVIDER,
    UNVERIFIED_SENDER_ADDRESS,
    UPDATE_GOOGLE_EMAIL_LABEL_FAILED,
    USER_OWNS_PORTAL_ACCOUNT_EXCEPTION,
    USER_WITHOUT_WEM_PERMISSION,
    USER_WITH_APEX_SHARES_EXCEPTION,
    VARIANT_NOT_FOUND,
    VF_COMPILE_ERROR,
    VOICE_CAPACITY_ERROR,
    WEBLINK_SIZE_LIMIT_EXCEEDED,
    WEBLINK_URL_INVALID,
    WEM_SEGMENTS_CAN_NOT_HAVE_NON_ACTIVE_SEGMENT_TYPE,
    WEM_SHIFT_SEGMENT_TIME_IS_OUTSIDE_OF_THE_SHIFT_DURATION,
    WEM_USER_NOT_ORG_ADMIN,
    WORKSPACE_NOT_FOUND,
    WRONG_CONTROLLER_TYPE,
    XCLEAN_DJ_MATCH_IGNORABLE_ERROR,
    XCLEAN_DJ_MATCH_INTERNAL_DJ_ERROR,
    XCLEAN_DJ_MATCH_NON_RETRIABLE_ERROR,
    XCLEAN_DJ_MATCH_RETRIABLE_ERROR,
    XCLEAN_DJ_MATCH_UNKNOWN_ERROR,
    XCLEAN_UNEXPECTED_ERROR
}
