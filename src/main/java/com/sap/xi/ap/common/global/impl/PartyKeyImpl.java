/*
 * XML Type:  PartyKey
 * Namespace: http://sap.com/xi/AP/Common/Global
 * Java type: com.sap.xi.ap.common.global.PartyKey
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.global.impl;
/**
 * An XML PartyKey(@http://sap.com/xi/AP/Common/Global).
 *
 * This is a complex type.
 */
public class PartyKeyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.common.global.PartyKey
{
    private static final long serialVersionUID = 1L;
    
    public PartyKeyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTYTYPECODE$0 = 
        new javax.xml.namespace.QName("", "PartyTypeCode");
    private static final javax.xml.namespace.QName PARTYID$2 = 
        new javax.xml.namespace.QName("", "PartyID");
    
    
    /**
     * Gets the "PartyTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.BusinessObjectTypeCode getPartyTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessObjectTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessObjectTypeCode)get_store().find_element_user(PARTYTYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PartyTypeCode" element
     */
    public boolean isSetPartyTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTYTYPECODE$0) != 0;
        }
    }
    
    /**
     * Sets the "PartyTypeCode" element
     */
    public void setPartyTypeCode(com.sap.xi.ap.common.gdt.BusinessObjectTypeCode partyTypeCode)
    {
        generatedSetterHelperImpl(partyTypeCode, PARTYTYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PartyTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.BusinessObjectTypeCode addNewPartyTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessObjectTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessObjectTypeCode)get_store().add_element_user(PARTYTYPECODE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "PartyTypeCode" element
     */
    public void unsetPartyTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTYTYPECODE$0, 0);
        }
    }
    
    /**
     * Gets the "PartyID" element
     */
    public com.sap.xi.ap.common.gdt.PartyID getPartyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.PartyID target = null;
            target = (com.sap.xi.ap.common.gdt.PartyID)get_store().find_element_user(PARTYID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PartyID" element
     */
    public boolean isSetPartyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTYID$2) != 0;
        }
    }
    
    /**
     * Sets the "PartyID" element
     */
    public void setPartyID(com.sap.xi.ap.common.gdt.PartyID partyID)
    {
        generatedSetterHelperImpl(partyID, PARTYID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PartyID" element
     */
    public com.sap.xi.ap.common.gdt.PartyID addNewPartyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.PartyID target = null;
            target = (com.sap.xi.ap.common.gdt.PartyID)get_store().add_element_user(PARTYID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "PartyID" element
     */
    public void unsetPartyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTYID$2, 0);
        }
    }
}
