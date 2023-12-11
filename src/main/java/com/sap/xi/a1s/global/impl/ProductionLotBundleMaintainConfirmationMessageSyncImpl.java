/*
 * XML Type:  ProductionLotBundleMaintainConfirmationMessage_sync
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotBundleMaintainConfirmationMessage_sync(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotBundleMaintainConfirmationMessageSyncImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotBundleMaintainConfirmationMessageSyncImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTIONLOTRESPONSE$0 = 
        new javax.xml.namespace.QName("", "ProductionLotResponse");
    private static final javax.xml.namespace.QName EXCEPTIONMESSAGE$2 = 
        new javax.xml.namespace.QName("", "ExceptionMessage");
    
    
    /**
     * Gets array of all "ProductionLotResponse" elements
     */
    public com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations[] getProductionLotResponseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTIONLOTRESPONSE$0, targetList);
            com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations[] result = new com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProductionLotResponse" element
     */
    public com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations getProductionLotResponseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations target = null;
            target = (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations)get_store().find_element_user(PRODUCTIONLOTRESPONSE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ProductionLotResponse" element
     */
    public int sizeOfProductionLotResponseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONLOTRESPONSE$0);
        }
    }
    
    /**
     * Sets array of all "ProductionLotResponse" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProductionLotResponseArray(com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations[] productionLotResponseArray)
    {
        check_orphaned();
        arraySetterHelper(productionLotResponseArray, PRODUCTIONLOTRESPONSE$0);
    }
    
    /**
     * Sets ith "ProductionLotResponse" element
     */
    public void setProductionLotResponseArray(int i, com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations productionLotResponse)
    {
        generatedSetterHelperImpl(productionLotResponse, PRODUCTIONLOTRESPONSE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductionLotResponse" element
     */
    public com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations insertNewProductionLotResponse(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations target = null;
            target = (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations)get_store().insert_element_user(PRODUCTIONLOTRESPONSE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductionLotResponse" element
     */
    public com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations addNewProductionLotResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations target = null;
            target = (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmations)get_store().add_element_user(PRODUCTIONLOTRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProductionLotResponse" element
     */
    public void removeProductionLotResponse(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONLOTRESPONSE$0, i);
        }
    }
    
    /**
     * Gets the "ExceptionMessage" element
     */
    public com.sap.xi.a1s.global.ProductionLotBundleException getExceptionMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotBundleException target = null;
            target = (com.sap.xi.a1s.global.ProductionLotBundleException)get_store().find_element_user(EXCEPTIONMESSAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ExceptionMessage" element
     */
    public boolean isSetExceptionMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXCEPTIONMESSAGE$2) != 0;
        }
    }
    
    /**
     * Sets the "ExceptionMessage" element
     */
    public void setExceptionMessage(com.sap.xi.a1s.global.ProductionLotBundleException exceptionMessage)
    {
        generatedSetterHelperImpl(exceptionMessage, EXCEPTIONMESSAGE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ExceptionMessage" element
     */
    public com.sap.xi.a1s.global.ProductionLotBundleException addNewExceptionMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotBundleException target = null;
            target = (com.sap.xi.a1s.global.ProductionLotBundleException)get_store().add_element_user(EXCEPTIONMESSAGE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ExceptionMessage" element
     */
    public void unsetExceptionMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXCEPTIONMESSAGE$2, 0);
        }
    }
}
