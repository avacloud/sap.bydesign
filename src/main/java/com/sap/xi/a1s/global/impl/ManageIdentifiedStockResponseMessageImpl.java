/*
 * XML Type:  ManageIdentifiedStockResponseMessage
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ManageIdentifiedStockResponseMessage
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ManageIdentifiedStockResponseMessage(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ManageIdentifiedStockResponseMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ManageIdentifiedStockResponseMessage
{
    private static final long serialVersionUID = 1L;
    
    public ManageIdentifiedStockResponseMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOG$0 = 
        new javax.xml.namespace.QName("", "Log");
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKRESPONSE$2 = 
        new javax.xml.namespace.QName("", "IdentifiedStockResponse");
    
    
    /**
     * Gets the "Log" element
     */
    public com.sap.xi.ap.common.gdt.Log getLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Log target = null;
            target = (com.sap.xi.ap.common.gdt.Log)get_store().find_element_user(LOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Log" element
     */
    public void setLog(com.sap.xi.ap.common.gdt.Log log)
    {
        generatedSetterHelperImpl(log, LOG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.Log)get_store().add_element_user(LOG$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "IdentifiedStockResponse" elements
     */
    public com.sap.xi.a1s.global.ManageIdentifiedStocksResponse[] getIdentifiedStockResponseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIEDSTOCKRESPONSE$2, targetList);
            com.sap.xi.a1s.global.ManageIdentifiedStocksResponse[] result = new com.sap.xi.a1s.global.ManageIdentifiedStocksResponse[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IdentifiedStockResponse" element
     */
    public com.sap.xi.a1s.global.ManageIdentifiedStocksResponse getIdentifiedStockResponseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ManageIdentifiedStocksResponse target = null;
            target = (com.sap.xi.a1s.global.ManageIdentifiedStocksResponse)get_store().find_element_user(IDENTIFIEDSTOCKRESPONSE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "IdentifiedStockResponse" element
     */
    public int sizeOfIdentifiedStockResponseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIEDSTOCKRESPONSE$2);
        }
    }
    
    /**
     * Sets array of all "IdentifiedStockResponse" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifiedStockResponseArray(com.sap.xi.a1s.global.ManageIdentifiedStocksResponse[] identifiedStockResponseArray)
    {
        check_orphaned();
        arraySetterHelper(identifiedStockResponseArray, IDENTIFIEDSTOCKRESPONSE$2);
    }
    
    /**
     * Sets ith "IdentifiedStockResponse" element
     */
    public void setIdentifiedStockResponseArray(int i, com.sap.xi.a1s.global.ManageIdentifiedStocksResponse identifiedStockResponse)
    {
        generatedSetterHelperImpl(identifiedStockResponse, IDENTIFIEDSTOCKRESPONSE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentifiedStockResponse" element
     */
    public com.sap.xi.a1s.global.ManageIdentifiedStocksResponse insertNewIdentifiedStockResponse(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ManageIdentifiedStocksResponse target = null;
            target = (com.sap.xi.a1s.global.ManageIdentifiedStocksResponse)get_store().insert_element_user(IDENTIFIEDSTOCKRESPONSE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdentifiedStockResponse" element
     */
    public com.sap.xi.a1s.global.ManageIdentifiedStocksResponse addNewIdentifiedStockResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ManageIdentifiedStocksResponse target = null;
            target = (com.sap.xi.a1s.global.ManageIdentifiedStocksResponse)get_store().add_element_user(IDENTIFIEDSTOCKRESPONSE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "IdentifiedStockResponse" element
     */
    public void removeIdentifiedStockResponse(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIEDSTOCKRESPONSE$2, i);
        }
    }
}
