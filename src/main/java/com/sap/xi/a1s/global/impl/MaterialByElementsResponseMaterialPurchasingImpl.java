/*
 * XML Type:  MaterialByElementsResponseMaterialPurchasing
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterialPurchasing(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialPurchasingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialPurchasingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIFECYCLESTATUSCODE$0 = 
        new javax.xml.namespace.QName("", "LifeCycleStatusCode");
    private static final javax.xml.namespace.QName PURCHASINGMEASUREUNITCODE$2 = 
        new javax.xml.namespace.QName("", "PurchasingMeasureUnitCode");
    private static final javax.xml.namespace.QName INTERNALNOTE$4 = 
        new javax.xml.namespace.QName("", "InternalNote");
    private static final javax.xml.namespace.QName PURCHASINGNOTE$6 = 
        new javax.xml.namespace.QName("", "PurchasingNote");
    
    
    /**
     * Gets the "LifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum getLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIFECYCLESTATUSCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode xgetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "LifeCycleStatusCode" element
     */
    public boolean isSetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIFECYCLESTATUSCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "LifeCycleStatusCode" element
     */
    public void setLifeCycleStatusCode(com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum lifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIFECYCLESTATUSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIFECYCLESTATUSCODE$0);
            }
            target.setEnumValue(lifeCycleStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "LifeCycleStatusCode" element
     */
    public void xsetLifeCycleStatusCode(com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode lifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().add_element_user(LIFECYCLESTATUSCODE$0);
            }
            target.set(lifeCycleStatusCode);
        }
    }
    
    /**
     * Unsets the "LifeCycleStatusCode" element
     */
    public void unsetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIFECYCLESTATUSCODE$0, 0);
        }
    }
    
    /**
     * Gets the "PurchasingMeasureUnitCode" element
     */
    public java.lang.String getPurchasingMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURCHASINGMEASUREUNITCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PurchasingMeasureUnitCode" element
     */
    public com.sap.xi.ap.common.gdt.MeasureUnitCode xgetPurchasingMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MeasureUnitCode target = null;
            target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().find_element_user(PURCHASINGMEASUREUNITCODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "PurchasingMeasureUnitCode" element
     */
    public boolean isSetPurchasingMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PURCHASINGMEASUREUNITCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "PurchasingMeasureUnitCode" element
     */
    public void setPurchasingMeasureUnitCode(java.lang.String purchasingMeasureUnitCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURCHASINGMEASUREUNITCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PURCHASINGMEASUREUNITCODE$2);
            }
            target.setStringValue(purchasingMeasureUnitCode);
        }
    }
    
    /**
     * Sets (as xml) the "PurchasingMeasureUnitCode" element
     */
    public void xsetPurchasingMeasureUnitCode(com.sap.xi.ap.common.gdt.MeasureUnitCode purchasingMeasureUnitCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MeasureUnitCode target = null;
            target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().find_element_user(PURCHASINGMEASUREUNITCODE$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().add_element_user(PURCHASINGMEASUREUNITCODE$2);
            }
            target.set(purchasingMeasureUnitCode);
        }
    }
    
    /**
     * Unsets the "PurchasingMeasureUnitCode" element
     */
    public void unsetPurchasingMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PURCHASINGMEASUREUNITCODE$2, 0);
        }
    }
    
    /**
     * Gets array of all "InternalNote" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText[] getInternalNoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTERNALNOTE$4, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "InternalNote" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText getInternalNoteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText)get_store().find_element_user(INTERNALNOTE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "InternalNote" element
     */
    public int sizeOfInternalNoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERNALNOTE$4);
        }
    }
    
    /**
     * Sets array of all "InternalNote" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInternalNoteArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText[] internalNoteArray)
    {
        check_orphaned();
        arraySetterHelper(internalNoteArray, INTERNALNOTE$4);
    }
    
    /**
     * Sets ith "InternalNote" element
     */
    public void setInternalNoteArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText internalNote)
    {
        generatedSetterHelperImpl(internalNote, INTERNALNOTE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InternalNote" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText insertNewInternalNote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText)get_store().insert_element_user(INTERNALNOTE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InternalNote" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText addNewInternalNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText)get_store().add_element_user(INTERNALNOTE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "InternalNote" element
     */
    public void removeInternalNote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERNALNOTE$4, i);
        }
    }
    
    /**
     * Gets array of all "PurchasingNote" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText[] getPurchasingNoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PURCHASINGNOTE$6, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PurchasingNote" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText getPurchasingNoteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText)get_store().find_element_user(PURCHASINGNOTE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PurchasingNote" element
     */
    public int sizeOfPurchasingNoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PURCHASINGNOTE$6);
        }
    }
    
    /**
     * Sets array of all "PurchasingNote" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPurchasingNoteArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText[] purchasingNoteArray)
    {
        check_orphaned();
        arraySetterHelper(purchasingNoteArray, PURCHASINGNOTE$6);
    }
    
    /**
     * Sets ith "PurchasingNote" element
     */
    public void setPurchasingNoteArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText purchasingNote)
    {
        generatedSetterHelperImpl(purchasingNote, PURCHASINGNOTE$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PurchasingNote" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText insertNewPurchasingNote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText)get_store().insert_element_user(PURCHASINGNOTE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PurchasingNote" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText addNewPurchasingNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText)get_store().add_element_user(PURCHASINGNOTE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "PurchasingNote" element
     */
    public void removePurchasingNote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PURCHASINGNOTE$6, i);
        }
    }
}
