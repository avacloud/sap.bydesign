/*
 * XML Type:  AccessAttachmentFolderDocumentPropertyPropertyValue
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global;


/**
 * An XML AccessAttachmentFolderDocumentPropertyPropertyValue(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public interface AccessAttachmentFolderDocumentPropertyPropertyValue extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AccessAttachmentFolderDocumentPropertyPropertyValue.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B8FAE3D556F3A1A6A1FE3D414B4E0DE").resolveHandle("accessattachmentfolderdocumentpropertypropertyvalued3b5type");
    
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
     * Gets the "Text" element
     */
    java.lang.String getText();
    
    /**
     * Gets (as xml) the "Text" element
     */
    com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTText xgetText();
    
    /**
     * True if has "Text" element
     */
    boolean isSetText();
    
    /**
     * Sets the "Text" element
     */
    void setText(java.lang.String text);
    
    /**
     * Sets (as xml) the "Text" element
     */
    void xsetText(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTText text);
    
    /**
     * Unsets the "Text" element
     */
    void unsetText();
    
    /**
     * Gets the "Indicator" element
     */
    boolean getIndicator();
    
    /**
     * Gets (as xml) the "Indicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetIndicator();
    
    /**
     * True if has "Indicator" element
     */
    boolean isSetIndicator();
    
    /**
     * Sets the "Indicator" element
     */
    void setIndicator(boolean indicator);
    
    /**
     * Sets (as xml) the "Indicator" element
     */
    void xsetIndicator(com.sap.xi.ap.common.gdt.Indicator indicator);
    
    /**
     * Unsets the "Indicator" element
     */
    void unsetIndicator();
    
    /**
     * Gets the "DateTime" element
     */
    java.util.Calendar getDateTime();
    
    /**
     * Gets (as xml) the "DateTime" element
     */
    com.sap.xi.basis.global.GLOBALDateTime xgetDateTime();
    
    /**
     * True if has "DateTime" element
     */
    boolean isSetDateTime();
    
    /**
     * Sets the "DateTime" element
     */
    void setDateTime(java.util.Calendar dateTime);
    
    /**
     * Sets (as xml) the "DateTime" element
     */
    void xsetDateTime(com.sap.xi.basis.global.GLOBALDateTime dateTime);
    
    /**
     * Unsets the "DateTime" element
     */
    void unsetDateTime();
    
    /**
     * Gets the "IntegerValue" element
     */
    int getIntegerValue();
    
    /**
     * Gets (as xml) the "IntegerValue" element
     */
    com.sap.xi.ap.common.gdt.IntegerValue xgetIntegerValue();
    
    /**
     * True if has "IntegerValue" element
     */
    boolean isSetIntegerValue();
    
    /**
     * Sets the "IntegerValue" element
     */
    void setIntegerValue(int integerValue);
    
    /**
     * Sets (as xml) the "IntegerValue" element
     */
    void xsetIntegerValue(com.sap.xi.ap.common.gdt.IntegerValue integerValue);
    
    /**
     * Unsets the "IntegerValue" element
     */
    void unsetIntegerValue();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue newInstance() {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
