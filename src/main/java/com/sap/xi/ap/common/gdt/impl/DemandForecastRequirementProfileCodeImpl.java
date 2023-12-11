/*
 * XML Type:  DemandForecastRequirementProfileCode
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML DemandForecastRequirementProfileCode(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode.
 */
public class DemandForecastRequirementProfileCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode
{
    private static final long serialVersionUID = 1L;
    
    public DemandForecastRequirementProfileCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected DemandForecastRequirementProfileCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName LISTAGENCYID$0 = 
        new javax.xml.namespace.QName("", "listAgencyID");
    
    
    /**
     * Gets the "listAgencyID" attribute
     */
    public java.lang.String getListAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTAGENCYID$0);
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
    public com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode.ListAgencyID xgetListAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode.ListAgencyID target = null;
            target = (com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode.ListAgencyID)get_store().find_attribute_user(LISTAGENCYID$0);
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
            return get_store().find_attribute_user(LISTAGENCYID$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTAGENCYID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTAGENCYID$0);
            }
            target.setStringValue(listAgencyID);
        }
    }
    
    /**
     * Sets (as xml) the "listAgencyID" attribute
     */
    public void xsetListAgencyID(com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode.ListAgencyID listAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode.ListAgencyID target = null;
            target = (com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode.ListAgencyID)get_store().find_attribute_user(LISTAGENCYID$0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode.ListAgencyID)get_store().add_attribute_user(LISTAGENCYID$0);
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
            get_store().remove_attribute(LISTAGENCYID$0);
        }
    }
    /**
     * An XML listAgencyID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode$ListAgencyID.
     */
    public static class ListAgencyIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.DemandForecastRequirementProfileCode.ListAgencyID
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
