/*
 * XML Type:  ExchangeLogData
 * Namespace: http://sap.com/xi/AP/Common/Global
 * Java type: com.sap.xi.ap.common.global.ExchangeLogData
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.global;


/**
 * An XML ExchangeLogData(@http://sap.com/xi/AP/Common/Global).
 *
 * This is a complex type.
 */
public interface ExchangeLogData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExchangeLogData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7F8A6CB98941A8E4F524F8FDDCF5010").resolveHandle("exchangelogdata8217type");
    
    /**
     * Gets the "severity" element
     */
    java.lang.String getSeverity();
    
    /**
     * Gets (as xml) the "severity" element
     */
    org.apache.xmlbeans.XmlString xgetSeverity();
    
    /**
     * True if has "severity" element
     */
    boolean isSetSeverity();
    
    /**
     * Sets the "severity" element
     */
    void setSeverity(java.lang.String severity);
    
    /**
     * Sets (as xml) the "severity" element
     */
    void xsetSeverity(org.apache.xmlbeans.XmlString severity);
    
    /**
     * Unsets the "severity" element
     */
    void unsetSeverity();
    
    /**
     * Gets the "text" element
     */
    java.lang.String getText();
    
    /**
     * Gets (as xml) the "text" element
     */
    org.apache.xmlbeans.XmlString xgetText();
    
    /**
     * Sets the "text" element
     */
    void setText(java.lang.String text);
    
    /**
     * Sets (as xml) the "text" element
     */
    void xsetText(org.apache.xmlbeans.XmlString text);
    
    /**
     * Gets the "url" element
     */
    java.lang.String getUrl();
    
    /**
     * Gets (as xml) the "url" element
     */
    org.apache.xmlbeans.XmlString xgetUrl();
    
    /**
     * True if has "url" element
     */
    boolean isSetUrl();
    
    /**
     * Sets the "url" element
     */
    void setUrl(java.lang.String url);
    
    /**
     * Sets (as xml) the "url" element
     */
    void xsetUrl(org.apache.xmlbeans.XmlString url);
    
    /**
     * Unsets the "url" element
     */
    void unsetUrl();
    
    /**
     * Gets the "id" element
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" element
     */
    org.apache.xmlbeans.XmlString xgetId();
    
    /**
     * True if has "id" element
     */
    boolean isSetId();
    
    /**
     * Sets the "id" element
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" element
     */
    void xsetId(org.apache.xmlbeans.XmlString id);
    
    /**
     * Unsets the "id" element
     */
    void unsetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.ap.common.global.ExchangeLogData newInstance() {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.ap.common.global.ExchangeLogData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.ap.common.global.ExchangeLogData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.ap.common.global.ExchangeLogData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.ap.common.global.ExchangeLogData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.ap.common.global.ExchangeLogData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.ap.common.global.ExchangeLogData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.ap.common.global.ExchangeLogData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.ap.common.global.ExchangeLogData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.ap.common.global.ExchangeLogData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.ap.common.global.ExchangeLogData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.ap.common.global.ExchangeLogData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.ap.common.global.ExchangeLogData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.ap.common.global.ExchangeLogData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.ap.common.global.ExchangeLogData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.ap.common.global.ExchangeLogData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.global.ExchangeLogData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.global.ExchangeLogData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.global.ExchangeLogData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
