/*
 * XML Type:  MaterialInputResponse
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialInputResponse
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML MaterialInputResponse(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface MaterialInputResponse extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaterialInputResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7274E74C1D219A67E80FDE53A95800C").resolveHandle("materialinputresponse9dc6type");
    
    /**
     * Gets the "MaterialInputUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getMaterialInputUUID();
    
    /**
     * True if has "MaterialInputUUID" element
     */
    boolean isSetMaterialInputUUID();
    
    /**
     * Sets the "MaterialInputUUID" element
     */
    void setMaterialInputUUID(com.sap.xi.ap.common.gdt.UUID materialInputUUID);
    
    /**
     * Appends and returns a new empty "MaterialInputUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewMaterialInputUUID();
    
    /**
     * Unsets the "MaterialInputUUID" element
     */
    void unsetMaterialInputUUID();
    
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
     * Gets the "ProductUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getProductUUID();
    
    /**
     * True if has "ProductUUID" element
     */
    boolean isSetProductUUID();
    
    /**
     * Sets the "ProductUUID" element
     */
    void setProductUUID(com.sap.xi.ap.common.gdt.UUID productUUID);
    
    /**
     * Appends and returns a new empty "ProductUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewProductUUID();
    
    /**
     * Unsets the "ProductUUID" element
     */
    void unsetProductUUID();
    
    /**
     * Gets the "SupplyPlanningArea" element
     */
    com.sap.xi.ap.common.gdt.SupplyPlanningAreaID getSupplyPlanningArea();
    
    /**
     * True if has "SupplyPlanningArea" element
     */
    boolean isSetSupplyPlanningArea();
    
    /**
     * Sets the "SupplyPlanningArea" element
     */
    void setSupplyPlanningArea(com.sap.xi.ap.common.gdt.SupplyPlanningAreaID supplyPlanningArea);
    
    /**
     * Appends and returns a new empty "SupplyPlanningArea" element
     */
    com.sap.xi.ap.common.gdt.SupplyPlanningAreaID addNewSupplyPlanningArea();
    
    /**
     * Unsets the "SupplyPlanningArea" element
     */
    void unsetSupplyPlanningArea();
    
    /**
     * Gets array of all "IdentifiedStockDescription" elements
     */
    com.sap.xi.a1s.global.IdentifiedStockDescription[] getIdentifiedStockDescriptionArray();
    
    /**
     * Gets ith "IdentifiedStockDescription" element
     */
    com.sap.xi.a1s.global.IdentifiedStockDescription getIdentifiedStockDescriptionArray(int i);
    
    /**
     * Returns number of "IdentifiedStockDescription" element
     */
    int sizeOfIdentifiedStockDescriptionArray();
    
    /**
     * Sets array of all "IdentifiedStockDescription" element
     */
    void setIdentifiedStockDescriptionArray(com.sap.xi.a1s.global.IdentifiedStockDescription[] identifiedStockDescriptionArray);
    
    /**
     * Sets ith "IdentifiedStockDescription" element
     */
    void setIdentifiedStockDescriptionArray(int i, com.sap.xi.a1s.global.IdentifiedStockDescription identifiedStockDescription);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentifiedStockDescription" element
     */
    com.sap.xi.a1s.global.IdentifiedStockDescription insertNewIdentifiedStockDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdentifiedStockDescription" element
     */
    com.sap.xi.a1s.global.IdentifiedStockDescription addNewIdentifiedStockDescription();
    
    /**
     * Removes the ith "IdentifiedStockDescription" element
     */
    void removeIdentifiedStockDescription(int i);
    
    /**
     * Gets the "IdentifiedStockType" element
     */
    com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode getIdentifiedStockType();
    
    /**
     * True if has "IdentifiedStockType" element
     */
    boolean isSetIdentifiedStockType();
    
    /**
     * Sets the "IdentifiedStockType" element
     */
    void setIdentifiedStockType(com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode identifiedStockType);
    
    /**
     * Appends and returns a new empty "IdentifiedStockType" element
     */
    com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode addNewIdentifiedStockType();
    
    /**
     * Unsets the "IdentifiedStockType" element
     */
    void unsetIdentifiedStockType();
    
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
     * Gets the "ActivityID" element
     */
    java.lang.String getActivityID();
    
    /**
     * Gets (as xml) the "ActivityID" element
     */
    com.sap.xi.ap.common.gdt.OperationActivityID xgetActivityID();
    
    /**
     * True if has "ActivityID" element
     */
    boolean isSetActivityID();
    
    /**
     * Sets the "ActivityID" element
     */
    void setActivityID(java.lang.String activityID);
    
    /**
     * Sets (as xml) the "ActivityID" element
     */
    void xsetActivityID(com.sap.xi.ap.common.gdt.OperationActivityID activityID);
    
    /**
     * Unsets the "ActivityID" element
     */
    void unsetActivityID();
    
    /**
     * Gets the "ActivityType" element
     */
    com.sap.xi.ap.common.gdt.OperationActivityTypeCode getActivityType();
    
    /**
     * True if has "ActivityType" element
     */
    boolean isSetActivityType();
    
    /**
     * Sets the "ActivityType" element
     */
    void setActivityType(com.sap.xi.ap.common.gdt.OperationActivityTypeCode activityType);
    
    /**
     * Appends and returns a new empty "ActivityType" element
     */
    com.sap.xi.ap.common.gdt.OperationActivityTypeCode addNewActivityType();
    
    /**
     * Unsets the "ActivityType" element
     */
    void unsetActivityType();
    
    /**
     * Gets the "ActivityUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getActivityUUID();
    
    /**
     * True if has "ActivityUUID" element
     */
    boolean isSetActivityUUID();
    
    /**
     * Sets the "ActivityUUID" element
     */
    void setActivityUUID(com.sap.xi.ap.common.gdt.UUID activityUUID);
    
    /**
     * Appends and returns a new empty "ActivityUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewActivityUUID();
    
    /**
     * Unsets the "ActivityUUID" element
     */
    void unsetActivityUUID();
    
    /**
     * Gets the "ConfirmLogisticsAreaID" element
     */
    java.lang.String getConfirmLogisticsAreaID();
    
    /**
     * Gets (as xml) the "ConfirmLogisticsAreaID" element
     */
    com.sap.xi.ap.common.gdt.LogisticsAreaID xgetConfirmLogisticsAreaID();
    
    /**
     * True if has "ConfirmLogisticsAreaID" element
     */
    boolean isSetConfirmLogisticsAreaID();
    
    /**
     * Sets the "ConfirmLogisticsAreaID" element
     */
    void setConfirmLogisticsAreaID(java.lang.String confirmLogisticsAreaID);
    
    /**
     * Sets (as xml) the "ConfirmLogisticsAreaID" element
     */
    void xsetConfirmLogisticsAreaID(com.sap.xi.ap.common.gdt.LogisticsAreaID confirmLogisticsAreaID);
    
    /**
     * Unsets the "ConfirmLogisticsAreaID" element
     */
    void unsetConfirmLogisticsAreaID();
    
    /**
     * Gets the "ConfirmationMethodCode" element
     */
    java.lang.String getConfirmationMethodCode();
    
    /**
     * Gets (as xml) the "ConfirmationMethodCode" element
     */
    com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode xgetConfirmationMethodCode();
    
    /**
     * True if has "ConfirmationMethodCode" element
     */
    boolean isSetConfirmationMethodCode();
    
    /**
     * Sets the "ConfirmationMethodCode" element
     */
    void setConfirmationMethodCode(java.lang.String confirmationMethodCode);
    
    /**
     * Sets (as xml) the "ConfirmationMethodCode" element
     */
    void xsetConfirmationMethodCode(com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode confirmationMethodCode);
    
    /**
     * Unsets the "ConfirmationMethodCode" element
     */
    void unsetConfirmationMethodCode();
    
    /**
     * Gets the "ConfirmationFinished" element
     */
    boolean getConfirmationFinished();
    
    /**
     * Gets (as xml) the "ConfirmationFinished" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetConfirmationFinished();
    
    /**
     * True if has "ConfirmationFinished" element
     */
    boolean isSetConfirmationFinished();
    
    /**
     * Sets the "ConfirmationFinished" element
     */
    void setConfirmationFinished(boolean confirmationFinished);
    
    /**
     * Sets (as xml) the "ConfirmationFinished" element
     */
    void xsetConfirmationFinished(com.sap.xi.ap.common.gdt.Indicator confirmationFinished);
    
    /**
     * Unsets the "ConfirmationFinished" element
     */
    void unsetConfirmationFinished();
    
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
     * Gets array of all "ProductSpecificationDescription" elements
     */
    com.sap.xi.a1s.global.ProductSpecification[] getProductSpecificationDescriptionArray();
    
    /**
     * Gets ith "ProductSpecificationDescription" element
     */
    com.sap.xi.a1s.global.ProductSpecification getProductSpecificationDescriptionArray(int i);
    
    /**
     * Returns number of "ProductSpecificationDescription" element
     */
    int sizeOfProductSpecificationDescriptionArray();
    
    /**
     * Sets array of all "ProductSpecificationDescription" element
     */
    void setProductSpecificationDescriptionArray(com.sap.xi.a1s.global.ProductSpecification[] productSpecificationDescriptionArray);
    
    /**
     * Sets ith "ProductSpecificationDescription" element
     */
    void setProductSpecificationDescriptionArray(int i, com.sap.xi.a1s.global.ProductSpecification productSpecificationDescription);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductSpecificationDescription" element
     */
    com.sap.xi.a1s.global.ProductSpecification insertNewProductSpecificationDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductSpecificationDescription" element
     */
    com.sap.xi.a1s.global.ProductSpecification addNewProductSpecificationDescription();
    
    /**
     * Removes the ith "ProductSpecificationDescription" element
     */
    void removeProductSpecificationDescription(int i);
    
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
     * Gets the "LineItemGroupID" element
     */
    java.lang.String getLineItemGroupID();
    
    /**
     * Gets (as xml) the "LineItemGroupID" element
     */
    com.sap.xi.ap.common.gdt.BillOfMaterialItemGroupID xgetLineItemGroupID();
    
    /**
     * True if has "LineItemGroupID" element
     */
    boolean isSetLineItemGroupID();
    
    /**
     * Sets the "LineItemGroupID" element
     */
    void setLineItemGroupID(java.lang.String lineItemGroupID);
    
    /**
     * Sets (as xml) the "LineItemGroupID" element
     */
    void xsetLineItemGroupID(com.sap.xi.ap.common.gdt.BillOfMaterialItemGroupID lineItemGroupID);
    
    /**
     * Unsets the "LineItemGroupID" element
     */
    void unsetLineItemGroupID();
    
    /**
     * Gets the "PlannedQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity getPlannedQuantity();
    
    /**
     * True if has "PlannedQuantity" element
     */
    boolean isSetPlannedQuantity();
    
    /**
     * Sets the "PlannedQuantity" element
     */
    void setPlannedQuantity(com.sap.xi.ap.common.gdt.Quantity plannedQuantity);
    
    /**
     * Appends and returns a new empty "PlannedQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewPlannedQuantity();
    
    /**
     * Unsets the "PlannedQuantity" element
     */
    void unsetPlannedQuantity();
    
    /**
     * Gets the "OperationID" element
     */
    java.lang.String getOperationID();
    
    /**
     * Gets (as xml) the "OperationID" element
     */
    com.sap.xi.ap.common.gdt.OperationID xgetOperationID();
    
    /**
     * True if has "OperationID" element
     */
    boolean isSetOperationID();
    
    /**
     * Sets the "OperationID" element
     */
    void setOperationID(java.lang.String operationID);
    
    /**
     * Sets (as xml) the "OperationID" element
     */
    void xsetOperationID(com.sap.xi.ap.common.gdt.OperationID operationID);
    
    /**
     * Unsets the "OperationID" element
     */
    void unsetOperationID();
    
    /**
     * Gets the "SourceLogisticsAreaID" element
     */
    java.lang.String getSourceLogisticsAreaID();
    
    /**
     * Gets (as xml) the "SourceLogisticsAreaID" element
     */
    com.sap.xi.ap.common.gdt.LogisticsAreaID xgetSourceLogisticsAreaID();
    
    /**
     * True if has "SourceLogisticsAreaID" element
     */
    boolean isSetSourceLogisticsAreaID();
    
    /**
     * Sets the "SourceLogisticsAreaID" element
     */
    void setSourceLogisticsAreaID(java.lang.String sourceLogisticsAreaID);
    
    /**
     * Sets (as xml) the "SourceLogisticsAreaID" element
     */
    void xsetSourceLogisticsAreaID(com.sap.xi.ap.common.gdt.LogisticsAreaID sourceLogisticsAreaID);
    
    /**
     * Unsets the "SourceLogisticsAreaID" element
     */
    void unsetSourceLogisticsAreaID();
    
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
     * Gets array of all "SiteDescription" elements
     */
    com.sap.xi.a1s.global.SiteDescription[] getSiteDescriptionArray();
    
    /**
     * Gets ith "SiteDescription" element
     */
    com.sap.xi.a1s.global.SiteDescription getSiteDescriptionArray(int i);
    
    /**
     * Returns number of "SiteDescription" element
     */
    int sizeOfSiteDescriptionArray();
    
    /**
     * Sets array of all "SiteDescription" element
     */
    void setSiteDescriptionArray(com.sap.xi.a1s.global.SiteDescription[] siteDescriptionArray);
    
    /**
     * Sets ith "SiteDescription" element
     */
    void setSiteDescriptionArray(int i, com.sap.xi.a1s.global.SiteDescription siteDescription);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SiteDescription" element
     */
    com.sap.xi.a1s.global.SiteDescription insertNewSiteDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SiteDescription" element
     */
    com.sap.xi.a1s.global.SiteDescription addNewSiteDescription();
    
    /**
     * Removes the ith "SiteDescription" element
     */
    void removeSiteDescription(int i);
    
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
     * Gets the "PlannedIndicator" element
     */
    boolean getPlannedIndicator();
    
    /**
     * Gets (as xml) the "PlannedIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetPlannedIndicator();
    
    /**
     * True if has "PlannedIndicator" element
     */
    boolean isSetPlannedIndicator();
    
    /**
     * Sets the "PlannedIndicator" element
     */
    void setPlannedIndicator(boolean plannedIndicator);
    
    /**
     * Sets (as xml) the "PlannedIndicator" element
     */
    void xsetPlannedIndicator(com.sap.xi.ap.common.gdt.Indicator plannedIndicator);
    
    /**
     * Unsets the "PlannedIndicator" element
     */
    void unsetPlannedIndicator();
    
    /**
     * Gets the "InputProductQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity getInputProductQuantity();
    
    /**
     * True if has "InputProductQuantity" element
     */
    boolean isSetInputProductQuantity();
    
    /**
     * Sets the "InputProductQuantity" element
     */
    void setInputProductQuantity(com.sap.xi.ap.common.gdt.Quantity inputProductQuantity);
    
    /**
     * Appends and returns a new empty "InputProductQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewInputProductQuantity();
    
    /**
     * Unsets the "InputProductQuantity" element
     */
    void unsetInputProductQuantity();
    
    /**
     * Gets array of all "SerialNumber" elements
     */
    com.sap.xi.a1s.global.ProductionLotSerialNumberAssignment[] getSerialNumberArray();
    
    /**
     * Gets ith "SerialNumber" element
     */
    com.sap.xi.a1s.global.ProductionLotSerialNumberAssignment getSerialNumberArray(int i);
    
    /**
     * Returns number of "SerialNumber" element
     */
    int sizeOfSerialNumberArray();
    
    /**
     * Sets array of all "SerialNumber" element
     */
    void setSerialNumberArray(com.sap.xi.a1s.global.ProductionLotSerialNumberAssignment[] serialNumberArray);
    
    /**
     * Sets ith "SerialNumber" element
     */
    void setSerialNumberArray(int i, com.sap.xi.a1s.global.ProductionLotSerialNumberAssignment serialNumber);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SerialNumber" element
     */
    com.sap.xi.a1s.global.ProductionLotSerialNumberAssignment insertNewSerialNumber(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SerialNumber" element
     */
    com.sap.xi.a1s.global.ProductionLotSerialNumberAssignment addNewSerialNumber();
    
    /**
     * Removes the ith "SerialNumber" element
     */
    void removeSerialNumber(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.MaterialInputResponse newInstance() {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialInputResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.MaterialInputResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialInputResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.MaterialInputResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialInputResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialInputResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialInputResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialInputResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialInputResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialInputResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialInputResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialInputResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialInputResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialInputResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialInputResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialInputResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialInputResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialInputResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
