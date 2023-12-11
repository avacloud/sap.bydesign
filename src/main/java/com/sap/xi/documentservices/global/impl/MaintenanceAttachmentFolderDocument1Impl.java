/*
 * XML Type:  MaintenanceAttachmentFolderDocument
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global.impl;
/**
 * An XML MaintenanceAttachmentFolderDocument(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public class MaintenanceAttachmentFolderDocument1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1
{
    private static final long serialVersionUID = 1L;
    
    public MaintenanceAttachmentFolderDocument1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UUID$0 = 
        new javax.xml.namespace.QName("", "UUID");
    private static final javax.xml.namespace.QName LINKINTERNALINDICATOR$2 = 
        new javax.xml.namespace.QName("", "LinkInternalIndicator");
    private static final javax.xml.namespace.QName VISIBLEINDICATOR$4 = 
        new javax.xml.namespace.QName("", "VisibleIndicator");
    private static final javax.xml.namespace.QName CATEGORYCODE$6 = 
        new javax.xml.namespace.QName("", "CategoryCode");
    private static final javax.xml.namespace.QName TYPECODE$8 = 
        new javax.xml.namespace.QName("", "TypeCode");
    private static final javax.xml.namespace.QName MIMECODE$10 = 
        new javax.xml.namespace.QName("", "MIMECode");
    private static final javax.xml.namespace.QName NAME$12 = 
        new javax.xml.namespace.QName("", "Name");
    private static final javax.xml.namespace.QName ALTERNATIVENAME$14 = 
        new javax.xml.namespace.QName("", "AlternativeName");
    private static final javax.xml.namespace.QName INTERNALLINKUUID$16 = 
        new javax.xml.namespace.QName("", "InternalLinkUUID");
    private static final javax.xml.namespace.QName DESCRIPTION$18 = 
        new javax.xml.namespace.QName("", "Description");
    private static final javax.xml.namespace.QName EXTERNALLINKWEBURI$20 = 
        new javax.xml.namespace.QName("", "ExternalLinkWebURI");
    private static final javax.xml.namespace.QName PROPERTY$22 = 
        new javax.xml.namespace.QName("", "Property");
    private static final javax.xml.namespace.QName FILECONTENT$24 = 
        new javax.xml.namespace.QName("", "FileContent");
    private static final javax.xml.namespace.QName PROPERTYLISTCOMPLETETRANSMISSIONINDICATOR$26 = 
        new javax.xml.namespace.QName("", "PropertyListCompleteTransmissionIndicator");
    private static final javax.xml.namespace.QName ACTIONCODE$28 = 
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
     * Gets the "LinkInternalIndicator" element
     */
    public boolean getLinkInternalIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKINTERNALINDICATOR$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "LinkInternalIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetLinkInternalIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(LINKINTERNALINDICATOR$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "LinkInternalIndicator" element
     */
    public boolean isSetLinkInternalIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKINTERNALINDICATOR$2) != 0;
        }
    }
    
    /**
     * Sets the "LinkInternalIndicator" element
     */
    public void setLinkInternalIndicator(boolean linkInternalIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKINTERNALINDICATOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKINTERNALINDICATOR$2);
            }
            target.setBooleanValue(linkInternalIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "LinkInternalIndicator" element
     */
    public void xsetLinkInternalIndicator(com.sap.xi.ap.common.gdt.Indicator linkInternalIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(LINKINTERNALINDICATOR$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(LINKINTERNALINDICATOR$2);
            }
            target.set(linkInternalIndicator);
        }
    }
    
    /**
     * Unsets the "LinkInternalIndicator" element
     */
    public void unsetLinkInternalIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKINTERNALINDICATOR$2, 0);
        }
    }
    
    /**
     * Gets the "VisibleIndicator" element
     */
    public boolean getVisibleIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISIBLEINDICATOR$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "VisibleIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetVisibleIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(VISIBLEINDICATOR$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "VisibleIndicator" element
     */
    public boolean isSetVisibleIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VISIBLEINDICATOR$4) != 0;
        }
    }
    
    /**
     * Sets the "VisibleIndicator" element
     */
    public void setVisibleIndicator(boolean visibleIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISIBLEINDICATOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VISIBLEINDICATOR$4);
            }
            target.setBooleanValue(visibleIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "VisibleIndicator" element
     */
    public void xsetVisibleIndicator(com.sap.xi.ap.common.gdt.Indicator visibleIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(VISIBLEINDICATOR$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(VISIBLEINDICATOR$4);
            }
            target.set(visibleIndicator);
        }
    }
    
    /**
     * Unsets the "VisibleIndicator" element
     */
    public void unsetVisibleIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VISIBLEINDICATOR$4, 0);
        }
    }
    
    /**
     * Gets the "CategoryCode" element
     */
    public java.lang.String getCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CategoryCode" element
     */
    public com.sap.xi.ap.common.gdt.DocumentCategoryCode xgetCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DocumentCategoryCode target = null;
            target = (com.sap.xi.ap.common.gdt.DocumentCategoryCode)get_store().find_element_user(CATEGORYCODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "CategoryCode" element
     */
    public boolean isSetCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYCODE$6) != 0;
        }
    }
    
    /**
     * Sets the "CategoryCode" element
     */
    public void setCategoryCode(java.lang.String categoryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYCODE$6);
            }
            target.setStringValue(categoryCode);
        }
    }
    
    /**
     * Sets (as xml) the "CategoryCode" element
     */
    public void xsetCategoryCode(com.sap.xi.ap.common.gdt.DocumentCategoryCode categoryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DocumentCategoryCode target = null;
            target = (com.sap.xi.ap.common.gdt.DocumentCategoryCode)get_store().find_element_user(CATEGORYCODE$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DocumentCategoryCode)get_store().add_element_user(CATEGORYCODE$6);
            }
            target.set(categoryCode);
        }
    }
    
    /**
     * Unsets the "CategoryCode" element
     */
    public void unsetCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYCODE$6, 0);
        }
    }
    
    /**
     * Gets the "TypeCode" element
     */
    public com.sap.xi.ap.common.gdt.DocumentTypeCode getTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DocumentTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.DocumentTypeCode)get_store().find_element_user(TYPECODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TypeCode" element
     */
    public boolean isSetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPECODE$8) != 0;
        }
    }
    
    /**
     * Sets the "TypeCode" element
     */
    public void setTypeCode(com.sap.xi.ap.common.gdt.DocumentTypeCode typeCode)
    {
        generatedSetterHelperImpl(typeCode, TYPECODE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TypeCode" element
     */
    public com.sap.xi.ap.common.gdt.DocumentTypeCode addNewTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DocumentTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.DocumentTypeCode)get_store().add_element_user(TYPECODE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "TypeCode" element
     */
    public void unsetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPECODE$8, 0);
        }
    }
    
    /**
     * Gets the "MIMECode" element
     */
    public java.lang.String getMIMECode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMECODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MIMECode" element
     */
    public com.sap.xi.ap.common.gdt.MIMECode xgetMIMECode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MIMECode target = null;
            target = (com.sap.xi.ap.common.gdt.MIMECode)get_store().find_element_user(MIMECODE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "MIMECode" element
     */
    public boolean isSetMIMECode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIMECODE$10) != 0;
        }
    }
    
    /**
     * Sets the "MIMECode" element
     */
    public void setMIMECode(java.lang.String mimeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMECODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIMECODE$10);
            }
            target.setStringValue(mimeCode);
        }
    }
    
    /**
     * Sets (as xml) the "MIMECode" element
     */
    public void xsetMIMECode(com.sap.xi.ap.common.gdt.MIMECode mimeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MIMECode target = null;
            target = (com.sap.xi.ap.common.gdt.MIMECode)get_store().find_element_user(MIMECODE$10, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.MIMECode)get_store().add_element_user(MIMECODE$10);
            }
            target.set(mimeCode);
        }
    }
    
    /**
     * Unsets the "MIMECode" element
     */
    public void unsetMIMECode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIMECODE$10, 0);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().find_element_user(NAME$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$12) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$12);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().find_element_user(NAME$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().add_element_user(NAME$12);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$12, 0);
        }
    }
    
    /**
     * Gets the "AlternativeName" element
     */
    public java.lang.String getAlternativeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTERNATIVENAME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AlternativeName" element
     */
    public com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName xgetAlternativeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().find_element_user(ALTERNATIVENAME$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "AlternativeName" element
     */
    public boolean isSetAlternativeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTERNATIVENAME$14) != 0;
        }
    }
    
    /**
     * Sets the "AlternativeName" element
     */
    public void setAlternativeName(java.lang.String alternativeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTERNATIVENAME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTERNATIVENAME$14);
            }
            target.setStringValue(alternativeName);
        }
    }
    
    /**
     * Sets (as xml) the "AlternativeName" element
     */
    public void xsetAlternativeName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName alternativeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().find_element_user(ALTERNATIVENAME$14, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().add_element_user(ALTERNATIVENAME$14);
            }
            target.set(alternativeName);
        }
    }
    
    /**
     * Unsets the "AlternativeName" element
     */
    public void unsetAlternativeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTERNATIVENAME$14, 0);
        }
    }
    
    /**
     * Gets the "InternalLinkUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getInternalLinkUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(INTERNALLINKUUID$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "InternalLinkUUID" element
     */
    public boolean isSetInternalLinkUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERNALLINKUUID$16) != 0;
        }
    }
    
    /**
     * Sets the "InternalLinkUUID" element
     */
    public void setInternalLinkUUID(com.sap.xi.ap.common.gdt.UUID internalLinkUUID)
    {
        generatedSetterHelperImpl(internalLinkUUID, INTERNALLINKUUID$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InternalLinkUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewInternalLinkUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(INTERNALLINKUUID$16);
            return target;
        }
    }
    
    /**
     * Unsets the "InternalLinkUUID" element
     */
    public void unsetInternalLinkUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERNALLINKUUID$16, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public com.sap.xi.ap.common.gdt.Description getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Description target = null;
            target = (com.sap.xi.ap.common.gdt.Description)get_store().find_element_user(DESCRIPTION$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$18) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(com.sap.xi.ap.common.gdt.Description description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Description" element
     */
    public com.sap.xi.ap.common.gdt.Description addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Description target = null;
            target = (com.sap.xi.ap.common.gdt.Description)get_store().add_element_user(DESCRIPTION$18);
            return target;
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$18, 0);
        }
    }
    
    /**
     * Gets the "ExternalLinkWebURI" element
     */
    public java.lang.String getExternalLinkWebURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALLINKWEBURI$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExternalLinkWebURI" element
     */
    public com.sap.xi.ap.common.gdt.WebURI xgetExternalLinkWebURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.WebURI target = null;
            target = (com.sap.xi.ap.common.gdt.WebURI)get_store().find_element_user(EXTERNALLINKWEBURI$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "ExternalLinkWebURI" element
     */
    public boolean isSetExternalLinkWebURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALLINKWEBURI$20) != 0;
        }
    }
    
    /**
     * Sets the "ExternalLinkWebURI" element
     */
    public void setExternalLinkWebURI(java.lang.String externalLinkWebURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALLINKWEBURI$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALLINKWEBURI$20);
            }
            target.setStringValue(externalLinkWebURI);
        }
    }
    
    /**
     * Sets (as xml) the "ExternalLinkWebURI" element
     */
    public void xsetExternalLinkWebURI(com.sap.xi.ap.common.gdt.WebURI externalLinkWebURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.WebURI target = null;
            target = (com.sap.xi.ap.common.gdt.WebURI)get_store().find_element_user(EXTERNALLINKWEBURI$20, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.WebURI)get_store().add_element_user(EXTERNALLINKWEBURI$20);
            }
            target.set(externalLinkWebURI);
        }
    }
    
    /**
     * Unsets the "ExternalLinkWebURI" element
     */
    public void unsetExternalLinkWebURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALLINKWEBURI$20, 0);
        }
    }
    
    /**
     * Gets array of all "Property" elements
     */
    public com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTY$22, targetList);
            com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty[] result = new com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Property" element
     */
    public com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty)get_store().find_element_user(PROPERTY$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Property" element
     */
    public int sizeOfPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTY$22);
        }
    }
    
    /**
     * Sets array of all "Property" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPropertyArray(com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty[] propertyArray)
    {
        check_orphaned();
        arraySetterHelper(propertyArray, PROPERTY$22);
    }
    
    /**
     * Sets ith "Property" element
     */
    public void setPropertyArray(int i, com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty property)
    {
        generatedSetterHelperImpl(property, PROPERTY$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Property" element
     */
    public com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty)get_store().insert_element_user(PROPERTY$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Property" element
     */
    public com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty)get_store().add_element_user(PROPERTY$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "Property" element
     */
    public void removeProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTY$22, i);
        }
    }
    
    /**
     * Gets the "FileContent" element
     */
    public com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentFileContent getFileContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentFileContent target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentFileContent)get_store().find_element_user(FILECONTENT$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "FileContent" element
     */
    public boolean isSetFileContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILECONTENT$24) != 0;
        }
    }
    
    /**
     * Sets the "FileContent" element
     */
    public void setFileContent(com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentFileContent fileContent)
    {
        generatedSetterHelperImpl(fileContent, FILECONTENT$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FileContent" element
     */
    public com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentFileContent addNewFileContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentFileContent target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentFileContent)get_store().add_element_user(FILECONTENT$24);
            return target;
        }
    }
    
    /**
     * Unsets the "FileContent" element
     */
    public void unsetFileContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILECONTENT$24, 0);
        }
    }
    
    /**
     * Gets the "PropertyListCompleteTransmissionIndicator" attribute
     */
    public boolean getPropertyListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTYLISTCOMPLETETRANSMISSIONINDICATOR$26);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "PropertyListCompleteTransmissionIndicator" attribute
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetPropertyListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(PROPERTYLISTCOMPLETETRANSMISSIONINDICATOR$26);
            return target;
        }
    }
    
    /**
     * True if has "PropertyListCompleteTransmissionIndicator" attribute
     */
    public boolean isSetPropertyListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTYLISTCOMPLETETRANSMISSIONINDICATOR$26) != null;
        }
    }
    
    /**
     * Sets the "PropertyListCompleteTransmissionIndicator" attribute
     */
    public void setPropertyListCompleteTransmissionIndicator(boolean propertyListCompleteTransmissionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTYLISTCOMPLETETRANSMISSIONINDICATOR$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTYLISTCOMPLETETRANSMISSIONINDICATOR$26);
            }
            target.setBooleanValue(propertyListCompleteTransmissionIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "PropertyListCompleteTransmissionIndicator" attribute
     */
    public void xsetPropertyListCompleteTransmissionIndicator(com.sap.xi.ap.common.gdt.Indicator propertyListCompleteTransmissionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(PROPERTYLISTCOMPLETETRANSMISSIONINDICATOR$26);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_attribute_user(PROPERTYLISTCOMPLETETRANSMISSIONINDICATOR$26);
            }
            target.set(propertyListCompleteTransmissionIndicator);
        }
    }
    
    /**
     * Unsets the "PropertyListCompleteTransmissionIndicator" attribute
     */
    public void unsetPropertyListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROPERTYLISTCOMPLETETRANSMISSIONINDICATOR$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$28);
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
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$28);
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
            return get_store().find_attribute_user(ACTIONCODE$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIONCODE$28);
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
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$28);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().add_attribute_user(ACTIONCODE$28);
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
            get_store().remove_attribute(ACTIONCODE$28);
        }
    }
}
