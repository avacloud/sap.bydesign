/*
 * XML Type:  SiteLogisticsLotSerialNumberAssignment
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsLotSerialNumberAssignment
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML SiteLogisticsLotSerialNumberAssignment(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class SiteLogisticsLotSerialNumberAssignmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.SiteLogisticsLotSerialNumberAssignment
{
    private static final long serialVersionUID = 1L;
    
    public SiteLogisticsLotSerialNumberAssignmentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERIALID$0 = 
        new javax.xml.namespace.QName("", "SerialID");
    private static final javax.xml.namespace.QName INDIVIDUALPRODUCTUUID$2 = 
        new javax.xml.namespace.QName("", "IndividualProductUUID");
    private static final javax.xml.namespace.QName STATUS$4 = 
        new javax.xml.namespace.QName("", "Status");
    
    
    /**
     * Gets the "SerialID" element
     */
    public java.lang.String getSerialID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SerialID" element
     */
    public com.sap.xi.ap.common.gdt.SerialID xgetSerialID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SerialID target = null;
            target = (com.sap.xi.ap.common.gdt.SerialID)get_store().find_element_user(SERIALID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SerialID" element
     */
    public boolean isSetSerialID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERIALID$0) != 0;
        }
    }
    
    /**
     * Sets the "SerialID" element
     */
    public void setSerialID(java.lang.String serialID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERIALID$0);
            }
            target.setStringValue(serialID);
        }
    }
    
    /**
     * Sets (as xml) the "SerialID" element
     */
    public void xsetSerialID(com.sap.xi.ap.common.gdt.SerialID serialID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SerialID target = null;
            target = (com.sap.xi.ap.common.gdt.SerialID)get_store().find_element_user(SERIALID$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.SerialID)get_store().add_element_user(SERIALID$0);
            }
            target.set(serialID);
        }
    }
    
    /**
     * Unsets the "SerialID" element
     */
    public void unsetSerialID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERIALID$0, 0);
        }
    }
    
    /**
     * Gets the "IndividualProductUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getIndividualProductUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(INDIVIDUALPRODUCTUUID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IndividualProductUUID" element
     */
    public boolean isSetIndividualProductUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDIVIDUALPRODUCTUUID$2) != 0;
        }
    }
    
    /**
     * Sets the "IndividualProductUUID" element
     */
    public void setIndividualProductUUID(com.sap.xi.ap.common.gdt.UUID individualProductUUID)
    {
        generatedSetterHelperImpl(individualProductUUID, INDIVIDUALPRODUCTUUID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IndividualProductUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewIndividualProductUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(INDIVIDUALPRODUCTUUID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "IndividualProductUUID" element
     */
    public void unsetIndividualProductUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDIVIDUALPRODUCTUUID$2, 0);
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public com.sap.xi.ap.common.gdt.Description getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Description target = null;
            target = (com.sap.xi.ap.common.gdt.Description)get_store().find_element_user(STATUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$4) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(com.sap.xi.ap.common.gdt.Description status)
    {
        generatedSetterHelperImpl(status, STATUS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Status" element
     */
    public com.sap.xi.ap.common.gdt.Description addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Description target = null;
            target = (com.sap.xi.ap.common.gdt.Description)get_store().add_element_user(STATUS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$4, 0);
        }
    }
}
