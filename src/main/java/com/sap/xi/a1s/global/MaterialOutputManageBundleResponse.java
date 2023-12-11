/*
 * XML Type:  MaterialOutputManageBundle_Response
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialOutputManageBundleResponse
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML MaterialOutputManageBundle_Response(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface MaterialOutputManageBundleResponse extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaterialOutputManageBundleResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3516FCF9D95E9E30AE8D4E360678AF8D").resolveHandle("materialoutputmanagebundleresponse9239type");
    
    /**
     * Gets the "MaterialOutputUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getMaterialOutputUUID();
    
    /**
     * True if has "MaterialOutputUUID" element
     */
    boolean isSetMaterialOutputUUID();
    
    /**
     * Sets the "MaterialOutputUUID" element
     */
    void setMaterialOutputUUID(com.sap.xi.ap.common.gdt.UUID materialOutputUUID);
    
    /**
     * Appends and returns a new empty "MaterialOutputUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewMaterialOutputUUID();
    
    /**
     * Unsets the "MaterialOutputUUID" element
     */
    void unsetMaterialOutputUUID();
    
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
     * Gets the "SplitIndicator" element
     */
    boolean getSplitIndicator();
    
    /**
     * Gets (as xml) the "SplitIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetSplitIndicator();
    
    /**
     * True if has "SplitIndicator" element
     */
    boolean isSetSplitIndicator();
    
    /**
     * Sets the "SplitIndicator" element
     */
    void setSplitIndicator(boolean splitIndicator);
    
    /**
     * Sets (as xml) the "SplitIndicator" element
     */
    void xsetSplitIndicator(com.sap.xi.ap.common.gdt.Indicator splitIndicator);
    
    /**
     * Unsets the "SplitIndicator" element
     */
    void unsetSplitIndicator();
    
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
     * Gets the "ConfirmedQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity getConfirmedQuantity();
    
    /**
     * True if has "ConfirmedQuantity" element
     */
    boolean isSetConfirmedQuantity();
    
    /**
     * Sets the "ConfirmedQuantity" element
     */
    void setConfirmedQuantity(com.sap.xi.ap.common.gdt.Quantity confirmedQuantity);
    
    /**
     * Appends and returns a new empty "ConfirmedQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewConfirmedQuantity();
    
    /**
     * Unsets the "ConfirmedQuantity" element
     */
    void unsetConfirmedQuantity();
    
    /**
     * Gets array of all "SerialNumber" elements
     */
    com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest[] getSerialNumberArray();
    
    /**
     * Gets ith "SerialNumber" element
     */
    com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest getSerialNumberArray(int i);
    
    /**
     * Returns number of "SerialNumber" element
     */
    int sizeOfSerialNumberArray();
    
    /**
     * Sets array of all "SerialNumber" element
     */
    void setSerialNumberArray(com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest[] serialNumberArray);
    
    /**
     * Sets ith "SerialNumber" element
     */
    void setSerialNumberArray(int i, com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest serialNumber);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SerialNumber" element
     */
    com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest insertNewSerialNumber(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SerialNumber" element
     */
    com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest addNewSerialNumber();
    
    /**
     * Removes the ith "SerialNumber" element
     */
    void removeSerialNumber(int i);
    
    /**
     * Gets the "ActionCode" attribute
     */
    com.sap.xi.ap.common.gdt.ActionCode.Enum getActionCode();
    
    /**
     * Gets (as xml) the "ActionCode" attribute
     */
    com.sap.xi.ap.common.gdt.ActionCode xgetActionCode();
    
    /**
     * True if has "ActionCode" attribute
     */
    boolean isSetActionCode();
    
    /**
     * Sets the "ActionCode" attribute
     */
    void setActionCode(com.sap.xi.ap.common.gdt.ActionCode.Enum actionCode);
    
    /**
     * Sets (as xml) the "ActionCode" attribute
     */
    void xsetActionCode(com.sap.xi.ap.common.gdt.ActionCode actionCode);
    
    /**
     * Unsets the "ActionCode" attribute
     */
    void unsetActionCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse newInstance() {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialOutputManageBundleResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
