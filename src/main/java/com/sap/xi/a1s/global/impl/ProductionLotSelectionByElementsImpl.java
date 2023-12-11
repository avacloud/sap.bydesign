/*
 * XML Type:  ProductionLotSelectionByElements
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotSelectionByElements
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotSelectionByElements(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotSelectionByElementsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotSelectionByElements
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotSelectionByElementsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELECTIONBYPRODUCTIONLOTID$0 = 
        new javax.xml.namespace.QName("", "SelectionByProductionLotID");
    private static final javax.xml.namespace.QName SELECTIONBYPRODUCTIONORDERID$2 = 
        new javax.xml.namespace.QName("", "SelectionByProductionOrderID");
    private static final javax.xml.namespace.QName SELECTIONBYPRODUCTIONREQUESTID$4 = 
        new javax.xml.namespace.QName("", "SelectionByProductionRequestID");
    private static final javax.xml.namespace.QName SELECTIONBYPRODUCTIONLOTSTATUSCODE$6 = 
        new javax.xml.namespace.QName("", "SelectionByProductionLotStatusCode");
    private static final javax.xml.namespace.QName SELECTIONBYOUTPUTPRODUCTID$8 = 
        new javax.xml.namespace.QName("", "SelectionByOutputProductID");
    private static final javax.xml.namespace.QName SELECTIONBYSITEID$10 = 
        new javax.xml.namespace.QName("", "SelectionBySiteID");
    private static final javax.xml.namespace.QName SELECTIONBYPRODUCTIONLOTCREATIONDATETIME$12 = 
        new javax.xml.namespace.QName("", "SelectionByProductionLotCreationDateTime");
    private static final javax.xml.namespace.QName SELECTIONBYPRODUCTIONLOTLASTCHANGEDATETIME$14 = 
        new javax.xml.namespace.QName("", "SelectionByProductionLotLastChangeDateTime");
    
    
    /**
     * Gets array of all "SelectionByProductionLotID" elements
     */
    public com.sap.xi.a1s.global.ProductionLotSelectionByLotID[] getSelectionByProductionLotIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYPRODUCTIONLOTID$0, targetList);
            com.sap.xi.a1s.global.ProductionLotSelectionByLotID[] result = new com.sap.xi.a1s.global.ProductionLotSelectionByLotID[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByProductionLotID" element
     */
    public com.sap.xi.a1s.global.ProductionLotSelectionByLotID getSelectionByProductionLotIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSelectionByLotID target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSelectionByLotID)get_store().find_element_user(SELECTIONBYPRODUCTIONLOTID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByProductionLotID" element
     */
    public int sizeOfSelectionByProductionLotIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYPRODUCTIONLOTID$0);
        }
    }
    
    /**
     * Sets array of all "SelectionByProductionLotID" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByProductionLotIDArray(com.sap.xi.a1s.global.ProductionLotSelectionByLotID[] selectionByProductionLotIDArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByProductionLotIDArray, SELECTIONBYPRODUCTIONLOTID$0);
    }
    
    /**
     * Sets ith "SelectionByProductionLotID" element
     */
    public void setSelectionByProductionLotIDArray(int i, com.sap.xi.a1s.global.ProductionLotSelectionByLotID selectionByProductionLotID)
    {
        generatedSetterHelperImpl(selectionByProductionLotID, SELECTIONBYPRODUCTIONLOTID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByProductionLotID" element
     */
    public com.sap.xi.a1s.global.ProductionLotSelectionByLotID insertNewSelectionByProductionLotID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSelectionByLotID target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSelectionByLotID)get_store().insert_element_user(SELECTIONBYPRODUCTIONLOTID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByProductionLotID" element
     */
    public com.sap.xi.a1s.global.ProductionLotSelectionByLotID addNewSelectionByProductionLotID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSelectionByLotID target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSelectionByLotID)get_store().add_element_user(SELECTIONBYPRODUCTIONLOTID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByProductionLotID" element
     */
    public void removeSelectionByProductionLotID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYPRODUCTIONLOTID$0, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByProductionOrderID" elements
     */
    public com.sap.xi.a1s.global.ProductionLotSelectionByProductionOrderID[] getSelectionByProductionOrderIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYPRODUCTIONORDERID$2, targetList);
            com.sap.xi.a1s.global.ProductionLotSelectionByProductionOrderID[] result = new com.sap.xi.a1s.global.ProductionLotSelectionByProductionOrderID[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByProductionOrderID" element
     */
    public com.sap.xi.a1s.global.ProductionLotSelectionByProductionOrderID getSelectionByProductionOrderIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSelectionByProductionOrderID target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSelectionByProductionOrderID)get_store().find_element_user(SELECTIONBYPRODUCTIONORDERID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByProductionOrderID" element
     */
    public int sizeOfSelectionByProductionOrderIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYPRODUCTIONORDERID$2);
        }
    }
    
    /**
     * Sets array of all "SelectionByProductionOrderID" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByProductionOrderIDArray(com.sap.xi.a1s.global.ProductionLotSelectionByProductionOrderID[] selectionByProductionOrderIDArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByProductionOrderIDArray, SELECTIONBYPRODUCTIONORDERID$2);
    }
    
    /**
     * Sets ith "SelectionByProductionOrderID" element
     */
    public void setSelectionByProductionOrderIDArray(int i, com.sap.xi.a1s.global.ProductionLotSelectionByProductionOrderID selectionByProductionOrderID)
    {
        generatedSetterHelperImpl(selectionByProductionOrderID, SELECTIONBYPRODUCTIONORDERID$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByProductionOrderID" element
     */
    public com.sap.xi.a1s.global.ProductionLotSelectionByProductionOrderID insertNewSelectionByProductionOrderID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSelectionByProductionOrderID target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSelectionByProductionOrderID)get_store().insert_element_user(SELECTIONBYPRODUCTIONORDERID$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByProductionOrderID" element
     */
    public com.sap.xi.a1s.global.ProductionLotSelectionByProductionOrderID addNewSelectionByProductionOrderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSelectionByProductionOrderID target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSelectionByProductionOrderID)get_store().add_element_user(SELECTIONBYPRODUCTIONORDERID$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByProductionOrderID" element
     */
    public void removeSelectionByProductionOrderID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYPRODUCTIONORDERID$2, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByProductionRequestID" elements
     */
    public com.sap.xi.a1s.global.ProductionLotSelectByProductionRequestID[] getSelectionByProductionRequestIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYPRODUCTIONREQUESTID$4, targetList);
            com.sap.xi.a1s.global.ProductionLotSelectByProductionRequestID[] result = new com.sap.xi.a1s.global.ProductionLotSelectByProductionRequestID[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByProductionRequestID" element
     */
    public com.sap.xi.a1s.global.ProductionLotSelectByProductionRequestID getSelectionByProductionRequestIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSelectByProductionRequestID target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSelectByProductionRequestID)get_store().find_element_user(SELECTIONBYPRODUCTIONREQUESTID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByProductionRequestID" element
     */
    public int sizeOfSelectionByProductionRequestIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYPRODUCTIONREQUESTID$4);
        }
    }
    
    /**
     * Sets array of all "SelectionByProductionRequestID" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByProductionRequestIDArray(com.sap.xi.a1s.global.ProductionLotSelectByProductionRequestID[] selectionByProductionRequestIDArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByProductionRequestIDArray, SELECTIONBYPRODUCTIONREQUESTID$4);
    }
    
    /**
     * Sets ith "SelectionByProductionRequestID" element
     */
    public void setSelectionByProductionRequestIDArray(int i, com.sap.xi.a1s.global.ProductionLotSelectByProductionRequestID selectionByProductionRequestID)
    {
        generatedSetterHelperImpl(selectionByProductionRequestID, SELECTIONBYPRODUCTIONREQUESTID$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByProductionRequestID" element
     */
    public com.sap.xi.a1s.global.ProductionLotSelectByProductionRequestID insertNewSelectionByProductionRequestID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSelectByProductionRequestID target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSelectByProductionRequestID)get_store().insert_element_user(SELECTIONBYPRODUCTIONREQUESTID$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByProductionRequestID" element
     */
    public com.sap.xi.a1s.global.ProductionLotSelectByProductionRequestID addNewSelectionByProductionRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSelectByProductionRequestID target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSelectByProductionRequestID)get_store().add_element_user(SELECTIONBYPRODUCTIONREQUESTID$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByProductionRequestID" element
     */
    public void removeSelectionByProductionRequestID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYPRODUCTIONREQUESTID$4, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByProductionLotStatusCode" elements
     */
    public com.sap.xi.a1s.global.ProductionLotSelectionByLifeCycleStatusCode[] getSelectionByProductionLotStatusCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYPRODUCTIONLOTSTATUSCODE$6, targetList);
            com.sap.xi.a1s.global.ProductionLotSelectionByLifeCycleStatusCode[] result = new com.sap.xi.a1s.global.ProductionLotSelectionByLifeCycleStatusCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByProductionLotStatusCode" element
     */
    public com.sap.xi.a1s.global.ProductionLotSelectionByLifeCycleStatusCode getSelectionByProductionLotStatusCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSelectionByLifeCycleStatusCode target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSelectionByLifeCycleStatusCode)get_store().find_element_user(SELECTIONBYPRODUCTIONLOTSTATUSCODE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByProductionLotStatusCode" element
     */
    public int sizeOfSelectionByProductionLotStatusCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYPRODUCTIONLOTSTATUSCODE$6);
        }
    }
    
    /**
     * Sets array of all "SelectionByProductionLotStatusCode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByProductionLotStatusCodeArray(com.sap.xi.a1s.global.ProductionLotSelectionByLifeCycleStatusCode[] selectionByProductionLotStatusCodeArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByProductionLotStatusCodeArray, SELECTIONBYPRODUCTIONLOTSTATUSCODE$6);
    }
    
    /**
     * Sets ith "SelectionByProductionLotStatusCode" element
     */
    public void setSelectionByProductionLotStatusCodeArray(int i, com.sap.xi.a1s.global.ProductionLotSelectionByLifeCycleStatusCode selectionByProductionLotStatusCode)
    {
        generatedSetterHelperImpl(selectionByProductionLotStatusCode, SELECTIONBYPRODUCTIONLOTSTATUSCODE$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByProductionLotStatusCode" element
     */
    public com.sap.xi.a1s.global.ProductionLotSelectionByLifeCycleStatusCode insertNewSelectionByProductionLotStatusCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSelectionByLifeCycleStatusCode target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSelectionByLifeCycleStatusCode)get_store().insert_element_user(SELECTIONBYPRODUCTIONLOTSTATUSCODE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByProductionLotStatusCode" element
     */
    public com.sap.xi.a1s.global.ProductionLotSelectionByLifeCycleStatusCode addNewSelectionByProductionLotStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSelectionByLifeCycleStatusCode target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSelectionByLifeCycleStatusCode)get_store().add_element_user(SELECTIONBYPRODUCTIONLOTSTATUSCODE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByProductionLotStatusCode" element
     */
    public void removeSelectionByProductionLotStatusCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYPRODUCTIONLOTSTATUSCODE$6, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByOutputProductID" elements
     */
    public com.sap.xi.a1s.global.ProductionLotQueryByOutputMaterial[] getSelectionByOutputProductIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYOUTPUTPRODUCTID$8, targetList);
            com.sap.xi.a1s.global.ProductionLotQueryByOutputMaterial[] result = new com.sap.xi.a1s.global.ProductionLotQueryByOutputMaterial[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByOutputProductID" element
     */
    public com.sap.xi.a1s.global.ProductionLotQueryByOutputMaterial getSelectionByOutputProductIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotQueryByOutputMaterial target = null;
            target = (com.sap.xi.a1s.global.ProductionLotQueryByOutputMaterial)get_store().find_element_user(SELECTIONBYOUTPUTPRODUCTID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByOutputProductID" element
     */
    public int sizeOfSelectionByOutputProductIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYOUTPUTPRODUCTID$8);
        }
    }
    
    /**
     * Sets array of all "SelectionByOutputProductID" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByOutputProductIDArray(com.sap.xi.a1s.global.ProductionLotQueryByOutputMaterial[] selectionByOutputProductIDArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByOutputProductIDArray, SELECTIONBYOUTPUTPRODUCTID$8);
    }
    
    /**
     * Sets ith "SelectionByOutputProductID" element
     */
    public void setSelectionByOutputProductIDArray(int i, com.sap.xi.a1s.global.ProductionLotQueryByOutputMaterial selectionByOutputProductID)
    {
        generatedSetterHelperImpl(selectionByOutputProductID, SELECTIONBYOUTPUTPRODUCTID$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByOutputProductID" element
     */
    public com.sap.xi.a1s.global.ProductionLotQueryByOutputMaterial insertNewSelectionByOutputProductID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotQueryByOutputMaterial target = null;
            target = (com.sap.xi.a1s.global.ProductionLotQueryByOutputMaterial)get_store().insert_element_user(SELECTIONBYOUTPUTPRODUCTID$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByOutputProductID" element
     */
    public com.sap.xi.a1s.global.ProductionLotQueryByOutputMaterial addNewSelectionByOutputProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotQueryByOutputMaterial target = null;
            target = (com.sap.xi.a1s.global.ProductionLotQueryByOutputMaterial)get_store().add_element_user(SELECTIONBYOUTPUTPRODUCTID$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByOutputProductID" element
     */
    public void removeSelectionByOutputProductID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYOUTPUTPRODUCTID$8, i);
        }
    }
    
    /**
     * Gets array of all "SelectionBySiteID" elements
     */
    public com.sap.xi.a1s.global.ProductionLotSelectBySiteID[] getSelectionBySiteIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYSITEID$10, targetList);
            com.sap.xi.a1s.global.ProductionLotSelectBySiteID[] result = new com.sap.xi.a1s.global.ProductionLotSelectBySiteID[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionBySiteID" element
     */
    public com.sap.xi.a1s.global.ProductionLotSelectBySiteID getSelectionBySiteIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSelectBySiteID target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSelectBySiteID)get_store().find_element_user(SELECTIONBYSITEID$10, i);
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
            return get_store().count_elements(SELECTIONBYSITEID$10);
        }
    }
    
    /**
     * Sets array of all "SelectionBySiteID" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionBySiteIDArray(com.sap.xi.a1s.global.ProductionLotSelectBySiteID[] selectionBySiteIDArray)
    {
        check_orphaned();
        arraySetterHelper(selectionBySiteIDArray, SELECTIONBYSITEID$10);
    }
    
    /**
     * Sets ith "SelectionBySiteID" element
     */
    public void setSelectionBySiteIDArray(int i, com.sap.xi.a1s.global.ProductionLotSelectBySiteID selectionBySiteID)
    {
        generatedSetterHelperImpl(selectionBySiteID, SELECTIONBYSITEID$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionBySiteID" element
     */
    public com.sap.xi.a1s.global.ProductionLotSelectBySiteID insertNewSelectionBySiteID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSelectBySiteID target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSelectBySiteID)get_store().insert_element_user(SELECTIONBYSITEID$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionBySiteID" element
     */
    public com.sap.xi.a1s.global.ProductionLotSelectBySiteID addNewSelectionBySiteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSelectBySiteID target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSelectBySiteID)get_store().add_element_user(SELECTIONBYSITEID$10);
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
            get_store().remove_element(SELECTIONBYSITEID$10, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByProductionLotCreationDateTime" elements
     */
    public com.sap.xi.a1s.global.SelectionByProductionLotDates[] getSelectionByProductionLotCreationDateTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYPRODUCTIONLOTCREATIONDATETIME$12, targetList);
            com.sap.xi.a1s.global.SelectionByProductionLotDates[] result = new com.sap.xi.a1s.global.SelectionByProductionLotDates[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByProductionLotCreationDateTime" element
     */
    public com.sap.xi.a1s.global.SelectionByProductionLotDates getSelectionByProductionLotCreationDateTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SelectionByProductionLotDates target = null;
            target = (com.sap.xi.a1s.global.SelectionByProductionLotDates)get_store().find_element_user(SELECTIONBYPRODUCTIONLOTCREATIONDATETIME$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByProductionLotCreationDateTime" element
     */
    public int sizeOfSelectionByProductionLotCreationDateTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYPRODUCTIONLOTCREATIONDATETIME$12);
        }
    }
    
    /**
     * Sets array of all "SelectionByProductionLotCreationDateTime" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByProductionLotCreationDateTimeArray(com.sap.xi.a1s.global.SelectionByProductionLotDates[] selectionByProductionLotCreationDateTimeArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByProductionLotCreationDateTimeArray, SELECTIONBYPRODUCTIONLOTCREATIONDATETIME$12);
    }
    
    /**
     * Sets ith "SelectionByProductionLotCreationDateTime" element
     */
    public void setSelectionByProductionLotCreationDateTimeArray(int i, com.sap.xi.a1s.global.SelectionByProductionLotDates selectionByProductionLotCreationDateTime)
    {
        generatedSetterHelperImpl(selectionByProductionLotCreationDateTime, SELECTIONBYPRODUCTIONLOTCREATIONDATETIME$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByProductionLotCreationDateTime" element
     */
    public com.sap.xi.a1s.global.SelectionByProductionLotDates insertNewSelectionByProductionLotCreationDateTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SelectionByProductionLotDates target = null;
            target = (com.sap.xi.a1s.global.SelectionByProductionLotDates)get_store().insert_element_user(SELECTIONBYPRODUCTIONLOTCREATIONDATETIME$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByProductionLotCreationDateTime" element
     */
    public com.sap.xi.a1s.global.SelectionByProductionLotDates addNewSelectionByProductionLotCreationDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SelectionByProductionLotDates target = null;
            target = (com.sap.xi.a1s.global.SelectionByProductionLotDates)get_store().add_element_user(SELECTIONBYPRODUCTIONLOTCREATIONDATETIME$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByProductionLotCreationDateTime" element
     */
    public void removeSelectionByProductionLotCreationDateTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYPRODUCTIONLOTCREATIONDATETIME$12, i);
        }
    }
    
    /**
     * Gets array of all "SelectionByProductionLotLastChangeDateTime" elements
     */
    public com.sap.xi.a1s.global.SelectionByProductionLotDates[] getSelectionByProductionLotLastChangeDateTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECTIONBYPRODUCTIONLOTLASTCHANGEDATETIME$14, targetList);
            com.sap.xi.a1s.global.SelectionByProductionLotDates[] result = new com.sap.xi.a1s.global.SelectionByProductionLotDates[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SelectionByProductionLotLastChangeDateTime" element
     */
    public com.sap.xi.a1s.global.SelectionByProductionLotDates getSelectionByProductionLotLastChangeDateTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SelectionByProductionLotDates target = null;
            target = (com.sap.xi.a1s.global.SelectionByProductionLotDates)get_store().find_element_user(SELECTIONBYPRODUCTIONLOTLASTCHANGEDATETIME$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SelectionByProductionLotLastChangeDateTime" element
     */
    public int sizeOfSelectionByProductionLotLastChangeDateTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTIONBYPRODUCTIONLOTLASTCHANGEDATETIME$14);
        }
    }
    
    /**
     * Sets array of all "SelectionByProductionLotLastChangeDateTime" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectionByProductionLotLastChangeDateTimeArray(com.sap.xi.a1s.global.SelectionByProductionLotDates[] selectionByProductionLotLastChangeDateTimeArray)
    {
        check_orphaned();
        arraySetterHelper(selectionByProductionLotLastChangeDateTimeArray, SELECTIONBYPRODUCTIONLOTLASTCHANGEDATETIME$14);
    }
    
    /**
     * Sets ith "SelectionByProductionLotLastChangeDateTime" element
     */
    public void setSelectionByProductionLotLastChangeDateTimeArray(int i, com.sap.xi.a1s.global.SelectionByProductionLotDates selectionByProductionLotLastChangeDateTime)
    {
        generatedSetterHelperImpl(selectionByProductionLotLastChangeDateTime, SELECTIONBYPRODUCTIONLOTLASTCHANGEDATETIME$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByProductionLotLastChangeDateTime" element
     */
    public com.sap.xi.a1s.global.SelectionByProductionLotDates insertNewSelectionByProductionLotLastChangeDateTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SelectionByProductionLotDates target = null;
            target = (com.sap.xi.a1s.global.SelectionByProductionLotDates)get_store().insert_element_user(SELECTIONBYPRODUCTIONLOTLASTCHANGEDATETIME$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByProductionLotLastChangeDateTime" element
     */
    public com.sap.xi.a1s.global.SelectionByProductionLotDates addNewSelectionByProductionLotLastChangeDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SelectionByProductionLotDates target = null;
            target = (com.sap.xi.a1s.global.SelectionByProductionLotDates)get_store().add_element_user(SELECTIONBYPRODUCTIONLOTLASTCHANGEDATETIME$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "SelectionByProductionLotLastChangeDateTime" element
     */
    public void removeSelectionByProductionLotLastChangeDateTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTIONBYPRODUCTIONLOTLASTCHANGEDATETIME$14, i);
        }
    }
}
