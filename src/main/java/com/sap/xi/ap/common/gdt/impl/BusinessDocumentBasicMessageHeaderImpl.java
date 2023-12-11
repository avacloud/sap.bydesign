/*
 * XML Type:  BusinessDocumentBasicMessageHeader
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML BusinessDocumentBasicMessageHeader(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is a complex type.
 */
public class BusinessDocumentBasicMessageHeaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader
{
    private static final long serialVersionUID = 1L;
    
    public BusinessDocumentBasicMessageHeaderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName UUID$2 = 
        new javax.xml.namespace.QName("", "UUID");
    private static final javax.xml.namespace.QName REFERENCEID$4 = 
        new javax.xml.namespace.QName("", "ReferenceID");
    private static final javax.xml.namespace.QName REFERENCEUUID$6 = 
        new javax.xml.namespace.QName("", "ReferenceUUID");
    
    
    /**
     * Gets the "ID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessDocumentMessageID getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessDocumentMessageID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessDocumentMessageID)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ID" element
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$0) != 0;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(com.sap.xi.ap.common.gdt.BusinessDocumentMessageID id)
    {
        generatedSetterHelperImpl(id, ID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessDocumentMessageID addNewID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessDocumentMessageID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessDocumentMessageID)get_store().add_element_user(ID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ID" element
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$0, 0);
        }
    }
    
    /**
     * Gets the "UUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(UUID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "UUID" element
     */
    public boolean isSetUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UUID$2) != 0;
        }
    }
    
    /**
     * Sets the "UUID" element
     */
    public void setUUID(com.sap.xi.ap.common.gdt.UUID uuid)
    {
        generatedSetterHelperImpl(uuid, UUID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(UUID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "UUID" element
     */
    public void unsetUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UUID$2, 0);
        }
    }
    
    /**
     * Gets the "ReferenceID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessDocumentMessageID getReferenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessDocumentMessageID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessDocumentMessageID)get_store().find_element_user(REFERENCEID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReferenceID" element
     */
    public boolean isSetReferenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEID$4) != 0;
        }
    }
    
    /**
     * Sets the "ReferenceID" element
     */
    public void setReferenceID(com.sap.xi.ap.common.gdt.BusinessDocumentMessageID referenceID)
    {
        generatedSetterHelperImpl(referenceID, REFERENCEID$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ReferenceID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessDocumentMessageID addNewReferenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessDocumentMessageID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessDocumentMessageID)get_store().add_element_user(REFERENCEID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ReferenceID" element
     */
    public void unsetReferenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEID$4, 0);
        }
    }
    
    /**
     * Gets the "ReferenceUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getReferenceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(REFERENCEUUID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReferenceUUID" element
     */
    public boolean isSetReferenceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEUUID$6) != 0;
        }
    }
    
    /**
     * Sets the "ReferenceUUID" element
     */
    public void setReferenceUUID(com.sap.xi.ap.common.gdt.UUID referenceUUID)
    {
        generatedSetterHelperImpl(referenceUUID, REFERENCEUUID$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ReferenceUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewReferenceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(REFERENCEUUID$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ReferenceUUID" element
     */
    public void unsetReferenceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEUUID$6, 0);
        }
    }
}
