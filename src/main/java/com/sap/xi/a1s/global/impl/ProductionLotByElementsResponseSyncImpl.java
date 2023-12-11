/*
 * XML Type:  ProductionLotByElementsResponse_sync
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotByElementsResponseSync
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotByElementsResponse_sync(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotByElementsResponseSyncImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotByElementsResponseSync
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotByElementsResponseSyncImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTIONLOTID$0 = 
        new javax.xml.namespace.QName("", "ProductionLotID");
    private static final javax.xml.namespace.QName PRODUCTIONORDERID$2 = 
        new javax.xml.namespace.QName("", "ProductionOrderID");
    private static final javax.xml.namespace.QName PRODUCTIONORDERUUID$4 = 
        new javax.xml.namespace.QName("", "ProductionOrderUUID");
    private static final javax.xml.namespace.QName PRODUCTIONORDERSTATUS$6 = 
        new javax.xml.namespace.QName("", "ProductionOrderStatus");
    private static final javax.xml.namespace.QName PRODUCTIONLOTUUID$8 = 
        new javax.xml.namespace.QName("", "ProductionLotUUID");
    private static final javax.xml.namespace.QName PRODUCTIONLOTSTATUS$10 = 
        new javax.xml.namespace.QName("", "ProductionLotStatus");
    private static final javax.xml.namespace.QName MAINOUTPUTPRODUCTSITEID$12 = 
        new javax.xml.namespace.QName("", "MainOutputProductSiteID");
    private static final javax.xml.namespace.QName MAINOUTPUTPRODUCT$14 = 
        new javax.xml.namespace.QName("", "MainOutputProduct");
    private static final javax.xml.namespace.QName PRODUCTIONSTARTDATE$16 = 
        new javax.xml.namespace.QName("", "ProductionStartDate");
    private static final javax.xml.namespace.QName PRODUCTIONENDDATE$18 = 
        new javax.xml.namespace.QName("", "ProductionEndDate");
    private static final javax.xml.namespace.QName CONFIRMATIONGROUP$20 = 
        new javax.xml.namespace.QName("", "ConfirmationGroup");
    
    
    /**
     * Gets the "ProductionLotID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID getProductionLotID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID)get_store().find_element_user(PRODUCTIONLOTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductionLotID" element
     */
    public boolean isSetProductionLotID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONLOTID$0) != 0;
        }
    }
    
    /**
     * Sets the "ProductionLotID" element
     */
    public void setProductionLotID(com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID productionLotID)
    {
        generatedSetterHelperImpl(productionLotID, PRODUCTIONLOTID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductionLotID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID addNewProductionLotID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID)get_store().add_element_user(PRODUCTIONLOTID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductionLotID" element
     */
    public void unsetProductionLotID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONLOTID$0, 0);
        }
    }
    
    /**
     * Gets the "ProductionOrderID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID getProductionOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID)get_store().find_element_user(PRODUCTIONORDERID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductionOrderID" element
     */
    public boolean isSetProductionOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONORDERID$2) != 0;
        }
    }
    
    /**
     * Sets the "ProductionOrderID" element
     */
    public void setProductionOrderID(com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID productionOrderID)
    {
        generatedSetterHelperImpl(productionOrderID, PRODUCTIONORDERID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductionOrderID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID addNewProductionOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID)get_store().add_element_user(PRODUCTIONORDERID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductionOrderID" element
     */
    public void unsetProductionOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONORDERID$2, 0);
        }
    }
    
    /**
     * Gets the "ProductionOrderUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getProductionOrderUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(PRODUCTIONORDERUUID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductionOrderUUID" element
     */
    public boolean isSetProductionOrderUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONORDERUUID$4) != 0;
        }
    }
    
    /**
     * Sets the "ProductionOrderUUID" element
     */
    public void setProductionOrderUUID(com.sap.xi.ap.common.gdt.UUID productionOrderUUID)
    {
        generatedSetterHelperImpl(productionOrderUUID, PRODUCTIONORDERUUID$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductionOrderUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewProductionOrderUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(PRODUCTIONORDERUUID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductionOrderUUID" element
     */
    public void unsetProductionOrderUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONORDERUUID$4, 0);
        }
    }
    
    /**
     * Gets the "ProductionOrderStatus" element
     */
    public com.sap.xi.ap.logisticsexecution.global.LogisticsOrderStatus getProductionOrderStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.logisticsexecution.global.LogisticsOrderStatus target = null;
            target = (com.sap.xi.ap.logisticsexecution.global.LogisticsOrderStatus)get_store().find_element_user(PRODUCTIONORDERSTATUS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductionOrderStatus" element
     */
    public boolean isSetProductionOrderStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONORDERSTATUS$6) != 0;
        }
    }
    
    /**
     * Sets the "ProductionOrderStatus" element
     */
    public void setProductionOrderStatus(com.sap.xi.ap.logisticsexecution.global.LogisticsOrderStatus productionOrderStatus)
    {
        generatedSetterHelperImpl(productionOrderStatus, PRODUCTIONORDERSTATUS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductionOrderStatus" element
     */
    public com.sap.xi.ap.logisticsexecution.global.LogisticsOrderStatus addNewProductionOrderStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.logisticsexecution.global.LogisticsOrderStatus target = null;
            target = (com.sap.xi.ap.logisticsexecution.global.LogisticsOrderStatus)get_store().add_element_user(PRODUCTIONORDERSTATUS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductionOrderStatus" element
     */
    public void unsetProductionOrderStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONORDERSTATUS$6, 0);
        }
    }
    
    /**
     * Gets the "ProductionLotUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getProductionLotUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(PRODUCTIONLOTUUID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductionLotUUID" element
     */
    public boolean isSetProductionLotUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONLOTUUID$8) != 0;
        }
    }
    
    /**
     * Sets the "ProductionLotUUID" element
     */
    public void setProductionLotUUID(com.sap.xi.ap.common.gdt.UUID productionLotUUID)
    {
        generatedSetterHelperImpl(productionLotUUID, PRODUCTIONLOTUUID$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductionLotUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewProductionLotUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(PRODUCTIONLOTUUID$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductionLotUUID" element
     */
    public void unsetProductionLotUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONLOTUUID$8, 0);
        }
    }
    
    /**
     * Gets the "ProductionLotStatus" element
     */
    public com.sap.xi.a1s.global.ProductionLotStatus getProductionLotStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotStatus target = null;
            target = (com.sap.xi.a1s.global.ProductionLotStatus)get_store().find_element_user(PRODUCTIONLOTSTATUS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductionLotStatus" element
     */
    public boolean isSetProductionLotStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONLOTSTATUS$10) != 0;
        }
    }
    
    /**
     * Sets the "ProductionLotStatus" element
     */
    public void setProductionLotStatus(com.sap.xi.a1s.global.ProductionLotStatus productionLotStatus)
    {
        generatedSetterHelperImpl(productionLotStatus, PRODUCTIONLOTSTATUS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductionLotStatus" element
     */
    public com.sap.xi.a1s.global.ProductionLotStatus addNewProductionLotStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotStatus target = null;
            target = (com.sap.xi.a1s.global.ProductionLotStatus)get_store().add_element_user(PRODUCTIONLOTSTATUS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductionLotStatus" element
     */
    public void unsetProductionLotStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONLOTSTATUS$10, 0);
        }
    }
    
    /**
     * Gets the "MainOutputProductSiteID" element
     */
    public com.sap.xi.ap.common.gdt.SupplyPlanningAreaID getMainOutputProductSiteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SupplyPlanningAreaID target = null;
            target = (com.sap.xi.ap.common.gdt.SupplyPlanningAreaID)get_store().find_element_user(MAINOUTPUTPRODUCTSITEID$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MainOutputProductSiteID" element
     */
    public boolean isSetMainOutputProductSiteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAINOUTPUTPRODUCTSITEID$12) != 0;
        }
    }
    
    /**
     * Sets the "MainOutputProductSiteID" element
     */
    public void setMainOutputProductSiteID(com.sap.xi.ap.common.gdt.SupplyPlanningAreaID mainOutputProductSiteID)
    {
        generatedSetterHelperImpl(mainOutputProductSiteID, MAINOUTPUTPRODUCTSITEID$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MainOutputProductSiteID" element
     */
    public com.sap.xi.ap.common.gdt.SupplyPlanningAreaID addNewMainOutputProductSiteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SupplyPlanningAreaID target = null;
            target = (com.sap.xi.ap.common.gdt.SupplyPlanningAreaID)get_store().add_element_user(MAINOUTPUTPRODUCTSITEID$12);
            return target;
        }
    }
    
    /**
     * Unsets the "MainOutputProductSiteID" element
     */
    public void unsetMainOutputProductSiteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAINOUTPUTPRODUCTSITEID$12, 0);
        }
    }
    
    /**
     * Gets the "MainOutputProduct" element
     */
    public com.sap.xi.ap.common.gdt.ProductID getMainOutputProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().find_element_user(MAINOUTPUTPRODUCT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MainOutputProduct" element
     */
    public boolean isSetMainOutputProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAINOUTPUTPRODUCT$14) != 0;
        }
    }
    
    /**
     * Sets the "MainOutputProduct" element
     */
    public void setMainOutputProduct(com.sap.xi.ap.common.gdt.ProductID mainOutputProduct)
    {
        generatedSetterHelperImpl(mainOutputProduct, MAINOUTPUTPRODUCT$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MainOutputProduct" element
     */
    public com.sap.xi.ap.common.gdt.ProductID addNewMainOutputProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().add_element_user(MAINOUTPUTPRODUCT$14);
            return target;
        }
    }
    
    /**
     * Unsets the "MainOutputProduct" element
     */
    public void unsetMainOutputProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAINOUTPUTPRODUCT$14, 0);
        }
    }
    
    /**
     * Gets the "ProductionStartDate" element
     */
    public java.util.Calendar getProductionStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTIONSTARTDATE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductionStartDate" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetProductionStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(PRODUCTIONSTARTDATE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProductionStartDate" element
     */
    public boolean isSetProductionStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONSTARTDATE$16) != 0;
        }
    }
    
    /**
     * Sets the "ProductionStartDate" element
     */
    public void setProductionStartDate(java.util.Calendar productionStartDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTIONSTARTDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTIONSTARTDATE$16);
            }
            target.setCalendarValue(productionStartDate);
        }
    }
    
    /**
     * Sets (as xml) the "ProductionStartDate" element
     */
    public void xsetProductionStartDate(com.sap.xi.basis.global.GLOBALDateTime productionStartDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(PRODUCTIONSTARTDATE$16, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(PRODUCTIONSTARTDATE$16);
            }
            target.set(productionStartDate);
        }
    }
    
    /**
     * Unsets the "ProductionStartDate" element
     */
    public void unsetProductionStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONSTARTDATE$16, 0);
        }
    }
    
    /**
     * Gets the "ProductionEndDate" element
     */
    public java.util.Calendar getProductionEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTIONENDDATE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductionEndDate" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetProductionEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(PRODUCTIONENDDATE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProductionEndDate" element
     */
    public boolean isSetProductionEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONENDDATE$18) != 0;
        }
    }
    
    /**
     * Sets the "ProductionEndDate" element
     */
    public void setProductionEndDate(java.util.Calendar productionEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTIONENDDATE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTIONENDDATE$18);
            }
            target.setCalendarValue(productionEndDate);
        }
    }
    
    /**
     * Sets (as xml) the "ProductionEndDate" element
     */
    public void xsetProductionEndDate(com.sap.xi.basis.global.GLOBALDateTime productionEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(PRODUCTIONENDDATE$18, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(PRODUCTIONENDDATE$18);
            }
            target.set(productionEndDate);
        }
    }
    
    /**
     * Unsets the "ProductionEndDate" element
     */
    public void unsetProductionEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONENDDATE$18, 0);
        }
    }
    
    /**
     * Gets array of all "ConfirmationGroup" elements
     */
    public com.sap.xi.a1s.global.ProductionLotConfirmationGroup[] getConfirmationGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONFIRMATIONGROUP$20, targetList);
            com.sap.xi.a1s.global.ProductionLotConfirmationGroup[] result = new com.sap.xi.a1s.global.ProductionLotConfirmationGroup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConfirmationGroup" element
     */
    public com.sap.xi.a1s.global.ProductionLotConfirmationGroup getConfirmationGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotConfirmationGroup target = null;
            target = (com.sap.xi.a1s.global.ProductionLotConfirmationGroup)get_store().find_element_user(CONFIRMATIONGROUP$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ConfirmationGroup" element
     */
    public int sizeOfConfirmationGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMATIONGROUP$20);
        }
    }
    
    /**
     * Sets array of all "ConfirmationGroup" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setConfirmationGroupArray(com.sap.xi.a1s.global.ProductionLotConfirmationGroup[] confirmationGroupArray)
    {
        check_orphaned();
        arraySetterHelper(confirmationGroupArray, CONFIRMATIONGROUP$20);
    }
    
    /**
     * Sets ith "ConfirmationGroup" element
     */
    public void setConfirmationGroupArray(int i, com.sap.xi.a1s.global.ProductionLotConfirmationGroup confirmationGroup)
    {
        generatedSetterHelperImpl(confirmationGroup, CONFIRMATIONGROUP$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConfirmationGroup" element
     */
    public com.sap.xi.a1s.global.ProductionLotConfirmationGroup insertNewConfirmationGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotConfirmationGroup target = null;
            target = (com.sap.xi.a1s.global.ProductionLotConfirmationGroup)get_store().insert_element_user(CONFIRMATIONGROUP$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConfirmationGroup" element
     */
    public com.sap.xi.a1s.global.ProductionLotConfirmationGroup addNewConfirmationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotConfirmationGroup target = null;
            target = (com.sap.xi.a1s.global.ProductionLotConfirmationGroup)get_store().add_element_user(CONFIRMATIONGROUP$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConfirmationGroup" element
     */
    public void removeConfirmationGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMATIONGROUP$20, i);
        }
    }
}
