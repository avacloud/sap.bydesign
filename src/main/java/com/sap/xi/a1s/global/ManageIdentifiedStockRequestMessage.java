/*
 * XML Type:  ManageIdentifiedStockRequestMessage
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ManageIdentifiedStockRequestMessage(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ManageIdentifiedStockRequestMessage extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ManageIdentifiedStockRequestMessage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB771E6A4E5734821943EC48117D8A797").resolveHandle("manageidentifiedstockrequestmessage675ctype");
    
    /**
     * Gets the "BasicMessageHeader" element
     */
    com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader getBasicMessageHeader();
    
    /**
     * Sets the "BasicMessageHeader" element
     */
    void setBasicMessageHeader(com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader basicMessageHeader);
    
    /**
     * Appends and returns a new empty "BasicMessageHeader" element
     */
    com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader addNewBasicMessageHeader();
    
    /**
     * Gets array of all "IdentifiedStockMaintainBundle" elements
     */
    com.sap.xi.a1s.global.ManageIdentifiedStocksRequest[] getIdentifiedStockMaintainBundleArray();
    
    /**
     * Gets ith "IdentifiedStockMaintainBundle" element
     */
    com.sap.xi.a1s.global.ManageIdentifiedStocksRequest getIdentifiedStockMaintainBundleArray(int i);
    
    /**
     * Returns number of "IdentifiedStockMaintainBundle" element
     */
    int sizeOfIdentifiedStockMaintainBundleArray();
    
    /**
     * Sets array of all "IdentifiedStockMaintainBundle" element
     */
    void setIdentifiedStockMaintainBundleArray(com.sap.xi.a1s.global.ManageIdentifiedStocksRequest[] identifiedStockMaintainBundleArray);
    
    /**
     * Sets ith "IdentifiedStockMaintainBundle" element
     */
    void setIdentifiedStockMaintainBundleArray(int i, com.sap.xi.a1s.global.ManageIdentifiedStocksRequest identifiedStockMaintainBundle);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentifiedStockMaintainBundle" element
     */
    com.sap.xi.a1s.global.ManageIdentifiedStocksRequest insertNewIdentifiedStockMaintainBundle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdentifiedStockMaintainBundle" element
     */
    com.sap.xi.a1s.global.ManageIdentifiedStocksRequest addNewIdentifiedStockMaintainBundle();
    
    /**
     * Removes the ith "IdentifiedStockMaintainBundle" element
     */
    void removeIdentifiedStockMaintainBundle(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage newInstance() {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
