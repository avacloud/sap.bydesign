/*
 * XML Type:  ProductionTaskManageResponseMDT
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionTaskManageResponseMDT
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ProductionTaskManageResponseMDT(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ProductionTaskManageResponseMDT extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductionTaskManageResponseMDT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3516FCF9D95E9E30AE8D4E360678AF8D").resolveHandle("productiontaskmanageresponsemdtd611type");
    
    /**
     * Gets the "ProductionTaskID" element
     */
    com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID getProductionTaskID();
    
    /**
     * True if has "ProductionTaskID" element
     */
    boolean isSetProductionTaskID();
    
    /**
     * Sets the "ProductionTaskID" element
     */
    void setProductionTaskID(com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID productionTaskID);
    
    /**
     * Appends and returns a new empty "ProductionTaskID" element
     */
    com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID addNewProductionTaskID();
    
    /**
     * Unsets the "ProductionTaskID" element
     */
    void unsetProductionTaskID();
    
    /**
     * Gets the "ProducionTaskUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getProducionTaskUUID();
    
    /**
     * True if has "ProducionTaskUUID" element
     */
    boolean isSetProducionTaskUUID();
    
    /**
     * Sets the "ProducionTaskUUID" element
     */
    void setProducionTaskUUID(com.sap.xi.ap.common.gdt.UUID producionTaskUUID);
    
    /**
     * Appends and returns a new empty "ProducionTaskUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewProducionTaskUUID();
    
    /**
     * Unsets the "ProducionTaskUUID" element
     */
    void unsetProducionTaskUUID();
    
    /**
     * Gets the "OperationTypeCode" element
     */
    com.sap.xi.ap.common.gdt.OperationTypeCode getOperationTypeCode();
    
    /**
     * True if has "OperationTypeCode" element
     */
    boolean isSetOperationTypeCode();
    
    /**
     * Sets the "OperationTypeCode" element
     */
    void setOperationTypeCode(com.sap.xi.ap.common.gdt.OperationTypeCode operationTypeCode);
    
    /**
     * Appends and returns a new empty "OperationTypeCode" element
     */
    com.sap.xi.ap.common.gdt.OperationTypeCode addNewOperationTypeCode();
    
    /**
     * Unsets the "OperationTypeCode" element
     */
    void unsetOperationTypeCode();
    
    /**
     * Gets the "OperationActivityTypeCode" element
     */
    com.sap.xi.ap.common.gdt.OperationActivityTypeCode getOperationActivityTypeCode();
    
    /**
     * True if has "OperationActivityTypeCode" element
     */
    boolean isSetOperationActivityTypeCode();
    
    /**
     * Sets the "OperationActivityTypeCode" element
     */
    void setOperationActivityTypeCode(com.sap.xi.ap.common.gdt.OperationActivityTypeCode operationActivityTypeCode);
    
    /**
     * Appends and returns a new empty "OperationActivityTypeCode" element
     */
    com.sap.xi.ap.common.gdt.OperationActivityTypeCode addNewOperationActivityTypeCode();
    
    /**
     * Unsets the "OperationActivityTypeCode" element
     */
    void unsetOperationActivityTypeCode();
    
    /**
     * Gets the "ResourceUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getResourceUUID();
    
    /**
     * True if has "ResourceUUID" element
     */
    boolean isSetResourceUUID();
    
    /**
     * Sets the "ResourceUUID" element
     */
    void setResourceUUID(com.sap.xi.ap.common.gdt.UUID resourceUUID);
    
    /**
     * Appends and returns a new empty "ResourceUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewResourceUUID();
    
    /**
     * Unsets the "ResourceUUID" element
     */
    void unsetResourceUUID();
    
    /**
     * Gets the "ProcessorEmployeeID" element
     */
    com.sap.xi.ap.common.gdt.EmployeeID getProcessorEmployeeID();
    
    /**
     * True if has "ProcessorEmployeeID" element
     */
    boolean isSetProcessorEmployeeID();
    
    /**
     * Sets the "ProcessorEmployeeID" element
     */
    void setProcessorEmployeeID(com.sap.xi.ap.common.gdt.EmployeeID processorEmployeeID);
    
    /**
     * Appends and returns a new empty "ProcessorEmployeeID" element
     */
    com.sap.xi.ap.common.gdt.EmployeeID addNewProcessorEmployeeID();
    
    /**
     * Unsets the "ProcessorEmployeeID" element
     */
    void unsetProcessorEmployeeID();
    
    /**
     * Gets the "ExecutionDateTime" element
     */
    java.util.Calendar getExecutionDateTime();
    
    /**
     * Gets (as xml) the "ExecutionDateTime" element
     */
    com.sap.xi.basis.global.GLOBALDateTime xgetExecutionDateTime();
    
    /**
     * True if has "ExecutionDateTime" element
     */
    boolean isSetExecutionDateTime();
    
    /**
     * Sets the "ExecutionDateTime" element
     */
    void setExecutionDateTime(java.util.Calendar executionDateTime);
    
    /**
     * Sets (as xml) the "ExecutionDateTime" element
     */
    void xsetExecutionDateTime(com.sap.xi.basis.global.GLOBALDateTime executionDateTime);
    
    /**
     * Unsets the "ExecutionDateTime" element
     */
    void unsetExecutionDateTime();
    
    /**
     * Gets the "ConfirmationCompletedRequiredIndicator" element
     */
    boolean getConfirmationCompletedRequiredIndicator();
    
    /**
     * Gets (as xml) the "ConfirmationCompletedRequiredIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetConfirmationCompletedRequiredIndicator();
    
    /**
     * True if has "ConfirmationCompletedRequiredIndicator" element
     */
    boolean isSetConfirmationCompletedRequiredIndicator();
    
    /**
     * Sets the "ConfirmationCompletedRequiredIndicator" element
     */
    void setConfirmationCompletedRequiredIndicator(boolean confirmationCompletedRequiredIndicator);
    
    /**
     * Sets (as xml) the "ConfirmationCompletedRequiredIndicator" element
     */
    void xsetConfirmationCompletedRequiredIndicator(com.sap.xi.ap.common.gdt.Indicator confirmationCompletedRequiredIndicator);
    
    /**
     * Unsets the "ConfirmationCompletedRequiredIndicator" element
     */
    void unsetConfirmationCompletedRequiredIndicator();
    
    /**
     * Gets the "RestartOfTaskIndicator" element
     */
    boolean getRestartOfTaskIndicator();
    
    /**
     * Gets (as xml) the "RestartOfTaskIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetRestartOfTaskIndicator();
    
    /**
     * True if has "RestartOfTaskIndicator" element
     */
    boolean isSetRestartOfTaskIndicator();
    
    /**
     * Sets the "RestartOfTaskIndicator" element
     */
    void setRestartOfTaskIndicator(boolean restartOfTaskIndicator);
    
    /**
     * Sets (as xml) the "RestartOfTaskIndicator" element
     */
    void xsetRestartOfTaskIndicator(com.sap.xi.ap.common.gdt.Indicator restartOfTaskIndicator);
    
    /**
     * Unsets the "RestartOfTaskIndicator" element
     */
    void unsetRestartOfTaskIndicator();
    
    /**
     * Gets the "AssignResponsibleIndicator" element
     */
    boolean getAssignResponsibleIndicator();
    
    /**
     * Gets (as xml) the "AssignResponsibleIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetAssignResponsibleIndicator();
    
    /**
     * True if has "AssignResponsibleIndicator" element
     */
    boolean isSetAssignResponsibleIndicator();
    
    /**
     * Sets the "AssignResponsibleIndicator" element
     */
    void setAssignResponsibleIndicator(boolean assignResponsibleIndicator);
    
    /**
     * Sets (as xml) the "AssignResponsibleIndicator" element
     */
    void xsetAssignResponsibleIndicator(com.sap.xi.ap.common.gdt.Indicator assignResponsibleIndicator);
    
    /**
     * Unsets the "AssignResponsibleIndicator" element
     */
    void unsetAssignResponsibleIndicator();
    
    /**
     * Gets the "ProcessedOnDateTime" element
     */
    java.util.Calendar getProcessedOnDateTime();
    
    /**
     * Gets (as xml) the "ProcessedOnDateTime" element
     */
    com.sap.xi.basis.global.GLOBALDateTime xgetProcessedOnDateTime();
    
    /**
     * True if has "ProcessedOnDateTime" element
     */
    boolean isSetProcessedOnDateTime();
    
    /**
     * Sets the "ProcessedOnDateTime" element
     */
    void setProcessedOnDateTime(java.util.Calendar processedOnDateTime);
    
    /**
     * Sets (as xml) the "ProcessedOnDateTime" element
     */
    void xsetProcessedOnDateTime(com.sap.xi.basis.global.GLOBALDateTime processedOnDateTime);
    
    /**
     * Unsets the "ProcessedOnDateTime" element
     */
    void unsetProcessedOnDateTime();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT newInstance() {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionTaskManageResponseMDT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
