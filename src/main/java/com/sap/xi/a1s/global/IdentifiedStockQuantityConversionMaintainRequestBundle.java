/*
 * XML Type:  IdentifiedStockQuantityConversionMaintainRequestBundle
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML IdentifiedStockQuantityConversionMaintainRequestBundle(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface IdentifiedStockQuantityConversionMaintainRequestBundle extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdentifiedStockQuantityConversionMaintainRequestBundle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB771E6A4E5734821943EC48117D8A797").resolveHandle("identifiedstockquantityconversionmaintainrequestbundle7d6etype");
    
    /**
     * Gets the "ObjectNodeSenderTechnicalID" element
     */
    java.lang.String getObjectNodeSenderTechnicalID();
    
    /**
     * Gets (as xml) the "ObjectNodeSenderTechnicalID" element
     */
    com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID xgetObjectNodeSenderTechnicalID();
    
    /**
     * True if has "ObjectNodeSenderTechnicalID" element
     */
    boolean isSetObjectNodeSenderTechnicalID();
    
    /**
     * Sets the "ObjectNodeSenderTechnicalID" element
     */
    void setObjectNodeSenderTechnicalID(java.lang.String objectNodeSenderTechnicalID);
    
    /**
     * Sets (as xml) the "ObjectNodeSenderTechnicalID" element
     */
    void xsetObjectNodeSenderTechnicalID(com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID objectNodeSenderTechnicalID);
    
    /**
     * Unsets the "ObjectNodeSenderTechnicalID" element
     */
    void unsetObjectNodeSenderTechnicalID();
    
    /**
     * Gets the "BaseQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity getBaseQuantity();
    
    /**
     * True if has "BaseQuantity" element
     */
    boolean isSetBaseQuantity();
    
    /**
     * Sets the "BaseQuantity" element
     */
    void setBaseQuantity(com.sap.xi.ap.common.gdt.Quantity baseQuantity);
    
    /**
     * Appends and returns a new empty "BaseQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewBaseQuantity();
    
    /**
     * Unsets the "BaseQuantity" element
     */
    void unsetBaseQuantity();
    
    /**
     * Gets the "CorrespondingQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity getCorrespondingQuantity();
    
    /**
     * True if has "CorrespondingQuantity" element
     */
    boolean isSetCorrespondingQuantity();
    
    /**
     * Sets the "CorrespondingQuantity" element
     */
    void setCorrespondingQuantity(com.sap.xi.ap.common.gdt.Quantity correspondingQuantity);
    
    /**
     * Appends and returns a new empty "CorrespondingQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewCorrespondingQuantity();
    
    /**
     * Unsets the "CorrespondingQuantity" element
     */
    void unsetCorrespondingQuantity();
    
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
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle newInstance() {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
