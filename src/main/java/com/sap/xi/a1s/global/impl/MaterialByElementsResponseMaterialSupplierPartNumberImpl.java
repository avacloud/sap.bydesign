/*
 * XML Type:  MaterialByElementsResponseMaterialSupplierPartNumber
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplierPartNumber
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterialSupplierPartNumber(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialSupplierPartNumberImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplierPartNumber
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialSupplierPartNumberImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPLIERINTERNALID$0 = 
        new javax.xml.namespace.QName("", "SupplierInternalID");
    private static final javax.xml.namespace.QName PRODUCTSUPPLIERID$2 = 
        new javax.xml.namespace.QName("", "ProductSupplierID");
    private static final javax.xml.namespace.QName SUPPLIERLEADTIMEDURATION$4 = 
        new javax.xml.namespace.QName("", "SupplierLeadTimeDuration");
    
    
    /**
     * Gets the "SupplierInternalID" element
     */
    public java.lang.String getSupplierInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLIERINTERNALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SupplierInternalID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessPartnerInternalID xgetSupplierInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessPartnerInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessPartnerInternalID)get_store().find_element_user(SUPPLIERINTERNALID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SupplierInternalID" element
     */
    public boolean isSetSupplierInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLIERINTERNALID$0) != 0;
        }
    }
    
    /**
     * Sets the "SupplierInternalID" element
     */
    public void setSupplierInternalID(java.lang.String supplierInternalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLIERINTERNALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPLIERINTERNALID$0);
            }
            target.setStringValue(supplierInternalID);
        }
    }
    
    /**
     * Sets (as xml) the "SupplierInternalID" element
     */
    public void xsetSupplierInternalID(com.sap.xi.ap.common.gdt.BusinessPartnerInternalID supplierInternalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessPartnerInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessPartnerInternalID)get_store().find_element_user(SUPPLIERINTERNALID$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.BusinessPartnerInternalID)get_store().add_element_user(SUPPLIERINTERNALID$0);
            }
            target.set(supplierInternalID);
        }
    }
    
    /**
     * Unsets the "SupplierInternalID" element
     */
    public void unsetSupplierInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLIERINTERNALID$0, 0);
        }
    }
    
    /**
     * Gets the "ProductSupplierID" element
     */
    public java.lang.String getProductSupplierID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSUPPLIERID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductSupplierID" element
     */
    public com.sap.xi.ap.common.gdt.ProductPartyID xgetProductSupplierID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductPartyID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductPartyID)get_store().find_element_user(PRODUCTSUPPLIERID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProductSupplierID" element
     */
    public boolean isSetProductSupplierID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTSUPPLIERID$2) != 0;
        }
    }
    
    /**
     * Sets the "ProductSupplierID" element
     */
    public void setProductSupplierID(java.lang.String productSupplierID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSUPPLIERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTSUPPLIERID$2);
            }
            target.setStringValue(productSupplierID);
        }
    }
    
    /**
     * Sets (as xml) the "ProductSupplierID" element
     */
    public void xsetProductSupplierID(com.sap.xi.ap.common.gdt.ProductPartyID productSupplierID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductPartyID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductPartyID)get_store().find_element_user(PRODUCTSUPPLIERID$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProductPartyID)get_store().add_element_user(PRODUCTSUPPLIERID$2);
            }
            target.set(productSupplierID);
        }
    }
    
    /**
     * Unsets the "ProductSupplierID" element
     */
    public void unsetProductSupplierID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTSUPPLIERID$2, 0);
        }
    }
    
    /**
     * Gets the "SupplierLeadTimeDuration" element
     */
    public org.apache.xmlbeans.GDuration getSupplierLeadTimeDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLIERLEADTIMEDURATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "SupplierLeadTimeDuration" element
     */
    public com.sap.xi.ap.common.gdt.DAYDuration xgetSupplierLeadTimeDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(SUPPLIERLEADTIMEDURATION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "SupplierLeadTimeDuration" element
     */
    public boolean isSetSupplierLeadTimeDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLIERLEADTIMEDURATION$4) != 0;
        }
    }
    
    /**
     * Sets the "SupplierLeadTimeDuration" element
     */
    public void setSupplierLeadTimeDuration(org.apache.xmlbeans.GDuration supplierLeadTimeDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLIERLEADTIMEDURATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPLIERLEADTIMEDURATION$4);
            }
            target.setGDurationValue(supplierLeadTimeDuration);
        }
    }
    
    /**
     * Sets (as xml) the "SupplierLeadTimeDuration" element
     */
    public void xsetSupplierLeadTimeDuration(com.sap.xi.ap.common.gdt.DAYDuration supplierLeadTimeDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DAYDuration target = null;
            target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().find_element_user(SUPPLIERLEADTIMEDURATION$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DAYDuration)get_store().add_element_user(SUPPLIERLEADTIMEDURATION$4);
            }
            target.set(supplierLeadTimeDuration);
        }
    }
    
    /**
     * Unsets the "SupplierLeadTimeDuration" element
     */
    public void unsetSupplierLeadTimeDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLIERLEADTIMEDURATION$4, 0);
        }
    }
}
