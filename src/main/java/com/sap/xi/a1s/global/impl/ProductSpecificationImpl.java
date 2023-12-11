/*
 * XML Type:  ProductSpecification
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductSpecification
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductSpecification(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductSpecificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductSpecification
{
    private static final long serialVersionUID = 1L;
    
    public ProductSpecificationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTSPECIFICATIONDESCRIPTION$0 = 
        new javax.xml.namespace.QName("", "ProductSpecificationDescription");
    
    
    /**
     * Gets the "ProductSpecificationDescription" element
     */
    public com.sap.xi.ap.common.gdt.MEDIUMDescription getProductSpecificationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MEDIUMDescription target = null;
            target = (com.sap.xi.ap.common.gdt.MEDIUMDescription)get_store().find_element_user(PRODUCTSPECIFICATIONDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductSpecificationDescription" element
     */
    public boolean isSetProductSpecificationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTSPECIFICATIONDESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "ProductSpecificationDescription" element
     */
    public void setProductSpecificationDescription(com.sap.xi.ap.common.gdt.MEDIUMDescription productSpecificationDescription)
    {
        generatedSetterHelperImpl(productSpecificationDescription, PRODUCTSPECIFICATIONDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductSpecificationDescription" element
     */
    public com.sap.xi.ap.common.gdt.MEDIUMDescription addNewProductSpecificationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MEDIUMDescription target = null;
            target = (com.sap.xi.ap.common.gdt.MEDIUMDescription)get_store().add_element_user(PRODUCTSPECIFICATIONDESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductSpecificationDescription" element
     */
    public void unsetProductSpecificationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTSPECIFICATIONDESCRIPTION$0, 0);
        }
    }
}
