/*
 * XML Type:  ProductionLotBundleLog
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotBundleLog
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ProductionLotBundleLog(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ProductionLotBundleLog extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductionLotBundleLog.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s96DEC7DD933DAEBB03DFF861936C486A").resolveHandle("productionlotbundlelog01eetype");
    
    /**
     * Gets the "NodeName" element
     */
    java.lang.String getNodeName();
    
    /**
     * Gets (as xml) the "NodeName" element
     */
    com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTMEDIUMName xgetNodeName();
    
    /**
     * True if has "NodeName" element
     */
    boolean isSetNodeName();
    
    /**
     * Sets the "NodeName" element
     */
    void setNodeName(java.lang.String nodeName);
    
    /**
     * Sets (as xml) the "NodeName" element
     */
    void xsetNodeName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTMEDIUMName nodeName);
    
    /**
     * Unsets the "NodeName" element
     */
    void unsetNodeName();
    
    /**
     * Gets the "NodeID" element
     */
    java.lang.String getNodeID();
    
    /**
     * Gets (as xml) the "NodeID" element
     */
    com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID xgetNodeID();
    
    /**
     * True if has "NodeID" element
     */
    boolean isSetNodeID();
    
    /**
     * Sets the "NodeID" element
     */
    void setNodeID(java.lang.String nodeID);
    
    /**
     * Sets (as xml) the "NodeID" element
     */
    void xsetNodeID(com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID nodeID);
    
    /**
     * Unsets the "NodeID" element
     */
    void unsetNodeID();
    
    /**
     * Gets the "SeverityCode" element
     */
    java.lang.String getSeverityCode();
    
    /**
     * Gets (as xml) the "SeverityCode" element
     */
    com.sap.xi.ap.common.gdt.LogItemSeverityCode xgetSeverityCode();
    
    /**
     * True if has "SeverityCode" element
     */
    boolean isSetSeverityCode();
    
    /**
     * Sets the "SeverityCode" element
     */
    void setSeverityCode(java.lang.String severityCode);
    
    /**
     * Sets (as xml) the "SeverityCode" element
     */
    void xsetSeverityCode(com.sap.xi.ap.common.gdt.LogItemSeverityCode severityCode);
    
    /**
     * Unsets the "SeverityCode" element
     */
    void unsetSeverityCode();
    
    /**
     * Gets the "Note" element
     */
    java.lang.String getNote();
    
    /**
     * Gets (as xml) the "Note" element
     */
    com.sap.xi.ap.common.gdt.LogItemNote xgetNote();
    
    /**
     * True if has "Note" element
     */
    boolean isSetNote();
    
    /**
     * Sets the "Note" element
     */
    void setNote(java.lang.String note);
    
    /**
     * Sets (as xml) the "Note" element
     */
    void xsetNote(com.sap.xi.ap.common.gdt.LogItemNote note);
    
    /**
     * Unsets the "Note" element
     */
    void unsetNote();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ProductionLotBundleLog newInstance() {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleLog newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ProductionLotBundleLog parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleLog parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ProductionLotBundleLog parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleLog parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleLog parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleLog parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleLog parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleLog parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleLog parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleLog parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleLog parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleLog parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleLog parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotBundleLog parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotBundleLog parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotBundleLog parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotBundleLog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
