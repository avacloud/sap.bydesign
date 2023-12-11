/*
 * XML Type:  OperationTypeCode
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.OperationTypeCode
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML OperationTypeCode(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.OperationTypeCode.
 */
public class OperationTypeCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.OperationTypeCode
{
    private static final long serialVersionUID = 1L;
    
    public OperationTypeCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected OperationTypeCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
    public com.sap.xi.ap.common.gdt.OperationTypeCode.ListAgencyID xgetListAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationTypeCode.ListAgencyID target = null;
            target = (com.sap.xi.ap.common.gdt.OperationTypeCode.ListAgencyID)get_store().find_attribute_user(LISTAGENCYID$0);
            return target;
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
    public void xsetListAgencyID(com.sap.xi.ap.common.gdt.OperationTypeCode.ListAgencyID listAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationTypeCode.ListAgencyID target = null;
            target = (com.sap.xi.ap.common.gdt.OperationTypeCode.ListAgencyID)get_store().find_attribute_user(LISTAGENCYID$0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.OperationTypeCode.ListAgencyID)get_store().add_attribute_user(LISTAGENCYID$0);
            }
            target.set(listAgencyID);
        }
    }
    /**
     * An XML listAgencyID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.OperationTypeCode$ListAgencyID.
     */
    public static class ListAgencyIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.OperationTypeCode.ListAgencyID
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
