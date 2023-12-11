/*
 * An XML document type.
 * Localname: ProductionLotByElementsResponse_sync
 * Namespace: http://sap.com/xi/SAPGlobal20/Global
 * Java type: com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.sapglobal20.global;


/**
 * A document containing one ProductionLotByElementsResponse_sync(@http://sap.com/xi/SAPGlobal20/Global) element.
 *
 * This is a complex type.
 */
public interface ProductionLotByElementsResponseSyncDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductionLotByElementsResponseSyncDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7274E74C1D219A67E80FDE53A95800C").resolveHandle("productionlotbyelementsresponsesync74d5doctype");
    
    /**
     * Gets the "ProductionLotByElementsResponse_sync" element
     */
    com.sap.xi.a1s.global.ProductionLotResponseMessageSync getProductionLotByElementsResponseSync();
    
    /**
     * Sets the "ProductionLotByElementsResponse_sync" element
     */
    void setProductionLotByElementsResponseSync(com.sap.xi.a1s.global.ProductionLotResponseMessageSync productionLotByElementsResponseSync);
    
    /**
     * Appends and returns a new empty "ProductionLotByElementsResponse_sync" element
     */
    com.sap.xi.a1s.global.ProductionLotResponseMessageSync addNewProductionLotByElementsResponseSync();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument newInstance() {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
