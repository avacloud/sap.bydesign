/*
 * XML Type:  IdentifiedStockStatus
 * Namespace: http://sap.com/xi/AP/FO/IdentifiedStock/Global
 * Java type: com.sap.xi.ap.fo.identifiedstock.global.IdentifiedStockStatus
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.fo.identifiedstock.global.impl;
/**
 * An XML IdentifiedStockStatus(@http://sap.com/xi/AP/FO/IdentifiedStock/Global).
 *
 * This is a complex type.
 */
public class IdentifiedStockStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.fo.identifiedstock.global.IdentifiedStockStatus
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiedStockStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIFECYCLESTATUSCODE$0 = 
        new javax.xml.namespace.QName("", "LifeCycleStatusCode");
    
    
    /**
     * Gets the "LifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockLifeCycleStatusCode.Enum getLifeCycleStatusCode()
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
            return (com.sap.xi.ap.common.gdt.IdentifiedStockLifeCycleStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockLifeCycleStatusCode xgetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LifeCycleStatusCode" element
     */
    public void setLifeCycleStatusCode(com.sap.xi.ap.common.gdt.IdentifiedStockLifeCycleStatusCode.Enum lifeCycleStatusCode)
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
    public void xsetLifeCycleStatusCode(com.sap.xi.ap.common.gdt.IdentifiedStockLifeCycleStatusCode lifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.IdentifiedStockLifeCycleStatusCode)get_store().add_element_user(LIFECYCLESTATUSCODE$0);
            }
            target.set(lifeCycleStatusCode);
        }
    }
}
