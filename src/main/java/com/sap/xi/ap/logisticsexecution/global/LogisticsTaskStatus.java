/*
 * XML Type:  LogisticsTaskStatus
 * Namespace: http://sap.com/xi/AP/LogisticsExecution/Global
 * Java type: com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.logisticsexecution.global;


/**
 * An XML LogisticsTaskStatus(@http://sap.com/xi/AP/LogisticsExecution/Global).
 *
 * This is a complex type.
 */
public interface LogisticsTaskStatus extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LogisticsTaskStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7274E74C1D219A67E80FDE53A95800C").resolveHandle("logisticstaskstatuse73etype");
    
    /**
     * Gets the "ProcessingStatusCode" element
     */
    com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum getProcessingStatusCode();
    
    /**
     * Gets (as xml) the "ProcessingStatusCode" element
     */
    com.sap.xi.ap.common.gdt.ProcessingStatusCode xgetProcessingStatusCode();
    
    /**
     * Sets the "ProcessingStatusCode" element
     */
    void setProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum processingStatusCode);
    
    /**
     * Sets (as xml) the "ProcessingStatusCode" element
     */
    void xsetProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode processingStatusCode);
    
    /**
     * Gets the "StartFeasibilityStatusCode" element
     */
    com.sap.xi.ap.common.gdt.FeasibilityStatusCode.Enum getStartFeasibilityStatusCode();
    
    /**
     * Gets (as xml) the "StartFeasibilityStatusCode" element
     */
    com.sap.xi.ap.common.gdt.FeasibilityStatusCode xgetStartFeasibilityStatusCode();
    
    /**
     * Sets the "StartFeasibilityStatusCode" element
     */
    void setStartFeasibilityStatusCode(com.sap.xi.ap.common.gdt.FeasibilityStatusCode.Enum startFeasibilityStatusCode);
    
    /**
     * Sets (as xml) the "StartFeasibilityStatusCode" element
     */
    void xsetStartFeasibilityStatusCode(com.sap.xi.ap.common.gdt.FeasibilityStatusCode startFeasibilityStatusCode);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus newInstance() {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
