/*
 * XML Type:  ProductionTaskResponseMDT
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionTaskResponseMDT
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ProductionTaskResponseMDT(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ProductionTaskResponseMDT extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductionTaskResponseMDT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7274E74C1D219A67E80FDE53A95800C").resolveHandle("productiontaskresponsemdt0ecctype");
    
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
     * Gets the "Status" element
     */
    com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus getStatus();
    
    /**
     * True if has "Status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "Status" element
     */
    void setStatus(com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus status);
    
    /**
     * Appends and returns a new empty "Status" element
     */
    com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus addNewStatus();
    
    /**
     * Unsets the "Status" element
     */
    void unsetStatus();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT newInstance() {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionTaskResponseMDT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionTaskResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
