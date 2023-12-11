/*
 * XML Type:  Log
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.Log
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML Log(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is a complex type.
 */
public class LogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.common.gdt.Log
{
    private static final long serialVersionUID = 1L;
    
    public LogImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSDOCUMENTPROCESSINGRESULTCODE$0 = 
        new javax.xml.namespace.QName("", "BusinessDocumentProcessingResultCode");
    private static final javax.xml.namespace.QName MAXIMUMLOGITEMSEVERITYCODE$2 = 
        new javax.xml.namespace.QName("", "MaximumLogItemSeverityCode");
    private static final javax.xml.namespace.QName ITEM$4 = 
        new javax.xml.namespace.QName("", "Item");
    
    
    /**
     * Gets the "BusinessDocumentProcessingResultCode" element
     */
    public java.lang.String getBusinessDocumentProcessingResultCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSDOCUMENTPROCESSINGRESULTCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BusinessDocumentProcessingResultCode" element
     */
    public com.sap.xi.ap.common.gdt.ProcessingResultCode xgetBusinessDocumentProcessingResultCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingResultCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingResultCode)get_store().find_element_user(BUSINESSDOCUMENTPROCESSINGRESULTCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "BusinessDocumentProcessingResultCode" element
     */
    public boolean isSetBusinessDocumentProcessingResultCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSDOCUMENTPROCESSINGRESULTCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "BusinessDocumentProcessingResultCode" element
     */
    public void setBusinessDocumentProcessingResultCode(java.lang.String businessDocumentProcessingResultCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSDOCUMENTPROCESSINGRESULTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSDOCUMENTPROCESSINGRESULTCODE$0);
            }
            target.setStringValue(businessDocumentProcessingResultCode);
        }
    }
    
    /**
     * Sets (as xml) the "BusinessDocumentProcessingResultCode" element
     */
    public void xsetBusinessDocumentProcessingResultCode(com.sap.xi.ap.common.gdt.ProcessingResultCode businessDocumentProcessingResultCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingResultCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingResultCode)get_store().find_element_user(BUSINESSDOCUMENTPROCESSINGRESULTCODE$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProcessingResultCode)get_store().add_element_user(BUSINESSDOCUMENTPROCESSINGRESULTCODE$0);
            }
            target.set(businessDocumentProcessingResultCode);
        }
    }
    
    /**
     * Unsets the "BusinessDocumentProcessingResultCode" element
     */
    public void unsetBusinessDocumentProcessingResultCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSDOCUMENTPROCESSINGRESULTCODE$0, 0);
        }
    }
    
    /**
     * Gets the "MaximumLogItemSeverityCode" element
     */
    public java.lang.String getMaximumLogItemSeverityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMLOGITEMSEVERITYCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaximumLogItemSeverityCode" element
     */
    public com.sap.xi.ap.common.gdt.LogItemSeverityCode xgetMaximumLogItemSeverityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemSeverityCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemSeverityCode)get_store().find_element_user(MAXIMUMLOGITEMSEVERITYCODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaximumLogItemSeverityCode" element
     */
    public boolean isSetMaximumLogItemSeverityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXIMUMLOGITEMSEVERITYCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "MaximumLogItemSeverityCode" element
     */
    public void setMaximumLogItemSeverityCode(java.lang.String maximumLogItemSeverityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMLOGITEMSEVERITYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXIMUMLOGITEMSEVERITYCODE$2);
            }
            target.setStringValue(maximumLogItemSeverityCode);
        }
    }
    
    /**
     * Sets (as xml) the "MaximumLogItemSeverityCode" element
     */
    public void xsetMaximumLogItemSeverityCode(com.sap.xi.ap.common.gdt.LogItemSeverityCode maximumLogItemSeverityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemSeverityCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemSeverityCode)get_store().find_element_user(MAXIMUMLOGITEMSEVERITYCODE$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogItemSeverityCode)get_store().add_element_user(MAXIMUMLOGITEMSEVERITYCODE$2);
            }
            target.set(maximumLogItemSeverityCode);
        }
    }
    
    /**
     * Unsets the "MaximumLogItemSeverityCode" element
     */
    public void unsetMaximumLogItemSeverityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXIMUMLOGITEMSEVERITYCODE$2, 0);
        }
    }
    
    /**
     * Gets array of all "Item" elements
     */
    public com.sap.xi.ap.common.gdt.LogItem[] getItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ITEM$4, targetList);
            com.sap.xi.ap.common.gdt.LogItem[] result = new com.sap.xi.ap.common.gdt.LogItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Item" element
     */
    public com.sap.xi.ap.common.gdt.LogItem getItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItem target = null;
            target = (com.sap.xi.ap.common.gdt.LogItem)get_store().find_element_user(ITEM$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Item" element
     */
    public int sizeOfItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITEM$4);
        }
    }
    
    /**
     * Sets array of all "Item" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setItemArray(com.sap.xi.ap.common.gdt.LogItem[] itemArray)
    {
        check_orphaned();
        arraySetterHelper(itemArray, ITEM$4);
    }
    
    /**
     * Sets ith "Item" element
     */
    public void setItemArray(int i, com.sap.xi.ap.common.gdt.LogItem item)
    {
        generatedSetterHelperImpl(item, ITEM$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Item" element
     */
    public com.sap.xi.ap.common.gdt.LogItem insertNewItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItem target = null;
            target = (com.sap.xi.ap.common.gdt.LogItem)get_store().insert_element_user(ITEM$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Item" element
     */
    public com.sap.xi.ap.common.gdt.LogItem addNewItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItem target = null;
            target = (com.sap.xi.ap.common.gdt.LogItem)get_store().add_element_user(ITEM$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Item" element
     */
    public void removeItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITEM$4, i);
        }
    }
}
