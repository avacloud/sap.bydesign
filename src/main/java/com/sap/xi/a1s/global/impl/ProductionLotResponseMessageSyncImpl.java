/*
 * XML Type:  ProductionLotResponseMessage_sync
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotResponseMessageSync
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotResponseMessage_sync(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotResponseMessageSyncImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotResponseMessageSync
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotResponseMessageSyncImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTIONLOT$0 = 
        new javax.xml.namespace.QName("", "ProductionLot");
    private static final javax.xml.namespace.QName PROCESSINGCONDITIONS$2 = 
        new javax.xml.namespace.QName("", "ProcessingConditions");
    private static final javax.xml.namespace.QName LOG$4 = 
        new javax.xml.namespace.QName("", "Log");
    
    
    /**
     * Gets array of all "ProductionLot" elements
     */
    public com.sap.xi.a1s.global.ProductionLotByElementsResponseSync[] getProductionLotArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTIONLOT$0, targetList);
            com.sap.xi.a1s.global.ProductionLotByElementsResponseSync[] result = new com.sap.xi.a1s.global.ProductionLotByElementsResponseSync[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProductionLot" element
     */
    public com.sap.xi.a1s.global.ProductionLotByElementsResponseSync getProductionLotArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotByElementsResponseSync target = null;
            target = (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync)get_store().find_element_user(PRODUCTIONLOT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ProductionLot" element
     */
    public int sizeOfProductionLotArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONLOT$0);
        }
    }
    
    /**
     * Sets array of all "ProductionLot" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProductionLotArray(com.sap.xi.a1s.global.ProductionLotByElementsResponseSync[] productionLotArray)
    {
        check_orphaned();
        arraySetterHelper(productionLotArray, PRODUCTIONLOT$0);
    }
    
    /**
     * Sets ith "ProductionLot" element
     */
    public void setProductionLotArray(int i, com.sap.xi.a1s.global.ProductionLotByElementsResponseSync productionLot)
    {
        generatedSetterHelperImpl(productionLot, PRODUCTIONLOT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductionLot" element
     */
    public com.sap.xi.a1s.global.ProductionLotByElementsResponseSync insertNewProductionLot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotByElementsResponseSync target = null;
            target = (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync)get_store().insert_element_user(PRODUCTIONLOT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductionLot" element
     */
    public com.sap.xi.a1s.global.ProductionLotByElementsResponseSync addNewProductionLot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotByElementsResponseSync target = null;
            target = (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync)get_store().add_element_user(PRODUCTIONLOT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProductionLot" element
     */
    public void removeProductionLot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONLOT$0, i);
        }
    }
    
    /**
     * Gets the "ProcessingConditions" element
     */
    public com.sap.xi.ap.common.gdt.ResponseProcessingConditions getProcessingConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ResponseProcessingConditions target = null;
            target = (com.sap.xi.ap.common.gdt.ResponseProcessingConditions)get_store().find_element_user(PROCESSINGCONDITIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProcessingConditions" element
     */
    public void setProcessingConditions(com.sap.xi.ap.common.gdt.ResponseProcessingConditions processingConditions)
    {
        generatedSetterHelperImpl(processingConditions, PROCESSINGCONDITIONS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProcessingConditions" element
     */
    public com.sap.xi.ap.common.gdt.ResponseProcessingConditions addNewProcessingConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ResponseProcessingConditions target = null;
            target = (com.sap.xi.ap.common.gdt.ResponseProcessingConditions)get_store().add_element_user(PROCESSINGCONDITIONS$2);
            return target;
        }
    }
    
    /**
     * Gets the "Log" element
     */
    public com.sap.xi.ap.common.gdt.Log getLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Log target = null;
            target = (com.sap.xi.ap.common.gdt.Log)get_store().find_element_user(LOG$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Log" element
     */
    public boolean isSetLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOG$4) != 0;
        }
    }
    
    /**
     * Sets the "Log" element
     */
    public void setLog(com.sap.xi.ap.common.gdt.Log log)
    {
        generatedSetterHelperImpl(log, LOG$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Log" element
     */
    public com.sap.xi.ap.common.gdt.Log addNewLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Log target = null;
            target = (com.sap.xi.ap.common.gdt.Log)get_store().add_element_user(LOG$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Log" element
     */
    public void unsetLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOG$4, 0);
        }
    }
}
