/*
 * XML Type:  MaterialByElementsQuerySelectionByElements
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByElements
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsQuerySelectionByElements(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsQuerySelectionByElementsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByElements
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsQuerySelectionByElementsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELECTIONBYDESCRIPTION$0 = 
        new javax.xml.namespace.QName("", "SelectionByDescription");
    private static final javax.xml.namespace.QName SELECTIONBYINTERNALID$2 = 
        new javax.xml.namespace.QName("", "SelectionByInternalID");
    private static final javax.xml.namespace.QName SELECTIONBYIDENTIFIEDSTOCKTYPECODE$4 = 
        new javax.xml.namespace.QName("", "SelectionByIdentifiedStockTypeCode");
    private static final javax.xml.namespace.QName SELECTIONBYSEARCHTEXT$6 = 
        new javax.xml.namespace.QName("", "SelectionBySearchText");
    private static final javax.xml.namespace.QName SELECTIONBYCREATEDSINCEDATETIME$8 = 
        new javax.xml.namespace.QName("", "SelectionByCreatedSinceDateTime");
    private static final javax.xml.namespace.QName SELECTIONBYLASTCHANGESINCEDATETIME$10 = 
        new javax.xml.namespace.QName("", "SelectionByLastChangeSinceDateTime");
    
    
    /**
     * Gets array of all "SelectionByDescription" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByDescription[] getSelectionByDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYDESCRIPTION$0, targetList);
            com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByDescription[] result = new com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByDescription" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByDescription getSelectionByDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByDescription target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByDescription)get_store().find_element_user(SELECTIONBYDESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByDescription" element
     */
    public int sizeOfSelectionByDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYDESCRIPTION$0);
        }
    }
    
    /**
     * Sets array of all "SelectionByDescription" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByDescriptionArray(com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByDescription[] selectionByDescriptionArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByDescriptionArray, SELECTIONBYDESCRIPTION$0);
    }
    
    /**
     * Sets ith "SelectionByDescription" element
     */
    public void setSelectionByDescriptionArray(int i, com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByDescription selectionByDescription)
    {
        generatedSetterHelperImpl(selectionByDescription, SELECTIONBYDESCRIPTION$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByDescription" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByDescription insertNewSelectionByDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByDescription target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByDescription)get_store().insert_element_user(SELECTIONBYDESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByDescription" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByDescription addNewSelectionByDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByDescription target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByDescription)get_store().add_element_user(SELECTIONBYDESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByDescription" element
     */
    public void removeSelectionByDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYDESCRIPTION$0, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByInternalID" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByInternalID[] getSelectionByInternalIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYINTERNALID$2, targetList);
            com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByInternalID[] result = new com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByInternalID[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByInternalID" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByInternalID getSelectionByInternalIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByInternalID target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByInternalID)get_store().find_element_user(SELECTIONBYINTERNALID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByInternalID" element
     */
    public int sizeOfSelectionByInternalIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYINTERNALID$2);
        }
    }
    
    /**
     * Sets array of all "SelectionByInternalID" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByInternalIDArray(com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByInternalID[] selectionByInternalIDArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByInternalIDArray, SELECTIONBYINTERNALID$2);
    }
    
    /**
     * Sets ith "SelectionByInternalID" element
     */
    public void setSelectionByInternalIDArray(int i, com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByInternalID selectionByInternalID)
    {
        generatedSetterHelperImpl(selectionByInternalID, SELECTIONBYINTERNALID$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByInternalID" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByInternalID insertNewSelectionByInternalID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByInternalID target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByInternalID)get_store().insert_element_user(SELECTIONBYINTERNALID$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByInternalID" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByInternalID addNewSelectionByInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByInternalID target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByInternalID)get_store().add_element_user(SELECTIONBYINTERNALID$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByInternalID" element
     */
    public void removeSelectionByInternalID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYINTERNALID$2, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByIdentifiedStockTypeCode" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByIdentifiedStockTypeCode[] getSelectionByIdentifiedStockTypeCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYIDENTIFIEDSTOCKTYPECODE$4, targetList);
            com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByIdentifiedStockTypeCode[] result = new com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByIdentifiedStockTypeCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByIdentifiedStockTypeCode" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByIdentifiedStockTypeCode getSelectionByIdentifiedStockTypeCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByIdentifiedStockTypeCode target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByIdentifiedStockTypeCode)get_store().find_element_user(SELECTIONBYIDENTIFIEDSTOCKTYPECODE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByIdentifiedStockTypeCode" element
     */
    public int sizeOfSelectionByIdentifiedStockTypeCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYIDENTIFIEDSTOCKTYPECODE$4);
        }
    }
    
    /**
     * Sets array of all "SelectionByIdentifiedStockTypeCode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByIdentifiedStockTypeCodeArray(com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByIdentifiedStockTypeCode[] selectionByIdentifiedStockTypeCodeArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByIdentifiedStockTypeCodeArray, SELECTIONBYIDENTIFIEDSTOCKTYPECODE$4);
    }
    
    /**
     * Sets ith "SelectionByIdentifiedStockTypeCode" element
     */
    public void setSelectionByIdentifiedStockTypeCodeArray(int i, com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByIdentifiedStockTypeCode selectionByIdentifiedStockTypeCode)
    {
        generatedSetterHelperImpl(selectionByIdentifiedStockTypeCode, SELECTIONBYIDENTIFIEDSTOCKTYPECODE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByIdentifiedStockTypeCode" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByIdentifiedStockTypeCode insertNewSelectionByIdentifiedStockTypeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByIdentifiedStockTypeCode target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByIdentifiedStockTypeCode)get_store().insert_element_user(SELECTIONBYIDENTIFIEDSTOCKTYPECODE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByIdentifiedStockTypeCode" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByIdentifiedStockTypeCode addNewSelectionByIdentifiedStockTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByIdentifiedStockTypeCode target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByIdentifiedStockTypeCode)get_store().add_element_user(SELECTIONBYIDENTIFIEDSTOCKTYPECODE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByIdentifiedStockTypeCode" element
     */
    public void removeSelectionByIdentifiedStockTypeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYIDENTIFIEDSTOCKTYPECODE$4, i);
        }
    }
    
    /**
     * Gets the "SelectionBySearchText" element
     */
    public java.lang.String getSelectionBySearchText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELECTIONBYSEARCHTEXT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SelectionBySearchText" element
     */
    public com.sap.xi.ap.common.gdt.SearchText xgetSelectionBySearchText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SearchText target = null;
            target = (com.sap.xi.ap.common.gdt.SearchText)get_store().find_element_user(SELECTIONBYSEARCHTEXT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "SelectionBySearchText" element
     */
    public boolean isSetSelectionBySearchText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYSEARCHTEXT$6) != 0;
        }
    }
    
    /**
     * Sets the "SelectionBySearchText" element
     */
    public void setSelectionBySearchText(java.lang.String selectionBySearchText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELECTIONBYSEARCHTEXT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELECTIONBYSEARCHTEXT$6);
            }
            target.setStringValue(selectionBySearchText);
        }
    }
    
    /**
     * Sets (as xml) the "SelectionBySearchText" element
     */
    public void xsetSelectionBySearchText(com.sap.xi.ap.common.gdt.SearchText selectionBySearchText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SearchText target = null;
            target = (com.sap.xi.ap.common.gdt.SearchText)get_store().find_element_user(SELECTIONBYSEARCHTEXT$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.SearchText)get_store().add_element_user(SELECTIONBYSEARCHTEXT$6);
            }
            target.set(selectionBySearchText);
        }
    }
    
    /**
     * Unsets the "SelectionBySearchText" element
     */
    public void unsetSelectionBySearchText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYSEARCHTEXT$6, 0);
        }
    }
    
    /**
     * Gets the "SelectionByCreatedSinceDateTime" element
     */
    public java.util.Calendar getSelectionByCreatedSinceDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELECTIONBYCREATEDSINCEDATETIME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "SelectionByCreatedSinceDateTime" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetSelectionByCreatedSinceDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(SELECTIONBYCREATEDSINCEDATETIME$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "SelectionByCreatedSinceDateTime" element
     */
    public boolean isSetSelectionByCreatedSinceDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYCREATEDSINCEDATETIME$8) != 0;
        }
    }
    
    /**
     * Sets the "SelectionByCreatedSinceDateTime" element
     */
    public void setSelectionByCreatedSinceDateTime(java.util.Calendar selectionByCreatedSinceDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELECTIONBYCREATEDSINCEDATETIME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELECTIONBYCREATEDSINCEDATETIME$8);
            }
            target.setCalendarValue(selectionByCreatedSinceDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "SelectionByCreatedSinceDateTime" element
     */
    public void xsetSelectionByCreatedSinceDateTime(com.sap.xi.basis.global.GLOBALDateTime selectionByCreatedSinceDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(SELECTIONBYCREATEDSINCEDATETIME$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(SELECTIONBYCREATEDSINCEDATETIME$8);
            }
            target.set(selectionByCreatedSinceDateTime);
        }
    }
    
    /**
     * Unsets the "SelectionByCreatedSinceDateTime" element
     */
    public void unsetSelectionByCreatedSinceDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYCREATEDSINCEDATETIME$8, 0);
        }
    }
    
    /**
     * Gets the "SelectionByLastChangeSinceDateTime" element
     */
    public java.util.Calendar getSelectionByLastChangeSinceDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELECTIONBYLASTCHANGESINCEDATETIME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "SelectionByLastChangeSinceDateTime" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetSelectionByLastChangeSinceDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(SELECTIONBYLASTCHANGESINCEDATETIME$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "SelectionByLastChangeSinceDateTime" element
     */
    public boolean isSetSelectionByLastChangeSinceDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYLASTCHANGESINCEDATETIME$10) != 0;
        }
    }
    
    /**
     * Sets the "SelectionByLastChangeSinceDateTime" element
     */
    public void setSelectionByLastChangeSinceDateTime(java.util.Calendar selectionByLastChangeSinceDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELECTIONBYLASTCHANGESINCEDATETIME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELECTIONBYLASTCHANGESINCEDATETIME$10);
            }
            target.setCalendarValue(selectionByLastChangeSinceDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "SelectionByLastChangeSinceDateTime" element
     */
    public void xsetSelectionByLastChangeSinceDateTime(com.sap.xi.basis.global.GLOBALDateTime selectionByLastChangeSinceDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(SELECTIONBYLASTCHANGESINCEDATETIME$10, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(SELECTIONBYLASTCHANGESINCEDATETIME$10);
            }
            target.set(selectionByLastChangeSinceDateTime);
        }
    }
    
    /**
     * Unsets the "SelectionByLastChangeSinceDateTime" element
     */
    public void unsetSelectionByLastChangeSinceDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYLASTCHANGESINCEDATETIME$10, 0);
        }
    }
}
