/*
 * XML Type:  RequirementSpecificationKey
 * Namespace: http://sap.com/xi/AP/Common/Global
 * Java type: com.sap.xi.ap.common.global.RequirementSpecificationKey
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.global.impl;
/**
 * An XML RequirementSpecificationKey(@http://sap.com/xi/AP/Common/Global).
 *
 * This is a complex type.
 */
public class RequirementSpecificationKeyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.common.global.RequirementSpecificationKey
{
    private static final long serialVersionUID = 1L;
    
    public RequirementSpecificationKeyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUIREMENTSPECIFICATIONID$0 = 
        new javax.xml.namespace.QName("", "RequirementSpecificationID");
    private static final javax.xml.namespace.QName REQUIREMENTSPECIFICATIONVERSIONID$2 = 
        new javax.xml.namespace.QName("", "RequirementSpecificationVersionID");
    
    
    /**
     * Gets the "RequirementSpecificationID" element
     */
    public com.sap.xi.ap.common.gdt.RequirementSpecificationID getRequirementSpecificationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.RequirementSpecificationID target = null;
            target = (com.sap.xi.ap.common.gdt.RequirementSpecificationID)get_store().find_element_user(REQUIREMENTSPECIFICATIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RequirementSpecificationID" element
     */
    public void setRequirementSpecificationID(com.sap.xi.ap.common.gdt.RequirementSpecificationID requirementSpecificationID)
    {
        generatedSetterHelperImpl(requirementSpecificationID, REQUIREMENTSPECIFICATIONID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RequirementSpecificationID" element
     */
    public com.sap.xi.ap.common.gdt.RequirementSpecificationID addNewRequirementSpecificationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.RequirementSpecificationID target = null;
            target = (com.sap.xi.ap.common.gdt.RequirementSpecificationID)get_store().add_element_user(REQUIREMENTSPECIFICATIONID$0);
            return target;
        }
    }
    
    /**
     * Gets the "RequirementSpecificationVersionID" element
     */
    public java.lang.String getRequirementSpecificationVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUIREMENTSPECIFICATIONVERSIONID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequirementSpecificationVersionID" element
     */
    public com.sap.xi.ap.common.gdt.VersionID xgetRequirementSpecificationVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.VersionID target = null;
            target = (com.sap.xi.ap.common.gdt.VersionID)get_store().find_element_user(REQUIREMENTSPECIFICATIONVERSIONID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "RequirementSpecificationVersionID" element
     */
    public boolean isSetRequirementSpecificationVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUIREMENTSPECIFICATIONVERSIONID$2) != 0;
        }
    }
    
    /**
     * Sets the "RequirementSpecificationVersionID" element
     */
    public void setRequirementSpecificationVersionID(java.lang.String requirementSpecificationVersionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUIREMENTSPECIFICATIONVERSIONID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUIREMENTSPECIFICATIONVERSIONID$2);
            }
            target.setStringValue(requirementSpecificationVersionID);
        }
    }
    
    /**
     * Sets (as xml) the "RequirementSpecificationVersionID" element
     */
    public void xsetRequirementSpecificationVersionID(com.sap.xi.ap.common.gdt.VersionID requirementSpecificationVersionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.VersionID target = null;
            target = (com.sap.xi.ap.common.gdt.VersionID)get_store().find_element_user(REQUIREMENTSPECIFICATIONVERSIONID$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.VersionID)get_store().add_element_user(REQUIREMENTSPECIFICATIONVERSIONID$2);
            }
            target.set(requirementSpecificationVersionID);
        }
    }
    
    /**
     * Unsets the "RequirementSpecificationVersionID" element
     */
    public void unsetRequirementSpecificationVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUIREMENTSPECIFICATIONVERSIONID$2, 0);
        }
    }
}
