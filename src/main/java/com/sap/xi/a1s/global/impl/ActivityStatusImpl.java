/*
 * XML Type:  ActivityStatus
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ActivityStatus
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ActivityStatus(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ActivityStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ActivityStatus
{
    private static final long serialVersionUID = 1L;
    
    public ActivityStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYSTATUSCODE$0 = 
        new javax.xml.namespace.QName("", "Activity_Status_Code");
    private static final javax.xml.namespace.QName PROCESSINGSTATUSCODE$2 = 
        new javax.xml.namespace.QName("", "Processing_Status_Code");
    
    
    /**
     * Gets the "Activity_Status_Code" element
     */
    public com.sap.xi.ap.common.gdt.ReleaseStatusCode.Enum getActivityStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSTATUSCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ReleaseStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Activity_Status_Code" element
     */
    public com.sap.xi.ap.common.gdt.ReleaseStatusCode xgetActivityStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ReleaseStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ReleaseStatusCode)get_store().find_element_user(ACTIVITYSTATUSCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Activity_Status_Code" element
     */
    public void setActivityStatusCode(com.sap.xi.ap.common.gdt.ReleaseStatusCode.Enum activityStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSTATUSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYSTATUSCODE$0);
            }
            target.setEnumValue(activityStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "Activity_Status_Code" element
     */
    public void xsetActivityStatusCode(com.sap.xi.ap.common.gdt.ReleaseStatusCode activityStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ReleaseStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ReleaseStatusCode)get_store().find_element_user(ACTIVITYSTATUSCODE$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ReleaseStatusCode)get_store().add_element_user(ACTIVITYSTATUSCODE$0);
            }
            target.set(activityStatusCode);
        }
    }
    
    /**
     * Gets the "Processing_Status_Code" element
     */
    public com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum getProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSINGSTATUSCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Processing_Status_Code" element
     */
    public com.sap.xi.ap.common.gdt.ProcessingStatusCode xgetProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().find_element_user(PROCESSINGSTATUSCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Processing_Status_Code" element
     */
    public void setProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum processingStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSINGSTATUSCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCESSINGSTATUSCODE$2);
            }
            target.setEnumValue(processingStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "Processing_Status_Code" element
     */
    public void xsetProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode processingStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().find_element_user(PROCESSINGSTATUSCODE$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().add_element_user(PROCESSINGSTATUSCODE$2);
            }
            target.set(processingStatusCode);
        }
    }
}
