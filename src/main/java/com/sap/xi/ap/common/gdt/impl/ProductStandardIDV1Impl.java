/*
 * XML Type:  ProductStandardID_V1
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.ProductStandardIDV1
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML ProductStandardID_V1(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.ProductStandardIDV1.
 */
public class ProductStandardIDV1Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.ProductStandardIDV1
{
    private static final long serialVersionUID = 1L;
    
    public ProductStandardIDV1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected ProductStandardIDV1Impl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName SCHEMEID$0 = 
        new javax.xml.namespace.QName("", "schemeID");
    private static final javax.xml.namespace.QName SCHEMEAGENCYID$2 = 
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
    public com.sap.xi.ap.common.gdt.ProductStandardIDV1.SchemeID xgetSchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductStandardIDV1.SchemeID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductStandardIDV1.SchemeID)get_store().find_attribute_user(SCHEMEID$0);
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
    public void xsetSchemeID(com.sap.xi.ap.common.gdt.ProductStandardIDV1.SchemeID schemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductStandardIDV1.SchemeID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductStandardIDV1.SchemeID)get_store().find_attribute_user(SCHEMEID$0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProductStandardIDV1.SchemeID)get_store().add_attribute_user(SCHEMEID$0);
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
     * Gets the "schemeAgencyID" attribute
     */
    public java.lang.String getSchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMEAGENCYID$2);
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
    public com.sap.xi.ap.common.gdt.ProductStandardIDV1.SchemeAgencyID xgetSchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductStandardIDV1.SchemeAgencyID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductStandardIDV1.SchemeAgencyID)get_store().find_attribute_user(SCHEMEAGENCYID$2);
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
            return get_store().find_attribute_user(SCHEMEAGENCYID$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMEAGENCYID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMEAGENCYID$2);
            }
            target.setStringValue(schemeAgencyID);
        }
    }
    
    /**
     * Sets (as xml) the "schemeAgencyID" attribute
     */
    public void xsetSchemeAgencyID(com.sap.xi.ap.common.gdt.ProductStandardIDV1.SchemeAgencyID schemeAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductStandardIDV1.SchemeAgencyID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductStandardIDV1.SchemeAgencyID)get_store().find_attribute_user(SCHEMEAGENCYID$2);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProductStandardIDV1.SchemeAgencyID)get_store().add_attribute_user(SCHEMEAGENCYID$2);
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
            get_store().remove_attribute(SCHEMEAGENCYID$2);
        }
    }
    /**
     * An XML schemeID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.ProductStandardIDV1$SchemeID.
     */
    public static class SchemeIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.ProductStandardIDV1.SchemeID
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
     * An XML schemeAgencyID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.ProductStandardIDV1$SchemeAgencyID.
     */
    public static class SchemeAgencyIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.ProductStandardIDV1.SchemeAgencyID
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
