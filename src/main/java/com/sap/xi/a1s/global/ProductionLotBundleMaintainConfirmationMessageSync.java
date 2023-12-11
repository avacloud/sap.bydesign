/*
 * XML Type:  ProductionLotBundleMaintainConfirmationMessage_sync
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ProductionLotBundleMaintainConfirmationMessage_sync(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ProductionLotBundleMaintainConfirmationMessageSync extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductionLotBundleMaintainConfirmationMessageSync.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3516FCF9D95E9E30AE8D4E360678AF8D").resolveHandle("productionlotbundlemaintainconfirmationmessagesync00fdtype");
    
    /**
     * Gets array of all "ProductionLotResponse" elements
     */
    com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations[] getProductionLotResponseArray();
    
    /**
     * Gets ith "ProductionLotResponse" element
     */
    com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations getProductionLotResponseArray(int i);
    
    /**
     * Returns number of "ProductionLotResponse" element
     */
    int sizeOfProductionLotResponseArray();
    
    /**
     * Sets array of all "ProductionLotResponse" element
     */
    void setProductionLotResponseArray(com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations[] productionLotResponseArray);
    
    /**
     * Sets ith "ProductionLotResponse" element
     */
    void setProductionLotResponseArray(int i, com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations productionLotResponse);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductionLotResponse" element
     */
    com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations insertNewProductionLotResponse(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductionLotResponse" element
     */
    com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations addNewProductionLotResponse();
    
    /**
     * Removes the ith "ProductionLotResponse" element
     */
    void removeProductionLotResponse(int i);
    
    /**
     * Gets the "ExceptionMessage" element
     */
    com.sap.xi.a1s.global.ProductionLotBundleException getExceptionMessage();
    
    /**
     * True if has "ExceptionMessage" element
     */
    boolean isSetExceptionMessage();
    
    /**
     * Sets the "ExceptionMessage" element
     */
    void setExceptionMessage(com.sap.xi.a1s.global.ProductionLotBundleException exceptionMessage);
    
    /**
     * Appends and returns a new empty "ExceptionMessage" element
     */
    com.sap.xi.a1s.global.ProductionLotBundleException addNewExceptionMessage();
    
    /**
     * Unsets the "ExceptionMessage" element
     */
    void unsetExceptionMessage();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync newInstance() {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
