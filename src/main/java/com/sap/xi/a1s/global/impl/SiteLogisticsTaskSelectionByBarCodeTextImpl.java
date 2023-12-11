/*
 * XML Type:  SiteLogisticsTaskSelectionByBarCodeText
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML SiteLogisticsTaskSelectionByBarCodeText(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class SiteLogisticsTaskSelectionByBarCodeTextImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText
{
    private static final long serialVersionUID = 1L;
    
    public SiteLogisticsTaskSelectionByBarCodeTextImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUSIONEXCLUSIONCODE$0 = 
        new javax.xml.namespace.QName("", "InclusionExclusionCode");
    private static final javax.xml.namespace.QName INTERVALBOUNDARYTYPECODE$2 = 
        new javax.xml.namespace.QName("", "IntervalBoundaryTypeCode");
    private static final javax.xml.namespace.QName LOWERBOUNDARYBARCODETEXT$4 = 
        new javax.xml.namespace.QName("", "LowerBoundaryBarCodeText");
    private static final javax.xml.namespace.QName UPPERBOUNDARYBARCODETEXT$6 = 
        new javax.xml.namespace.QName("", "UpperBoundaryBarCodeText");
    
    
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
     * Gets the "LowerBoundaryBarCodeText" element
     */
    public java.lang.String getLowerBoundaryBarCodeText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERBOUNDARYBARCODETEXT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LowerBoundaryBarCodeText" element
     */
    public com.sap.xi.ap.common.gdt.BarCodeText xgetLowerBoundaryBarCodeText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BarCodeText target = null;
            target = (com.sap.xi.ap.common.gdt.BarCodeText)get_store().find_element_user(LOWERBOUNDARYBARCODETEXT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LowerBoundaryBarCodeText" element
     */
    public boolean isSetLowerBoundaryBarCodeText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOWERBOUNDARYBARCODETEXT$4) != 0;
        }
    }
    
    /**
     * Sets the "LowerBoundaryBarCodeText" element
     */
    public void setLowerBoundaryBarCodeText(java.lang.String lowerBoundaryBarCodeText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERBOUNDARYBARCODETEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOWERBOUNDARYBARCODETEXT$4);
            }
            target.setStringValue(lowerBoundaryBarCodeText);
        }
    }
    
    /**
     * Sets (as xml) the "LowerBoundaryBarCodeText" element
     */
    public void xsetLowerBoundaryBarCodeText(com.sap.xi.ap.common.gdt.BarCodeText lowerBoundaryBarCodeText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BarCodeText target = null;
            target = (com.sap.xi.ap.common.gdt.BarCodeText)get_store().find_element_user(LOWERBOUNDARYBARCODETEXT$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.BarCodeText)get_store().add_element_user(LOWERBOUNDARYBARCODETEXT$4);
            }
            target.set(lowerBoundaryBarCodeText);
        }
    }
    
    /**
     * Unsets the "LowerBoundaryBarCodeText" element
     */
    public void unsetLowerBoundaryBarCodeText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOWERBOUNDARYBARCODETEXT$4, 0);
        }
    }
    
    /**
     * Gets the "UpperBoundaryBarCodeText" element
     */
    public java.lang.String getUpperBoundaryBarCodeText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERBOUNDARYBARCODETEXT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UpperBoundaryBarCodeText" element
     */
    public com.sap.xi.ap.common.gdt.BarCodeText xgetUpperBoundaryBarCodeText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BarCodeText target = null;
            target = (com.sap.xi.ap.common.gdt.BarCodeText)get_store().find_element_user(UPPERBOUNDARYBARCODETEXT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "UpperBoundaryBarCodeText" element
     */
    public boolean isSetUpperBoundaryBarCodeText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPPERBOUNDARYBARCODETEXT$6) != 0;
        }
    }
    
    /**
     * Sets the "UpperBoundaryBarCodeText" element
     */
    public void setUpperBoundaryBarCodeText(java.lang.String upperBoundaryBarCodeText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERBOUNDARYBARCODETEXT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPPERBOUNDARYBARCODETEXT$6);
            }
            target.setStringValue(upperBoundaryBarCodeText);
        }
    }
    
    /**
     * Sets (as xml) the "UpperBoundaryBarCodeText" element
     */
    public void xsetUpperBoundaryBarCodeText(com.sap.xi.ap.common.gdt.BarCodeText upperBoundaryBarCodeText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BarCodeText target = null;
            target = (com.sap.xi.ap.common.gdt.BarCodeText)get_store().find_element_user(UPPERBOUNDARYBARCODETEXT$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.BarCodeText)get_store().add_element_user(UPPERBOUNDARYBARCODETEXT$6);
            }
            target.set(upperBoundaryBarCodeText);
        }
    }
    
    /**
     * Unsets the "UpperBoundaryBarCodeText" element
     */
    public void unsetUpperBoundaryBarCodeText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPPERBOUNDARYBARCODETEXT$6, 0);
        }
    }
}
