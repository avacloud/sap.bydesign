/*
 * XML Type:  ProductionLotSelectionByLifeCycleStatusCode
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotSelectionByLifeCycleStatusCode
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotSelectionByLifeCycleStatusCode(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotSelectionByLifeCycleStatusCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotSelectionByLifeCycleStatusCode
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotSelectionByLifeCycleStatusCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUSIONEXCLUSIONCODE$0 = 
        new javax.xml.namespace.QName("", "InclusionExclusionCode");
    private static final javax.xml.namespace.QName INTERVALBOUNDARYTYPECODE$2 = 
        new javax.xml.namespace.QName("", "IntervalBoundaryTypeCode");
    private static final javax.xml.namespace.QName LOWERBOUNDARYLIFECYCLESTATUSCODE$4 = 
        new javax.xml.namespace.QName("", "LowerBoundaryLifeCycleStatusCode");
    private static final javax.xml.namespace.QName UPPERBOUNDARYLIFECYCLESTATUSCODE$6 = 
        new javax.xml.namespace.QName("", "UpperBoundaryLifeCycleStatusCode");
    
    
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
     * Gets the "LowerBoundaryLifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode.Enum getLowerBoundaryLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERBOUNDARYLIFECYCLESTATUSCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LowerBoundaryLifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode xgetLowerBoundaryLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode)get_store().find_element_user(LOWERBOUNDARYLIFECYCLESTATUSCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LowerBoundaryLifeCycleStatusCode" element
     */
    public boolean isSetLowerBoundaryLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOWERBOUNDARYLIFECYCLESTATUSCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "LowerBoundaryLifeCycleStatusCode" element
     */
    public void setLowerBoundaryLifeCycleStatusCode(com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode.Enum lowerBoundaryLifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERBOUNDARYLIFECYCLESTATUSCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOWERBOUNDARYLIFECYCLESTATUSCODE$4);
            }
            target.setEnumValue(lowerBoundaryLifeCycleStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "LowerBoundaryLifeCycleStatusCode" element
     */
    public void xsetLowerBoundaryLifeCycleStatusCode(com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode lowerBoundaryLifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode)get_store().find_element_user(LOWERBOUNDARYLIFECYCLESTATUSCODE$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode)get_store().add_element_user(LOWERBOUNDARYLIFECYCLESTATUSCODE$4);
            }
            target.set(lowerBoundaryLifeCycleStatusCode);
        }
    }
    
    /**
     * Unsets the "LowerBoundaryLifeCycleStatusCode" element
     */
    public void unsetLowerBoundaryLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOWERBOUNDARYLIFECYCLESTATUSCODE$4, 0);
        }
    }
    
    /**
     * Gets the "UpperBoundaryLifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode.Enum getUpperBoundaryLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERBOUNDARYLIFECYCLESTATUSCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "UpperBoundaryLifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode xgetUpperBoundaryLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode)get_store().find_element_user(UPPERBOUNDARYLIFECYCLESTATUSCODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "UpperBoundaryLifeCycleStatusCode" element
     */
    public boolean isSetUpperBoundaryLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPPERBOUNDARYLIFECYCLESTATUSCODE$6) != 0;
        }
    }
    
    /**
     * Sets the "UpperBoundaryLifeCycleStatusCode" element
     */
    public void setUpperBoundaryLifeCycleStatusCode(com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode.Enum upperBoundaryLifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERBOUNDARYLIFECYCLESTATUSCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPPERBOUNDARYLIFECYCLESTATUSCODE$6);
            }
            target.setEnumValue(upperBoundaryLifeCycleStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "UpperBoundaryLifeCycleStatusCode" element
     */
    public void xsetUpperBoundaryLifeCycleStatusCode(com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode upperBoundaryLifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode)get_store().find_element_user(UPPERBOUNDARYLIFECYCLESTATUSCODE$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode)get_store().add_element_user(UPPERBOUNDARYLIFECYCLESTATUSCODE$6);
            }
            target.set(upperBoundaryLifeCycleStatusCode);
        }
    }
    
    /**
     * Unsets the "UpperBoundaryLifeCycleStatusCode" element
     */
    public void unsetUpperBoundaryLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPPERBOUNDARYLIFECYCLESTATUSCODE$6, 0);
        }
    }
}
