/*
 * XML Type:  AccessAttachmentFolderDocument
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global.impl;
/**
 * An XML AccessAttachmentFolderDocument(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public class AccessAttachmentFolderDocument1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1
{
    private static final long serialVersionUID = 1L;
    
    public AccessAttachmentFolderDocument1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UUID$0 = 
        new javax.xml.namespace.QName("", "UUID");
    private static final javax.xml.namespace.QName VERSIONID$2 = 
        new javax.xml.namespace.QName("", "VersionID");
    private static final javax.xml.namespace.QName SYSTEMADMINISTRATIVEDATA$4 = 
        new javax.xml.namespace.QName("", "SystemAdministrativeData");
    private static final javax.xml.namespace.QName LINKINTERNALINDICATOR$6 = 
        new javax.xml.namespace.QName("", "LinkInternalIndicator");
    private static final javax.xml.namespace.QName CHECKEDOUTINDICATOR$8 = 
        new javax.xml.namespace.QName("", "CheckedOutIndicator");
    private static final javax.xml.namespace.QName VISIBLEINDICATOR$10 = 
        new javax.xml.namespace.QName("", "VisibleIndicator");
    private static final javax.xml.namespace.QName VERSIONINGENABLEDINDICATOR$12 = 
        new javax.xml.namespace.QName("", "VersioningEnabledIndicator");
    private static final javax.xml.namespace.QName CATEGORYCODE$14 = 
        new javax.xml.namespace.QName("", "CategoryCode");
    private static final javax.xml.namespace.QName CATEGORYNAME$16 = 
        new javax.xml.namespace.QName("", "CategoryName");
    private static final javax.xml.namespace.QName TYPECODE$18 = 
        new javax.xml.namespace.QName("", "TypeCode");
    private static final javax.xml.namespace.QName TYPENAME$20 = 
        new javax.xml.namespace.QName("", "TypeName");
    private static final javax.xml.namespace.QName MIMECODE$22 = 
        new javax.xml.namespace.QName("", "MIMECode");
    private static final javax.xml.namespace.QName MIMENAME$24 = 
        new javax.xml.namespace.QName("", "MIMEName");
    private static final javax.xml.namespace.QName PATHNAME$26 = 
        new javax.xml.namespace.QName("", "PathName");
    private static final javax.xml.namespace.QName NAME$28 = 
        new javax.xml.namespace.QName("", "Name");
    private static final javax.xml.namespace.QName ALTERNATIVENAME$30 = 
        new javax.xml.namespace.QName("", "AlternativeName");
    private static final javax.xml.namespace.QName INTERNALLINKUUID$32 = 
        new javax.xml.namespace.QName("", "InternalLinkUUID");
    private static final javax.xml.namespace.QName DESCRIPTION$34 = 
        new javax.xml.namespace.QName("", "Description");
    private static final javax.xml.namespace.QName EXTERNALLINKWEBURI$36 = 
        new javax.xml.namespace.QName("", "ExternalLinkWebURI");
    private static final javax.xml.namespace.QName FILECONTENTURI$38 = 
        new javax.xml.namespace.QName("", "FileContentURI");
    private static final javax.xml.namespace.QName FILESIZEMEASURE$40 = 
        new javax.xml.namespace.QName("", "FilesizeMeasure");
    private static final javax.xml.namespace.QName PROPERTY$42 = 
        new javax.xml.namespace.QName("", "Property");
    
    
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
     * Gets the "VersionID" element
     */
    public java.lang.String getVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "VersionID" element
     */
    public com.sap.xi.ap.common.gdt.VersionID xgetVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.VersionID target = null;
            target = (com.sap.xi.ap.common.gdt.VersionID)get_store().find_element_user(VERSIONID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "VersionID" element
     */
    public boolean isSetVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSIONID$2) != 0;
        }
    }
    
    /**
     * Sets the "VersionID" element
     */
    public void setVersionID(java.lang.String versionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSIONID$2);
            }
            target.setStringValue(versionID);
        }
    }
    
    /**
     * Sets (as xml) the "VersionID" element
     */
    public void xsetVersionID(com.sap.xi.ap.common.gdt.VersionID versionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.VersionID target = null;
            target = (com.sap.xi.ap.common.gdt.VersionID)get_store().find_element_user(VERSIONID$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.VersionID)get_store().add_element_user(VERSIONID$2);
            }
            target.set(versionID);
        }
    }
    
    /**
     * Unsets the "VersionID" element
     */
    public void unsetVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSIONID$2, 0);
        }
    }
    
    /**
     * Gets the "SystemAdministrativeData" element
     */
    public com.sap.xi.ap.common.gdt.SystemAdministrativeData getSystemAdministrativeData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SystemAdministrativeData target = null;
            target = (com.sap.xi.ap.common.gdt.SystemAdministrativeData)get_store().find_element_user(SYSTEMADMINISTRATIVEDATA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SystemAdministrativeData" element
     */
    public boolean isSetSystemAdministrativeData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSTEMADMINISTRATIVEDATA$4) != 0;
        }
    }
    
    /**
     * Sets the "SystemAdministrativeData" element
     */
    public void setSystemAdministrativeData(com.sap.xi.ap.common.gdt.SystemAdministrativeData systemAdministrativeData)
    {
        generatedSetterHelperImpl(systemAdministrativeData, SYSTEMADMINISTRATIVEDATA$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SystemAdministrativeData" element
     */
    public com.sap.xi.ap.common.gdt.SystemAdministrativeData addNewSystemAdministrativeData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SystemAdministrativeData target = null;
            target = (com.sap.xi.ap.common.gdt.SystemAdministrativeData)get_store().add_element_user(SYSTEMADMINISTRATIVEDATA$4);
            return target;
        }
    }
    
    /**
     * Unsets the "SystemAdministrativeData" element
     */
    public void unsetSystemAdministrativeData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSTEMADMINISTRATIVEDATA$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKINTERNALINDICATOR$6, 0);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(LINKINTERNALINDICATOR$6, 0);
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
            return get_store().count_elements(LINKINTERNALINDICATOR$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKINTERNALINDICATOR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKINTERNALINDICATOR$6);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(LINKINTERNALINDICATOR$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(LINKINTERNALINDICATOR$6);
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
            get_store().remove_element(LINKINTERNALINDICATOR$6, 0);
        }
    }
    
    /**
     * Gets the "CheckedOutIndicator" element
     */
    public boolean getCheckedOutIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKEDOUTINDICATOR$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "CheckedOutIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetCheckedOutIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CHECKEDOUTINDICATOR$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "CheckedOutIndicator" element
     */
    public boolean isSetCheckedOutIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHECKEDOUTINDICATOR$8) != 0;
        }
    }
    
    /**
     * Sets the "CheckedOutIndicator" element
     */
    public void setCheckedOutIndicator(boolean checkedOutIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKEDOUTINDICATOR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHECKEDOUTINDICATOR$8);
            }
            target.setBooleanValue(checkedOutIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "CheckedOutIndicator" element
     */
    public void xsetCheckedOutIndicator(com.sap.xi.ap.common.gdt.Indicator checkedOutIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CHECKEDOUTINDICATOR$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(CHECKEDOUTINDICATOR$8);
            }
            target.set(checkedOutIndicator);
        }
    }
    
    /**
     * Unsets the "CheckedOutIndicator" element
     */
    public void unsetCheckedOutIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHECKEDOUTINDICATOR$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISIBLEINDICATOR$10, 0);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(VISIBLEINDICATOR$10, 0);
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
            return get_store().count_elements(VISIBLEINDICATOR$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISIBLEINDICATOR$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VISIBLEINDICATOR$10);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(VISIBLEINDICATOR$10, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(VISIBLEINDICATOR$10);
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
            get_store().remove_element(VISIBLEINDICATOR$10, 0);
        }
    }
    
    /**
     * Gets the "VersioningEnabledIndicator" element
     */
    public boolean getVersioningEnabledIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONINGENABLEDINDICATOR$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "VersioningEnabledIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetVersioningEnabledIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(VERSIONINGENABLEDINDICATOR$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "VersioningEnabledIndicator" element
     */
    public boolean isSetVersioningEnabledIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSIONINGENABLEDINDICATOR$12) != 0;
        }
    }
    
    /**
     * Sets the "VersioningEnabledIndicator" element
     */
    public void setVersioningEnabledIndicator(boolean versioningEnabledIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONINGENABLEDINDICATOR$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSIONINGENABLEDINDICATOR$12);
            }
            target.setBooleanValue(versioningEnabledIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "VersioningEnabledIndicator" element
     */
    public void xsetVersioningEnabledIndicator(com.sap.xi.ap.common.gdt.Indicator versioningEnabledIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(VERSIONINGENABLEDINDICATOR$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(VERSIONINGENABLEDINDICATOR$12);
            }
            target.set(versioningEnabledIndicator);
        }
    }
    
    /**
     * Unsets the "VersioningEnabledIndicator" element
     */
    public void unsetVersioningEnabledIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSIONINGENABLEDINDICATOR$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYCODE$14, 0);
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
            target = (com.sap.xi.ap.common.gdt.DocumentCategoryCode)get_store().find_element_user(CATEGORYCODE$14, 0);
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
            return get_store().count_elements(CATEGORYCODE$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYCODE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYCODE$14);
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
            target = (com.sap.xi.ap.common.gdt.DocumentCategoryCode)get_store().find_element_user(CATEGORYCODE$14, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DocumentCategoryCode)get_store().add_element_user(CATEGORYCODE$14);
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
            get_store().remove_element(CATEGORYCODE$14, 0);
        }
    }
    
    /**
     * Gets the "CategoryName" element
     */
    public java.lang.String getCategoryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYNAME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CategoryName" element
     */
    public com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName xgetCategoryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().find_element_user(CATEGORYNAME$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "CategoryName" element
     */
    public boolean isSetCategoryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYNAME$16) != 0;
        }
    }
    
    /**
     * Sets the "CategoryName" element
     */
    public void setCategoryName(java.lang.String categoryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYNAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYNAME$16);
            }
            target.setStringValue(categoryName);
        }
    }
    
    /**
     * Sets (as xml) the "CategoryName" element
     */
    public void xsetCategoryName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName categoryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().find_element_user(CATEGORYNAME$16, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().add_element_user(CATEGORYNAME$16);
            }
            target.set(categoryName);
        }
    }
    
    /**
     * Unsets the "CategoryName" element
     */
    public void unsetCategoryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYNAME$16, 0);
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
            target = (com.sap.xi.ap.common.gdt.DocumentTypeCode)get_store().find_element_user(TYPECODE$18, 0);
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
            return get_store().count_elements(TYPECODE$18) != 0;
        }
    }
    
    /**
     * Sets the "TypeCode" element
     */
    public void setTypeCode(com.sap.xi.ap.common.gdt.DocumentTypeCode typeCode)
    {
        generatedSetterHelperImpl(typeCode, TYPECODE$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.DocumentTypeCode)get_store().add_element_user(TYPECODE$18);
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
            get_store().remove_element(TYPECODE$18, 0);
        }
    }
    
    /**
     * Gets the "TypeName" element
     */
    public java.lang.String getTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPENAME$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TypeName" element
     */
    public com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName xgetTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().find_element_user(TYPENAME$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "TypeName" element
     */
    public boolean isSetTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPENAME$20) != 0;
        }
    }
    
    /**
     * Sets the "TypeName" element
     */
    public void setTypeName(java.lang.String typeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPENAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPENAME$20);
            }
            target.setStringValue(typeName);
        }
    }
    
    /**
     * Sets (as xml) the "TypeName" element
     */
    public void xsetTypeName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName typeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().find_element_user(TYPENAME$20, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().add_element_user(TYPENAME$20);
            }
            target.set(typeName);
        }
    }
    
    /**
     * Unsets the "TypeName" element
     */
    public void unsetTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPENAME$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMECODE$22, 0);
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
            target = (com.sap.xi.ap.common.gdt.MIMECode)get_store().find_element_user(MIMECODE$22, 0);
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
            return get_store().count_elements(MIMECODE$22) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMECODE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIMECODE$22);
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
            target = (com.sap.xi.ap.common.gdt.MIMECode)get_store().find_element_user(MIMECODE$22, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.MIMECode)get_store().add_element_user(MIMECODE$22);
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
            get_store().remove_element(MIMECODE$22, 0);
        }
    }
    
    /**
     * Gets the "MIMEName" element
     */
    public java.lang.String getMIMEName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMENAME$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MIMEName" element
     */
    public com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName xgetMIMEName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().find_element_user(MIMENAME$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "MIMEName" element
     */
    public boolean isSetMIMEName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIMENAME$24) != 0;
        }
    }
    
    /**
     * Sets the "MIMEName" element
     */
    public void setMIMEName(java.lang.String mimeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMENAME$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIMENAME$24);
            }
            target.setStringValue(mimeName);
        }
    }
    
    /**
     * Sets (as xml) the "MIMEName" element
     */
    public void xsetMIMEName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName mimeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().find_element_user(MIMENAME$24, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().add_element_user(MIMENAME$24);
            }
            target.set(mimeName);
        }
    }
    
    /**
     * Unsets the "MIMEName" element
     */
    public void unsetMIMEName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIMENAME$24, 0);
        }
    }
    
    /**
     * Gets the "PathName" element
     */
    public java.lang.String getPathName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATHNAME$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PathName" element
     */
    public com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName xgetPathName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().find_element_user(PATHNAME$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "PathName" element
     */
    public boolean isSetPathName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATHNAME$26) != 0;
        }
    }
    
    /**
     * Sets the "PathName" element
     */
    public void setPathName(java.lang.String pathName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATHNAME$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATHNAME$26);
            }
            target.setStringValue(pathName);
        }
    }
    
    /**
     * Sets (as xml) the "PathName" element
     */
    public void xsetPathName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName pathName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().find_element_user(PATHNAME$26, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().add_element_user(PATHNAME$26);
            }
            target.set(pathName);
        }
    }
    
    /**
     * Unsets the "PathName" element
     */
    public void unsetPathName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATHNAME$26, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$28, 0);
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
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().find_element_user(NAME$28, 0);
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
            return get_store().count_elements(NAME$28) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$28);
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
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().find_element_user(NAME$28, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().add_element_user(NAME$28);
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
            get_store().remove_element(NAME$28, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTERNATIVENAME$30, 0);
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
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().find_element_user(ALTERNATIVENAME$30, 0);
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
            return get_store().count_elements(ALTERNATIVENAME$30) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTERNATIVENAME$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTERNATIVENAME$30);
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
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().find_element_user(ALTERNATIVENAME$30, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().add_element_user(ALTERNATIVENAME$30);
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
            get_store().remove_element(ALTERNATIVENAME$30, 0);
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
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(INTERNALLINKUUID$32, 0);
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
            return get_store().count_elements(INTERNALLINKUUID$32) != 0;
        }
    }
    
    /**
     * Sets the "InternalLinkUUID" element
     */
    public void setInternalLinkUUID(com.sap.xi.ap.common.gdt.UUID internalLinkUUID)
    {
        generatedSetterHelperImpl(internalLinkUUID, INTERNALLINKUUID$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(INTERNALLINKUUID$32);
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
            get_store().remove_element(INTERNALLINKUUID$32, 0);
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
            target = (com.sap.xi.ap.common.gdt.Description)get_store().find_element_user(DESCRIPTION$34, 0);
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
            return get_store().count_elements(DESCRIPTION$34) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(com.sap.xi.ap.common.gdt.Description description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.Description)get_store().add_element_user(DESCRIPTION$34);
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
            get_store().remove_element(DESCRIPTION$34, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALLINKWEBURI$36, 0);
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
            target = (com.sap.xi.ap.common.gdt.WebURI)get_store().find_element_user(EXTERNALLINKWEBURI$36, 0);
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
            return get_store().count_elements(EXTERNALLINKWEBURI$36) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALLINKWEBURI$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALLINKWEBURI$36);
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
            target = (com.sap.xi.ap.common.gdt.WebURI)get_store().find_element_user(EXTERNALLINKWEBURI$36, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.WebURI)get_store().add_element_user(EXTERNALLINKWEBURI$36);
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
            get_store().remove_element(EXTERNALLINKWEBURI$36, 0);
        }
    }
    
    /**
     * Gets the "FileContentURI" element
     */
    public com.sap.xi.ap.common.gdt.URI getFileContentURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.URI target = null;
            target = (com.sap.xi.ap.common.gdt.URI)get_store().find_element_user(FILECONTENTURI$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "FileContentURI" element
     */
    public boolean isSetFileContentURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILECONTENTURI$38) != 0;
        }
    }
    
    /**
     * Sets the "FileContentURI" element
     */
    public void setFileContentURI(com.sap.xi.ap.common.gdt.URI fileContentURI)
    {
        generatedSetterHelperImpl(fileContentURI, FILECONTENTURI$38, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FileContentURI" element
     */
    public com.sap.xi.ap.common.gdt.URI addNewFileContentURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.URI target = null;
            target = (com.sap.xi.ap.common.gdt.URI)get_store().add_element_user(FILECONTENTURI$38);
            return target;
        }
    }
    
    /**
     * Unsets the "FileContentURI" element
     */
    public void unsetFileContentURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILECONTENTURI$38, 0);
        }
    }
    
    /**
     * Gets the "FilesizeMeasure" element
     */
    public com.sap.xi.ap.common.gdt.Measure getFilesizeMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Measure target = null;
            target = (com.sap.xi.ap.common.gdt.Measure)get_store().find_element_user(FILESIZEMEASURE$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "FilesizeMeasure" element
     */
    public boolean isSetFilesizeMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILESIZEMEASURE$40) != 0;
        }
    }
    
    /**
     * Sets the "FilesizeMeasure" element
     */
    public void setFilesizeMeasure(com.sap.xi.ap.common.gdt.Measure filesizeMeasure)
    {
        generatedSetterHelperImpl(filesizeMeasure, FILESIZEMEASURE$40, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FilesizeMeasure" element
     */
    public com.sap.xi.ap.common.gdt.Measure addNewFilesizeMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Measure target = null;
            target = (com.sap.xi.ap.common.gdt.Measure)get_store().add_element_user(FILESIZEMEASURE$40);
            return target;
        }
    }
    
    /**
     * Unsets the "FilesizeMeasure" element
     */
    public void unsetFilesizeMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILESIZEMEASURE$40, 0);
        }
    }
    
    /**
     * Gets array of all "Property" elements
     */
    public com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTY$42, targetList);
            com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty[] result = new com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Property" element
     */
    public com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty target = null;
            target = (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty)get_store().find_element_user(PROPERTY$42, i);
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
            return get_store().count_elements(PROPERTY$42);
        }
    }
    
    /**
     * Sets array of all "Property" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPropertyArray(com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty[] propertyArray)
    {
        check_orphaned();
        arraySetterHelper(propertyArray, PROPERTY$42);
    }
    
    /**
     * Sets ith "Property" element
     */
    public void setPropertyArray(int i, com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty property)
    {
        generatedSetterHelperImpl(property, PROPERTY$42, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Property" element
     */
    public com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty target = null;
            target = (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty)get_store().insert_element_user(PROPERTY$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Property" element
     */
    public com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty target = null;
            target = (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty)get_store().add_element_user(PROPERTY$42);
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
            get_store().remove_element(PROPERTY$42, i);
        }
    }
}
