/*
 * XML Type:  IdentifiedStockDescription
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.IdentifiedStockDescription
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML IdentifiedStockDescription(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class IdentifiedStockDescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.IdentifiedStockDescription
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiedStockDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKDESCRIPTION$0 = 
        new javax.xml.namespace.QName("", "IdentifiedStockDescription");
    
    
    /**
     * Gets the "IdentifiedStockDescription" element
     */
    public com.sap.xi.ap.common.gdt.MEDIUMDescription getIdentifiedStockDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MEDIUMDescription target = null;
            target = (com.sap.xi.ap.common.gdt.MEDIUMDescription)get_store().find_element_user(IDENTIFIEDSTOCKDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IdentifiedStockDescription" element
     */
    public boolean isSetIdentifiedStockDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIEDSTOCKDESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "IdentifiedStockDescription" element
     */
    public void setIdentifiedStockDescription(com.sap.xi.ap.common.gdt.MEDIUMDescription identifiedStockDescription)
    {
        generatedSetterHelperImpl(identifiedStockDescription, IDENTIFIEDSTOCKDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdentifiedStockDescription" element
     */
    public com.sap.xi.ap.common.gdt.MEDIUMDescription addNewIdentifiedStockDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MEDIUMDescription target = null;
            target = (com.sap.xi.ap.common.gdt.MEDIUMDescription)get_store().add_element_user(IDENTIFIEDSTOCKDESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "IdentifiedStockDescription" element
     */
    public void unsetIdentifiedStockDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIEDSTOCKDESCRIPTION$0, 0);
        }
    }
}
