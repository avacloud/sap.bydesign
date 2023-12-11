/*
 * XML Type:  MaterialByElementsResponseMaterialAvailabilityConfirmation
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML MaterialByElementsResponseMaterialAvailabilityConfirmation(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface MaterialByElementsResponseMaterialAvailabilityConfirmation extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaterialByElementsResponseMaterialAvailabilityConfirmation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B8FAE3D556F3A1A6A1FE3D414B4E0DE").resolveHandle("materialbyelementsresponsematerialavailabilityconfirmation37cbtype");
    
    /**
     * Gets the "PlanningAreaID" element
     */
    com.sap.xi.ap.common.gdt.SupplyPlanningAreaID getPlanningAreaID();
    
    /**
     * True if has "PlanningAreaID" element
     */
    boolean isSetPlanningAreaID();
    
    /**
     * Sets the "PlanningAreaID" element
     */
    void setPlanningAreaID(com.sap.xi.ap.common.gdt.SupplyPlanningAreaID planningAreaID);
    
    /**
     * Appends and returns a new empty "PlanningAreaID" element
     */
    com.sap.xi.ap.common.gdt.SupplyPlanningAreaID addNewPlanningAreaID();
    
    /**
     * Unsets the "PlanningAreaID" element
     */
    void unsetPlanningAreaID();
    
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
     * Gets the "ReplenishmentLeadTimeDuration" element
     */
    org.apache.xmlbeans.GDuration getReplenishmentLeadTimeDuration();
    
    /**
     * Gets (as xml) the "ReplenishmentLeadTimeDuration" element
     */
    com.sap.xi.ap.common.gdt.DAYDuration xgetReplenishmentLeadTimeDuration();
    
    /**
     * True if has "ReplenishmentLeadTimeDuration" element
     */
    boolean isSetReplenishmentLeadTimeDuration();
    
    /**
     * Sets the "ReplenishmentLeadTimeDuration" element
     */
    void setReplenishmentLeadTimeDuration(org.apache.xmlbeans.GDuration replenishmentLeadTimeDuration);
    
    /**
     * Sets (as xml) the "ReplenishmentLeadTimeDuration" element
     */
    void xsetReplenishmentLeadTimeDuration(com.sap.xi.ap.common.gdt.DAYDuration replenishmentLeadTimeDuration);
    
    /**
     * Unsets the "ReplenishmentLeadTimeDuration" element
     */
    void unsetReplenishmentLeadTimeDuration();
    
    /**
     * Gets the "AvailabilityCheckScopeCode" element
     */
    com.sap.xi.ap.common.gdt.AvailabilityConfirmationModeCode getAvailabilityCheckScopeCode();
    
    /**
     * True if has "AvailabilityCheckScopeCode" element
     */
    boolean isSetAvailabilityCheckScopeCode();
    
    /**
     * Sets the "AvailabilityCheckScopeCode" element
     */
    void setAvailabilityCheckScopeCode(com.sap.xi.ap.common.gdt.AvailabilityConfirmationModeCode availabilityCheckScopeCode);
    
    /**
     * Appends and returns a new empty "AvailabilityCheckScopeCode" element
     */
    com.sap.xi.ap.common.gdt.AvailabilityConfirmationModeCode addNewAvailabilityCheckScopeCode();
    
    /**
     * Unsets the "AvailabilityCheckScopeCode" element
     */
    void unsetAvailabilityCheckScopeCode();
    
    /**
     * Gets the "GoodsIssueProcessingDuration" element
     */
    org.apache.xmlbeans.GDuration getGoodsIssueProcessingDuration();
    
    /**
     * Gets (as xml) the "GoodsIssueProcessingDuration" element
     */
    com.sap.xi.ap.common.gdt.TIMEDuration xgetGoodsIssueProcessingDuration();
    
    /**
     * True if has "GoodsIssueProcessingDuration" element
     */
    boolean isSetGoodsIssueProcessingDuration();
    
    /**
     * Sets the "GoodsIssueProcessingDuration" element
     */
    void setGoodsIssueProcessingDuration(org.apache.xmlbeans.GDuration goodsIssueProcessingDuration);
    
    /**
     * Sets (as xml) the "GoodsIssueProcessingDuration" element
     */
    void xsetGoodsIssueProcessingDuration(com.sap.xi.ap.common.gdt.TIMEDuration goodsIssueProcessingDuration);
    
    /**
     * Unsets the "GoodsIssueProcessingDuration" element
     */
    void unsetGoodsIssueProcessingDuration();
    
    /**
     * Gets the "AvailabilityCheckHorizonDuration" element
     */
    org.apache.xmlbeans.GDuration getAvailabilityCheckHorizonDuration();
    
    /**
     * Gets (as xml) the "AvailabilityCheckHorizonDuration" element
     */
    com.sap.xi.ap.common.gdt.DAYDuration xgetAvailabilityCheckHorizonDuration();
    
    /**
     * True if has "AvailabilityCheckHorizonDuration" element
     */
    boolean isSetAvailabilityCheckHorizonDuration();
    
    /**
     * Sets the "AvailabilityCheckHorizonDuration" element
     */
    void setAvailabilityCheckHorizonDuration(org.apache.xmlbeans.GDuration availabilityCheckHorizonDuration);
    
    /**
     * Sets (as xml) the "AvailabilityCheckHorizonDuration" element
     */
    void xsetAvailabilityCheckHorizonDuration(com.sap.xi.ap.common.gdt.DAYDuration availabilityCheckHorizonDuration);
    
    /**
     * Unsets the "AvailabilityCheckHorizonDuration" element
     */
    void unsetAvailabilityCheckHorizonDuration();
    
    /**
     * Gets the "DisableAutomaticShipFromDeterminationIndicator" element
     */
    boolean getDisableAutomaticShipFromDeterminationIndicator();
    
    /**
     * Gets (as xml) the "DisableAutomaticShipFromDeterminationIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetDisableAutomaticShipFromDeterminationIndicator();
    
    /**
     * True if has "DisableAutomaticShipFromDeterminationIndicator" element
     */
    boolean isSetDisableAutomaticShipFromDeterminationIndicator();
    
    /**
     * Sets the "DisableAutomaticShipFromDeterminationIndicator" element
     */
    void setDisableAutomaticShipFromDeterminationIndicator(boolean disableAutomaticShipFromDeterminationIndicator);
    
    /**
     * Sets (as xml) the "DisableAutomaticShipFromDeterminationIndicator" element
     */
    void xsetDisableAutomaticShipFromDeterminationIndicator(com.sap.xi.ap.common.gdt.Indicator disableAutomaticShipFromDeterminationIndicator);
    
    /**
     * Unsets the "DisableAutomaticShipFromDeterminationIndicator" element
     */
    void unsetDisableAutomaticShipFromDeterminationIndicator();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation newInstance() {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
