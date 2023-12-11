/*
 * XML Type:  MaterialByElementsResponseMaterialAvailabilityConfirmation
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterialAvailabilityConfirmation(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialAvailabilityConfirmationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialAvailabilityConfirmationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLANNINGAREAID$0 = 
        new javax.xml.namespace.QName("", "PlanningAreaID");
    private static final javax.xml.namespace.QName LIFECYCLESTATUSCODE$2 = 
        new javax.xml.namespace.QName("", "LifeCycleStatusCode");
    private static final javax.xml.namespace.QName REPLENISHMENTLEADTIMEDURATION$4 = 
        new javax.xml.namespace.QName("", "ReplenishmentLeadTimeDuration");
    private static final javax.xml.namespace.QName AVAILABILITYCHECKSCOPECODE$6 = 
        new javax.xml.namespace.QName("", "AvailabilityCheckScopeCode");
    private static final javax.xml.namespace.QName GOODSISSUEPROCESSINGDURATION$8 = 
        new javax.xml.namespace.QName("", "GoodsIssueProcessingDuration");
    private static final javax.xml.namespace.QName AVAILABILITYCHECKHORIZONDURATION$10 = 
        new javax.xml.namespace.QName("", "AvailabilityCheckHorizonDuration");
    private static final javax.xml.namespace.QName DISABLEAUTOMATICSHIPFROMDETERMINATIONINDICATOR$12 = 
        new javax.xml.namespace.QName("", "DisableAutomaticShipFromDeterminationIndicator");
    
    
    /**
     * Gets the "PlanningAreaID" element
     */
    public com.sap.xi.ap.common.gdt.SupplyPlanningAreaID getPlanningAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SupplyPlanningAreaID target = null;
            target = (com.sap.xi.ap.common.gdt.SupplyPlanningAreaID)get_store().find_element_user(PLANNINGAREAID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PlanningAreaID" element
     */
    public boolean isSetPlanningAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLANNINGAREAID$0) != 0;
        }
    }
    
    /**
     * Sets the "PlanningAreaID" element
     */
    public void setPlanningAreaID(com.sap.xi.ap.common.gdt.SupplyPlanningAreaID planningAreaID)
    {
        generatedSetterHelperImpl(planningAreaID, PLANNINGAREAID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PlanningAreaID" element
     */
    public com.sap.xi.ap.common.gdt.SupplyPlanningAreaID addNewPlanningAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SupplyPlanningAreaID target = null;
            target = (com.sap.xi.ap.common.gdt.SupplyPlanningAreaID)get_store().add_element_user(PLANNINGAREAID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "PlanningAreaID" element
     */
    public void unsetPlanningAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLANNINGAREAID$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIFECYCLESTATUSCODE$2, 0);
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
            target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$2, 0);
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
            return get_store().count_elements(LIFECYCLESTATUSCODE$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIFECYCLESTATUSCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIFECYCLESTATUSCODE$2);
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
            target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().add_element_user(LIFECYCLESTATUSCODE$2);
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
            get_store().remove_element(LIFECYCLESTATUSCODE$2, 0);
        }
    }
    
    /**
     * Gets the "ReplenishmentLeadTimeDuration" element
     */
    public org.apache.xmlbeans.GDuration getReplenishmentLeadTimeDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLENISHMENTLEADTIMEDURATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReplenishmentLeadTimeDuration" element
     */
    public com.sap.xi.ap.common.gdt.DAYDuration xgetReplenishmentLeadTimeDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(REPLENISHMENTLEADTIMEDURATION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReplenishmentLeadTimeDuration" element
     */
    public boolean isSetReplenishmentLeadTimeDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPLENISHMENTLEADTIMEDURATION$4) != 0;
        }
    }
    
    /**
     * Sets the "ReplenishmentLeadTimeDuration" element
     */
    public void setReplenishmentLeadTimeDuration(org.apache.xmlbeans.GDuration replenishmentLeadTimeDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLENISHMENTLEADTIMEDURATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPLENISHMENTLEADTIMEDURATION$4);
            }
            target.setGDurationValue(replenishmentLeadTimeDuration);
        }
    }
    
    /**
     * Sets (as xml) the "ReplenishmentLeadTimeDuration" element
     */
    public void xsetReplenishmentLeadTimeDuration(com.sap.xi.ap.common.gdt.DAYDuration replenishmentLeadTimeDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(REPLENISHMENTLEADTIMEDURATION$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().add_element_user(REPLENISHMENTLEADTIMEDURATION$4);
            }
            target.set(replenishmentLeadTimeDuration);
        }
    }
    
    /**
     * Unsets the "ReplenishmentLeadTimeDuration" element
     */
    public void unsetReplenishmentLeadTimeDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPLENISHMENTLEADTIMEDURATION$4, 0);
        }
    }
    
    /**
     * Gets the "AvailabilityCheckScopeCode" element
     */
    public com.sap.xi.ap.common.gdt.AvailabilityConfirmationModeCode getAvailabilityCheckScopeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.AvailabilityConfirmationModeCode target = null;
            target = (com.sap.xi.ap.common.gdt.AvailabilityConfirmationModeCode)get_store().find_element_user(AVAILABILITYCHECKSCOPECODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AvailabilityCheckScopeCode" element
     */
    public boolean isSetAvailabilityCheckScopeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AVAILABILITYCHECKSCOPECODE$6) != 0;
        }
    }
    
    /**
     * Sets the "AvailabilityCheckScopeCode" element
     */
    public void setAvailabilityCheckScopeCode(com.sap.xi.ap.common.gdt.AvailabilityConfirmationModeCode availabilityCheckScopeCode)
    {
        generatedSetterHelperImpl(availabilityCheckScopeCode, AVAILABILITYCHECKSCOPECODE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AvailabilityCheckScopeCode" element
     */
    public com.sap.xi.ap.common.gdt.AvailabilityConfirmationModeCode addNewAvailabilityCheckScopeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.AvailabilityConfirmationModeCode target = null;
            target = (com.sap.xi.ap.common.gdt.AvailabilityConfirmationModeCode)get_store().add_element_user(AVAILABILITYCHECKSCOPECODE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "AvailabilityCheckScopeCode" element
     */
    public void unsetAvailabilityCheckScopeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AVAILABILITYCHECKSCOPECODE$6, 0);
        }
    }
    
    /**
     * Gets the "GoodsIssueProcessingDuration" element
     */
    public org.apache.xmlbeans.GDuration getGoodsIssueProcessingDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOODSISSUEPROCESSINGDURATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "GoodsIssueProcessingDuration" element
     */
    public com.sap.xi.ap.common.gdt.TIMEDuration xgetGoodsIssueProcessingDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(GOODSISSUEPROCESSINGDURATION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "GoodsIssueProcessingDuration" element
     */
    public boolean isSetGoodsIssueProcessingDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GOODSISSUEPROCESSINGDURATION$8) != 0;
        }
    }
    
    /**
     * Sets the "GoodsIssueProcessingDuration" element
     */
    public void setGoodsIssueProcessingDuration(org.apache.xmlbeans.GDuration goodsIssueProcessingDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOODSISSUEPROCESSINGDURATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GOODSISSUEPROCESSINGDURATION$8);
            }
            target.setGDurationValue(goodsIssueProcessingDuration);
        }
    }
    
    /**
     * Sets (as xml) the "GoodsIssueProcessingDuration" element
     */
    public void xsetGoodsIssueProcessingDuration(com.sap.xi.ap.common.gdt.TIMEDuration goodsIssueProcessingDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(GOODSISSUEPROCESSINGDURATION$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().add_element_user(GOODSISSUEPROCESSINGDURATION$8);
            }
            target.set(goodsIssueProcessingDuration);
        }
    }
    
    /**
     * Unsets the "GoodsIssueProcessingDuration" element
     */
    public void unsetGoodsIssueProcessingDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GOODSISSUEPROCESSINGDURATION$8, 0);
        }
    }
    
    /**
     * Gets the "AvailabilityCheckHorizonDuration" element
     */
    public org.apache.xmlbeans.GDuration getAvailabilityCheckHorizonDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVAILABILITYCHECKHORIZONDURATION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "AvailabilityCheckHorizonDuration" element
     */
    public com.sap.xi.ap.common.gdt.DAYDuration xgetAvailabilityCheckHorizonDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(AVAILABILITYCHECKHORIZONDURATION$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "AvailabilityCheckHorizonDuration" element
     */
    public boolean isSetAvailabilityCheckHorizonDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AVAILABILITYCHECKHORIZONDURATION$10) != 0;
        }
    }
    
    /**
     * Sets the "AvailabilityCheckHorizonDuration" element
     */
    public void setAvailabilityCheckHorizonDuration(org.apache.xmlbeans.GDuration availabilityCheckHorizonDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVAILABILITYCHECKHORIZONDURATION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AVAILABILITYCHECKHORIZONDURATION$10);
            }
            target.setGDurationValue(availabilityCheckHorizonDuration);
        }
    }
    
    /**
     * Sets (as xml) the "AvailabilityCheckHorizonDuration" element
     */
    public void xsetAvailabilityCheckHorizonDuration(com.sap.xi.ap.common.gdt.DAYDuration availabilityCheckHorizonDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(AVAILABILITYCHECKHORIZONDURATION$10, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().add_element_user(AVAILABILITYCHECKHORIZONDURATION$10);
            }
            target.set(availabilityCheckHorizonDuration);
        }
    }
    
    /**
     * Unsets the "AvailabilityCheckHorizonDuration" element
     */
    public void unsetAvailabilityCheckHorizonDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AVAILABILITYCHECKHORIZONDURATION$10, 0);
        }
    }
    
    /**
     * Gets the "DisableAutomaticShipFromDeterminationIndicator" element
     */
    public boolean getDisableAutomaticShipFromDeterminationIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLEAUTOMATICSHIPFROMDETERMINATIONINDICATOR$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "DisableAutomaticShipFromDeterminationIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetDisableAutomaticShipFromDeterminationIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(DISABLEAUTOMATICSHIPFROMDETERMINATIONINDICATOR$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "DisableAutomaticShipFromDeterminationIndicator" element
     */
    public boolean isSetDisableAutomaticShipFromDeterminationIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISABLEAUTOMATICSHIPFROMDETERMINATIONINDICATOR$12) != 0;
        }
    }
    
    /**
     * Sets the "DisableAutomaticShipFromDeterminationIndicator" element
     */
    public void setDisableAutomaticShipFromDeterminationIndicator(boolean disableAutomaticShipFromDeterminationIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLEAUTOMATICSHIPFROMDETERMINATIONINDICATOR$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISABLEAUTOMATICSHIPFROMDETERMINATIONINDICATOR$12);
            }
            target.setBooleanValue(disableAutomaticShipFromDeterminationIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "DisableAutomaticShipFromDeterminationIndicator" element
     */
    public void xsetDisableAutomaticShipFromDeterminationIndicator(com.sap.xi.ap.common.gdt.Indicator disableAutomaticShipFromDeterminationIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(DISABLEAUTOMATICSHIPFROMDETERMINATIONINDICATOR$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(DISABLEAUTOMATICSHIPFROMDETERMINATIONINDICATOR$12);
            }
            target.set(disableAutomaticShipFromDeterminationIndicator);
        }
    }
    
    /**
     * Unsets the "DisableAutomaticShipFromDeterminationIndicator" element
     */
    public void unsetDisableAutomaticShipFromDeterminationIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISABLEAUTOMATICSHIPFROMDETERMINATIONINDICATOR$12, 0);
        }
    }
}
