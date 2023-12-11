/*
 * XML Type:  MaintenanceAttachmentFolderDocumentFileContent
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentFileContent
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global.impl;
/**
 * An XML MaintenanceAttachmentFolderDocumentFileContent(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public class MaintenanceAttachmentFolderDocumentFileContentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentFileContent
{
    private static final long serialVersionUID = 1L;
    
    public MaintenanceAttachmentFolderDocumentFileContentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TECHNICALID$0 = 
        new javax.xml.namespace.QName("", "TechnicalID");
    private static final javax.xml.namespace.QName BINARYOBJECT$2 = 
        new javax.xml.namespace.QName("", "BinaryObject");
    private static final javax.xml.namespace.QName ACTIONCODE$4 = 
        new javax.xml.namespace.QName("", "ActionCode");
    
    
    /**
     * Gets the "TechnicalID" element
     */
    public java.lang.String getTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TECHNICALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TechnicalID" element
     */
    public com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID xgetTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID)get_store().find_element_user(TECHNICALID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "TechnicalID" element
     */
    public boolean isSetTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TECHNICALID$0) != 0;
        }
    }
    
    /**
     * Sets the "TechnicalID" element
     */
    public void setTechnicalID(java.lang.String technicalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TECHNICALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TECHNICALID$0);
            }
            target.setStringValue(technicalID);
        }
    }
    
    /**
     * Sets (as xml) the "TechnicalID" element
     */
    public void xsetTechnicalID(com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID technicalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID)get_store().find_element_user(TECHNICALID$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID)get_store().add_element_user(TECHNICALID$0);
            }
            target.set(technicalID);
        }
    }
    
    /**
     * Unsets the "TechnicalID" element
     */
    public void unsetTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TECHNICALID$0, 0);
        }
    }
    
    /**
     * Gets the "BinaryObject" element
     */
    public com.sap.xi.basis.global.BinaryObject getBinaryObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.BinaryObject target = null;
            target = (com.sap.xi.basis.global.BinaryObject)get_store().find_element_user(BINARYOBJECT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BinaryObject" element
     */
    public boolean isSetBinaryObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BINARYOBJECT$2) != 0;
        }
    }
    
    /**
     * Sets the "BinaryObject" element
     */
    public void setBinaryObject(com.sap.xi.basis.global.BinaryObject binaryObject)
    {
        generatedSetterHelperImpl(binaryObject, BINARYOBJECT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BinaryObject" element
     */
    public com.sap.xi.basis.global.BinaryObject addNewBinaryObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.BinaryObject target = null;
            target = (com.sap.xi.basis.global.BinaryObject)get_store().add_element_user(BINARYOBJECT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "BinaryObject" element
     */
    public void unsetBinaryObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BINARYOBJECT$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$4);
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
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$4);
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
            return get_store().find_attribute_user(ACTIONCODE$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIONCODE$4);
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
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$4);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().add_attribute_user(ACTIONCODE$4);
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
            get_store().remove_attribute(ACTIONCODE$4);
        }
    }
}
