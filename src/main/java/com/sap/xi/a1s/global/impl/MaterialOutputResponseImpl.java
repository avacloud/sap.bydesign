/*
 * XML Type:  MaterialOutputResponse
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialOutputResponse
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialOutputResponse(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialOutputResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialOutputResponse
{
    private static final long serialVersionUID = 1L;
    
    public MaterialOutputResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKDESCRIPTION$8 = 
        new javax.xml.namespace.QName("", "IdentifiedStockDescription");
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKTYPE$10 = 
        new javax.xml.namespace.QName("", "IdentifiedStockType");
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKID$12 = 
        new javax.xml.namespace.QName("", "IdentifiedStockID");
    private static final javax.xml.namespace.QName ACTIVITYID$14 = 
        new javax.xml.namespace.QName("", "ActivityID");
    private static final javax.xml.namespace.QName ACTIVITYTYPE$16 = 
        new javax.xml.namespace.QName("", "ActivityType");
    private static final javax.xml.namespace.QName ACTIVITYUUID$18 = 
        new javax.xml.namespace.QName("", "ActivityUUID");
    private static final javax.xml.namespace.QName TARGETLOGISTICSAREAID$20 = 
        new javax.xml.namespace.QName("", "TargetLogisticsAreaID");
    private static final javax.xml.namespace.QName CONFIRMATIONFINISHED$22 = 
        new javax.xml.namespace.QName("", "ConfirmationFinished");
    private static final javax.xml.namespace.QName PLANNEDINDICATOR$24 = 
        new javax.xml.namespace.QName("", "PlannedIndicator");
    private static final javax.xml.namespace.QName OPERATIONID$26 = 
        new javax.xml.namespace.QName("", "OperationID");
    private static final javax.xml.namespace.QName PLANNEDQUANTITY$28 = 
        new javax.xml.namespace.QName("", "PlannedQuantity");
    private static final javax.xml.namespace.QName TOTALCONFIRMEDQUANTITY$30 = 
        new javax.xml.namespace.QName("", "TotalConfirmedQuantity");
    private static final javax.xml.namespace.QName OPENQUANTITY$32 = 
        new javax.xml.namespace.QName("", "OpenQuantity");
    private static final javax.xml.namespace.QName PRODUCTSPECIFICATIONID$34 = 
        new javax.xml.namespace.QName("", "ProductSpecificationID");
    private static final javax.xml.namespace.QName PRODUCTSPECIFICATIONDESCRIPTION$36 = 
        new javax.xml.namespace.QName("", "ProductSpecificationDescription");
    private static final javax.xml.namespace.QName SITEID$38 = 
        new javax.xml.namespace.QName("", "SiteID");
    private static final javax.xml.namespace.QName SITEDESCRIPTION$40 = 
        new javax.xml.namespace.QName("", "SiteDescription");
    private static final javax.xml.namespace.QName MATERIALOUTPUTINSPECTION$42 = 
        new javax.xml.namespace.QName("", "MaterialOutputInspection");
    private static final javax.xml.namespace.QName SERIALNUMBER$44 = 
        new javax.xml.namespace.QName("", "SerialNumber");
    
    
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
     * Gets array of all "IdentifiedStockDescription" elements
     */
    public com.sap.xi.a1s.global.IdentifiedStockDescription[] getIdentifiedStockDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIEDSTOCKDESCRIPTION$8, targetList);
            com.sap.xi.a1s.global.IdentifiedStockDescription[] result = new com.sap.xi.a1s.global.IdentifiedStockDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IdentifiedStockDescription" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockDescription getIdentifiedStockDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockDescription target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockDescription)get_store().find_element_user(IDENTIFIEDSTOCKDESCRIPTION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "IdentifiedStockDescription" element
     */
    public int sizeOfIdentifiedStockDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIEDSTOCKDESCRIPTION$8);
        }
    }
    
    /**
     * Sets array of all "IdentifiedStockDescription" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifiedStockDescriptionArray(com.sap.xi.a1s.global.IdentifiedStockDescription[] identifiedStockDescriptionArray)
    {
        check_orphaned();
        arraySetterHelper(identifiedStockDescriptionArray, IDENTIFIEDSTOCKDESCRIPTION$8);
    }
    
    /**
     * Sets ith "IdentifiedStockDescription" element
     */
    public void setIdentifiedStockDescriptionArray(int i, com.sap.xi.a1s.global.IdentifiedStockDescription identifiedStockDescription)
    {
        generatedSetterHelperImpl(identifiedStockDescription, IDENTIFIEDSTOCKDESCRIPTION$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentifiedStockDescription" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockDescription insertNewIdentifiedStockDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockDescription target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockDescription)get_store().insert_element_user(IDENTIFIEDSTOCKDESCRIPTION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdentifiedStockDescription" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockDescription addNewIdentifiedStockDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockDescription target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockDescription)get_store().add_element_user(IDENTIFIEDSTOCKDESCRIPTION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "IdentifiedStockDescription" element
     */
    public void removeIdentifiedStockDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIEDSTOCKDESCRIPTION$8, i);
        }
    }
    
    /**
     * Gets the "IdentifiedStockType" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode getIdentifiedStockType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode)get_store().find_element_user(IDENTIFIEDSTOCKTYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IdentifiedStockType" element
     */
    public boolean isSetIdentifiedStockType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIEDSTOCKTYPE$10) != 0;
        }
    }
    
    /**
     * Sets the "IdentifiedStockType" element
     */
    public void setIdentifiedStockType(com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode identifiedStockType)
    {
        generatedSetterHelperImpl(identifiedStockType, IDENTIFIEDSTOCKTYPE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdentifiedStockType" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode addNewIdentifiedStockType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode)get_store().add_element_user(IDENTIFIEDSTOCKTYPE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "IdentifiedStockType" element
     */
    public void unsetIdentifiedStockType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIEDSTOCKTYPE$10, 0);
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
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID)get_store().find_element_user(IDENTIFIEDSTOCKID$12, 0);
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
            return get_store().count_elements(IDENTIFIEDSTOCKID$12) != 0;
        }
    }
    
    /**
     * Sets the "IdentifiedStockID" element
     */
    public void setIdentifiedStockID(com.sap.xi.ap.common.gdt.IdentifiedStockID identifiedStockID)
    {
        generatedSetterHelperImpl(identifiedStockID, IDENTIFIEDSTOCKID$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID)get_store().add_element_user(IDENTIFIEDSTOCKID$12);
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
            get_store().remove_element(IDENTIFIEDSTOCKID$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYID$14, 0);
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
            target = (com.sap.xi.ap.common.gdt.OperationActivityID)get_store().find_element_user(ACTIVITYID$14, 0);
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
            return get_store().count_elements(ACTIVITYID$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYID$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYID$14);
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
            target = (com.sap.xi.ap.common.gdt.OperationActivityID)get_store().find_element_user(ACTIVITYID$14, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.OperationActivityID)get_store().add_element_user(ACTIVITYID$14);
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
            get_store().remove_element(ACTIVITYID$14, 0);
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
            target = (com.sap.xi.ap.common.gdt.OperationActivityTypeCode)get_store().find_element_user(ACTIVITYTYPE$16, 0);
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
            return get_store().count_elements(ACTIVITYTYPE$16) != 0;
        }
    }
    
    /**
     * Sets the "ActivityType" element
     */
    public void setActivityType(com.sap.xi.ap.common.gdt.OperationActivityTypeCode activityType)
    {
        generatedSetterHelperImpl(activityType, ACTIVITYTYPE$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.OperationActivityTypeCode)get_store().add_element_user(ACTIVITYTYPE$16);
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
            get_store().remove_element(ACTIVITYTYPE$16, 0);
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
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(ACTIVITYUUID$18, 0);
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
            return get_store().count_elements(ACTIVITYUUID$18) != 0;
        }
    }
    
    /**
     * Sets the "ActivityUUID" element
     */
    public void setActivityUUID(com.sap.xi.ap.common.gdt.UUID activityUUID)
    {
        generatedSetterHelperImpl(activityUUID, ACTIVITYUUID$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(ACTIVITYUUID$18);
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
            get_store().remove_element(ACTIVITYUUID$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETLOGISTICSAREAID$20, 0);
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
            target = (com.sap.xi.ap.common.gdt.LogisticsAreaID)get_store().find_element_user(TARGETLOGISTICSAREAID$20, 0);
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
            return get_store().count_elements(TARGETLOGISTICSAREAID$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETLOGISTICSAREAID$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETLOGISTICSAREAID$20);
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
            target = (com.sap.xi.ap.common.gdt.LogisticsAreaID)get_store().find_element_user(TARGETLOGISTICSAREAID$20, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogisticsAreaID)get_store().add_element_user(TARGETLOGISTICSAREAID$20);
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
            get_store().remove_element(TARGETLOGISTICSAREAID$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONFINISHED$22, 0);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CONFIRMATIONFINISHED$22, 0);
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
            return get_store().count_elements(CONFIRMATIONFINISHED$22) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONFINISHED$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIRMATIONFINISHED$22);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CONFIRMATIONFINISHED$22, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(CONFIRMATIONFINISHED$22);
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
            get_store().remove_element(CONFIRMATIONFINISHED$22, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANNEDINDICATOR$24, 0);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(PLANNEDINDICATOR$24, 0);
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
            return get_store().count_elements(PLANNEDINDICATOR$24) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANNEDINDICATOR$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLANNEDINDICATOR$24);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(PLANNEDINDICATOR$24, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(PLANNEDINDICATOR$24);
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
            get_store().remove_element(PLANNEDINDICATOR$24, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONID$26, 0);
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
            target = (com.sap.xi.ap.common.gdt.OperationID)get_store().find_element_user(OPERATIONID$26, 0);
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
            return get_store().count_elements(OPERATIONID$26) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONID$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONID$26);
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
            target = (com.sap.xi.ap.common.gdt.OperationID)get_store().find_element_user(OPERATIONID$26, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.OperationID)get_store().add_element_user(OPERATIONID$26);
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
            get_store().remove_element(OPERATIONID$26, 0);
        }
    }
    
    /**
     * Gets the "PlannedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getPlannedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(PLANNEDQUANTITY$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PlannedQuantity" element
     */
    public boolean isSetPlannedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLANNEDQUANTITY$28) != 0;
        }
    }
    
    /**
     * Sets the "PlannedQuantity" element
     */
    public void setPlannedQuantity(com.sap.xi.ap.common.gdt.Quantity plannedQuantity)
    {
        generatedSetterHelperImpl(plannedQuantity, PLANNEDQUANTITY$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PlannedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewPlannedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(PLANNEDQUANTITY$28);
            return target;
        }
    }
    
    /**
     * Unsets the "PlannedQuantity" element
     */
    public void unsetPlannedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLANNEDQUANTITY$28, 0);
        }
    }
    
    /**
     * Gets the "TotalConfirmedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getTotalConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(TOTALCONFIRMEDQUANTITY$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TotalConfirmedQuantity" element
     */
    public boolean isSetTotalConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALCONFIRMEDQUANTITY$30) != 0;
        }
    }
    
    /**
     * Sets the "TotalConfirmedQuantity" element
     */
    public void setTotalConfirmedQuantity(com.sap.xi.ap.common.gdt.Quantity totalConfirmedQuantity)
    {
        generatedSetterHelperImpl(totalConfirmedQuantity, TOTALCONFIRMEDQUANTITY$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TotalConfirmedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewTotalConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(TOTALCONFIRMEDQUANTITY$30);
            return target;
        }
    }
    
    /**
     * Unsets the "TotalConfirmedQuantity" element
     */
    public void unsetTotalConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALCONFIRMEDQUANTITY$30, 0);
        }
    }
    
    /**
     * Gets the "OpenQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getOpenQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(OPENQUANTITY$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OpenQuantity" element
     */
    public boolean isSetOpenQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPENQUANTITY$32) != 0;
        }
    }
    
    /**
     * Sets the "OpenQuantity" element
     */
    public void setOpenQuantity(com.sap.xi.ap.common.gdt.Quantity openQuantity)
    {
        generatedSetterHelperImpl(openQuantity, OPENQUANTITY$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OpenQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewOpenQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(OPENQUANTITY$32);
            return target;
        }
    }
    
    /**
     * Unsets the "OpenQuantity" element
     */
    public void unsetOpenQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPENQUANTITY$32, 0);
        }
    }
    
    /**
     * Gets the "ProductSpecificationID" element
     */
    public com.sap.xi.ap.common.gdt.RequirementSpecificationID getProductSpecificationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.RequirementSpecificationID target = null;
            target = (com.sap.xi.ap.common.gdt.RequirementSpecificationID)get_store().find_element_user(PRODUCTSPECIFICATIONID$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductSpecificationID" element
     */
    public boolean isSetProductSpecificationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTSPECIFICATIONID$34) != 0;
        }
    }
    
    /**
     * Sets the "ProductSpecificationID" element
     */
    public void setProductSpecificationID(com.sap.xi.ap.common.gdt.RequirementSpecificationID productSpecificationID)
    {
        generatedSetterHelperImpl(productSpecificationID, PRODUCTSPECIFICATIONID$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductSpecificationID" element
     */
    public com.sap.xi.ap.common.gdt.RequirementSpecificationID addNewProductSpecificationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.RequirementSpecificationID target = null;
            target = (com.sap.xi.ap.common.gdt.RequirementSpecificationID)get_store().add_element_user(PRODUCTSPECIFICATIONID$34);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductSpecificationID" element
     */
    public void unsetProductSpecificationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTSPECIFICATIONID$34, 0);
        }
    }
    
    /**
     * Gets array of all "ProductSpecificationDescription" elements
     */
    public com.sap.xi.a1s.global.ProductSpecification[] getProductSpecificationDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTSPECIFICATIONDESCRIPTION$36, targetList);
            com.sap.xi.a1s.global.ProductSpecification[] result = new com.sap.xi.a1s.global.ProductSpecification[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProductSpecificationDescription" element
     */
    public com.sap.xi.a1s.global.ProductSpecification getProductSpecificationDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductSpecification target = null;
            target = (com.sap.xi.a1s.global.ProductSpecification)get_store().find_element_user(PRODUCTSPECIFICATIONDESCRIPTION$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ProductSpecificationDescription" element
     */
    public int sizeOfProductSpecificationDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTSPECIFICATIONDESCRIPTION$36);
        }
    }
    
    /**
     * Sets array of all "ProductSpecificationDescription" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProductSpecificationDescriptionArray(com.sap.xi.a1s.global.ProductSpecification[] productSpecificationDescriptionArray)
    {
        check_orphaned();
        arraySetterHelper(productSpecificationDescriptionArray, PRODUCTSPECIFICATIONDESCRIPTION$36);
    }
    
    /**
     * Sets ith "ProductSpecificationDescription" element
     */
    public void setProductSpecificationDescriptionArray(int i, com.sap.xi.a1s.global.ProductSpecification productSpecificationDescription)
    {
        generatedSetterHelperImpl(productSpecificationDescription, PRODUCTSPECIFICATIONDESCRIPTION$36, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductSpecificationDescription" element
     */
    public com.sap.xi.a1s.global.ProductSpecification insertNewProductSpecificationDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductSpecification target = null;
            target = (com.sap.xi.a1s.global.ProductSpecification)get_store().insert_element_user(PRODUCTSPECIFICATIONDESCRIPTION$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductSpecificationDescription" element
     */
    public com.sap.xi.a1s.global.ProductSpecification addNewProductSpecificationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductSpecification target = null;
            target = (com.sap.xi.a1s.global.ProductSpecification)get_store().add_element_user(PRODUCTSPECIFICATIONDESCRIPTION$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProductSpecificationDescription" element
     */
    public void removeProductSpecificationDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTSPECIFICATIONDESCRIPTION$36, i);
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
            target = (com.sap.xi.ap.common.gdt.LocationID)get_store().find_element_user(SITEID$38, 0);
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
            return get_store().count_elements(SITEID$38) != 0;
        }
    }
    
    /**
     * Sets the "SiteID" element
     */
    public void setSiteID(com.sap.xi.ap.common.gdt.LocationID siteID)
    {
        generatedSetterHelperImpl(siteID, SITEID$38, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.LocationID)get_store().add_element_user(SITEID$38);
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
            get_store().remove_element(SITEID$38, 0);
        }
    }
    
    /**
     * Gets array of all "SiteDescription" elements
     */
    public com.sap.xi.a1s.global.SiteDescription[] getSiteDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SITEDESCRIPTION$40, targetList);
            com.sap.xi.a1s.global.SiteDescription[] result = new com.sap.xi.a1s.global.SiteDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SiteDescription" element
     */
    public com.sap.xi.a1s.global.SiteDescription getSiteDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteDescription target = null;
            target = (com.sap.xi.a1s.global.SiteDescription)get_store().find_element_user(SITEDESCRIPTION$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SiteDescription" element
     */
    public int sizeOfSiteDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITEDESCRIPTION$40);
        }
    }
    
    /**
     * Sets array of all "SiteDescription" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSiteDescriptionArray(com.sap.xi.a1s.global.SiteDescription[] siteDescriptionArray)
    {
        check_orphaned();
        arraySetterHelper(siteDescriptionArray, SITEDESCRIPTION$40);
    }
    
    /**
     * Sets ith "SiteDescription" element
     */
    public void setSiteDescriptionArray(int i, com.sap.xi.a1s.global.SiteDescription siteDescription)
    {
        generatedSetterHelperImpl(siteDescription, SITEDESCRIPTION$40, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SiteDescription" element
     */
    public com.sap.xi.a1s.global.SiteDescription insertNewSiteDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteDescription target = null;
            target = (com.sap.xi.a1s.global.SiteDescription)get_store().insert_element_user(SITEDESCRIPTION$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SiteDescription" element
     */
    public com.sap.xi.a1s.global.SiteDescription addNewSiteDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteDescription target = null;
            target = (com.sap.xi.a1s.global.SiteDescription)get_store().add_element_user(SITEDESCRIPTION$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "SiteDescription" element
     */
    public void removeSiteDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITEDESCRIPTION$40, i);
        }
    }
    
    /**
     * Gets the "MaterialOutputInspection" element
     */
    public com.sap.xi.a1s.global.MaterialOutputInspectionDetails getMaterialOutputInspection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialOutputInspectionDetails target = null;
            target = (com.sap.xi.a1s.global.MaterialOutputInspectionDetails)get_store().find_element_user(MATERIALOUTPUTINSPECTION$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MaterialOutputInspection" element
     */
    public boolean isSetMaterialOutputInspection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATERIALOUTPUTINSPECTION$42) != 0;
        }
    }
    
    /**
     * Sets the "MaterialOutputInspection" element
     */
    public void setMaterialOutputInspection(com.sap.xi.a1s.global.MaterialOutputInspectionDetails materialOutputInspection)
    {
        generatedSetterHelperImpl(materialOutputInspection, MATERIALOUTPUTINSPECTION$42, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MaterialOutputInspection" element
     */
    public com.sap.xi.a1s.global.MaterialOutputInspectionDetails addNewMaterialOutputInspection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialOutputInspectionDetails target = null;
            target = (com.sap.xi.a1s.global.MaterialOutputInspectionDetails)get_store().add_element_user(MATERIALOUTPUTINSPECTION$42);
            return target;
        }
    }
    
    /**
     * Unsets the "MaterialOutputInspection" element
     */
    public void unsetMaterialOutputInspection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATERIALOUTPUTINSPECTION$42, 0);
        }
    }
    
    /**
     * Gets array of all "SerialNumber" elements
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy[] getSerialNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERIALNUMBER$44, targetList);
            com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy[] result = new com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SerialNumber" element
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy getSerialNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy)get_store().find_element_user(SERIALNUMBER$44, i);
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
            return get_store().count_elements(SERIALNUMBER$44);
        }
    }
    
    /**
     * Sets array of all "SerialNumber" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSerialNumberArray(com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy[] serialNumberArray)
    {
        check_orphaned();
        arraySetterHelper(serialNumberArray, SERIALNUMBER$44);
    }
    
    /**
     * Sets ith "SerialNumber" element
     */
    public void setSerialNumberArray(int i, com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy serialNumber)
    {
        generatedSetterHelperImpl(serialNumber, SERIALNUMBER$44, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SerialNumber" element
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy insertNewSerialNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy)get_store().insert_element_user(SERIALNUMBER$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SerialNumber" element
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy addNewSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy)get_store().add_element_user(SERIALNUMBER$44);
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
            get_store().remove_element(SERIALNUMBER$44, i);
        }
    }
}
