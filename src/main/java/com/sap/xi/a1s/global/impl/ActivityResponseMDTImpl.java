/*
 * XML Type:  ActivityResponseMDT
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ActivityResponseMDT
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ActivityResponseMDT(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ActivityResponseMDTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ActivityResponseMDT
{
    private static final long serialVersionUID = 1L;
    
    public ActivityResponseMDTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYID$0 = 
        new javax.xml.namespace.QName("", "ActivityID");
    private static final javax.xml.namespace.QName ACTIVITYUUID$2 = 
        new javax.xml.namespace.QName("", "ActivityUUID");
    private static final javax.xml.namespace.QName ACTIVITYSTATUS$4 = 
        new javax.xml.namespace.QName("", "ActivityStatus");
    private static final javax.xml.namespace.QName TYPECODE$6 = 
        new javax.xml.namespace.QName("", "TypeCode");
    private static final javax.xml.namespace.QName CATEGORYCODE$8 = 
        new javax.xml.namespace.QName("", "CategoryCode");
    private static final javax.xml.namespace.QName MATERIALINSPECTIONUUID$10 = 
        new javax.xml.namespace.QName("", "MaterialInspectionUUID");
    private static final javax.xml.namespace.QName STARTDATETIME$12 = 
        new javax.xml.namespace.QName("", "StartDateTime");
    private static final javax.xml.namespace.QName PLANNEDDURATION$14 = 
        new javax.xml.namespace.QName("", "PlannedDuration");
    private static final javax.xml.namespace.QName OPENDURATION$16 = 
        new javax.xml.namespace.QName("", "OpenDuration");
    private static final javax.xml.namespace.QName TOTALCONFIRMEDDURATION$18 = 
        new javax.xml.namespace.QName("", "TotalConfirmedDuration");
    private static final javax.xml.namespace.QName ENDDATETIME$20 = 
        new javax.xml.namespace.QName("", "EndDateTime");
    private static final javax.xml.namespace.QName CONFIRMATIONCOMPLETEDINDICATOR$22 = 
        new javax.xml.namespace.QName("", "ConfirmationCompletedIndicator");
    private static final javax.xml.namespace.QName CONFIRMATIONGROUPUUID$24 = 
        new javax.xml.namespace.QName("", "ConfirmationGroupUUID");
    private static final javax.xml.namespace.QName RESOURCEUTILIZATION$26 = 
        new javax.xml.namespace.QName("", "ResourceUtilization");
    private static final javax.xml.namespace.QName SERVICE$28 = 
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
     * Gets the "ActivityStatus" element
     */
    public com.sap.xi.a1s.global.ActivityStatus getActivityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ActivityStatus target = null;
            target = (com.sap.xi.a1s.global.ActivityStatus)get_store().find_element_user(ACTIVITYSTATUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ActivityStatus" element
     */
    public boolean isSetActivityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYSTATUS$4) != 0;
        }
    }
    
    /**
     * Sets the "ActivityStatus" element
     */
    public void setActivityStatus(com.sap.xi.a1s.global.ActivityStatus activityStatus)
    {
        generatedSetterHelperImpl(activityStatus, ACTIVITYSTATUS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ActivityStatus" element
     */
    public com.sap.xi.a1s.global.ActivityStatus addNewActivityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ActivityStatus target = null;
            target = (com.sap.xi.a1s.global.ActivityStatus)get_store().add_element_user(ACTIVITYSTATUS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ActivityStatus" element
     */
    public void unsetActivityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYSTATUS$4, 0);
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
            target = (com.sap.xi.ap.common.gdt.OperationActivityTypeCode)get_store().find_element_user(TYPECODE$6, 0);
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
            return get_store().count_elements(TYPECODE$6) != 0;
        }
    }
    
    /**
     * Sets the "TypeCode" element
     */
    public void setTypeCode(com.sap.xi.ap.common.gdt.OperationActivityTypeCode typeCode)
    {
        generatedSetterHelperImpl(typeCode, TYPECODE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.OperationActivityTypeCode)get_store().add_element_user(TYPECODE$6);
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
            get_store().remove_element(TYPECODE$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYCODE$8, 0);
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
            target = (com.sap.xi.ap.common.gdt.OperationActivityCategoryCode)get_store().find_element_user(CATEGORYCODE$8, 0);
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
            return get_store().count_elements(CATEGORYCODE$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYCODE$8);
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
            target = (com.sap.xi.ap.common.gdt.OperationActivityCategoryCode)get_store().find_element_user(CATEGORYCODE$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.OperationActivityCategoryCode)get_store().add_element_user(CATEGORYCODE$8);
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
            get_store().remove_element(CATEGORYCODE$8, 0);
        }
    }
    
    /**
     * Gets the "MaterialInspectionUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getMaterialInspectionUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(MATERIALINSPECTIONUUID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MaterialInspectionUUID" element
     */
    public boolean isSetMaterialInspectionUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATERIALINSPECTIONUUID$10) != 0;
        }
    }
    
    /**
     * Sets the "MaterialInspectionUUID" element
     */
    public void setMaterialInspectionUUID(com.sap.xi.ap.common.gdt.UUID materialInspectionUUID)
    {
        generatedSetterHelperImpl(materialInspectionUUID, MATERIALINSPECTIONUUID$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MaterialInspectionUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewMaterialInspectionUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(MATERIALINSPECTIONUUID$10);
            return target;
        }
    }
    
    /**
     * Unsets the "MaterialInspectionUUID" element
     */
    public void unsetMaterialInspectionUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATERIALINSPECTIONUUID$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATETIME$12, 0);
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
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(STARTDATETIME$12, 0);
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
            return get_store().count_elements(STARTDATETIME$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATETIME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATETIME$12);
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
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(STARTDATETIME$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(STARTDATETIME$12);
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
            get_store().remove_element(STARTDATETIME$12, 0);
        }
    }
    
    /**
     * Gets the "PlannedDuration" element
     */
    public org.apache.xmlbeans.GDuration getPlannedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANNEDDURATION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "PlannedDuration" element
     */
    public com.sap.xi.ap.common.gdt.TIMEDuration xgetPlannedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(PLANNEDDURATION$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "PlannedDuration" element
     */
    public boolean isSetPlannedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLANNEDDURATION$14) != 0;
        }
    }
    
    /**
     * Sets the "PlannedDuration" element
     */
    public void setPlannedDuration(org.apache.xmlbeans.GDuration plannedDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANNEDDURATION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLANNEDDURATION$14);
            }
            target.setGDurationValue(plannedDuration);
        }
    }
    
    /**
     * Sets (as xml) the "PlannedDuration" element
     */
    public void xsetPlannedDuration(com.sap.xi.ap.common.gdt.TIMEDuration plannedDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(PLANNEDDURATION$14, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().add_element_user(PLANNEDDURATION$14);
            }
            target.set(plannedDuration);
        }
    }
    
    /**
     * Unsets the "PlannedDuration" element
     */
    public void unsetPlannedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLANNEDDURATION$14, 0);
        }
    }
    
    /**
     * Gets the "OpenDuration" element
     */
    public org.apache.xmlbeans.GDuration getOpenDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENDURATION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "OpenDuration" element
     */
    public com.sap.xi.ap.common.gdt.TIMEDuration xgetOpenDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(OPENDURATION$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "OpenDuration" element
     */
    public boolean isSetOpenDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPENDURATION$16) != 0;
        }
    }
    
    /**
     * Sets the "OpenDuration" element
     */
    public void setOpenDuration(org.apache.xmlbeans.GDuration openDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENDURATION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPENDURATION$16);
            }
            target.setGDurationValue(openDuration);
        }
    }
    
    /**
     * Sets (as xml) the "OpenDuration" element
     */
    public void xsetOpenDuration(com.sap.xi.ap.common.gdt.TIMEDuration openDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(OPENDURATION$16, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().add_element_user(OPENDURATION$16);
            }
            target.set(openDuration);
        }
    }
    
    /**
     * Unsets the "OpenDuration" element
     */
    public void unsetOpenDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPENDURATION$16, 0);
        }
    }
    
    /**
     * Gets the "TotalConfirmedDuration" element
     */
    public org.apache.xmlbeans.GDuration getTotalConfirmedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCONFIRMEDDURATION$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalConfirmedDuration" element
     */
    public com.sap.xi.ap.common.gdt.TIMEDuration xgetTotalConfirmedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(TOTALCONFIRMEDDURATION$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalConfirmedDuration" element
     */
    public boolean isSetTotalConfirmedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALCONFIRMEDDURATION$18) != 0;
        }
    }
    
    /**
     * Sets the "TotalConfirmedDuration" element
     */
    public void setTotalConfirmedDuration(org.apache.xmlbeans.GDuration totalConfirmedDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCONFIRMEDDURATION$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALCONFIRMEDDURATION$18);
            }
            target.setGDurationValue(totalConfirmedDuration);
        }
    }
    
    /**
     * Sets (as xml) the "TotalConfirmedDuration" element
     */
    public void xsetTotalConfirmedDuration(com.sap.xi.ap.common.gdt.TIMEDuration totalConfirmedDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(TOTALCONFIRMEDDURATION$18, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().add_element_user(TOTALCONFIRMEDDURATION$18);
            }
            target.set(totalConfirmedDuration);
        }
    }
    
    /**
     * Unsets the "TotalConfirmedDuration" element
     */
    public void unsetTotalConfirmedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALCONFIRMEDDURATION$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATETIME$20, 0);
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
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(ENDDATETIME$20, 0);
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
            return get_store().count_elements(ENDDATETIME$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATETIME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATETIME$20);
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
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(ENDDATETIME$20, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(ENDDATETIME$20);
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
            get_store().remove_element(ENDDATETIME$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONCOMPLETEDINDICATOR$22, 0);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CONFIRMATIONCOMPLETEDINDICATOR$22, 0);
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
            return get_store().count_elements(CONFIRMATIONCOMPLETEDINDICATOR$22) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONCOMPLETEDINDICATOR$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIRMATIONCOMPLETEDINDICATOR$22);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CONFIRMATIONCOMPLETEDINDICATOR$22, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(CONFIRMATIONCOMPLETEDINDICATOR$22);
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
            get_store().remove_element(CONFIRMATIONCOMPLETEDINDICATOR$22, 0);
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
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(CONFIRMATIONGROUPUUID$24, 0);
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
            return get_store().count_elements(CONFIRMATIONGROUPUUID$24) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmationGroupUUID" element
     */
    public void setConfirmationGroupUUID(com.sap.xi.ap.common.gdt.UUID confirmationGroupUUID)
    {
        generatedSetterHelperImpl(confirmationGroupUUID, CONFIRMATIONGROUPUUID$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(CONFIRMATIONGROUPUUID$24);
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
            get_store().remove_element(CONFIRMATIONGROUPUUID$24, 0);
        }
    }
    
    /**
     * Gets array of all "ResourceUtilization" elements
     */
    public com.sap.xi.a1s.global.ProductionLotResources[] getResourceUtilizationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEUTILIZATION$26, targetList);
            com.sap.xi.a1s.global.ProductionLotResources[] result = new com.sap.xi.a1s.global.ProductionLotResources[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ResourceUtilization" element
     */
    public com.sap.xi.a1s.global.ProductionLotResources getResourceUtilizationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotResources target = null;
            target = (com.sap.xi.a1s.global.ProductionLotResources)get_store().find_element_user(RESOURCEUTILIZATION$26, i);
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
            return get_store().count_elements(RESOURCEUTILIZATION$26);
        }
    }
    
    /**
     * Sets array of all "ResourceUtilization" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResourceUtilizationArray(com.sap.xi.a1s.global.ProductionLotResources[] resourceUtilizationArray)
    {
        check_orphaned();
        arraySetterHelper(resourceUtilizationArray, RESOURCEUTILIZATION$26);
    }
    
    /**
     * Sets ith "ResourceUtilization" element
     */
    public void setResourceUtilizationArray(int i, com.sap.xi.a1s.global.ProductionLotResources resourceUtilization)
    {
        generatedSetterHelperImpl(resourceUtilization, RESOURCEUTILIZATION$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ResourceUtilization" element
     */
    public com.sap.xi.a1s.global.ProductionLotResources insertNewResourceUtilization(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotResources target = null;
            target = (com.sap.xi.a1s.global.ProductionLotResources)get_store().insert_element_user(RESOURCEUTILIZATION$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ResourceUtilization" element
     */
    public com.sap.xi.a1s.global.ProductionLotResources addNewResourceUtilization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotResources target = null;
            target = (com.sap.xi.a1s.global.ProductionLotResources)get_store().add_element_user(RESOURCEUTILIZATION$26);
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
            get_store().remove_element(RESOURCEUTILIZATION$26, i);
        }
    }
    
    /**
     * Gets array of all "Service" elements
     */
    public com.sap.xi.a1s.global.ProductionLotServices[] getServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICE$28, targetList);
            com.sap.xi.a1s.global.ProductionLotServices[] result = new com.sap.xi.a1s.global.ProductionLotServices[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Service" element
     */
    public com.sap.xi.a1s.global.ProductionLotServices getServiceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotServices target = null;
            target = (com.sap.xi.a1s.global.ProductionLotServices)get_store().find_element_user(SERVICE$28, i);
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
            return get_store().count_elements(SERVICE$28);
        }
    }
    
    /**
     * Sets array of all "Service" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setServiceArray(com.sap.xi.a1s.global.ProductionLotServices[] serviceArray)
    {
        check_orphaned();
        arraySetterHelper(serviceArray, SERVICE$28);
    }
    
    /**
     * Sets ith "Service" element
     */
    public void setServiceArray(int i, com.sap.xi.a1s.global.ProductionLotServices service)
    {
        generatedSetterHelperImpl(service, SERVICE$28, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Service" element
     */
    public com.sap.xi.a1s.global.ProductionLotServices insertNewService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotServices target = null;
            target = (com.sap.xi.a1s.global.ProductionLotServices)get_store().insert_element_user(SERVICE$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Service" element
     */
    public com.sap.xi.a1s.global.ProductionLotServices addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotServices target = null;
            target = (com.sap.xi.a1s.global.ProductionLotServices)get_store().add_element_user(SERVICE$28);
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
            get_store().remove_element(SERVICE$28, i);
        }
    }
}
