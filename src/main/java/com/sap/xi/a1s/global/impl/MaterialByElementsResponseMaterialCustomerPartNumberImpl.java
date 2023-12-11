/*
 * XML Type:  MaterialByElementsResponseMaterialCustomerPartNumber
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialCustomerPartNumber
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterialCustomerPartNumber(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialCustomerPartNumberImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialCustomerPartNumber
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialCustomerPartNumberImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMERINTERNALID$0 = 
        new javax.xml.namespace.QName("", "CustomerInternalID");
    private static final javax.xml.namespace.QName PRODUCTCUSTOMERID$2 = 
        new javax.xml.namespace.QName("", "ProductCustomerID");
    
    
    /**
     * Gets the "CustomerInternalID" element
     */
    public java.lang.String getCustomerInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERINTERNALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomerInternalID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessPartnerInternalID xgetCustomerInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessPartnerInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessPartnerInternalID)get_store().find_element_user(CUSTOMERINTERNALID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "CustomerInternalID" element
     */
    public boolean isSetCustomerInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERINTERNALID$0) != 0;
        }
    }
    
    /**
     * Sets the "CustomerInternalID" element
     */
    public void setCustomerInternalID(java.lang.String customerInternalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERINTERNALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERINTERNALID$0);
            }
            target.setStringValue(customerInternalID);
        }
    }
    
    /**
     * Sets (as xml) the "CustomerInternalID" element
     */
    public void xsetCustomerInternalID(com.sap.xi.ap.common.gdt.BusinessPartnerInternalID customerInternalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessPartnerInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessPartnerInternalID)get_store().find_element_user(CUSTOMERINTERNALID$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.BusinessPartnerInternalID)get_store().add_element_user(CUSTOMERINTERNALID$0);
            }
            target.set(customerInternalID);
        }
    }
    
    /**
     * Unsets the "CustomerInternalID" element
     */
    public void unsetCustomerInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERINTERNALID$0, 0);
        }
    }
    
    /**
     * Gets the "ProductCustomerID" element
     */
    public java.lang.String getProductCustomerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCUSTOMERID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductCustomerID" element
     */
    public com.sap.xi.ap.common.gdt.ProductPartyID xgetProductCustomerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductPartyID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductPartyID)get_store().find_element_user(PRODUCTCUSTOMERID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProductCustomerID" element
     */
    public boolean isSetProductCustomerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCUSTOMERID$2) != 0;
        }
    }
    
    /**
     * Sets the "ProductCustomerID" element
     */
    public void setProductCustomerID(java.lang.String productCustomerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCUSTOMERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCUSTOMERID$2);
            }
            target.setStringValue(productCustomerID);
        }
    }
    
    /**
     * Sets (as xml) the "ProductCustomerID" element
     */
    public void xsetProductCustomerID(com.sap.xi.ap.common.gdt.ProductPartyID productCustomerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductPartyID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductPartyID)get_store().find_element_user(PRODUCTCUSTOMERID$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProductPartyID)get_store().add_element_user(PRODUCTCUSTOMERID$2);
            }
            target.set(productCustomerID);
        }
    }
    
    /**
     * Unsets the "ProductCustomerID" element
     */
    public void unsetProductCustomerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCUSTOMERID$2, 0);
        }
    }
}
