/*
 * XML Type:  MaintenanceAttachmentFolderDocumentProperty
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global.impl;
/**
 * An XML MaintenanceAttachmentFolderDocumentProperty(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public class MaintenanceAttachmentFolderDocumentPropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty
{
    private static final long serialVersionUID = 1L;
    
    public MaintenanceAttachmentFolderDocumentPropertyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TECHNICALID$0 = 
        new javax.xml.namespace.QName("", "TechnicalID");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "Name");
    private static final javax.xml.namespace.QName DATATYPEFORMATCODE$4 = 
        new javax.xml.namespace.QName("", "DataTypeFormatCode");
    private static final javax.xml.namespace.QName VISIBLEINDICATOR$6 = 
        new javax.xml.namespace.QName("", "VisibleIndicator");
    private static final javax.xml.namespace.QName CHANGEALLOWEDINDICATOR$8 = 
        new javax.xml.namespace.QName("", "ChangeAllowedIndicator");
    private static final javax.xml.namespace.QName MULTIPLEVALUEINDICATOR$10 = 
        new javax.xml.namespace.QName("", "MultipleValueIndicator");
    private static final javax.xml.namespace.QName NAMESPACEURI$12 = 
        new javax.xml.namespace.QName("", "NamespaceURI");
    private static final javax.xml.namespace.QName DESCRIPTION$14 = 
        new javax.xml.namespace.QName("", "Description");
    private static final javax.xml.namespace.QName PROPERTYVALUE$16 = 
        new javax.xml.namespace.QName("", "PropertyValue");
    private static final javax.xml.namespace.QName PROPERTYVALUELISTCOMPLETETRANSMISSIONINDICATOR$18 = 
        new javax.xml.namespace.QName("", "PropertyValueListCompleteTransmissionIndicator");
    private static final javax.xml.namespace.QName ACTIONCODE$20 = 
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
     * Gets the "VisibleIndicator" element
     */
    public boolean getVisibleIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISIBLEINDICATOR$6, 0);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(VISIBLEINDICATOR$6, 0);
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
            return get_store().count_elements(VISIBLEINDICATOR$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISIBLEINDICATOR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VISIBLEINDICATOR$6);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(VISIBLEINDICATOR$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(VISIBLEINDICATOR$6);
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
            get_store().remove_element(VISIBLEINDICATOR$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEALLOWEDINDICATOR$8, 0);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CHANGEALLOWEDINDICATOR$8, 0);
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
            return get_store().count_elements(CHANGEALLOWEDINDICATOR$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEALLOWEDINDICATOR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEALLOWEDINDICATOR$8);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CHANGEALLOWEDINDICATOR$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(CHANGEALLOWEDINDICATOR$8);
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
            get_store().remove_element(CHANGEALLOWEDINDICATOR$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MULTIPLEVALUEINDICATOR$10, 0);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(MULTIPLEVALUEINDICATOR$10, 0);
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
            return get_store().count_elements(MULTIPLEVALUEINDICATOR$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MULTIPLEVALUEINDICATOR$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MULTIPLEVALUEINDICATOR$10);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(MULTIPLEVALUEINDICATOR$10, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(MULTIPLEVALUEINDICATOR$10);
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
            get_store().remove_element(MULTIPLEVALUEINDICATOR$10, 0);
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
            target = (com.sap.xi.ap.common.gdt.NamespaceURI)get_store().find_element_user(NAMESPACEURI$12, 0);
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
            return get_store().count_elements(NAMESPACEURI$12) != 0;
        }
    }
    
    /**
     * Sets the "NamespaceURI" element
     */
    public void setNamespaceURI(com.sap.xi.ap.common.gdt.NamespaceURI namespaceURI)
    {
        generatedSetterHelperImpl(namespaceURI, NAMESPACEURI$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.NamespaceURI)get_store().add_element_user(NAMESPACEURI$12);
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
            get_store().remove_element(NAMESPACEURI$12, 0);
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
            target = (com.sap.xi.ap.common.gdt.Description)get_store().find_element_user(DESCRIPTION$14, 0);
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
            return get_store().count_elements(DESCRIPTION$14) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(com.sap.xi.ap.common.gdt.Description description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.Description)get_store().add_element_user(DESCRIPTION$14);
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
            get_store().remove_element(DESCRIPTION$14, 0);
        }
    }
    
    /**
     * Gets array of all "PropertyValue" elements
     */
    public com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue[] getPropertyValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTYVALUE$16, targetList);
            com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue[] result = new com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PropertyValue" element
     */
    public com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue getPropertyValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue)get_store().find_element_user(PROPERTYVALUE$16, i);
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
            return get_store().count_elements(PROPERTYVALUE$16);
        }
    }
    
    /**
     * Sets array of all "PropertyValue" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPropertyValueArray(com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue[] propertyValueArray)
    {
        check_orphaned();
        arraySetterHelper(propertyValueArray, PROPERTYVALUE$16);
    }
    
    /**
     * Sets ith "PropertyValue" element
     */
    public void setPropertyValueArray(int i, com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue propertyValue)
    {
        generatedSetterHelperImpl(propertyValue, PROPERTYVALUE$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PropertyValue" element
     */
    public com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue insertNewPropertyValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue)get_store().insert_element_user(PROPERTYVALUE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PropertyValue" element
     */
    public com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue addNewPropertyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue)get_store().add_element_user(PROPERTYVALUE$16);
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
            get_store().remove_element(PROPERTYVALUE$16, i);
        }
    }
    
    /**
     * Gets the "PropertyValueListCompleteTransmissionIndicator" attribute
     */
    public boolean getPropertyValueListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTYVALUELISTCOMPLETETRANSMISSIONINDICATOR$18);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "PropertyValueListCompleteTransmissionIndicator" attribute
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetPropertyValueListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(PROPERTYVALUELISTCOMPLETETRANSMISSIONINDICATOR$18);
            return target;
        }
    }
    
    /**
     * True if has "PropertyValueListCompleteTransmissionIndicator" attribute
     */
    public boolean isSetPropertyValueListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTYVALUELISTCOMPLETETRANSMISSIONINDICATOR$18) != null;
        }
    }
    
    /**
     * Sets the "PropertyValueListCompleteTransmissionIndicator" attribute
     */
    public void setPropertyValueListCompleteTransmissionIndicator(boolean propertyValueListCompleteTransmissionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTYVALUELISTCOMPLETETRANSMISSIONINDICATOR$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTYVALUELISTCOMPLETETRANSMISSIONINDICATOR$18);
            }
            target.setBooleanValue(propertyValueListCompleteTransmissionIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "PropertyValueListCompleteTransmissionIndicator" attribute
     */
    public void xsetPropertyValueListCompleteTransmissionIndicator(com.sap.xi.ap.common.gdt.Indicator propertyValueListCompleteTransmissionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(PROPERTYVALUELISTCOMPLETETRANSMISSIONINDICATOR$18);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_attribute_user(PROPERTYVALUELISTCOMPLETETRANSMISSIONINDICATOR$18);
            }
            target.set(propertyValueListCompleteTransmissionIndicator);
        }
    }
    
    /**
     * Unsets the "PropertyValueListCompleteTransmissionIndicator" attribute
     */
    public void unsetPropertyValueListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROPERTYVALUELISTCOMPLETETRANSMISSIONINDICATOR$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$20);
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
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$20);
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
            return get_store().find_attribute_user(ACTIONCODE$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIONCODE$20);
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
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$20);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().add_attribute_user(ACTIONCODE$20);
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
            get_store().remove_attribute(ACTIONCODE$20);
        }
    }
}
