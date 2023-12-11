/*
 * XML Type:  SiteLogisticsLotOperationActivity
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML SiteLogisticsLotOperationActivity(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface SiteLogisticsLotOperationActivity extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SiteLogisticsLotOperationActivity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("sitelogisticslotoperationactivity0cb9type");
    
    /**
     * Gets the "SiteLogisticsLotOperationActivityUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getSiteLogisticsLotOperationActivityUUID();
    
    /**
     * True if has "SiteLogisticsLotOperationActivityUUID" element
     */
    boolean isSetSiteLogisticsLotOperationActivityUUID();
    
    /**
     * Sets the "SiteLogisticsLotOperationActivityUUID" element
     */
    void setSiteLogisticsLotOperationActivityUUID(com.sap.xi.ap.common.gdt.UUID siteLogisticsLotOperationActivityUUID);
    
    /**
     * Appends and returns a new empty "SiteLogisticsLotOperationActivityUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewSiteLogisticsLotOperationActivityUUID();
    
    /**
     * Unsets the "SiteLogisticsLotOperationActivityUUID" element
     */
    void unsetSiteLogisticsLotOperationActivityUUID();
    
    /**
     * Gets array of all "MaterialInput" elements
     */
    com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput[] getMaterialInputArray();
    
    /**
     * Gets ith "MaterialInput" element
     */
    com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput getMaterialInputArray(int i);
    
    /**
     * Returns number of "MaterialInput" element
     */
    int sizeOfMaterialInputArray();
    
    /**
     * Sets array of all "MaterialInput" element
     */
    void setMaterialInputArray(com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput[] materialInputArray);
    
    /**
     * Sets ith "MaterialInput" element
     */
    void setMaterialInputArray(int i, com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput materialInput);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MaterialInput" element
     */
    com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput insertNewMaterialInput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MaterialInput" element
     */
    com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput addNewMaterialInput();
    
    /**
     * Removes the ith "MaterialInput" element
     */
    void removeMaterialInput(int i);
    
    /**
     * Gets array of all "MaterialOutput" elements
     */
    com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput[] getMaterialOutputArray();
    
    /**
     * Gets ith "MaterialOutput" element
     */
    com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput getMaterialOutputArray(int i);
    
    /**
     * Returns number of "MaterialOutput" element
     */
    int sizeOfMaterialOutputArray();
    
    /**
     * Sets array of all "MaterialOutput" element
     */
    void setMaterialOutputArray(com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput[] materialOutputArray);
    
    /**
     * Sets ith "MaterialOutput" element
     */
    void setMaterialOutputArray(int i, com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput materialOutput);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MaterialOutput" element
     */
    com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput insertNewMaterialOutput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MaterialOutput" element
     */
    com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput addNewMaterialOutput();
    
    /**
     * Removes the ith "MaterialOutput" element
     */
    void removeMaterialOutput(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity newInstance() {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
