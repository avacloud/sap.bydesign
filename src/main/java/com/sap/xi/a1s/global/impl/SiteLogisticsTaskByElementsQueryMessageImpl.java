/*
 * XML Type:  SiteLogisticsTaskByElementsQueryMessage
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsTaskByElementsQueryMessage
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML SiteLogisticsTaskByElementsQueryMessage(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class SiteLogisticsTaskByElementsQueryMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.SiteLogisticsTaskByElementsQueryMessage
{
    private static final long serialVersionUID = 1L;
    
    public SiteLogisticsTaskByElementsQueryMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SITELOGISTICSTASKSELECTIONBYELEMENTS$0 = 
        new javax.xml.namespace.QName("", "SiteLogisticsTaskSelectionByElements");
    private static final javax.xml.namespace.QName PROCESSINGCONDITIONS$2 = 
        new javax.xml.namespace.QName("", "ProcessingConditions");
    
    
    /**
     * Gets the "SiteLogisticsTaskSelectionByElements" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements getSiteLogisticsTaskSelectionByElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements)get_store().find_element_user(SITELOGISTICSTASKSELECTIONBYELEMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SiteLogisticsTaskSelectionByElements" element
     */
    public boolean isSetSiteLogisticsTaskSelectionByElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITELOGISTICSTASKSELECTIONBYELEMENTS$0) != 0;
        }
    }
    
    /**
     * Sets the "SiteLogisticsTaskSelectionByElements" element
     */
    public void setSiteLogisticsTaskSelectionByElements(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements siteLogisticsTaskSelectionByElements)
    {
        generatedSetterHelperImpl(siteLogisticsTaskSelectionByElements, SITELOGISTICSTASKSELECTIONBYELEMENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SiteLogisticsTaskSelectionByElements" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements addNewSiteLogisticsTaskSelectionByElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements)get_store().add_element_user(SITELOGISTICSTASKSELECTIONBYELEMENTS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "SiteLogisticsTaskSelectionByElements" element
     */
    public void unsetSiteLogisticsTaskSelectionByElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITELOGISTICSTASKSELECTIONBYELEMENTS$0, 0);
        }
    }
    
    /**
     * Gets the "ProcessingConditions" element
     */
    public com.sap.xi.ap.common.gdt.QueryProcessingConditions getProcessingConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.QueryProcessingConditions target = null;
            target = (com.sap.xi.ap.common.gdt.QueryProcessingConditions)get_store().find_element_user(PROCESSINGCONDITIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProcessingConditions" element
     */
    public boolean isSetProcessingConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSINGCONDITIONS$2) != 0;
        }
    }
    
    /**
     * Sets the "ProcessingConditions" element
     */
    public void setProcessingConditions(com.sap.xi.ap.common.gdt.QueryProcessingConditions processingConditions)
    {
        generatedSetterHelperImpl(processingConditions, PROCESSINGCONDITIONS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProcessingConditions" element
     */
    public com.sap.xi.ap.common.gdt.QueryProcessingConditions addNewProcessingConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.QueryProcessingConditions target = null;
            target = (com.sap.xi.ap.common.gdt.QueryProcessingConditions)get_store().add_element_user(PROCESSINGCONDITIONS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ProcessingConditions" element
     */
    public void unsetProcessingConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSINGCONDITIONS$2, 0);
        }
    }
}
