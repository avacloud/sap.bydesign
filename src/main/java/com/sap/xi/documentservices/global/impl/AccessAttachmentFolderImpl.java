/*
 * XML Type:  AccessAttachmentFolder
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.AccessAttachmentFolder
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global.impl;
/**
 * An XML AccessAttachmentFolder(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public class AccessAttachmentFolderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.documentservices.global.AccessAttachmentFolder
{
    private static final long serialVersionUID = 1L;
    
    public AccessAttachmentFolderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UUID$0 = 
        new javax.xml.namespace.QName("", "UUID");
    private static final javax.xml.namespace.QName DOCUMENT$2 = 
        new javax.xml.namespace.QName("", "Document");
    
    
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
    public com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1[] getDocumentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCUMENT$2, targetList);
            com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1[] result = new com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Document" element
     */
    public com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 getDocumentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 target = null;
            target = (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1)get_store().find_element_user(DOCUMENT$2, i);
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
    public void setDocumentArray(com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1[] documentArray)
    {
        check_orphaned();
        arraySetterHelper(documentArray, DOCUMENT$2);
    }
    
    /**
     * Sets ith "Document" element
     */
    public void setDocumentArray(int i, com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 document)
    {
        generatedSetterHelperImpl(document, DOCUMENT$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Document" element
     */
    public com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 insertNewDocument(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 target = null;
            target = (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1)get_store().insert_element_user(DOCUMENT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Document" element
     */
    public com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 addNewDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 target = null;
            target = (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1)get_store().add_element_user(DOCUMENT$2);
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
}
