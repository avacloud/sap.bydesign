/*
 * XML Type:  ProdLotMaintainRequestBundleMessage_sync_V1
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMessageSyncV1
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProdLotMaintainRequestBundleMessage_sync_V1(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProdLotMaintainRequestBundleMessageSyncV1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMessageSyncV1
{
    private static final long serialVersionUID = 1L;
    
    public ProdLotMaintainRequestBundleMessageSyncV1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASICMESSAGEHEADER$0 = 
        new javax.xml.namespace.QName("", "BasicMessageHeader");
    private static final javax.xml.namespace.QName PRODUCTIONLOT$2 = 
        new javax.xml.namespace.QName("", "ProductionLot");
    
    
    /**
     * Gets the "BasicMessageHeader" element
     */
    public com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader getBasicMessageHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader)get_store().find_element_user(BASICMESSAGEHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BasicMessageHeader" element
     */
    public void setBasicMessageHeader(com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader basicMessageHeader)
    {
        generatedSetterHelperImpl(basicMessageHeader, BASICMESSAGEHEADER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BasicMessageHeader" element
     */
    public com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader addNewBasicMessageHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader)get_store().add_element_user(BASICMESSAGEHEADER$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "ProductionLot" elements
     */
    public com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1[] getProductionLotArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTIONLOT$2, targetList);
            com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1[] result = new com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProductionLot" element
     */
    public com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 getProductionLotArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 target = null;
            target = (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1)get_store().find_element_user(PRODUCTIONLOT$2, i);
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
            return get_store().count_elements(PRODUCTIONLOT$2);
        }
    }
    
    /**
     * Sets array of all "ProductionLot" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProductionLotArray(com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1[] productionLotArray)
    {
        check_orphaned();
        arraySetterHelper(productionLotArray, PRODUCTIONLOT$2);
    }
    
    /**
     * Sets ith "ProductionLot" element
     */
    public void setProductionLotArray(int i, com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 productionLot)
    {
        generatedSetterHelperImpl(productionLot, PRODUCTIONLOT$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductionLot" element
     */
    public com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 insertNewProductionLot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 target = null;
            target = (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1)get_store().insert_element_user(PRODUCTIONLOT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductionLot" element
     */
    public com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 addNewProductionLot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 target = null;
            target = (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1)get_store().add_element_user(PRODUCTIONLOT$2);
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
            get_store().remove_element(PRODUCTIONLOT$2, i);
        }
    }
}
