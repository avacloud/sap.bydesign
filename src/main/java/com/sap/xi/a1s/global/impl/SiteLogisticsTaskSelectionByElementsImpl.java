/*
 * XML Type:  SiteLogisticsTaskSelectionByElements
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML SiteLogisticsTaskSelectionByElements(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class SiteLogisticsTaskSelectionByElementsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements
{
    private static final long serialVersionUID = 1L;
    
    public SiteLogisticsTaskSelectionByElementsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELECTIONBYSITELOGISTICSTASKID$0 = 
        new javax.xml.namespace.QName("", "SelectionBySiteLogisticsTaskID");
    private static final javax.xml.namespace.QName SELECTIONBYREFERENCEDOCUMENTID$2 = 
        new javax.xml.namespace.QName("", "SelectionByReferenceDocumentID");
    private static final javax.xml.namespace.QName SELECTIONBYREFERENCEDOCUMENTTYPECODE$4 = 
        new javax.xml.namespace.QName("", "SelectionByReferenceDocumentTypeCode");
    private static final javax.xml.namespace.QName SELECTIONBYPROCESSTYPECODE$6 = 
        new javax.xml.namespace.QName("", "SelectionByProcessTypeCode");
    private static final javax.xml.namespace.QName SELECTIONBYMATERIALDESCRIPTION$8 = 
        new javax.xml.namespace.QName("", "SelectionByMaterialDescription");
    private static final javax.xml.namespace.QName SELECTIONBYBARCODETEXT$10 = 
        new javax.xml.namespace.QName("", "SelectionByBarCodeText");
    private static final javax.xml.namespace.QName SELECTIONBYLABELID$12 = 
        new javax.xml.namespace.QName("", "SelectionByLabelID");
    private static final javax.xml.namespace.QName SELECTIONBYRESPONSIBLEEMPLOYEEID$14 = 
        new javax.xml.namespace.QName("", "SelectionByResponsibleEmployeeID");
    private static final javax.xml.namespace.QName SELECTIONBYPROCESSINGSTATUSCODE$16 = 
        new javax.xml.namespace.QName("", "SelectionByProcessingStatusCode");
    private static final javax.xml.namespace.QName SELECTIONBYSITEID$18 = 
        new javax.xml.namespace.QName("", "SelectionBySiteID");
    
    
    /**
     * Gets array of all "SelectionBySiteLogisticsTaskID" elements
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId[] getSelectionBySiteLogisticsTaskIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYSITELOGISTICSTASKID$0, targetList);
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId[] result = new com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionBySiteLogisticsTaskID" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId getSelectionBySiteLogisticsTaskIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId)get_store().find_element_user(SELECTIONBYSITELOGISTICSTASKID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionBySiteLogisticsTaskID" element
     */
    public int sizeOfSelectionBySiteLogisticsTaskIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYSITELOGISTICSTASKID$0);
        }
    }
    
    /**
     * Sets array of all "SelectionBySiteLogisticsTaskID" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionBySiteLogisticsTaskIDArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId[] selectionBySiteLogisticsTaskIDArray)
    {
        check_orphaned();
        arraySetterHelper(selectionBySiteLogisticsTaskIDArray, SELECTIONBYSITELOGISTICSTASKID$0);
    }
    
    /**
     * Sets ith "SelectionBySiteLogisticsTaskID" element
     */
    public void setSelectionBySiteLogisticsTaskIDArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId selectionBySiteLogisticsTaskID)
    {
        generatedSetterHelperImpl(selectionBySiteLogisticsTaskID, SELECTIONBYSITELOGISTICSTASKID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionBySiteLogisticsTaskID" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId insertNewSelectionBySiteLogisticsTaskID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId)get_store().insert_element_user(SELECTIONBYSITELOGISTICSTASKID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionBySiteLogisticsTaskID" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId addNewSelectionBySiteLogisticsTaskID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId)get_store().add_element_user(SELECTIONBYSITELOGISTICSTASKID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionBySiteLogisticsTaskID" element
     */
    public void removeSelectionBySiteLogisticsTaskID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYSITELOGISTICSTASKID$0, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByReferenceDocumentID" elements
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID[] getSelectionByReferenceDocumentIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYREFERENCEDOCUMENTID$2, targetList);
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID[] result = new com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByReferenceDocumentID" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID getSelectionByReferenceDocumentIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID)get_store().find_element_user(SELECTIONBYREFERENCEDOCUMENTID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByReferenceDocumentID" element
     */
    public int sizeOfSelectionByReferenceDocumentIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYREFERENCEDOCUMENTID$2);
        }
    }
    
    /**
     * Sets array of all "SelectionByReferenceDocumentID" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByReferenceDocumentIDArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID[] selectionByReferenceDocumentIDArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByReferenceDocumentIDArray, SELECTIONBYREFERENCEDOCUMENTID$2);
    }
    
    /**
     * Sets ith "SelectionByReferenceDocumentID" element
     */
    public void setSelectionByReferenceDocumentIDArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID selectionByReferenceDocumentID)
    {
        generatedSetterHelperImpl(selectionByReferenceDocumentID, SELECTIONBYREFERENCEDOCUMENTID$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByReferenceDocumentID" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID insertNewSelectionByReferenceDocumentID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID)get_store().insert_element_user(SELECTIONBYREFERENCEDOCUMENTID$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByReferenceDocumentID" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID addNewSelectionByReferenceDocumentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID)get_store().add_element_user(SELECTIONBYREFERENCEDOCUMENTID$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByReferenceDocumentID" element
     */
    public void removeSelectionByReferenceDocumentID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYREFERENCEDOCUMENTID$2, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByReferenceDocumentTypeCode" elements
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode[] getSelectionByReferenceDocumentTypeCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYREFERENCEDOCUMENTTYPECODE$4, targetList);
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode[] result = new com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByReferenceDocumentTypeCode" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode getSelectionByReferenceDocumentTypeCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode)get_store().find_element_user(SELECTIONBYREFERENCEDOCUMENTTYPECODE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByReferenceDocumentTypeCode" element
     */
    public int sizeOfSelectionByReferenceDocumentTypeCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYREFERENCEDOCUMENTTYPECODE$4);
        }
    }
    
    /**
     * Sets array of all "SelectionByReferenceDocumentTypeCode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByReferenceDocumentTypeCodeArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode[] selectionByReferenceDocumentTypeCodeArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByReferenceDocumentTypeCodeArray, SELECTIONBYREFERENCEDOCUMENTTYPECODE$4);
    }
    
    /**
     * Sets ith "SelectionByReferenceDocumentTypeCode" element
     */
    public void setSelectionByReferenceDocumentTypeCodeArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode selectionByReferenceDocumentTypeCode)
    {
        generatedSetterHelperImpl(selectionByReferenceDocumentTypeCode, SELECTIONBYREFERENCEDOCUMENTTYPECODE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByReferenceDocumentTypeCode" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode insertNewSelectionByReferenceDocumentTypeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode)get_store().insert_element_user(SELECTIONBYREFERENCEDOCUMENTTYPECODE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByReferenceDocumentTypeCode" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode addNewSelectionByReferenceDocumentTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode)get_store().add_element_user(SELECTIONBYREFERENCEDOCUMENTTYPECODE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByReferenceDocumentTypeCode" element
     */
    public void removeSelectionByReferenceDocumentTypeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYREFERENCEDOCUMENTTYPECODE$4, i);
        }
    }
    
    /**
     * Gets the "SelectionByProcessTypeCode" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessTypeCode getSelectionByProcessTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessTypeCode target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessTypeCode)get_store().find_element_user(SELECTIONBYPROCESSTYPECODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SelectionByProcessTypeCode" element
     */
    public boolean isSetSelectionByProcessTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYPROCESSTYPECODE$6) != 0;
        }
    }
    
    /**
     * Sets the "SelectionByProcessTypeCode" element
     */
    public void setSelectionByProcessTypeCode(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessTypeCode selectionByProcessTypeCode)
    {
        generatedSetterHelperImpl(selectionByProcessTypeCode, SELECTIONBYPROCESSTYPECODE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SelectionByProcessTypeCode" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessTypeCode addNewSelectionByProcessTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessTypeCode target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessTypeCode)get_store().add_element_user(SELECTIONBYPROCESSTYPECODE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "SelectionByProcessTypeCode" element
     */
    public void unsetSelectionByProcessTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYPROCESSTYPECODE$6, 0);
        }
    }
    
    /**
     * Gets array of all "SelectionByMaterialDescription" elements
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription[] getSelectionByMaterialDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYMATERIALDESCRIPTION$8, targetList);
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription[] result = new com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByMaterialDescription" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription getSelectionByMaterialDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription)get_store().find_element_user(SELECTIONBYMATERIALDESCRIPTION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByMaterialDescription" element
     */
    public int sizeOfSelectionByMaterialDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYMATERIALDESCRIPTION$8);
        }
    }
    
    /**
     * Sets array of all "SelectionByMaterialDescription" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByMaterialDescriptionArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription[] selectionByMaterialDescriptionArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByMaterialDescriptionArray, SELECTIONBYMATERIALDESCRIPTION$8);
    }
    
    /**
     * Sets ith "SelectionByMaterialDescription" element
     */
    public void setSelectionByMaterialDescriptionArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription selectionByMaterialDescription)
    {
        generatedSetterHelperImpl(selectionByMaterialDescription, SELECTIONBYMATERIALDESCRIPTION$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByMaterialDescription" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription insertNewSelectionByMaterialDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription)get_store().insert_element_user(SELECTIONBYMATERIALDESCRIPTION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByMaterialDescription" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription addNewSelectionByMaterialDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription)get_store().add_element_user(SELECTIONBYMATERIALDESCRIPTION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByMaterialDescription" element
     */
    public void removeSelectionByMaterialDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYMATERIALDESCRIPTION$8, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByBarCodeText" elements
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText[] getSelectionByBarCodeTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYBARCODETEXT$10, targetList);
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText[] result = new com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByBarCodeText" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText getSelectionByBarCodeTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText)get_store().find_element_user(SELECTIONBYBARCODETEXT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByBarCodeText" element
     */
    public int sizeOfSelectionByBarCodeTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYBARCODETEXT$10);
        }
    }
    
    /**
     * Sets array of all "SelectionByBarCodeText" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByBarCodeTextArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText[] selectionByBarCodeTextArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByBarCodeTextArray, SELECTIONBYBARCODETEXT$10);
    }
    
    /**
     * Sets ith "SelectionByBarCodeText" element
     */
    public void setSelectionByBarCodeTextArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText selectionByBarCodeText)
    {
        generatedSetterHelperImpl(selectionByBarCodeText, SELECTIONBYBARCODETEXT$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByBarCodeText" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText insertNewSelectionByBarCodeText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText)get_store().insert_element_user(SELECTIONBYBARCODETEXT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByBarCodeText" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText addNewSelectionByBarCodeText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText)get_store().add_element_user(SELECTIONBYBARCODETEXT$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByBarCodeText" element
     */
    public void removeSelectionByBarCodeText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYBARCODETEXT$10, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByLabelID" elements
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID[] getSelectionByLabelIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYLABELID$12, targetList);
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID[] result = new com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByLabelID" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID getSelectionByLabelIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID)get_store().find_element_user(SELECTIONBYLABELID$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByLabelID" element
     */
    public int sizeOfSelectionByLabelIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYLABELID$12);
        }
    }
    
    /**
     * Sets array of all "SelectionByLabelID" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByLabelIDArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID[] selectionByLabelIDArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByLabelIDArray, SELECTIONBYLABELID$12);
    }
    
    /**
     * Sets ith "SelectionByLabelID" element
     */
    public void setSelectionByLabelIDArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID selectionByLabelID)
    {
        generatedSetterHelperImpl(selectionByLabelID, SELECTIONBYLABELID$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByLabelID" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID insertNewSelectionByLabelID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID)get_store().insert_element_user(SELECTIONBYLABELID$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByLabelID" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID addNewSelectionByLabelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID)get_store().add_element_user(SELECTIONBYLABELID$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByLabelID" element
     */
    public void removeSelectionByLabelID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYLABELID$12, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByResponsibleEmployeeID" elements
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID[] getSelectionByResponsibleEmployeeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYRESPONSIBLEEMPLOYEEID$14, targetList);
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID[] result = new com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByResponsibleEmployeeID" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID getSelectionByResponsibleEmployeeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID)get_store().find_element_user(SELECTIONBYRESPONSIBLEEMPLOYEEID$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByResponsibleEmployeeID" element
     */
    public int sizeOfSelectionByResponsibleEmployeeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYRESPONSIBLEEMPLOYEEID$14);
        }
    }
    
    /**
     * Sets array of all "SelectionByResponsibleEmployeeID" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByResponsibleEmployeeIDArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID[] selectionByResponsibleEmployeeIDArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByResponsibleEmployeeIDArray, SELECTIONBYRESPONSIBLEEMPLOYEEID$14);
    }
    
    /**
     * Sets ith "SelectionByResponsibleEmployeeID" element
     */
    public void setSelectionByResponsibleEmployeeIDArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID selectionByResponsibleEmployeeID)
    {
        generatedSetterHelperImpl(selectionByResponsibleEmployeeID, SELECTIONBYRESPONSIBLEEMPLOYEEID$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByResponsibleEmployeeID" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID insertNewSelectionByResponsibleEmployeeID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID)get_store().insert_element_user(SELECTIONBYRESPONSIBLEEMPLOYEEID$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByResponsibleEmployeeID" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID addNewSelectionByResponsibleEmployeeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID)get_store().add_element_user(SELECTIONBYRESPONSIBLEEMPLOYEEID$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByResponsibleEmployeeID" element
     */
    public void removeSelectionByResponsibleEmployeeID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYRESPONSIBLEEMPLOYEEID$14, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByProcessingStatusCode" elements
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode[] getSelectionByProcessingStatusCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYPROCESSINGSTATUSCODE$16, targetList);
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode[] result = new com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByProcessingStatusCode" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode getSelectionByProcessingStatusCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode)get_store().find_element_user(SELECTIONBYPROCESSINGSTATUSCODE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByProcessingStatusCode" element
     */
    public int sizeOfSelectionByProcessingStatusCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYPROCESSINGSTATUSCODE$16);
        }
    }
    
    /**
     * Sets array of all "SelectionByProcessingStatusCode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByProcessingStatusCodeArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode[] selectionByProcessingStatusCodeArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByProcessingStatusCodeArray, SELECTIONBYPROCESSINGSTATUSCODE$16);
    }
    
    /**
     * Sets ith "SelectionByProcessingStatusCode" element
     */
    public void setSelectionByProcessingStatusCodeArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode selectionByProcessingStatusCode)
    {
        generatedSetterHelperImpl(selectionByProcessingStatusCode, SELECTIONBYPROCESSINGSTATUSCODE$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByProcessingStatusCode" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode insertNewSelectionByProcessingStatusCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode)get_store().insert_element_user(SELECTIONBYPROCESSINGSTATUSCODE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByProcessingStatusCode" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode addNewSelectionByProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode)get_store().add_element_user(SELECTIONBYPROCESSINGSTATUSCODE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByProcessingStatusCode" element
     */
    public void removeSelectionByProcessingStatusCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYPROCESSINGSTATUSCODE$16, i);
        }
    }
    
    /**
     * Gets array of all "SelectionBySiteID" elements
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID[] getSelectionBySiteIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYSITEID$18, targetList);
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID[] result = new com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionBySiteID" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID getSelectionBySiteIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID)get_store().find_element_user(SELECTIONBYSITEID$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionBySiteID" element
     */
    public int sizeOfSelectionBySiteIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYSITEID$18);
        }
    }
    
    /**
     * Sets array of all "SelectionBySiteID" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionBySiteIDArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID[] selectionBySiteIDArray)
    {
        check_orphaned();
        arraySetterHelper(selectionBySiteIDArray, SELECTIONBYSITEID$18);
    }
    
    /**
     * Sets ith "SelectionBySiteID" element
     */
    public void setSelectionBySiteIDArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID selectionBySiteID)
    {
        generatedSetterHelperImpl(selectionBySiteID, SELECTIONBYSITEID$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionBySiteID" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID insertNewSelectionBySiteID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID)get_store().insert_element_user(SELECTIONBYSITEID$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionBySiteID" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID addNewSelectionBySiteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID)get_store().add_element_user(SELECTIONBYSITEID$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionBySiteID" element
     */
    public void removeSelectionBySiteID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYSITEID$18, i);
        }
    }
}
