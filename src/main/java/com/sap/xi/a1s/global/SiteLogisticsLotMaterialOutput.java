/*
 * XML Type:  SiteLogisticsLotMaterialOutput
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML SiteLogisticsLotMaterialOutput(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface SiteLogisticsLotMaterialOutput extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SiteLogisticsLotMaterialOutput.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("sitelogisticslotmaterialoutputf6abtype");
    
    /**
     * Gets the "SiteLogisticsLotMaterialOutputUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getSiteLogisticsLotMaterialOutputUUID();
    
    /**
     * True if has "SiteLogisticsLotMaterialOutputUUID" element
     */
    boolean isSetSiteLogisticsLotMaterialOutputUUID();
    
    /**
     * Sets the "SiteLogisticsLotMaterialOutputUUID" element
     */
    void setSiteLogisticsLotMaterialOutputUUID(com.sap.xi.ap.common.gdt.UUID siteLogisticsLotMaterialOutputUUID);
    
    /**
     * Appends and returns a new empty "SiteLogisticsLotMaterialOutputUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewSiteLogisticsLotMaterialOutputUUID();
    
    /**
     * Unsets the "SiteLogisticsLotMaterialOutputUUID" element
     */
    void unsetSiteLogisticsLotMaterialOutputUUID();
    
    /**
     * Gets the "TargetLogisticsAreaID" element
     */
    java.lang.String getTargetLogisticsAreaID();
    
    /**
     * Gets (as xml) the "TargetLogisticsAreaID" element
     */
    com.sap.xi.ap.common.gdt.LogisticsAreaID xgetTargetLogisticsAreaID();
    
    /**
     * True if has "TargetLogisticsAreaID" element
     */
    boolean isSetTargetLogisticsAreaID();
    
    /**
     * Sets the "TargetLogisticsAreaID" element
     */
    void setTargetLogisticsAreaID(java.lang.String targetLogisticsAreaID);
    
    /**
     * Sets (as xml) the "TargetLogisticsAreaID" element
     */
    void xsetTargetLogisticsAreaID(com.sap.xi.ap.common.gdt.LogisticsAreaID targetLogisticsAreaID);
    
    /**
     * Unsets the "TargetLogisticsAreaID" element
     */
    void unsetTargetLogisticsAreaID();
    
    /**
     * Gets the "ProductID" element
     */
    com.sap.xi.ap.common.gdt.ProductID getProductID();
    
    /**
     * True if has "ProductID" element
     */
    boolean isSetProductID();
    
    /**
     * Sets the "ProductID" element
     */
    void setProductID(com.sap.xi.ap.common.gdt.ProductID productID);
    
    /**
     * Appends and returns a new empty "ProductID" element
     */
    com.sap.xi.ap.common.gdt.ProductID addNewProductID();
    
    /**
     * Unsets the "ProductID" element
     */
    void unsetProductID();
    
    /**
     * Gets the "ProductDescription" element
     */
    com.sap.xi.ap.common.gdt.SHORTDescription getProductDescription();
    
    /**
     * True if has "ProductDescription" element
     */
    boolean isSetProductDescription();
    
    /**
     * Sets the "ProductDescription" element
     */
    void setProductDescription(com.sap.xi.ap.common.gdt.SHORTDescription productDescription);
    
    /**
     * Appends and returns a new empty "ProductDescription" element
     */
    com.sap.xi.ap.common.gdt.SHORTDescription addNewProductDescription();
    
    /**
     * Unsets the "ProductDescription" element
     */
    void unsetProductDescription();
    
    /**
     * Gets the "PlanQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity getPlanQuantity();
    
    /**
     * True if has "PlanQuantity" element
     */
    boolean isSetPlanQuantity();
    
    /**
     * Sets the "PlanQuantity" element
     */
    void setPlanQuantity(com.sap.xi.ap.common.gdt.Quantity planQuantity);
    
    /**
     * Appends and returns a new empty "PlanQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewPlanQuantity();
    
    /**
     * Unsets the "PlanQuantity" element
     */
    void unsetPlanQuantity();
    
    /**
     * Gets the "OpenQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity getOpenQuantity();
    
    /**
     * True if has "OpenQuantity" element
     */
    boolean isSetOpenQuantity();
    
    /**
     * Sets the "OpenQuantity" element
     */
    void setOpenQuantity(com.sap.xi.ap.common.gdt.Quantity openQuantity);
    
    /**
     * Appends and returns a new empty "OpenQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewOpenQuantity();
    
    /**
     * Unsets the "OpenQuantity" element
     */
    void unsetOpenQuantity();
    
    /**
     * Gets the "ConfirmQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity getConfirmQuantity();
    
    /**
     * True if has "ConfirmQuantity" element
     */
    boolean isSetConfirmQuantity();
    
    /**
     * Sets the "ConfirmQuantity" element
     */
    void setConfirmQuantity(com.sap.xi.ap.common.gdt.Quantity confirmQuantity);
    
    /**
     * Appends and returns a new empty "ConfirmQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewConfirmQuantity();
    
    /**
     * Unsets the "ConfirmQuantity" element
     */
    void unsetConfirmQuantity();
    
    /**
     * Gets the "TotalConfirmedQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity getTotalConfirmedQuantity();
    
    /**
     * True if has "TotalConfirmedQuantity" element
     */
    boolean isSetTotalConfirmedQuantity();
    
    /**
     * Sets the "TotalConfirmedQuantity" element
     */
    void setTotalConfirmedQuantity(com.sap.xi.ap.common.gdt.Quantity totalConfirmedQuantity);
    
    /**
     * Appends and returns a new empty "TotalConfirmedQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewTotalConfirmedQuantity();
    
    /**
     * Unsets the "TotalConfirmedQuantity" element
     */
    void unsetTotalConfirmedQuantity();
    
    /**
     * Gets the "IdentifiedStockID" element
     */
    com.sap.xi.ap.common.gdt.IdentifiedStockID getIdentifiedStockID();
    
    /**
     * True if has "IdentifiedStockID" element
     */
    boolean isSetIdentifiedStockID();
    
    /**
     * Sets the "IdentifiedStockID" element
     */
    void setIdentifiedStockID(com.sap.xi.ap.common.gdt.IdentifiedStockID identifiedStockID);
    
    /**
     * Appends and returns a new empty "IdentifiedStockID" element
     */
    com.sap.xi.ap.common.gdt.IdentifiedStockID addNewIdentifiedStockID();
    
    /**
     * Unsets the "IdentifiedStockID" element
     */
    void unsetIdentifiedStockID();
    
    /**
     * Gets the "ProductSpecificationID" element
     */
    com.sap.xi.ap.common.gdt.RequirementSpecificationID getProductSpecificationID();
    
    /**
     * True if has "ProductSpecificationID" element
     */
    boolean isSetProductSpecificationID();
    
    /**
     * Sets the "ProductSpecificationID" element
     */
    void setProductSpecificationID(com.sap.xi.ap.common.gdt.RequirementSpecificationID productSpecificationID);
    
    /**
     * Appends and returns a new empty "ProductSpecificationID" element
     */
    com.sap.xi.ap.common.gdt.RequirementSpecificationID addNewProductSpecificationID();
    
    /**
     * Unsets the "ProductSpecificationID" element
     */
    void unsetProductSpecificationID();
    
    /**
     * Gets the "ProductRequirementSpecificationDescription" element
     */
    com.sap.xi.ap.common.gdt.MEDIUMDescription getProductRequirementSpecificationDescription();
    
    /**
     * True if has "ProductRequirementSpecificationDescription" element
     */
    boolean isSetProductRequirementSpecificationDescription();
    
    /**
     * Sets the "ProductRequirementSpecificationDescription" element
     */
    void setProductRequirementSpecificationDescription(com.sap.xi.ap.common.gdt.MEDIUMDescription productRequirementSpecificationDescription);
    
    /**
     * Appends and returns a new empty "ProductRequirementSpecificationDescription" element
     */
    com.sap.xi.ap.common.gdt.MEDIUMDescription addNewProductRequirementSpecificationDescription();
    
    /**
     * Unsets the "ProductRequirementSpecificationDescription" element
     */
    void unsetProductRequirementSpecificationDescription();
    
    /**
     * Gets the "LogisticsDeviationReasonCode" element
     */
    com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode getLogisticsDeviationReasonCode();
    
    /**
     * True if has "LogisticsDeviationReasonCode" element
     */
    boolean isSetLogisticsDeviationReasonCode();
    
    /**
     * Sets the "LogisticsDeviationReasonCode" element
     */
    void setLogisticsDeviationReasonCode(com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode logisticsDeviationReasonCode);
    
    /**
     * Appends and returns a new empty "LogisticsDeviationReasonCode" element
     */
    com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode addNewLogisticsDeviationReasonCode();
    
    /**
     * Unsets the "LogisticsDeviationReasonCode" element
     */
    void unsetLogisticsDeviationReasonCode();
    
    /**
     * Gets the "MaterialDeviationStatusCode" element
     */
    com.sap.xi.ap.common.gdt.DeviationStatusCode.Enum getMaterialDeviationStatusCode();
    
    /**
     * Gets (as xml) the "MaterialDeviationStatusCode" element
     */
    com.sap.xi.ap.common.gdt.DeviationStatusCode xgetMaterialDeviationStatusCode();
    
    /**
     * True if has "MaterialDeviationStatusCode" element
     */
    boolean isSetMaterialDeviationStatusCode();
    
    /**
     * Sets the "MaterialDeviationStatusCode" element
     */
    void setMaterialDeviationStatusCode(com.sap.xi.ap.common.gdt.DeviationStatusCode.Enum materialDeviationStatusCode);
    
    /**
     * Sets (as xml) the "MaterialDeviationStatusCode" element
     */
    void xsetMaterialDeviationStatusCode(com.sap.xi.ap.common.gdt.DeviationStatusCode materialDeviationStatusCode);
    
    /**
     * Unsets the "MaterialDeviationStatusCode" element
     */
    void unsetMaterialDeviationStatusCode();
    
    /**
     * Gets the "RestrictedIndicator" element
     */
    boolean getRestrictedIndicator();
    
    /**
     * Gets (as xml) the "RestrictedIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetRestrictedIndicator();
    
    /**
     * True if has "RestrictedIndicator" element
     */
    boolean isSetRestrictedIndicator();
    
    /**
     * Sets the "RestrictedIndicator" element
     */
    void setRestrictedIndicator(boolean restrictedIndicator);
    
    /**
     * Sets (as xml) the "RestrictedIndicator" element
     */
    void xsetRestrictedIndicator(com.sap.xi.ap.common.gdt.Indicator restrictedIndicator);
    
    /**
     * Unsets the "RestrictedIndicator" element
     */
    void unsetRestrictedIndicator();
    
    /**
     * Gets the "LineItemID" element
     */
    int getLineItemID();
    
    /**
     * Gets (as xml) the "LineItemID" element
     */
    com.sap.xi.ap.common.gdt.OrdinalNumberValue xgetLineItemID();
    
    /**
     * True if has "LineItemID" element
     */
    boolean isSetLineItemID();
    
    /**
     * Sets the "LineItemID" element
     */
    void setLineItemID(int lineItemID);
    
    /**
     * Sets (as xml) the "LineItemID" element
     */
    void xsetLineItemID(com.sap.xi.ap.common.gdt.OrdinalNumberValue lineItemID);
    
    /**
     * Unsets the "LineItemID" element
     */
    void unsetLineItemID();
    
    /**
     * Gets the "MaterialInspectionID" element
     */
    com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID getMaterialInspectionID();
    
    /**
     * True if has "MaterialInspectionID" element
     */
    boolean isSetMaterialInspectionID();
    
    /**
     * Sets the "MaterialInspectionID" element
     */
    void setMaterialInspectionID(com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID materialInspectionID);
    
    /**
     * Appends and returns a new empty "MaterialInspectionID" element
     */
    com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID addNewMaterialInspectionID();
    
    /**
     * Unsets the "MaterialInspectionID" element
     */
    void unsetMaterialInspectionID();
    
    /**
     * Gets the "MaterialInspectionSkippingStatusCode" element
     */
    com.sap.xi.ap.common.gdt.MaterialInspectionSkippingStatusCode.Enum getMaterialInspectionSkippingStatusCode();
    
    /**
     * Gets (as xml) the "MaterialInspectionSkippingStatusCode" element
     */
    com.sap.xi.ap.common.gdt.MaterialInspectionSkippingStatusCode xgetMaterialInspectionSkippingStatusCode();
    
    /**
     * True if has "MaterialInspectionSkippingStatusCode" element
     */
    boolean isSetMaterialInspectionSkippingStatusCode();
    
    /**
     * Sets the "MaterialInspectionSkippingStatusCode" element
     */
    void setMaterialInspectionSkippingStatusCode(com.sap.xi.ap.common.gdt.MaterialInspectionSkippingStatusCode.Enum materialInspectionSkippingStatusCode);
    
    /**
     * Sets (as xml) the "MaterialInspectionSkippingStatusCode" element
     */
    void xsetMaterialInspectionSkippingStatusCode(com.sap.xi.ap.common.gdt.MaterialInspectionSkippingStatusCode materialInspectionSkippingStatusCode);
    
    /**
     * Unsets the "MaterialInspectionSkippingStatusCode" element
     */
    void unsetMaterialInspectionSkippingStatusCode();
    
    /**
     * Gets the "LogisticPackageOutput" element
     */
    com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput getLogisticPackageOutput();
    
    /**
     * True if has "LogisticPackageOutput" element
     */
    boolean isSetLogisticPackageOutput();
    
    /**
     * Sets the "LogisticPackageOutput" element
     */
    void setLogisticPackageOutput(com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput logisticPackageOutput);
    
    /**
     * Appends and returns a new empty "LogisticPackageOutput" element
     */
    com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput addNewLogisticPackageOutput();
    
    /**
     * Unsets the "LogisticPackageOutput" element
     */
    void unsetLogisticPackageOutput();
    
    /**
     * Gets array of all "SerialNumberAssignment" elements
     */
    com.sap.xi.a1s.global.SiteLogisticsLotSerialNumberAssignment[] getSerialNumberAssignmentArray();
    
    /**
     * Gets ith "SerialNumberAssignment" element
     */
    com.sap.xi.a1s.global.SiteLogisticsLotSerialNumberAssignment getSerialNumberAssignmentArray(int i);
    
    /**
     * Returns number of "SerialNumberAssignment" element
     */
    int sizeOfSerialNumberAssignmentArray();
    
    /**
     * Sets array of all "SerialNumberAssignment" element
     */
    void setSerialNumberAssignmentArray(com.sap.xi.a1s.global.SiteLogisticsLotSerialNumberAssignment[] serialNumberAssignmentArray);
    
    /**
     * Sets ith "SerialNumberAssignment" element
     */
    void setSerialNumberAssignmentArray(int i, com.sap.xi.a1s.global.SiteLogisticsLotSerialNumberAssignment serialNumberAssignment);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SerialNumberAssignment" element
     */
    com.sap.xi.a1s.global.SiteLogisticsLotSerialNumberAssignment insertNewSerialNumberAssignment(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SerialNumberAssignment" element
     */
    com.sap.xi.a1s.global.SiteLogisticsLotSerialNumberAssignment addNewSerialNumberAssignment();
    
    /**
     * Removes the ith "SerialNumberAssignment" element
     */
    void removeSerialNumberAssignment(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput newInstance() {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
