/*
 * XML Type:  SiteLogisticsTaskReferncedCustomerParty
 * Namespace: http://sap.com/xi/AP/LogisticsExecution/Global
 * Java type: com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.logisticsexecution.global.impl;
/**
 * An XML SiteLogisticsTaskReferncedCustomerParty(@http://sap.com/xi/AP/LogisticsExecution/Global).
 *
 * This is a complex type.
 */
public class SiteLogisticsTaskReferncedCustomerPartyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty
{
    private static final long serialVersionUID = 1L;
    
    public SiteLogisticsTaskReferncedCustomerPartyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMERPARTYKEY$0 = 
        new javax.xml.namespace.QName("", "CustomerPartyKey");
    private static final javax.xml.namespace.QName CUSTOMERPARTYNAME$2 = 
        new javax.xml.namespace.QName("", "CustomerPartyName");
    
    
    /**
     * Gets the "CustomerPartyKey" element
     */
    public com.sap.xi.ap.common.global.PartyKey getCustomerPartyKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.PartyKey target = null;
            target = (com.sap.xi.ap.common.global.PartyKey)get_store().find_element_user(CUSTOMERPARTYKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CustomerPartyKey" element
     */
    public boolean isSetCustomerPartyKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERPARTYKEY$0) != 0;
        }
    }
    
    /**
     * Sets the "CustomerPartyKey" element
     */
    public void setCustomerPartyKey(com.sap.xi.ap.common.global.PartyKey customerPartyKey)
    {
        generatedSetterHelperImpl(customerPartyKey, CUSTOMERPARTYKEY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CustomerPartyKey" element
     */
    public com.sap.xi.ap.common.global.PartyKey addNewCustomerPartyKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.PartyKey target = null;
            target = (com.sap.xi.ap.common.global.PartyKey)get_store().add_element_user(CUSTOMERPARTYKEY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "CustomerPartyKey" element
     */
    public void unsetCustomerPartyKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERPARTYKEY$0, 0);
        }
    }
    
    /**
     * Gets the "CustomerPartyName" element
     */
    public com.sap.xi.ap.common.gdt.LONGName getCustomerPartyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LONGName)get_store().find_element_user(CUSTOMERPARTYNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CustomerPartyName" element
     */
    public boolean isSetCustomerPartyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERPARTYNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "CustomerPartyName" element
     */
    public void setCustomerPartyName(com.sap.xi.ap.common.gdt.LONGName customerPartyName)
    {
        generatedSetterHelperImpl(customerPartyName, CUSTOMERPARTYNAME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CustomerPartyName" element
     */
    public com.sap.xi.ap.common.gdt.LONGName addNewCustomerPartyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LONGName)get_store().add_element_user(CUSTOMERPARTYNAME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "CustomerPartyName" element
     */
    public void unsetCustomerPartyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERPARTYNAME$2, 0);
        }
    }
}
