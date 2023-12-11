/*
 * XML Type:  IdentifiedStockRequestQuery
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.IdentifiedStockRequestQuery
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML IdentifiedStockRequestQuery(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class IdentifiedStockRequestQueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.IdentifiedStockRequestQuery
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiedStockRequestQueryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELECTIONBYIDENTIFIEDSTOCKID$0 = 
        new javax.xml.namespace.QName("", "SelectionByIdentifiedStockID");
    private static final javax.xml.namespace.QName SELECTIONBYEXTERNALIDENTIFIEDSTOCKID$2 = 
        new javax.xml.namespace.QName("", "SelectionByExternalIdentifiedStockID");
    private static final javax.xml.namespace.QName SELECTIONBYSEARCHTEXT$4 = 
        new javax.xml.namespace.QName("", "SelectionBySearchText");
    private static final javax.xml.namespace.QName SELECTIONBYIDENTIFIEDSTOCKDESCRIPTION$6 = 
        new javax.xml.namespace.QName("", "SelectionByIdentifiedStockDescription");
    private static final javax.xml.namespace.QName SELECTIONBYSUPPLIERIDPARTYID$8 = 
        new javax.xml.namespace.QName("", "SelectionBySupplierIDPartyID");
    private static final javax.xml.namespace.QName SELECTIONBYLIFECYCLESTATUSCODE$10 = 
        new javax.xml.namespace.QName("", "SelectionByLifeCycleStatusCode");
    private static final javax.xml.namespace.QName SELECTIONBYIDENTIFIEDSTOCKTYPECODE$12 = 
        new javax.xml.namespace.QName("", "SelectionByIdentifiedStockTypeCode");
    private static final javax.xml.namespace.QName SELECTIONBYPRODUCTVALUATIONLEVELTYPECODE$14 = 
        new javax.xml.namespace.QName("", "SelectionByProductValuationLevelTypeCode");
    private static final javax.xml.namespace.QName SELECTIONBYPRODUCTIONDATETIME$16 = 
        new javax.xml.namespace.QName("", "SelectionByProductionDateTime");
    private static final javax.xml.namespace.QName SELECTIONBYEXPIRATIONDATETIME$18 = 
        new javax.xml.namespace.QName("", "SelectionByExpirationDateTime");
    private static final javax.xml.namespace.QName SELECTIONBYMATERIALKEYPRODUCTID$20 = 
        new javax.xml.namespace.QName("", "SelectionByMaterialKeyProductID");
    private static final javax.xml.namespace.QName SELECTIONBYPRODUCTREQUIREMENTSPECIFICATIONKEYREQUIREMENTSPECIFICATIONID$22 = 
        new javax.xml.namespace.QName("", "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID");
    private static final javax.xml.namespace.QName SELECTIONBYADMINISTRATIVEDATACREATIONDATETIME$24 = 
        new javax.xml.namespace.QName("", "SelectionByAdministrativeDataCreationDateTime");
    private static final javax.xml.namespace.QName SELECTIONBYADMINISTRATIVEDATALASTCHANGEDATETIME$26 = 
        new javax.xml.namespace.QName("", "SelectionByAdministrativeDataLastChangeDateTime");
    private static final javax.xml.namespace.QName SELECTIONBYBATCHMANAGEDINDICATOR$28 = 
        new javax.xml.namespace.QName("", "selectionByBatchManagedIndicator");
    
    
    /**
     * Gets array of all "SelectionByIdentifiedStockID" elements
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier[] getSelectionByIdentifiedStockIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYIDENTIFIEDSTOCKID$0, targetList);
            com.sap.xi.ap.common.global.SelectionByIdentifier[] result = new com.sap.xi.ap.common.global.SelectionByIdentifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByIdentifiedStockID" element
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier getSelectionByIdentifiedStockIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByIdentifier target = null;
            target = (com.sap.xi.ap.common.global.SelectionByIdentifier)get_store().find_element_user(SELECTIONBYIDENTIFIEDSTOCKID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByIdentifiedStockID" element
     */
    public int sizeOfSelectionByIdentifiedStockIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYIDENTIFIEDSTOCKID$0);
        }
    }
    
    /**
     * Sets array of all "SelectionByIdentifiedStockID" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByIdentifiedStockIDArray(com.sap.xi.ap.common.global.SelectionByIdentifier[] selectionByIdentifiedStockIDArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByIdentifiedStockIDArray, SELECTIONBYIDENTIFIEDSTOCKID$0);
    }
    
    /**
     * Sets ith "SelectionByIdentifiedStockID" element
     */
    public void setSelectionByIdentifiedStockIDArray(int i, com.sap.xi.ap.common.global.SelectionByIdentifier selectionByIdentifiedStockID)
    {
        generatedSetterHelperImpl(selectionByIdentifiedStockID, SELECTIONBYIDENTIFIEDSTOCKID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByIdentifiedStockID" element
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier insertNewSelectionByIdentifiedStockID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByIdentifier target = null;
            target = (com.sap.xi.ap.common.global.SelectionByIdentifier)get_store().insert_element_user(SELECTIONBYIDENTIFIEDSTOCKID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByIdentifiedStockID" element
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier addNewSelectionByIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByIdentifier target = null;
            target = (com.sap.xi.ap.common.global.SelectionByIdentifier)get_store().add_element_user(SELECTIONBYIDENTIFIEDSTOCKID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByIdentifiedStockID" element
     */
    public void removeSelectionByIdentifiedStockID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYIDENTIFIEDSTOCKID$0, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByExternalIdentifiedStockID" elements
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier[] getSelectionByExternalIdentifiedStockIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYEXTERNALIDENTIFIEDSTOCKID$2, targetList);
            com.sap.xi.ap.common.global.SelectionByIdentifier[] result = new com.sap.xi.ap.common.global.SelectionByIdentifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByExternalIdentifiedStockID" element
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier getSelectionByExternalIdentifiedStockIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByIdentifier target = null;
            target = (com.sap.xi.ap.common.global.SelectionByIdentifier)get_store().find_element_user(SELECTIONBYEXTERNALIDENTIFIEDSTOCKID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByExternalIdentifiedStockID" element
     */
    public int sizeOfSelectionByExternalIdentifiedStockIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYEXTERNALIDENTIFIEDSTOCKID$2);
        }
    }
    
    /**
     * Sets array of all "SelectionByExternalIdentifiedStockID" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByExternalIdentifiedStockIDArray(com.sap.xi.ap.common.global.SelectionByIdentifier[] selectionByExternalIdentifiedStockIDArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByExternalIdentifiedStockIDArray, SELECTIONBYEXTERNALIDENTIFIEDSTOCKID$2);
    }
    
    /**
     * Sets ith "SelectionByExternalIdentifiedStockID" element
     */
    public void setSelectionByExternalIdentifiedStockIDArray(int i, com.sap.xi.ap.common.global.SelectionByIdentifier selectionByExternalIdentifiedStockID)
    {
        generatedSetterHelperImpl(selectionByExternalIdentifiedStockID, SELECTIONBYEXTERNALIDENTIFIEDSTOCKID$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByExternalIdentifiedStockID" element
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier insertNewSelectionByExternalIdentifiedStockID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByIdentifier target = null;
            target = (com.sap.xi.ap.common.global.SelectionByIdentifier)get_store().insert_element_user(SELECTIONBYEXTERNALIDENTIFIEDSTOCKID$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByExternalIdentifiedStockID" element
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier addNewSelectionByExternalIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByIdentifier target = null;
            target = (com.sap.xi.ap.common.global.SelectionByIdentifier)get_store().add_element_user(SELECTIONBYEXTERNALIDENTIFIEDSTOCKID$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByExternalIdentifiedStockID" element
     */
    public void removeSelectionByExternalIdentifiedStockID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYEXTERNALIDENTIFIEDSTOCKID$2, i);
        }
    }
    
    /**
     * Gets the "SelectionBySearchText" element
     */
    public java.lang.String getSelectionBySearchText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELECTIONBYSEARCHTEXT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SelectionBySearchText" element
     */
    public com.sap.xi.ap.common.gdt.SearchText xgetSelectionBySearchText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SearchText target = null;
            target = (com.sap.xi.ap.common.gdt.SearchText)get_store().find_element_user(SELECTIONBYSEARCHTEXT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "SelectionBySearchText" element
     */
    public boolean isSetSelectionBySearchText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYSEARCHTEXT$4) != 0;
        }
    }
    
    /**
     * Sets the "SelectionBySearchText" element
     */
    public void setSelectionBySearchText(java.lang.String selectionBySearchText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELECTIONBYSEARCHTEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELECTIONBYSEARCHTEXT$4);
            }
            target.setStringValue(selectionBySearchText);
        }
    }
    
    /**
     * Sets (as xml) the "SelectionBySearchText" element
     */
    public void xsetSelectionBySearchText(com.sap.xi.ap.common.gdt.SearchText selectionBySearchText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SearchText target = null;
            target = (com.sap.xi.ap.common.gdt.SearchText)get_store().find_element_user(SELECTIONBYSEARCHTEXT$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.SearchText)get_store().add_element_user(SELECTIONBYSEARCHTEXT$4);
            }
            target.set(selectionBySearchText);
        }
    }
    
    /**
     * Unsets the "SelectionBySearchText" element
     */
    public void unsetSelectionBySearchText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYSEARCHTEXT$4, 0);
        }
    }
    
    /**
     * Gets array of all "SelectionByIdentifiedStockDescription" elements
     */
    public com.sap.xi.ap.common.global.SelectionByText[] getSelectionByIdentifiedStockDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYIDENTIFIEDSTOCKDESCRIPTION$6, targetList);
            com.sap.xi.ap.common.global.SelectionByText[] result = new com.sap.xi.ap.common.global.SelectionByText[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByIdentifiedStockDescription" element
     */
    public com.sap.xi.ap.common.global.SelectionByText getSelectionByIdentifiedStockDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByText target = null;
            target = (com.sap.xi.ap.common.global.SelectionByText)get_store().find_element_user(SELECTIONBYIDENTIFIEDSTOCKDESCRIPTION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByIdentifiedStockDescription" element
     */
    public int sizeOfSelectionByIdentifiedStockDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYIDENTIFIEDSTOCKDESCRIPTION$6);
        }
    }
    
    /**
     * Sets array of all "SelectionByIdentifiedStockDescription" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByIdentifiedStockDescriptionArray(com.sap.xi.ap.common.global.SelectionByText[] selectionByIdentifiedStockDescriptionArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByIdentifiedStockDescriptionArray, SELECTIONBYIDENTIFIEDSTOCKDESCRIPTION$6);
    }
    
    /**
     * Sets ith "SelectionByIdentifiedStockDescription" element
     */
    public void setSelectionByIdentifiedStockDescriptionArray(int i, com.sap.xi.ap.common.global.SelectionByText selectionByIdentifiedStockDescription)
    {
        generatedSetterHelperImpl(selectionByIdentifiedStockDescription, SELECTIONBYIDENTIFIEDSTOCKDESCRIPTION$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByIdentifiedStockDescription" element
     */
    public com.sap.xi.ap.common.global.SelectionByText insertNewSelectionByIdentifiedStockDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByText target = null;
            target = (com.sap.xi.ap.common.global.SelectionByText)get_store().insert_element_user(SELECTIONBYIDENTIFIEDSTOCKDESCRIPTION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByIdentifiedStockDescription" element
     */
    public com.sap.xi.ap.common.global.SelectionByText addNewSelectionByIdentifiedStockDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByText target = null;
            target = (com.sap.xi.ap.common.global.SelectionByText)get_store().add_element_user(SELECTIONBYIDENTIFIEDSTOCKDESCRIPTION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByIdentifiedStockDescription" element
     */
    public void removeSelectionByIdentifiedStockDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYIDENTIFIEDSTOCKDESCRIPTION$6, i);
        }
    }
    
    /**
     * Gets array of all "SelectionBySupplierIDPartyID" elements
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier[] getSelectionBySupplierIDPartyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYSUPPLIERIDPARTYID$8, targetList);
            com.sap.xi.ap.common.global.SelectionByIdentifier[] result = new com.sap.xi.ap.common.global.SelectionByIdentifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionBySupplierIDPartyID" element
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier getSelectionBySupplierIDPartyIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByIdentifier target = null;
            target = (com.sap.xi.ap.common.global.SelectionByIdentifier)get_store().find_element_user(SELECTIONBYSUPPLIERIDPARTYID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionBySupplierIDPartyID" element
     */
    public int sizeOfSelectionBySupplierIDPartyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYSUPPLIERIDPARTYID$8);
        }
    }
    
    /**
     * Sets array of all "SelectionBySupplierIDPartyID" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionBySupplierIDPartyIDArray(com.sap.xi.ap.common.global.SelectionByIdentifier[] selectionBySupplierIDPartyIDArray)
    {
        check_orphaned();
        arraySetterHelper(selectionBySupplierIDPartyIDArray, SELECTIONBYSUPPLIERIDPARTYID$8);
    }
    
    /**
     * Sets ith "SelectionBySupplierIDPartyID" element
     */
    public void setSelectionBySupplierIDPartyIDArray(int i, com.sap.xi.ap.common.global.SelectionByIdentifier selectionBySupplierIDPartyID)
    {
        generatedSetterHelperImpl(selectionBySupplierIDPartyID, SELECTIONBYSUPPLIERIDPARTYID$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionBySupplierIDPartyID" element
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier insertNewSelectionBySupplierIDPartyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByIdentifier target = null;
            target = (com.sap.xi.ap.common.global.SelectionByIdentifier)get_store().insert_element_user(SELECTIONBYSUPPLIERIDPARTYID$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionBySupplierIDPartyID" element
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier addNewSelectionBySupplierIDPartyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByIdentifier target = null;
            target = (com.sap.xi.ap.common.global.SelectionByIdentifier)get_store().add_element_user(SELECTIONBYSUPPLIERIDPARTYID$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionBySupplierIDPartyID" element
     */
    public void removeSelectionBySupplierIDPartyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYSUPPLIERIDPARTYID$8, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByLifeCycleStatusCode" elements
     */
    public com.sap.xi.ap.common.global.SelectionByCode[] getSelectionByLifeCycleStatusCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYLIFECYCLESTATUSCODE$10, targetList);
            com.sap.xi.ap.common.global.SelectionByCode[] result = new com.sap.xi.ap.common.global.SelectionByCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByLifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.global.SelectionByCode getSelectionByLifeCycleStatusCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByCode target = null;
            target = (com.sap.xi.ap.common.global.SelectionByCode)get_store().find_element_user(SELECTIONBYLIFECYCLESTATUSCODE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByLifeCycleStatusCode" element
     */
    public int sizeOfSelectionByLifeCycleStatusCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYLIFECYCLESTATUSCODE$10);
        }
    }
    
    /**
     * Sets array of all "SelectionByLifeCycleStatusCode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByLifeCycleStatusCodeArray(com.sap.xi.ap.common.global.SelectionByCode[] selectionByLifeCycleStatusCodeArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByLifeCycleStatusCodeArray, SELECTIONBYLIFECYCLESTATUSCODE$10);
    }
    
    /**
     * Sets ith "SelectionByLifeCycleStatusCode" element
     */
    public void setSelectionByLifeCycleStatusCodeArray(int i, com.sap.xi.ap.common.global.SelectionByCode selectionByLifeCycleStatusCode)
    {
        generatedSetterHelperImpl(selectionByLifeCycleStatusCode, SELECTIONBYLIFECYCLESTATUSCODE$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByLifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.global.SelectionByCode insertNewSelectionByLifeCycleStatusCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByCode target = null;
            target = (com.sap.xi.ap.common.global.SelectionByCode)get_store().insert_element_user(SELECTIONBYLIFECYCLESTATUSCODE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByLifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.global.SelectionByCode addNewSelectionByLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByCode target = null;
            target = (com.sap.xi.ap.common.global.SelectionByCode)get_store().add_element_user(SELECTIONBYLIFECYCLESTATUSCODE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByLifeCycleStatusCode" element
     */
    public void removeSelectionByLifeCycleStatusCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYLIFECYCLESTATUSCODE$10, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByIdentifiedStockTypeCode" elements
     */
    public com.sap.xi.ap.common.global.SelectionByCode[] getSelectionByIdentifiedStockTypeCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYIDENTIFIEDSTOCKTYPECODE$12, targetList);
            com.sap.xi.ap.common.global.SelectionByCode[] result = new com.sap.xi.ap.common.global.SelectionByCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByIdentifiedStockTypeCode" element
     */
    public com.sap.xi.ap.common.global.SelectionByCode getSelectionByIdentifiedStockTypeCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByCode target = null;
            target = (com.sap.xi.ap.common.global.SelectionByCode)get_store().find_element_user(SELECTIONBYIDENTIFIEDSTOCKTYPECODE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByIdentifiedStockTypeCode" element
     */
    public int sizeOfSelectionByIdentifiedStockTypeCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYIDENTIFIEDSTOCKTYPECODE$12);
        }
    }
    
    /**
     * Sets array of all "SelectionByIdentifiedStockTypeCode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByIdentifiedStockTypeCodeArray(com.sap.xi.ap.common.global.SelectionByCode[] selectionByIdentifiedStockTypeCodeArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByIdentifiedStockTypeCodeArray, SELECTIONBYIDENTIFIEDSTOCKTYPECODE$12);
    }
    
    /**
     * Sets ith "SelectionByIdentifiedStockTypeCode" element
     */
    public void setSelectionByIdentifiedStockTypeCodeArray(int i, com.sap.xi.ap.common.global.SelectionByCode selectionByIdentifiedStockTypeCode)
    {
        generatedSetterHelperImpl(selectionByIdentifiedStockTypeCode, SELECTIONBYIDENTIFIEDSTOCKTYPECODE$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByIdentifiedStockTypeCode" element
     */
    public com.sap.xi.ap.common.global.SelectionByCode insertNewSelectionByIdentifiedStockTypeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByCode target = null;
            target = (com.sap.xi.ap.common.global.SelectionByCode)get_store().insert_element_user(SELECTIONBYIDENTIFIEDSTOCKTYPECODE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByIdentifiedStockTypeCode" element
     */
    public com.sap.xi.ap.common.global.SelectionByCode addNewSelectionByIdentifiedStockTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByCode target = null;
            target = (com.sap.xi.ap.common.global.SelectionByCode)get_store().add_element_user(SELECTIONBYIDENTIFIEDSTOCKTYPECODE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByIdentifiedStockTypeCode" element
     */
    public void removeSelectionByIdentifiedStockTypeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYIDENTIFIEDSTOCKTYPECODE$12, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByProductValuationLevelTypeCode" elements
     */
    public com.sap.xi.ap.common.global.SelectionByCode[] getSelectionByProductValuationLevelTypeCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYPRODUCTVALUATIONLEVELTYPECODE$14, targetList);
            com.sap.xi.ap.common.global.SelectionByCode[] result = new com.sap.xi.ap.common.global.SelectionByCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByProductValuationLevelTypeCode" element
     */
    public com.sap.xi.ap.common.global.SelectionByCode getSelectionByProductValuationLevelTypeCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByCode target = null;
            target = (com.sap.xi.ap.common.global.SelectionByCode)get_store().find_element_user(SELECTIONBYPRODUCTVALUATIONLEVELTYPECODE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByProductValuationLevelTypeCode" element
     */
    public int sizeOfSelectionByProductValuationLevelTypeCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYPRODUCTVALUATIONLEVELTYPECODE$14);
        }
    }
    
    /**
     * Sets array of all "SelectionByProductValuationLevelTypeCode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByProductValuationLevelTypeCodeArray(com.sap.xi.ap.common.global.SelectionByCode[] selectionByProductValuationLevelTypeCodeArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByProductValuationLevelTypeCodeArray, SELECTIONBYPRODUCTVALUATIONLEVELTYPECODE$14);
    }
    
    /**
     * Sets ith "SelectionByProductValuationLevelTypeCode" element
     */
    public void setSelectionByProductValuationLevelTypeCodeArray(int i, com.sap.xi.ap.common.global.SelectionByCode selectionByProductValuationLevelTypeCode)
    {
        generatedSetterHelperImpl(selectionByProductValuationLevelTypeCode, SELECTIONBYPRODUCTVALUATIONLEVELTYPECODE$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByProductValuationLevelTypeCode" element
     */
    public com.sap.xi.ap.common.global.SelectionByCode insertNewSelectionByProductValuationLevelTypeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByCode target = null;
            target = (com.sap.xi.ap.common.global.SelectionByCode)get_store().insert_element_user(SELECTIONBYPRODUCTVALUATIONLEVELTYPECODE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByProductValuationLevelTypeCode" element
     */
    public com.sap.xi.ap.common.global.SelectionByCode addNewSelectionByProductValuationLevelTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByCode target = null;
            target = (com.sap.xi.ap.common.global.SelectionByCode)get_store().add_element_user(SELECTIONBYPRODUCTVALUATIONLEVELTYPECODE$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByProductValuationLevelTypeCode" element
     */
    public void removeSelectionByProductValuationLevelTypeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYPRODUCTVALUATIONLEVELTYPECODE$14, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByProductionDateTime" elements
     */
    public com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] getSelectionByProductionDateTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYPRODUCTIONDATETIME$16, targetList);
            com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] result = new com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByProductionDateTime" element
     */
    public com.sap.xi.ap.common.global.GLOBALSelectionByDateTime getSelectionByProductionDateTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.GLOBALSelectionByDateTime target = null;
            target = (com.sap.xi.ap.common.global.GLOBALSelectionByDateTime)get_store().find_element_user(SELECTIONBYPRODUCTIONDATETIME$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByProductionDateTime" element
     */
    public int sizeOfSelectionByProductionDateTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYPRODUCTIONDATETIME$16);
        }
    }
    
    /**
     * Sets array of all "SelectionByProductionDateTime" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByProductionDateTimeArray(com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] selectionByProductionDateTimeArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByProductionDateTimeArray, SELECTIONBYPRODUCTIONDATETIME$16);
    }
    
    /**
     * Sets ith "SelectionByProductionDateTime" element
     */
    public void setSelectionByProductionDateTimeArray(int i, com.sap.xi.ap.common.global.GLOBALSelectionByDateTime selectionByProductionDateTime)
    {
        generatedSetterHelperImpl(selectionByProductionDateTime, SELECTIONBYPRODUCTIONDATETIME$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByProductionDateTime" element
     */
    public com.sap.xi.ap.common.global.GLOBALSelectionByDateTime insertNewSelectionByProductionDateTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.GLOBALSelectionByDateTime target = null;
            target = (com.sap.xi.ap.common.global.GLOBALSelectionByDateTime)get_store().insert_element_user(SELECTIONBYPRODUCTIONDATETIME$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByProductionDateTime" element
     */
    public com.sap.xi.ap.common.global.GLOBALSelectionByDateTime addNewSelectionByProductionDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.GLOBALSelectionByDateTime target = null;
            target = (com.sap.xi.ap.common.global.GLOBALSelectionByDateTime)get_store().add_element_user(SELECTIONBYPRODUCTIONDATETIME$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByProductionDateTime" element
     */
    public void removeSelectionByProductionDateTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYPRODUCTIONDATETIME$16, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByExpirationDateTime" elements
     */
    public com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] getSelectionByExpirationDateTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYEXPIRATIONDATETIME$18, targetList);
            com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] result = new com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByExpirationDateTime" element
     */
    public com.sap.xi.ap.common.global.GLOBALSelectionByDateTime getSelectionByExpirationDateTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.GLOBALSelectionByDateTime target = null;
            target = (com.sap.xi.ap.common.global.GLOBALSelectionByDateTime)get_store().find_element_user(SELECTIONBYEXPIRATIONDATETIME$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByExpirationDateTime" element
     */
    public int sizeOfSelectionByExpirationDateTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYEXPIRATIONDATETIME$18);
        }
    }
    
    /**
     * Sets array of all "SelectionByExpirationDateTime" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByExpirationDateTimeArray(com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] selectionByExpirationDateTimeArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByExpirationDateTimeArray, SELECTIONBYEXPIRATIONDATETIME$18);
    }
    
    /**
     * Sets ith "SelectionByExpirationDateTime" element
     */
    public void setSelectionByExpirationDateTimeArray(int i, com.sap.xi.ap.common.global.GLOBALSelectionByDateTime selectionByExpirationDateTime)
    {
        generatedSetterHelperImpl(selectionByExpirationDateTime, SELECTIONBYEXPIRATIONDATETIME$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByExpirationDateTime" element
     */
    public com.sap.xi.ap.common.global.GLOBALSelectionByDateTime insertNewSelectionByExpirationDateTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.GLOBALSelectionByDateTime target = null;
            target = (com.sap.xi.ap.common.global.GLOBALSelectionByDateTime)get_store().insert_element_user(SELECTIONBYEXPIRATIONDATETIME$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByExpirationDateTime" element
     */
    public com.sap.xi.ap.common.global.GLOBALSelectionByDateTime addNewSelectionByExpirationDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.GLOBALSelectionByDateTime target = null;
            target = (com.sap.xi.ap.common.global.GLOBALSelectionByDateTime)get_store().add_element_user(SELECTIONBYEXPIRATIONDATETIME$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByExpirationDateTime" element
     */
    public void removeSelectionByExpirationDateTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYEXPIRATIONDATETIME$18, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByMaterialKeyProductID" elements
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier[] getSelectionByMaterialKeyProductIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYMATERIALKEYPRODUCTID$20, targetList);
            com.sap.xi.ap.common.global.SelectionByIdentifier[] result = new com.sap.xi.ap.common.global.SelectionByIdentifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByMaterialKeyProductID" element
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier getSelectionByMaterialKeyProductIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByIdentifier target = null;
            target = (com.sap.xi.ap.common.global.SelectionByIdentifier)get_store().find_element_user(SELECTIONBYMATERIALKEYPRODUCTID$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByMaterialKeyProductID" element
     */
    public int sizeOfSelectionByMaterialKeyProductIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYMATERIALKEYPRODUCTID$20);
        }
    }
    
    /**
     * Sets array of all "SelectionByMaterialKeyProductID" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByMaterialKeyProductIDArray(com.sap.xi.ap.common.global.SelectionByIdentifier[] selectionByMaterialKeyProductIDArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByMaterialKeyProductIDArray, SELECTIONBYMATERIALKEYPRODUCTID$20);
    }
    
    /**
     * Sets ith "SelectionByMaterialKeyProductID" element
     */
    public void setSelectionByMaterialKeyProductIDArray(int i, com.sap.xi.ap.common.global.SelectionByIdentifier selectionByMaterialKeyProductID)
    {
        generatedSetterHelperImpl(selectionByMaterialKeyProductID, SELECTIONBYMATERIALKEYPRODUCTID$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByMaterialKeyProductID" element
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier insertNewSelectionByMaterialKeyProductID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByIdentifier target = null;
            target = (com.sap.xi.ap.common.global.SelectionByIdentifier)get_store().insert_element_user(SELECTIONBYMATERIALKEYPRODUCTID$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByMaterialKeyProductID" element
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier addNewSelectionByMaterialKeyProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByIdentifier target = null;
            target = (com.sap.xi.ap.common.global.SelectionByIdentifier)get_store().add_element_user(SELECTIONBYMATERIALKEYPRODUCTID$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByMaterialKeyProductID" element
     */
    public void removeSelectionByMaterialKeyProductID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYMATERIALKEYPRODUCTID$20, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID" elements
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier[] getSelectionByProductRequirementSpecificationKeyRequirementSpecificationIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYPRODUCTREQUIREMENTSPECIFICATIONKEYREQUIREMENTSPECIFICATIONID$22, targetList);
            com.sap.xi.ap.common.global.SelectionByIdentifier[] result = new com.sap.xi.ap.common.global.SelectionByIdentifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID" element
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier getSelectionByProductRequirementSpecificationKeyRequirementSpecificationIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByIdentifier target = null;
            target = (com.sap.xi.ap.common.global.SelectionByIdentifier)get_store().find_element_user(SELECTIONBYPRODUCTREQUIREMENTSPECIFICATIONKEYREQUIREMENTSPECIFICATIONID$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID" element
     */
    public int sizeOfSelectionByProductRequirementSpecificationKeyRequirementSpecificationIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYPRODUCTREQUIREMENTSPECIFICATIONKEYREQUIREMENTSPECIFICATIONID$22);
        }
    }
    
    /**
     * Sets array of all "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByProductRequirementSpecificationKeyRequirementSpecificationIDArray(com.sap.xi.ap.common.global.SelectionByIdentifier[] selectionByProductRequirementSpecificationKeyRequirementSpecificationIDArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByProductRequirementSpecificationKeyRequirementSpecificationIDArray, SELECTIONBYPRODUCTREQUIREMENTSPECIFICATIONKEYREQUIREMENTSPECIFICATIONID$22);
    }
    
    /**
     * Sets ith "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID" element
     */
    public void setSelectionByProductRequirementSpecificationKeyRequirementSpecificationIDArray(int i, com.sap.xi.ap.common.global.SelectionByIdentifier selectionByProductRequirementSpecificationKeyRequirementSpecificationID)
    {
        generatedSetterHelperImpl(selectionByProductRequirementSpecificationKeyRequirementSpecificationID, SELECTIONBYPRODUCTREQUIREMENTSPECIFICATIONKEYREQUIREMENTSPECIFICATIONID$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID" element
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier insertNewSelectionByProductRequirementSpecificationKeyRequirementSpecificationID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByIdentifier target = null;
            target = (com.sap.xi.ap.common.global.SelectionByIdentifier)get_store().insert_element_user(SELECTIONBYPRODUCTREQUIREMENTSPECIFICATIONKEYREQUIREMENTSPECIFICATIONID$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID" element
     */
    public com.sap.xi.ap.common.global.SelectionByIdentifier addNewSelectionByProductRequirementSpecificationKeyRequirementSpecificationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.SelectionByIdentifier target = null;
            target = (com.sap.xi.ap.common.global.SelectionByIdentifier)get_store().add_element_user(SELECTIONBYPRODUCTREQUIREMENTSPECIFICATIONKEYREQUIREMENTSPECIFICATIONID$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID" element
     */
    public void removeSelectionByProductRequirementSpecificationKeyRequirementSpecificationID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYPRODUCTREQUIREMENTSPECIFICATIONKEYREQUIREMENTSPECIFICATIONID$22, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByAdministrativeDataCreationDateTime" elements
     */
    public com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] getSelectionByAdministrativeDataCreationDateTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYADMINISTRATIVEDATACREATIONDATETIME$24, targetList);
            com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] result = new com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByAdministrativeDataCreationDateTime" element
     */
    public com.sap.xi.ap.common.global.GLOBALSelectionByDateTime getSelectionByAdministrativeDataCreationDateTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.GLOBALSelectionByDateTime target = null;
            target = (com.sap.xi.ap.common.global.GLOBALSelectionByDateTime)get_store().find_element_user(SELECTIONBYADMINISTRATIVEDATACREATIONDATETIME$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByAdministrativeDataCreationDateTime" element
     */
    public int sizeOfSelectionByAdministrativeDataCreationDateTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYADMINISTRATIVEDATACREATIONDATETIME$24);
        }
    }
    
    /**
     * Sets array of all "SelectionByAdministrativeDataCreationDateTime" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByAdministrativeDataCreationDateTimeArray(com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] selectionByAdministrativeDataCreationDateTimeArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByAdministrativeDataCreationDateTimeArray, SELECTIONBYADMINISTRATIVEDATACREATIONDATETIME$24);
    }
    
    /**
     * Sets ith "SelectionByAdministrativeDataCreationDateTime" element
     */
    public void setSelectionByAdministrativeDataCreationDateTimeArray(int i, com.sap.xi.ap.common.global.GLOBALSelectionByDateTime selectionByAdministrativeDataCreationDateTime)
    {
        generatedSetterHelperImpl(selectionByAdministrativeDataCreationDateTime, SELECTIONBYADMINISTRATIVEDATACREATIONDATETIME$24, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByAdministrativeDataCreationDateTime" element
     */
    public com.sap.xi.ap.common.global.GLOBALSelectionByDateTime insertNewSelectionByAdministrativeDataCreationDateTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.GLOBALSelectionByDateTime target = null;
            target = (com.sap.xi.ap.common.global.GLOBALSelectionByDateTime)get_store().insert_element_user(SELECTIONBYADMINISTRATIVEDATACREATIONDATETIME$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByAdministrativeDataCreationDateTime" element
     */
    public com.sap.xi.ap.common.global.GLOBALSelectionByDateTime addNewSelectionByAdministrativeDataCreationDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.GLOBALSelectionByDateTime target = null;
            target = (com.sap.xi.ap.common.global.GLOBALSelectionByDateTime)get_store().add_element_user(SELECTIONBYADMINISTRATIVEDATACREATIONDATETIME$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByAdministrativeDataCreationDateTime" element
     */
    public void removeSelectionByAdministrativeDataCreationDateTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYADMINISTRATIVEDATACREATIONDATETIME$24, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByAdministrativeDataLastChangeDateTime" elements
     */
    public com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] getSelectionByAdministrativeDataLastChangeDateTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYADMINISTRATIVEDATALASTCHANGEDATETIME$26, targetList);
            com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] result = new com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByAdministrativeDataLastChangeDateTime" element
     */
    public com.sap.xi.ap.common.global.GLOBALSelectionByDateTime getSelectionByAdministrativeDataLastChangeDateTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.GLOBALSelectionByDateTime target = null;
            target = (com.sap.xi.ap.common.global.GLOBALSelectionByDateTime)get_store().find_element_user(SELECTIONBYADMINISTRATIVEDATALASTCHANGEDATETIME$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByAdministrativeDataLastChangeDateTime" element
     */
    public int sizeOfSelectionByAdministrativeDataLastChangeDateTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYADMINISTRATIVEDATALASTCHANGEDATETIME$26);
        }
    }
    
    /**
     * Sets array of all "SelectionByAdministrativeDataLastChangeDateTime" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByAdministrativeDataLastChangeDateTimeArray(com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] selectionByAdministrativeDataLastChangeDateTimeArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByAdministrativeDataLastChangeDateTimeArray, SELECTIONBYADMINISTRATIVEDATALASTCHANGEDATETIME$26);
    }
    
    /**
     * Sets ith "SelectionByAdministrativeDataLastChangeDateTime" element
     */
    public void setSelectionByAdministrativeDataLastChangeDateTimeArray(int i, com.sap.xi.ap.common.global.GLOBALSelectionByDateTime selectionByAdministrativeDataLastChangeDateTime)
    {
        generatedSetterHelperImpl(selectionByAdministrativeDataLastChangeDateTime, SELECTIONBYADMINISTRATIVEDATALASTCHANGEDATETIME$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByAdministrativeDataLastChangeDateTime" element
     */
    public com.sap.xi.ap.common.global.GLOBALSelectionByDateTime insertNewSelectionByAdministrativeDataLastChangeDateTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.GLOBALSelectionByDateTime target = null;
            target = (com.sap.xi.ap.common.global.GLOBALSelectionByDateTime)get_store().insert_element_user(SELECTIONBYADMINISTRATIVEDATALASTCHANGEDATETIME$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByAdministrativeDataLastChangeDateTime" element
     */
    public com.sap.xi.ap.common.global.GLOBALSelectionByDateTime addNewSelectionByAdministrativeDataLastChangeDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.GLOBALSelectionByDateTime target = null;
            target = (com.sap.xi.ap.common.global.GLOBALSelectionByDateTime)get_store().add_element_user(SELECTIONBYADMINISTRATIVEDATALASTCHANGEDATETIME$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByAdministrativeDataLastChangeDateTime" element
     */
    public void removeSelectionByAdministrativeDataLastChangeDateTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYADMINISTRATIVEDATALASTCHANGEDATETIME$26, i);
        }
    }
    
    /**
     * Gets the "selectionByBatchManagedIndicator" element
     */
    public boolean getSelectionByBatchManagedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELECTIONBYBATCHMANAGEDINDICATOR$28, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "selectionByBatchManagedIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetSelectionByBatchManagedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(SELECTIONBYBATCHMANAGEDINDICATOR$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "selectionByBatchManagedIndicator" element
     */
    public boolean isSetSelectionByBatchManagedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYBATCHMANAGEDINDICATOR$28) != 0;
        }
    }
    
    /**
     * Sets the "selectionByBatchManagedIndicator" element
     */
    public void setSelectionByBatchManagedIndicator(boolean selectionByBatchManagedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SELECTIONBYBATCHMANAGEDINDICATOR$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SELECTIONBYBATCHMANAGEDINDICATOR$28);
            }
            target.setBooleanValue(selectionByBatchManagedIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "selectionByBatchManagedIndicator" element
     */
    public void xsetSelectionByBatchManagedIndicator(com.sap.xi.ap.common.gdt.Indicator selectionByBatchManagedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(SELECTIONBYBATCHMANAGEDINDICATOR$28, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(SELECTIONBYBATCHMANAGEDINDICATOR$28);
            }
            target.set(selectionByBatchManagedIndicator);
        }
    }
    
    /**
     * Unsets the "selectionByBatchManagedIndicator" element
     */
    public void unsetSelectionByBatchManagedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYBATCHMANAGEDINDICATOR$28, 0);
        }
    }
}
