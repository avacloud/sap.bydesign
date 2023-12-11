/*
 * XML Type:  SelectionByIdentifier
 * Namespace: http://sap.com/xi/AP/Common/Global
 * Java type: com.sap.xi.ap.common.global.SelectionByIdentifier
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.global;


/**
 * An XML SelectionByIdentifier(@http://sap.com/xi/AP/Common/Global).
 *
 * This is a complex type.
 */
public interface SelectionByIdentifier extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SelectionByIdentifier.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE54F276BEA9A330AB693E7CF92C67E6A").resolveHandle("selectionbyidentifiera516type");
    
    /**
     * Gets the "InclusionExclusionCode" element
     */
    java.lang.String getInclusionExclusionCode();
    
    /**
     * Gets (as xml) the "InclusionExclusionCode" element
     */
    com.sap.xi.ap.common.gdt.InclusionExclusionCode xgetInclusionExclusionCode();
    
    /**
     * True if has "InclusionExclusionCode" element
     */
    boolean isSetInclusionExclusionCode();
    
    /**
     * Sets the "InclusionExclusionCode" element
     */
    void setInclusionExclusionCode(java.lang.String inclusionExclusionCode);
    
    /**
     * Sets (as xml) the "InclusionExclusionCode" element
     */
    void xsetInclusionExclusionCode(com.sap.xi.ap.common.gdt.InclusionExclusionCode inclusionExclusionCode);
    
    /**
     * Unsets the "InclusionExclusionCode" element
     */
    void unsetInclusionExclusionCode();
    
    /**
     * Gets the "IntervalBoundaryTypeCode" element
     */
    java.lang.String getIntervalBoundaryTypeCode();
    
    /**
     * Gets (as xml) the "IntervalBoundaryTypeCode" element
     */
    com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode xgetIntervalBoundaryTypeCode();
    
    /**
     * Sets the "IntervalBoundaryTypeCode" element
     */
    void setIntervalBoundaryTypeCode(java.lang.String intervalBoundaryTypeCode);
    
    /**
     * Sets (as xml) the "IntervalBoundaryTypeCode" element
     */
    void xsetIntervalBoundaryTypeCode(com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode intervalBoundaryTypeCode);
    
    /**
     * Gets the "LowerBoundaryIdentifier" element
     */
    java.lang.String getLowerBoundaryIdentifier();
    
    /**
     * Gets (as xml) the "LowerBoundaryIdentifier" element
     */
    com.sap.xi.ap.common.gdt.SearchText xgetLowerBoundaryIdentifier();
    
    /**
     * True if has "LowerBoundaryIdentifier" element
     */
    boolean isSetLowerBoundaryIdentifier();
    
    /**
     * Sets the "LowerBoundaryIdentifier" element
     */
    void setLowerBoundaryIdentifier(java.lang.String lowerBoundaryIdentifier);
    
    /**
     * Sets (as xml) the "LowerBoundaryIdentifier" element
     */
    void xsetLowerBoundaryIdentifier(com.sap.xi.ap.common.gdt.SearchText lowerBoundaryIdentifier);
    
    /**
     * Unsets the "LowerBoundaryIdentifier" element
     */
    void unsetLowerBoundaryIdentifier();
    
    /**
     * Gets the "UpperBoundaryIdentifier" element
     */
    java.lang.String getUpperBoundaryIdentifier();
    
    /**
     * Gets (as xml) the "UpperBoundaryIdentifier" element
     */
    com.sap.xi.ap.common.gdt.SearchText xgetUpperBoundaryIdentifier();
    
    /**
     * True if has "UpperBoundaryIdentifier" element
     */
    boolean isSetUpperBoundaryIdentifier();
    
    /**
     * Sets the "UpperBoundaryIdentifier" element
     */
    void setUpperBoundaryIdentifier(java.lang.String upperBoundaryIdentifier);
    
    /**
     * Sets (as xml) the "UpperBoundaryIdentifier" element
     */
    void xsetUpperBoundaryIdentifier(com.sap.xi.ap.common.gdt.SearchText upperBoundaryIdentifier);
    
    /**
     * Unsets the "UpperBoundaryIdentifier" element
     */
    void unsetUpperBoundaryIdentifier();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.ap.common.global.SelectionByIdentifier newInstance() {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.ap.common.global.SelectionByIdentifier newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.ap.common.global.SelectionByIdentifier parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.ap.common.global.SelectionByIdentifier parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.ap.common.global.SelectionByIdentifier parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.ap.common.global.SelectionByIdentifier parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.ap.common.global.SelectionByIdentifier parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.ap.common.global.SelectionByIdentifier parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.ap.common.global.SelectionByIdentifier parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.ap.common.global.SelectionByIdentifier parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.ap.common.global.SelectionByIdentifier parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.ap.common.global.SelectionByIdentifier parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.ap.common.global.SelectionByIdentifier parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.ap.common.global.SelectionByIdentifier parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.ap.common.global.SelectionByIdentifier parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.ap.common.global.SelectionByIdentifier parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.global.SelectionByIdentifier parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.global.SelectionByIdentifier parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.global.SelectionByIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
