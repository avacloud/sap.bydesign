/*
 * XML Type:  AccessTextCollectionTextTextContent
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global;


/**
 * An XML AccessTextCollectionTextTextContent(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public interface AccessTextCollectionTextTextContent extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AccessTextCollectionTextTextContent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE54F276BEA9A330AB693E7CF92C67E6A").resolveHandle("accesstextcollectiontexttextcontent29eetype");
    
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
    com.sap.xi.ap.common.gdt.Text getText();
    
    /**
     * True if has "Text" element
     */
    boolean isSetText();
    
    /**
     * Sets the "Text" element
     */
    void setText(com.sap.xi.ap.common.gdt.Text text);
    
    /**
     * Appends and returns a new empty "Text" element
     */
    com.sap.xi.ap.common.gdt.Text addNewText();
    
    /**
     * Unsets the "Text" element
     */
    void unsetText();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent newInstance() {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
