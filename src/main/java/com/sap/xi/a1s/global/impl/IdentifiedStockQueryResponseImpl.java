/*
 * XML Type:  IdentifiedStockQueryResponse
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.IdentifiedStockQueryResponse
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML IdentifiedStockQueryResponse(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class IdentifiedStockQueryResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.IdentifiedStockQueryResponse
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiedStockQueryResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKID$0 = 
        new javax.xml.namespace.QName("", "IdentifiedStockID");
    private static final javax.xml.namespace.QName EXTERNALIDENTIFIEDSTOCKID$2 = 
        new javax.xml.namespace.QName("", "ExternalIdentifiedStockID");
    private static final javax.xml.namespace.QName PRODUCTID$4 = 
        new javax.xml.namespace.QName("", "ProductID");
    private static final javax.xml.namespace.QName PRODUCTIONDATETIME$6 = 
        new javax.xml.namespace.QName("", "ProductionDateTime");
    private static final javax.xml.namespace.QName EXPIRATIONDATETIME$8 = 
        new javax.xml.namespace.QName("", "ExpirationDateTime");
    private static final javax.xml.namespace.QName SUPPLIERID$10 = 
        new javax.xml.namespace.QName("", "SupplierID");
    private static final javax.xml.namespace.QName PRODUCTREQUIREMENTSPECIFICATIONKEY$12 = 
        new javax.xml.namespace.QName("", "ProductRequirementSpecificationKey");
    private static final javax.xml.namespace.QName LIFECYCLESTATUSCODE$14 = 
        new javax.xml.namespace.QName("", "LifeCycleStatusCode");
    private static final javax.xml.namespace.QName DESCRIPTION$16 = 
        new javax.xml.namespace.QName("", "Description");
    private static final javax.xml.namespace.QName QUANTITYCONVERSION$18 = 
        new javax.xml.namespace.QName("", "QuantityConversion");
    private static final javax.xml.namespace.QName ATTACHMENTFOLDER$20 = 
        new javax.xml.namespace.QName("", "AttachmentFolder");
    private static final javax.xml.namespace.QName TEXTCOLLECTION$22 = 
        new javax.xml.namespace.QName("", "TextCollection");
    
    
    /**
     * Gets the "IdentifiedStockID" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockID getIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID)get_store().find_element_user(IDENTIFIEDSTOCKID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IdentifiedStockID" element
     */
    public boolean isSetIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIEDSTOCKID$0) != 0;
        }
    }
    
    /**
     * Sets the "IdentifiedStockID" element
     */
    public void setIdentifiedStockID(com.sap.xi.ap.common.gdt.IdentifiedStockID identifiedStockID)
    {
        generatedSetterHelperImpl(identifiedStockID, IDENTIFIEDSTOCKID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdentifiedStockID" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockID addNewIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID)get_store().add_element_user(IDENTIFIEDSTOCKID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "IdentifiedStockID" element
     */
    public void unsetIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIEDSTOCKID$0, 0);
        }
    }
    
    /**
     * Gets the "ExternalIdentifiedStockID" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockID getExternalIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID)get_store().find_element_user(EXTERNALIDENTIFIEDSTOCKID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ExternalIdentifiedStockID" element
     */
    public boolean isSetExternalIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALIDENTIFIEDSTOCKID$2) != 0;
        }
    }
    
    /**
     * Sets the "ExternalIdentifiedStockID" element
     */
    public void setExternalIdentifiedStockID(com.sap.xi.ap.common.gdt.IdentifiedStockID externalIdentifiedStockID)
    {
        generatedSetterHelperImpl(externalIdentifiedStockID, EXTERNALIDENTIFIEDSTOCKID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ExternalIdentifiedStockID" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockID addNewExternalIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID)get_store().add_element_user(EXTERNALIDENTIFIEDSTOCKID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ExternalIdentifiedStockID" element
     */
    public void unsetExternalIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALIDENTIFIEDSTOCKID$2, 0);
        }
    }
    
    /**
     * Gets the "ProductID" element
     */
    public com.sap.xi.ap.common.gdt.ProductID getProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().find_element_user(PRODUCTID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductID" element
     */
    public boolean isSetProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTID$4) != 0;
        }
    }
    
    /**
     * Sets the "ProductID" element
     */
    public void setProductID(com.sap.xi.ap.common.gdt.ProductID productID)
    {
        generatedSetterHelperImpl(productID, PRODUCTID$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductID" element
     */
    public com.sap.xi.ap.common.gdt.ProductID addNewProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().add_element_user(PRODUCTID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductID" element
     */
    public void unsetProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTID$4, 0);
        }
    }
    
    /**
     * Gets the "ProductionDateTime" element
     */
    public java.util.Calendar getProductionDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTIONDATETIME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductionDateTime" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetProductionDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(PRODUCTIONDATETIME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProductionDateTime" element
     */
    public boolean isSetProductionDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONDATETIME$6) != 0;
        }
    }
    
    /**
     * Sets the "ProductionDateTime" element
     */
    public void setProductionDateTime(java.util.Calendar productionDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTIONDATETIME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTIONDATETIME$6);
            }
            target.setCalendarValue(productionDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "ProductionDateTime" element
     */
    public void xsetProductionDateTime(com.sap.xi.basis.global.GLOBALDateTime productionDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(PRODUCTIONDATETIME$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(PRODUCTIONDATETIME$6);
            }
            target.set(productionDateTime);
        }
    }
    
    /**
     * Unsets the "ProductionDateTime" element
     */
    public void unsetProductionDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONDATETIME$6, 0);
        }
    }
    
    /**
     * Gets the "ExpirationDateTime" element
     */
    public java.util.Calendar getExpirationDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATETIME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExpirationDateTime" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetExpirationDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(EXPIRATIONDATETIME$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ExpirationDateTime" element
     */
    public boolean isSetExpirationDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPIRATIONDATETIME$8) != 0;
        }
    }
    
    /**
     * Sets the "ExpirationDateTime" element
     */
    public void setExpirationDateTime(java.util.Calendar expirationDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATETIME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIRATIONDATETIME$8);
            }
            target.setCalendarValue(expirationDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "ExpirationDateTime" element
     */
    public void xsetExpirationDateTime(com.sap.xi.basis.global.GLOBALDateTime expirationDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(EXPIRATIONDATETIME$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(EXPIRATIONDATETIME$8);
            }
            target.set(expirationDateTime);
        }
    }
    
    /**
     * Unsets the "ExpirationDateTime" element
     */
    public void unsetExpirationDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPIRATIONDATETIME$8, 0);
        }
    }
    
    /**
     * Gets the "SupplierID" element
     */
    public com.sap.xi.ap.common.global.PartyKey getSupplierID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.PartyKey target = null;
            target = (com.sap.xi.ap.common.global.PartyKey)get_store().find_element_user(SUPPLIERID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SupplierID" element
     */
    public boolean isSetSupplierID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLIERID$10) != 0;
        }
    }
    
    /**
     * Sets the "SupplierID" element
     */
    public void setSupplierID(com.sap.xi.ap.common.global.PartyKey supplierID)
    {
        generatedSetterHelperImpl(supplierID, SUPPLIERID$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SupplierID" element
     */
    public com.sap.xi.ap.common.global.PartyKey addNewSupplierID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.PartyKey target = null;
            target = (com.sap.xi.ap.common.global.PartyKey)get_store().add_element_user(SUPPLIERID$10);
            return target;
        }
    }
    
    /**
     * Unsets the "SupplierID" element
     */
    public void unsetSupplierID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLIERID$10, 0);
        }
    }
    
    /**
     * Gets the "ProductRequirementSpecificationKey" element
     */
    public com.sap.xi.ap.common.global.RequirementSpecificationKey getProductRequirementSpecificationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.RequirementSpecificationKey target = null;
            target = (com.sap.xi.ap.common.global.RequirementSpecificationKey)get_store().find_element_user(PRODUCTREQUIREMENTSPECIFICATIONKEY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductRequirementSpecificationKey" element
     */
    public boolean isSetProductRequirementSpecificationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTREQUIREMENTSPECIFICATIONKEY$12) != 0;
        }
    }
    
    /**
     * Sets the "ProductRequirementSpecificationKey" element
     */
    public void setProductRequirementSpecificationKey(com.sap.xi.ap.common.global.RequirementSpecificationKey productRequirementSpecificationKey)
    {
        generatedSetterHelperImpl(productRequirementSpecificationKey, PRODUCTREQUIREMENTSPECIFICATIONKEY$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductRequirementSpecificationKey" element
     */
    public com.sap.xi.ap.common.global.RequirementSpecificationKey addNewProductRequirementSpecificationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.RequirementSpecificationKey target = null;
            target = (com.sap.xi.ap.common.global.RequirementSpecificationKey)get_store().add_element_user(PRODUCTREQUIREMENTSPECIFICATIONKEY$12);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductRequirementSpecificationKey" element
     */
    public void unsetProductRequirementSpecificationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTREQUIREMENTSPECIFICATIONKEY$12, 0);
        }
    }
    
    /**
     * Gets the "LifeCycleStatusCode" element
     */
    public com.sap.xi.ap.fo.identifiedstock.global.IdentifiedStockStatus getLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.fo.identifiedstock.global.IdentifiedStockStatus target = null;
            target = (com.sap.xi.ap.fo.identifiedstock.global.IdentifiedStockStatus)get_store().find_element_user(LIFECYCLESTATUSCODE$14, 0);
            if (target == null)
            {
                return null;
            }
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
            return get_store().count_elements(LIFECYCLESTATUSCODE$14) != 0;
        }
    }
    
    /**
     * Sets the "LifeCycleStatusCode" element
     */
    public void setLifeCycleStatusCode(com.sap.xi.ap.fo.identifiedstock.global.IdentifiedStockStatus lifeCycleStatusCode)
    {
        generatedSetterHelperImpl(lifeCycleStatusCode, LIFECYCLESTATUSCODE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LifeCycleStatusCode" element
     */
    public com.sap.xi.ap.fo.identifiedstock.global.IdentifiedStockStatus addNewLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.fo.identifiedstock.global.IdentifiedStockStatus target = null;
            target = (com.sap.xi.ap.fo.identifiedstock.global.IdentifiedStockStatus)get_store().add_element_user(LIFECYCLESTATUSCODE$14);
            return target;
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
            get_store().remove_element(LIFECYCLESTATUSCODE$14, 0);
        }
    }
    
    /**
     * Gets array of all "Description" elements
     */
    public com.sap.xi.ap.common.gdt.MEDIUMDescription[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIPTION$16, targetList);
            com.sap.xi.ap.common.gdt.MEDIUMDescription[] result = new com.sap.xi.ap.common.gdt.MEDIUMDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Description" element
     */
    public com.sap.xi.ap.common.gdt.MEDIUMDescription getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MEDIUMDescription target = null;
            target = (com.sap.xi.ap.common.gdt.MEDIUMDescription)get_store().find_element_user(DESCRIPTION$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Description" element
     */
    public int sizeOfDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$16);
        }
    }
    
    /**
     * Sets array of all "Description" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDescriptionArray(com.sap.xi.ap.common.gdt.MEDIUMDescription[] descriptionArray)
    {
        check_orphaned();
        arraySetterHelper(descriptionArray, DESCRIPTION$16);
    }
    
    /**
     * Sets ith "Description" element
     */
    public void setDescriptionArray(int i, com.sap.xi.ap.common.gdt.MEDIUMDescription description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Description" element
     */
    public com.sap.xi.ap.common.gdt.MEDIUMDescription insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MEDIUMDescription target = null;
            target = (com.sap.xi.ap.common.gdt.MEDIUMDescription)get_store().insert_element_user(DESCRIPTION$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Description" element
     */
    public com.sap.xi.ap.common.gdt.MEDIUMDescription addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MEDIUMDescription target = null;
            target = (com.sap.xi.ap.common.gdt.MEDIUMDescription)get_store().add_element_user(DESCRIPTION$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "Description" element
     */
    public void removeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$16, i);
        }
    }
    
    /**
     * Gets array of all "QuantityConversion" elements
     */
    public com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest[] getQuantityConversionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUANTITYCONVERSION$18, targetList);
            com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest[] result = new com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QuantityConversion" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest getQuantityConversionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest)get_store().find_element_user(QUANTITYCONVERSION$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "QuantityConversion" element
     */
    public int sizeOfQuantityConversionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITYCONVERSION$18);
        }
    }
    
    /**
     * Sets array of all "QuantityConversion" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setQuantityConversionArray(com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest[] quantityConversionArray)
    {
        check_orphaned();
        arraySetterHelper(quantityConversionArray, QUANTITYCONVERSION$18);
    }
    
    /**
     * Sets ith "QuantityConversion" element
     */
    public void setQuantityConversionArray(int i, com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest quantityConversion)
    {
        generatedSetterHelperImpl(quantityConversion, QUANTITYCONVERSION$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuantityConversion" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest insertNewQuantityConversion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest)get_store().insert_element_user(QUANTITYCONVERSION$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuantityConversion" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest addNewQuantityConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest)get_store().add_element_user(QUANTITYCONVERSION$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "QuantityConversion" element
     */
    public void removeQuantityConversion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITYCONVERSION$18, i);
        }
    }
    
    /**
     * Gets the "AttachmentFolder" element
     */
    public com.sap.xi.documentservices.global.AccessAttachmentFolder getAttachmentFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessAttachmentFolder target = null;
            target = (com.sap.xi.documentservices.global.AccessAttachmentFolder)get_store().find_element_user(ATTACHMENTFOLDER$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AttachmentFolder" element
     */
    public boolean isSetAttachmentFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTFOLDER$20) != 0;
        }
    }
    
    /**
     * Sets the "AttachmentFolder" element
     */
    public void setAttachmentFolder(com.sap.xi.documentservices.global.AccessAttachmentFolder attachmentFolder)
    {
        generatedSetterHelperImpl(attachmentFolder, ATTACHMENTFOLDER$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AttachmentFolder" element
     */
    public com.sap.xi.documentservices.global.AccessAttachmentFolder addNewAttachmentFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessAttachmentFolder target = null;
            target = (com.sap.xi.documentservices.global.AccessAttachmentFolder)get_store().add_element_user(ATTACHMENTFOLDER$20);
            return target;
        }
    }
    
    /**
     * Unsets the "AttachmentFolder" element
     */
    public void unsetAttachmentFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTFOLDER$20, 0);
        }
    }
    
    /**
     * Gets the "TextCollection" element
     */
    public com.sap.xi.documentservices.global.AccessTextCollection getTextCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessTextCollection target = null;
            target = (com.sap.xi.documentservices.global.AccessTextCollection)get_store().find_element_user(TEXTCOLLECTION$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TextCollection" element
     */
    public boolean isSetTextCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTCOLLECTION$22) != 0;
        }
    }
    
    /**
     * Sets the "TextCollection" element
     */
    public void setTextCollection(com.sap.xi.documentservices.global.AccessTextCollection textCollection)
    {
        generatedSetterHelperImpl(textCollection, TEXTCOLLECTION$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TextCollection" element
     */
    public com.sap.xi.documentservices.global.AccessTextCollection addNewTextCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessTextCollection target = null;
            target = (com.sap.xi.documentservices.global.AccessTextCollection)get_store().add_element_user(TEXTCOLLECTION$22);
            return target;
        }
    }
    
    /**
     * Unsets the "TextCollection" element
     */
    public void unsetTextCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTCOLLECTION$22, 0);
        }
    }
}
