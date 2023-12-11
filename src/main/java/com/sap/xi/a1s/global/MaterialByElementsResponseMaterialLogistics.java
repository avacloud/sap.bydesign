/*
 * XML Type:  MaterialByElementsResponseMaterialLogistics
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML MaterialByElementsResponseMaterialLogistics(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface MaterialByElementsResponseMaterialLogistics extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaterialByElementsResponseMaterialLogistics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B8FAE3D556F3A1A6A1FE3D414B4E0DE").resolveHandle("materialbyelementsresponsemateriallogisticsa194type");
    
    /**
     * Gets the "SiteID" element
     */
    com.sap.xi.ap.common.gdt.LocationID getSiteID();
    
    /**
     * True if has "SiteID" element
     */
    boolean isSetSiteID();
    
    /**
     * Sets the "SiteID" element
     */
    void setSiteID(com.sap.xi.ap.common.gdt.LocationID siteID);
    
    /**
     * Appends and returns a new empty "SiteID" element
     */
    com.sap.xi.ap.common.gdt.LocationID addNewSiteID();
    
    /**
     * Unsets the "SiteID" element
     */
    void unsetSiteID();
    
    /**
     * Gets the "LifeCycleStatusCode" element
     */
    com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum getLifeCycleStatusCode();
    
    /**
     * Gets (as xml) the "LifeCycleStatusCode" element
     */
    com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode xgetLifeCycleStatusCode();
    
    /**
     * True if has "LifeCycleStatusCode" element
     */
    boolean isSetLifeCycleStatusCode();
    
    /**
     * Sets the "LifeCycleStatusCode" element
     */
    void setLifeCycleStatusCode(com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum lifeCycleStatusCode);
    
    /**
     * Sets (as xml) the "LifeCycleStatusCode" element
     */
    void xsetLifeCycleStatusCode(com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode lifeCycleStatusCode);
    
    /**
     * Unsets the "LifeCycleStatusCode" element
     */
    void unsetLifeCycleStatusCode();
    
    /**
     * Gets the "CycleCountPlannedDuration" element
     */
    org.apache.xmlbeans.GDuration getCycleCountPlannedDuration();
    
    /**
     * Gets (as xml) the "CycleCountPlannedDuration" element
     */
    com.sap.xi.ap.common.gdt.DAYDuration xgetCycleCountPlannedDuration();
    
    /**
     * True if has "CycleCountPlannedDuration" element
     */
    boolean isSetCycleCountPlannedDuration();
    
    /**
     * Sets the "CycleCountPlannedDuration" element
     */
    void setCycleCountPlannedDuration(org.apache.xmlbeans.GDuration cycleCountPlannedDuration);
    
    /**
     * Sets (as xml) the "CycleCountPlannedDuration" element
     */
    void xsetCycleCountPlannedDuration(com.sap.xi.ap.common.gdt.DAYDuration cycleCountPlannedDuration);
    
    /**
     * Unsets the "CycleCountPlannedDuration" element
     */
    void unsetCycleCountPlannedDuration();
    
    /**
     * Gets the "ProductionCategoryID" element
     */
    java.lang.String getProductionCategoryID();
    
    /**
     * Gets (as xml) the "ProductionCategoryID" element
     */
    com.sap.xi.ap.common.gdt.ProductCategoryInternalID xgetProductionCategoryID();
    
    /**
     * True if has "ProductionCategoryID" element
     */
    boolean isSetProductionCategoryID();
    
    /**
     * Sets the "ProductionCategoryID" element
     */
    void setProductionCategoryID(java.lang.String productionCategoryID);
    
    /**
     * Sets (as xml) the "ProductionCategoryID" element
     */
    void xsetProductionCategoryID(com.sap.xi.ap.common.gdt.ProductCategoryInternalID productionCategoryID);
    
    /**
     * Unsets the "ProductionCategoryID" element
     */
    void unsetProductionCategoryID();
    
    /**
     * Gets the "StorageCategoryID" element
     */
    java.lang.String getStorageCategoryID();
    
    /**
     * Gets (as xml) the "StorageCategoryID" element
     */
    com.sap.xi.ap.common.gdt.ProductCategoryInternalID xgetStorageCategoryID();
    
    /**
     * True if has "StorageCategoryID" element
     */
    boolean isSetStorageCategoryID();
    
    /**
     * Sets the "StorageCategoryID" element
     */
    void setStorageCategoryID(java.lang.String storageCategoryID);
    
    /**
     * Sets (as xml) the "StorageCategoryID" element
     */
    void xsetStorageCategoryID(com.sap.xi.ap.common.gdt.ProductCategoryInternalID storageCategoryID);
    
    /**
     * Unsets the "StorageCategoryID" element
     */
    void unsetStorageCategoryID();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics newInstance() {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
