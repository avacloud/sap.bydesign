/*
 * XML Type:  Code
 * Namespace: http://sap.com/xi/BASIS/Global
 * Java type: com.sap.xi.basis.global.Code
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.basis.global.impl;
/**
 * An XML Code(@http://sap.com/xi/BASIS/Global).
 *
 * This is an atomic type that is a restriction of com.sap.xi.basis.global.Code.
 */
public class CodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.basis.global.Code
{
    private static final long serialVersionUID = 1L;
    
    public CodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName LISTID$0 = 
        new javax.xml.namespace.QName("", "listID");
    private static final javax.xml.namespace.QName LISTVERSIONID$2 = 
        new javax.xml.namespace.QName("", "listVersionID");
    private static final javax.xml.namespace.QName LISTAGENCYID$4 = 
        new javax.xml.namespace.QName("", "listAgencyID");
    private static final javax.xml.namespace.QName LISTAGENCYSCHEMEID$6 = 
        new javax.xml.namespace.QName("", "listAgencySchemeID");
    private static final javax.xml.namespace.QName LISTAGENCYSCHEMEAGENCYID$8 = 
        new javax.xml.namespace.QName("", "listAgencySchemeAgencyID");
    
    
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
    public com.sap.xi.basis.global.Code.ListID xgetListID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.Code.ListID target = null;
            target = (com.sap.xi.basis.global.Code.ListID)get_store().find_attribute_user(LISTID$0);
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
    public void xsetListID(com.sap.xi.basis.global.Code.ListID listID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.Code.ListID target = null;
            target = (com.sap.xi.basis.global.Code.ListID)get_store().find_attribute_user(LISTID$0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.Code.ListID)get_store().add_attribute_user(LISTID$0);
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
    public com.sap.xi.basis.global.Code.ListVersionID xgetListVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.Code.ListVersionID target = null;
            target = (com.sap.xi.basis.global.Code.ListVersionID)get_store().find_attribute_user(LISTVERSIONID$2);
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
    public void xsetListVersionID(com.sap.xi.basis.global.Code.ListVersionID listVersionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.Code.ListVersionID target = null;
            target = (com.sap.xi.basis.global.Code.ListVersionID)get_store().find_attribute_user(LISTVERSIONID$2);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.Code.ListVersionID)get_store().add_attribute_user(LISTVERSIONID$2);
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
    public com.sap.xi.basis.global.Code.ListAgencyID xgetListAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.Code.ListAgencyID target = null;
            target = (com.sap.xi.basis.global.Code.ListAgencyID)get_store().find_attribute_user(LISTAGENCYID$4);
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
    public void xsetListAgencyID(com.sap.xi.basis.global.Code.ListAgencyID listAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.Code.ListAgencyID target = null;
            target = (com.sap.xi.basis.global.Code.ListAgencyID)get_store().find_attribute_user(LISTAGENCYID$4);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.Code.ListAgencyID)get_store().add_attribute_user(LISTAGENCYID$4);
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
     * Gets the "listAgencySchemeID" attribute
     */
    public java.lang.String getListAgencySchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTAGENCYSCHEMEID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "listAgencySchemeID" attribute
     */
    public com.sap.xi.basis.global.Code.ListAgencySchemeID xgetListAgencySchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.Code.ListAgencySchemeID target = null;
            target = (com.sap.xi.basis.global.Code.ListAgencySchemeID)get_store().find_attribute_user(LISTAGENCYSCHEMEID$6);
            return target;
        }
    }
    
    /**
     * True if has "listAgencySchemeID" attribute
     */
    public boolean isSetListAgencySchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LISTAGENCYSCHEMEID$6) != null;
        }
    }
    
    /**
     * Sets the "listAgencySchemeID" attribute
     */
    public void setListAgencySchemeID(java.lang.String listAgencySchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTAGENCYSCHEMEID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTAGENCYSCHEMEID$6);
            }
            target.setStringValue(listAgencySchemeID);
        }
    }
    
    /**
     * Sets (as xml) the "listAgencySchemeID" attribute
     */
    public void xsetListAgencySchemeID(com.sap.xi.basis.global.Code.ListAgencySchemeID listAgencySchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.Code.ListAgencySchemeID target = null;
            target = (com.sap.xi.basis.global.Code.ListAgencySchemeID)get_store().find_attribute_user(LISTAGENCYSCHEMEID$6);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.Code.ListAgencySchemeID)get_store().add_attribute_user(LISTAGENCYSCHEMEID$6);
            }
            target.set(listAgencySchemeID);
        }
    }
    
    /**
     * Unsets the "listAgencySchemeID" attribute
     */
    public void unsetListAgencySchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LISTAGENCYSCHEMEID$6);
        }
    }
    
    /**
     * Gets the "listAgencySchemeAgencyID" attribute
     */
    public com.sap.xi.basis.global.AgencyIdentificationCode.Enum getListAgencySchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTAGENCYSCHEMEAGENCYID$8);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.basis.global.AgencyIdentificationCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "listAgencySchemeAgencyID" attribute
     */
    public com.sap.xi.basis.global.AgencyIdentificationCode xgetListAgencySchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.AgencyIdentificationCode target = null;
            target = (com.sap.xi.basis.global.AgencyIdentificationCode)get_store().find_attribute_user(LISTAGENCYSCHEMEAGENCYID$8);
            return target;
        }
    }
    
    /**
     * True if has "listAgencySchemeAgencyID" attribute
     */
    public boolean isSetListAgencySchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LISTAGENCYSCHEMEAGENCYID$8) != null;
        }
    }
    
    /**
     * Sets the "listAgencySchemeAgencyID" attribute
     */
    public void setListAgencySchemeAgencyID(com.sap.xi.basis.global.AgencyIdentificationCode.Enum listAgencySchemeAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTAGENCYSCHEMEAGENCYID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTAGENCYSCHEMEAGENCYID$8);
            }
            target.setEnumValue(listAgencySchemeAgencyID);
        }
    }
    
    /**
     * Sets (as xml) the "listAgencySchemeAgencyID" attribute
     */
    public void xsetListAgencySchemeAgencyID(com.sap.xi.basis.global.AgencyIdentificationCode listAgencySchemeAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.AgencyIdentificationCode target = null;
            target = (com.sap.xi.basis.global.AgencyIdentificationCode)get_store().find_attribute_user(LISTAGENCYSCHEMEAGENCYID$8);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.AgencyIdentificationCode)get_store().add_attribute_user(LISTAGENCYSCHEMEAGENCYID$8);
            }
            target.set(listAgencySchemeAgencyID);
        }
    }
    
    /**
     * Unsets the "listAgencySchemeAgencyID" attribute
     */
    public void unsetListAgencySchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LISTAGENCYSCHEMEAGENCYID$8);
        }
    }
    /**
     * An XML listID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.basis.global.Code$ListID.
     */
    public static class ListIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.basis.global.Code.ListID
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
     * This is an atomic type that is a restriction of com.sap.xi.basis.global.Code$ListVersionID.
     */
    public static class ListVersionIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.basis.global.Code.ListVersionID
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
     * This is an atomic type that is a restriction of com.sap.xi.basis.global.Code$ListAgencyID.
     */
    public static class ListAgencyIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.basis.global.Code.ListAgencyID
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
    /**
     * An XML listAgencySchemeID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.basis.global.Code$ListAgencySchemeID.
     */
    public static class ListAgencySchemeIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.basis.global.Code.ListAgencySchemeID
    {
        private static final long serialVersionUID = 1L;
        
        public ListAgencySchemeIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ListAgencySchemeIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
