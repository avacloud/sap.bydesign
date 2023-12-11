/*
 * XML Type:  MaterialInputManageBundle_Response
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialInputManageBundleResponse
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialInputManageBundle_Response(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialInputManageBundleResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialInputManageBundleResponse
{
    private static final long serialVersionUID = 1L;
    
    public MaterialInputManageBundleResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATERIALINPUTUUID$0 = 
        new javax.xml.namespace.QName("", "MaterialInputUUID");
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
    private static final javax.xml.namespace.QName CONFIRMATIONMETHODCODE$16 = 
        new javax.xml.namespace.QName("", "ConfirmationMethodCode");
    private static final javax.xml.namespace.QName CONFIRMATIONFINISHED$18 = 
        new javax.xml.namespace.QName("", "ConfirmationFinished");
    private static final javax.xml.namespace.QName CONFIRMQUANTITY$20 = 
        new javax.xml.namespace.QName("", "ConfirmQuantity");
    private static final javax.xml.namespace.QName OPERATIONID$22 = 
        new javax.xml.namespace.QName("", "OperationID");
    private static final javax.xml.namespace.QName SOURCELOGISTICSAREAID$24 = 
        new javax.xml.namespace.QName("", "SourceLogisticsAreaID");
    private static final javax.xml.namespace.QName SPLITINDICATOR$26 = 
        new javax.xml.namespace.QName("", "SplitIndicator");
    private static final javax.xml.namespace.QName SITEID$28 = 
        new javax.xml.namespace.QName("", "SiteID");
    private static final javax.xml.namespace.QName PLANNEDINDICATOR$30 = 
        new javax.xml.namespace.QName("", "PlannedIndicator");
    private static final javax.xml.namespace.QName SERIALNUMBER$32 = 
        new javax.xml.namespace.QName("", "SerialNumber");
    private static final javax.xml.namespace.QName ACTIONCODE$34 = 
        new javax.xml.namespace.QName("", "ActionCode");
    
    
    /**
     * Gets the "MaterialInputUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getMaterialInputUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(MATERIALINPUTUUID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MaterialInputUUID" element
     */
    public boolean isSetMaterialInputUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATERIALINPUTUUID$0) != 0;
        }
    }
    
    /**
     * Sets the "MaterialInputUUID" element
     */
    public void setMaterialInputUUID(com.sap.xi.ap.common.gdt.UUID materialInputUUID)
    {
        generatedSetterHelperImpl(materialInputUUID, MATERIALINPUTUUID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MaterialInputUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewMaterialInputUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(MATERIALINPUTUUID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "MaterialInputUUID" element
     */
    public void unsetMaterialInputUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATERIALINPUTUUID$0, 0);
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
     * Gets the "ConfirmationMethodCode" element
     */
    public java.lang.String getConfirmationMethodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONMETHODCODE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConfirmationMethodCode" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode xgetConfirmationMethodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode)get_store().find_element_user(CONFIRMATIONMETHODCODE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "ConfirmationMethodCode" element
     */
    public boolean isSetConfirmationMethodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMATIONMETHODCODE$16) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmationMethodCode" element
     */
    public void setConfirmationMethodCode(java.lang.String confirmationMethodCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONMETHODCODE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIRMATIONMETHODCODE$16);
            }
            target.setStringValue(confirmationMethodCode);
        }
    }
    
    /**
     * Sets (as xml) the "ConfirmationMethodCode" element
     */
    public void xsetConfirmationMethodCode(com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode confirmationMethodCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode)get_store().find_element_user(CONFIRMATIONMETHODCODE$16, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode)get_store().add_element_user(CONFIRMATIONMETHODCODE$16);
            }
            target.set(confirmationMethodCode);
        }
    }
    
    /**
     * Unsets the "ConfirmationMethodCode" element
     */
    public void unsetConfirmationMethodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMATIONMETHODCODE$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONFINISHED$18, 0);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CONFIRMATIONFINISHED$18, 0);
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
            return get_store().count_elements(CONFIRMATIONFINISHED$18) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONFINISHED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIRMATIONFINISHED$18);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CONFIRMATIONFINISHED$18, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(CONFIRMATIONFINISHED$18);
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
            get_store().remove_element(CONFIRMATIONFINISHED$18, 0);
        }
    }
    
    /**
     * Gets the "ConfirmQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getConfirmQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(CONFIRMQUANTITY$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConfirmQuantity" element
     */
    public boolean isSetConfirmQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMQUANTITY$20) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmQuantity" element
     */
    public void setConfirmQuantity(com.sap.xi.ap.common.gdt.Quantity confirmQuantity)
    {
        generatedSetterHelperImpl(confirmQuantity, CONFIRMQUANTITY$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ConfirmQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewConfirmQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(CONFIRMQUANTITY$20);
            return target;
        }
    }
    
    /**
     * Unsets the "ConfirmQuantity" element
     */
    public void unsetConfirmQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMQUANTITY$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONID$22, 0);
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
            target = (com.sap.xi.ap.common.gdt.OperationID)get_store().find_element_user(OPERATIONID$22, 0);
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
            return get_store().count_elements(OPERATIONID$22) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONID$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONID$22);
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
            target = (com.sap.xi.ap.common.gdt.OperationID)get_store().find_element_user(OPERATIONID$22, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.OperationID)get_store().add_element_user(OPERATIONID$22);
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
            get_store().remove_element(OPERATIONID$22, 0);
        }
    }
    
    /**
     * Gets the "SourceLogisticsAreaID" element
     */
    public java.lang.String getSourceLogisticsAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCELOGISTICSAREAID$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceLogisticsAreaID" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsAreaID xgetSourceLogisticsAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsAreaID target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsAreaID)get_store().find_element_user(SOURCELOGISTICSAREAID$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "SourceLogisticsAreaID" element
     */
    public boolean isSetSourceLogisticsAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCELOGISTICSAREAID$24) != 0;
        }
    }
    
    /**
     * Sets the "SourceLogisticsAreaID" element
     */
    public void setSourceLogisticsAreaID(java.lang.String sourceLogisticsAreaID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCELOGISTICSAREAID$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCELOGISTICSAREAID$24);
            }
            target.setStringValue(sourceLogisticsAreaID);
        }
    }
    
    /**
     * Sets (as xml) the "SourceLogisticsAreaID" element
     */
    public void xsetSourceLogisticsAreaID(com.sap.xi.ap.common.gdt.LogisticsAreaID sourceLogisticsAreaID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsAreaID target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsAreaID)get_store().find_element_user(SOURCELOGISTICSAREAID$24, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogisticsAreaID)get_store().add_element_user(SOURCELOGISTICSAREAID$24);
            }
            target.set(sourceLogisticsAreaID);
        }
    }
    
    /**
     * Unsets the "SourceLogisticsAreaID" element
     */
    public void unsetSourceLogisticsAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCELOGISTICSAREAID$24, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPLITINDICATOR$26, 0);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(SPLITINDICATOR$26, 0);
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
            return get_store().count_elements(SPLITINDICATOR$26) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPLITINDICATOR$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPLITINDICATOR$26);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(SPLITINDICATOR$26, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(SPLITINDICATOR$26);
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
            get_store().remove_element(SPLITINDICATOR$26, 0);
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
            target = (com.sap.xi.ap.common.gdt.LocationID)get_store().find_element_user(SITEID$28, 0);
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
            return get_store().count_elements(SITEID$28) != 0;
        }
    }
    
    /**
     * Sets the "SiteID" element
     */
    public void setSiteID(com.sap.xi.ap.common.gdt.LocationID siteID)
    {
        generatedSetterHelperImpl(siteID, SITEID$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.LocationID)get_store().add_element_user(SITEID$28);
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
            get_store().remove_element(SITEID$28, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANNEDINDICATOR$30, 0);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(PLANNEDINDICATOR$30, 0);
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
            return get_store().count_elements(PLANNEDINDICATOR$30) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANNEDINDICATOR$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLANNEDINDICATOR$30);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(PLANNEDINDICATOR$30, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(PLANNEDINDICATOR$30);
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
            get_store().remove_element(PLANNEDINDICATOR$30, 0);
        }
    }
    
    /**
     * Gets array of all "SerialNumber" elements
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentManageBundleRequest[] getSerialNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERIALNUMBER$32, targetList);
            com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentManageBundleRequest[] result = new com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentManageBundleRequest[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SerialNumber" element
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentManageBundleRequest getSerialNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentManageBundleRequest target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentManageBundleRequest)get_store().find_element_user(SERIALNUMBER$32, i);
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
            return get_store().count_elements(SERIALNUMBER$32);
        }
    }
    
    /**
     * Sets array of all "SerialNumber" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSerialNumberArray(com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentManageBundleRequest[] serialNumberArray)
    {
        check_orphaned();
        arraySetterHelper(serialNumberArray, SERIALNUMBER$32);
    }
    
    /**
     * Sets ith "SerialNumber" element
     */
    public void setSerialNumberArray(int i, com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentManageBundleRequest serialNumber)
    {
        generatedSetterHelperImpl(serialNumber, SERIALNUMBER$32, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SerialNumber" element
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentManageBundleRequest insertNewSerialNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentManageBundleRequest target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentManageBundleRequest)get_store().insert_element_user(SERIALNUMBER$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SerialNumber" element
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentManageBundleRequest addNewSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentManageBundleRequest target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentManageBundleRequest)get_store().add_element_user(SERIALNUMBER$32);
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
            get_store().remove_element(SERIALNUMBER$32, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$34);
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
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$34);
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
            return get_store().find_attribute_user(ACTIONCODE$34) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIONCODE$34);
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
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$34);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().add_attribute_user(ACTIONCODE$34);
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
            get_store().remove_attribute(ACTIONCODE$34);
        }
    }
}
