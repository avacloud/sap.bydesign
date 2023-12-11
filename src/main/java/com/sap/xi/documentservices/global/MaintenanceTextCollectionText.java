/*
 * XML Type:  MaintenanceTextCollectionText
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.MaintenanceTextCollectionText
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global;


/**
 * An XML MaintenanceTextCollectionText(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public interface MaintenanceTextCollectionText extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaintenanceTextCollectionText.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB771E6A4E5734821943EC48117D8A797").resolveHandle("maintenancetextcollectiontext6069type");
    
    /**
     * Gets the "TechnicalID" element
     */
    java.lang.String getTechnicalID();
    
    /**
     * Gets (as xml) the "TechnicalID" element
     */
    com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID xgetTechnicalID();
    
    /**
     * True if has "TechnicalID" element
     */
    boolean isSetTechnicalID();
    
    /**
     * Sets the "TechnicalID" element
     */
    void setTechnicalID(java.lang.String technicalID);
    
    /**
     * Sets (as xml) the "TechnicalID" element
     */
    void xsetTechnicalID(com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID technicalID);
    
    /**
     * Unsets the "TechnicalID" element
     */
    void unsetTechnicalID();
    
    /**
     * Gets the "TypeCode" element
     */
    com.sap.xi.ap.common.gdt.TextCollectionTextTypeCode getTypeCode();
    
    /**
     * True if has "TypeCode" element
     */
    boolean isSetTypeCode();
    
    /**
     * Sets the "TypeCode" element
     */
    void setTypeCode(com.sap.xi.ap.common.gdt.TextCollectionTextTypeCode typeCode);
    
    /**
     * Appends and returns a new empty "TypeCode" element
     */
    com.sap.xi.ap.common.gdt.TextCollectionTextTypeCode addNewTypeCode();
    
    /**
     * Unsets the "TypeCode" element
     */
    void unsetTypeCode();
    
    /**
     * Gets the "LanguageCode" element
     */
    java.lang.String getLanguageCode();
    
    /**
     * Gets (as xml) the "LanguageCode" element
     */
    com.sap.xi.basis.global.LanguageCode xgetLanguageCode();
    
    /**
     * True if has "LanguageCode" element
     */
    boolean isSetLanguageCode();
    
    /**
     * Sets the "LanguageCode" element
     */
    void setLanguageCode(java.lang.String languageCode);
    
    /**
     * Sets (as xml) the "LanguageCode" element
     */
    void xsetLanguageCode(com.sap.xi.basis.global.LanguageCode languageCode);
    
    /**
     * Unsets the "LanguageCode" element
     */
    void unsetLanguageCode();
    
    /**
     * Gets the "CreationDateTime" element
     */
    java.util.Calendar getCreationDateTime();
    
    /**
     * Gets (as xml) the "CreationDateTime" element
     */
    com.sap.xi.basis.global.GLOBALDateTime xgetCreationDateTime();
    
    /**
     * True if has "CreationDateTime" element
     */
    boolean isSetCreationDateTime();
    
    /**
     * Sets the "CreationDateTime" element
     */
    void setCreationDateTime(java.util.Calendar creationDateTime);
    
    /**
     * Sets (as xml) the "CreationDateTime" element
     */
    void xsetCreationDateTime(com.sap.xi.basis.global.GLOBALDateTime creationDateTime);
    
    /**
     * Unsets the "CreationDateTime" element
     */
    void unsetCreationDateTime();
    
    /**
     * Gets the "TextContent" element
     */
    com.sap.xi.documentservices.global.MaintenanceTextCollectionTextTextContent getTextContent();
    
    /**
     * True if has "TextContent" element
     */
    boolean isSetTextContent();
    
    /**
     * Sets the "TextContent" element
     */
    void setTextContent(com.sap.xi.documentservices.global.MaintenanceTextCollectionTextTextContent textContent);
    
    /**
     * Appends and returns a new empty "TextContent" element
     */
    com.sap.xi.documentservices.global.MaintenanceTextCollectionTextTextContent addNewTextContent();
    
    /**
     * Unsets the "TextContent" element
     */
    void unsetTextContent();
    
    /**
     * Gets the "ActionCode" attribute
     */
    com.sap.xi.ap.common.gdt.ActionCode.Enum getActionCode();
    
    /**
     * Gets (as xml) the "ActionCode" attribute
     */
    com.sap.xi.ap.common.gdt.ActionCode xgetActionCode();
    
    /**
     * True if has "ActionCode" attribute
     */
    boolean isSetActionCode();
    
    /**
     * Sets the "ActionCode" attribute
     */
    void setActionCode(com.sap.xi.ap.common.gdt.ActionCode.Enum actionCode);
    
    /**
     * Sets (as xml) the "ActionCode" attribute
     */
    void xsetActionCode(com.sap.xi.ap.common.gdt.ActionCode actionCode);
    
    /**
     * Unsets the "ActionCode" attribute
     */
    void unsetActionCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText newInstance() {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.documentservices.global.MaintenanceTextCollectionText parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollectionText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
