/*
 * XML Type:  MaterialByElementsQueryRequestedElements
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElements
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsQueryRequestedElements(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsQueryRequestedElementsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElements
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsQueryRequestedElementsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATERIAL$0 = 
        new javax.xml.namespace.QName("", "Material");
    private static final javax.xml.namespace.QName MATERIALTRANSMISSIONREQUESTCODE$2 = 
        new javax.xml.namespace.QName("", "materialTransmissionRequestCode");
    
    
    /**
     * Gets the "Material" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElementsMaterial getMaterial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElementsMaterial target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElementsMaterial)get_store().find_element_user(MATERIAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Material" element
     */
    public boolean isSetMaterial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATERIAL$0) != 0;
        }
    }
    
    /**
     * Sets the "Material" element
     */
    public void setMaterial(com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElementsMaterial material)
    {
        generatedSetterHelperImpl(material, MATERIAL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Material" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElementsMaterial addNewMaterial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElementsMaterial target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElementsMaterial)get_store().add_element_user(MATERIAL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Material" element
     */
    public void unsetMaterial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATERIAL$0, 0);
        }
    }
    
    /**
     * Gets the "materialTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum getMaterialTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MATERIALTRANSMISSIONREQUESTCODE$2);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "materialTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode xgetMaterialTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(MATERIALTRANSMISSIONREQUESTCODE$2);
            return target;
        }
    }
    
    /**
     * True if has "materialTransmissionRequestCode" attribute
     */
    public boolean isSetMaterialTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MATERIALTRANSMISSIONREQUESTCODE$2) != null;
        }
    }
    
    /**
     * Sets the "materialTransmissionRequestCode" attribute
     */
    public void setMaterialTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum materialTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MATERIALTRANSMISSIONREQUESTCODE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MATERIALTRANSMISSIONREQUESTCODE$2);
            }
            target.setEnumValue(materialTransmissionRequestCode);
        }
    }
    
    /**
     * Sets (as xml) the "materialTransmissionRequestCode" attribute
     */
    public void xsetMaterialTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode materialTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(MATERIALTRANSMISSIONREQUESTCODE$2);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().add_attribute_user(MATERIALTRANSMISSIONREQUESTCODE$2);
            }
            target.set(materialTransmissionRequestCode);
        }
    }
    
    /**
     * Unsets the "materialTransmissionRequestCode" attribute
     */
    public void unsetMaterialTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MATERIALTRANSMISSIONREQUESTCODE$2);
        }
    }
}
