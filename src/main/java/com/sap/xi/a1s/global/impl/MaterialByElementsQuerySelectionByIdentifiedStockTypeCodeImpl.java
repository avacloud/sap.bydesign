/*
 * XML Type:  MaterialByElementsQuerySelectionByIdentifiedStockTypeCode
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByIdentifiedStockTypeCode
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsQuerySelectionByIdentifiedStockTypeCode(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsQuerySelectionByIdentifiedStockTypeCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByIdentifiedStockTypeCode
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsQuerySelectionByIdentifiedStockTypeCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUSIONEXCLUSIONCODE$0 = 
        new javax.xml.namespace.QName("", "InclusionExclusionCode");
    private static final javax.xml.namespace.QName INTERVALBOUNDARYTYPECODE$2 = 
        new javax.xml.namespace.QName("", "IntervalBoundaryTypeCode");
    private static final javax.xml.namespace.QName LOWERBOUNDARYIDENTIFIEDSTOCKTYPECODE$4 = 
        new javax.xml.namespace.QName("", "LowerBoundaryIdentifiedStockTypeCode");
    private static final javax.xml.namespace.QName UPPERBOUNDARYIDENTIFIEDSTOCKTYPECODE$6 = 
        new javax.xml.namespace.QName("", "UpperBoundaryIdentifiedStockTypeCode");
    
    
    /**
     * Gets the "InclusionExclusionCode" element
     */
    public java.lang.String getInclusionExclusionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUSIONEXCLUSIONCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InclusionExclusionCode" element
     */
    public com.sap.xi.ap.common.gdt.InclusionExclusionCode xgetInclusionExclusionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.InclusionExclusionCode target = null;
            target = (com.sap.xi.ap.common.gdt.InclusionExclusionCode)get_store().find_element_user(INCLUSIONEXCLUSIONCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "InclusionExclusionCode" element
     */
    public boolean isSetInclusionExclusionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCLUSIONEXCLUSIONCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "InclusionExclusionCode" element
     */
    public void setInclusionExclusionCode(java.lang.String inclusionExclusionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUSIONEXCLUSIONCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCLUSIONEXCLUSIONCODE$0);
            }
            target.setStringValue(inclusionExclusionCode);
        }
    }
    
    /**
     * Sets (as xml) the "InclusionExclusionCode" element
     */
    public void xsetInclusionExclusionCode(com.sap.xi.ap.common.gdt.InclusionExclusionCode inclusionExclusionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.InclusionExclusionCode target = null;
            target = (com.sap.xi.ap.common.gdt.InclusionExclusionCode)get_store().find_element_user(INCLUSIONEXCLUSIONCODE$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.InclusionExclusionCode)get_store().add_element_user(INCLUSIONEXCLUSIONCODE$0);
            }
            target.set(inclusionExclusionCode);
        }
    }
    
    /**
     * Unsets the "InclusionExclusionCode" element
     */
    public void unsetInclusionExclusionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCLUSIONEXCLUSIONCODE$0, 0);
        }
    }
    
    /**
     * Gets the "IntervalBoundaryTypeCode" element
     */
    public java.lang.String getIntervalBoundaryTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALBOUNDARYTYPECODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IntervalBoundaryTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode xgetIntervalBoundaryTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode)get_store().find_element_user(INTERVALBOUNDARYTYPECODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IntervalBoundaryTypeCode" element
     */
    public void setIntervalBoundaryTypeCode(java.lang.String intervalBoundaryTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALBOUNDARYTYPECODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERVALBOUNDARYTYPECODE$2);
            }
            target.setStringValue(intervalBoundaryTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "IntervalBoundaryTypeCode" element
     */
    public void xsetIntervalBoundaryTypeCode(com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode intervalBoundaryTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode)get_store().find_element_user(INTERVALBOUNDARYTYPECODE$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode)get_store().add_element_user(INTERVALBOUNDARYTYPECODE$2);
            }
            target.set(intervalBoundaryTypeCode);
        }
    }
    
    /**
     * Gets the "LowerBoundaryIdentifiedStockTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode getLowerBoundaryIdentifiedStockTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode)get_store().find_element_user(LOWERBOUNDARYIDENTIFIEDSTOCKTYPECODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LowerBoundaryIdentifiedStockTypeCode" element
     */
    public boolean isSetLowerBoundaryIdentifiedStockTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOWERBOUNDARYIDENTIFIEDSTOCKTYPECODE$4) != 0;
        }
    }
    
    /**
     * Sets the "LowerBoundaryIdentifiedStockTypeCode" element
     */
    public void setLowerBoundaryIdentifiedStockTypeCode(com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode lowerBoundaryIdentifiedStockTypeCode)
    {
        generatedSetterHelperImpl(lowerBoundaryIdentifiedStockTypeCode, LOWERBOUNDARYIDENTIFIEDSTOCKTYPECODE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LowerBoundaryIdentifiedStockTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode addNewLowerBoundaryIdentifiedStockTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode)get_store().add_element_user(LOWERBOUNDARYIDENTIFIEDSTOCKTYPECODE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "LowerBoundaryIdentifiedStockTypeCode" element
     */
    public void unsetLowerBoundaryIdentifiedStockTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOWERBOUNDARYIDENTIFIEDSTOCKTYPECODE$4, 0);
        }
    }
    
    /**
     * Gets the "UpperBoundaryIdentifiedStockTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode getUpperBoundaryIdentifiedStockTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode)get_store().find_element_user(UPPERBOUNDARYIDENTIFIEDSTOCKTYPECODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "UpperBoundaryIdentifiedStockTypeCode" element
     */
    public boolean isSetUpperBoundaryIdentifiedStockTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPPERBOUNDARYIDENTIFIEDSTOCKTYPECODE$6) != 0;
        }
    }
    
    /**
     * Sets the "UpperBoundaryIdentifiedStockTypeCode" element
     */
    public void setUpperBoundaryIdentifiedStockTypeCode(com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode upperBoundaryIdentifiedStockTypeCode)
    {
        generatedSetterHelperImpl(upperBoundaryIdentifiedStockTypeCode, UPPERBOUNDARYIDENTIFIEDSTOCKTYPECODE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UpperBoundaryIdentifiedStockTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode addNewUpperBoundaryIdentifiedStockTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode)get_store().add_element_user(UPPERBOUNDARYIDENTIFIEDSTOCKTYPECODE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "UpperBoundaryIdentifiedStockTypeCode" element
     */
    public void unsetUpperBoundaryIdentifiedStockTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPPERBOUNDARYIDENTIFIEDSTOCKTYPECODE$6, 0);
        }
    }
}
