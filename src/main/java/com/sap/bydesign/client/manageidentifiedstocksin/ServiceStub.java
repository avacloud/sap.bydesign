/**
 * ServiceStub.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package com.sap.bydesign.client.manageidentifiedstocksin;

/*
 *  ServiceStub java implementation
 */

public class ServiceStub extends org.apache.axis2.client.Stub {
  protected org.apache.axis2.description.AxisOperation[] _operations;

  // hashmaps to keep the fault mapping
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String>
      faultExceptionNameMap =
          new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String>
      faultExceptionClassNameMap =
          new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String> faultMessageMap =
      new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();

  private static int counter = 0;

  private static synchronized java.lang.String getUniqueSuffix() {
    // reset the counter if it is greater than 99999
    if (counter > 99999) {
      counter = 0;
    }
    counter = counter + 1;
    return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
  }

  private void populateAxisService() throws org.apache.axis2.AxisFault {

    // creating the Service with a unique name
    _service = new org.apache.axis2.description.AxisService("Service" + getUniqueSuffix());
    addAnonymousOperations();

    // creating the operations
    org.apache.axis2.description.AxisOperation __operation;

    _operations = new org.apache.axis2.description.AxisOperation[2];

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://sap.com/xi/A1S/Global", "checkMaintainBundle"));
    _service.addOperation(__operation);

    (__operation)
        .getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
        .getPolicySubject()
        .attachPolicy(
            getPolicy(
                "<wsp:Policy wsu:Id=\"aaf710228ab2e86c54758e06ccb7bd39291a8c48b87b2137\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><saptrnbnd:OptimizedXMLTransfer wsp:Optional=\"true\" uri=\"http://xml.sap.com/2006/11/esi/esp/binxml\" xmlns:saptrnbnd=\"http://www.sap.com/webas/710/soap/features/transportbinding/\"></saptrnbnd:OptimizedXMLTransfer><saptrnbnd:OptimizedMimeSerialization wsp:Optional=\"true\" xmlns:saptrnbnd=\"http://schemas.xmlsoap.org/ws/2004/09/policy/optimizedmimeserialization\"></saptrnbnd:OptimizedMimeSerialization><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpBasicAuthentication/></wsp:Policy></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic128Rsa15/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><wsaw:UsingAddressing wsp:Optional=\"true\" xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All><wsp:All><saptrnbnd:OptimizedXMLTransfer wsp:Optional=\"true\" uri=\"http://xml.sap.com/2006/11/esi/esp/binxml\" xmlns:saptrnbnd=\"http://www.sap.com/webas/710/soap/features/transportbinding/\"></saptrnbnd:OptimizedXMLTransfer><saptrnbnd:OptimizedMimeSerialization wsp:Optional=\"true\" xmlns:saptrnbnd=\"http://schemas.xmlsoap.org/ws/2004/09/policy/optimizedmimeserialization\"></saptrnbnd:OptimizedMimeSerialization><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireClientCertificate/></wsp:Policy></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic128Rsa15/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><wsaw:UsingAddressing wsp:Optional=\"true\" xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All><wsp:All><saptrnbnd:OptimizedXMLTransfer wsp:Optional=\"true\" uri=\"http://xml.sap.com/2006/11/esi/esp/binxml\" xmlns:saptrnbnd=\"http://www.sap.com/webas/710/soap/features/transportbinding/\"></saptrnbnd:OptimizedXMLTransfer><saptrnbnd:OptimizedMimeSerialization wsp:Optional=\"true\" xmlns:saptrnbnd=\"http://schemas.xmlsoap.org/ws/2004/09/policy/optimizedmimeserialization\"></saptrnbnd:OptimizedMimeSerialization><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sapsp:HTTPSSO2 xmlns:sapsp=\"http://www.sap.com/webas/630/soap/features/security/policy\"></sapsp:HTTPSSO2></wsp:Policy></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic128Rsa15/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><wsaw:UsingAddressing wsp:Optional=\"true\" xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

    (__operation)
        .getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
        .getPolicySubject()
        .attachPolicy(
            getPolicy(
                "<wsp:Policy wsu:Id=\"aaf710228ab2e86c54758e06ccb7bd39291a8c48b87b2137\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><saptrnbnd:OptimizedXMLTransfer wsp:Optional=\"true\" uri=\"http://xml.sap.com/2006/11/esi/esp/binxml\" xmlns:saptrnbnd=\"http://www.sap.com/webas/710/soap/features/transportbinding/\"></saptrnbnd:OptimizedXMLTransfer><saptrnbnd:OptimizedMimeSerialization wsp:Optional=\"true\" xmlns:saptrnbnd=\"http://schemas.xmlsoap.org/ws/2004/09/policy/optimizedmimeserialization\"></saptrnbnd:OptimizedMimeSerialization><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpBasicAuthentication/></wsp:Policy></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic128Rsa15/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><wsaw:UsingAddressing wsp:Optional=\"true\" xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All><wsp:All><saptrnbnd:OptimizedXMLTransfer wsp:Optional=\"true\" uri=\"http://xml.sap.com/2006/11/esi/esp/binxml\" xmlns:saptrnbnd=\"http://www.sap.com/webas/710/soap/features/transportbinding/\"></saptrnbnd:OptimizedXMLTransfer><saptrnbnd:OptimizedMimeSerialization wsp:Optional=\"true\" xmlns:saptrnbnd=\"http://schemas.xmlsoap.org/ws/2004/09/policy/optimizedmimeserialization\"></saptrnbnd:OptimizedMimeSerialization><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireClientCertificate/></wsp:Policy></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic128Rsa15/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><wsaw:UsingAddressing wsp:Optional=\"true\" xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All><wsp:All><saptrnbnd:OptimizedXMLTransfer wsp:Optional=\"true\" uri=\"http://xml.sap.com/2006/11/esi/esp/binxml\" xmlns:saptrnbnd=\"http://www.sap.com/webas/710/soap/features/transportbinding/\"></saptrnbnd:OptimizedXMLTransfer><saptrnbnd:OptimizedMimeSerialization wsp:Optional=\"true\" xmlns:saptrnbnd=\"http://schemas.xmlsoap.org/ws/2004/09/policy/optimizedmimeserialization\"></saptrnbnd:OptimizedMimeSerialization><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sapsp:HTTPSSO2 xmlns:sapsp=\"http://www.sap.com/webas/630/soap/features/security/policy\"></sapsp:HTTPSSO2></wsp:Policy></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic128Rsa15/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><wsaw:UsingAddressing wsp:Optional=\"true\" xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

    _operations[0] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://sap.com/xi/A1S/Global", "maintainBundle"));
    _service.addOperation(__operation);

    (__operation)
        .getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
        .getPolicySubject()
        .attachPolicy(
            getPolicy(
                "<wsp:Policy wsu:Id=\"aaf710228ab2e86c54758e06ccb7bd39291a8c48b87b2137\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><saptrnbnd:OptimizedXMLTransfer wsp:Optional=\"true\" uri=\"http://xml.sap.com/2006/11/esi/esp/binxml\" xmlns:saptrnbnd=\"http://www.sap.com/webas/710/soap/features/transportbinding/\"></saptrnbnd:OptimizedXMLTransfer><saptrnbnd:OptimizedMimeSerialization wsp:Optional=\"true\" xmlns:saptrnbnd=\"http://schemas.xmlsoap.org/ws/2004/09/policy/optimizedmimeserialization\"></saptrnbnd:OptimizedMimeSerialization><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpBasicAuthentication/></wsp:Policy></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic128Rsa15/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><wsaw:UsingAddressing wsp:Optional=\"true\" xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All><wsp:All><saptrnbnd:OptimizedXMLTransfer wsp:Optional=\"true\" uri=\"http://xml.sap.com/2006/11/esi/esp/binxml\" xmlns:saptrnbnd=\"http://www.sap.com/webas/710/soap/features/transportbinding/\"></saptrnbnd:OptimizedXMLTransfer><saptrnbnd:OptimizedMimeSerialization wsp:Optional=\"true\" xmlns:saptrnbnd=\"http://schemas.xmlsoap.org/ws/2004/09/policy/optimizedmimeserialization\"></saptrnbnd:OptimizedMimeSerialization><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireClientCertificate/></wsp:Policy></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic128Rsa15/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><wsaw:UsingAddressing wsp:Optional=\"true\" xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All><wsp:All><saptrnbnd:OptimizedXMLTransfer wsp:Optional=\"true\" uri=\"http://xml.sap.com/2006/11/esi/esp/binxml\" xmlns:saptrnbnd=\"http://www.sap.com/webas/710/soap/features/transportbinding/\"></saptrnbnd:OptimizedXMLTransfer><saptrnbnd:OptimizedMimeSerialization wsp:Optional=\"true\" xmlns:saptrnbnd=\"http://schemas.xmlsoap.org/ws/2004/09/policy/optimizedmimeserialization\"></saptrnbnd:OptimizedMimeSerialization><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sapsp:HTTPSSO2 xmlns:sapsp=\"http://www.sap.com/webas/630/soap/features/security/policy\"></sapsp:HTTPSSO2></wsp:Policy></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic128Rsa15/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><wsaw:UsingAddressing wsp:Optional=\"true\" xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

    (__operation)
        .getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
        .getPolicySubject()
        .attachPolicy(
            getPolicy(
                "<wsp:Policy wsu:Id=\"aaf710228ab2e86c54758e06ccb7bd39291a8c48b87b2137\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><saptrnbnd:OptimizedXMLTransfer wsp:Optional=\"true\" uri=\"http://xml.sap.com/2006/11/esi/esp/binxml\" xmlns:saptrnbnd=\"http://www.sap.com/webas/710/soap/features/transportbinding/\"></saptrnbnd:OptimizedXMLTransfer><saptrnbnd:OptimizedMimeSerialization wsp:Optional=\"true\" xmlns:saptrnbnd=\"http://schemas.xmlsoap.org/ws/2004/09/policy/optimizedmimeserialization\"></saptrnbnd:OptimizedMimeSerialization><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpBasicAuthentication/></wsp:Policy></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic128Rsa15/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><wsaw:UsingAddressing wsp:Optional=\"true\" xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All><wsp:All><saptrnbnd:OptimizedXMLTransfer wsp:Optional=\"true\" uri=\"http://xml.sap.com/2006/11/esi/esp/binxml\" xmlns:saptrnbnd=\"http://www.sap.com/webas/710/soap/features/transportbinding/\"></saptrnbnd:OptimizedXMLTransfer><saptrnbnd:OptimizedMimeSerialization wsp:Optional=\"true\" xmlns:saptrnbnd=\"http://schemas.xmlsoap.org/ws/2004/09/policy/optimizedmimeserialization\"></saptrnbnd:OptimizedMimeSerialization><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireClientCertificate/></wsp:Policy></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic128Rsa15/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><wsaw:UsingAddressing wsp:Optional=\"true\" xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All><wsp:All><saptrnbnd:OptimizedXMLTransfer wsp:Optional=\"true\" uri=\"http://xml.sap.com/2006/11/esi/esp/binxml\" xmlns:saptrnbnd=\"http://www.sap.com/webas/710/soap/features/transportbinding/\"></saptrnbnd:OptimizedXMLTransfer><saptrnbnd:OptimizedMimeSerialization wsp:Optional=\"true\" xmlns:saptrnbnd=\"http://schemas.xmlsoap.org/ws/2004/09/policy/optimizedmimeserialization\"></saptrnbnd:OptimizedMimeSerialization><sp:TransportBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sapsp:HTTPSSO2 xmlns:sapsp=\"http://www.sap.com/webas/630/soap/features/security/policy\"></sapsp:HTTPSSO2></wsp:Policy></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic128Rsa15/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding><wsaw:UsingAddressing wsp:Optional=\"true\" xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

    _operations[1] = __operation;
  }

  // populates the faults
  private void populateFaults() {

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://sap.com/xi/AP/Common/Global", "StandardFaultMessage"),
            "CheckMaintainBundle"),
        "com.sap.bydesign.client.manageidentifiedstocksin.StandardFaultMessage");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://sap.com/xi/AP/Common/Global", "StandardFaultMessage"),
            "CheckMaintainBundle"),
        "com.sap.bydesign.client.manageidentifiedstocksin.StandardFaultMessage");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://sap.com/xi/AP/Common/Global", "StandardFaultMessage"),
            "CheckMaintainBundle"),
        "com.sap.xi.ap.common.global.StandardFaultMessageDocument");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://sap.com/xi/AP/Common/Global", "StandardFaultMessage"),
            "MaintainBundle"),
        "com.sap.bydesign.client.manageidentifiedstocksin.StandardFaultMessage");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://sap.com/xi/AP/Common/Global", "StandardFaultMessage"),
            "MaintainBundle"),
        "com.sap.bydesign.client.manageidentifiedstocksin.StandardFaultMessage");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://sap.com/xi/AP/Common/Global", "StandardFaultMessage"),
            "MaintainBundle"),
        "com.sap.xi.ap.common.global.StandardFaultMessageDocument");
  }

  /** Constructor that takes in a configContext */
  public ServiceStub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      java.lang.String targetEndpoint)
      throws org.apache.axis2.AxisFault {
    this(configurationContext, targetEndpoint, false);
  }

  /** Constructor that takes in a configContext and useseperate listner */
  public ServiceStub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      java.lang.String targetEndpoint,
      boolean useSeparateListener)
      throws org.apache.axis2.AxisFault {
    // To populate AxisService
    populateAxisService();
    populateFaults();

    _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

    _service.applyPolicy();

    _serviceClient
        .getOptions()
        .setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
    _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

    // Set the soap version
    _serviceClient
        .getOptions()
        .setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
  }

  /** Default Constructor */
  public ServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext)
      throws org.apache.axis2.AxisFault {

    this(
        configurationContext,
        "https://my602026.sapbyd.cn/sap/bc/srt/scs/sap/manageidentifiedstocksin?sap-vhost=my602026.sapbyd.cn");
  }

  /** Default Constructor */
  public ServiceStub() throws org.apache.axis2.AxisFault {

    this(
        "https://my602026.sapbyd.cn/sap/bc/srt/scs/sap/manageidentifiedstocksin?sap-vhost=my602026.sapbyd.cn");
  }

  /** Constructor taking the target endpoint */
  public ServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
    this(null, targetEndpoint);
  }

  /**
   * Auto generated method signature
   *
   * @see com.sap.bydesign.client.manageidentifiedstocksin.Service#checkMaintainBundle
   * @param identifiedStockMaintainCheckRequestMessage0
   * @throws com.sap.bydesign.client.manageidentifiedstocksin.StandardFaultMessage :
   */
  public com.sap.xi.sapglobal20.global.IdentifiedStockMaintainCheckResponseMessageDocument
      checkMaintainBundle(
          com.sap.xi.sapglobal20.global.IdentifiedStockMaintainCheckRequestMessageDocument
              identifiedStockMaintainCheckRequestMessage0)
          throws java.rmi.RemoteException,
              com.sap.bydesign.client.manageidentifiedstocksin.StandardFaultMessage {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[0].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://sap.com/xi/A1S/Global/ManageIdentifiedStocksIn/CheckMaintainBundleRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              identifiedStockMaintainCheckRequestMessage0,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://sap.com/xi/A1S/Global", "checkMaintainBundle")),
              new javax.xml.namespace.QName(
                  "http://sap.com/xi/SAPGlobal20/Global",
                  "IdentifiedStockMaintainCheckRequestMessage"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              com.sap.xi.sapglobal20.global.IdentifiedStockMaintainCheckResponseMessageDocument
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (com.sap.xi.sapglobal20.global.IdentifiedStockMaintainCheckResponseMessageDocument)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CheckMaintainBundle"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CheckMaintainBundle"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CheckMaintainBundle"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof com.sap.bydesign.client.manageidentifiedstocksin.StandardFaultMessage) {
              throw (com.sap.bydesign.client.manageidentifiedstocksin.StandardFaultMessage) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations
   *
   * @see com.sap.bydesign.client.manageidentifiedstocksin.Service#startcheckMaintainBundle
   * @param identifiedStockMaintainCheckRequestMessage0
   */
  public void startcheckMaintainBundle(
      com.sap.xi.sapglobal20.global.IdentifiedStockMaintainCheckRequestMessageDocument
          identifiedStockMaintainCheckRequestMessage0,
      final com.sap.bydesign.client.manageidentifiedstocksin.ServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[0].getName());
    _operationClient
        .getOptions()
        .setAction(
            "http://sap.com/xi/A1S/Global/ManageIdentifiedStocksIn/CheckMaintainBundleRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            identifiedStockMaintainCheckRequestMessage0,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://sap.com/xi/A1S/Global", "checkMaintainBundle")),
            new javax.xml.namespace.QName(
                "http://sap.com/xi/SAPGlobal20/Global",
                "IdentifiedStockMaintainCheckRequestMessage"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      com.sap.xi.sapglobal20.global
                          .IdentifiedStockMaintainCheckResponseMessageDocument.class);
              callback.receiveResultcheckMaintainBundle(
                  (com.sap.xi.sapglobal20.global
                          .IdentifiedStockMaintainCheckResponseMessageDocument)
                      object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorcheckMaintainBundle(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CheckMaintainBundle"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CheckMaintainBundle"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CheckMaintainBundle"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    if (ex
                        instanceof
                        com.sap.bydesign.client.manageidentifiedstocksin.StandardFaultMessage) {
                      callback.receiveErrorcheckMaintainBundle(
                          (com.sap.bydesign.client.manageidentifiedstocksin.StandardFaultMessage)
                              ex);
                      return;
                    }

                    callback.receiveErrorcheckMaintainBundle(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcheckMaintainBundle(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcheckMaintainBundle(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcheckMaintainBundle(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcheckMaintainBundle(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcheckMaintainBundle(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcheckMaintainBundle(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorcheckMaintainBundle(f);
                  }
                } else {
                  callback.receiveErrorcheckMaintainBundle(f);
                }
              } else {
                callback.receiveErrorcheckMaintainBundle(f);
              }
            } else {
              callback.receiveErrorcheckMaintainBundle(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorcheckMaintainBundle(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[0].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[0].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature
   *
   * @see com.sap.bydesign.client.manageidentifiedstocksin.Service#maintainBundle
   * @param identifiedStockMaintainRequestMessage2
   * @throws com.sap.bydesign.client.manageidentifiedstocksin.StandardFaultMessage :
   */
  public com.sap.xi.sapglobal20.global.IdentifiedStockMaintainResponseMessageDocument
      maintainBundle(
          com.sap.xi.sapglobal20.global.IdentifiedStockMaintainRequestMessageDocument
              identifiedStockMaintainRequestMessage2)
          throws java.rmi.RemoteException,
              com.sap.bydesign.client.manageidentifiedstocksin.StandardFaultMessage {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[1].getName());
      _operationClient
          .getOptions()
          .setAction("http://sap.com/xi/A1S/Global/ManageIdentifiedStocksIn/MaintainBundleRequest");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              identifiedStockMaintainRequestMessage2,
              optimizeContent(
                  new javax.xml.namespace.QName("http://sap.com/xi/A1S/Global", "maintainBundle")),
              new javax.xml.namespace.QName(
                  "http://sap.com/xi/SAPGlobal20/Global", "IdentifiedStockMaintainRequestMessage"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              com.sap.xi.sapglobal20.global.IdentifiedStockMaintainResponseMessageDocument.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (com.sap.xi.sapglobal20.global.IdentifiedStockMaintainResponseMessageDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "MaintainBundle"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "MaintainBundle"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "MaintainBundle"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof com.sap.bydesign.client.manageidentifiedstocksin.StandardFaultMessage) {
              throw (com.sap.bydesign.client.manageidentifiedstocksin.StandardFaultMessage) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations
   *
   * @see com.sap.bydesign.client.manageidentifiedstocksin.Service#startmaintainBundle
   * @param identifiedStockMaintainRequestMessage2
   */
  public void startmaintainBundle(
      com.sap.xi.sapglobal20.global.IdentifiedStockMaintainRequestMessageDocument
          identifiedStockMaintainRequestMessage2,
      final com.sap.bydesign.client.manageidentifiedstocksin.ServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[1].getName());
    _operationClient
        .getOptions()
        .setAction("http://sap.com/xi/A1S/Global/ManageIdentifiedStocksIn/MaintainBundleRequest");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            identifiedStockMaintainRequestMessage2,
            optimizeContent(
                new javax.xml.namespace.QName("http://sap.com/xi/A1S/Global", "maintainBundle")),
            new javax.xml.namespace.QName(
                "http://sap.com/xi/SAPGlobal20/Global", "IdentifiedStockMaintainRequestMessage"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      com.sap.xi.sapglobal20.global.IdentifiedStockMaintainResponseMessageDocument
                          .class);
              callback.receiveResultmaintainBundle(
                  (com.sap.xi.sapglobal20.global.IdentifiedStockMaintainResponseMessageDocument)
                      object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrormaintainBundle(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "MaintainBundle"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "MaintainBundle"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "MaintainBundle"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    if (ex
                        instanceof
                        com.sap.bydesign.client.manageidentifiedstocksin.StandardFaultMessage) {
                      callback.receiveErrormaintainBundle(
                          (com.sap.bydesign.client.manageidentifiedstocksin.StandardFaultMessage)
                              ex);
                      return;
                    }

                    callback.receiveErrormaintainBundle(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrormaintainBundle(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrormaintainBundle(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrormaintainBundle(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrormaintainBundle(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrormaintainBundle(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrormaintainBundle(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrormaintainBundle(f);
                  }
                } else {
                  callback.receiveErrormaintainBundle(f);
                }
              } else {
                callback.receiveErrormaintainBundle(f);
              }
            } else {
              callback.receiveErrormaintainBundle(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrormaintainBundle(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[1].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[1].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  ////////////////////////////////////////////////////////////////////////

  private static org.apache.neethi.Policy getPolicy(java.lang.String policyString) {
    return org.apache.neethi.PolicyEngine.getPolicy(
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                new java.io.StringReader(policyString))
            .getDocument()
            .getXMLStreamReader(false));
  }

  /////////////////////////////////////////////////////////////////////////

  private javax.xml.namespace.QName[] opNameArray = null;

  private boolean optimizeContent(javax.xml.namespace.QName opName) {

    if (opNameArray == null) {
      return false;
    }
    for (int i = 0; i < opNameArray.length; i++) {
      if (opName.equals(opNameArray[i])) {
        return true;
      }
    }
    return false;
  }
  // https://my602026.sapbyd.cn/sap/bc/srt/scs/sap/manageidentifiedstocksin?sap-vhost=my602026.sapbyd.cn

  private final org.apache.xmlbeans.XmlOptions _xmlOptions;

  {
    _xmlOptions = new org.apache.xmlbeans.XmlOptions();
    _xmlOptions.setSaveNoXmlDecl();
    _xmlOptions.setSaveAggressiveNamespaces();
    _xmlOptions.setSaveNamespacesFirst();
  }

  /**
   * Get the {@link org.apache.xmlbeans.XmlOptions} object that the stub uses when serializing
   * objects to XML.
   *
   * @return the options used for serialization
   */
  public org.apache.xmlbeans.XmlOptions _getXmlOptions() {
    return _xmlOptions;
  }

  private org.apache.axiom.om.OMElement toOM(
      com.sap.xi.sapglobal20.global.IdentifiedStockMaintainCheckRequestMessageDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final com.sap.xi.sapglobal20.global.IdentifiedStockMaintainCheckRequestMessageDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      com.sap.xi.sapglobal20.global.IdentifiedStockMaintainCheckResponseMessageDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final com.sap.xi.sapglobal20.global.IdentifiedStockMaintainCheckResponseMessageDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      com.sap.xi.ap.common.global.StandardFaultMessageDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final com.sap.xi.ap.common.global.StandardFaultMessageDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      com.sap.xi.sapglobal20.global.IdentifiedStockMaintainRequestMessageDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final com.sap.xi.sapglobal20.global.IdentifiedStockMaintainRequestMessageDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      com.sap.xi.sapglobal20.global.IdentifiedStockMaintainResponseMessageDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final com.sap.xi.sapglobal20.global.IdentifiedStockMaintainResponseMessageDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      com.sap.xi.sapglobal20.global.IdentifiedStockMaintainCheckRequestMessageDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      com.sap.xi.sapglobal20.global.IdentifiedStockMaintainRequestMessageDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  /** get the default envelope */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
    return factory.getDefaultEnvelope();
  }

  public org.apache.xmlbeans.XmlObject fromOM(
      org.apache.axiom.om.OMElement param, java.lang.Class type) throws org.apache.axis2.AxisFault {
    try {

      if (com.sap.xi.sapglobal20.global.IdentifiedStockMaintainCheckRequestMessageDocument.class
          .equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return com.sap.xi.sapglobal20.global.IdentifiedStockMaintainCheckRequestMessageDocument
            .Factory.parse(param.getXMLStreamReader(false, configuration));
      }

      if (com.sap.xi.sapglobal20.global.IdentifiedStockMaintainCheckResponseMessageDocument.class
          .equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return com.sap.xi.sapglobal20.global.IdentifiedStockMaintainCheckResponseMessageDocument
            .Factory.parse(param.getXMLStreamReader(false, configuration));
      }

      if (com.sap.xi.ap.common.global.StandardFaultMessageDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return com.sap.xi.ap.common.global.StandardFaultMessageDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (com.sap.xi.sapglobal20.global.IdentifiedStockMaintainRequestMessageDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return com.sap.xi.sapglobal20.global.IdentifiedStockMaintainRequestMessageDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (com.sap.xi.sapglobal20.global.IdentifiedStockMaintainResponseMessageDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return com.sap.xi.sapglobal20.global.IdentifiedStockMaintainResponseMessageDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (com.sap.xi.ap.common.global.StandardFaultMessageDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return com.sap.xi.ap.common.global.StandardFaultMessageDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
    return null;
  }
}
