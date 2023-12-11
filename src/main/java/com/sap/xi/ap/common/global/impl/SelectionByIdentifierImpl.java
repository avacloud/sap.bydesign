/*
 * XML Type:  SelectionByIdentifier
 * Namespace: http://sap.com/xi/AP/Common/Global
 * Java type: com.sap.xi.ap.common.global.SelectionByIdentifier
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.global.impl;
/**
 * An XML SelectionByIdentifier(@http://sap.com/xi/AP/Common/Global).
 *
 * This is a complex type.
 */
public class SelectionByIdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.common.global.SelectionByIdentifier
{
    private static final long serialVersionUID = 1L;
    
    public SelectionByIdentifierImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUSIONEXCLUSIONCODE$0 = 
        new javax.xml.namespace.QName("", "InclusionExclusionCode");
    private static final javax.xml.namespace.QName INTERVALBOUNDARYTYPECODE$2 = 
        new javax.xml.namespace.QName("", "IntervalBoundaryTypeCode");
    private static final javax.xml.namespace.QName LOWERBOUNDARYIDENTIFIER$4 = 
        new javax.xml.namespace.QName("", "LowerBoundaryIdentifier");
    private static final javax.xml.namespace.QName UPPERBOUNDARYIDENTIFIER$6 = 
        new javax.xml.namespace.QName("", "UpperBoundaryIdentifier");
    
    
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
     * Gets the "LowerBoundaryIdentifier" element
     */
    public java.lang.String getLowerBoundaryIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERBOUNDARYIDENTIFIER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LowerBoundaryIdentifier" element
     */
    public com.sap.xi.ap.common.gdt.SearchText xgetLowerBoundaryIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SearchText target = null;
            target = (com.sap.xi.ap.common.gdt.SearchText)get_store().find_element_user(LOWERBOUNDARYIDENTIFIER$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LowerBoundaryIdentifier" element
     */
    public boolean isSetLowerBoundaryIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOWERBOUNDARYIDENTIFIER$4) != 0;
        }
    }
    
    /**
     * Sets the "LowerBoundaryIdentifier" element
     */
    public void setLowerBoundaryIdentifier(java.lang.String lowerBoundaryIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERBOUNDARYIDENTIFIER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOWERBOUNDARYIDENTIFIER$4);
            }
            target.setStringValue(lowerBoundaryIdentifier);
        }
    }
    
    /**
     * Sets (as xml) the "LowerBoundaryIdentifier" element
     */
    public void xsetLowerBoundaryIdentifier(com.sap.xi.ap.common.gdt.SearchText lowerBoundaryIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SearchText target = null;
            target = (com.sap.xi.ap.common.gdt.SearchText)get_store().find_element_user(LOWERBOUNDARYIDENTIFIER$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.SearchText)get_store().add_element_user(LOWERBOUNDARYIDENTIFIER$4);
            }
            target.set(lowerBoundaryIdentifier);
        }
    }
    
    /**
     * Unsets the "LowerBoundaryIdentifier" element
     */
    public void unsetLowerBoundaryIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOWERBOUNDARYIDENTIFIER$4, 0);
        }
    }
    
    /**
     * Gets the "UpperBoundaryIdentifier" element
     */
    public java.lang.String getUpperBoundaryIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERBOUNDARYIDENTIFIER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UpperBoundaryIdentifier" element
     */
    public com.sap.xi.ap.common.gdt.SearchText xgetUpperBoundaryIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SearchText target = null;
            target = (com.sap.xi.ap.common.gdt.SearchText)get_store().find_element_user(UPPERBOUNDARYIDENTIFIER$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "UpperBoundaryIdentifier" element
     */
    public boolean isSetUpperBoundaryIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPPERBOUNDARYIDENTIFIER$6) != 0;
        }
    }
    
    /**
     * Sets the "UpperBoundaryIdentifier" element
     */
    public void setUpperBoundaryIdentifier(java.lang.String upperBoundaryIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERBOUNDARYIDENTIFIER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPPERBOUNDARYIDENTIFIER$6);
            }
            target.setStringValue(upperBoundaryIdentifier);
        }
    }
    
    /**
     * Sets (as xml) the "UpperBoundaryIdentifier" element
     */
    public void xsetUpperBoundaryIdentifier(com.sap.xi.ap.common.gdt.SearchText upperBoundaryIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SearchText target = null;
            target = (com.sap.xi.ap.common.gdt.SearchText)get_store().find_element_user(UPPERBOUNDARYIDENTIFIER$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.SearchText)get_store().add_element_user(UPPERBOUNDARYIDENTIFIER$6);
            }
            target.set(upperBoundaryIdentifier);
        }
    }
    
    /**
     * Unsets the "UpperBoundaryIdentifier" element
     */
    public void unsetUpperBoundaryIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPPERBOUNDARYIDENTIFIER$6, 0);
        }
    }
}
