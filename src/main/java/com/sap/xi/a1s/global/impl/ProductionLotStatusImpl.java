/*
 * XML Type:  ProductionLotStatus
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotStatus
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotStatus(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotStatus
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIFECYCLESTATUSCODE$0 = 
        new javax.xml.namespace.QName("", "Life_Cycle_Status_Code");
    private static final javax.xml.namespace.QName ACTIVITYPORCESSSTATUSCODE$2 = 
        new javax.xml.namespace.QName("", "Activity_porcess_Status_Code");
    private static final javax.xml.namespace.QName REPPOINTPROCESSINGSTATUSCODE$4 = 
        new javax.xml.namespace.QName("", "Rep_Point_Processing_Status_Code");
    
    
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
     * Gets the "Activity_porcess_Status_Code" element
     */
    public com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum getActivityPorcessStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYPORCESSSTATUSCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Activity_porcess_Status_Code" element
     */
    public com.sap.xi.ap.common.gdt.ProcessingStatusCode xgetActivityPorcessStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().find_element_user(ACTIVITYPORCESSSTATUSCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Activity_porcess_Status_Code" element
     */
    public void setActivityPorcessStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum activityPorcessStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYPORCESSSTATUSCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYPORCESSSTATUSCODE$2);
            }
            target.setEnumValue(activityPorcessStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "Activity_porcess_Status_Code" element
     */
    public void xsetActivityPorcessStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode activityPorcessStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().find_element_user(ACTIVITYPORCESSSTATUSCODE$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().add_element_user(ACTIVITYPORCESSSTATUSCODE$2);
            }
            target.set(activityPorcessStatusCode);
        }
    }
    
    /**
     * Gets the "Rep_Point_Processing_Status_Code" element
     */
    public com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum getRepPointProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPPOINTPROCESSINGSTATUSCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Rep_Point_Processing_Status_Code" element
     */
    public com.sap.xi.ap.common.gdt.ProcessingStatusCode xgetRepPointProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().find_element_user(REPPOINTPROCESSINGSTATUSCODE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Rep_Point_Processing_Status_Code" element
     */
    public void setRepPointProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum repPointProcessingStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPPOINTPROCESSINGSTATUSCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPPOINTPROCESSINGSTATUSCODE$4);
            }
            target.setEnumValue(repPointProcessingStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "Rep_Point_Processing_Status_Code" element
     */
    public void xsetRepPointProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode repPointProcessingStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().find_element_user(REPPOINTPROCESSINGSTATUSCODE$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().add_element_user(REPPOINTPROCESSINGSTATUSCODE$4);
            }
            target.set(repPointProcessingStatusCode);
        }
    }
}
