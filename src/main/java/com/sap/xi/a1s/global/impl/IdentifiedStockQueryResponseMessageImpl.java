/*
 * XML Type:  IdentifiedStockQueryResponseMessage
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML IdentifiedStockQueryResponseMessage(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class IdentifiedStockQueryResponseMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiedStockQueryResponseMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESSINGCONDITIONS$0 = 
        new javax.xml.namespace.QName("", "ProcessingConditions");
    private static final javax.xml.namespace.QName LOG$2 = 
        new javax.xml.namespace.QName("", "Log");
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCK$4 = 
        new javax.xml.namespace.QName("", "IdentifiedStock");
    
    
    /**
     * Gets the "ProcessingConditions" element
     */
    public com.sap.xi.ap.common.gdt.ResponseProcessingConditions getProcessingConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ResponseProcessingConditions target = null;
            target = (com.sap.xi.ap.common.gdt.ResponseProcessingConditions)get_store().find_element_user(PROCESSINGCONDITIONS$0, 0);
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
        generatedSetterHelperImpl(processingConditions, PROCESSINGCONDITIONS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.ResponseProcessingConditions)get_store().add_element_user(PROCESSINGCONDITIONS$0);
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
            target = (com.sap.xi.ap.common.gdt.Log)get_store().find_element_user(LOG$2, 0);
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
        generatedSetterHelperImpl(log, LOG$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.Log)get_store().add_element_user(LOG$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "IdentifiedStock" elements
     */
    public com.sap.xi.a1s.global.IdentifiedStockQueryResponse[] getIdentifiedStockArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIEDSTOCK$4, targetList);
            com.sap.xi.a1s.global.IdentifiedStockQueryResponse[] result = new com.sap.xi.a1s.global.IdentifiedStockQueryResponse[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IdentifiedStock" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockQueryResponse getIdentifiedStockArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockQueryResponse target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockQueryResponse)get_store().find_element_user(IDENTIFIEDSTOCK$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "IdentifiedStock" element
     */
    public int sizeOfIdentifiedStockArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIEDSTOCK$4);
        }
    }
    
    /**
     * Sets array of all "IdentifiedStock" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifiedStockArray(com.sap.xi.a1s.global.IdentifiedStockQueryResponse[] identifiedStockArray)
    {
        check_orphaned();
        arraySetterHelper(identifiedStockArray, IDENTIFIEDSTOCK$4);
    }
    
    /**
     * Sets ith "IdentifiedStock" element
     */
    public void setIdentifiedStockArray(int i, com.sap.xi.a1s.global.IdentifiedStockQueryResponse identifiedStock)
    {
        generatedSetterHelperImpl(identifiedStock, IDENTIFIEDSTOCK$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentifiedStock" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockQueryResponse insertNewIdentifiedStock(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockQueryResponse target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockQueryResponse)get_store().insert_element_user(IDENTIFIEDSTOCK$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdentifiedStock" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockQueryResponse addNewIdentifiedStock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockQueryResponse target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockQueryResponse)get_store().add_element_user(IDENTIFIEDSTOCK$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "IdentifiedStock" element
     */
    public void removeIdentifiedStock(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIEDSTOCK$4, i);
        }
    }
}
