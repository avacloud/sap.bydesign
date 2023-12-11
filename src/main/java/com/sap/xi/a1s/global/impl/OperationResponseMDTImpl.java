/*
 * XML Type:  OperationResponseMDT
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.OperationResponseMDT
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML OperationResponseMDT(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class OperationResponseMDTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.OperationResponseMDT
{
    private static final long serialVersionUID = 1L;
    
    public OperationResponseMDTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONID$0 = 
        new javax.xml.namespace.QName("", "OperationID");
    private static final javax.xml.namespace.QName OPERATIONUUID$2 = 
        new javax.xml.namespace.QName("", "OperationUUID");
    private static final javax.xml.namespace.QName TYPECODE$4 = 
        new javax.xml.namespace.QName("", "TypeCode");
    private static final javax.xml.namespace.QName CATEGORYCODE$6 = 
        new javax.xml.namespace.QName("", "CategoryCode");
    private static final javax.xml.namespace.QName OPERATIONSTATUS$8 = 
        new javax.xml.namespace.QName("", "OperationStatus");
    private static final javax.xml.namespace.QName STARTDATETIME$10 = 
        new javax.xml.namespace.QName("", "StartDateTime");
    private static final javax.xml.namespace.QName ENDDATETIME$12 = 
        new javax.xml.namespace.QName("", "EndDateTime");
    private static final javax.xml.namespace.QName CONFIRMMAINRESOURCEID$14 = 
        new javax.xml.namespace.QName("", "ConfirmMainResourceID");
    private static final javax.xml.namespace.QName CONFIRMMAINRESOURCEUUID$16 = 
        new javax.xml.namespace.QName("", "ConfirmMainResourceUUID");
    private static final javax.xml.namespace.QName CONFIRMATIONGROUPUUID$18 = 
        new javax.xml.namespace.QName("", "ConfirmationGroupUUID");
    
    
    /**
     * Gets the "OperationID" element
     */
    public java.lang.String getOperationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OperationID" element
     */
    public com.sap.xi.ap.common.gdt.OperationID xgetOperationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationID target = null;
            target = (com.sap.xi.ap.common.gdt.OperationID)get_store().find_element_user(OPERATIONID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "OperationID" element
     */
    public boolean isSetOperationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONID$0) != 0;
        }
    }
    
    /**
     * Sets the "OperationID" element
     */
    public void setOperationID(java.lang.String operationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONID$0);
            }
            target.setStringValue(operationID);
        }
    }
    
    /**
     * Sets (as xml) the "OperationID" element
     */
    public void xsetOperationID(com.sap.xi.ap.common.gdt.OperationID operationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationID target = null;
            target = (com.sap.xi.ap.common.gdt.OperationID)get_store().find_element_user(OPERATIONID$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.OperationID)get_store().add_element_user(OPERATIONID$0);
            }
            target.set(operationID);
        }
    }
    
    /**
     * Unsets the "OperationID" element
     */
    public void unsetOperationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONID$0, 0);
        }
    }
    
    /**
     * Gets the "OperationUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getOperationUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(OPERATIONUUID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OperationUUID" element
     */
    public boolean isSetOperationUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONUUID$2) != 0;
        }
    }
    
    /**
     * Sets the "OperationUUID" element
     */
    public void setOperationUUID(com.sap.xi.ap.common.gdt.UUID operationUUID)
    {
        generatedSetterHelperImpl(operationUUID, OPERATIONUUID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OperationUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewOperationUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(OPERATIONUUID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "OperationUUID" element
     */
    public void unsetOperationUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONUUID$2, 0);
        }
    }
    
    /**
     * Gets the "TypeCode" element
     */
    public com.sap.xi.ap.common.gdt.OperationTypeCode getTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.OperationTypeCode)get_store().find_element_user(TYPECODE$4, 0);
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
            return get_store().count_elements(TYPECODE$4) != 0;
        }
    }
    
    /**
     * Sets the "TypeCode" element
     */
    public void setTypeCode(com.sap.xi.ap.common.gdt.OperationTypeCode typeCode)
    {
        generatedSetterHelperImpl(typeCode, TYPECODE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TypeCode" element
     */
    public com.sap.xi.ap.common.gdt.OperationTypeCode addNewTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.OperationTypeCode)get_store().add_element_user(TYPECODE$4);
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
            get_store().remove_element(TYPECODE$4, 0);
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
    public com.sap.xi.ap.common.gdt.OperationCategoryCode xgetCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationCategoryCode target = null;
            target = (com.sap.xi.ap.common.gdt.OperationCategoryCode)get_store().find_element_user(CATEGORYCODE$6, 0);
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
    public void xsetCategoryCode(com.sap.xi.ap.common.gdt.OperationCategoryCode categoryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationCategoryCode target = null;
            target = (com.sap.xi.ap.common.gdt.OperationCategoryCode)get_store().find_element_user(CATEGORYCODE$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.OperationCategoryCode)get_store().add_element_user(CATEGORYCODE$6);
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
     * Gets the "OperationStatus" element
     */
    public com.sap.xi.a1s.global.OperationStatusCode getOperationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.OperationStatusCode target = null;
            target = (com.sap.xi.a1s.global.OperationStatusCode)get_store().find_element_user(OPERATIONSTATUS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OperationStatus" element
     */
    public boolean isSetOperationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONSTATUS$8) != 0;
        }
    }
    
    /**
     * Sets the "OperationStatus" element
     */
    public void setOperationStatus(com.sap.xi.a1s.global.OperationStatusCode operationStatus)
    {
        generatedSetterHelperImpl(operationStatus, OPERATIONSTATUS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OperationStatus" element
     */
    public com.sap.xi.a1s.global.OperationStatusCode addNewOperationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.OperationStatusCode target = null;
            target = (com.sap.xi.a1s.global.OperationStatusCode)get_store().add_element_user(OPERATIONSTATUS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "OperationStatus" element
     */
    public void unsetOperationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONSTATUS$8, 0);
        }
    }
    
    /**
     * Gets the "StartDateTime" element
     */
    public java.util.Calendar getStartDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATETIME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "StartDateTime" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetStartDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(STARTDATETIME$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "StartDateTime" element
     */
    public boolean isSetStartDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTDATETIME$10) != 0;
        }
    }
    
    /**
     * Sets the "StartDateTime" element
     */
    public void setStartDateTime(java.util.Calendar startDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATETIME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATETIME$10);
            }
            target.setCalendarValue(startDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "StartDateTime" element
     */
    public void xsetStartDateTime(com.sap.xi.basis.global.GLOBALDateTime startDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(STARTDATETIME$10, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(STARTDATETIME$10);
            }
            target.set(startDateTime);
        }
    }
    
    /**
     * Unsets the "StartDateTime" element
     */
    public void unsetStartDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTDATETIME$10, 0);
        }
    }
    
    /**
     * Gets the "EndDateTime" element
     */
    public java.util.Calendar getEndDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATETIME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndDateTime" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetEndDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(ENDDATETIME$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "EndDateTime" element
     */
    public boolean isSetEndDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDDATETIME$12) != 0;
        }
    }
    
    /**
     * Sets the "EndDateTime" element
     */
    public void setEndDateTime(java.util.Calendar endDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATETIME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATETIME$12);
            }
            target.setCalendarValue(endDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "EndDateTime" element
     */
    public void xsetEndDateTime(com.sap.xi.basis.global.GLOBALDateTime endDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(ENDDATETIME$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(ENDDATETIME$12);
            }
            target.set(endDateTime);
        }
    }
    
    /**
     * Unsets the "EndDateTime" element
     */
    public void unsetEndDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDDATETIME$12, 0);
        }
    }
    
    /**
     * Gets the "ConfirmMainResourceID" element
     */
    public com.sap.xi.ap.common.gdt.ResourceID getConfirmMainResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ResourceID target = null;
            target = (com.sap.xi.ap.common.gdt.ResourceID)get_store().find_element_user(CONFIRMMAINRESOURCEID$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConfirmMainResourceID" element
     */
    public boolean isSetConfirmMainResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMMAINRESOURCEID$14) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmMainResourceID" element
     */
    public void setConfirmMainResourceID(com.sap.xi.ap.common.gdt.ResourceID confirmMainResourceID)
    {
        generatedSetterHelperImpl(confirmMainResourceID, CONFIRMMAINRESOURCEID$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ConfirmMainResourceID" element
     */
    public com.sap.xi.ap.common.gdt.ResourceID addNewConfirmMainResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ResourceID target = null;
            target = (com.sap.xi.ap.common.gdt.ResourceID)get_store().add_element_user(CONFIRMMAINRESOURCEID$14);
            return target;
        }
    }
    
    /**
     * Unsets the "ConfirmMainResourceID" element
     */
    public void unsetConfirmMainResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMMAINRESOURCEID$14, 0);
        }
    }
    
    /**
     * Gets the "ConfirmMainResourceUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getConfirmMainResourceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(CONFIRMMAINRESOURCEUUID$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConfirmMainResourceUUID" element
     */
    public boolean isSetConfirmMainResourceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMMAINRESOURCEUUID$16) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmMainResourceUUID" element
     */
    public void setConfirmMainResourceUUID(com.sap.xi.ap.common.gdt.UUID confirmMainResourceUUID)
    {
        generatedSetterHelperImpl(confirmMainResourceUUID, CONFIRMMAINRESOURCEUUID$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ConfirmMainResourceUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewConfirmMainResourceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(CONFIRMMAINRESOURCEUUID$16);
            return target;
        }
    }
    
    /**
     * Unsets the "ConfirmMainResourceUUID" element
     */
    public void unsetConfirmMainResourceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMMAINRESOURCEUUID$16, 0);
        }
    }
    
    /**
     * Gets the "ConfirmationGroupUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getConfirmationGroupUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(CONFIRMATIONGROUPUUID$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConfirmationGroupUUID" element
     */
    public boolean isSetConfirmationGroupUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMATIONGROUPUUID$18) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmationGroupUUID" element
     */
    public void setConfirmationGroupUUID(com.sap.xi.ap.common.gdt.UUID confirmationGroupUUID)
    {
        generatedSetterHelperImpl(confirmationGroupUUID, CONFIRMATIONGROUPUUID$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ConfirmationGroupUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewConfirmationGroupUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(CONFIRMATIONGROUPUUID$18);
            return target;
        }
    }
    
    /**
     * Unsets the "ConfirmationGroupUUID" element
     */
    public void unsetConfirmationGroupUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMATIONGROUPUUID$18, 0);
        }
    }
}
