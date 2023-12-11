/*
 * XML Type:  MaterialByElementsResponseMaterialSupplyPlanning
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterialSupplyPlanning(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialSupplyPlanningImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialSupplyPlanningImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPLYPLANNINGCATEGORYID$0 = 
        new javax.xml.namespace.QName("", "SupplyPlanningCategoryID");
    private static final javax.xml.namespace.QName SUPPLYPLANNINGAREAID$2 = 
        new javax.xml.namespace.QName("", "SupplyPlanningAreaID");
    private static final javax.xml.namespace.QName LIFECYCLESTATUSCODE$4 = 
        new javax.xml.namespace.QName("", "LifeCycleStatusCode");
    private static final javax.xml.namespace.QName PROCUREMENTTYPECODE$6 = 
        new javax.xml.namespace.QName("", "ProcurementTypeCode");
    private static final javax.xml.namespace.QName PLANNINGTIMEFENCEDURATION$8 = 
        new javax.xml.namespace.QName("", "PlanningTimeFenceDuration");
    private static final javax.xml.namespace.QName PLANNINGPROCEDURECODE$10 = 
        new javax.xml.namespace.QName("", "PlanningProcedureCode");
    private static final javax.xml.namespace.QName LOTSIZEPROCEDURECODE$12 = 
        new javax.xml.namespace.QName("", "LotSizeProcedureCode");
    private static final javax.xml.namespace.QName FIXEDLOTSIZEQUANTITYVALUE$14 = 
        new javax.xml.namespace.QName("", "FixedLotSizeQuantityValue");
    private static final javax.xml.namespace.QName PERIODTYPECODE$16 = 
        new javax.xml.namespace.QName("", "PeriodTypeCode");
    private static final javax.xml.namespace.QName REORDERQUANTITYVALUE$18 = 
        new javax.xml.namespace.QName("", "ReOrderQuantityValue");
    private static final javax.xml.namespace.QName TARGETSTOCKQUANTITYVALUE$20 = 
        new javax.xml.namespace.QName("", "TargetStockQuantityValue");
    private static final javax.xml.namespace.QName TARGETDAYSOFSUPPLYDURATION$22 = 
        new javax.xml.namespace.QName("", "TargetDaysOfSupplyDuration");
    private static final javax.xml.namespace.QName SAFETYSTOCKQUANTITYVALUE$24 = 
        new javax.xml.namespace.QName("", "SafetyStockQuantityValue");
    private static final javax.xml.namespace.QName SAFETYDAYSOFSUPPLYDURATION$26 = 
        new javax.xml.namespace.QName("", "SafetyDaysOfSupplyDuration");
    private static final javax.xml.namespace.QName LOTSIZEROUNDINGQUANTITYVALUE$28 = 
        new javax.xml.namespace.QName("", "LotSizeRoundingQuantityValue");
    private static final javax.xml.namespace.QName MINIMUMLOTSIZEQUANTITYVALUE$30 = 
        new javax.xml.namespace.QName("", "MinimumLotSizeQuantityValue");
    private static final javax.xml.namespace.QName MAXIMUMLOTSIZEQUANTITYVALUE$32 = 
        new javax.xml.namespace.QName("", "MaximumLotSizeQuantityValue");
    private static final javax.xml.namespace.QName DEMANDMANAGEMENTPROCEDURECODE$34 = 
        new javax.xml.namespace.QName("", "DemandManagementProcedureCode");
    private static final javax.xml.namespace.QName PLANNEDDELIVERYDURATION$36 = 
        new javax.xml.namespace.QName("", "PlannedDeliveryDuration");
    private static final javax.xml.namespace.QName GOODSRECEIPTPROCESSINGDURATION$38 = 
        new javax.xml.namespace.QName("", "GoodsReceiptProcessingDuration");
    private static final javax.xml.namespace.QName MINIMUMDAYSOFSUPPLYDURATION$40 = 
        new javax.xml.namespace.QName("", "MinimumDaysOfSupplyDuration");
    private static final javax.xml.namespace.QName MINIMUMRECEIPTDAYSOFSUPPLYDURATION$42 = 
        new javax.xml.namespace.QName("", "MinimumReceiptDaysOfSupplyDuration");
    private static final javax.xml.namespace.QName MINSHELFLIFEDURATION$44 = 
        new javax.xml.namespace.QName("", "MinShelfLifeDuration");
    
    
    /**
     * Gets the "SupplyPlanningCategoryID" element
     */
    public java.lang.String getSupplyPlanningCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLYPLANNINGCATEGORYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SupplyPlanningCategoryID" element
     */
    public com.sap.xi.ap.common.gdt.ProductCategoryInternalID xgetSupplyPlanningCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductCategoryInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductCategoryInternalID)get_store().find_element_user(SUPPLYPLANNINGCATEGORYID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SupplyPlanningCategoryID" element
     */
    public boolean isSetSupplyPlanningCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLYPLANNINGCATEGORYID$0) != 0;
        }
    }
    
    /**
     * Sets the "SupplyPlanningCategoryID" element
     */
    public void setSupplyPlanningCategoryID(java.lang.String supplyPlanningCategoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLYPLANNINGCATEGORYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPLYPLANNINGCATEGORYID$0);
            }
            target.setStringValue(supplyPlanningCategoryID);
        }
    }
    
    /**
     * Sets (as xml) the "SupplyPlanningCategoryID" element
     */
    public void xsetSupplyPlanningCategoryID(com.sap.xi.ap.common.gdt.ProductCategoryInternalID supplyPlanningCategoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductCategoryInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductCategoryInternalID)get_store().find_element_user(SUPPLYPLANNINGCATEGORYID$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProductCategoryInternalID)get_store().add_element_user(SUPPLYPLANNINGCATEGORYID$0);
            }
            target.set(supplyPlanningCategoryID);
        }
    }
    
    /**
     * Unsets the "SupplyPlanningCategoryID" element
     */
    public void unsetSupplyPlanningCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLYPLANNINGCATEGORYID$0, 0);
        }
    }
    
    /**
     * Gets the "SupplyPlanningAreaID" element
     */
    public com.sap.xi.ap.common.gdt.SupplyPlanningAreaID getSupplyPlanningAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SupplyPlanningAreaID target = null;
            target = (com.sap.xi.ap.common.gdt.SupplyPlanningAreaID)get_store().find_element_user(SUPPLYPLANNINGAREAID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SupplyPlanningAreaID" element
     */
    public boolean isSetSupplyPlanningAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLYPLANNINGAREAID$2) != 0;
        }
    }
    
    /**
     * Sets the "SupplyPlanningAreaID" element
     */
    public void setSupplyPlanningAreaID(com.sap.xi.ap.common.gdt.SupplyPlanningAreaID supplyPlanningAreaID)
    {
        generatedSetterHelperImpl(supplyPlanningAreaID, SUPPLYPLANNINGAREAID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SupplyPlanningAreaID" element
     */
    public com.sap.xi.ap.common.gdt.SupplyPlanningAreaID addNewSupplyPlanningAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SupplyPlanningAreaID target = null;
            target = (com.sap.xi.ap.common.gdt.SupplyPlanningAreaID)get_store().add_element_user(SUPPLYPLANNINGAREAID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "SupplyPlanningAreaID" element
     */
    public void unsetSupplyPlanningAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLYPLANNINGAREAID$2, 0);
        }
    }
    
    /**
     * Gets the "LifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum getLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIFECYCLESTATUSCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode xgetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LifeCycleStatusCode" element
     */
    public boolean isSetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIFECYCLESTATUSCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "LifeCycleStatusCode" element
     */
    public void setLifeCycleStatusCode(com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum lifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIFECYCLESTATUSCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIFECYCLESTATUSCODE$4);
            }
            target.setEnumValue(lifeCycleStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "LifeCycleStatusCode" element
     */
    public void xsetLifeCycleStatusCode(com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode lifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().add_element_user(LIFECYCLESTATUSCODE$4);
            }
            target.set(lifeCycleStatusCode);
        }
    }
    
    /**
     * Unsets the "LifeCycleStatusCode" element
     */
    public void unsetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIFECYCLESTATUSCODE$4, 0);
        }
    }
    
    /**
     * Gets the "ProcurementTypeCode" element
     */
    public java.lang.String getProcurementTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCUREMENTTYPECODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProcurementTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.ProcurementMethodCode xgetProcurementTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcurementMethodCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcurementMethodCode)get_store().find_element_user(PROCUREMENTTYPECODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProcurementTypeCode" element
     */
    public boolean isSetProcurementTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCUREMENTTYPECODE$6) != 0;
        }
    }
    
    /**
     * Sets the "ProcurementTypeCode" element
     */
    public void setProcurementTypeCode(java.lang.String procurementTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCUREMENTTYPECODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCUREMENTTYPECODE$6);
            }
            target.setStringValue(procurementTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "ProcurementTypeCode" element
     */
    public void xsetProcurementTypeCode(com.sap.xi.ap.common.gdt.ProcurementMethodCode procurementTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcurementMethodCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcurementMethodCode)get_store().find_element_user(PROCUREMENTTYPECODE$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProcurementMethodCode)get_store().add_element_user(PROCUREMENTTYPECODE$6);
            }
            target.set(procurementTypeCode);
        }
    }
    
    /**
     * Unsets the "ProcurementTypeCode" element
     */
    public void unsetProcurementTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCUREMENTTYPECODE$6, 0);
        }
    }
    
    /**
     * Gets the "PlanningTimeFenceDuration" element
     */
    public org.apache.xmlbeans.GDuration getPlanningTimeFenceDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANNINGTIMEFENCEDURATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "PlanningTimeFenceDuration" element
     */
    public com.sap.xi.ap.common.gdt.DAYDuration xgetPlanningTimeFenceDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(PLANNINGTIMEFENCEDURATION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "PlanningTimeFenceDuration" element
     */
    public boolean isSetPlanningTimeFenceDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLANNINGTIMEFENCEDURATION$8) != 0;
        }
    }
    
    /**
     * Sets the "PlanningTimeFenceDuration" element
     */
    public void setPlanningTimeFenceDuration(org.apache.xmlbeans.GDuration planningTimeFenceDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANNINGTIMEFENCEDURATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLANNINGTIMEFENCEDURATION$8);
            }
            target.setGDurationValue(planningTimeFenceDuration);
        }
    }
    
    /**
     * Sets (as xml) the "PlanningTimeFenceDuration" element
     */
    public void xsetPlanningTimeFenceDuration(com.sap.xi.ap.common.gdt.DAYDuration planningTimeFenceDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(PLANNINGTIMEFENCEDURATION$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().add_element_user(PLANNINGTIMEFENCEDURATION$8);
            }
            target.set(planningTimeFenceDuration);
        }
    }
    
    /**
     * Unsets the "PlanningTimeFenceDuration" element
     */
    public void unsetPlanningTimeFenceDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLANNINGTIMEFENCEDURATION$8, 0);
        }
    }
    
    /**
     * Gets the "PlanningProcedureCode" element
     */
    public java.lang.String getPlanningProcedureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANNINGPROCEDURECODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PlanningProcedureCode" element
     */
    public com.sap.xi.ap.common.gdt.SupplyPlanningProcedureCode xgetPlanningProcedureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SupplyPlanningProcedureCode target = null;
            target = (com.sap.xi.ap.common.gdt.SupplyPlanningProcedureCode)get_store().find_element_user(PLANNINGPROCEDURECODE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "PlanningProcedureCode" element
     */
    public boolean isSetPlanningProcedureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLANNINGPROCEDURECODE$10) != 0;
        }
    }
    
    /**
     * Sets the "PlanningProcedureCode" element
     */
    public void setPlanningProcedureCode(java.lang.String planningProcedureCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANNINGPROCEDURECODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLANNINGPROCEDURECODE$10);
            }
            target.setStringValue(planningProcedureCode);
        }
    }
    
    /**
     * Sets (as xml) the "PlanningProcedureCode" element
     */
    public void xsetPlanningProcedureCode(com.sap.xi.ap.common.gdt.SupplyPlanningProcedureCode planningProcedureCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SupplyPlanningProcedureCode target = null;
            target = (com.sap.xi.ap.common.gdt.SupplyPlanningProcedureCode)get_store().find_element_user(PLANNINGPROCEDURECODE$10, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.SupplyPlanningProcedureCode)get_store().add_element_user(PLANNINGPROCEDURECODE$10);
            }
            target.set(planningProcedureCode);
        }
    }
    
    /**
     * Unsets the "PlanningProcedureCode" element
     */
    public void unsetPlanningProcedureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLANNINGPROCEDURECODE$10, 0);
        }
    }
    
    /**
     * Gets the "LotSizeProcedureCode" element
     */
    public java.lang.String getLotSizeProcedureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOTSIZEPROCEDURECODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LotSizeProcedureCode" element
     */
    public com.sap.xi.ap.common.gdt.LotSizeProcedureCode xgetLotSizeProcedureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LotSizeProcedureCode target = null;
            target = (com.sap.xi.ap.common.gdt.LotSizeProcedureCode)get_store().find_element_user(LOTSIZEPROCEDURECODE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "LotSizeProcedureCode" element
     */
    public boolean isSetLotSizeProcedureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOTSIZEPROCEDURECODE$12) != 0;
        }
    }
    
    /**
     * Sets the "LotSizeProcedureCode" element
     */
    public void setLotSizeProcedureCode(java.lang.String lotSizeProcedureCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOTSIZEPROCEDURECODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOTSIZEPROCEDURECODE$12);
            }
            target.setStringValue(lotSizeProcedureCode);
        }
    }
    
    /**
     * Sets (as xml) the "LotSizeProcedureCode" element
     */
    public void xsetLotSizeProcedureCode(com.sap.xi.ap.common.gdt.LotSizeProcedureCode lotSizeProcedureCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LotSizeProcedureCode target = null;
            target = (com.sap.xi.ap.common.gdt.LotSizeProcedureCode)get_store().find_element_user(LOTSIZEPROCEDURECODE$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LotSizeProcedureCode)get_store().add_element_user(LOTSIZEPROCEDURECODE$12);
            }
            target.set(lotSizeProcedureCode);
        }
    }
    
    /**
     * Unsets the "LotSizeProcedureCode" element
     */
    public void unsetLotSizeProcedureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOTSIZEPROCEDURECODE$12, 0);
        }
    }
    
    /**
     * Gets the "FixedLotSizeQuantityValue" element
     */
    public java.math.BigDecimal getFixedLotSizeQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIXEDLOTSIZEQUANTITYVALUE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "FixedLotSizeQuantityValue" element
     */
    public com.sap.xi.ap.common.gdt.DecimalValue xgetFixedLotSizeQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DecimalValue target = null;
            target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().find_element_user(FIXEDLOTSIZEQUANTITYVALUE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "FixedLotSizeQuantityValue" element
     */
    public boolean isSetFixedLotSizeQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIXEDLOTSIZEQUANTITYVALUE$14) != 0;
        }
    }
    
    /**
     * Sets the "FixedLotSizeQuantityValue" element
     */
    public void setFixedLotSizeQuantityValue(java.math.BigDecimal fixedLotSizeQuantityValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIXEDLOTSIZEQUANTITYVALUE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIXEDLOTSIZEQUANTITYVALUE$14);
            }
            target.setBigDecimalValue(fixedLotSizeQuantityValue);
        }
    }
    
    /**
     * Sets (as xml) the "FixedLotSizeQuantityValue" element
     */
    public void xsetFixedLotSizeQuantityValue(com.sap.xi.ap.common.gdt.DecimalValue fixedLotSizeQuantityValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DecimalValue target = null;
            target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().find_element_user(FIXEDLOTSIZEQUANTITYVALUE$14, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().add_element_user(FIXEDLOTSIZEQUANTITYVALUE$14);
            }
            target.set(fixedLotSizeQuantityValue);
        }
    }
    
    /**
     * Unsets the "FixedLotSizeQuantityValue" element
     */
    public void unsetFixedLotSizeQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIXEDLOTSIZEQUANTITYVALUE$14, 0);
        }
    }
    
    /**
     * Gets the "PeriodTypeCode" element
     */
    public java.lang.String getPeriodTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODTYPECODE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PeriodTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.CalendarUnitCode xgetPeriodTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.CalendarUnitCode target = null;
            target = (com.sap.xi.ap.common.gdt.CalendarUnitCode)get_store().find_element_user(PERIODTYPECODE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "PeriodTypeCode" element
     */
    public boolean isSetPeriodTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERIODTYPECODE$16) != 0;
        }
    }
    
    /**
     * Sets the "PeriodTypeCode" element
     */
    public void setPeriodTypeCode(java.lang.String periodTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODTYPECODE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIODTYPECODE$16);
            }
            target.setStringValue(periodTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "PeriodTypeCode" element
     */
    public void xsetPeriodTypeCode(com.sap.xi.ap.common.gdt.CalendarUnitCode periodTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.CalendarUnitCode target = null;
            target = (com.sap.xi.ap.common.gdt.CalendarUnitCode)get_store().find_element_user(PERIODTYPECODE$16, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.CalendarUnitCode)get_store().add_element_user(PERIODTYPECODE$16);
            }
            target.set(periodTypeCode);
        }
    }
    
    /**
     * Unsets the "PeriodTypeCode" element
     */
    public void unsetPeriodTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERIODTYPECODE$16, 0);
        }
    }
    
    /**
     * Gets the "ReOrderQuantityValue" element
     */
    public java.math.BigDecimal getReOrderQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REORDERQUANTITYVALUE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReOrderQuantityValue" element
     */
    public com.sap.xi.ap.common.gdt.DecimalValue xgetReOrderQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DecimalValue target = null;
            target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().find_element_user(REORDERQUANTITYVALUE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReOrderQuantityValue" element
     */
    public boolean isSetReOrderQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REORDERQUANTITYVALUE$18) != 0;
        }
    }
    
    /**
     * Sets the "ReOrderQuantityValue" element
     */
    public void setReOrderQuantityValue(java.math.BigDecimal reOrderQuantityValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REORDERQUANTITYVALUE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REORDERQUANTITYVALUE$18);
            }
            target.setBigDecimalValue(reOrderQuantityValue);
        }
    }
    
    /**
     * Sets (as xml) the "ReOrderQuantityValue" element
     */
    public void xsetReOrderQuantityValue(com.sap.xi.ap.common.gdt.DecimalValue reOrderQuantityValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DecimalValue target = null;
            target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().find_element_user(REORDERQUANTITYVALUE$18, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().add_element_user(REORDERQUANTITYVALUE$18);
            }
            target.set(reOrderQuantityValue);
        }
    }
    
    /**
     * Unsets the "ReOrderQuantityValue" element
     */
    public void unsetReOrderQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REORDERQUANTITYVALUE$18, 0);
        }
    }
    
    /**
     * Gets the "TargetStockQuantityValue" element
     */
    public java.math.BigDecimal getTargetStockQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETSTOCKQUANTITYVALUE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "TargetStockQuantityValue" element
     */
    public com.sap.xi.ap.common.gdt.DecimalValue xgetTargetStockQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DecimalValue target = null;
            target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().find_element_user(TARGETSTOCKQUANTITYVALUE$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "TargetStockQuantityValue" element
     */
    public boolean isSetTargetStockQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETSTOCKQUANTITYVALUE$20) != 0;
        }
    }
    
    /**
     * Sets the "TargetStockQuantityValue" element
     */
    public void setTargetStockQuantityValue(java.math.BigDecimal targetStockQuantityValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETSTOCKQUANTITYVALUE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETSTOCKQUANTITYVALUE$20);
            }
            target.setBigDecimalValue(targetStockQuantityValue);
        }
    }
    
    /**
     * Sets (as xml) the "TargetStockQuantityValue" element
     */
    public void xsetTargetStockQuantityValue(com.sap.xi.ap.common.gdt.DecimalValue targetStockQuantityValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DecimalValue target = null;
            target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().find_element_user(TARGETSTOCKQUANTITYVALUE$20, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().add_element_user(TARGETSTOCKQUANTITYVALUE$20);
            }
            target.set(targetStockQuantityValue);
        }
    }
    
    /**
     * Unsets the "TargetStockQuantityValue" element
     */
    public void unsetTargetStockQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETSTOCKQUANTITYVALUE$20, 0);
        }
    }
    
    /**
     * Gets the "TargetDaysOfSupplyDuration" element
     */
    public org.apache.xmlbeans.GDuration getTargetDaysOfSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETDAYSOFSUPPLYDURATION$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "TargetDaysOfSupplyDuration" element
     */
    public com.sap.xi.ap.common.gdt.DAYDuration xgetTargetDaysOfSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(TARGETDAYSOFSUPPLYDURATION$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "TargetDaysOfSupplyDuration" element
     */
    public boolean isSetTargetDaysOfSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETDAYSOFSUPPLYDURATION$22) != 0;
        }
    }
    
    /**
     * Sets the "TargetDaysOfSupplyDuration" element
     */
    public void setTargetDaysOfSupplyDuration(org.apache.xmlbeans.GDuration targetDaysOfSupplyDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETDAYSOFSUPPLYDURATION$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETDAYSOFSUPPLYDURATION$22);
            }
            target.setGDurationValue(targetDaysOfSupplyDuration);
        }
    }
    
    /**
     * Sets (as xml) the "TargetDaysOfSupplyDuration" element
     */
    public void xsetTargetDaysOfSupplyDuration(com.sap.xi.ap.common.gdt.DAYDuration targetDaysOfSupplyDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(TARGETDAYSOFSUPPLYDURATION$22, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().add_element_user(TARGETDAYSOFSUPPLYDURATION$22);
            }
            target.set(targetDaysOfSupplyDuration);
        }
    }
    
    /**
     * Unsets the "TargetDaysOfSupplyDuration" element
     */
    public void unsetTargetDaysOfSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETDAYSOFSUPPLYDURATION$22, 0);
        }
    }
    
    /**
     * Gets the "SafetyStockQuantityValue" element
     */
    public java.math.BigDecimal getSafetyStockQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAFETYSTOCKQUANTITYVALUE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "SafetyStockQuantityValue" element
     */
    public com.sap.xi.ap.common.gdt.DecimalValue xgetSafetyStockQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DecimalValue target = null;
            target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().find_element_user(SAFETYSTOCKQUANTITYVALUE$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "SafetyStockQuantityValue" element
     */
    public boolean isSetSafetyStockQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAFETYSTOCKQUANTITYVALUE$24) != 0;
        }
    }
    
    /**
     * Sets the "SafetyStockQuantityValue" element
     */
    public void setSafetyStockQuantityValue(java.math.BigDecimal safetyStockQuantityValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAFETYSTOCKQUANTITYVALUE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAFETYSTOCKQUANTITYVALUE$24);
            }
            target.setBigDecimalValue(safetyStockQuantityValue);
        }
    }
    
    /**
     * Sets (as xml) the "SafetyStockQuantityValue" element
     */
    public void xsetSafetyStockQuantityValue(com.sap.xi.ap.common.gdt.DecimalValue safetyStockQuantityValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DecimalValue target = null;
            target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().find_element_user(SAFETYSTOCKQUANTITYVALUE$24, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().add_element_user(SAFETYSTOCKQUANTITYVALUE$24);
            }
            target.set(safetyStockQuantityValue);
        }
    }
    
    /**
     * Unsets the "SafetyStockQuantityValue" element
     */
    public void unsetSafetyStockQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAFETYSTOCKQUANTITYVALUE$24, 0);
        }
    }
    
    /**
     * Gets the "SafetyDaysOfSupplyDuration" element
     */
    public org.apache.xmlbeans.GDuration getSafetyDaysOfSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAFETYDAYSOFSUPPLYDURATION$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "SafetyDaysOfSupplyDuration" element
     */
    public com.sap.xi.ap.common.gdt.DAYDuration xgetSafetyDaysOfSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(SAFETYDAYSOFSUPPLYDURATION$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "SafetyDaysOfSupplyDuration" element
     */
    public boolean isSetSafetyDaysOfSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAFETYDAYSOFSUPPLYDURATION$26) != 0;
        }
    }
    
    /**
     * Sets the "SafetyDaysOfSupplyDuration" element
     */
    public void setSafetyDaysOfSupplyDuration(org.apache.xmlbeans.GDuration safetyDaysOfSupplyDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAFETYDAYSOFSUPPLYDURATION$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAFETYDAYSOFSUPPLYDURATION$26);
            }
            target.setGDurationValue(safetyDaysOfSupplyDuration);
        }
    }
    
    /**
     * Sets (as xml) the "SafetyDaysOfSupplyDuration" element
     */
    public void xsetSafetyDaysOfSupplyDuration(com.sap.xi.ap.common.gdt.DAYDuration safetyDaysOfSupplyDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(SAFETYDAYSOFSUPPLYDURATION$26, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().add_element_user(SAFETYDAYSOFSUPPLYDURATION$26);
            }
            target.set(safetyDaysOfSupplyDuration);
        }
    }
    
    /**
     * Unsets the "SafetyDaysOfSupplyDuration" element
     */
    public void unsetSafetyDaysOfSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAFETYDAYSOFSUPPLYDURATION$26, 0);
        }
    }
    
    /**
     * Gets the "LotSizeRoundingQuantityValue" element
     */
    public java.math.BigDecimal getLotSizeRoundingQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOTSIZEROUNDINGQUANTITYVALUE$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "LotSizeRoundingQuantityValue" element
     */
    public com.sap.xi.ap.common.gdt.DecimalValue xgetLotSizeRoundingQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DecimalValue target = null;
            target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().find_element_user(LOTSIZEROUNDINGQUANTITYVALUE$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "LotSizeRoundingQuantityValue" element
     */
    public boolean isSetLotSizeRoundingQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOTSIZEROUNDINGQUANTITYVALUE$28) != 0;
        }
    }
    
    /**
     * Sets the "LotSizeRoundingQuantityValue" element
     */
    public void setLotSizeRoundingQuantityValue(java.math.BigDecimal lotSizeRoundingQuantityValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOTSIZEROUNDINGQUANTITYVALUE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOTSIZEROUNDINGQUANTITYVALUE$28);
            }
            target.setBigDecimalValue(lotSizeRoundingQuantityValue);
        }
    }
    
    /**
     * Sets (as xml) the "LotSizeRoundingQuantityValue" element
     */
    public void xsetLotSizeRoundingQuantityValue(com.sap.xi.ap.common.gdt.DecimalValue lotSizeRoundingQuantityValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DecimalValue target = null;
            target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().find_element_user(LOTSIZEROUNDINGQUANTITYVALUE$28, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().add_element_user(LOTSIZEROUNDINGQUANTITYVALUE$28);
            }
            target.set(lotSizeRoundingQuantityValue);
        }
    }
    
    /**
     * Unsets the "LotSizeRoundingQuantityValue" element
     */
    public void unsetLotSizeRoundingQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOTSIZEROUNDINGQUANTITYVALUE$28, 0);
        }
    }
    
    /**
     * Gets the "MinimumLotSizeQuantityValue" element
     */
    public java.math.BigDecimal getMinimumLotSizeQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMLOTSIZEQUANTITYVALUE$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinimumLotSizeQuantityValue" element
     */
    public com.sap.xi.ap.common.gdt.DecimalValue xgetMinimumLotSizeQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DecimalValue target = null;
            target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().find_element_user(MINIMUMLOTSIZEQUANTITYVALUE$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "MinimumLotSizeQuantityValue" element
     */
    public boolean isSetMinimumLotSizeQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINIMUMLOTSIZEQUANTITYVALUE$30) != 0;
        }
    }
    
    /**
     * Sets the "MinimumLotSizeQuantityValue" element
     */
    public void setMinimumLotSizeQuantityValue(java.math.BigDecimal minimumLotSizeQuantityValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMLOTSIZEQUANTITYVALUE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIMUMLOTSIZEQUANTITYVALUE$30);
            }
            target.setBigDecimalValue(minimumLotSizeQuantityValue);
        }
    }
    
    /**
     * Sets (as xml) the "MinimumLotSizeQuantityValue" element
     */
    public void xsetMinimumLotSizeQuantityValue(com.sap.xi.ap.common.gdt.DecimalValue minimumLotSizeQuantityValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DecimalValue target = null;
            target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().find_element_user(MINIMUMLOTSIZEQUANTITYVALUE$30, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().add_element_user(MINIMUMLOTSIZEQUANTITYVALUE$30);
            }
            target.set(minimumLotSizeQuantityValue);
        }
    }
    
    /**
     * Unsets the "MinimumLotSizeQuantityValue" element
     */
    public void unsetMinimumLotSizeQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINIMUMLOTSIZEQUANTITYVALUE$30, 0);
        }
    }
    
    /**
     * Gets the "MaximumLotSizeQuantityValue" element
     */
    public java.math.BigDecimal getMaximumLotSizeQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMLOTSIZEQUANTITYVALUE$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaximumLotSizeQuantityValue" element
     */
    public com.sap.xi.ap.common.gdt.DecimalValue xgetMaximumLotSizeQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DecimalValue target = null;
            target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().find_element_user(MAXIMUMLOTSIZEQUANTITYVALUE$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaximumLotSizeQuantityValue" element
     */
    public boolean isSetMaximumLotSizeQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXIMUMLOTSIZEQUANTITYVALUE$32) != 0;
        }
    }
    
    /**
     * Sets the "MaximumLotSizeQuantityValue" element
     */
    public void setMaximumLotSizeQuantityValue(java.math.BigDecimal maximumLotSizeQuantityValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMLOTSIZEQUANTITYVALUE$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXIMUMLOTSIZEQUANTITYVALUE$32);
            }
            target.setBigDecimalValue(maximumLotSizeQuantityValue);
        }
    }
    
    /**
     * Sets (as xml) the "MaximumLotSizeQuantityValue" element
     */
    public void xsetMaximumLotSizeQuantityValue(com.sap.xi.ap.common.gdt.DecimalValue maximumLotSizeQuantityValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DecimalValue target = null;
            target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().find_element_user(MAXIMUMLOTSIZEQUANTITYVALUE$32, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().add_element_user(MAXIMUMLOTSIZEQUANTITYVALUE$32);
            }
            target.set(maximumLotSizeQuantityValue);
        }
    }
    
    /**
     * Unsets the "MaximumLotSizeQuantityValue" element
     */
    public void unsetMaximumLotSizeQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXIMUMLOTSIZEQUANTITYVALUE$32, 0);
        }
    }
    
    /**
     * Gets the "DemandManagementProcedureCode" element
     */
    public com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode getDemandManagementProcedureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode target = null;
            target = (com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode)get_store().find_element_user(DEMANDMANAGEMENTPROCEDURECODE$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DemandManagementProcedureCode" element
     */
    public boolean isSetDemandManagementProcedureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEMANDMANAGEMENTPROCEDURECODE$34) != 0;
        }
    }
    
    /**
     * Sets the "DemandManagementProcedureCode" element
     */
    public void setDemandManagementProcedureCode(com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode demandManagementProcedureCode)
    {
        generatedSetterHelperImpl(demandManagementProcedureCode, DEMANDMANAGEMENTPROCEDURECODE$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DemandManagementProcedureCode" element
     */
    public com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode addNewDemandManagementProcedureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode target = null;
            target = (com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode)get_store().add_element_user(DEMANDMANAGEMENTPROCEDURECODE$34);
            return target;
        }
    }
    
    /**
     * Unsets the "DemandManagementProcedureCode" element
     */
    public void unsetDemandManagementProcedureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEMANDMANAGEMENTPROCEDURECODE$34, 0);
        }
    }
    
    /**
     * Gets the "PlannedDeliveryDuration" element
     */
    public org.apache.xmlbeans.GDuration getPlannedDeliveryDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANNEDDELIVERYDURATION$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "PlannedDeliveryDuration" element
     */
    public com.sap.xi.ap.common.gdt.DAYDuration xgetPlannedDeliveryDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(PLANNEDDELIVERYDURATION$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "PlannedDeliveryDuration" element
     */
    public boolean isSetPlannedDeliveryDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLANNEDDELIVERYDURATION$36) != 0;
        }
    }
    
    /**
     * Sets the "PlannedDeliveryDuration" element
     */
    public void setPlannedDeliveryDuration(org.apache.xmlbeans.GDuration plannedDeliveryDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANNEDDELIVERYDURATION$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLANNEDDELIVERYDURATION$36);
            }
            target.setGDurationValue(plannedDeliveryDuration);
        }
    }
    
    /**
     * Sets (as xml) the "PlannedDeliveryDuration" element
     */
    public void xsetPlannedDeliveryDuration(com.sap.xi.ap.common.gdt.DAYDuration plannedDeliveryDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(PLANNEDDELIVERYDURATION$36, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().add_element_user(PLANNEDDELIVERYDURATION$36);
            }
            target.set(plannedDeliveryDuration);
        }
    }
    
    /**
     * Unsets the "PlannedDeliveryDuration" element
     */
    public void unsetPlannedDeliveryDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLANNEDDELIVERYDURATION$36, 0);
        }
    }
    
    /**
     * Gets the "GoodsReceiptProcessingDuration" element
     */
    public org.apache.xmlbeans.GDuration getGoodsReceiptProcessingDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOODSRECEIPTPROCESSINGDURATION$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "GoodsReceiptProcessingDuration" element
     */
    public com.sap.xi.ap.common.gdt.TIMEDuration xgetGoodsReceiptProcessingDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(GOODSRECEIPTPROCESSINGDURATION$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "GoodsReceiptProcessingDuration" element
     */
    public boolean isSetGoodsReceiptProcessingDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GOODSRECEIPTPROCESSINGDURATION$38) != 0;
        }
    }
    
    /**
     * Sets the "GoodsReceiptProcessingDuration" element
     */
    public void setGoodsReceiptProcessingDuration(org.apache.xmlbeans.GDuration goodsReceiptProcessingDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOODSRECEIPTPROCESSINGDURATION$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GOODSRECEIPTPROCESSINGDURATION$38);
            }
            target.setGDurationValue(goodsReceiptProcessingDuration);
        }
    }
    
    /**
     * Sets (as xml) the "GoodsReceiptProcessingDuration" element
     */
    public void xsetGoodsReceiptProcessingDuration(com.sap.xi.ap.common.gdt.TIMEDuration goodsReceiptProcessingDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(GOODSRECEIPTPROCESSINGDURATION$38, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().add_element_user(GOODSRECEIPTPROCESSINGDURATION$38);
            }
            target.set(goodsReceiptProcessingDuration);
        }
    }
    
    /**
     * Unsets the "GoodsReceiptProcessingDuration" element
     */
    public void unsetGoodsReceiptProcessingDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GOODSRECEIPTPROCESSINGDURATION$38, 0);
        }
    }
    
    /**
     * Gets the "MinimumDaysOfSupplyDuration" element
     */
    public org.apache.xmlbeans.GDuration getMinimumDaysOfSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMDAYSOFSUPPLYDURATION$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinimumDaysOfSupplyDuration" element
     */
    public com.sap.xi.ap.common.gdt.DAYDuration xgetMinimumDaysOfSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(MINIMUMDAYSOFSUPPLYDURATION$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "MinimumDaysOfSupplyDuration" element
     */
    public boolean isSetMinimumDaysOfSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINIMUMDAYSOFSUPPLYDURATION$40) != 0;
        }
    }
    
    /**
     * Sets the "MinimumDaysOfSupplyDuration" element
     */
    public void setMinimumDaysOfSupplyDuration(org.apache.xmlbeans.GDuration minimumDaysOfSupplyDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMDAYSOFSUPPLYDURATION$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIMUMDAYSOFSUPPLYDURATION$40);
            }
            target.setGDurationValue(minimumDaysOfSupplyDuration);
        }
    }
    
    /**
     * Sets (as xml) the "MinimumDaysOfSupplyDuration" element
     */
    public void xsetMinimumDaysOfSupplyDuration(com.sap.xi.ap.common.gdt.DAYDuration minimumDaysOfSupplyDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(MINIMUMDAYSOFSUPPLYDURATION$40, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().add_element_user(MINIMUMDAYSOFSUPPLYDURATION$40);
            }
            target.set(minimumDaysOfSupplyDuration);
        }
    }
    
    /**
     * Unsets the "MinimumDaysOfSupplyDuration" element
     */
    public void unsetMinimumDaysOfSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINIMUMDAYSOFSUPPLYDURATION$40, 0);
        }
    }
    
    /**
     * Gets the "MinimumReceiptDaysOfSupplyDuration" element
     */
    public org.apache.xmlbeans.GDuration getMinimumReceiptDaysOfSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMRECEIPTDAYSOFSUPPLYDURATION$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinimumReceiptDaysOfSupplyDuration" element
     */
    public com.sap.xi.ap.common.gdt.DAYDuration xgetMinimumReceiptDaysOfSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(MINIMUMRECEIPTDAYSOFSUPPLYDURATION$42, 0);
            return target;
        }
    }
    
    /**
     * True if has "MinimumReceiptDaysOfSupplyDuration" element
     */
    public boolean isSetMinimumReceiptDaysOfSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINIMUMRECEIPTDAYSOFSUPPLYDURATION$42) != 0;
        }
    }
    
    /**
     * Sets the "MinimumReceiptDaysOfSupplyDuration" element
     */
    public void setMinimumReceiptDaysOfSupplyDuration(org.apache.xmlbeans.GDuration minimumReceiptDaysOfSupplyDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMRECEIPTDAYSOFSUPPLYDURATION$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIMUMRECEIPTDAYSOFSUPPLYDURATION$42);
            }
            target.setGDurationValue(minimumReceiptDaysOfSupplyDuration);
        }
    }
    
    /**
     * Sets (as xml) the "MinimumReceiptDaysOfSupplyDuration" element
     */
    public void xsetMinimumReceiptDaysOfSupplyDuration(com.sap.xi.ap.common.gdt.DAYDuration minimumReceiptDaysOfSupplyDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(MINIMUMRECEIPTDAYSOFSUPPLYDURATION$42, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().add_element_user(MINIMUMRECEIPTDAYSOFSUPPLYDURATION$42);
            }
            target.set(minimumReceiptDaysOfSupplyDuration);
        }
    }
    
    /**
     * Unsets the "MinimumReceiptDaysOfSupplyDuration" element
     */
    public void unsetMinimumReceiptDaysOfSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINIMUMRECEIPTDAYSOFSUPPLYDURATION$42, 0);
        }
    }
    
    /**
     * Gets the "MinShelfLifeDuration" element
     */
    public org.apache.xmlbeans.GDuration getMinShelfLifeDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINSHELFLIFEDURATION$44, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinShelfLifeDuration" element
     */
    public com.sap.xi.ap.common.gdt.DAYDuration xgetMinShelfLifeDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(MINSHELFLIFEDURATION$44, 0);
            return target;
        }
    }
    
    /**
     * True if has "MinShelfLifeDuration" element
     */
    public boolean isSetMinShelfLifeDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINSHELFLIFEDURATION$44) != 0;
        }
    }
    
    /**
     * Sets the "MinShelfLifeDuration" element
     */
    public void setMinShelfLifeDuration(org.apache.xmlbeans.GDuration minShelfLifeDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINSHELFLIFEDURATION$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINSHELFLIFEDURATION$44);
            }
            target.setGDurationValue(minShelfLifeDuration);
        }
    }
    
    /**
     * Sets (as xml) the "MinShelfLifeDuration" element
     */
    public void xsetMinShelfLifeDuration(com.sap.xi.ap.common.gdt.DAYDuration minShelfLifeDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(MINSHELFLIFEDURATION$44, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().add_element_user(MINSHELFLIFEDURATION$44);
            }
            target.set(minShelfLifeDuration);
        }
    }
    
    /**
     * Unsets the "MinShelfLifeDuration" element
     */
    public void unsetMinShelfLifeDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINSHELFLIFEDURATION$44, 0);
        }
    }
}
