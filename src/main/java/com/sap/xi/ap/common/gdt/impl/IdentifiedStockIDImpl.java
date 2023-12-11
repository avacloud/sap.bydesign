/*
 * XML Type:  IdentifiedStockID
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.IdentifiedStockID
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML IdentifiedStockID(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.IdentifiedStockID.
 */
public class IdentifiedStockIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.IdentifiedStockID
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiedStockIDImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected IdentifiedStockIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName SCHEMEID$0 = 
        new javax.xml.namespace.QName("", "schemeID");
    private static final javax.xml.namespace.QName SCHEMEVERSIONID$2 = 
        new javax.xml.namespace.QName("", "schemeVersionID");
    private static final javax.xml.namespace.QName SCHEMEAGENCYID$4 = 
        new javax.xml.namespace.QName("", "schemeAgencyID");
    
    
    /**
     * Gets the "schemeID" attribute
     */
    public java.lang.String getSchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMEID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "schemeID" attribute
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeID xgetSchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeID)get_store().find_attribute_user(SCHEMEID$0);
            return target;
        }
    }
    
    /**
     * True if has "schemeID" attribute
     */
    public boolean isSetSchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCHEMEID$0) != null;
        }
    }
    
    /**
     * Sets the "schemeID" attribute
     */
    public void setSchemeID(java.lang.String schemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMEID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMEID$0);
            }
            target.setStringValue(schemeID);
        }
    }
    
    /**
     * Sets (as xml) the "schemeID" attribute
     */
    public void xsetSchemeID(com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeID schemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeID)get_store().find_attribute_user(SCHEMEID$0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeID)get_store().add_attribute_user(SCHEMEID$0);
            }
            target.set(schemeID);
        }
    }
    
    /**
     * Unsets the "schemeID" attribute
     */
    public void unsetSchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCHEMEID$0);
        }
    }
    
    /**
     * Gets the "schemeVersionID" attribute
     */
    public java.lang.String getSchemeVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMEVERSIONID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "schemeVersionID" attribute
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeVersionID xgetSchemeVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeVersionID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeVersionID)get_store().find_attribute_user(SCHEMEVERSIONID$2);
            return target;
        }
    }
    
    /**
     * True if has "schemeVersionID" attribute
     */
    public boolean isSetSchemeVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCHEMEVERSIONID$2) != null;
        }
    }
    
    /**
     * Sets the "schemeVersionID" attribute
     */
    public void setSchemeVersionID(java.lang.String schemeVersionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMEVERSIONID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMEVERSIONID$2);
            }
            target.setStringValue(schemeVersionID);
        }
    }
    
    /**
     * Sets (as xml) the "schemeVersionID" attribute
     */
    public void xsetSchemeVersionID(com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeVersionID schemeVersionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeVersionID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeVersionID)get_store().find_attribute_user(SCHEMEVERSIONID$2);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeVersionID)get_store().add_attribute_user(SCHEMEVERSIONID$2);
            }
            target.set(schemeVersionID);
        }
    }
    
    /**
     * Unsets the "schemeVersionID" attribute
     */
    public void unsetSchemeVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCHEMEVERSIONID$2);
        }
    }
    
    /**
     * Gets the "schemeAgencyID" attribute
     */
    public java.lang.String getSchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMEAGENCYID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "schemeAgencyID" attribute
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeAgencyID xgetSchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeAgencyID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeAgencyID)get_store().find_attribute_user(SCHEMEAGENCYID$4);
            return target;
        }
    }
    
    /**
     * True if has "schemeAgencyID" attribute
     */
    public boolean isSetSchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCHEMEAGENCYID$4) != null;
        }
    }
    
    /**
     * Sets the "schemeAgencyID" attribute
     */
    public void setSchemeAgencyID(java.lang.String schemeAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMEAGENCYID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMEAGENCYID$4);
            }
            target.setStringValue(schemeAgencyID);
        }
    }
    
    /**
     * Sets (as xml) the "schemeAgencyID" attribute
     */
    public void xsetSchemeAgencyID(com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeAgencyID schemeAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeAgencyID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeAgencyID)get_store().find_attribute_user(SCHEMEAGENCYID$4);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeAgencyID)get_store().add_attribute_user(SCHEMEAGENCYID$4);
            }
            target.set(schemeAgencyID);
        }
    }
    
    /**
     * Unsets the "schemeAgencyID" attribute
     */
    public void unsetSchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCHEMEAGENCYID$4);
        }
    }
    /**
     * An XML schemeID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.IdentifiedStockID$SchemeID.
     */
    public static class SchemeIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeID
    {
        private static final long serialVersionUID = 1L;
        
        public SchemeIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SchemeIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML schemeVersionID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.IdentifiedStockID$SchemeVersionID.
     */
    public static class SchemeVersionIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeVersionID
    {
        private static final long serialVersionUID = 1L;
        
        public SchemeVersionIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SchemeVersionIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML schemeAgencyID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.IdentifiedStockID$SchemeAgencyID.
     */
    public static class SchemeAgencyIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.IdentifiedStockID.SchemeAgencyID
    {
        private static final long serialVersionUID = 1L;
        
        public SchemeAgencyIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SchemeAgencyIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
