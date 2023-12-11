/*
 * XML Type:  ProductionLotBundleMaintainConfirmations
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotBundleMaintainConfirmations(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotBundleMaintainConfirmationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotBundleMaintainConfirmationsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTIONLOTID$0 = 
        new javax.xml.namespace.QName("", "ProductionLotID");
    private static final javax.xml.namespace.QName PRODUCTIONLOTUUID$2 = 
        new javax.xml.namespace.QName("", "ProductionLotUUID");
    private static final javax.xml.namespace.QName PRODUCTIONLOTLOG$4 = 
        new javax.xml.namespace.QName("", "ProductionLotLog");
    
    
    /**
     * Gets the "ProductionLotID" element
     */
    public com.sap.xi.ap.common.gdt.ProductInternalID getProductionLotID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductInternalID)get_store().find_element_user(PRODUCTIONLOTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProductionLotID" element
     */
    public void setProductionLotID(com.sap.xi.ap.common.gdt.ProductInternalID productionLotID)
    {
        generatedSetterHelperImpl(productionLotID, PRODUCTIONLOTID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductionLotID" element
     */
    public com.sap.xi.ap.common.gdt.ProductInternalID addNewProductionLotID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductInternalID)get_store().add_element_user(PRODUCTIONLOTID$0);
            return target;
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
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(PRODUCTIONLOTUUID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProductionLotUUID" element
     */
    public void setProductionLotUUID(com.sap.xi.ap.common.gdt.UUID productionLotUUID)
    {
        generatedSetterHelperImpl(productionLotUUID, PRODUCTIONLOTUUID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(PRODUCTIONLOTUUID$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "ProductionLotLog" elements
     */
    public com.sap.xi.a1s.global.ProductionLotBundleLog[] getProductionLotLogArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTIONLOTLOG$4, targetList);
            com.sap.xi.a1s.global.ProductionLotBundleLog[] result = new com.sap.xi.a1s.global.ProductionLotBundleLog[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProductionLotLog" element
     */
    public com.sap.xi.a1s.global.ProductionLotBundleLog getProductionLotLogArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotBundleLog target = null;
            target = (com.sap.xi.a1s.global.ProductionLotBundleLog)get_store().find_element_user(PRODUCTIONLOTLOG$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ProductionLotLog" element
     */
    public int sizeOfProductionLotLogArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONLOTLOG$4);
        }
    }
    
    /**
     * Sets array of all "ProductionLotLog" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProductionLotLogArray(com.sap.xi.a1s.global.ProductionLotBundleLog[] productionLotLogArray)
    {
        check_orphaned();
        arraySetterHelper(productionLotLogArray, PRODUCTIONLOTLOG$4);
    }
    
    /**
     * Sets ith "ProductionLotLog" element
     */
    public void setProductionLotLogArray(int i, com.sap.xi.a1s.global.ProductionLotBundleLog productionLotLog)
    {
        generatedSetterHelperImpl(productionLotLog, PRODUCTIONLOTLOG$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductionLotLog" element
     */
    public com.sap.xi.a1s.global.ProductionLotBundleLog insertNewProductionLotLog(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotBundleLog target = null;
            target = (com.sap.xi.a1s.global.ProductionLotBundleLog)get_store().insert_element_user(PRODUCTIONLOTLOG$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductionLotLog" element
     */
    public com.sap.xi.a1s.global.ProductionLotBundleLog addNewProductionLotLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotBundleLog target = null;
            target = (com.sap.xi.a1s.global.ProductionLotBundleLog)get_store().add_element_user(PRODUCTIONLOTLOG$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProductionLotLog" element
     */
    public void removeProductionLotLog(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONLOTLOG$4, i);
        }
    }
}
