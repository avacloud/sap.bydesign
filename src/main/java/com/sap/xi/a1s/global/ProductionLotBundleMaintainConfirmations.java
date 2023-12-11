/*
 * XML Type:  ProductionLotBundleMaintainConfirmations
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ProductionLotBundleMaintainConfirmations(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ProductionLotBundleMaintainConfirmations extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductionLotBundleMaintainConfirmations.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3516FCF9D95E9E30AE8D4E360678AF8D").resolveHandle("productionlotbundlemaintainconfirmations223ftype");
    
    /**
     * Gets the "ProductionLotID" element
     */
    com.sap.xi.ap.common.gdt.ProductInternalID getProductionLotID();
    
    /**
     * Sets the "ProductionLotID" element
     */
    void setProductionLotID(com.sap.xi.ap.common.gdt.ProductInternalID productionLotID);
    
    /**
     * Appends and returns a new empty "ProductionLotID" element
     */
    com.sap.xi.ap.common.gdt.ProductInternalID addNewProductionLotID();
    
    /**
     * Gets the "ProductionLotUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getProductionLotUUID();
    
    /**
     * Sets the "ProductionLotUUID" element
     */
    void setProductionLotUUID(com.sap.xi.ap.common.gdt.UUID productionLotUUID);
    
    /**
     * Appends and returns a new empty "ProductionLotUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewProductionLotUUID();
    
    /**
     * Gets array of all "ProductionLotLog" elements
     */
    com.sap.xi.a1s.global.ProductionLotBundleLog[] getProductionLotLogArray();
    
    /**
     * Gets ith "ProductionLotLog" element
     */
    com.sap.xi.a1s.global.ProductionLotBundleLog getProductionLotLogArray(int i);
    
    /**
     * Returns number of "ProductionLotLog" element
     */
    int sizeOfProductionLotLogArray();
    
    /**
     * Sets array of all "ProductionLotLog" element
     */
    void setProductionLotLogArray(com.sap.xi.a1s.global.ProductionLotBundleLog[] productionLotLogArray);
    
    /**
     * Sets ith "ProductionLotLog" element
     */
    void setProductionLotLogArray(int i, com.sap.xi.a1s.global.ProductionLotBundleLog productionLotLog);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductionLotLog" element
     */
    com.sap.xi.a1s.global.ProductionLotBundleLog insertNewProductionLotLog(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductionLotLog" element
     */
    com.sap.xi.a1s.global.ProductionLotBundleLog addNewProductionLotLog();
    
    /**
     * Removes the ith "ProductionLotLog" element
     */
    void removeProductionLotLog(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations newInstance() {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
