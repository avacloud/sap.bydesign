/*
 * XML Type:  SelectionByCode
 * Namespace: http://sap.com/xi/AP/Common/Global
 * Java type: com.sap.xi.ap.common.global.SelectionByCode
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.global.impl;
/**
 * An XML SelectionByCode(@http://sap.com/xi/AP/Common/Global).
 *
 * This is a complex type.
 */
public class SelectionByCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.common.global.SelectionByCode
{
    private static final long serialVersionUID = 1L;
    
    public SelectionByCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUSIONEXCLUSIONCODE$0 = 
        new javax.xml.namespace.QName("", "InclusionExclusionCode");
    private static final javax.xml.namespace.QName INTERVALBOUNDARYTYPECODE$2 = 
        new javax.xml.namespace.QName("", "IntervalBoundaryTypeCode");
    private static final javax.xml.namespace.QName LOWERBOUNDARYCODE$4 = 
        new javax.xml.namespace.QName("", "LowerBoundaryCode");
    private static final javax.xml.namespace.QName UPPERBOUNDARYCODE$6 = 
        new javax.xml.namespace.QName("", "UpperBoundaryCode");
    
    
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
     * Gets the "LowerBoundaryCode" element
     */
    public com.sap.xi.basis.global.Code getLowerBoundaryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.Code target = null;
            target = (com.sap.xi.basis.global.Code)get_store().find_element_user(LOWERBOUNDARYCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LowerBoundaryCode" element
     */
    public boolean isSetLowerBoundaryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOWERBOUNDARYCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "LowerBoundaryCode" element
     */
    public void setLowerBoundaryCode(com.sap.xi.basis.global.Code lowerBoundaryCode)
    {
        generatedSetterHelperImpl(lowerBoundaryCode, LOWERBOUNDARYCODE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LowerBoundaryCode" element
     */
    public com.sap.xi.basis.global.Code addNewLowerBoundaryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.Code target = null;
            target = (com.sap.xi.basis.global.Code)get_store().add_element_user(LOWERBOUNDARYCODE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "LowerBoundaryCode" element
     */
    public void unsetLowerBoundaryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOWERBOUNDARYCODE$4, 0);
        }
    }
    
    /**
     * Gets the "UpperBoundaryCode" element
     */
    public com.sap.xi.basis.global.Code getUpperBoundaryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.Code target = null;
            target = (com.sap.xi.basis.global.Code)get_store().find_element_user(UPPERBOUNDARYCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "UpperBoundaryCode" element
     */
    public boolean isSetUpperBoundaryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPPERBOUNDARYCODE$6) != 0;
        }
    }
    
    /**
     * Sets the "UpperBoundaryCode" element
     */
    public void setUpperBoundaryCode(com.sap.xi.basis.global.Code upperBoundaryCode)
    {
        generatedSetterHelperImpl(upperBoundaryCode, UPPERBOUNDARYCODE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UpperBoundaryCode" element
     */
    public com.sap.xi.basis.global.Code addNewUpperBoundaryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.Code target = null;
            target = (com.sap.xi.basis.global.Code)get_store().add_element_user(UPPERBOUNDARYCODE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "UpperBoundaryCode" element
     */
    public void unsetUpperBoundaryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPPERBOUNDARYCODE$6, 0);
        }
    }
}
