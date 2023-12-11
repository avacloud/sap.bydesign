/*
 * XML Type:  TaxTypeCode
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.TaxTypeCode
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML TaxTypeCode(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.TaxTypeCode.
 */
public class TaxTypeCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.TaxTypeCode
{
    private static final long serialVersionUID = 1L;
    
    public TaxTypeCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected TaxTypeCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName LISTID$0 = 
        new javax.xml.namespace.QName("", "listID");
    private static final javax.xml.namespace.QName LISTVERSIONID$2 = 
        new javax.xml.namespace.QName("", "listVersionID");
    private static final javax.xml.namespace.QName LISTAGENCYID$4 = 
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
    public com.sap.xi.ap.common.gdt.TaxTypeCode.ListID xgetListID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TaxTypeCode.ListID target = null;
            target = (com.sap.xi.ap.common.gdt.TaxTypeCode.ListID)get_store().find_attribute_user(LISTID$0);
            return target;
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
    public void xsetListID(com.sap.xi.ap.common.gdt.TaxTypeCode.ListID listID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TaxTypeCode.ListID target = null;
            target = (com.sap.xi.ap.common.gdt.TaxTypeCode.ListID)get_store().find_attribute_user(LISTID$0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TaxTypeCode.ListID)get_store().add_attribute_user(LISTID$0);
            }
            target.set(listID);
        }
    }
    
    /**
     * Gets the "listVersionID" attribute
     */
    public java.lang.String getListVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTVERSIONID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "listVersionID" attribute
     */
    public com.sap.xi.ap.common.gdt.TaxTypeCode.ListVersionID xgetListVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TaxTypeCode.ListVersionID target = null;
            target = (com.sap.xi.ap.common.gdt.TaxTypeCode.ListVersionID)get_store().find_attribute_user(LISTVERSIONID$2);
            return target;
        }
    }
    
    /**
     * True if has "listVersionID" attribute
     */
    public boolean isSetListVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LISTVERSIONID$2) != null;
        }
    }
    
    /**
     * Sets the "listVersionID" attribute
     */
    public void setListVersionID(java.lang.String listVersionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTVERSIONID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTVERSIONID$2);
            }
            target.setStringValue(listVersionID);
        }
    }
    
    /**
     * Sets (as xml) the "listVersionID" attribute
     */
    public void xsetListVersionID(com.sap.xi.ap.common.gdt.TaxTypeCode.ListVersionID listVersionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TaxTypeCode.ListVersionID target = null;
            target = (com.sap.xi.ap.common.gdt.TaxTypeCode.ListVersionID)get_store().find_attribute_user(LISTVERSIONID$2);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TaxTypeCode.ListVersionID)get_store().add_attribute_user(LISTVERSIONID$2);
            }
            target.set(listVersionID);
        }
    }
    
    /**
     * Unsets the "listVersionID" attribute
     */
    public void unsetListVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LISTVERSIONID$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTAGENCYID$4);
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
    public com.sap.xi.ap.common.gdt.TaxTypeCode.ListAgencyID xgetListAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TaxTypeCode.ListAgencyID target = null;
            target = (com.sap.xi.ap.common.gdt.TaxTypeCode.ListAgencyID)get_store().find_attribute_user(LISTAGENCYID$4);
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
            return get_store().find_attribute_user(LISTAGENCYID$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTAGENCYID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTAGENCYID$4);
            }
            target.setStringValue(listAgencyID);
        }
    }
    
    /**
     * Sets (as xml) the "listAgencyID" attribute
     */
    public void xsetListAgencyID(com.sap.xi.ap.common.gdt.TaxTypeCode.ListAgencyID listAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TaxTypeCode.ListAgencyID target = null;
            target = (com.sap.xi.ap.common.gdt.TaxTypeCode.ListAgencyID)get_store().find_attribute_user(LISTAGENCYID$4);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TaxTypeCode.ListAgencyID)get_store().add_attribute_user(LISTAGENCYID$4);
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
            get_store().remove_attribute(LISTAGENCYID$4);
        }
    }
    /**
     * An XML listID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.TaxTypeCode$ListID.
     */
    public static class ListIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.TaxTypeCode.ListID
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
     * An XML listVersionID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.TaxTypeCode$ListVersionID.
     */
    public static class ListVersionIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.TaxTypeCode.ListVersionID
    {
        private static final long serialVersionUID = 1L;
        
        public ListVersionIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ListVersionIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML listAgencyID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.TaxTypeCode$ListAgencyID.
     */
    public static class ListAgencyIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.TaxTypeCode.ListAgencyID
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
