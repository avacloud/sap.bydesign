/*
 * XML Type:  ExtSelectionByCode
 * Namespace: http://sap.com/xi/Extensibility/Global
 * Java type: com.sap.xi.extensibility.global.ExtSelectionByCode
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.extensibility.global.impl;
/**
 * An XML ExtSelectionByCode(@http://sap.com/xi/Extensibility/Global).
 *
 * This is a complex type.
 */
public class ExtSelectionByCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.extensibility.global.ExtSelectionByCode
{
    private static final long serialVersionUID = 1L;
    
    public ExtSelectionByCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELECTIONBYCODE$0 = 
        new javax.xml.namespace.QName("", "SelectionByCode");
    
    
    /**
     * Gets array of all "SelectionByCode" elements
     */
    public com.sap.xi.ap.common.global.SelectionByCode[] getSelectionByCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYCODE$0, targetList);
            com.sap.xi.ap.common.global.SelectionByCode[] result = new com.sap.xi.ap.common.global.SelectionByCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByCode" element
     */
    public com.sap.xi.ap.common.global.SelectionByCode getSelectionByCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByCode target = null;
            target = (com.sap.xi.ap.common.global.SelectionByCode)get_store().find_element_user(SELECTIONBYCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByCode" element
     */
    public int sizeOfSelectionByCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYCODE$0);
        }
    }
    
    /**
     * Sets array of all "SelectionByCode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByCodeArray(com.sap.xi.ap.common.global.SelectionByCode[] selectionByCodeArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByCodeArray, SELECTIONBYCODE$0);
    }
    
    /**
     * Sets ith "SelectionByCode" element
     */
    public void setSelectionByCodeArray(int i, com.sap.xi.ap.common.global.SelectionByCode selectionByCode)
    {
        generatedSetterHelperImpl(selectionByCode, SELECTIONBYCODE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByCode" element
     */
    public com.sap.xi.ap.common.global.SelectionByCode insertNewSelectionByCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByCode target = null;
            target = (com.sap.xi.ap.common.global.SelectionByCode)get_store().insert_element_user(SELECTIONBYCODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByCode" element
     */
    public com.sap.xi.ap.common.global.SelectionByCode addNewSelectionByCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByCode target = null;
            target = (com.sap.xi.ap.common.global.SelectionByCode)get_store().add_element_user(SELECTIONBYCODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByCode" element
     */
    public void removeSelectionByCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYCODE$0, i);
        }
    }
}
