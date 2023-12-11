/*
 * XML Type:  MaterialByElementsQueryMessage_sync
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML MaterialByElementsQueryMessage_sync(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface MaterialByElementsQueryMessageSync extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaterialByElementsQueryMessageSync.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B8FAE3D556F3A1A6A1FE3D414B4E0DE").resolveHandle("materialbyelementsquerymessagesync8744type");
    
    /**
     * Gets the "MaterialSelectionByElements" element
     */
    com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByElements getMaterialSelectionByElements();
    
    /**
     * True if has "MaterialSelectionByElements" element
     */
    boolean isSetMaterialSelectionByElements();
    
    /**
     * Sets the "MaterialSelectionByElements" element
     */
    void setMaterialSelectionByElements(com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByElements materialSelectionByElements);
    
    /**
     * Appends and returns a new empty "MaterialSelectionByElements" element
     */
    com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByElements addNewMaterialSelectionByElements();
    
    /**
     * Unsets the "MaterialSelectionByElements" element
     */
    void unsetMaterialSelectionByElements();
    
    /**
     * Gets the "ProcessingConditions" element
     */
    com.sap.xi.ap.common.gdt.QueryProcessingConditions getProcessingConditions();
    
    /**
     * True if has "ProcessingConditions" element
     */
    boolean isSetProcessingConditions();
    
    /**
     * Sets the "ProcessingConditions" element
     */
    void setProcessingConditions(com.sap.xi.ap.common.gdt.QueryProcessingConditions processingConditions);
    
    /**
     * Appends and returns a new empty "ProcessingConditions" element
     */
    com.sap.xi.ap.common.gdt.QueryProcessingConditions addNewProcessingConditions();
    
    /**
     * Unsets the "ProcessingConditions" element
     */
    void unsetProcessingConditions();
    
    /**
     * Gets the "RequestedElements" element
     */
    com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElements getRequestedElements();
    
    /**
     * True if has "RequestedElements" element
     */
    boolean isSetRequestedElements();
    
    /**
     * Sets the "RequestedElements" element
     */
    void setRequestedElements(com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElements requestedElements);
    
    /**
     * Appends and returns a new empty "RequestedElements" element
     */
    com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElements addNewRequestedElements();
    
    /**
     * Unsets the "RequestedElements" element
     */
    void unsetRequestedElements();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync newInstance() {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
