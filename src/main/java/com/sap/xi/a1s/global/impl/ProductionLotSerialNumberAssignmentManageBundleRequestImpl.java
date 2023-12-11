/*
 * XML Type:  ProductionLotSerialNumberAssignmentManageBundle_Request
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentManageBundleRequest
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotSerialNumberAssignmentManageBundle_Request(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotSerialNumberAssignmentManageBundleRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentManageBundleRequest
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotSerialNumberAssignmentManageBundleRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERIALID$0 = 
        new javax.xml.namespace.QName("", "SerialID");
    
    
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
}
