/*
 * XML Type:  ObjectID
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.ObjectID
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML ObjectID(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.ObjectID.
 */
public class ObjectIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.ObjectID
{
    private static final long serialVersionUID = 1L;
    
    public ObjectIDImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected ObjectIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName SCHEMEID$0 = 
        new javax.xml.namespace.QName("", "schemeID");
    private static final javax.xml.namespace.QName SCHEMEVERSIONID$2 = 
        new javax.xml.namespace.QName("", "schemeVersionID");
    private static final javax.xml.namespace.QName SCHEMEAGENCYID$4 = 
        new javax.xml.namespace.QName("", "schemeAgencyID");
    private static final javax.xml.namespace.QName SCHEMEAGENCYSCHEMEID$6 = 
        new javax.xml.namespace.QName("", "schemeAgencySchemeID");
    private static final javax.xml.namespace.QName SCHEMEAGENCYSCHEMEAGENCYID$8 = 
        new javax.xml.namespace.QName("", "schemeAgencySchemeAgencyID");
    
    
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
    public com.sap.xi.ap.common.gdt.ObjectID.SchemeID xgetSchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectID.SchemeID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectID.SchemeID)get_store().find_attribute_user(SCHEMEID$0);
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
    public void xsetSchemeID(com.sap.xi.ap.common.gdt.ObjectID.SchemeID schemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectID.SchemeID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectID.SchemeID)get_store().find_attribute_user(SCHEMEID$0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ObjectID.SchemeID)get_store().add_attribute_user(SCHEMEID$0);
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
    public com.sap.xi.ap.common.gdt.ObjectID.SchemeVersionID xgetSchemeVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectID.SchemeVersionID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectID.SchemeVersionID)get_store().find_attribute_user(SCHEMEVERSIONID$2);
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
    public void xsetSchemeVersionID(com.sap.xi.ap.common.gdt.ObjectID.SchemeVersionID schemeVersionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectID.SchemeVersionID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectID.SchemeVersionID)get_store().find_attribute_user(SCHEMEVERSIONID$2);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ObjectID.SchemeVersionID)get_store().add_attribute_user(SCHEMEVERSIONID$2);
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
    public com.sap.xi.ap.common.gdt.ObjectID.SchemeAgencyID xgetSchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectID.SchemeAgencyID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectID.SchemeAgencyID)get_store().find_attribute_user(SCHEMEAGENCYID$4);
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
    public void xsetSchemeAgencyID(com.sap.xi.ap.common.gdt.ObjectID.SchemeAgencyID schemeAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectID.SchemeAgencyID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectID.SchemeAgencyID)get_store().find_attribute_user(SCHEMEAGENCYID$4);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ObjectID.SchemeAgencyID)get_store().add_attribute_user(SCHEMEAGENCYID$4);
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
     * Gets the "schemeAgencySchemeID" attribute
     */
    public java.lang.String getSchemeAgencySchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMEAGENCYSCHEMEID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "schemeAgencySchemeID" attribute
     */
    public com.sap.xi.ap.common.gdt.ObjectID.SchemeAgencySchemeID xgetSchemeAgencySchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectID.SchemeAgencySchemeID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectID.SchemeAgencySchemeID)get_store().find_attribute_user(SCHEMEAGENCYSCHEMEID$6);
            return target;
        }
    }
    
    /**
     * True if has "schemeAgencySchemeID" attribute
     */
    public boolean isSetSchemeAgencySchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCHEMEAGENCYSCHEMEID$6) != null;
        }
    }
    
    /**
     * Sets the "schemeAgencySchemeID" attribute
     */
    public void setSchemeAgencySchemeID(java.lang.String schemeAgencySchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMEAGENCYSCHEMEID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMEAGENCYSCHEMEID$6);
            }
            target.setStringValue(schemeAgencySchemeID);
        }
    }
    
    /**
     * Sets (as xml) the "schemeAgencySchemeID" attribute
     */
    public void xsetSchemeAgencySchemeID(com.sap.xi.ap.common.gdt.ObjectID.SchemeAgencySchemeID schemeAgencySchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectID.SchemeAgencySchemeID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectID.SchemeAgencySchemeID)get_store().find_attribute_user(SCHEMEAGENCYSCHEMEID$6);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ObjectID.SchemeAgencySchemeID)get_store().add_attribute_user(SCHEMEAGENCYSCHEMEID$6);
            }
            target.set(schemeAgencySchemeID);
        }
    }
    
    /**
     * Unsets the "schemeAgencySchemeID" attribute
     */
    public void unsetSchemeAgencySchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCHEMEAGENCYSCHEMEID$6);
        }
    }
    
    /**
     * Gets the "schemeAgencySchemeAgencyID" attribute
     */
    public java.lang.String getSchemeAgencySchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMEAGENCYSCHEMEAGENCYID$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "schemeAgencySchemeAgencyID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSchemeAgencySchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCHEMEAGENCYSCHEMEAGENCYID$8);
            return target;
        }
    }
    
    /**
     * True if has "schemeAgencySchemeAgencyID" attribute
     */
    public boolean isSetSchemeAgencySchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCHEMEAGENCYSCHEMEAGENCYID$8) != null;
        }
    }
    
    /**
     * Sets the "schemeAgencySchemeAgencyID" attribute
     */
    public void setSchemeAgencySchemeAgencyID(java.lang.String schemeAgencySchemeAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMEAGENCYSCHEMEAGENCYID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMEAGENCYSCHEMEAGENCYID$8);
            }
            target.setStringValue(schemeAgencySchemeAgencyID);
        }
    }
    
    /**
     * Sets (as xml) the "schemeAgencySchemeAgencyID" attribute
     */
    public void xsetSchemeAgencySchemeAgencyID(org.apache.xmlbeans.XmlString schemeAgencySchemeAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCHEMEAGENCYSCHEMEAGENCYID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SCHEMEAGENCYSCHEMEAGENCYID$8);
            }
            target.set(schemeAgencySchemeAgencyID);
        }
    }
    
    /**
     * Unsets the "schemeAgencySchemeAgencyID" attribute
     */
    public void unsetSchemeAgencySchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCHEMEAGENCYSCHEMEAGENCYID$8);
        }
    }
    /**
     * An XML schemeID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.ObjectID$SchemeID.
     */
    public static class SchemeIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.ObjectID.SchemeID
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
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.ObjectID$SchemeVersionID.
     */
    public static class SchemeVersionIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.ObjectID.SchemeVersionID
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
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.ObjectID$SchemeAgencyID.
     */
    public static class SchemeAgencyIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.ObjectID.SchemeAgencyID
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
    /**
     * An XML schemeAgencySchemeID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.ObjectID$SchemeAgencySchemeID.
     */
    public static class SchemeAgencySchemeIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.ObjectID.SchemeAgencySchemeID
    {
        private static final long serialVersionUID = 1L;
        
        public SchemeAgencySchemeIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SchemeAgencySchemeIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
