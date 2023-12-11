/*
 * XML Type:  MaintenanceAttachmentFolder
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.MaintenanceAttachmentFolder
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global.impl;
/**
 * An XML MaintenanceAttachmentFolder(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public class MaintenanceAttachmentFolderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.documentservices.global.MaintenanceAttachmentFolder
{
    private static final long serialVersionUID = 1L;
    
    public MaintenanceAttachmentFolderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UUID$0 = 
        new javax.xml.namespace.QName("", "UUID");
    private static final javax.xml.namespace.QName DOCUMENT$2 = 
        new javax.xml.namespace.QName("", "Document");
    private static final javax.xml.namespace.QName DOCUMENTLISTCOMPLETETRANSMISSIONINDICATOR$4 = 
        new javax.xml.namespace.QName("", "DocumentListCompleteTransmissionIndicator");
    private static final javax.xml.namespace.QName ACTIONCODE$6 = 
        new javax.xml.namespace.QName("", "ActionCode");
    
    
    /**
     * Gets the "UUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(UUID$0, 0);
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
            return get_store().count_elements(UUID$0) != 0;
        }
    }
    
    /**
     * Sets the "UUID" element
     */
    public void setUUID(com.sap.xi.ap.common.gdt.UUID uuid)
    {
        generatedSetterHelperImpl(uuid, UUID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(UUID$0);
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
            get_store().remove_element(UUID$0, 0);
        }
    }
    
    /**
     * Gets array of all "Document" elements
     */
    public com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1[] getDocumentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCUMENT$2, targetList);
            com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1[] result = new com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Document" element
     */
    public com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 getDocumentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1)get_store().find_element_user(DOCUMENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Document" element
     */
    public int sizeOfDocumentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENT$2);
        }
    }
    
    /**
     * Sets array of all "Document" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDocumentArray(com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1[] documentArray)
    {
        check_orphaned();
        arraySetterHelper(documentArray, DOCUMENT$2);
    }
    
    /**
     * Sets ith "Document" element
     */
    public void setDocumentArray(int i, com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 document)
    {
        generatedSetterHelperImpl(document, DOCUMENT$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Document" element
     */
    public com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 insertNewDocument(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1)get_store().insert_element_user(DOCUMENT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Document" element
     */
    public com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 addNewDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1)get_store().add_element_user(DOCUMENT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Document" element
     */
    public void removeDocument(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENT$2, i);
        }
    }
    
    /**
     * Gets the "DocumentListCompleteTransmissionIndicator" attribute
     */
    public boolean getDocumentListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCUMENTLISTCOMPLETETRANSMISSIONINDICATOR$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "DocumentListCompleteTransmissionIndicator" attribute
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetDocumentListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(DOCUMENTLISTCOMPLETETRANSMISSIONINDICATOR$4);
            return target;
        }
    }
    
    /**
     * True if has "DocumentListCompleteTransmissionIndicator" attribute
     */
    public boolean isSetDocumentListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DOCUMENTLISTCOMPLETETRANSMISSIONINDICATOR$4) != null;
        }
    }
    
    /**
     * Sets the "DocumentListCompleteTransmissionIndicator" attribute
     */
    public void setDocumentListCompleteTransmissionIndicator(boolean documentListCompleteTransmissionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCUMENTLISTCOMPLETETRANSMISSIONINDICATOR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOCUMENTLISTCOMPLETETRANSMISSIONINDICATOR$4);
            }
            target.setBooleanValue(documentListCompleteTransmissionIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "DocumentListCompleteTransmissionIndicator" attribute
     */
    public void xsetDocumentListCompleteTransmissionIndicator(com.sap.xi.ap.common.gdt.Indicator documentListCompleteTransmissionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(DOCUMENTLISTCOMPLETETRANSMISSIONINDICATOR$4);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_attribute_user(DOCUMENTLISTCOMPLETETRANSMISSIONINDICATOR$4);
            }
            target.set(documentListCompleteTransmissionIndicator);
        }
    }
    
    /**
     * Unsets the "DocumentListCompleteTransmissionIndicator" attribute
     */
    public void unsetDocumentListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DOCUMENTLISTCOMPLETETRANSMISSIONINDICATOR$4);
        }
    }
    
    /**
     * Gets the "ActionCode" attribute
     */
    public com.sap.xi.ap.common.gdt.ActionCode.Enum getActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$6);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ActionCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ActionCode" attribute
     */
    public com.sap.xi.ap.common.gdt.ActionCode xgetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ActionCode target = null;
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$6);
            return target;
        }
    }
    
    /**
     * True if has "ActionCode" attribute
     */
    public boolean isSetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTIONCODE$6) != null;
        }
    }
    
    /**
     * Sets the "ActionCode" attribute
     */
    public void setActionCode(com.sap.xi.ap.common.gdt.ActionCode.Enum actionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIONCODE$6);
            }
            target.setEnumValue(actionCode);
        }
    }
    
    /**
     * Sets (as xml) the "ActionCode" attribute
     */
    public void xsetActionCode(com.sap.xi.ap.common.gdt.ActionCode actionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ActionCode target = null;
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$6);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().add_attribute_user(ACTIONCODE$6);
            }
            target.set(actionCode);
        }
    }
    
    /**
     * Unsets the "ActionCode" attribute
     */
    public void unsetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTIONCODE$6);
        }
    }
}
