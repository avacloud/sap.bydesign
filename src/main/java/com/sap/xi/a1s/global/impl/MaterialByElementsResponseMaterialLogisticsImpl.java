/*
 * XML Type:  MaterialByElementsResponseMaterialLogistics
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterialLogistics(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialLogisticsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLogistics
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialLogisticsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SITEID$0 = 
        new javax.xml.namespace.QName("", "SiteID");
    private static final javax.xml.namespace.QName LIFECYCLESTATUSCODE$2 = 
        new javax.xml.namespace.QName("", "LifeCycleStatusCode");
    private static final javax.xml.namespace.QName CYCLECOUNTPLANNEDDURATION$4 = 
        new javax.xml.namespace.QName("", "CycleCountPlannedDuration");
    private static final javax.xml.namespace.QName PRODUCTIONCATEGORYID$6 = 
        new javax.xml.namespace.QName("", "ProductionCategoryID");
    private static final javax.xml.namespace.QName STORAGECATEGORYID$8 = 
        new javax.xml.namespace.QName("", "StorageCategoryID");
    
    
    /**
     * Gets the "SiteID" element
     */
    public com.sap.xi.ap.common.gdt.LocationID getSiteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LocationID target = null;
            target = (com.sap.xi.ap.common.gdt.LocationID)get_store().find_element_user(SITEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SiteID" element
     */
    public boolean isSetSiteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITEID$0) != 0;
        }
    }
    
    /**
     * Sets the "SiteID" element
     */
    public void setSiteID(com.sap.xi.ap.common.gdt.LocationID siteID)
    {
        generatedSetterHelperImpl(siteID, SITEID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SiteID" element
     */
    public com.sap.xi.ap.common.gdt.LocationID addNewSiteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LocationID target = null;
            target = (com.sap.xi.ap.common.gdt.LocationID)get_store().add_element_user(SITEID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "SiteID" element
     */
    public void unsetSiteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITEID$0, 0);
        }
    }
    
    /**
     * Gets the "LifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum getLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIFECYCLESTATUSCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode xgetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "LifeCycleStatusCode" element
     */
    public boolean isSetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIFECYCLESTATUSCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "LifeCycleStatusCode" element
     */
    public void setLifeCycleStatusCode(com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum lifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIFECYCLESTATUSCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIFECYCLESTATUSCODE$2);
            }
            target.setEnumValue(lifeCycleStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "LifeCycleStatusCode" element
     */
    public void xsetLifeCycleStatusCode(com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode lifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().add_element_user(LIFECYCLESTATUSCODE$2);
            }
            target.set(lifeCycleStatusCode);
        }
    }
    
    /**
     * Unsets the "LifeCycleStatusCode" element
     */
    public void unsetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIFECYCLESTATUSCODE$2, 0);
        }
    }
    
    /**
     * Gets the "CycleCountPlannedDuration" element
     */
    public org.apache.xmlbeans.GDuration getCycleCountPlannedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CYCLECOUNTPLANNEDDURATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "CycleCountPlannedDuration" element
     */
    public com.sap.xi.ap.common.gdt.DAYDuration xgetCycleCountPlannedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(CYCLECOUNTPLANNEDDURATION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "CycleCountPlannedDuration" element
     */
    public boolean isSetCycleCountPlannedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CYCLECOUNTPLANNEDDURATION$4) != 0;
        }
    }
    
    /**
     * Sets the "CycleCountPlannedDuration" element
     */
    public void setCycleCountPlannedDuration(org.apache.xmlbeans.GDuration cycleCountPlannedDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CYCLECOUNTPLANNEDDURATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CYCLECOUNTPLANNEDDURATION$4);
            }
            target.setGDurationValue(cycleCountPlannedDuration);
        }
    }
    
    /**
     * Sets (as xml) the "CycleCountPlannedDuration" element
     */
    public void xsetCycleCountPlannedDuration(com.sap.xi.ap.common.gdt.DAYDuration cycleCountPlannedDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(CYCLECOUNTPLANNEDDURATION$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().add_element_user(CYCLECOUNTPLANNEDDURATION$4);
            }
            target.set(cycleCountPlannedDuration);
        }
    }
    
    /**
     * Unsets the "CycleCountPlannedDuration" element
     */
    public void unsetCycleCountPlannedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CYCLECOUNTPLANNEDDURATION$4, 0);
        }
    }
    
    /**
     * Gets the "ProductionCategoryID" element
     */
    public java.lang.String getProductionCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTIONCATEGORYID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductionCategoryID" element
     */
    public com.sap.xi.ap.common.gdt.ProductCategoryInternalID xgetProductionCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductCategoryInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductCategoryInternalID)get_store().find_element_user(PRODUCTIONCATEGORYID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProductionCategoryID" element
     */
    public boolean isSetProductionCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONCATEGORYID$6) != 0;
        }
    }
    
    /**
     * Sets the "ProductionCategoryID" element
     */
    public void setProductionCategoryID(java.lang.String productionCategoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTIONCATEGORYID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTIONCATEGORYID$6);
            }
            target.setStringValue(productionCategoryID);
        }
    }
    
    /**
     * Sets (as xml) the "ProductionCategoryID" element
     */
    public void xsetProductionCategoryID(com.sap.xi.ap.common.gdt.ProductCategoryInternalID productionCategoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductCategoryInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductCategoryInternalID)get_store().find_element_user(PRODUCTIONCATEGORYID$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProductCategoryInternalID)get_store().add_element_user(PRODUCTIONCATEGORYID$6);
            }
            target.set(productionCategoryID);
        }
    }
    
    /**
     * Unsets the "ProductionCategoryID" element
     */
    public void unsetProductionCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONCATEGORYID$6, 0);
        }
    }
    
    /**
     * Gets the "StorageCategoryID" element
     */
    public java.lang.String getStorageCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STORAGECATEGORYID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StorageCategoryID" element
     */
    public com.sap.xi.ap.common.gdt.ProductCategoryInternalID xgetStorageCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductCategoryInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductCategoryInternalID)get_store().find_element_user(STORAGECATEGORYID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "StorageCategoryID" element
     */
    public boolean isSetStorageCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STORAGECATEGORYID$8) != 0;
        }
    }
    
    /**
     * Sets the "StorageCategoryID" element
     */
    public void setStorageCategoryID(java.lang.String storageCategoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STORAGECATEGORYID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STORAGECATEGORYID$8);
            }
            target.setStringValue(storageCategoryID);
        }
    }
    
    /**
     * Sets (as xml) the "StorageCategoryID" element
     */
    public void xsetStorageCategoryID(com.sap.xi.ap.common.gdt.ProductCategoryInternalID storageCategoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductCategoryInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductCategoryInternalID)get_store().find_element_user(STORAGECATEGORYID$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProductCategoryInternalID)get_store().add_element_user(STORAGECATEGORYID$8);
            }
            target.set(storageCategoryID);
        }
    }
    
    /**
     * Unsets the "StorageCategoryID" element
     */
    public void unsetStorageCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STORAGECATEGORYID$8, 0);
        }
    }
}
