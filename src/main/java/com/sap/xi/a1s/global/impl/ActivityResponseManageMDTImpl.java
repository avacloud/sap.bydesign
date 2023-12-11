/*
 * XML Type:  ActivityResponseManageMDT
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ActivityResponseManageMDT
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ActivityResponseManageMDT(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ActivityResponseManageMDTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ActivityResponseManageMDT
{
    private static final long serialVersionUID = 1L;
    
    public ActivityResponseManageMDTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYID$0 = 
        new javax.xml.namespace.QName("", "ActivityID");
    private static final javax.xml.namespace.QName ACTIVITYUUID$2 = 
        new javax.xml.namespace.QName("", "ActivityUUID");
    private static final javax.xml.namespace.QName TYPECODE$4 = 
        new javax.xml.namespace.QName("", "TypeCode");
    private static final javax.xml.namespace.QName CATEGORYCODE$6 = 
        new javax.xml.namespace.QName("", "CategoryCode");
    private static final javax.xml.namespace.QName CONFIRMATIONCOMPLETEDINDICATOR$8 = 
        new javax.xml.namespace.QName("", "ConfirmationCompletedIndicator");
    private static final javax.xml.namespace.QName RESOURCEUTILIZATION$10 = 
        new javax.xml.namespace.QName("", "ResourceUtilization");
    private static final javax.xml.namespace.QName CONFIRMDURATION$12 = 
        new javax.xml.namespace.QName("", "ConfirmDuration");
    private static final javax.xml.namespace.QName CONFIRMATIONMETHODCODE$14 = 
        new javax.xml.namespace.QName("", "ConfirmationMethodCode");
    private static final javax.xml.namespace.QName SERVICE$16 = 
        new javax.xml.namespace.QName("", "Service");
    
    
    /**
     * Gets the "ActivityID" element
     */
    public java.lang.String getActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ActivityID" element
     */
    public com.sap.xi.ap.common.gdt.OperationActivityID xgetActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationActivityID target = null;
            target = (com.sap.xi.ap.common.gdt.OperationActivityID)get_store().find_element_user(ACTIVITYID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ActivityID" element
     */
    public boolean isSetActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYID$0) != 0;
        }
    }
    
    /**
     * Sets the "ActivityID" element
     */
    public void setActivityID(java.lang.String activityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYID$0);
            }
            target.setStringValue(activityID);
        }
    }
    
    /**
     * Sets (as xml) the "ActivityID" element
     */
    public void xsetActivityID(com.sap.xi.ap.common.gdt.OperationActivityID activityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationActivityID target = null;
            target = (com.sap.xi.ap.common.gdt.OperationActivityID)get_store().find_element_user(ACTIVITYID$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.OperationActivityID)get_store().add_element_user(ACTIVITYID$0);
            }
            target.set(activityID);
        }
    }
    
    /**
     * Unsets the "ActivityID" element
     */
    public void unsetActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYID$0, 0);
        }
    }
    
    /**
     * Gets the "ActivityUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getActivityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(ACTIVITYUUID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ActivityUUID" element
     */
    public boolean isSetActivityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYUUID$2) != 0;
        }
    }
    
    /**
     * Sets the "ActivityUUID" element
     */
    public void setActivityUUID(com.sap.xi.ap.common.gdt.UUID activityUUID)
    {
        generatedSetterHelperImpl(activityUUID, ACTIVITYUUID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ActivityUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewActivityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(ACTIVITYUUID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ActivityUUID" element
     */
    public void unsetActivityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYUUID$2, 0);
        }
    }
    
    /**
     * Gets the "TypeCode" element
     */
    public com.sap.xi.ap.common.gdt.OperationActivityTypeCode getTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationActivityTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.OperationActivityTypeCode)get_store().find_element_user(TYPECODE$4, 0);
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
    public void setTypeCode(com.sap.xi.ap.common.gdt.OperationActivityTypeCode typeCode)
    {
        generatedSetterHelperImpl(typeCode, TYPECODE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TypeCode" element
     */
    public com.sap.xi.ap.common.gdt.OperationActivityTypeCode addNewTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationActivityTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.OperationActivityTypeCode)get_store().add_element_user(TYPECODE$4);
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
    public com.sap.xi.ap.common.gdt.OperationActivityCategoryCode xgetCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationActivityCategoryCode target = null;
            target = (com.sap.xi.ap.common.gdt.OperationActivityCategoryCode)get_store().find_element_user(CATEGORYCODE$6, 0);
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
    public void xsetCategoryCode(com.sap.xi.ap.common.gdt.OperationActivityCategoryCode categoryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationActivityCategoryCode target = null;
            target = (com.sap.xi.ap.common.gdt.OperationActivityCategoryCode)get_store().find_element_user(CATEGORYCODE$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.OperationActivityCategoryCode)get_store().add_element_user(CATEGORYCODE$6);
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
     * Gets the "ConfirmationCompletedIndicator" element
     */
    public boolean getConfirmationCompletedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONCOMPLETEDINDICATOR$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConfirmationCompletedIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetConfirmationCompletedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CONFIRMATIONCOMPLETEDINDICATOR$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ConfirmationCompletedIndicator" element
     */
    public boolean isSetConfirmationCompletedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMATIONCOMPLETEDINDICATOR$8) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmationCompletedIndicator" element
     */
    public void setConfirmationCompletedIndicator(boolean confirmationCompletedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONCOMPLETEDINDICATOR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIRMATIONCOMPLETEDINDICATOR$8);
            }
            target.setBooleanValue(confirmationCompletedIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "ConfirmationCompletedIndicator" element
     */
    public void xsetConfirmationCompletedIndicator(com.sap.xi.ap.common.gdt.Indicator confirmationCompletedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CONFIRMATIONCOMPLETEDINDICATOR$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(CONFIRMATIONCOMPLETEDINDICATOR$8);
            }
            target.set(confirmationCompletedIndicator);
        }
    }
    
    /**
     * Unsets the "ConfirmationCompletedIndicator" element
     */
    public void unsetConfirmationCompletedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMATIONCOMPLETEDINDICATOR$8, 0);
        }
    }
    
    /**
     * Gets array of all "ResourceUtilization" elements
     */
    public com.sap.xi.a1s.global.ProductionLotActivityMaintainResources[] getResourceUtilizationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEUTILIZATION$10, targetList);
            com.sap.xi.a1s.global.ProductionLotActivityMaintainResources[] result = new com.sap.xi.a1s.global.ProductionLotActivityMaintainResources[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ResourceUtilization" element
     */
    public com.sap.xi.a1s.global.ProductionLotActivityMaintainResources getResourceUtilizationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotActivityMaintainResources target = null;
            target = (com.sap.xi.a1s.global.ProductionLotActivityMaintainResources)get_store().find_element_user(RESOURCEUTILIZATION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ResourceUtilization" element
     */
    public int sizeOfResourceUtilizationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEUTILIZATION$10);
        }
    }
    
    /**
     * Sets array of all "ResourceUtilization" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResourceUtilizationArray(com.sap.xi.a1s.global.ProductionLotActivityMaintainResources[] resourceUtilizationArray)
    {
        check_orphaned();
        arraySetterHelper(resourceUtilizationArray, RESOURCEUTILIZATION$10);
    }
    
    /**
     * Sets ith "ResourceUtilization" element
     */
    public void setResourceUtilizationArray(int i, com.sap.xi.a1s.global.ProductionLotActivityMaintainResources resourceUtilization)
    {
        generatedSetterHelperImpl(resourceUtilization, RESOURCEUTILIZATION$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ResourceUtilization" element
     */
    public com.sap.xi.a1s.global.ProductionLotActivityMaintainResources insertNewResourceUtilization(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotActivityMaintainResources target = null;
            target = (com.sap.xi.a1s.global.ProductionLotActivityMaintainResources)get_store().insert_element_user(RESOURCEUTILIZATION$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ResourceUtilization" element
     */
    public com.sap.xi.a1s.global.ProductionLotActivityMaintainResources addNewResourceUtilization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotActivityMaintainResources target = null;
            target = (com.sap.xi.a1s.global.ProductionLotActivityMaintainResources)get_store().add_element_user(RESOURCEUTILIZATION$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "ResourceUtilization" element
     */
    public void removeResourceUtilization(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEUTILIZATION$10, i);
        }
    }
    
    /**
     * Gets the "ConfirmDuration" element
     */
    public org.apache.xmlbeans.GDuration getConfirmDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMDURATION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConfirmDuration" element
     */
    public com.sap.xi.ap.common.gdt.TIMEDuration xgetConfirmDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(CONFIRMDURATION$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "ConfirmDuration" element
     */
    public boolean isSetConfirmDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMDURATION$12) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmDuration" element
     */
    public void setConfirmDuration(org.apache.xmlbeans.GDuration confirmDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMDURATION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIRMDURATION$12);
            }
            target.setGDurationValue(confirmDuration);
        }
    }
    
    /**
     * Sets (as xml) the "ConfirmDuration" element
     */
    public void xsetConfirmDuration(com.sap.xi.ap.common.gdt.TIMEDuration confirmDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(CONFIRMDURATION$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().add_element_user(CONFIRMDURATION$12);
            }
            target.set(confirmDuration);
        }
    }
    
    /**
     * Unsets the "ConfirmDuration" element
     */
    public void unsetConfirmDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMDURATION$12, 0);
        }
    }
    
    /**
     * Gets the "ConfirmationMethodCode" element
     */
    public java.lang.String getConfirmationMethodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONMETHODCODE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConfirmationMethodCode" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode xgetConfirmationMethodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode)get_store().find_element_user(CONFIRMATIONMETHODCODE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "ConfirmationMethodCode" element
     */
    public boolean isSetConfirmationMethodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMATIONMETHODCODE$14) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmationMethodCode" element
     */
    public void setConfirmationMethodCode(java.lang.String confirmationMethodCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONMETHODCODE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIRMATIONMETHODCODE$14);
            }
            target.setStringValue(confirmationMethodCode);
        }
    }
    
    /**
     * Sets (as xml) the "ConfirmationMethodCode" element
     */
    public void xsetConfirmationMethodCode(com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode confirmationMethodCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode)get_store().find_element_user(CONFIRMATIONMETHODCODE$14, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode)get_store().add_element_user(CONFIRMATIONMETHODCODE$14);
            }
            target.set(confirmationMethodCode);
        }
    }
    
    /**
     * Unsets the "ConfirmationMethodCode" element
     */
    public void unsetConfirmationMethodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMATIONMETHODCODE$14, 0);
        }
    }
    
    /**
     * Gets array of all "Service" elements
     */
    public com.sap.xi.a1s.global.ProductionLotActivityServices[] getServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICE$16, targetList);
            com.sap.xi.a1s.global.ProductionLotActivityServices[] result = new com.sap.xi.a1s.global.ProductionLotActivityServices[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Service" element
     */
    public com.sap.xi.a1s.global.ProductionLotActivityServices getServiceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotActivityServices target = null;
            target = (com.sap.xi.a1s.global.ProductionLotActivityServices)get_store().find_element_user(SERVICE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Service" element
     */
    public int sizeOfServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICE$16);
        }
    }
    
    /**
     * Sets array of all "Service" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setServiceArray(com.sap.xi.a1s.global.ProductionLotActivityServices[] serviceArray)
    {
        check_orphaned();
        arraySetterHelper(serviceArray, SERVICE$16);
    }
    
    /**
     * Sets ith "Service" element
     */
    public void setServiceArray(int i, com.sap.xi.a1s.global.ProductionLotActivityServices service)
    {
        generatedSetterHelperImpl(service, SERVICE$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Service" element
     */
    public com.sap.xi.a1s.global.ProductionLotActivityServices insertNewService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotActivityServices target = null;
            target = (com.sap.xi.a1s.global.ProductionLotActivityServices)get_store().insert_element_user(SERVICE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Service" element
     */
    public com.sap.xi.a1s.global.ProductionLotActivityServices addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotActivityServices target = null;
            target = (com.sap.xi.a1s.global.ProductionLotActivityServices)get_store().add_element_user(SERVICE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "Service" element
     */
    public void removeService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICE$16, i);
        }
    }
}
