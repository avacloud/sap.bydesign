/*
 * XML Type:  NONNEGATIVE_Quantity
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt;


/**
 * An XML NONNEGATIVE_Quantity(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity.
 */
public interface NONNEGATIVEQuantity extends com.sap.xi.ap.common.gdt.NONNEGATIVEQuantityContent
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NONNEGATIVEQuantity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC3CE6D3D93732D21BBFB9685A6096211").resolveHandle("nonnegativequantity2bd2type");
    
    /**
     * Gets the "unitCode" attribute
     */
    java.lang.String getUnitCode();
    
    /**
     * Gets (as xml) the "unitCode" attribute
     */
    com.sap.xi.ap.common.gdt.MeasureUnitCode xgetUnitCode();
    
    /**
     * True if has "unitCode" attribute
     */
    boolean isSetUnitCode();
    
    /**
     * Sets the "unitCode" attribute
     */
    void setUnitCode(java.lang.String unitCode);
    
    /**
     * Sets (as xml) the "unitCode" attribute
     */
    void xsetUnitCode(com.sap.xi.ap.common.gdt.MeasureUnitCode unitCode);
    
    /**
     * Unsets the "unitCode" attribute
     */
    void unsetUnitCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity newInstance() {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
