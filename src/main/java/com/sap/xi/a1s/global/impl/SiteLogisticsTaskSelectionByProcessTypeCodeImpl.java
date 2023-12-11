/*
 * XML Type:  SiteLogisticsTaskSelectionByProcessTypeCode
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessTypeCode
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML SiteLogisticsTaskSelectionByProcessTypeCode(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class SiteLogisticsTaskSelectionByProcessTypeCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessTypeCode
{
    private static final long serialVersionUID = 1L;
    
    public SiteLogisticsTaskSelectionByProcessTypeCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUSIONEXCLUSIONCODE$0 = 
        new javax.xml.namespace.QName("", "InclusionExclusionCode");
    private static final javax.xml.namespace.QName INTERVALBOUNDARYTYPECODE$2 = 
        new javax.xml.namespace.QName("", "IntervalBoundaryTypeCode");
    private static final javax.xml.namespace.QName LOWERBOUNDARYPROCESSTYPECODE$4 = 
        new javax.xml.namespace.QName("", "LowerBoundaryProcessTypeCode");
    private static final javax.xml.namespace.QName UPPERBOUNDARYPROCESSTYPECODE$6 = 
        new javax.xml.namespace.QName("", "UpperBoundaryProcessTypeCode");
    
    
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
     * True if has "IntervalBoundaryTypeCode" element
     */
    public boolean isSetIntervalBoundaryTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERVALBOUNDARYTYPECODE$2) != 0;
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
     * Unsets the "IntervalBoundaryTypeCode" element
     */
    public void unsetIntervalBoundaryTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERVALBOUNDARYTYPECODE$2, 0);
        }
    }
    
    /**
     * Gets the "LowerBoundaryProcessTypeCode" element
     */
    public com.sap.xi.a1s.LogisticsProcessTypeCode.Enum getLowerBoundaryProcessTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERBOUNDARYPROCESSTYPECODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.a1s.LogisticsProcessTypeCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LowerBoundaryProcessTypeCode" element
     */
    public com.sap.xi.a1s.LogisticsProcessTypeCode xgetLowerBoundaryProcessTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.LogisticsProcessTypeCode target = null;
            target = (com.sap.xi.a1s.LogisticsProcessTypeCode)get_store().find_element_user(LOWERBOUNDARYPROCESSTYPECODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LowerBoundaryProcessTypeCode" element
     */
    public boolean isSetLowerBoundaryProcessTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOWERBOUNDARYPROCESSTYPECODE$4) != 0;
        }
    }
    
    /**
     * Sets the "LowerBoundaryProcessTypeCode" element
     */
    public void setLowerBoundaryProcessTypeCode(com.sap.xi.a1s.LogisticsProcessTypeCode.Enum lowerBoundaryProcessTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERBOUNDARYPROCESSTYPECODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOWERBOUNDARYPROCESSTYPECODE$4);
            }
            target.setEnumValue(lowerBoundaryProcessTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "LowerBoundaryProcessTypeCode" element
     */
    public void xsetLowerBoundaryProcessTypeCode(com.sap.xi.a1s.LogisticsProcessTypeCode lowerBoundaryProcessTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.LogisticsProcessTypeCode target = null;
            target = (com.sap.xi.a1s.LogisticsProcessTypeCode)get_store().find_element_user(LOWERBOUNDARYPROCESSTYPECODE$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.a1s.LogisticsProcessTypeCode)get_store().add_element_user(LOWERBOUNDARYPROCESSTYPECODE$4);
            }
            target.set(lowerBoundaryProcessTypeCode);
        }
    }
    
    /**
     * Unsets the "LowerBoundaryProcessTypeCode" element
     */
    public void unsetLowerBoundaryProcessTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOWERBOUNDARYPROCESSTYPECODE$4, 0);
        }
    }
    
    /**
     * Gets the "UpperBoundaryProcessTypeCode" element
     */
    public com.sap.xi.a1s.LogisticsProcessTypeCode.Enum getUpperBoundaryProcessTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERBOUNDARYPROCESSTYPECODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.a1s.LogisticsProcessTypeCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "UpperBoundaryProcessTypeCode" element
     */
    public com.sap.xi.a1s.LogisticsProcessTypeCode xgetUpperBoundaryProcessTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.LogisticsProcessTypeCode target = null;
            target = (com.sap.xi.a1s.LogisticsProcessTypeCode)get_store().find_element_user(UPPERBOUNDARYPROCESSTYPECODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "UpperBoundaryProcessTypeCode" element
     */
    public boolean isSetUpperBoundaryProcessTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPPERBOUNDARYPROCESSTYPECODE$6) != 0;
        }
    }
    
    /**
     * Sets the "UpperBoundaryProcessTypeCode" element
     */
    public void setUpperBoundaryProcessTypeCode(com.sap.xi.a1s.LogisticsProcessTypeCode.Enum upperBoundaryProcessTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERBOUNDARYPROCESSTYPECODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPPERBOUNDARYPROCESSTYPECODE$6);
            }
            target.setEnumValue(upperBoundaryProcessTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "UpperBoundaryProcessTypeCode" element
     */
    public void xsetUpperBoundaryProcessTypeCode(com.sap.xi.a1s.LogisticsProcessTypeCode upperBoundaryProcessTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.LogisticsProcessTypeCode target = null;
            target = (com.sap.xi.a1s.LogisticsProcessTypeCode)get_store().find_element_user(UPPERBOUNDARYPROCESSTYPECODE$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.a1s.LogisticsProcessTypeCode)get_store().add_element_user(UPPERBOUNDARYPROCESSTYPECODE$6);
            }
            target.set(upperBoundaryProcessTypeCode);
        }
    }
    
    /**
     * Unsets the "UpperBoundaryProcessTypeCode" element
     */
    public void unsetUpperBoundaryProcessTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPPERBOUNDARYPROCESSTYPECODE$6, 0);
        }
    }
}
