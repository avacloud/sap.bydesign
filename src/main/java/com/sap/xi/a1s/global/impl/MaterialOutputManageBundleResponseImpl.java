/*
 * XML Type:  MaterialOutputManageBundle_Response
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialOutputManageBundleResponse
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialOutputManageBundle_Response(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialOutputManageBundleResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialOutputManageBundleResponse
{
    private static final long serialVersionUID = 1L;
    
    public MaterialOutputManageBundleResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATERIALOUTPUTUUID$0 = 
        new javax.xml.namespace.QName("", "MaterialOutputUUID");
    private static final javax.xml.namespace.QName PRODUCTID$2 = 
        new javax.xml.namespace.QName("", "ProductID");
    private static final javax.xml.namespace.QName PRODUCTUUID$4 = 
        new javax.xml.namespace.QName("", "ProductUUID");
    private static final javax.xml.namespace.QName SUPPLYPLANNINGAREA$6 = 
        new javax.xml.namespace.QName("", "SupplyPlanningArea");
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKID$8 = 
        new javax.xml.namespace.QName("", "IdentifiedStockID");
    private static final javax.xml.namespace.QName ACTIVITYID$10 = 
        new javax.xml.namespace.QName("", "ActivityID");
    private static final javax.xml.namespace.QName ACTIVITYTYPE$12 = 
        new javax.xml.namespace.QName("", "ActivityType");
    private static final javax.xml.namespace.QName ACTIVITYUUID$14 = 
        new javax.xml.namespace.QName("", "ActivityUUID");
    private static final javax.xml.namespace.QName TARGETLOGISTICSAREAID$16 = 
        new javax.xml.namespace.QName("", "TargetLogisticsAreaID");
    private static final javax.xml.namespace.QName SPLITINDICATOR$18 = 
        new javax.xml.namespace.QName("", "SplitIndicator");
    private static final javax.xml.namespace.QName CONFIRMATIONFINISHED$20 = 
        new javax.xml.namespace.QName("", "ConfirmationFinished");
    private static final javax.xml.namespace.QName PLANNEDINDICATOR$22 = 
        new javax.xml.namespace.QName("", "PlannedIndicator");
    private static final javax.xml.namespace.QName OPERATIONID$24 = 
        new javax.xml.namespace.QName("", "OperationID");
    private static final javax.xml.namespace.QName SITEID$26 = 
        new javax.xml.namespace.QName("", "SiteID");
    private static final javax.xml.namespace.QName CONFIRMEDQUANTITY$28 = 
        new javax.xml.namespace.QName("", "ConfirmedQuantity");
    private static final javax.xml.namespace.QName SERIALNUMBER$30 = 
        new javax.xml.namespace.QName("", "SerialNumber");
    private static final javax.xml.namespace.QName ACTIONCODE$32 = 
        new javax.xml.namespace.QName("", "ActionCode");
    
    
    /**
     * Gets the "MaterialOutputUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getMaterialOutputUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(MATERIALOUTPUTUUID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MaterialOutputUUID" element
     */
    public boolean isSetMaterialOutputUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATERIALOUTPUTUUID$0) != 0;
        }
    }
    
    /**
     * Sets the "MaterialOutputUUID" element
     */
    public void setMaterialOutputUUID(com.sap.xi.ap.common.gdt.UUID materialOutputUUID)
    {
        generatedSetterHelperImpl(materialOutputUUID, MATERIALOUTPUTUUID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MaterialOutputUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewMaterialOutputUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(MATERIALOUTPUTUUID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "MaterialOutputUUID" element
     */
    public void unsetMaterialOutputUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATERIALOUTPUTUUID$0, 0);
        }
    }
    
    /**
     * Gets the "ProductID" element
     */
    public com.sap.xi.ap.common.gdt.ProductID getProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().find_element_user(PRODUCTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductID" element
     */
    public boolean isSetProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTID$2) != 0;
        }
    }
    
    /**
     * Sets the "ProductID" element
     */
    public void setProductID(com.sap.xi.ap.common.gdt.ProductID productID)
    {
        generatedSetterHelperImpl(productID, PRODUCTID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductID" element
     */
    public com.sap.xi.ap.common.gdt.ProductID addNewProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().add_element_user(PRODUCTID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductID" element
     */
    public void unsetProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTID$2, 0);
        }
    }
    
    /**
     * Gets the "ProductUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getProductUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(PRODUCTUUID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductUUID" element
     */
    public boolean isSetProductUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTUUID$4) != 0;
        }
    }
    
    /**
     * Sets the "ProductUUID" element
     */
    public void setProductUUID(com.sap.xi.ap.common.gdt.UUID productUUID)
    {
        generatedSetterHelperImpl(productUUID, PRODUCTUUID$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewProductUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(PRODUCTUUID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductUUID" element
     */
    public void unsetProductUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTUUID$4, 0);
        }
    }
    
    /**
     * Gets the "SupplyPlanningArea" element
     */
    public com.sap.xi.ap.common.gdt.SupplyPlanningAreaID getSupplyPlanningArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SupplyPlanningAreaID target = null;
            target = (com.sap.xi.ap.common.gdt.SupplyPlanningAreaID)get_store().find_element_user(SUPPLYPLANNINGAREA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SupplyPlanningArea" element
     */
    public boolean isSetSupplyPlanningArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLYPLANNINGAREA$6) != 0;
        }
    }
    
    /**
     * Sets the "SupplyPlanningArea" element
     */
    public void setSupplyPlanningArea(com.sap.xi.ap.common.gdt.SupplyPlanningAreaID supplyPlanningArea)
    {
        generatedSetterHelperImpl(supplyPlanningArea, SUPPLYPLANNINGAREA$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SupplyPlanningArea" element
     */
    public com.sap.xi.ap.common.gdt.SupplyPlanningAreaID addNewSupplyPlanningArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SupplyPlanningAreaID target = null;
            target = (com.sap.xi.ap.common.gdt.SupplyPlanningAreaID)get_store().add_element_user(SUPPLYPLANNINGAREA$6);
            return target;
        }
    }
    
    /**
     * Unsets the "SupplyPlanningArea" element
     */
    public void unsetSupplyPlanningArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLYPLANNINGAREA$6, 0);
        }
    }
    
    /**
     * Gets the "IdentifiedStockID" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockID getIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID)get_store().find_element_user(IDENTIFIEDSTOCKID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IdentifiedStockID" element
     */
    public boolean isSetIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIEDSTOCKID$8) != 0;
        }
    }
    
    /**
     * Sets the "IdentifiedStockID" element
     */
    public void setIdentifiedStockID(com.sap.xi.ap.common.gdt.IdentifiedStockID identifiedStockID)
    {
        generatedSetterHelperImpl(identifiedStockID, IDENTIFIEDSTOCKID$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdentifiedStockID" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockID addNewIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID)get_store().add_element_user(IDENTIFIEDSTOCKID$8);
            return target;
        }
    }
    
    /**
     * Unsets the "IdentifiedStockID" element
     */
    public void unsetIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIEDSTOCKID$8, 0);
        }
    }
    
    /**
     * Gets the "ActivityID" element
     */
    public java.lang.String getActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ActivityID" element
     */
    public com.sap.xi.ap.common.gdt.OperationActivityID xgetActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationActivityID target = null;
            target = (com.sap.xi.ap.common.gdt.OperationActivityID)get_store().find_element_user(ACTIVITYID$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "ActivityID" element
     */
    public boolean isSetActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYID$10) != 0;
        }
    }
    
    /**
     * Sets the "ActivityID" element
     */
    public void setActivityID(java.lang.String activityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYID$10);
            }
            target.setStringValue(activityID);
        }
    }
    
    /**
     * Sets (as xml) the "ActivityID" element
     */
    public void xsetActivityID(com.sap.xi.ap.common.gdt.OperationActivityID activityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationActivityID target = null;
            target = (com.sap.xi.ap.common.gdt.OperationActivityID)get_store().find_element_user(ACTIVITYID$10, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.OperationActivityID)get_store().add_element_user(ACTIVITYID$10);
            }
            target.set(activityID);
        }
    }
    
    /**
     * Unsets the "ActivityID" element
     */
    public void unsetActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYID$10, 0);
        }
    }
    
    /**
     * Gets the "ActivityType" element
     */
    public com.sap.xi.ap.common.gdt.OperationActivityTypeCode getActivityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationActivityTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.OperationActivityTypeCode)get_store().find_element_user(ACTIVITYTYPE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ActivityType" element
     */
    public boolean isSetActivityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYTYPE$12) != 0;
        }
    }
    
    /**
     * Sets the "ActivityType" element
     */
    public void setActivityType(com.sap.xi.ap.common.gdt.OperationActivityTypeCode activityType)
    {
        generatedSetterHelperImpl(activityType, ACTIVITYTYPE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ActivityType" element
     */
    public com.sap.xi.ap.common.gdt.OperationActivityTypeCode addNewActivityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationActivityTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.OperationActivityTypeCode)get_store().add_element_user(ACTIVITYTYPE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "ActivityType" element
     */
    public void unsetActivityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYTYPE$12, 0);
        }
    }
    
    /**
     * Gets the "ActivityUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getActivityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(ACTIVITYUUID$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ActivityUUID" element
     */
    public boolean isSetActivityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYUUID$14) != 0;
        }
    }
    
    /**
     * Sets the "ActivityUUID" element
     */
    public void setActivityUUID(com.sap.xi.ap.common.gdt.UUID activityUUID)
    {
        generatedSetterHelperImpl(activityUUID, ACTIVITYUUID$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ActivityUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewActivityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(ACTIVITYUUID$14);
            return target;
        }
    }
    
    /**
     * Unsets the "ActivityUUID" element
     */
    public void unsetActivityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYUUID$14, 0);
        }
    }
    
    /**
     * Gets the "TargetLogisticsAreaID" element
     */
    public java.lang.String getTargetLogisticsAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETLOGISTICSAREAID$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TargetLogisticsAreaID" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsAreaID xgetTargetLogisticsAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsAreaID target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsAreaID)get_store().find_element_user(TARGETLOGISTICSAREAID$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "TargetLogisticsAreaID" element
     */
    public boolean isSetTargetLogisticsAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETLOGISTICSAREAID$16) != 0;
        }
    }
    
    /**
     * Sets the "TargetLogisticsAreaID" element
     */
    public void setTargetLogisticsAreaID(java.lang.String targetLogisticsAreaID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETLOGISTICSAREAID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETLOGISTICSAREAID$16);
            }
            target.setStringValue(targetLogisticsAreaID);
        }
    }
    
    /**
     * Sets (as xml) the "TargetLogisticsAreaID" element
     */
    public void xsetTargetLogisticsAreaID(com.sap.xi.ap.common.gdt.LogisticsAreaID targetLogisticsAreaID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsAreaID target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsAreaID)get_store().find_element_user(TARGETLOGISTICSAREAID$16, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogisticsAreaID)get_store().add_element_user(TARGETLOGISTICSAREAID$16);
            }
            target.set(targetLogisticsAreaID);
        }
    }
    
    /**
     * Unsets the "TargetLogisticsAreaID" element
     */
    public void unsetTargetLogisticsAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETLOGISTICSAREAID$16, 0);
        }
    }
    
    /**
     * Gets the "SplitIndicator" element
     */
    public boolean getSplitIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPLITINDICATOR$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SplitIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetSplitIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(SPLITINDICATOR$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "SplitIndicator" element
     */
    public boolean isSetSplitIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPLITINDICATOR$18) != 0;
        }
    }
    
    /**
     * Sets the "SplitIndicator" element
     */
    public void setSplitIndicator(boolean splitIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPLITINDICATOR$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPLITINDICATOR$18);
            }
            target.setBooleanValue(splitIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "SplitIndicator" element
     */
    public void xsetSplitIndicator(com.sap.xi.ap.common.gdt.Indicator splitIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(SPLITINDICATOR$18, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(SPLITINDICATOR$18);
            }
            target.set(splitIndicator);
        }
    }
    
    /**
     * Unsets the "SplitIndicator" element
     */
    public void unsetSplitIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPLITINDICATOR$18, 0);
        }
    }
    
    /**
     * Gets the "ConfirmationFinished" element
     */
    public boolean getConfirmationFinished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONFINISHED$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConfirmationFinished" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetConfirmationFinished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CONFIRMATIONFINISHED$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "ConfirmationFinished" element
     */
    public boolean isSetConfirmationFinished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMATIONFINISHED$20) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmationFinished" element
     */
    public void setConfirmationFinished(boolean confirmationFinished)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONFINISHED$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIRMATIONFINISHED$20);
            }
            target.setBooleanValue(confirmationFinished);
        }
    }
    
    /**
     * Sets (as xml) the "ConfirmationFinished" element
     */
    public void xsetConfirmationFinished(com.sap.xi.ap.common.gdt.Indicator confirmationFinished)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CONFIRMATIONFINISHED$20, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(CONFIRMATIONFINISHED$20);
            }
            target.set(confirmationFinished);
        }
    }
    
    /**
     * Unsets the "ConfirmationFinished" element
     */
    public void unsetConfirmationFinished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMATIONFINISHED$20, 0);
        }
    }
    
    /**
     * Gets the "PlannedIndicator" element
     */
    public boolean getPlannedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANNEDINDICATOR$22, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "PlannedIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetPlannedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(PLANNEDINDICATOR$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "PlannedIndicator" element
     */
    public boolean isSetPlannedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLANNEDINDICATOR$22) != 0;
        }
    }
    
    /**
     * Sets the "PlannedIndicator" element
     */
    public void setPlannedIndicator(boolean plannedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANNEDINDICATOR$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLANNEDINDICATOR$22);
            }
            target.setBooleanValue(plannedIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "PlannedIndicator" element
     */
    public void xsetPlannedIndicator(com.sap.xi.ap.common.gdt.Indicator plannedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(PLANNEDINDICATOR$22, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(PLANNEDINDICATOR$22);
            }
            target.set(plannedIndicator);
        }
    }
    
    /**
     * Unsets the "PlannedIndicator" element
     */
    public void unsetPlannedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLANNEDINDICATOR$22, 0);
        }
    }
    
    /**
     * Gets the "OperationID" element
     */
    public java.lang.String getOperationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONID$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OperationID" element
     */
    public com.sap.xi.ap.common.gdt.OperationID xgetOperationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationID target = null;
            target = (com.sap.xi.ap.common.gdt.OperationID)get_store().find_element_user(OPERATIONID$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "OperationID" element
     */
    public boolean isSetOperationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONID$24) != 0;
        }
    }
    
    /**
     * Sets the "OperationID" element
     */
    public void setOperationID(java.lang.String operationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONID$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONID$24);
            }
            target.setStringValue(operationID);
        }
    }
    
    /**
     * Sets (as xml) the "OperationID" element
     */
    public void xsetOperationID(com.sap.xi.ap.common.gdt.OperationID operationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationID target = null;
            target = (com.sap.xi.ap.common.gdt.OperationID)get_store().find_element_user(OPERATIONID$24, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.OperationID)get_store().add_element_user(OPERATIONID$24);
            }
            target.set(operationID);
        }
    }
    
    /**
     * Unsets the "OperationID" element
     */
    public void unsetOperationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONID$24, 0);
        }
    }
    
    /**
     * Gets the "SiteID" element
     */
    public com.sap.xi.ap.common.gdt.LocationID getSiteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LocationID target = null;
            target = (com.sap.xi.ap.common.gdt.LocationID)get_store().find_element_user(SITEID$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SiteID" element
     */
    public boolean isSetSiteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITEID$26) != 0;
        }
    }
    
    /**
     * Sets the "SiteID" element
     */
    public void setSiteID(com.sap.xi.ap.common.gdt.LocationID siteID)
    {
        generatedSetterHelperImpl(siteID, SITEID$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SiteID" element
     */
    public com.sap.xi.ap.common.gdt.LocationID addNewSiteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LocationID target = null;
            target = (com.sap.xi.ap.common.gdt.LocationID)get_store().add_element_user(SITEID$26);
            return target;
        }
    }
    
    /**
     * Unsets the "SiteID" element
     */
    public void unsetSiteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITEID$26, 0);
        }
    }
    
    /**
     * Gets the "ConfirmedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(CONFIRMEDQUANTITY$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConfirmedQuantity" element
     */
    public boolean isSetConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMEDQUANTITY$28) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmedQuantity" element
     */
    public void setConfirmedQuantity(com.sap.xi.ap.common.gdt.Quantity confirmedQuantity)
    {
        generatedSetterHelperImpl(confirmedQuantity, CONFIRMEDQUANTITY$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ConfirmedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(CONFIRMEDQUANTITY$28);
            return target;
        }
    }
    
    /**
     * Unsets the "ConfirmedQuantity" element
     */
    public void unsetConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMEDQUANTITY$28, 0);
        }
    }
    
    /**
     * Gets array of all "SerialNumber" elements
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest[] getSerialNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERIALNUMBER$30, targetList);
            com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest[] result = new com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SerialNumber" element
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest getSerialNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest)get_store().find_element_user(SERIALNUMBER$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SerialNumber" element
     */
    public int sizeOfSerialNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERIALNUMBER$30);
        }
    }
    
    /**
     * Sets array of all "SerialNumber" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSerialNumberArray(com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest[] serialNumberArray)
    {
        check_orphaned();
        arraySetterHelper(serialNumberArray, SERIALNUMBER$30);
    }
    
    /**
     * Sets ith "SerialNumber" element
     */
    public void setSerialNumberArray(int i, com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest serialNumber)
    {
        generatedSetterHelperImpl(serialNumber, SERIALNUMBER$30, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SerialNumber" element
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest insertNewSerialNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest)get_store().insert_element_user(SERIALNUMBER$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SerialNumber" element
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest addNewSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest)get_store().add_element_user(SERIALNUMBER$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "SerialNumber" element
     */
    public void removeSerialNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERIALNUMBER$30, i);
        }
    }
    
    /**
     * Gets the "ActionCode" attribute
     */
    public com.sap.xi.ap.common.gdt.ActionCode.Enum getActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$32);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ActionCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ActionCode" attribute
     */
    public com.sap.xi.ap.common.gdt.ActionCode xgetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ActionCode target = null;
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$32);
            return target;
        }
    }
    
    /**
     * True if has "ActionCode" attribute
     */
    public boolean isSetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTIONCODE$32) != null;
        }
    }
    
    /**
     * Sets the "ActionCode" attribute
     */
    public void setActionCode(com.sap.xi.ap.common.gdt.ActionCode.Enum actionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIONCODE$32);
            }
            target.setEnumValue(actionCode);
        }
    }
    
    /**
     * Sets (as xml) the "ActionCode" attribute
     */
    public void xsetActionCode(com.sap.xi.ap.common.gdt.ActionCode actionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ActionCode target = null;
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$32);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().add_attribute_user(ACTIONCODE$32);
            }
            target.set(actionCode);
        }
    }
    
    /**
     * Unsets the "ActionCode" attribute
     */
    public void unsetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTIONCODE$32);
        }
    }
}
