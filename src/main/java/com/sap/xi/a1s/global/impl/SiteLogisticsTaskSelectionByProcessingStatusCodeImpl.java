/*
 * XML Type:  SiteLogisticsTaskSelectionByProcessingStatusCode
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML SiteLogisticsTaskSelectionByProcessingStatusCode(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class SiteLogisticsTaskSelectionByProcessingStatusCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode
{
    private static final long serialVersionUID = 1L;
    
    public SiteLogisticsTaskSelectionByProcessingStatusCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUSIONEXCLUSIONCODE$0 = 
        new javax.xml.namespace.QName("", "InclusionExclusionCode");
    private static final javax.xml.namespace.QName INTERVALBOUNDARYTYPECODE$2 = 
        new javax.xml.namespace.QName("", "IntervalBoundaryTypeCode");
    private static final javax.xml.namespace.QName LOWERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$4 = 
        new javax.xml.namespace.QName("", "LowerBoundarySiteLogisticsProcessingStatusCode");
    private static final javax.xml.namespace.QName UPPERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$6 = 
        new javax.xml.namespace.QName("", "UpperBoundarySiteLogisticsProcessingStatusCode");
    
    
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
     * Gets the "LowerBoundarySiteLogisticsProcessingStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum getLowerBoundarySiteLogisticsProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LowerBoundarySiteLogisticsProcessingStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.ProcessingStatusCode xgetLowerBoundarySiteLogisticsProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().find_element_user(LOWERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LowerBoundarySiteLogisticsProcessingStatusCode" element
     */
    public boolean isSetLowerBoundarySiteLogisticsProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOWERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "LowerBoundarySiteLogisticsProcessingStatusCode" element
     */
    public void setLowerBoundarySiteLogisticsProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum lowerBoundarySiteLogisticsProcessingStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOWERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$4);
            }
            target.setEnumValue(lowerBoundarySiteLogisticsProcessingStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "LowerBoundarySiteLogisticsProcessingStatusCode" element
     */
    public void xsetLowerBoundarySiteLogisticsProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode lowerBoundarySiteLogisticsProcessingStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().find_element_user(LOWERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().add_element_user(LOWERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$4);
            }
            target.set(lowerBoundarySiteLogisticsProcessingStatusCode);
        }
    }
    
    /**
     * Unsets the "LowerBoundarySiteLogisticsProcessingStatusCode" element
     */
    public void unsetLowerBoundarySiteLogisticsProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOWERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$4, 0);
        }
    }
    
    /**
     * Gets the "UpperBoundarySiteLogisticsProcessingStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum getUpperBoundarySiteLogisticsProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "UpperBoundarySiteLogisticsProcessingStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.ProcessingStatusCode xgetUpperBoundarySiteLogisticsProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().find_element_user(UPPERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "UpperBoundarySiteLogisticsProcessingStatusCode" element
     */
    public boolean isSetUpperBoundarySiteLogisticsProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPPERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$6) != 0;
        }
    }
    
    /**
     * Sets the "UpperBoundarySiteLogisticsProcessingStatusCode" element
     */
    public void setUpperBoundarySiteLogisticsProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum upperBoundarySiteLogisticsProcessingStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPPERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$6);
            }
            target.setEnumValue(upperBoundarySiteLogisticsProcessingStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "UpperBoundarySiteLogisticsProcessingStatusCode" element
     */
    public void xsetUpperBoundarySiteLogisticsProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode upperBoundarySiteLogisticsProcessingStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().find_element_user(UPPERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().add_element_user(UPPERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$6);
            }
            target.set(upperBoundarySiteLogisticsProcessingStatusCode);
        }
    }
    
    /**
     * Unsets the "UpperBoundarySiteLogisticsProcessingStatusCode" element
     */
    public void unsetUpperBoundarySiteLogisticsProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPPERBOUNDARYSITELOGISTICSPROCESSINGSTATUSCODE$6, 0);
        }
    }
}
