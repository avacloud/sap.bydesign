/*
 * XML Type:  ProductionLotSerialNumberHierarchy
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ProductionLotSerialNumberHierarchy(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ProductionLotSerialNumberHierarchy extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductionLotSerialNumberHierarchy.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7274E74C1D219A67E80FDE53A95800C").resolveHandle("productionlotserialnumberhierarchy3638type");
    
    /**
     * Gets the "InputProductID" element
     */
    com.sap.xi.ap.common.gdt.ProductID getInputProductID();
    
    /**
     * True if has "InputProductID" element
     */
    boolean isSetInputProductID();
    
    /**
     * Sets the "InputProductID" element
     */
    void setInputProductID(com.sap.xi.ap.common.gdt.ProductID inputProductID);
    
    /**
     * Appends and returns a new empty "InputProductID" element
     */
    com.sap.xi.ap.common.gdt.ProductID addNewInputProductID();
    
    /**
     * Unsets the "InputProductID" element
     */
    void unsetInputProductID();
    
    /**
     * Gets the "InputProductUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getInputProductUUID();
    
    /**
     * True if has "InputProductUUID" element
     */
    boolean isSetInputProductUUID();
    
    /**
     * Sets the "InputProductUUID" element
     */
    void setInputProductUUID(com.sap.xi.ap.common.gdt.UUID inputProductUUID);
    
    /**
     * Appends and returns a new empty "InputProductUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewInputProductUUID();
    
    /**
     * Unsets the "InputProductUUID" element
     */
    void unsetInputProductUUID();
    
    /**
     * Gets the "InputProductSerialID" element
     */
    java.lang.String getInputProductSerialID();
    
    /**
     * Gets (as xml) the "InputProductSerialID" element
     */
    com.sap.xi.ap.common.gdt.SerialID xgetInputProductSerialID();
    
    /**
     * True if has "InputProductSerialID" element
     */
    boolean isSetInputProductSerialID();
    
    /**
     * Sets the "InputProductSerialID" element
     */
    void setInputProductSerialID(java.lang.String inputProductSerialID);
    
    /**
     * Sets (as xml) the "InputProductSerialID" element
     */
    void xsetInputProductSerialID(com.sap.xi.ap.common.gdt.SerialID inputProductSerialID);
    
    /**
     * Unsets the "InputProductSerialID" element
     */
    void unsetInputProductSerialID();
    
    /**
     * Gets the "InputProductSerialUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getInputProductSerialUUID();
    
    /**
     * True if has "InputProductSerialUUID" element
     */
    boolean isSetInputProductSerialUUID();
    
    /**
     * Sets the "InputProductSerialUUID" element
     */
    void setInputProductSerialUUID(com.sap.xi.ap.common.gdt.UUID inputProductSerialUUID);
    
    /**
     * Appends and returns a new empty "InputProductSerialUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewInputProductSerialUUID();
    
    /**
     * Unsets the "InputProductSerialUUID" element
     */
    void unsetInputProductSerialUUID();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy newInstance() {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
