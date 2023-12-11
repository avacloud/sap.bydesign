/*
 * XML Type:  NamespaceURI
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.NamespaceURI
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML NamespaceURI(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.NamespaceURI.
 */
public class NamespaceURIImpl extends org.apache.xmlbeans.impl.values.JavaUriHolderEx implements com.sap.xi.ap.common.gdt.NamespaceURI
{
    private static final long serialVersionUID = 1L;
    
    public NamespaceURIImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected NamespaceURIImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName SCHEMEID$0 = 
        new javax.xml.namespace.QName("", "schemeID");
    
    
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
    public com.sap.xi.ap.common.gdt.NamespaceURI.SchemeID xgetSchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NamespaceURI.SchemeID target = null;
            target = (com.sap.xi.ap.common.gdt.NamespaceURI.SchemeID)get_store().find_attribute_user(SCHEMEID$0);
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
    public void xsetSchemeID(com.sap.xi.ap.common.gdt.NamespaceURI.SchemeID schemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NamespaceURI.SchemeID target = null;
            target = (com.sap.xi.ap.common.gdt.NamespaceURI.SchemeID)get_store().find_attribute_user(SCHEMEID$0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.NamespaceURI.SchemeID)get_store().add_attribute_user(SCHEMEID$0);
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
     * An XML schemeID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.NamespaceURI$SchemeID.
     */
    public static class SchemeIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.NamespaceURI.SchemeID
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
}
