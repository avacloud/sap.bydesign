/*
 * XML Type:  Quantity
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.Quantity
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML Quantity(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.Quantity.
 */
public class QuantityImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements com.sap.xi.ap.common.gdt.Quantity
{
    private static final long serialVersionUID = 1L;
    
    public QuantityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected QuantityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName UNITCODE$0 = 
        new javax.xml.namespace.QName("", "unitCode");
    
    
    /**
     * Gets the "unitCode" attribute
     */
    public java.lang.String getUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNITCODE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "unitCode" attribute
     */
    public com.sap.xi.ap.common.gdt.MeasureUnitCode xgetUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MeasureUnitCode target = null;
            target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().find_attribute_user(UNITCODE$0);
            return target;
        }
    }
    
    /**
     * True if has "unitCode" attribute
     */
    public boolean isSetUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNITCODE$0) != null;
        }
    }
    
    /**
     * Sets the "unitCode" attribute
     */
    public void setUnitCode(java.lang.String unitCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNITCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNITCODE$0);
            }
            target.setStringValue(unitCode);
        }
    }
    
    /**
     * Sets (as xml) the "unitCode" attribute
     */
    public void xsetUnitCode(com.sap.xi.ap.common.gdt.MeasureUnitCode unitCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MeasureUnitCode target = null;
            target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().find_attribute_user(UNITCODE$0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().add_attribute_user(UNITCODE$0);
            }
            target.set(unitCode);
        }
    }
    
    /**
     * Unsets the "unitCode" attribute
     */
    public void unsetUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNITCODE$0);
        }
    }
}
