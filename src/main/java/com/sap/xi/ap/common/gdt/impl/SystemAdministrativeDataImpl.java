/*
 * XML Type:  SystemAdministrativeData
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.SystemAdministrativeData
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML SystemAdministrativeData(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is a complex type.
 */
public class SystemAdministrativeDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.common.gdt.SystemAdministrativeData
{
    private static final long serialVersionUID = 1L;
    
    public SystemAdministrativeDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATIONDATETIME$0 = 
        new javax.xml.namespace.QName("", "CreationDateTime");
    private static final javax.xml.namespace.QName CREATIONIDENTITYUUID$2 = 
        new javax.xml.namespace.QName("", "CreationIdentityUUID");
    private static final javax.xml.namespace.QName LASTCHANGEDATETIME$4 = 
        new javax.xml.namespace.QName("", "LastChangeDateTime");
    private static final javax.xml.namespace.QName LASTCHANGEIDENTITYUUID$6 = 
        new javax.xml.namespace.QName("", "LastChangeIdentityUUID");
    
    
    /**
     * Gets the "CreationDateTime" element
     */
    public java.util.Calendar getCreationDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONDATETIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreationDateTime" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetCreationDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(CREATIONDATETIME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CreationDateTime" element
     */
    public void setCreationDateTime(java.util.Calendar creationDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONDATETIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATIONDATETIME$0);
            }
            target.setCalendarValue(creationDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "CreationDateTime" element
     */
    public void xsetCreationDateTime(com.sap.xi.basis.global.GLOBALDateTime creationDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(CREATIONDATETIME$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(CREATIONDATETIME$0);
            }
            target.set(creationDateTime);
        }
    }
    
    /**
     * Gets the "CreationIdentityUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getCreationIdentityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(CREATIONIDENTITYUUID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CreationIdentityUUID" element
     */
    public boolean isSetCreationIdentityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATIONIDENTITYUUID$2) != 0;
        }
    }
    
    /**
     * Sets the "CreationIdentityUUID" element
     */
    public void setCreationIdentityUUID(com.sap.xi.ap.common.gdt.UUID creationIdentityUUID)
    {
        generatedSetterHelperImpl(creationIdentityUUID, CREATIONIDENTITYUUID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CreationIdentityUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewCreationIdentityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(CREATIONIDENTITYUUID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "CreationIdentityUUID" element
     */
    public void unsetCreationIdentityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATIONIDENTITYUUID$2, 0);
        }
    }
    
    /**
     * Gets the "LastChangeDateTime" element
     */
    public java.util.Calendar getLastChangeDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTCHANGEDATETIME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "LastChangeDateTime" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetLastChangeDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(LASTCHANGEDATETIME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LastChangeDateTime" element
     */
    public boolean isSetLastChangeDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTCHANGEDATETIME$4) != 0;
        }
    }
    
    /**
     * Sets the "LastChangeDateTime" element
     */
    public void setLastChangeDateTime(java.util.Calendar lastChangeDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTCHANGEDATETIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTCHANGEDATETIME$4);
            }
            target.setCalendarValue(lastChangeDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "LastChangeDateTime" element
     */
    public void xsetLastChangeDateTime(com.sap.xi.basis.global.GLOBALDateTime lastChangeDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(LASTCHANGEDATETIME$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(LASTCHANGEDATETIME$4);
            }
            target.set(lastChangeDateTime);
        }
    }
    
    /**
     * Unsets the "LastChangeDateTime" element
     */
    public void unsetLastChangeDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTCHANGEDATETIME$4, 0);
        }
    }
    
    /**
     * Gets the "LastChangeIdentityUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getLastChangeIdentityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(LASTCHANGEIDENTITYUUID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LastChangeIdentityUUID" element
     */
    public boolean isSetLastChangeIdentityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTCHANGEIDENTITYUUID$6) != 0;
        }
    }
    
    /**
     * Sets the "LastChangeIdentityUUID" element
     */
    public void setLastChangeIdentityUUID(com.sap.xi.ap.common.gdt.UUID lastChangeIdentityUUID)
    {
        generatedSetterHelperImpl(lastChangeIdentityUUID, LASTCHANGEIDENTITYUUID$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LastChangeIdentityUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewLastChangeIdentityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(LASTCHANGEIDENTITYUUID$6);
            return target;
        }
    }
    
    /**
     * Unsets the "LastChangeIdentityUUID" element
     */
    public void unsetLastChangeIdentityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTCHANGEIDENTITYUUID$6, 0);
        }
    }
}
