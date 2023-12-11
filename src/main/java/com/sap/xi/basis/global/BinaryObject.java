/*
 * XML Type:  BinaryObject
 * Namespace: http://sap.com/xi/BASIS/Global
 * Java type: com.sap.xi.basis.global.BinaryObject
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.basis.global;


/**
 * An XML BinaryObject(@http://sap.com/xi/BASIS/Global).
 *
 * This is an atomic type that is a restriction of com.sap.xi.basis.global.BinaryObject.
 */
public interface BinaryObject extends org.apache.xmlbeans.XmlBase64Binary
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BinaryObject.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB771E6A4E5734821943EC48117D8A797").resolveHandle("binaryobject9dbdtype");
    
    /**
     * Gets the "mimeCode" attribute
     */
    java.lang.String getMimeCode();
    
    /**
     * Gets (as xml) the "mimeCode" attribute
     */
    com.sap.xi.basis.global.MIMECode xgetMimeCode();
    
    /**
     * True if has "mimeCode" attribute
     */
    boolean isSetMimeCode();
    
    /**
     * Sets the "mimeCode" attribute
     */
    void setMimeCode(java.lang.String mimeCode);
    
    /**
     * Sets (as xml) the "mimeCode" attribute
     */
    void xsetMimeCode(com.sap.xi.basis.global.MIMECode mimeCode);
    
    /**
     * Unsets the "mimeCode" attribute
     */
    void unsetMimeCode();
    
    /**
     * Gets the "characterSetCode" attribute
     */
    java.lang.String getCharacterSetCode();
    
    /**
     * Gets (as xml) the "characterSetCode" attribute
     */
    com.sap.xi.basis.global.CharacterSetCode xgetCharacterSetCode();
    
    /**
     * True if has "characterSetCode" attribute
     */
    boolean isSetCharacterSetCode();
    
    /**
     * Sets the "characterSetCode" attribute
     */
    void setCharacterSetCode(java.lang.String characterSetCode);
    
    /**
     * Sets (as xml) the "characterSetCode" attribute
     */
    void xsetCharacterSetCode(com.sap.xi.basis.global.CharacterSetCode characterSetCode);
    
    /**
     * Unsets the "characterSetCode" attribute
     */
    void unsetCharacterSetCode();
    
    /**
     * Gets the "format" attribute
     */
    java.lang.String getFormat();
    
    /**
     * Gets (as xml) the "format" attribute
     */
    org.apache.xmlbeans.XmlToken xgetFormat();
    
    /**
     * True if has "format" attribute
     */
    boolean isSetFormat();
    
    /**
     * Sets the "format" attribute
     */
    void setFormat(java.lang.String format);
    
    /**
     * Sets (as xml) the "format" attribute
     */
    void xsetFormat(org.apache.xmlbeans.XmlToken format);
    
    /**
     * Unsets the "format" attribute
     */
    void unsetFormat();
    
    /**
     * Gets the "fileName" attribute
     */
    java.lang.String getFileName();
    
    /**
     * Gets (as xml) the "fileName" attribute
     */
    org.apache.xmlbeans.XmlString xgetFileName();
    
    /**
     * True if has "fileName" attribute
     */
    boolean isSetFileName();
    
    /**
     * Sets the "fileName" attribute
     */
    void setFileName(java.lang.String fileName);
    
    /**
     * Sets (as xml) the "fileName" attribute
     */
    void xsetFileName(org.apache.xmlbeans.XmlString fileName);
    
    /**
     * Unsets the "fileName" attribute
     */
    void unsetFileName();
    
    /**
     * Gets the "uri" attribute
     */
    java.lang.String getUri();
    
    /**
     * Gets (as xml) the "uri" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetUri();
    
    /**
     * True if has "uri" attribute
     */
    boolean isSetUri();
    
    /**
     * Sets the "uri" attribute
     */
    void setUri(java.lang.String uri);
    
    /**
     * Sets (as xml) the "uri" attribute
     */
    void xsetUri(org.apache.xmlbeans.XmlAnyURI uri);
    
    /**
     * Unsets the "uri" attribute
     */
    void unsetUri();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.basis.global.BinaryObject newInstance() {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.basis.global.BinaryObject newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.basis.global.BinaryObject parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.basis.global.BinaryObject parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.basis.global.BinaryObject parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.basis.global.BinaryObject parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.basis.global.BinaryObject parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.basis.global.BinaryObject parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.basis.global.BinaryObject parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.basis.global.BinaryObject parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.basis.global.BinaryObject parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.basis.global.BinaryObject parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.basis.global.BinaryObject parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.basis.global.BinaryObject parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.basis.global.BinaryObject parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.basis.global.BinaryObject parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.basis.global.BinaryObject parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.basis.global.BinaryObject parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.basis.global.BinaryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
