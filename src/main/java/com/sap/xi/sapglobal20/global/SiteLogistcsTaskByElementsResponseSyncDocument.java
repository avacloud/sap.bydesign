/*
 * An XML document type.
 * Localname: SiteLogistcsTaskByElementsResponse_sync
 * Namespace: http://sap.com/xi/SAPGlobal20/Global
 * Java type: com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.sapglobal20.global;


/**
 * A document containing one SiteLogistcsTaskByElementsResponse_sync(@http://sap.com/xi/SAPGlobal20/Global) element.
 *
 * This is a complex type.
 */
public interface SiteLogistcsTaskByElementsResponseSyncDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SiteLogistcsTaskByElementsResponseSyncDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("sitelogistcstaskbyelementsresponsesync36d1doctype");
    
    /**
     * Gets the "SiteLogistcsTaskByElementsResponse_sync" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskResponseMessageSync getSiteLogistcsTaskByElementsResponseSync();
    
    /**
     * Sets the "SiteLogistcsTaskByElementsResponse_sync" element
     */
    void setSiteLogistcsTaskByElementsResponseSync(com.sap.xi.a1s.global.SiteLogisticsTaskResponseMessageSync siteLogistcsTaskByElementsResponseSync);
    
    /**
     * Appends and returns a new empty "SiteLogistcsTaskByElementsResponse_sync" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskResponseMessageSync addNewSiteLogistcsTaskByElementsResponseSync();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument newInstance() {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
