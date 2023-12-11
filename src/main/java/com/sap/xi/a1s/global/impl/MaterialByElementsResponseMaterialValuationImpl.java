/*
 * XML Type:  MaterialByElementsResponseMaterialValuation
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialValuation
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterialValuation(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialValuationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialValuation
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialValuationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIFECYCLESTATUSCODE$0 = 
        new javax.xml.namespace.QName("", "LifeCycleStatusCode");
    private static final javax.xml.namespace.QName COMPANYID$2 = 
        new javax.xml.namespace.QName("", "CompanyID");
    private static final javax.xml.namespace.QName BUSINESSRESIDENCEID$4 = 
        new javax.xml.namespace.QName("", "BusinessResidenceID");
    
    
    /**
     * Gets the "LifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum getLifeCycleStatusCode()
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
            target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$0, 0);
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
            return get_store().count_elements(LIFECYCLESTATUSCODE$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIFECYCLESTATUSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIFECYCLESTATUSCODE$0);
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
            target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().add_element_user(LIFECYCLESTATUSCODE$0);
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
            get_store().remove_element(LIFECYCLESTATUSCODE$0, 0);
        }
    }
    
    /**
     * Gets the "CompanyID" element
     */
    public java.lang.String getCompanyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CompanyID" element
     */
    public com.sap.xi.ap.common.gdt.OrganisationalCentreID xgetCompanyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OrganisationalCentreID target = null;
            target = (com.sap.xi.ap.common.gdt.OrganisationalCentreID)get_store().find_element_user(COMPANYID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CompanyID" element
     */
    public boolean isSetCompanyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPANYID$2) != 0;
        }
    }
    
    /**
     * Sets the "CompanyID" element
     */
    public void setCompanyID(java.lang.String companyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANYID$2);
            }
            target.setStringValue(companyID);
        }
    }
    
    /**
     * Sets (as xml) the "CompanyID" element
     */
    public void xsetCompanyID(com.sap.xi.ap.common.gdt.OrganisationalCentreID companyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OrganisationalCentreID target = null;
            target = (com.sap.xi.ap.common.gdt.OrganisationalCentreID)get_store().find_element_user(COMPANYID$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.OrganisationalCentreID)get_store().add_element_user(COMPANYID$2);
            }
            target.set(companyID);
        }
    }
    
    /**
     * Unsets the "CompanyID" element
     */
    public void unsetCompanyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPANYID$2, 0);
        }
    }
    
    /**
     * Gets the "BusinessResidenceID" element
     */
    public java.lang.String getBusinessResidenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSRESIDENCEID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BusinessResidenceID" element
     */
    public com.sap.xi.ap.common.gdt.OrganisationalCentreID xgetBusinessResidenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OrganisationalCentreID target = null;
            target = (com.sap.xi.ap.common.gdt.OrganisationalCentreID)get_store().find_element_user(BUSINESSRESIDENCEID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "BusinessResidenceID" element
     */
    public boolean isSetBusinessResidenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSRESIDENCEID$4) != 0;
        }
    }
    
    /**
     * Sets the "BusinessResidenceID" element
     */
    public void setBusinessResidenceID(java.lang.String businessResidenceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSRESIDENCEID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSRESIDENCEID$4);
            }
            target.setStringValue(businessResidenceID);
        }
    }
    
    /**
     * Sets (as xml) the "BusinessResidenceID" element
     */
    public void xsetBusinessResidenceID(com.sap.xi.ap.common.gdt.OrganisationalCentreID businessResidenceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OrganisationalCentreID target = null;
            target = (com.sap.xi.ap.common.gdt.OrganisationalCentreID)get_store().find_element_user(BUSINESSRESIDENCEID$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.OrganisationalCentreID)get_store().add_element_user(BUSINESSRESIDENCEID$4);
            }
            target.set(businessResidenceID);
        }
    }
    
    /**
     * Unsets the "BusinessResidenceID" element
     */
    public void unsetBusinessResidenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSRESIDENCEID$4, 0);
        }
    }
}
