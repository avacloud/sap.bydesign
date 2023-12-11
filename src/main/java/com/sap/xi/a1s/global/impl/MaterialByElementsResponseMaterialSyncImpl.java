/*
 * XML Type:  MaterialByElementsResponseMaterial_sync
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterial_sync(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialSyncImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialSyncImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHANGESTATEID$0 = 
        new javax.xml.namespace.QName("", "ChangeStateID");
    private static final javax.xml.namespace.QName INTERNALID$2 = 
        new javax.xml.namespace.QName("", "InternalID");
    private static final javax.xml.namespace.QName UUID$4 = 
        new javax.xml.namespace.QName("", "UUID");
    private static final javax.xml.namespace.QName SYSTEMADMINISTRATIVEDATA$6 = 
        new javax.xml.namespace.QName("", "SystemAdministrativeData");
    private static final javax.xml.namespace.QName PRODUCTCATEGORYID$8 = 
        new javax.xml.namespace.QName("", "ProductCategoryID");
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKTYPECODE$10 = 
        new javax.xml.namespace.QName("", "IdentifiedStockTypeCode");
    private static final javax.xml.namespace.QName BASEMEASUREUNITCODE$12 = 
        new javax.xml.namespace.QName("", "BaseMeasureUnitCode");
    private static final javax.xml.namespace.QName INVENTORYVALUATIONMEASUREUNITCODE$14 = 
        new javax.xml.namespace.QName("", "InventoryValuationMeasureUnitCode");
    private static final javax.xml.namespace.QName PLANNINGMEASUREUNITCODE$16 = 
        new javax.xml.namespace.QName("", "PlanningMeasureUnitCode");
    private static final javax.xml.namespace.QName DESCRIPTION$18 = 
        new javax.xml.namespace.QName("", "Description");
    private static final javax.xml.namespace.QName DETAIL$20 = 
        new javax.xml.namespace.QName("", "Detail");
    private static final javax.xml.namespace.QName QUANTITYCONVERSION$22 = 
        new javax.xml.namespace.QName("", "QuantityConversion");
    private static final javax.xml.namespace.QName QUANTITYCHARACTERISTIC$24 = 
        new javax.xml.namespace.QName("", "QuantityCharacteristic");
    private static final javax.xml.namespace.QName GLOBALTRADEITEMNUMBER$26 = 
        new javax.xml.namespace.QName("", "GlobalTradeItemNumber");
    private static final javax.xml.namespace.QName PURCHASING$28 = 
        new javax.xml.namespace.QName("", "Purchasing");
    private static final javax.xml.namespace.QName PLANNING$30 = 
        new javax.xml.namespace.QName("", "Planning");
    private static final javax.xml.namespace.QName AVAILABILITYCONFIRMATION$32 = 
        new javax.xml.namespace.QName("", "AvailabilityConfirmation");
    private static final javax.xml.namespace.QName SALES$34 = 
        new javax.xml.namespace.QName("", "Sales");
    private static final javax.xml.namespace.QName LOGISTICS$36 = 
        new javax.xml.namespace.QName("", "Logistics");
    private static final javax.xml.namespace.QName DEVIANTTAXCLASSIFICATION$38 = 
        new javax.xml.namespace.QName("", "DeviantTaxClassification");
    private static final javax.xml.namespace.QName WITHHOLDINGTAXCLASSIFICATION$40 = 
        new javax.xml.namespace.QName("", "WithholdingTaxClassification");
    private static final javax.xml.namespace.QName VALUATION$42 = 
        new javax.xml.namespace.QName("", "Valuation");
    private static final javax.xml.namespace.QName CUSTOMERPARTNUMBER$44 = 
        new javax.xml.namespace.QName("", "CustomerPartNumber");
    private static final javax.xml.namespace.QName SUPPLIERPARTNUMBER$46 = 
        new javax.xml.namespace.QName("", "SupplierPartNumber");
    private static final javax.xml.namespace.QName ATTACHMENTFOLDER$48 = 
        new javax.xml.namespace.QName("", "AttachmentFolder");
    private static final javax.xml.namespace.QName INDIACOSTAUDITINGTRADEDPRODUCTINDICATOR$50 = 
        new javax.xml.namespace.QName("http://sap.com/xi/AP/Globalization", "IndiaCostAuditingTradedProductIndicator");
    private static final javax.xml.namespace.QName INDIACOSTAUDITINGMANUFACTEREDPRODUCTINDICATOR$52 = 
        new javax.xml.namespace.QName("http://sap.com/xi/AP/Globalization", "IndiaCostAuditingManufacteredProductIndicator");
    private static final javax.xml.namespace.QName INDIAMATERIALTARIFFID$54 = 
        new javax.xml.namespace.QName("http://sap.com/xi/AP/Globalization", "IndiaMaterialTariffID");
    private static final javax.xml.namespace.QName MRPTEXTILEINDUSTRY$56 = 
        new javax.xml.namespace.QName("http://sap.com/xi/AP/Globalization", "MRPTextileIndustry");
    private static final javax.xml.namespace.QName HSNCODEINDIA$58 = 
        new javax.xml.namespace.QName("http://sap.com/xi/AP/Globalization", "HSNCodeIndia");
    private static final javax.xml.namespace.QName INDIAMATERIALTYPECODE$60 = 
        new javax.xml.namespace.QName("http://sap.com/xi/AP/Globalization", "IndiaMaterialTypeCode");
    
    
    /**
     * Gets the "ChangeStateID" element
     */
    public java.lang.String getChangeStateID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGESTATEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ChangeStateID" element
     */
    public com.sap.xi.ap.common.gdt.ChangeStateID xgetChangeStateID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ChangeStateID target = null;
            target = (com.sap.xi.ap.common.gdt.ChangeStateID)get_store().find_element_user(CHANGESTATEID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ChangeStateID" element
     */
    public boolean isSetChangeStateID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHANGESTATEID$0) != 0;
        }
    }
    
    /**
     * Sets the "ChangeStateID" element
     */
    public void setChangeStateID(java.lang.String changeStateID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGESTATEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGESTATEID$0);
            }
            target.setStringValue(changeStateID);
        }
    }
    
    /**
     * Sets (as xml) the "ChangeStateID" element
     */
    public void xsetChangeStateID(com.sap.xi.ap.common.gdt.ChangeStateID changeStateID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ChangeStateID target = null;
            target = (com.sap.xi.ap.common.gdt.ChangeStateID)get_store().find_element_user(CHANGESTATEID$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ChangeStateID)get_store().add_element_user(CHANGESTATEID$0);
            }
            target.set(changeStateID);
        }
    }
    
    /**
     * Unsets the "ChangeStateID" element
     */
    public void unsetChangeStateID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHANGESTATEID$0, 0);
        }
    }
    
    /**
     * Gets the "InternalID" element
     */
    public com.sap.xi.ap.common.gdt.ProductInternalID getInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductInternalID)get_store().find_element_user(INTERNALID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "InternalID" element
     */
    public boolean isSetInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERNALID$2) != 0;
        }
    }
    
    /**
     * Sets the "InternalID" element
     */
    public void setInternalID(com.sap.xi.ap.common.gdt.ProductInternalID internalID)
    {
        generatedSetterHelperImpl(internalID, INTERNALID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InternalID" element
     */
    public com.sap.xi.ap.common.gdt.ProductInternalID addNewInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductInternalID)get_store().add_element_user(INTERNALID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "InternalID" element
     */
    public void unsetInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERNALID$2, 0);
        }
    }
    
    /**
     * Gets the "UUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(UUID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "UUID" element
     */
    public boolean isSetUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UUID$4) != 0;
        }
    }
    
    /**
     * Sets the "UUID" element
     */
    public void setUUID(com.sap.xi.ap.common.gdt.UUID uuid)
    {
        generatedSetterHelperImpl(uuid, UUID$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(UUID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "UUID" element
     */
    public void unsetUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UUID$4, 0);
        }
    }
    
    /**
     * Gets the "SystemAdministrativeData" element
     */
    public com.sap.xi.ap.common.gdt.SystemAdministrativeData getSystemAdministrativeData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SystemAdministrativeData target = null;
            target = (com.sap.xi.ap.common.gdt.SystemAdministrativeData)get_store().find_element_user(SYSTEMADMINISTRATIVEDATA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SystemAdministrativeData" element
     */
    public boolean isSetSystemAdministrativeData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSTEMADMINISTRATIVEDATA$6) != 0;
        }
    }
    
    /**
     * Sets the "SystemAdministrativeData" element
     */
    public void setSystemAdministrativeData(com.sap.xi.ap.common.gdt.SystemAdministrativeData systemAdministrativeData)
    {
        generatedSetterHelperImpl(systemAdministrativeData, SYSTEMADMINISTRATIVEDATA$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SystemAdministrativeData" element
     */
    public com.sap.xi.ap.common.gdt.SystemAdministrativeData addNewSystemAdministrativeData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SystemAdministrativeData target = null;
            target = (com.sap.xi.ap.common.gdt.SystemAdministrativeData)get_store().add_element_user(SYSTEMADMINISTRATIVEDATA$6);
            return target;
        }
    }
    
    /**
     * Unsets the "SystemAdministrativeData" element
     */
    public void unsetSystemAdministrativeData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSTEMADMINISTRATIVEDATA$6, 0);
        }
    }
    
    /**
     * Gets the "ProductCategoryID" element
     */
    public java.lang.String getProductCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORYID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductCategoryID" element
     */
    public com.sap.xi.ap.common.gdt.ProductCategoryInternalID xgetProductCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductCategoryInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductCategoryInternalID)get_store().find_element_user(PRODUCTCATEGORYID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProductCategoryID" element
     */
    public boolean isSetProductCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCATEGORYID$8) != 0;
        }
    }
    
    /**
     * Sets the "ProductCategoryID" element
     */
    public void setProductCategoryID(java.lang.String productCategoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORYID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCATEGORYID$8);
            }
            target.setStringValue(productCategoryID);
        }
    }
    
    /**
     * Sets (as xml) the "ProductCategoryID" element
     */
    public void xsetProductCategoryID(com.sap.xi.ap.common.gdt.ProductCategoryInternalID productCategoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductCategoryInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductCategoryInternalID)get_store().find_element_user(PRODUCTCATEGORYID$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProductCategoryInternalID)get_store().add_element_user(PRODUCTCATEGORYID$8);
            }
            target.set(productCategoryID);
        }
    }
    
    /**
     * Unsets the "ProductCategoryID" element
     */
    public void unsetProductCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCATEGORYID$8, 0);
        }
    }
    
    /**
     * Gets the "IdentifiedStockTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode getIdentifiedStockTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode)get_store().find_element_user(IDENTIFIEDSTOCKTYPECODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IdentifiedStockTypeCode" element
     */
    public boolean isSetIdentifiedStockTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIEDSTOCKTYPECODE$10) != 0;
        }
    }
    
    /**
     * Sets the "IdentifiedStockTypeCode" element
     */
    public void setIdentifiedStockTypeCode(com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode identifiedStockTypeCode)
    {
        generatedSetterHelperImpl(identifiedStockTypeCode, IDENTIFIEDSTOCKTYPECODE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdentifiedStockTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode addNewIdentifiedStockTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode)get_store().add_element_user(IDENTIFIEDSTOCKTYPECODE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "IdentifiedStockTypeCode" element
     */
    public void unsetIdentifiedStockTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIEDSTOCKTYPECODE$10, 0);
        }
    }
    
    /**
     * Gets the "BaseMeasureUnitCode" element
     */
    public java.lang.String getBaseMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASEMEASUREUNITCODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BaseMeasureUnitCode" element
     */
    public com.sap.xi.ap.common.gdt.MeasureUnitCode xgetBaseMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MeasureUnitCode target = null;
            target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().find_element_user(BASEMEASUREUNITCODE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "BaseMeasureUnitCode" element
     */
    public boolean isSetBaseMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BASEMEASUREUNITCODE$12) != 0;
        }
    }
    
    /**
     * Sets the "BaseMeasureUnitCode" element
     */
    public void setBaseMeasureUnitCode(java.lang.String baseMeasureUnitCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASEMEASUREUNITCODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASEMEASUREUNITCODE$12);
            }
            target.setStringValue(baseMeasureUnitCode);
        }
    }
    
    /**
     * Sets (as xml) the "BaseMeasureUnitCode" element
     */
    public void xsetBaseMeasureUnitCode(com.sap.xi.ap.common.gdt.MeasureUnitCode baseMeasureUnitCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MeasureUnitCode target = null;
            target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().find_element_user(BASEMEASUREUNITCODE$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().add_element_user(BASEMEASUREUNITCODE$12);
            }
            target.set(baseMeasureUnitCode);
        }
    }
    
    /**
     * Unsets the "BaseMeasureUnitCode" element
     */
    public void unsetBaseMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BASEMEASUREUNITCODE$12, 0);
        }
    }
    
    /**
     * Gets the "InventoryValuationMeasureUnitCode" element
     */
    public java.lang.String getInventoryValuationMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVENTORYVALUATIONMEASUREUNITCODE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InventoryValuationMeasureUnitCode" element
     */
    public com.sap.xi.ap.common.gdt.MeasureUnitCode xgetInventoryValuationMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MeasureUnitCode target = null;
            target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().find_element_user(INVENTORYVALUATIONMEASUREUNITCODE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "InventoryValuationMeasureUnitCode" element
     */
    public boolean isSetInventoryValuationMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVENTORYVALUATIONMEASUREUNITCODE$14) != 0;
        }
    }
    
    /**
     * Sets the "InventoryValuationMeasureUnitCode" element
     */
    public void setInventoryValuationMeasureUnitCode(java.lang.String inventoryValuationMeasureUnitCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVENTORYVALUATIONMEASUREUNITCODE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVENTORYVALUATIONMEASUREUNITCODE$14);
            }
            target.setStringValue(inventoryValuationMeasureUnitCode);
        }
    }
    
    /**
     * Sets (as xml) the "InventoryValuationMeasureUnitCode" element
     */
    public void xsetInventoryValuationMeasureUnitCode(com.sap.xi.ap.common.gdt.MeasureUnitCode inventoryValuationMeasureUnitCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MeasureUnitCode target = null;
            target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().find_element_user(INVENTORYVALUATIONMEASUREUNITCODE$14, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().add_element_user(INVENTORYVALUATIONMEASUREUNITCODE$14);
            }
            target.set(inventoryValuationMeasureUnitCode);
        }
    }
    
    /**
     * Unsets the "InventoryValuationMeasureUnitCode" element
     */
    public void unsetInventoryValuationMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVENTORYVALUATIONMEASUREUNITCODE$14, 0);
        }
    }
    
    /**
     * Gets the "PlanningMeasureUnitCode" element
     */
    public java.lang.String getPlanningMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANNINGMEASUREUNITCODE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PlanningMeasureUnitCode" element
     */
    public com.sap.xi.ap.common.gdt.MeasureUnitCode xgetPlanningMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MeasureUnitCode target = null;
            target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().find_element_user(PLANNINGMEASUREUNITCODE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "PlanningMeasureUnitCode" element
     */
    public boolean isSetPlanningMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLANNINGMEASUREUNITCODE$16) != 0;
        }
    }
    
    /**
     * Sets the "PlanningMeasureUnitCode" element
     */
    public void setPlanningMeasureUnitCode(java.lang.String planningMeasureUnitCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANNINGMEASUREUNITCODE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLANNINGMEASUREUNITCODE$16);
            }
            target.setStringValue(planningMeasureUnitCode);
        }
    }
    
    /**
     * Sets (as xml) the "PlanningMeasureUnitCode" element
     */
    public void xsetPlanningMeasureUnitCode(com.sap.xi.ap.common.gdt.MeasureUnitCode planningMeasureUnitCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MeasureUnitCode target = null;
            target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().find_element_user(PLANNINGMEASUREUNITCODE$16, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().add_element_user(PLANNINGMEASUREUNITCODE$16);
            }
            target.set(planningMeasureUnitCode);
        }
    }
    
    /**
     * Unsets the "PlanningMeasureUnitCode" element
     */
    public void unsetPlanningMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLANNINGMEASUREUNITCODE$16, 0);
        }
    }
    
    /**
     * Gets array of all "Description" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDescription[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIPTION$18, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDescription[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Description" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDescription getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDescription target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDescription)get_store().find_element_user(DESCRIPTION$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Description" element
     */
    public int sizeOfDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$18);
        }
    }
    
    /**
     * Sets array of all "Description" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDescriptionArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDescription[] descriptionArray)
    {
        check_orphaned();
        arraySetterHelper(descriptionArray, DESCRIPTION$18);
    }
    
    /**
     * Sets ith "Description" element
     */
    public void setDescriptionArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDescription description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Description" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDescription insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDescription target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDescription)get_store().insert_element_user(DESCRIPTION$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Description" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDescription addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDescription target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDescription)get_store().add_element_user(DESCRIPTION$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "Description" element
     */
    public void removeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$18, i);
        }
    }
    
    /**
     * Gets array of all "Detail" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText[] getDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DETAIL$20, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Detail" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText getDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText)get_store().find_element_user(DETAIL$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Detail" element
     */
    public int sizeOfDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAIL$20);
        }
    }
    
    /**
     * Sets array of all "Detail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDetailArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText[] detailArray)
    {
        check_orphaned();
        arraySetterHelper(detailArray, DETAIL$20);
    }
    
    /**
     * Sets ith "Detail" element
     */
    public void setDetailArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText detail)
    {
        generatedSetterHelperImpl(detail, DETAIL$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Detail" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText insertNewDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText)get_store().insert_element_user(DETAIL$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Detail" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText addNewDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText)get_store().add_element_user(DETAIL$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "Detail" element
     */
    public void removeDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAIL$20, i);
        }
    }
    
    /**
     * Gets array of all "QuantityConversion" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQuantityConversion[] getQuantityConversionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUANTITYCONVERSION$22, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQuantityConversion[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQuantityConversion[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QuantityConversion" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQuantityConversion getQuantityConversionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQuantityConversion target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQuantityConversion)get_store().find_element_user(QUANTITYCONVERSION$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "QuantityConversion" element
     */
    public int sizeOfQuantityConversionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITYCONVERSION$22);
        }
    }
    
    /**
     * Sets array of all "QuantityConversion" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setQuantityConversionArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQuantityConversion[] quantityConversionArray)
    {
        check_orphaned();
        arraySetterHelper(quantityConversionArray, QUANTITYCONVERSION$22);
    }
    
    /**
     * Sets ith "QuantityConversion" element
     */
    public void setQuantityConversionArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQuantityConversion quantityConversion)
    {
        generatedSetterHelperImpl(quantityConversion, QUANTITYCONVERSION$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuantityConversion" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQuantityConversion insertNewQuantityConversion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQuantityConversion target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQuantityConversion)get_store().insert_element_user(QUANTITYCONVERSION$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuantityConversion" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQuantityConversion addNewQuantityConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQuantityConversion target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQuantityConversion)get_store().add_element_user(QUANTITYCONVERSION$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "QuantityConversion" element
     */
    public void removeQuantityConversion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITYCONVERSION$22, i);
        }
    }
    
    /**
     * Gets array of all "QuantityCharacteristic" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQunantityCharacteristics[] getQuantityCharacteristicArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUANTITYCHARACTERISTIC$24, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQunantityCharacteristics[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQunantityCharacteristics[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QuantityCharacteristic" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQunantityCharacteristics getQuantityCharacteristicArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQunantityCharacteristics target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQunantityCharacteristics)get_store().find_element_user(QUANTITYCHARACTERISTIC$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "QuantityCharacteristic" element
     */
    public int sizeOfQuantityCharacteristicArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITYCHARACTERISTIC$24);
        }
    }
    
    /**
     * Sets array of all "QuantityCharacteristic" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setQuantityCharacteristicArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQunantityCharacteristics[] quantityCharacteristicArray)
    {
        check_orphaned();
        arraySetterHelper(quantityCharacteristicArray, QUANTITYCHARACTERISTIC$24);
    }
    
    /**
     * Sets ith "QuantityCharacteristic" element
     */
    public void setQuantityCharacteristicArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQunantityCharacteristics quantityCharacteristic)
    {
        generatedSetterHelperImpl(quantityCharacteristic, QUANTITYCHARACTERISTIC$24, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuantityCharacteristic" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQunantityCharacteristics insertNewQuantityCharacteristic(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQunantityCharacteristics target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQunantityCharacteristics)get_store().insert_element_user(QUANTITYCHARACTERISTIC$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuantityCharacteristic" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQunantityCharacteristics addNewQuantityCharacteristic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQunantityCharacteristics target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQunantityCharacteristics)get_store().add_element_user(QUANTITYCHARACTERISTIC$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "QuantityCharacteristic" element
     */
    public void removeQuantityCharacteristic(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITYCHARACTERISTIC$24, i);
        }
    }
    
    /**
     * Gets array of all "GlobalTradeItemNumber" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialGlobaldTradeItemNumber[] getGlobalTradeItemNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GLOBALTRADEITEMNUMBER$26, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialGlobaldTradeItemNumber[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialGlobaldTradeItemNumber[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "GlobalTradeItemNumber" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialGlobaldTradeItemNumber getGlobalTradeItemNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialGlobaldTradeItemNumber target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialGlobaldTradeItemNumber)get_store().find_element_user(GLOBALTRADEITEMNUMBER$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "GlobalTradeItemNumber" element
     */
    public int sizeOfGlobalTradeItemNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GLOBALTRADEITEMNUMBER$26);
        }
    }
    
    /**
     * Sets array of all "GlobalTradeItemNumber" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGlobalTradeItemNumberArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialGlobaldTradeItemNumber[] globalTradeItemNumberArray)
    {
        check_orphaned();
        arraySetterHelper(globalTradeItemNumberArray, GLOBALTRADEITEMNUMBER$26);
    }
    
    /**
     * Sets ith "GlobalTradeItemNumber" element
     */
    public void setGlobalTradeItemNumberArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialGlobaldTradeItemNumber globalTradeItemNumber)
    {
        generatedSetterHelperImpl(globalTradeItemNumber, GLOBALTRADEITEMNUMBER$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "GlobalTradeItemNumber" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialGlobaldTradeItemNumber insertNewGlobalTradeItemNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialGlobaldTradeItemNumber target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialGlobaldTradeItemNumber)get_store().insert_element_user(GLOBALTRADEITEMNUMBER$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GlobalTradeItemNumber" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialGlobaldTradeItemNumber addNewGlobalTradeItemNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialGlobaldTradeItemNumber target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialGlobaldTradeItemNumber)get_store().add_element_user(GLOBALTRADEITEMNUMBER$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "GlobalTradeItemNumber" element
     */
    public void removeGlobalTradeItemNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GLOBALTRADEITEMNUMBER$26, i);
        }
    }
    
    /**
     * Gets the "Purchasing" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing getPurchasing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing)get_store().find_element_user(PURCHASING$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Purchasing" element
     */
    public boolean isSetPurchasing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PURCHASING$28) != 0;
        }
    }
    
    /**
     * Sets the "Purchasing" element
     */
    public void setPurchasing(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing purchasing)
    {
        generatedSetterHelperImpl(purchasing, PURCHASING$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Purchasing" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing addNewPurchasing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing)get_store().add_element_user(PURCHASING$28);
            return target;
        }
    }
    
    /**
     * Unsets the "Purchasing" element
     */
    public void unsetPurchasing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PURCHASING$28, 0);
        }
    }
    
    /**
     * Gets the "Planning" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPlanning getPlanning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPlanning target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPlanning)get_store().find_element_user(PLANNING$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Planning" element
     */
    public boolean isSetPlanning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLANNING$30) != 0;
        }
    }
    
    /**
     * Sets the "Planning" element
     */
    public void setPlanning(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPlanning planning)
    {
        generatedSetterHelperImpl(planning, PLANNING$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Planning" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPlanning addNewPlanning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPlanning target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPlanning)get_store().add_element_user(PLANNING$30);
            return target;
        }
    }
    
    /**
     * Unsets the "Planning" element
     */
    public void unsetPlanning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLANNING$30, 0);
        }
    }
    
    /**
     * Gets array of all "AvailabilityConfirmation" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation[] getAvailabilityConfirmationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AVAILABILITYCONFIRMATION$32, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AvailabilityConfirmation" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation getAvailabilityConfirmationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation)get_store().find_element_user(AVAILABILITYCONFIRMATION$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AvailabilityConfirmation" element
     */
    public int sizeOfAvailabilityConfirmationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AVAILABILITYCONFIRMATION$32);
        }
    }
    
    /**
     * Sets array of all "AvailabilityConfirmation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAvailabilityConfirmationArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation[] availabilityConfirmationArray)
    {
        check_orphaned();
        arraySetterHelper(availabilityConfirmationArray, AVAILABILITYCONFIRMATION$32);
    }
    
    /**
     * Sets ith "AvailabilityConfirmation" element
     */
    public void setAvailabilityConfirmationArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation availabilityConfirmation)
    {
        generatedSetterHelperImpl(availabilityConfirmation, AVAILABILITYCONFIRMATION$32, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AvailabilityConfirmation" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation insertNewAvailabilityConfirmation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation)get_store().insert_element_user(AVAILABILITYCONFIRMATION$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AvailabilityConfirmation" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation addNewAvailabilityConfirmation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialAvailabilityConfirmation)get_store().add_element_user(AVAILABILITYCONFIRMATION$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "AvailabilityConfirmation" element
     */
    public void removeAvailabilityConfirmation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AVAILABILITYCONFIRMATION$32, i);
        }
    }
    
    /**
     * Gets array of all "Sales" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales[] getSalesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SALES$34, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Sales" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales getSalesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales)get_store().find_element_user(SALES$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Sales" element
     */
    public int sizeOfSalesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALES$34);
        }
    }
    
    /**
     * Sets array of all "Sales" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSalesArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales[] salesArray)
    {
        check_orphaned();
        arraySetterHelper(salesArray, SALES$34);
    }
    
    /**
     * Sets ith "Sales" element
     */
    public void setSalesArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales sales)
    {
        generatedSetterHelperImpl(sales, SALES$34, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Sales" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales insertNewSales(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales)get_store().insert_element_user(SALES$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Sales" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales addNewSales()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales)get_store().add_element_user(SALES$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "Sales" element
     */
    public void removeSales(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALES$34, i);
        }
    }
    
    /**
     * Gets array of all "Logistics" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics[] getLogisticsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOGISTICS$36, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Logistics" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics getLogisticsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics)get_store().find_element_user(LOGISTICS$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Logistics" element
     */
    public int sizeOfLogisticsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGISTICS$36);
        }
    }
    
    /**
     * Sets array of all "Logistics" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLogisticsArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics[] logisticsArray)
    {
        check_orphaned();
        arraySetterHelper(logisticsArray, LOGISTICS$36);
    }
    
    /**
     * Sets ith "Logistics" element
     */
    public void setLogisticsArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics logistics)
    {
        generatedSetterHelperImpl(logistics, LOGISTICS$36, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Logistics" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics insertNewLogistics(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics)get_store().insert_element_user(LOGISTICS$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Logistics" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics addNewLogistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics)get_store().add_element_user(LOGISTICS$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "Logistics" element
     */
    public void removeLogistics(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGISTICS$36, i);
        }
    }
    
    /**
     * Gets array of all "DeviantTaxClassification" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification[] getDeviantTaxClassificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEVIANTTAXCLASSIFICATION$38, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DeviantTaxClassification" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification getDeviantTaxClassificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification)get_store().find_element_user(DEVIANTTAXCLASSIFICATION$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DeviantTaxClassification" element
     */
    public int sizeOfDeviantTaxClassificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEVIANTTAXCLASSIFICATION$38);
        }
    }
    
    /**
     * Sets array of all "DeviantTaxClassification" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDeviantTaxClassificationArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification[] deviantTaxClassificationArray)
    {
        check_orphaned();
        arraySetterHelper(deviantTaxClassificationArray, DEVIANTTAXCLASSIFICATION$38);
    }
    
    /**
     * Sets ith "DeviantTaxClassification" element
     */
    public void setDeviantTaxClassificationArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification deviantTaxClassification)
    {
        generatedSetterHelperImpl(deviantTaxClassification, DEVIANTTAXCLASSIFICATION$38, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DeviantTaxClassification" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification insertNewDeviantTaxClassification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification)get_store().insert_element_user(DEVIANTTAXCLASSIFICATION$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DeviantTaxClassification" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification addNewDeviantTaxClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification)get_store().add_element_user(DEVIANTTAXCLASSIFICATION$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "DeviantTaxClassification" element
     */
    public void removeDeviantTaxClassification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEVIANTTAXCLASSIFICATION$38, i);
        }
    }
    
    /**
     * Gets array of all "WithholdingTaxClassification" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialWithholdingTaxClassification[] getWithholdingTaxClassificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WITHHOLDINGTAXCLASSIFICATION$40, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialWithholdingTaxClassification[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialWithholdingTaxClassification[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "WithholdingTaxClassification" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialWithholdingTaxClassification getWithholdingTaxClassificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialWithholdingTaxClassification target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialWithholdingTaxClassification)get_store().find_element_user(WITHHOLDINGTAXCLASSIFICATION$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "WithholdingTaxClassification" element
     */
    public int sizeOfWithholdingTaxClassificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WITHHOLDINGTAXCLASSIFICATION$40);
        }
    }
    
    /**
     * Sets array of all "WithholdingTaxClassification" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setWithholdingTaxClassificationArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialWithholdingTaxClassification[] withholdingTaxClassificationArray)
    {
        check_orphaned();
        arraySetterHelper(withholdingTaxClassificationArray, WITHHOLDINGTAXCLASSIFICATION$40);
    }
    
    /**
     * Sets ith "WithholdingTaxClassification" element
     */
    public void setWithholdingTaxClassificationArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialWithholdingTaxClassification withholdingTaxClassification)
    {
        generatedSetterHelperImpl(withholdingTaxClassification, WITHHOLDINGTAXCLASSIFICATION$40, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "WithholdingTaxClassification" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialWithholdingTaxClassification insertNewWithholdingTaxClassification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialWithholdingTaxClassification target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialWithholdingTaxClassification)get_store().insert_element_user(WITHHOLDINGTAXCLASSIFICATION$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "WithholdingTaxClassification" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialWithholdingTaxClassification addNewWithholdingTaxClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialWithholdingTaxClassification target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialWithholdingTaxClassification)get_store().add_element_user(WITHHOLDINGTAXCLASSIFICATION$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "WithholdingTaxClassification" element
     */
    public void removeWithholdingTaxClassification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WITHHOLDINGTAXCLASSIFICATION$40, i);
        }
    }
    
    /**
     * Gets array of all "Valuation" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialValuation[] getValuationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUATION$42, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialValuation[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialValuation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Valuation" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialValuation getValuationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialValuation target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialValuation)get_store().find_element_user(VALUATION$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Valuation" element
     */
    public int sizeOfValuationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUATION$42);
        }
    }
    
    /**
     * Sets array of all "Valuation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setValuationArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialValuation[] valuationArray)
    {
        check_orphaned();
        arraySetterHelper(valuationArray, VALUATION$42);
    }
    
    /**
     * Sets ith "Valuation" element
     */
    public void setValuationArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialValuation valuation)
    {
        generatedSetterHelperImpl(valuation, VALUATION$42, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Valuation" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialValuation insertNewValuation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialValuation target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialValuation)get_store().insert_element_user(VALUATION$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Valuation" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialValuation addNewValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialValuation target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialValuation)get_store().add_element_user(VALUATION$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "Valuation" element
     */
    public void removeValuation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUATION$42, i);
        }
    }
    
    /**
     * Gets array of all "CustomerPartNumber" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialCustomerPartNumber[] getCustomerPartNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMERPARTNUMBER$44, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialCustomerPartNumber[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialCustomerPartNumber[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CustomerPartNumber" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialCustomerPartNumber getCustomerPartNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialCustomerPartNumber target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialCustomerPartNumber)get_store().find_element_user(CUSTOMERPARTNUMBER$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CustomerPartNumber" element
     */
    public int sizeOfCustomerPartNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERPARTNUMBER$44);
        }
    }
    
    /**
     * Sets array of all "CustomerPartNumber" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCustomerPartNumberArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialCustomerPartNumber[] customerPartNumberArray)
    {
        check_orphaned();
        arraySetterHelper(customerPartNumberArray, CUSTOMERPARTNUMBER$44);
    }
    
    /**
     * Sets ith "CustomerPartNumber" element
     */
    public void setCustomerPartNumberArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialCustomerPartNumber customerPartNumber)
    {
        generatedSetterHelperImpl(customerPartNumber, CUSTOMERPARTNUMBER$44, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CustomerPartNumber" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialCustomerPartNumber insertNewCustomerPartNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialCustomerPartNumber target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialCustomerPartNumber)get_store().insert_element_user(CUSTOMERPARTNUMBER$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CustomerPartNumber" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialCustomerPartNumber addNewCustomerPartNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialCustomerPartNumber target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialCustomerPartNumber)get_store().add_element_user(CUSTOMERPARTNUMBER$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "CustomerPartNumber" element
     */
    public void removeCustomerPartNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERPARTNUMBER$44, i);
        }
    }
    
    /**
     * Gets array of all "SupplierPartNumber" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplierPartNumber[] getSupplierPartNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPPLIERPARTNUMBER$46, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplierPartNumber[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplierPartNumber[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SupplierPartNumber" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplierPartNumber getSupplierPartNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplierPartNumber target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplierPartNumber)get_store().find_element_user(SUPPLIERPARTNUMBER$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SupplierPartNumber" element
     */
    public int sizeOfSupplierPartNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLIERPARTNUMBER$46);
        }
    }
    
    /**
     * Sets array of all "SupplierPartNumber" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSupplierPartNumberArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplierPartNumber[] supplierPartNumberArray)
    {
        check_orphaned();
        arraySetterHelper(supplierPartNumberArray, SUPPLIERPARTNUMBER$46);
    }
    
    /**
     * Sets ith "SupplierPartNumber" element
     */
    public void setSupplierPartNumberArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplierPartNumber supplierPartNumber)
    {
        generatedSetterHelperImpl(supplierPartNumber, SUPPLIERPARTNUMBER$46, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SupplierPartNumber" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplierPartNumber insertNewSupplierPartNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplierPartNumber target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplierPartNumber)get_store().insert_element_user(SUPPLIERPARTNUMBER$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SupplierPartNumber" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplierPartNumber addNewSupplierPartNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplierPartNumber target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplierPartNumber)get_store().add_element_user(SUPPLIERPARTNUMBER$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "SupplierPartNumber" element
     */
    public void removeSupplierPartNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLIERPARTNUMBER$46, i);
        }
    }
    
    /**
     * Gets the "AttachmentFolder" element
     */
    public com.sap.xi.documentservices.global.AccessAttachmentFolder getAttachmentFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessAttachmentFolder target = null;
            target = (com.sap.xi.documentservices.global.AccessAttachmentFolder)get_store().find_element_user(ATTACHMENTFOLDER$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AttachmentFolder" element
     */
    public boolean isSetAttachmentFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTFOLDER$48) != 0;
        }
    }
    
    /**
     * Sets the "AttachmentFolder" element
     */
    public void setAttachmentFolder(com.sap.xi.documentservices.global.AccessAttachmentFolder attachmentFolder)
    {
        generatedSetterHelperImpl(attachmentFolder, ATTACHMENTFOLDER$48, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AttachmentFolder" element
     */
    public com.sap.xi.documentservices.global.AccessAttachmentFolder addNewAttachmentFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessAttachmentFolder target = null;
            target = (com.sap.xi.documentservices.global.AccessAttachmentFolder)get_store().add_element_user(ATTACHMENTFOLDER$48);
            return target;
        }
    }
    
    /**
     * Unsets the "AttachmentFolder" element
     */
    public void unsetAttachmentFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTFOLDER$48, 0);
        }
    }
    
    /**
     * Gets the "IndiaCostAuditingTradedProductIndicator" element
     */
    public boolean getIndiaCostAuditingTradedProductIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIACOSTAUDITINGTRADEDPRODUCTINDICATOR$50, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IndiaCostAuditingTradedProductIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetIndiaCostAuditingTradedProductIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(INDIACOSTAUDITINGTRADEDPRODUCTINDICATOR$50, 0);
            return target;
        }
    }
    
    /**
     * True if has "IndiaCostAuditingTradedProductIndicator" element
     */
    public boolean isSetIndiaCostAuditingTradedProductIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDIACOSTAUDITINGTRADEDPRODUCTINDICATOR$50) != 0;
        }
    }
    
    /**
     * Sets the "IndiaCostAuditingTradedProductIndicator" element
     */
    public void setIndiaCostAuditingTradedProductIndicator(boolean indiaCostAuditingTradedProductIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIACOSTAUDITINGTRADEDPRODUCTINDICATOR$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDIACOSTAUDITINGTRADEDPRODUCTINDICATOR$50);
            }
            target.setBooleanValue(indiaCostAuditingTradedProductIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "IndiaCostAuditingTradedProductIndicator" element
     */
    public void xsetIndiaCostAuditingTradedProductIndicator(com.sap.xi.ap.common.gdt.Indicator indiaCostAuditingTradedProductIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(INDIACOSTAUDITINGTRADEDPRODUCTINDICATOR$50, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(INDIACOSTAUDITINGTRADEDPRODUCTINDICATOR$50);
            }
            target.set(indiaCostAuditingTradedProductIndicator);
        }
    }
    
    /**
     * Unsets the "IndiaCostAuditingTradedProductIndicator" element
     */
    public void unsetIndiaCostAuditingTradedProductIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDIACOSTAUDITINGTRADEDPRODUCTINDICATOR$50, 0);
        }
    }
    
    /**
     * Gets the "IndiaCostAuditingManufacteredProductIndicator" element
     */
    public boolean getIndiaCostAuditingManufacteredProductIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIACOSTAUDITINGMANUFACTEREDPRODUCTINDICATOR$52, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IndiaCostAuditingManufacteredProductIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetIndiaCostAuditingManufacteredProductIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(INDIACOSTAUDITINGMANUFACTEREDPRODUCTINDICATOR$52, 0);
            return target;
        }
    }
    
    /**
     * True if has "IndiaCostAuditingManufacteredProductIndicator" element
     */
    public boolean isSetIndiaCostAuditingManufacteredProductIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDIACOSTAUDITINGMANUFACTEREDPRODUCTINDICATOR$52) != 0;
        }
    }
    
    /**
     * Sets the "IndiaCostAuditingManufacteredProductIndicator" element
     */
    public void setIndiaCostAuditingManufacteredProductIndicator(boolean indiaCostAuditingManufacteredProductIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIACOSTAUDITINGMANUFACTEREDPRODUCTINDICATOR$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDIACOSTAUDITINGMANUFACTEREDPRODUCTINDICATOR$52);
            }
            target.setBooleanValue(indiaCostAuditingManufacteredProductIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "IndiaCostAuditingManufacteredProductIndicator" element
     */
    public void xsetIndiaCostAuditingManufacteredProductIndicator(com.sap.xi.ap.common.gdt.Indicator indiaCostAuditingManufacteredProductIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(INDIACOSTAUDITINGMANUFACTEREDPRODUCTINDICATOR$52, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(INDIACOSTAUDITINGMANUFACTEREDPRODUCTINDICATOR$52);
            }
            target.set(indiaCostAuditingManufacteredProductIndicator);
        }
    }
    
    /**
     * Unsets the "IndiaCostAuditingManufacteredProductIndicator" element
     */
    public void unsetIndiaCostAuditingManufacteredProductIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDIACOSTAUDITINGMANUFACTEREDPRODUCTINDICATOR$52, 0);
        }
    }
    
    /**
     * Gets the "IndiaMaterialTariffID" element
     */
    public java.lang.String getIndiaMaterialTariffID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIAMATERIALTARIFFID$54, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IndiaMaterialTariffID" element
     */
    public com.sap.xi.ap.common.gdt.INMaterialTariffID xgetIndiaMaterialTariffID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.INMaterialTariffID target = null;
            target = (com.sap.xi.ap.common.gdt.INMaterialTariffID)get_store().find_element_user(INDIAMATERIALTARIFFID$54, 0);
            return target;
        }
    }
    
    /**
     * True if has "IndiaMaterialTariffID" element
     */
    public boolean isSetIndiaMaterialTariffID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDIAMATERIALTARIFFID$54) != 0;
        }
    }
    
    /**
     * Sets the "IndiaMaterialTariffID" element
     */
    public void setIndiaMaterialTariffID(java.lang.String indiaMaterialTariffID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIAMATERIALTARIFFID$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDIAMATERIALTARIFFID$54);
            }
            target.setStringValue(indiaMaterialTariffID);
        }
    }
    
    /**
     * Sets (as xml) the "IndiaMaterialTariffID" element
     */
    public void xsetIndiaMaterialTariffID(com.sap.xi.ap.common.gdt.INMaterialTariffID indiaMaterialTariffID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.INMaterialTariffID target = null;
            target = (com.sap.xi.ap.common.gdt.INMaterialTariffID)get_store().find_element_user(INDIAMATERIALTARIFFID$54, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.INMaterialTariffID)get_store().add_element_user(INDIAMATERIALTARIFFID$54);
            }
            target.set(indiaMaterialTariffID);
        }
    }
    
    /**
     * Unsets the "IndiaMaterialTariffID" element
     */
    public void unsetIndiaMaterialTariffID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDIAMATERIALTARIFFID$54, 0);
        }
    }
    
    /**
     * Gets the "MRPTextileIndustry" element
     */
    public com.sap.xi.ap.common.gdt.Amount getMRPTextileIndustry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Amount target = null;
            target = (com.sap.xi.ap.common.gdt.Amount)get_store().find_element_user(MRPTEXTILEINDUSTRY$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MRPTextileIndustry" element
     */
    public boolean isSetMRPTextileIndustry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MRPTEXTILEINDUSTRY$56) != 0;
        }
    }
    
    /**
     * Sets the "MRPTextileIndustry" element
     */
    public void setMRPTextileIndustry(com.sap.xi.ap.common.gdt.Amount mrpTextileIndustry)
    {
        generatedSetterHelperImpl(mrpTextileIndustry, MRPTEXTILEINDUSTRY$56, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MRPTextileIndustry" element
     */
    public com.sap.xi.ap.common.gdt.Amount addNewMRPTextileIndustry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Amount target = null;
            target = (com.sap.xi.ap.common.gdt.Amount)get_store().add_element_user(MRPTEXTILEINDUSTRY$56);
            return target;
        }
    }
    
    /**
     * Unsets the "MRPTextileIndustry" element
     */
    public void unsetMRPTextileIndustry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MRPTEXTILEINDUSTRY$56, 0);
        }
    }
    
    /**
     * Gets the "HSNCodeIndia" element
     */
    public com.sap.xi.ap.common.gdt.ProductTaxStandardClassificationCode getHSNCodeIndia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductTaxStandardClassificationCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProductTaxStandardClassificationCode)get_store().find_element_user(HSNCODEINDIA$58, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "HSNCodeIndia" element
     */
    public boolean isSetHSNCodeIndia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HSNCODEINDIA$58) != 0;
        }
    }
    
    /**
     * Sets the "HSNCodeIndia" element
     */
    public void setHSNCodeIndia(com.sap.xi.ap.common.gdt.ProductTaxStandardClassificationCode hsnCodeIndia)
    {
        generatedSetterHelperImpl(hsnCodeIndia, HSNCODEINDIA$58, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "HSNCodeIndia" element
     */
    public com.sap.xi.ap.common.gdt.ProductTaxStandardClassificationCode addNewHSNCodeIndia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductTaxStandardClassificationCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProductTaxStandardClassificationCode)get_store().add_element_user(HSNCODEINDIA$58);
            return target;
        }
    }
    
    /**
     * Unsets the "HSNCodeIndia" element
     */
    public void unsetHSNCodeIndia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HSNCODEINDIA$58, 0);
        }
    }
    
    /**
     * Gets the "IndiaMaterialTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.ProductTaxStandardClassificationCode getIndiaMaterialTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductTaxStandardClassificationCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProductTaxStandardClassificationCode)get_store().find_element_user(INDIAMATERIALTYPECODE$60, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IndiaMaterialTypeCode" element
     */
    public boolean isSetIndiaMaterialTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDIAMATERIALTYPECODE$60) != 0;
        }
    }
    
    /**
     * Sets the "IndiaMaterialTypeCode" element
     */
    public void setIndiaMaterialTypeCode(com.sap.xi.ap.common.gdt.ProductTaxStandardClassificationCode indiaMaterialTypeCode)
    {
        generatedSetterHelperImpl(indiaMaterialTypeCode, INDIAMATERIALTYPECODE$60, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IndiaMaterialTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.ProductTaxStandardClassificationCode addNewIndiaMaterialTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductTaxStandardClassificationCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProductTaxStandardClassificationCode)get_store().add_element_user(INDIAMATERIALTYPECODE$60);
            return target;
        }
    }
    
    /**
     * Unsets the "IndiaMaterialTypeCode" element
     */
    public void unsetIndiaMaterialTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDIAMATERIALTYPECODE$60, 0);
        }
    }
}
