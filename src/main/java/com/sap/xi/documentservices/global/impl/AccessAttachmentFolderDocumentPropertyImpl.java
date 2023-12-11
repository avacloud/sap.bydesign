/*
 * XML Type:  AccessAttachmentFolderDocumentProperty
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global.impl;
/**
 * An XML AccessAttachmentFolderDocumentProperty(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public class AccessAttachmentFolderDocumentPropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty
{
    private static final long serialVersionUID = 1L;
    
    public AccessAttachmentFolderDocumentPropertyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TECHNICALID$0 = 
        new javax.xml.namespace.QName("", "TechnicalID");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "Name");
    private static final javax.xml.namespace.QName DATATYPEFORMATCODE$4 = 
        new javax.xml.namespace.QName("", "DataTypeFormatCode");
    private static final javax.xml.namespace.QName DATATYPEFORMATNAME$6 = 
        new javax.xml.namespace.QName("", "DataTypeFormatName");
    private static final javax.xml.namespace.QName VISIBLEINDICATOR$8 = 
        new javax.xml.namespace.QName("", "VisibleIndicator");
    private static final javax.xml.namespace.QName CHANGEALLOWEDINDICATOR$10 = 
        new javax.xml.namespace.QName("", "ChangeAllowedIndicator");
    private static final javax.xml.namespace.QName MULTIPLEVALUEINDICATOR$12 = 
        new javax.xml.namespace.QName("", "MultipleValueIndicator");
    private static final javax.xml.namespace.QName NAMESPACEURI$14 = 
        new javax.xml.namespace.QName("", "NamespaceURI");
    private static final javax.xml.namespace.QName DESCRIPTION$16 = 
        new javax.xml.namespace.QName("", "Description");
    private static final javax.xml.namespace.QName PROPERTYVALUE$18 = 
        new javax.xml.namespace.QName("", "PropertyValue");
    
    
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
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
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
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().find_element_user(NAME$2, 0);
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
            return get_store().count_elements(NAME$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
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
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().add_element_user(NAME$2);
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
            get_store().remove_element(NAME$2, 0);
        }
    }
    
    /**
     * Gets the "DataTypeFormatCode" element
     */
    public java.lang.String getDataTypeFormatCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATATYPEFORMATCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataTypeFormatCode" element
     */
    public com.sap.xi.ap.common.gdt.PropertyDataTypeFormatCode xgetDataTypeFormatCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.PropertyDataTypeFormatCode target = null;
            target = (com.sap.xi.ap.common.gdt.PropertyDataTypeFormatCode)get_store().find_element_user(DATATYPEFORMATCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataTypeFormatCode" element
     */
    public boolean isSetDataTypeFormatCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATATYPEFORMATCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "DataTypeFormatCode" element
     */
    public void setDataTypeFormatCode(java.lang.String dataTypeFormatCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATATYPEFORMATCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATATYPEFORMATCODE$4);
            }
            target.setStringValue(dataTypeFormatCode);
        }
    }
    
    /**
     * Sets (as xml) the "DataTypeFormatCode" element
     */
    public void xsetDataTypeFormatCode(com.sap.xi.ap.common.gdt.PropertyDataTypeFormatCode dataTypeFormatCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.PropertyDataTypeFormatCode target = null;
            target = (com.sap.xi.ap.common.gdt.PropertyDataTypeFormatCode)get_store().find_element_user(DATATYPEFORMATCODE$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.PropertyDataTypeFormatCode)get_store().add_element_user(DATATYPEFORMATCODE$4);
            }
            target.set(dataTypeFormatCode);
        }
    }
    
    /**
     * Unsets the "DataTypeFormatCode" element
     */
    public void unsetDataTypeFormatCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATATYPEFORMATCODE$4, 0);
        }
    }
    
    /**
     * Gets the "DataTypeFormatName" element
     */
    public java.lang.String getDataTypeFormatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATATYPEFORMATNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataTypeFormatName" element
     */
    public com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName xgetDataTypeFormatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().find_element_user(DATATYPEFORMATNAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataTypeFormatName" element
     */
    public boolean isSetDataTypeFormatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATATYPEFORMATNAME$6) != 0;
        }
    }
    
    /**
     * Sets the "DataTypeFormatName" element
     */
    public void setDataTypeFormatName(java.lang.String dataTypeFormatName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATATYPEFORMATNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATATYPEFORMATNAME$6);
            }
            target.setStringValue(dataTypeFormatName);
        }
    }
    
    /**
     * Sets (as xml) the "DataTypeFormatName" element
     */
    public void xsetDataTypeFormatName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName dataTypeFormatName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().find_element_user(DATATYPEFORMATNAME$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().add_element_user(DATATYPEFORMATNAME$6);
            }
            target.set(dataTypeFormatName);
        }
    }
    
    /**
     * Unsets the "DataTypeFormatName" element
     */
    public void unsetDataTypeFormatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATATYPEFORMATNAME$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISIBLEINDICATOR$8, 0);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(VISIBLEINDICATOR$8, 0);
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
            return get_store().count_elements(VISIBLEINDICATOR$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISIBLEINDICATOR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VISIBLEINDICATOR$8);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(VISIBLEINDICATOR$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(VISIBLEINDICATOR$8);
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
            get_store().remove_element(VISIBLEINDICATOR$8, 0);
        }
    }
    
    /**
     * Gets the "ChangeAllowedIndicator" element
     */
    public boolean getChangeAllowedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEALLOWEDINDICATOR$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ChangeAllowedIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetChangeAllowedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CHANGEALLOWEDINDICATOR$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "ChangeAllowedIndicator" element
     */
    public boolean isSetChangeAllowedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHANGEALLOWEDINDICATOR$10) != 0;
        }
    }
    
    /**
     * Sets the "ChangeAllowedIndicator" element
     */
    public void setChangeAllowedIndicator(boolean changeAllowedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEALLOWEDINDICATOR$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEALLOWEDINDICATOR$10);
            }
            target.setBooleanValue(changeAllowedIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "ChangeAllowedIndicator" element
     */
    public void xsetChangeAllowedIndicator(com.sap.xi.ap.common.gdt.Indicator changeAllowedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CHANGEALLOWEDINDICATOR$10, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(CHANGEALLOWEDINDICATOR$10);
            }
            target.set(changeAllowedIndicator);
        }
    }
    
    /**
     * Unsets the "ChangeAllowedIndicator" element
     */
    public void unsetChangeAllowedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHANGEALLOWEDINDICATOR$10, 0);
        }
    }
    
    /**
     * Gets the "MultipleValueIndicator" element
     */
    public boolean getMultipleValueIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MULTIPLEVALUEINDICATOR$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "MultipleValueIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetMultipleValueIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(MULTIPLEVALUEINDICATOR$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "MultipleValueIndicator" element
     */
    public boolean isSetMultipleValueIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MULTIPLEVALUEINDICATOR$12) != 0;
        }
    }
    
    /**
     * Sets the "MultipleValueIndicator" element
     */
    public void setMultipleValueIndicator(boolean multipleValueIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MULTIPLEVALUEINDICATOR$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MULTIPLEVALUEINDICATOR$12);
            }
            target.setBooleanValue(multipleValueIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "MultipleValueIndicator" element
     */
    public void xsetMultipleValueIndicator(com.sap.xi.ap.common.gdt.Indicator multipleValueIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(MULTIPLEVALUEINDICATOR$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(MULTIPLEVALUEINDICATOR$12);
            }
            target.set(multipleValueIndicator);
        }
    }
    
    /**
     * Unsets the "MultipleValueIndicator" element
     */
    public void unsetMultipleValueIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MULTIPLEVALUEINDICATOR$12, 0);
        }
    }
    
    /**
     * Gets the "NamespaceURI" element
     */
    public com.sap.xi.ap.common.gdt.NamespaceURI getNamespaceURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NamespaceURI target = null;
            target = (com.sap.xi.ap.common.gdt.NamespaceURI)get_store().find_element_user(NAMESPACEURI$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NamespaceURI" element
     */
    public boolean isSetNamespaceURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMESPACEURI$14) != 0;
        }
    }
    
    /**
     * Sets the "NamespaceURI" element
     */
    public void setNamespaceURI(com.sap.xi.ap.common.gdt.NamespaceURI namespaceURI)
    {
        generatedSetterHelperImpl(namespaceURI, NAMESPACEURI$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "NamespaceURI" element
     */
    public com.sap.xi.ap.common.gdt.NamespaceURI addNewNamespaceURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NamespaceURI target = null;
            target = (com.sap.xi.ap.common.gdt.NamespaceURI)get_store().add_element_user(NAMESPACEURI$14);
            return target;
        }
    }
    
    /**
     * Unsets the "NamespaceURI" element
     */
    public void unsetNamespaceURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMESPACEURI$14, 0);
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
            target = (com.sap.xi.ap.common.gdt.Description)get_store().find_element_user(DESCRIPTION$16, 0);
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
            return get_store().count_elements(DESCRIPTION$16) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(com.sap.xi.ap.common.gdt.Description description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.Description)get_store().add_element_user(DESCRIPTION$16);
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
            get_store().remove_element(DESCRIPTION$16, 0);
        }
    }
    
    /**
     * Gets array of all "PropertyValue" elements
     */
    public com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue[] getPropertyValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTYVALUE$18, targetList);
            com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue[] result = new com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PropertyValue" element
     */
    public com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue getPropertyValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue target = null;
            target = (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue)get_store().find_element_user(PROPERTYVALUE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PropertyValue" element
     */
    public int sizeOfPropertyValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTYVALUE$18);
        }
    }
    
    /**
     * Sets array of all "PropertyValue" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPropertyValueArray(com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue[] propertyValueArray)
    {
        check_orphaned();
        arraySetterHelper(propertyValueArray, PROPERTYVALUE$18);
    }
    
    /**
     * Sets ith "PropertyValue" element
     */
    public void setPropertyValueArray(int i, com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue propertyValue)
    {
        generatedSetterHelperImpl(propertyValue, PROPERTYVALUE$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PropertyValue" element
     */
    public com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue insertNewPropertyValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue target = null;
            target = (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue)get_store().insert_element_user(PROPERTYVALUE$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PropertyValue" element
     */
    public com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue addNewPropertyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue target = null;
            target = (com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue)get_store().add_element_user(PROPERTYVALUE$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "PropertyValue" element
     */
    public void removePropertyValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTYVALUE$18, i);
        }
    }
}
