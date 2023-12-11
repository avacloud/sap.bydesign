/*
 * XML Type:  ProductionLotServices
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotServices
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotServices(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotServicesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotServices
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotServicesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEUUID$0 = 
        new javax.xml.namespace.QName("", "ServiceUUID");
    private static final javax.xml.namespace.QName SERVICEID$2 = 
        new javax.xml.namespace.QName("", "ServiceID");
    private static final javax.xml.namespace.QName SERVICEDESCRIPTION$4 = 
        new javax.xml.namespace.QName("", "ServiceDescription");
    private static final javax.xml.namespace.QName RESOURCEID$6 = 
        new javax.xml.namespace.QName("", "ResourceID");
    private static final javax.xml.namespace.QName RESOURCEDESCRIPTION$8 = 
        new javax.xml.namespace.QName("", "ResourceDescription");
    private static final javax.xml.namespace.QName MAINRESOURCE$10 = 
        new javax.xml.namespace.QName("", "MainResource");
    private static final javax.xml.namespace.QName TOTALCONFIRMEDQUANTITY$12 = 
        new javax.xml.namespace.QName("", "TotalConfirmedQuantity");
    private static final javax.xml.namespace.QName CONFIRMEDQUANTITY$14 = 
        new javax.xml.namespace.QName("", "ConfirmedQuantity");
    private static final javax.xml.namespace.QName CONFIRMATIONFINISHED$16 = 
        new javax.xml.namespace.QName("", "ConfirmationFinished");
    private static final javax.xml.namespace.QName SERVICECONSUMPTIONCALCULATIONMETHODCODE$18 = 
        new javax.xml.namespace.QName("", "ServiceConsumptionCalculationMethodCode");
    
    
    /**
     * Gets the "ServiceUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getServiceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(SERVICEUUID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ServiceUUID" element
     */
    public boolean isSetServiceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEUUID$0) != 0;
        }
    }
    
    /**
     * Sets the "ServiceUUID" element
     */
    public void setServiceUUID(com.sap.xi.ap.common.gdt.UUID serviceUUID)
    {
        generatedSetterHelperImpl(serviceUUID, SERVICEUUID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ServiceUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewServiceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(SERVICEUUID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ServiceUUID" element
     */
    public void unsetServiceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEUUID$0, 0);
        }
    }
    
    /**
     * Gets the "ServiceID" element
     */
    public com.sap.xi.ap.common.gdt.ProductID getServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().find_element_user(SERVICEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ServiceID" element
     */
    public boolean isSetServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEID$2) != 0;
        }
    }
    
    /**
     * Sets the "ServiceID" element
     */
    public void setServiceID(com.sap.xi.ap.common.gdt.ProductID serviceID)
    {
        generatedSetterHelperImpl(serviceID, SERVICEID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ServiceID" element
     */
    public com.sap.xi.ap.common.gdt.ProductID addNewServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().add_element_user(SERVICEID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ServiceID" element
     */
    public void unsetServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEID$2, 0);
        }
    }
    
    /**
     * Gets the "ServiceDescription" element
     */
    public java.lang.String getServiceDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEDESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ServiceDescription" element
     */
    public com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription xgetServiceDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription)get_store().find_element_user(SERVICEDESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ServiceDescription" element
     */
    public boolean isSetServiceDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEDESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "ServiceDescription" element
     */
    public void setServiceDescription(java.lang.String serviceDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICEDESCRIPTION$4);
            }
            target.setStringValue(serviceDescription);
        }
    }
    
    /**
     * Sets (as xml) the "ServiceDescription" element
     */
    public void xsetServiceDescription(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription serviceDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription)get_store().find_element_user(SERVICEDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription)get_store().add_element_user(SERVICEDESCRIPTION$4);
            }
            target.set(serviceDescription);
        }
    }
    
    /**
     * Unsets the "ServiceDescription" element
     */
    public void unsetServiceDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEDESCRIPTION$4, 0);
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
            target = (com.sap.xi.ap.common.gdt.ResourceID)get_store().find_element_user(RESOURCEID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ResourceID" element
     */
    public boolean isSetResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEID$6) != 0;
        }
    }
    
    /**
     * Sets the "ResourceID" element
     */
    public void setResourceID(com.sap.xi.ap.common.gdt.ResourceID resourceID)
    {
        generatedSetterHelperImpl(resourceID, RESOURCEID$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.ResourceID)get_store().add_element_user(RESOURCEID$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ResourceID" element
     */
    public void unsetResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEID$6, 0);
        }
    }
    
    /**
     * Gets array of all "ResourceDescription" elements
     */
    public com.sap.xi.a1s.global.ServiceResourceDescription[] getResourceDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEDESCRIPTION$8, targetList);
            com.sap.xi.a1s.global.ServiceResourceDescription[] result = new com.sap.xi.a1s.global.ServiceResourceDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ResourceDescription" element
     */
    public com.sap.xi.a1s.global.ServiceResourceDescription getResourceDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ServiceResourceDescription target = null;
            target = (com.sap.xi.a1s.global.ServiceResourceDescription)get_store().find_element_user(RESOURCEDESCRIPTION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ResourceDescription" element
     */
    public int sizeOfResourceDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEDESCRIPTION$8);
        }
    }
    
    /**
     * Sets array of all "ResourceDescription" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResourceDescriptionArray(com.sap.xi.a1s.global.ServiceResourceDescription[] resourceDescriptionArray)
    {
        check_orphaned();
        arraySetterHelper(resourceDescriptionArray, RESOURCEDESCRIPTION$8);
    }
    
    /**
     * Sets ith "ResourceDescription" element
     */
    public void setResourceDescriptionArray(int i, com.sap.xi.a1s.global.ServiceResourceDescription resourceDescription)
    {
        generatedSetterHelperImpl(resourceDescription, RESOURCEDESCRIPTION$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ResourceDescription" element
     */
    public com.sap.xi.a1s.global.ServiceResourceDescription insertNewResourceDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ServiceResourceDescription target = null;
            target = (com.sap.xi.a1s.global.ServiceResourceDescription)get_store().insert_element_user(RESOURCEDESCRIPTION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ResourceDescription" element
     */
    public com.sap.xi.a1s.global.ServiceResourceDescription addNewResourceDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ServiceResourceDescription target = null;
            target = (com.sap.xi.a1s.global.ServiceResourceDescription)get_store().add_element_user(RESOURCEDESCRIPTION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "ResourceDescription" element
     */
    public void removeResourceDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEDESCRIPTION$8, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAINRESOURCE$10, 0);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(MAINRESOURCE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "MainResource" element
     */
    public boolean isSetMainResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAINRESOURCE$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAINRESOURCE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAINRESOURCE$10);
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
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(MAINRESOURCE$10, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(MAINRESOURCE$10);
            }
            target.set(mainResource);
        }
    }
    
    /**
     * Unsets the "MainResource" element
     */
    public void unsetMainResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAINRESOURCE$10, 0);
        }
    }
    
    /**
     * Gets the "TotalConfirmedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getTotalConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(TOTALCONFIRMEDQUANTITY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TotalConfirmedQuantity" element
     */
    public boolean isSetTotalConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALCONFIRMEDQUANTITY$12) != 0;
        }
    }
    
    /**
     * Sets the "TotalConfirmedQuantity" element
     */
    public void setTotalConfirmedQuantity(com.sap.xi.ap.common.gdt.Quantity totalConfirmedQuantity)
    {
        generatedSetterHelperImpl(totalConfirmedQuantity, TOTALCONFIRMEDQUANTITY$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TotalConfirmedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewTotalConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(TOTALCONFIRMEDQUANTITY$12);
            return target;
        }
    }
    
    /**
     * Unsets the "TotalConfirmedQuantity" element
     */
    public void unsetTotalConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALCONFIRMEDQUANTITY$12, 0);
        }
    }
    
    /**
     * Gets the "ConfirmedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(CONFIRMEDQUANTITY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConfirmedQuantity" element
     */
    public boolean isSetConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMEDQUANTITY$14) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmedQuantity" element
     */
    public void setConfirmedQuantity(com.sap.xi.ap.common.gdt.Quantity confirmedQuantity)
    {
        generatedSetterHelperImpl(confirmedQuantity, CONFIRMEDQUANTITY$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ConfirmedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(CONFIRMEDQUANTITY$14);
            return target;
        }
    }
    
    /**
     * Unsets the "ConfirmedQuantity" element
     */
    public void unsetConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMEDQUANTITY$14, 0);
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
     * True if has "ConfirmationFinished" element
     */
    public boolean isSetConfirmationFinished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMATIONFINISHED$16) != 0;
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
     * Unsets the "ConfirmationFinished" element
     */
    public void unsetConfirmationFinished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMATIONFINISHED$16, 0);
        }
    }
    
    /**
     * Gets the "ServiceConsumptionCalculationMethodCode" element
     */
    public com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode getServiceConsumptionCalculationMethodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode target = null;
            target = (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode)get_store().find_element_user(SERVICECONSUMPTIONCALCULATIONMETHODCODE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ServiceConsumptionCalculationMethodCode" element
     */
    public boolean isSetServiceConsumptionCalculationMethodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICECONSUMPTIONCALCULATIONMETHODCODE$18) != 0;
        }
    }
    
    /**
     * Sets the "ServiceConsumptionCalculationMethodCode" element
     */
    public void setServiceConsumptionCalculationMethodCode(com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode serviceConsumptionCalculationMethodCode)
    {
        generatedSetterHelperImpl(serviceConsumptionCalculationMethodCode, SERVICECONSUMPTIONCALCULATIONMETHODCODE$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ServiceConsumptionCalculationMethodCode" element
     */
    public com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode addNewServiceConsumptionCalculationMethodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode target = null;
            target = (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode)get_store().add_element_user(SERVICECONSUMPTIONCALCULATIONMETHODCODE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "ServiceConsumptionCalculationMethodCode" element
     */
    public void unsetServiceConsumptionCalculationMethodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICECONSUMPTIONCALCULATIONMETHODCODE$18, 0);
        }
    }
}
