/*
 * XML Type:  OperationStatusCode
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.OperationStatusCode
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML OperationStatusCode(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class OperationStatusCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.OperationStatusCode
{
    private static final long serialVersionUID = 1L;
    
    public OperationStatusCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIFECYCLESTATUSCODE$0 = 
        new javax.xml.namespace.QName("", "Life_Cycle_Status_Code");
    private static final javax.xml.namespace.QName RELEASESTATUSCODE$2 = 
        new javax.xml.namespace.QName("", "Release_Status_Code");
    private static final javax.xml.namespace.QName ACTIVITPROCESSINGSTATUSCODE$4 = 
        new javax.xml.namespace.QName("", "Activit_Processing_Status_Code");
    
    
    /**
     * Gets the "Life_Cycle_Status_Code" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode.Enum getLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIFECYCLESTATUSCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Life_Cycle_Status_Code" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode xgetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Life_Cycle_Status_Code" element
     */
    public void setLifeCycleStatusCode(com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode.Enum lifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIFECYCLESTATUSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIFECYCLESTATUSCODE$0);
            }
            target.setEnumValue(lifeCycleStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "Life_Cycle_Status_Code" element
     */
    public void xsetLifeCycleStatusCode(com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode lifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode)get_store().add_element_user(LIFECYCLESTATUSCODE$0);
            }
            target.set(lifeCycleStatusCode);
        }
    }
    
    /**
     * Gets the "Release_Status_Code" element
     */
    public com.sap.xi.ap.common.gdt.ReleaseStatusCode.Enum getReleaseStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEASESTATUSCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ReleaseStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Release_Status_Code" element
     */
    public com.sap.xi.ap.common.gdt.ReleaseStatusCode xgetReleaseStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ReleaseStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ReleaseStatusCode)get_store().find_element_user(RELEASESTATUSCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Release_Status_Code" element
     */
    public void setReleaseStatusCode(com.sap.xi.ap.common.gdt.ReleaseStatusCode.Enum releaseStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEASESTATUSCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELEASESTATUSCODE$2);
            }
            target.setEnumValue(releaseStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "Release_Status_Code" element
     */
    public void xsetReleaseStatusCode(com.sap.xi.ap.common.gdt.ReleaseStatusCode releaseStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ReleaseStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ReleaseStatusCode)get_store().find_element_user(RELEASESTATUSCODE$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ReleaseStatusCode)get_store().add_element_user(RELEASESTATUSCODE$2);
            }
            target.set(releaseStatusCode);
        }
    }
    
    /**
     * Gets the "Activit_Processing_Status_Code" element
     */
    public com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum getActivitProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITPROCESSINGSTATUSCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Activit_Processing_Status_Code" element
     */
    public com.sap.xi.ap.common.gdt.ProcessingStatusCode xgetActivitProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().find_element_user(ACTIVITPROCESSINGSTATUSCODE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Activit_Processing_Status_Code" element
     */
    public void setActivitProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum activitProcessingStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITPROCESSINGSTATUSCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITPROCESSINGSTATUSCODE$4);
            }
            target.setEnumValue(activitProcessingStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "Activit_Processing_Status_Code" element
     */
    public void xsetActivitProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode activitProcessingStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().find_element_user(ACTIVITPROCESSINGSTATUSCODE$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().add_element_user(ACTIVITPROCESSINGSTATUSCODE$4);
            }
            target.set(activitProcessingStatusCode);
        }
    }
}
