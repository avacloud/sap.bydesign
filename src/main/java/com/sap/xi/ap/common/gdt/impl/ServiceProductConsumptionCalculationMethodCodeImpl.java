/*
 * XML Type:  ServiceProductConsumptionCalculationMethodCode
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML ServiceProductConsumptionCalculationMethodCode(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.
 */
public class ServiceProductConsumptionCalculationMethodCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode
{
    private static final long serialVersionUID = 1L;
    
    public ServiceProductConsumptionCalculationMethodCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected ServiceProductConsumptionCalculationMethodCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName LISTID$0 = 
        new javax.xml.namespace.QName("", "listID");
    private static final javax.xml.namespace.QName LISTAGENCYID$2 = 
        new javax.xml.namespace.QName("", "listAgencyID");
    
    
    /**
     * Gets the "listID" attribute
     */
    public java.lang.String getListID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "listID" attribute
     */
    public com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListID xgetListID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListID target = null;
            target = (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListID)get_store().find_attribute_user(LISTID$0);
            return target;
        }
    }
    
    /**
     * True if has "listID" attribute
     */
    public boolean isSetListID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LISTID$0) != null;
        }
    }
    
    /**
     * Sets the "listID" attribute
     */
    public void setListID(java.lang.String listID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTID$0);
            }
            target.setStringValue(listID);
        }
    }
    
    /**
     * Sets (as xml) the "listID" attribute
     */
    public void xsetListID(com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListID listID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListID target = null;
            target = (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListID)get_store().find_attribute_user(LISTID$0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListID)get_store().add_attribute_user(LISTID$0);
            }
            target.set(listID);
        }
    }
    
    /**
     * Unsets the "listID" attribute
     */
    public void unsetListID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LISTID$0);
        }
    }
    
    /**
     * Gets the "listAgencyID" attribute
     */
    public java.lang.String getListAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTAGENCYID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "listAgencyID" attribute
     */
    public com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListAgencyID xgetListAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListAgencyID target = null;
            target = (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListAgencyID)get_store().find_attribute_user(LISTAGENCYID$2);
            return target;
        }
    }
    
    /**
     * True if has "listAgencyID" attribute
     */
    public boolean isSetListAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LISTAGENCYID$2) != null;
        }
    }
    
    /**
     * Sets the "listAgencyID" attribute
     */
    public void setListAgencyID(java.lang.String listAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTAGENCYID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTAGENCYID$2);
            }
            target.setStringValue(listAgencyID);
        }
    }
    
    /**
     * Sets (as xml) the "listAgencyID" attribute
     */
    public void xsetListAgencyID(com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListAgencyID listAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListAgencyID target = null;
            target = (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListAgencyID)get_store().find_attribute_user(LISTAGENCYID$2);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListAgencyID)get_store().add_attribute_user(LISTAGENCYID$2);
            }
            target.set(listAgencyID);
        }
    }
    
    /**
     * Unsets the "listAgencyID" attribute
     */
    public void unsetListAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LISTAGENCYID$2);
        }
    }
    /**
     * An XML listID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode$ListID.
     */
    public static class ListIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListID
    {
        private static final long serialVersionUID = 1L;
        
        public ListIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ListIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML listAgencyID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode$ListAgencyID.
     */
    public static class ListAgencyIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListAgencyID
    {
        private static final long serialVersionUID = 1L;
        
        public ListAgencyIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ListAgencyIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
