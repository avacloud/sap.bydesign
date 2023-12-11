/*
 * XML Type:  IdentifiedStockQueryResponseMessage
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML IdentifiedStockQueryResponseMessage(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface IdentifiedStockQueryResponseMessage extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdentifiedStockQueryResponseMessage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE54F276BEA9A330AB693E7CF92C67E6A").resolveHandle("identifiedstockqueryresponsemessage8ff1type");
    
    /**
     * Gets the "ProcessingConditions" element
     */
    com.sap.xi.ap.common.gdt.ResponseProcessingConditions getProcessingConditions();
    
    /**
     * Sets the "ProcessingConditions" element
     */
    void setProcessingConditions(com.sap.xi.ap.common.gdt.ResponseProcessingConditions processingConditions);
    
    /**
     * Appends and returns a new empty "ProcessingConditions" element
     */
    com.sap.xi.ap.common.gdt.ResponseProcessingConditions addNewProcessingConditions();
    
    /**
     * Gets the "Log" element
     */
    com.sap.xi.ap.common.gdt.Log getLog();
    
    /**
     * Sets the "Log" element
     */
    void setLog(com.sap.xi.ap.common.gdt.Log log);
    
    /**
     * Appends and returns a new empty "Log" element
     */
    com.sap.xi.ap.common.gdt.Log addNewLog();
    
    /**
     * Gets array of all "IdentifiedStock" elements
     */
    com.sap.xi.a1s.global.IdentifiedStockQueryResponse[] getIdentifiedStockArray();
    
    /**
     * Gets ith "IdentifiedStock" element
     */
    com.sap.xi.a1s.global.IdentifiedStockQueryResponse getIdentifiedStockArray(int i);
    
    /**
     * Returns number of "IdentifiedStock" element
     */
    int sizeOfIdentifiedStockArray();
    
    /**
     * Sets array of all "IdentifiedStock" element
     */
    void setIdentifiedStockArray(com.sap.xi.a1s.global.IdentifiedStockQueryResponse[] identifiedStockArray);
    
    /**
     * Sets ith "IdentifiedStock" element
     */
    void setIdentifiedStockArray(int i, com.sap.xi.a1s.global.IdentifiedStockQueryResponse identifiedStock);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentifiedStock" element
     */
    com.sap.xi.a1s.global.IdentifiedStockQueryResponse insertNewIdentifiedStock(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdentifiedStock" element
     */
    com.sap.xi.a1s.global.IdentifiedStockQueryResponse addNewIdentifiedStock();
    
    /**
     * Removes the ith "IdentifiedStock" element
     */
    void removeIdentifiedStock(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage newInstance() {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
