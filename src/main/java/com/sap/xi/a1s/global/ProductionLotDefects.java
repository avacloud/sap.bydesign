/*
 * XML Type:  ProductionLotDefects
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotDefects
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ProductionLotDefects(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ProductionLotDefects extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductionLotDefects.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7274E74C1D219A67E80FDE53A95800C").resolveHandle("productionlotdefectsefeetype");
    
    /**
     * Gets the "DefectCode" element
     */
    com.sap.xi.ap.common.gdt.QualityIssueCategoryID getDefectCode();
    
    /**
     * True if has "DefectCode" element
     */
    boolean isSetDefectCode();
    
    /**
     * Sets the "DefectCode" element
     */
    void setDefectCode(com.sap.xi.ap.common.gdt.QualityIssueCategoryID defectCode);
    
    /**
     * Appends and returns a new empty "DefectCode" element
     */
    com.sap.xi.ap.common.gdt.QualityIssueCategoryID addNewDefectCode();
    
    /**
     * Unsets the "DefectCode" element
     */
    void unsetDefectCode();
    
    /**
     * Gets the "DefectName" element
     */
    com.sap.xi.ap.common.gdt.MEDIUMName getDefectName();
    
    /**
     * True if has "DefectName" element
     */
    boolean isSetDefectName();
    
    /**
     * Sets the "DefectName" element
     */
    void setDefectName(com.sap.xi.ap.common.gdt.MEDIUMName defectName);
    
    /**
     * Appends and returns a new empty "DefectName" element
     */
    com.sap.xi.ap.common.gdt.MEDIUMName addNewDefectName();
    
    /**
     * Unsets the "DefectName" element
     */
    void unsetDefectName();
    
    /**
     * Gets the "DefectDescription" element
     */
    com.sap.xi.ap.common.gdt.MEDIUMDescription getDefectDescription();
    
    /**
     * True if has "DefectDescription" element
     */
    boolean isSetDefectDescription();
    
    /**
     * Sets the "DefectDescription" element
     */
    void setDefectDescription(com.sap.xi.ap.common.gdt.MEDIUMDescription defectDescription);
    
    /**
     * Appends and returns a new empty "DefectDescription" element
     */
    com.sap.xi.ap.common.gdt.MEDIUMDescription addNewDefectDescription();
    
    /**
     * Unsets the "DefectDescription" element
     */
    void unsetDefectDescription();
    
    /**
     * Gets the "NumberOfDefects" element
     */
    int getNumberOfDefects();
    
    /**
     * Gets (as xml) the "NumberOfDefects" element
     */
    com.sap.xi.ap.common.gdt.NumberValue xgetNumberOfDefects();
    
    /**
     * True if has "NumberOfDefects" element
     */
    boolean isSetNumberOfDefects();
    
    /**
     * Sets the "NumberOfDefects" element
     */
    void setNumberOfDefects(int numberOfDefects);
    
    /**
     * Sets (as xml) the "NumberOfDefects" element
     */
    void xsetNumberOfDefects(com.sap.xi.ap.common.gdt.NumberValue numberOfDefects);
    
    /**
     * Unsets the "NumberOfDefects" element
     */
    void unsetNumberOfDefects();
    
    /**
     * Gets the "InternalDefects" element
     */
    int getInternalDefects();
    
    /**
     * Gets (as xml) the "InternalDefects" element
     */
    com.sap.xi.ap.common.gdt.NumberValue xgetInternalDefects();
    
    /**
     * True if has "InternalDefects" element
     */
    boolean isSetInternalDefects();
    
    /**
     * Sets the "InternalDefects" element
     */
    void setInternalDefects(int internalDefects);
    
    /**
     * Sets (as xml) the "InternalDefects" element
     */
    void xsetInternalDefects(com.sap.xi.ap.common.gdt.NumberValue internalDefects);
    
    /**
     * Unsets the "InternalDefects" element
     */
    void unsetInternalDefects();
    
    /**
     * Gets the "ChangedOn" element
     */
    java.util.Calendar getChangedOn();
    
    /**
     * Gets (as xml) the "ChangedOn" element
     */
    com.sap.xi.basis.global.GLOBALDateTime xgetChangedOn();
    
    /**
     * True if has "ChangedOn" element
     */
    boolean isSetChangedOn();
    
    /**
     * Sets the "ChangedOn" element
     */
    void setChangedOn(java.util.Calendar changedOn);
    
    /**
     * Sets (as xml) the "ChangedOn" element
     */
    void xsetChangedOn(com.sap.xi.basis.global.GLOBALDateTime changedOn);
    
    /**
     * Unsets the "ChangedOn" element
     */
    void unsetChangedOn();
    
    /**
     * Gets the "ChangedBy" element
     */
    java.lang.String getChangedBy();
    
    /**
     * Gets (as xml) the "ChangedBy" element
     */
    com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName xgetChangedBy();
    
    /**
     * True if has "ChangedBy" element
     */
    boolean isSetChangedBy();
    
    /**
     * Sets the "ChangedBy" element
     */
    void setChangedBy(java.lang.String changedBy);
    
    /**
     * Sets (as xml) the "ChangedBy" element
     */
    void xsetChangedBy(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName changedBy);
    
    /**
     * Unsets the "ChangedBy" element
     */
    void unsetChangedBy();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ProductionLotDefects newInstance() {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotDefects newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ProductionLotDefects parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotDefects parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ProductionLotDefects parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotDefects parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotDefects parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotDefects parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotDefects parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotDefects parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotDefects parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotDefects parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotDefects parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotDefects parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotDefects parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotDefects parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotDefects parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotDefects parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotDefects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
