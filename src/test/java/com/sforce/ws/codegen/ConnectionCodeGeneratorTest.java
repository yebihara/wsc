package com.sforce.ws.codegen;

import java.util.ArrayList;
import java.util.List;

import org.stringtemplate.v4.*;

import junit.framework.TestCase;

import com.sforce.ws.codegen.metadata.*;
import com.sforce.ws.codegen.metadata.HeaderMetadata.HeaderElementMetadata;
import com.sforce.ws.tools.wsdlc;

public class ConnectionCodeGeneratorTest extends TestCase {

    public void testGenerateConnectionSource() throws Exception {
        final String expectedSource = CodeGeneratorTestUtil.fileToString("PartnerConnection.java");

        List<HeaderMetadata> headers = new ArrayList<HeaderMetadata>();

        List<HeaderElementMetadata> headerElements = null;

        HeaderMetadata header = null;

        headerElements = new ArrayList<HeaderElementMetadata>();
        headerElements.add(HeaderElementMetadata.newInstance("setLanguage", "language"));
        header = HeaderMetadata.newInstance("com.sforce.soap.partner.wsc130.LocaleOptions_element", "LocaleOptions",
                "java.lang.String language", "LocaleOptions_qname", headerElements);
        headers.add(header);

        headerElements = new ArrayList<HeaderElementMetadata>();
        headerElements
                .add(HeaderElementMetadata.newInstance("setTriggerAutoResponseEmail", "triggerAutoResponseEmail"));
        headerElements.add(HeaderElementMetadata.newInstance("setTriggerOtherEmail", "triggerOtherEmail"));
        headerElements.add(HeaderElementMetadata.newInstance("setTriggerUserEmail", "triggerUserEmail"));
        header = HeaderMetadata.newInstance("com.sforce.soap.partner.wsc130.EmailHeader_element", "EmailHeader",
                "boolean triggerAutoResponseEmail,boolean triggerOtherEmail,boolean triggerUserEmail",
                "EmailHeader_qname", headerElements);
        headers.add(header);

        headerElements = new ArrayList<HeaderElementMetadata>();
        headerElements.add(HeaderElementMetadata.newInstance("setDebugLog", "debugLog"));
        header = HeaderMetadata.newInstance("com.sforce.soap.partner.wsc130.DebuggingInfo_element", "DebuggingInfo",
                "java.lang.String debugLog", "DebuggingInfo_qname", headerElements);
        headers.add(header);

        headerElements = new ArrayList<HeaderElementMetadata>();
        headerElements.add(HeaderElementMetadata.newInstance("setUpdateMru", "updateMru"));
        header = HeaderMetadata.newInstance("com.sforce.soap.partner.wsc130.MruHeader_element", "MruHeader",
                "boolean updateMru", "MruHeader_qname", headerElements);
        headers.add(header);

        headerElements = new ArrayList<HeaderElementMetadata>();
        headerElements.add(HeaderElementMetadata.newInstance("setClient", "client"));
        headerElements.add(HeaderElementMetadata.newInstance("setDefaultNamespace", "defaultNamespace"));
        header = HeaderMetadata.newInstance("com.sforce.soap.partner.wsc130.CallOptions_element", "CallOptions",
                "java.lang.String client,java.lang.String defaultNamespace", "CallOptions_qname", headerElements);
        headers.add(header);

        headerElements = new ArrayList<HeaderElementMetadata>();
        headerElements.add(HeaderElementMetadata.newInstance("setSessionId", "sessionId"));
        header = HeaderMetadata.newInstance("com.sforce.soap.partner.wsc130.SessionHeader_element", "SessionHeader",
                "java.lang.String sessionId", "SessionHeader_qname", headerElements);
        headers.add(header);

        headerElements = new ArrayList<HeaderElementMetadata>();
        headerElements.add(HeaderElementMetadata.newInstance("setDebugLevel", "debugLevel"));
        header = HeaderMetadata.newInstance("com.sforce.soap.partner.wsc130.DebuggingHeader_element",
                "DebuggingHeader", "com.sforce.soap.partner.wsc130.DebugLevel debugLevel", "DebuggingHeader_qname",
                headerElements);
        headers.add(header);

        headerElements = new ArrayList<HeaderElementMetadata>();
        headerElements.add(HeaderElementMetadata.newInstance("setOrganizationId", "organizationId"));
        headerElements.add(HeaderElementMetadata.newInstance("setPortalId", "portalId"));
        header = HeaderMetadata.newInstance("com.sforce.soap.partner.wsc130.LoginScopeHeader_element",
                "LoginScopeHeader", "java.lang.String organizationId,java.lang.String portalId",
                "LoginScopeHeader_qname", headerElements);
        headers.add(header);

        headerElements = new ArrayList<HeaderElementMetadata>();
        headerElements.add(HeaderElementMetadata.newInstance("setTransferToUserId", "transferToUserId"));
        header = HeaderMetadata.newInstance("com.sforce.soap.partner.wsc130.UserTerritoryDeleteHeader_element",
                "UserTerritoryDeleteHeader", "java.lang.String transferToUserId", "UserTerritoryDeleteHeader_qname",
                headerElements);
        headers.add(header);

        headerElements = new ArrayList<HeaderElementMetadata>();
        headerElements.add(HeaderElementMetadata.newInstance("setBatchSize", "batchSize"));
        header = HeaderMetadata.newInstance("com.sforce.soap.partner.wsc130.QueryOptions_element", "QueryOptions",
                "int batchSize", "QueryOptions_qname", headerElements);
        headers.add(header);

        headerElements = new ArrayList<HeaderElementMetadata>();
        headerElements.add(HeaderElementMetadata.newInstance("setAssignmentRuleId", "assignmentRuleId"));
        headerElements.add(HeaderElementMetadata.newInstance("setUseDefaultRule", "useDefaultRule"));
        header = HeaderMetadata.newInstance("com.sforce.soap.partner.wsc130.AssignmentRuleHeader_element",
                "AssignmentRuleHeader", "java.lang.String assignmentRuleId,java.lang.Boolean useDefaultRule",
                "AssignmentRuleHeader_qname", headerElements);
        headers.add(header);

        List<OperationMetadata> operations = new ArrayList<OperationMetadata>();
        List<ElementMetadata> elements = new ArrayList<ElementMetadata>();
        elements.add(ElementMetadata.newInstance("setFieldList", "fieldList"));
        elements.add(ElementMetadata.newInstance("setSObjectType", "sObjectType"));
        elements.add(ElementMetadata.newInstance("setIds", "ids"));
        List<HeaderMetadata> operationHeaders = new ArrayList<HeaderMetadata>();
        operationHeaders.add(HeaderMetadata.newInstance("", "SessionHeader", "", "SessionHeader_qname", null));
        operationHeaders.add(HeaderMetadata.newInstance("", "CallOptions", "", "CallOptions_qname", null));
        operationHeaders.add(HeaderMetadata.newInstance("", "QueryOptions", "", "QueryOptions_qname", null));
        operationHeaders.add(HeaderMetadata.newInstance("", "MruHeader", "", "MruHeader_qname", null));
        operations.add(OperationMetadata.newInstance("com.sforce.soap.partner.sobject.wsc130.SObject[]", "retrieve",
                "com.sforce.soap.partner.wsc130.Retrieve_element",
                "com.sforce.soap.partner.wsc130.RetrieveResponse_element",
                "java.lang.String fieldList,java.lang.String sObjectType,java.lang.String[] ids", "\"\"",
                "retrieve_qname", "retrieveResponse_qname", "return __response.getResult();", elements,
                operationHeaders));

        final String qNames = "    private static final javax.xml.namespace.QName convertLead_qname = new javax.xml.namespace.QName(\"urn:partner.soap.sforce.com\", \"convertLead\");\n"
                + "    private static final javax.xml.namespace.QName convertLeadResponse_qname = new javax.xml.namespace.QName(\"urn:partner.soap.sforce.com\", \"convertLeadResponse\");\n"
                + "    private static final javax.xml.namespace.QName sendEmail_qname = new javax.xml.namespace.QName(\"urn:partner.soap.sforce.com\", \"sendEmail\");\n";

        final String knownHeaders = "  knownHeaders.put(LocaleOptions_qname,com.sforce.soap.partner.wsc130.LocaleOptions_element.class);\n"
                + "  knownHeaders.put(EmailHeader_qname,com.sforce.soap.partner.wsc130.EmailHeader_element.class);\n";

        final ConnectionClassMetadata connectionClassMetadata = ConnectionClassMetadata.newInstance("\"wsc130\"",
                "com.sforce.soap.partner.wsc130", "PartnerConnection", true,
                "com.sforce.soap.partner.wsc130.LoginResult", "verifyPartnerEndpoint", true,
                "\"urn:sobject.partner.soap.sforce.com\"", qNames, knownHeaders, headers, operations);
        STGroupDir templates = new STGroupDir(wsdlc.TEMPLATE_DIR, '$', '$');
        ST template = templates.getInstanceOf(wsdlc.CONNECTION);
        assertNotNull(template);
        template.add("gen", connectionClassMetadata);
        assertEquals(expectedSource, template.render());
    }
}