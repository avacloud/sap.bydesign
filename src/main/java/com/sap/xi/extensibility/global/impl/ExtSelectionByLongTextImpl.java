/*
 * XML Type:  ExtSelectionByLongText
 * Namespace: http://sap.com/xi/Extensibility/Global
 * Java type: com.sap.xi.extensibility.global.ExtSelectionByLongText
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.extensibility.global.impl;
/**
 * An XML ExtSelectionByLongText(@http://sap.com/xi/Extensibility/Global).
 *
 * This is a complex type.
 */
public class ExtSelectionByLongTextImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.extensibility.global.ExtSelectionByLongText
{
    private static final long serialVersionUID = 1L;
    
    public ExtSelectionByLongTextImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELECTIONBYTEXT$0 = 
        new javax.xml.namespace.QName("", "SelectionByText");
    
    
    /**
     * Gets array of all "SelectionByText" elements
     */
    public com.sap.xi.ap.common.global.SelectionByName[] getSelectionByTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYTEXT$0, targetList);
            com.sap.xi.ap.common.global.SelectionByName[] result = new com.sap.xi.ap.common.global.SelectionByName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByText" element
     */
    public com.sap.xi.ap.common.global.SelectionByName getSelectionByTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByName target = null;
            target = (com.sap.xi.ap.common.global.SelectionByName)get_store().find_element_user(SELECTIONBYTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByText" element
     */
    public int sizeOfSelectionByTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYTEXT$0);
        }
    }
    
    /**
     * Sets array of all "SelectionByText" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByTextArray(com.sap.xi.ap.common.global.SelectionByName[] selectionByTextArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByTextArray, SELECTIONBYTEXT$0);
    }
    
    /**
     * Sets ith "SelectionByText" element
     */
    public void setSelectionByTextArray(int i, com.sap.xi.ap.common.global.SelectionByName selectionByText)
    {
        generatedSetterHelperImpl(selectionByText, SELECTIONBYTEXT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByText" element
     */
    public com.sap.xi.ap.common.global.SelectionByName insertNewSelectionByText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByName target = null;
            target = (com.sap.xi.ap.common.global.SelectionByName)get_store().insert_element_user(SELECTIONBYTEXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByText" element
     */
    public com.sap.xi.ap.common.global.SelectionByName addNewSelectionByText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByName target = null;
            target = (com.sap.xi.ap.common.global.SelectionByName)get_store().add_element_user(SELECTIONBYTEXT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByText" element
     */
    public void removeSelectionByText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYTEXT$0, i);
        }
    }
}
