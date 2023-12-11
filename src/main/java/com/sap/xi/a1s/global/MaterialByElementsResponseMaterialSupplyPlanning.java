/*
 * XML Type:  MaterialByElementsResponseMaterialSupplyPlanning
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML MaterialByElementsResponseMaterialSupplyPlanning(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface MaterialByElementsResponseMaterialSupplyPlanning extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaterialByElementsResponseMaterialSupplyPlanning.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B8FAE3D556F3A1A6A1FE3D414B4E0DE").resolveHandle("materialbyelementsresponsematerialsupplyplanning218ftype");
    
    /**
     * Gets the "SupplyPlanningCategoryID" element
     */
    java.lang.String getSupplyPlanningCategoryID();
    
    /**
     * Gets (as xml) the "SupplyPlanningCategoryID" element
     */
    com.sap.xi.ap.common.gdt.ProductCategoryInternalID xgetSupplyPlanningCategoryID();
    
    /**
     * True if has "SupplyPlanningCategoryID" element
     */
    boolean isSetSupplyPlanningCategoryID();
    
    /**
     * Sets the "SupplyPlanningCategoryID" element
     */
    void setSupplyPlanningCategoryID(java.lang.String supplyPlanningCategoryID);
    
    /**
     * Sets (as xml) the "SupplyPlanningCategoryID" element
     */
    void xsetSupplyPlanningCategoryID(com.sap.xi.ap.common.gdt.ProductCategoryInternalID supplyPlanningCategoryID);
    
    /**
     * Unsets the "SupplyPlanningCategoryID" element
     */
    void unsetSupplyPlanningCategoryID();
    
    /**
     * Gets the "SupplyPlanningAreaID" element
     */
    com.sap.xi.ap.common.gdt.SupplyPlanningAreaID getSupplyPlanningAreaID();
    
    /**
     * True if has "SupplyPlanningAreaID" element
     */
    boolean isSetSupplyPlanningAreaID();
    
    /**
     * Sets the "SupplyPlanningAreaID" element
     */
    void setSupplyPlanningAreaID(com.sap.xi.ap.common.gdt.SupplyPlanningAreaID supplyPlanningAreaID);
    
    /**
     * Appends and returns a new empty "SupplyPlanningAreaID" element
     */
    com.sap.xi.ap.common.gdt.SupplyPlanningAreaID addNewSupplyPlanningAreaID();
    
    /**
     * Unsets the "SupplyPlanningAreaID" element
     */
    void unsetSupplyPlanningAreaID();
    
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
     * Gets the "ProcurementTypeCode" element
     */
    java.lang.String getProcurementTypeCode();
    
    /**
     * Gets (as xml) the "ProcurementTypeCode" element
     */
    com.sap.xi.ap.common.gdt.ProcurementMethodCode xgetProcurementTypeCode();
    
    /**
     * True if has "ProcurementTypeCode" element
     */
    boolean isSetProcurementTypeCode();
    
    /**
     * Sets the "ProcurementTypeCode" element
     */
    void setProcurementTypeCode(java.lang.String procurementTypeCode);
    
    /**
     * Sets (as xml) the "ProcurementTypeCode" element
     */
    void xsetProcurementTypeCode(com.sap.xi.ap.common.gdt.ProcurementMethodCode procurementTypeCode);
    
    /**
     * Unsets the "ProcurementTypeCode" element
     */
    void unsetProcurementTypeCode();
    
    /**
     * Gets the "PlanningTimeFenceDuration" element
     */
    org.apache.xmlbeans.GDuration getPlanningTimeFenceDuration();
    
    /**
     * Gets (as xml) the "PlanningTimeFenceDuration" element
     */
    com.sap.xi.ap.common.gdt.DAYDuration xgetPlanningTimeFenceDuration();
    
    /**
     * True if has "PlanningTimeFenceDuration" element
     */
    boolean isSetPlanningTimeFenceDuration();
    
    /**
     * Sets the "PlanningTimeFenceDuration" element
     */
    void setPlanningTimeFenceDuration(org.apache.xmlbeans.GDuration planningTimeFenceDuration);
    
    /**
     * Sets (as xml) the "PlanningTimeFenceDuration" element
     */
    void xsetPlanningTimeFenceDuration(com.sap.xi.ap.common.gdt.DAYDuration planningTimeFenceDuration);
    
    /**
     * Unsets the "PlanningTimeFenceDuration" element
     */
    void unsetPlanningTimeFenceDuration();
    
    /**
     * Gets the "PlanningProcedureCode" element
     */
    java.lang.String getPlanningProcedureCode();
    
    /**
     * Gets (as xml) the "PlanningProcedureCode" element
     */
    com.sap.xi.ap.common.gdt.SupplyPlanningProcedureCode xgetPlanningProcedureCode();
    
    /**
     * True if has "PlanningProcedureCode" element
     */
    boolean isSetPlanningProcedureCode();
    
    /**
     * Sets the "PlanningProcedureCode" element
     */
    void setPlanningProcedureCode(java.lang.String planningProcedureCode);
    
    /**
     * Sets (as xml) the "PlanningProcedureCode" element
     */
    void xsetPlanningProcedureCode(com.sap.xi.ap.common.gdt.SupplyPlanningProcedureCode planningProcedureCode);
    
    /**
     * Unsets the "PlanningProcedureCode" element
     */
    void unsetPlanningProcedureCode();
    
    /**
     * Gets the "LotSizeProcedureCode" element
     */
    java.lang.String getLotSizeProcedureCode();
    
    /**
     * Gets (as xml) the "LotSizeProcedureCode" element
     */
    com.sap.xi.ap.common.gdt.LotSizeProcedureCode xgetLotSizeProcedureCode();
    
    /**
     * True if has "LotSizeProcedureCode" element
     */
    boolean isSetLotSizeProcedureCode();
    
    /**
     * Sets the "LotSizeProcedureCode" element
     */
    void setLotSizeProcedureCode(java.lang.String lotSizeProcedureCode);
    
    /**
     * Sets (as xml) the "LotSizeProcedureCode" element
     */
    void xsetLotSizeProcedureCode(com.sap.xi.ap.common.gdt.LotSizeProcedureCode lotSizeProcedureCode);
    
    /**
     * Unsets the "LotSizeProcedureCode" element
     */
    void unsetLotSizeProcedureCode();
    
    /**
     * Gets the "FixedLotSizeQuantityValue" element
     */
    java.math.BigDecimal getFixedLotSizeQuantityValue();
    
    /**
     * Gets (as xml) the "FixedLotSizeQuantityValue" element
     */
    com.sap.xi.ap.common.gdt.DecimalValue xgetFixedLotSizeQuantityValue();
    
    /**
     * True if has "FixedLotSizeQuantityValue" element
     */
    boolean isSetFixedLotSizeQuantityValue();
    
    /**
     * Sets the "FixedLotSizeQuantityValue" element
     */
    void setFixedLotSizeQuantityValue(java.math.BigDecimal fixedLotSizeQuantityValue);
    
    /**
     * Sets (as xml) the "FixedLotSizeQuantityValue" element
     */
    void xsetFixedLotSizeQuantityValue(com.sap.xi.ap.common.gdt.DecimalValue fixedLotSizeQuantityValue);
    
    /**
     * Unsets the "FixedLotSizeQuantityValue" element
     */
    void unsetFixedLotSizeQuantityValue();
    
    /**
     * Gets the "PeriodTypeCode" element
     */
    java.lang.String getPeriodTypeCode();
    
    /**
     * Gets (as xml) the "PeriodTypeCode" element
     */
    com.sap.xi.ap.common.gdt.CalendarUnitCode xgetPeriodTypeCode();
    
    /**
     * True if has "PeriodTypeCode" element
     */
    boolean isSetPeriodTypeCode();
    
    /**
     * Sets the "PeriodTypeCode" element
     */
    void setPeriodTypeCode(java.lang.String periodTypeCode);
    
    /**
     * Sets (as xml) the "PeriodTypeCode" element
     */
    void xsetPeriodTypeCode(com.sap.xi.ap.common.gdt.CalendarUnitCode periodTypeCode);
    
    /**
     * Unsets the "PeriodTypeCode" element
     */
    void unsetPeriodTypeCode();
    
    /**
     * Gets the "ReOrderQuantityValue" element
     */
    java.math.BigDecimal getReOrderQuantityValue();
    
    /**
     * Gets (as xml) the "ReOrderQuantityValue" element
     */
    com.sap.xi.ap.common.gdt.DecimalValue xgetReOrderQuantityValue();
    
    /**
     * True if has "ReOrderQuantityValue" element
     */
    boolean isSetReOrderQuantityValue();
    
    /**
     * Sets the "ReOrderQuantityValue" element
     */
    void setReOrderQuantityValue(java.math.BigDecimal reOrderQuantityValue);
    
    /**
     * Sets (as xml) the "ReOrderQuantityValue" element
     */
    void xsetReOrderQuantityValue(com.sap.xi.ap.common.gdt.DecimalValue reOrderQuantityValue);
    
    /**
     * Unsets the "ReOrderQuantityValue" element
     */
    void unsetReOrderQuantityValue();
    
    /**
     * Gets the "TargetStockQuantityValue" element
     */
    java.math.BigDecimal getTargetStockQuantityValue();
    
    /**
     * Gets (as xml) the "TargetStockQuantityValue" element
     */
    com.sap.xi.ap.common.gdt.DecimalValue xgetTargetStockQuantityValue();
    
    /**
     * True if has "TargetStockQuantityValue" element
     */
    boolean isSetTargetStockQuantityValue();
    
    /**
     * Sets the "TargetStockQuantityValue" element
     */
    void setTargetStockQuantityValue(java.math.BigDecimal targetStockQuantityValue);
    
    /**
     * Sets (as xml) the "TargetStockQuantityValue" element
     */
    void xsetTargetStockQuantityValue(com.sap.xi.ap.common.gdt.DecimalValue targetStockQuantityValue);
    
    /**
     * Unsets the "TargetStockQuantityValue" element
     */
    void unsetTargetStockQuantityValue();
    
    /**
     * Gets the "TargetDaysOfSupplyDuration" element
     */
    org.apache.xmlbeans.GDuration getTargetDaysOfSupplyDuration();
    
    /**
     * Gets (as xml) the "TargetDaysOfSupplyDuration" element
     */
    com.sap.xi.ap.common.gdt.DAYDuration xgetTargetDaysOfSupplyDuration();
    
    /**
     * True if has "TargetDaysOfSupplyDuration" element
     */
    boolean isSetTargetDaysOfSupplyDuration();
    
    /**
     * Sets the "TargetDaysOfSupplyDuration" element
     */
    void setTargetDaysOfSupplyDuration(org.apache.xmlbeans.GDuration targetDaysOfSupplyDuration);
    
    /**
     * Sets (as xml) the "TargetDaysOfSupplyDuration" element
     */
    void xsetTargetDaysOfSupplyDuration(com.sap.xi.ap.common.gdt.DAYDuration targetDaysOfSupplyDuration);
    
    /**
     * Unsets the "TargetDaysOfSupplyDuration" element
     */
    void unsetTargetDaysOfSupplyDuration();
    
    /**
     * Gets the "SafetyStockQuantityValue" element
     */
    java.math.BigDecimal getSafetyStockQuantityValue();
    
    /**
     * Gets (as xml) the "SafetyStockQuantityValue" element
     */
    com.sap.xi.ap.common.gdt.DecimalValue xgetSafetyStockQuantityValue();
    
    /**
     * True if has "SafetyStockQuantityValue" element
     */
    boolean isSetSafetyStockQuantityValue();
    
    /**
     * Sets the "SafetyStockQuantityValue" element
     */
    void setSafetyStockQuantityValue(java.math.BigDecimal safetyStockQuantityValue);
    
    /**
     * Sets (as xml) the "SafetyStockQuantityValue" element
     */
    void xsetSafetyStockQuantityValue(com.sap.xi.ap.common.gdt.DecimalValue safetyStockQuantityValue);
    
    /**
     * Unsets the "SafetyStockQuantityValue" element
     */
    void unsetSafetyStockQuantityValue();
    
    /**
     * Gets the "SafetyDaysOfSupplyDuration" element
     */
    org.apache.xmlbeans.GDuration getSafetyDaysOfSupplyDuration();
    
    /**
     * Gets (as xml) the "SafetyDaysOfSupplyDuration" element
     */
    com.sap.xi.ap.common.gdt.DAYDuration xgetSafetyDaysOfSupplyDuration();
    
    /**
     * True if has "SafetyDaysOfSupplyDuration" element
     */
    boolean isSetSafetyDaysOfSupplyDuration();
    
    /**
     * Sets the "SafetyDaysOfSupplyDuration" element
     */
    void setSafetyDaysOfSupplyDuration(org.apache.xmlbeans.GDuration safetyDaysOfSupplyDuration);
    
    /**
     * Sets (as xml) the "SafetyDaysOfSupplyDuration" element
     */
    void xsetSafetyDaysOfSupplyDuration(com.sap.xi.ap.common.gdt.DAYDuration safetyDaysOfSupplyDuration);
    
    /**
     * Unsets the "SafetyDaysOfSupplyDuration" element
     */
    void unsetSafetyDaysOfSupplyDuration();
    
    /**
     * Gets the "LotSizeRoundingQuantityValue" element
     */
    java.math.BigDecimal getLotSizeRoundingQuantityValue();
    
    /**
     * Gets (as xml) the "LotSizeRoundingQuantityValue" element
     */
    com.sap.xi.ap.common.gdt.DecimalValue xgetLotSizeRoundingQuantityValue();
    
    /**
     * True if has "LotSizeRoundingQuantityValue" element
     */
    boolean isSetLotSizeRoundingQuantityValue();
    
    /**
     * Sets the "LotSizeRoundingQuantityValue" element
     */
    void setLotSizeRoundingQuantityValue(java.math.BigDecimal lotSizeRoundingQuantityValue);
    
    /**
     * Sets (as xml) the "LotSizeRoundingQuantityValue" element
     */
    void xsetLotSizeRoundingQuantityValue(com.sap.xi.ap.common.gdt.DecimalValue lotSizeRoundingQuantityValue);
    
    /**
     * Unsets the "LotSizeRoundingQuantityValue" element
     */
    void unsetLotSizeRoundingQuantityValue();
    
    /**
     * Gets the "MinimumLotSizeQuantityValue" element
     */
    java.math.BigDecimal getMinimumLotSizeQuantityValue();
    
    /**
     * Gets (as xml) the "MinimumLotSizeQuantityValue" element
     */
    com.sap.xi.ap.common.gdt.DecimalValue xgetMinimumLotSizeQuantityValue();
    
    /**
     * True if has "MinimumLotSizeQuantityValue" element
     */
    boolean isSetMinimumLotSizeQuantityValue();
    
    /**
     * Sets the "MinimumLotSizeQuantityValue" element
     */
    void setMinimumLotSizeQuantityValue(java.math.BigDecimal minimumLotSizeQuantityValue);
    
    /**
     * Sets (as xml) the "MinimumLotSizeQuantityValue" element
     */
    void xsetMinimumLotSizeQuantityValue(com.sap.xi.ap.common.gdt.DecimalValue minimumLotSizeQuantityValue);
    
    /**
     * Unsets the "MinimumLotSizeQuantityValue" element
     */
    void unsetMinimumLotSizeQuantityValue();
    
    /**
     * Gets the "MaximumLotSizeQuantityValue" element
     */
    java.math.BigDecimal getMaximumLotSizeQuantityValue();
    
    /**
     * Gets (as xml) the "MaximumLotSizeQuantityValue" element
     */
    com.sap.xi.ap.common.gdt.DecimalValue xgetMaximumLotSizeQuantityValue();
    
    /**
     * True if has "MaximumLotSizeQuantityValue" element
     */
    boolean isSetMaximumLotSizeQuantityValue();
    
    /**
     * Sets the "MaximumLotSizeQuantityValue" element
     */
    void setMaximumLotSizeQuantityValue(java.math.BigDecimal maximumLotSizeQuantityValue);
    
    /**
     * Sets (as xml) the "MaximumLotSizeQuantityValue" element
     */
    void xsetMaximumLotSizeQuantityValue(com.sap.xi.ap.common.gdt.DecimalValue maximumLotSizeQuantityValue);
    
    /**
     * Unsets the "MaximumLotSizeQuantityValue" element
     */
    void unsetMaximumLotSizeQuantityValue();
    
    /**
     * Gets the "DemandManagementProcedureCode" element
     */
    com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode getDemandManagementProcedureCode();
    
    /**
     * True if has "DemandManagementProcedureCode" element
     */
    boolean isSetDemandManagementProcedureCode();
    
    /**
     * Sets the "DemandManagementProcedureCode" element
     */
    void setDemandManagementProcedureCode(com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode demandManagementProcedureCode);
    
    /**
     * Appends and returns a new empty "DemandManagementProcedureCode" element
     */
    com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode addNewDemandManagementProcedureCode();
    
    /**
     * Unsets the "DemandManagementProcedureCode" element
     */
    void unsetDemandManagementProcedureCode();
    
    /**
     * Gets the "PlannedDeliveryDuration" element
     */
    org.apache.xmlbeans.GDuration getPlannedDeliveryDuration();
    
    /**
     * Gets (as xml) the "PlannedDeliveryDuration" element
     */
    com.sap.xi.ap.common.gdt.DAYDuration xgetPlannedDeliveryDuration();
    
    /**
     * True if has "PlannedDeliveryDuration" element
     */
    boolean isSetPlannedDeliveryDuration();
    
    /**
     * Sets the "PlannedDeliveryDuration" element
     */
    void setPlannedDeliveryDuration(org.apache.xmlbeans.GDuration plannedDeliveryDuration);
    
    /**
     * Sets (as xml) the "PlannedDeliveryDuration" element
     */
    void xsetPlannedDeliveryDuration(com.sap.xi.ap.common.gdt.DAYDuration plannedDeliveryDuration);
    
    /**
     * Unsets the "PlannedDeliveryDuration" element
     */
    void unsetPlannedDeliveryDuration();
    
    /**
     * Gets the "GoodsReceiptProcessingDuration" element
     */
    org.apache.xmlbeans.GDuration getGoodsReceiptProcessingDuration();
    
    /**
     * Gets (as xml) the "GoodsReceiptProcessingDuration" element
     */
    com.sap.xi.ap.common.gdt.TIMEDuration xgetGoodsReceiptProcessingDuration();
    
    /**
     * True if has "GoodsReceiptProcessingDuration" element
     */
    boolean isSetGoodsReceiptProcessingDuration();
    
    /**
     * Sets the "GoodsReceiptProcessingDuration" element
     */
    void setGoodsReceiptProcessingDuration(org.apache.xmlbeans.GDuration goodsReceiptProcessingDuration);
    
    /**
     * Sets (as xml) the "GoodsReceiptProcessingDuration" element
     */
    void xsetGoodsReceiptProcessingDuration(com.sap.xi.ap.common.gdt.TIMEDuration goodsReceiptProcessingDuration);
    
    /**
     * Unsets the "GoodsReceiptProcessingDuration" element
     */
    void unsetGoodsReceiptProcessingDuration();
    
    /**
     * Gets the "MinimumDaysOfSupplyDuration" element
     */
    org.apache.xmlbeans.GDuration getMinimumDaysOfSupplyDuration();
    
    /**
     * Gets (as xml) the "MinimumDaysOfSupplyDuration" element
     */
    com.sap.xi.ap.common.gdt.DAYDuration xgetMinimumDaysOfSupplyDuration();
    
    /**
     * True if has "MinimumDaysOfSupplyDuration" element
     */
    boolean isSetMinimumDaysOfSupplyDuration();
    
    /**
     * Sets the "MinimumDaysOfSupplyDuration" element
     */
    void setMinimumDaysOfSupplyDuration(org.apache.xmlbeans.GDuration minimumDaysOfSupplyDuration);
    
    /**
     * Sets (as xml) the "MinimumDaysOfSupplyDuration" element
     */
    void xsetMinimumDaysOfSupplyDuration(com.sap.xi.ap.common.gdt.DAYDuration minimumDaysOfSupplyDuration);
    
    /**
     * Unsets the "MinimumDaysOfSupplyDuration" element
     */
    void unsetMinimumDaysOfSupplyDuration();
    
    /**
     * Gets the "MinimumReceiptDaysOfSupplyDuration" element
     */
    org.apache.xmlbeans.GDuration getMinimumReceiptDaysOfSupplyDuration();
    
    /**
     * Gets (as xml) the "MinimumReceiptDaysOfSupplyDuration" element
     */
    com.sap.xi.ap.common.gdt.DAYDuration xgetMinimumReceiptDaysOfSupplyDuration();
    
    /**
     * True if has "MinimumReceiptDaysOfSupplyDuration" element
     */
    boolean isSetMinimumReceiptDaysOfSupplyDuration();
    
    /**
     * Sets the "MinimumReceiptDaysOfSupplyDuration" element
     */
    void setMinimumReceiptDaysOfSupplyDuration(org.apache.xmlbeans.GDuration minimumReceiptDaysOfSupplyDuration);
    
    /**
     * Sets (as xml) the "MinimumReceiptDaysOfSupplyDuration" element
     */
    void xsetMinimumReceiptDaysOfSupplyDuration(com.sap.xi.ap.common.gdt.DAYDuration minimumReceiptDaysOfSupplyDuration);
    
    /**
     * Unsets the "MinimumReceiptDaysOfSupplyDuration" element
     */
    void unsetMinimumReceiptDaysOfSupplyDuration();
    
    /**
     * Gets the "MinShelfLifeDuration" element
     */
    org.apache.xmlbeans.GDuration getMinShelfLifeDuration();
    
    /**
     * Gets (as xml) the "MinShelfLifeDuration" element
     */
    com.sap.xi.ap.common.gdt.DAYDuration xgetMinShelfLifeDuration();
    
    /**
     * True if has "MinShelfLifeDuration" element
     */
    boolean isSetMinShelfLifeDuration();
    
    /**
     * Sets the "MinShelfLifeDuration" element
     */
    void setMinShelfLifeDuration(org.apache.xmlbeans.GDuration minShelfLifeDuration);
    
    /**
     * Sets (as xml) the "MinShelfLifeDuration" element
     */
    void xsetMinShelfLifeDuration(com.sap.xi.ap.common.gdt.DAYDuration minShelfLifeDuration);
    
    /**
     * Unsets the "MinShelfLifeDuration" element
     */
    void unsetMinShelfLifeDuration();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning newInstance() {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
