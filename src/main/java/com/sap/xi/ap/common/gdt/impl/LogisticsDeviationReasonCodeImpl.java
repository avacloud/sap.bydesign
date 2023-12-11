/*
 * XML Type:  LogisticsDeviationReasonCode
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML LogisticsDeviationReasonCode(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode.
 */
public class LogisticsDeviationReasonCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode
{
    private static final long serialVersionUID = 1L;
    
    public LogisticsDeviationReasonCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected LogisticsDeviationReasonCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
    public com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode.ListAgencyID xgetListAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode.ListAgencyID target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode.ListAgencyID)get_store().find_attribute_user(LISTAGENCYID$0);
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
    public void xsetListAgencyID(com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode.ListAgencyID listAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode.ListAgencyID target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode.ListAgencyID)get_store().find_attribute_user(LISTAGENCYID$0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode.ListAgencyID)get_store().add_attribute_user(LISTAGENCYID$0);
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
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode$ListAgencyID.
     */
    public static class ListAgencyIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode.ListAgencyID
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
