/*
 * XML Type:  SiteLogisticsTaskReferencedObject
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsTaskReferencedObject
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML SiteLogisticsTaskReferencedObject(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class SiteLogisticsTaskReferencedObjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.SiteLogisticsTaskReferencedObject
{
    private static final long serialVersionUID = 1L;
    
    public SiteLogisticsTaskReferencedObjectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCEDOBJECTUUID$0 = 
        new javax.xml.namespace.QName("", "ReferencedObjectUUID");
    private static final javax.xml.namespace.QName SITELOGISTICSLOTOPERATIONACTIVITY$2 = 
        new javax.xml.namespace.QName("", "SiteLogisticsLotOperationActivity");
    
    
    /**
     * Gets the "ReferencedObjectUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getReferencedObjectUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(REFERENCEDOBJECTUUID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReferencedObjectUUID" element
     */
    public boolean isSetReferencedObjectUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEDOBJECTUUID$0) != 0;
        }
    }
    
    /**
     * Sets the "ReferencedObjectUUID" element
     */
    public void setReferencedObjectUUID(com.sap.xi.ap.common.gdt.UUID referencedObjectUUID)
    {
        generatedSetterHelperImpl(referencedObjectUUID, REFERENCEDOBJECTUUID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ReferencedObjectUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewReferencedObjectUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(REFERENCEDOBJECTUUID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ReferencedObjectUUID" element
     */
    public void unsetReferencedObjectUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEDOBJECTUUID$0, 0);
        }
    }
    
    /**
     * Gets the "SiteLogisticsLotOperationActivity" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity getSiteLogisticsLotOperationActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity)get_store().find_element_user(SITELOGISTICSLOTOPERATIONACTIVITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SiteLogisticsLotOperationActivity" element
     */
    public boolean isSetSiteLogisticsLotOperationActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITELOGISTICSLOTOPERATIONACTIVITY$2) != 0;
        }
    }
    
    /**
     * Sets the "SiteLogisticsLotOperationActivity" element
     */
    public void setSiteLogisticsLotOperationActivity(com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity siteLogisticsLotOperationActivity)
    {
        generatedSetterHelperImpl(siteLogisticsLotOperationActivity, SITELOGISTICSLOTOPERATIONACTIVITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SiteLogisticsLotOperationActivity" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity addNewSiteLogisticsLotOperationActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity)get_store().add_element_user(SITELOGISTICSLOTOPERATIONACTIVITY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "SiteLogisticsLotOperationActivity" element
     */
    public void unsetSiteLogisticsLotOperationActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITELOGISTICSLOTOPERATIONACTIVITY$2, 0);
        }
    }
}
