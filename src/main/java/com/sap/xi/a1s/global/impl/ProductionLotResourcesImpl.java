/*
 * XML Type:  ProductionLotResources
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotResources
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotResources(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotResourcesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotResources
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotResourcesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEGROUPID$0 = 
        new javax.xml.namespace.QName("", "ResourceGroupID");
    private static final javax.xml.namespace.QName RESOURCEGROUPDESCRIPTION$2 = 
        new javax.xml.namespace.QName("", "ResourceGroupDescription");
    private static final javax.xml.namespace.QName RESOURCEID$4 = 
        new javax.xml.namespace.QName("", "ResourceID");
    private static final javax.xml.namespace.QName RESOURCETYPE$6 = 
        new javax.xml.namespace.QName("", "ResourceType");
    private static final javax.xml.namespace.QName MAINRESOURCE$8 = 
        new javax.xml.namespace.QName("", "MainResource");
    private static final javax.xml.namespace.QName NUMBEROFRESOURCES$10 = 
        new javax.xml.namespace.QName("", "NumberOfResources");
    private static final javax.xml.namespace.QName TOTALCONFIRMEDCAPACITYCONSUMPTION$12 = 
        new javax.xml.namespace.QName("", "TotalConfirmedCapacityConsumption");
    private static final javax.xml.namespace.QName CONFIRMEDDURATION$14 = 
        new javax.xml.namespace.QName("", "ConfirmedDuration");
    private static final javax.xml.namespace.QName CONFIRMATIONFINISHED$16 = 
        new javax.xml.namespace.QName("", "ConfirmationFinished");
    private static final javax.xml.namespace.QName RESOURCEUTILISATIONUUID$18 = 
        new javax.xml.namespace.QName("", "ResourceUtilisationUUID");
    
    
    /**
     * Gets the "ResourceGroupID" element
     */
    public com.sap.xi.ap.common.gdt.ResourceID getResourceGroupID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ResourceID target = null;
            target = (com.sap.xi.ap.common.gdt.ResourceID)get_store().find_element_user(RESOURCEGROUPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ResourceGroupID" element
     */
    public boolean isSetResourceGroupID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEGROUPID$0) != 0;
        }
    }
    
    /**
     * Sets the "ResourceGroupID" element
     */
    public void setResourceGroupID(com.sap.xi.ap.common.gdt.ResourceID resourceGroupID)
    {
        generatedSetterHelperImpl(resourceGroupID, RESOURCEGROUPID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ResourceGroupID" element
     */
    public com.sap.xi.ap.common.gdt.ResourceID addNewResourceGroupID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ResourceID target = null;
            target = (com.sap.xi.ap.common.gdt.ResourceID)get_store().add_element_user(RESOURCEGROUPID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ResourceGroupID" element
     */
    public void unsetResourceGroupID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEGROUPID$0, 0);
        }
    }
    
    /**
     * Gets array of all "ResourceGroupDescription" elements
     */
    public com.sap.xi.a1s.global.ActivityResourceGroupDescription[] getResourceGroupDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEGROUPDESCRIPTION$2, targetList);
            com.sap.xi.a1s.global.ActivityResourceGroupDescription[] result = new com.sap.xi.a1s.global.ActivityResourceGroupDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ResourceGroupDescription" element
     */
    public com.sap.xi.a1s.global.ActivityResourceGroupDescription getResourceGroupDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ActivityResourceGroupDescription target = null;
            target = (com.sap.xi.a1s.global.ActivityResourceGroupDescription)get_store().find_element_user(RESOURCEGROUPDESCRIPTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ResourceGroupDescription" element
     */
    public int sizeOfResourceGroupDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEGROUPDESCRIPTION$2);
        }
    }
    
    /**
     * Sets array of all "ResourceGroupDescription" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResourceGroupDescriptionArray(com.sap.xi.a1s.global.ActivityResourceGroupDescription[] resourceGroupDescriptionArray)
    {
        check_orphaned();
        arraySetterHelper(resourceGroupDescriptionArray, RESOURCEGROUPDESCRIPTION$2);
    }
    
    /**
     * Sets ith "ResourceGroupDescription" element
     */
    public void setResourceGroupDescriptionArray(int i, com.sap.xi.a1s.global.ActivityResourceGroupDescription resourceGroupDescription)
    {
        generatedSetterHelperImpl(resourceGroupDescription, RESOURCEGROUPDESCRIPTION$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ResourceGroupDescription" element
     */
    public com.sap.xi.a1s.global.ActivityResourceGroupDescription insertNewResourceGroupDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ActivityResourceGroupDescription target = null;
            target = (com.sap.xi.a1s.global.ActivityResourceGroupDescription)get_store().insert_element_user(RESOURCEGROUPDESCRIPTION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ResourceGroupDescription" element
     */
    public com.sap.xi.a1s.global.ActivityResourceGroupDescription addNewResourceGroupDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ActivityResourceGroupDescription target = null;
            target = (com.sap.xi.a1s.global.ActivityResourceGroupDescription)get_store().add_element_user(RESOURCEGROUPDESCRIPTION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ResourceGroupDescription" element
     */
    public void removeResourceGroupDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEGROUPDESCRIPTION$2, i);
        }
    }
    
    /**
     * Gets the "ResourceID" element
     */
    public com.sap.xi.ap.common.gdt.ResourceID getResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ResourceID target = null;
            target = (com.sap.xi.ap.common.gdt.ResourceID)get_store().find_element_user(RESOURCEID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResourceID" element
     */
    public void setResourceID(com.sap.xi.ap.common.gdt.ResourceID resourceID)
    {
        generatedSetterHelperImpl(resourceID, RESOURCEID$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ResourceID" element
     */
    public com.sap.xi.ap.common.gdt.ResourceID addNewResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ResourceID target = null;
            target = (com.sap.xi.ap.common.gdt.ResourceID)get_store().add_element_user(RESOURCEID$4);
            return target;
        }
    }
    
    /**
     * Gets the "ResourceType" element
     */
    public java.lang.String getResourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCETYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResourceType" element
     */
    public com.sap.xi.ap.common.gdt.ResourceCategoryCode xgetResourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ResourceCategoryCode target = null;
            target = (com.sap.xi.ap.common.gdt.ResourceCategoryCode)get_store().find_element_user(RESOURCETYPE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ResourceType" element
     */
    public void setResourceType(java.lang.String resourceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCETYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCETYPE$6);
            }
            target.setStringValue(resourceType);
        }
    }
    
    /**
     * Sets (as xml) the "ResourceType" element
     */
    public void xsetResourceType(com.sap.xi.ap.common.gdt.ResourceCategoryCode resourceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ResourceCategoryCode target = null;
            target = (com.sap.xi.ap.common.gdt.ResourceCategoryCode)get_store().find_element_user(RESOURCETYPE$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ResourceCategoryCode)get_store().add_element_user(RESOURCETYPE$6);
            }
            target.set(resourceType);
        }
    }
    
    /**
     * Gets the "MainResource" element
     */
    public boolean getMainResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAINRESOURCE$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "MainResource" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetMainResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(MAINRESOURCE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MainResource" element
     */
    public void setMainResource(boolean mainResource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAINRESOURCE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAINRESOURCE$8);
            }
            target.setBooleanValue(mainResource);
        }
    }
    
    /**
     * Sets (as xml) the "MainResource" element
     */
    public void xsetMainResource(com.sap.xi.ap.common.gdt.Indicator mainResource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(MAINRESOURCE$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(MAINRESOURCE$8);
            }
            target.set(mainResource);
        }
    }
    
    /**
     * Gets the "NumberOfResources" element
     */
    public int getNumberOfResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFRESOURCES$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfResources" element
     */
    public com.sap.xi.ap.common.gdt.NumberValue xgetNumberOfResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NumberValue target = null;
            target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().find_element_user(NUMBEROFRESOURCES$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumberOfResources" element
     */
    public void setNumberOfResources(int numberOfResources)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFRESOURCES$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFRESOURCES$10);
            }
            target.setIntValue(numberOfResources);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfResources" element
     */
    public void xsetNumberOfResources(com.sap.xi.ap.common.gdt.NumberValue numberOfResources)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NumberValue target = null;
            target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().find_element_user(NUMBEROFRESOURCES$10, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().add_element_user(NUMBEROFRESOURCES$10);
            }
            target.set(numberOfResources);
        }
    }
    
    /**
     * Gets the "TotalConfirmedCapacityConsumption" element
     */
    public org.apache.xmlbeans.GDuration getTotalConfirmedCapacityConsumption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCONFIRMEDCAPACITYCONSUMPTION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalConfirmedCapacityConsumption" element
     */
    public com.sap.xi.ap.common.gdt.TIMEDuration xgetTotalConfirmedCapacityConsumption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(TOTALCONFIRMEDCAPACITYCONSUMPTION$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TotalConfirmedCapacityConsumption" element
     */
    public void setTotalConfirmedCapacityConsumption(org.apache.xmlbeans.GDuration totalConfirmedCapacityConsumption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCONFIRMEDCAPACITYCONSUMPTION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALCONFIRMEDCAPACITYCONSUMPTION$12);
            }
            target.setGDurationValue(totalConfirmedCapacityConsumption);
        }
    }
    
    /**
     * Sets (as xml) the "TotalConfirmedCapacityConsumption" element
     */
    public void xsetTotalConfirmedCapacityConsumption(com.sap.xi.ap.common.gdt.TIMEDuration totalConfirmedCapacityConsumption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(TOTALCONFIRMEDCAPACITYCONSUMPTION$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().add_element_user(TOTALCONFIRMEDCAPACITYCONSUMPTION$12);
            }
            target.set(totalConfirmedCapacityConsumption);
        }
    }
    
    /**
     * Gets the "ConfirmedDuration" element
     */
    public org.apache.xmlbeans.GDuration getConfirmedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMEDDURATION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConfirmedDuration" element
     */
    public com.sap.xi.ap.common.gdt.TIMEDuration xgetConfirmedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(CONFIRMEDDURATION$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ConfirmedDuration" element
     */
    public void setConfirmedDuration(org.apache.xmlbeans.GDuration confirmedDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMEDDURATION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIRMEDDURATION$14);
            }
            target.setGDurationValue(confirmedDuration);
        }
    }
    
    /**
     * Sets (as xml) the "ConfirmedDuration" element
     */
    public void xsetConfirmedDuration(com.sap.xi.ap.common.gdt.TIMEDuration confirmedDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(CONFIRMEDDURATION$14, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().add_element_user(CONFIRMEDDURATION$14);
            }
            target.set(confirmedDuration);
        }
    }
    
    /**
     * Gets the "ConfirmationFinished" element
     */
    public boolean getConfirmationFinished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONFINISHED$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConfirmationFinished" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetConfirmationFinished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CONFIRMATIONFINISHED$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ConfirmationFinished" element
     */
    public void setConfirmationFinished(boolean confirmationFinished)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONFINISHED$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIRMATIONFINISHED$16);
            }
            target.setBooleanValue(confirmationFinished);
        }
    }
    
    /**
     * Sets (as xml) the "ConfirmationFinished" element
     */
    public void xsetConfirmationFinished(com.sap.xi.ap.common.gdt.Indicator confirmationFinished)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CONFIRMATIONFINISHED$16, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(CONFIRMATIONFINISHED$16);
            }
            target.set(confirmationFinished);
        }
    }
    
    /**
     * Gets the "ResourceUtilisationUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getResourceUtilisationUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(RESOURCEUTILISATIONUUID$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResourceUtilisationUUID" element
     */
    public void setResourceUtilisationUUID(com.sap.xi.ap.common.gdt.UUID resourceUtilisationUUID)
    {
        generatedSetterHelperImpl(resourceUtilisationUUID, RESOURCEUTILISATIONUUID$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ResourceUtilisationUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewResourceUtilisationUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(RESOURCEUTILISATIONUUID$18);
            return target;
        }
    }
}
