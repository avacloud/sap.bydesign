/*
 * XML Type:  MaterialByElementsResponseMessage_sync
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML MaterialByElementsResponseMessage_sync(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface MaterialByElementsResponseMessageSync extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaterialByElementsResponseMessageSync.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B8FAE3D556F3A1A6A1FE3D414B4E0DE").resolveHandle("materialbyelementsresponsemessagesyncc96ftype");
    
    /**
     * Gets array of all "Material" elements
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync[] getMaterialArray();
    
    /**
     * Gets ith "Material" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync getMaterialArray(int i);
    
    /**
     * Returns number of "Material" element
     */
    int sizeOfMaterialArray();
    
    /**
     * Sets array of all "Material" element
     */
    void setMaterialArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync[] materialArray);
    
    /**
     * Sets ith "Material" element
     */
    void setMaterialArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync material);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Material" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync insertNewMaterial(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Material" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync addNewMaterial();
    
    /**
     * Removes the ith "Material" element
     */
    void removeMaterial(int i);
    
    /**
     * Gets the "ProcessingConditions" element
     */
    com.sap.xi.ap.common.gdt.ResponseProcessingConditions getProcessingConditions();
    
    /**
     * Sets the "ProcessingConditions" element
     */
    void setProcessingConditions(com.sap.xi.ap.common.gdt.ResponseProcessingConditions processingConditions);
    
    /**
     * Appends and returns a new empty "ProcessingConditions" element
     */
    com.sap.xi.ap.common.gdt.ResponseProcessingConditions addNewProcessingConditions();
    
    /**
     * Gets the "Log" element
     */
    com.sap.xi.ap.common.gdt.Log getLog();
    
    /**
     * True if has "Log" element
     */
    boolean isSetLog();
    
    /**
     * Sets the "Log" element
     */
    void setLog(com.sap.xi.ap.common.gdt.Log log);
    
    /**
     * Appends and returns a new empty "Log" element
     */
    com.sap.xi.ap.common.gdt.Log addNewLog();
    
    /**
     * Unsets the "Log" element
     */
    void unsetLog();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync newInstance() {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
