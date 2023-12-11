/*
 * XML Type:  ManageIdentifiedStockRequestMessage
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ManageIdentifiedStockRequestMessage(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ManageIdentifiedStockRequestMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage
{
    private static final long serialVersionUID = 1L;
    
    public ManageIdentifiedStockRequestMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASICMESSAGEHEADER$0 = 
        new javax.xml.namespace.QName("", "BasicMessageHeader");
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKMAINTAINBUNDLE$2 = 
        new javax.xml.namespace.QName("", "IdentifiedStockMaintainBundle");
    
    
    /**
     * Gets the "BasicMessageHeader" element
     */
    public com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader getBasicMessageHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader)get_store().find_element_user(BASICMESSAGEHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BasicMessageHeader" element
     */
    public void setBasicMessageHeader(com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader basicMessageHeader)
    {
        generatedSetterHelperImpl(basicMessageHeader, BASICMESSAGEHEADER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BasicMessageHeader" element
     */
    public com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader addNewBasicMessageHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader)get_store().add_element_user(BASICMESSAGEHEADER$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "IdentifiedStockMaintainBundle" elements
     */
    public com.sap.xi.a1s.global.ManageIdentifiedStocksRequest[] getIdentifiedStockMaintainBundleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIEDSTOCKMAINTAINBUNDLE$2, targetList);
            com.sap.xi.a1s.global.ManageIdentifiedStocksRequest[] result = new com.sap.xi.a1s.global.ManageIdentifiedStocksRequest[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IdentifiedStockMaintainBundle" element
     */
    public com.sap.xi.a1s.global.ManageIdentifiedStocksRequest getIdentifiedStockMaintainBundleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ManageIdentifiedStocksRequest target = null;
            target = (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest)get_store().find_element_user(IDENTIFIEDSTOCKMAINTAINBUNDLE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "IdentifiedStockMaintainBundle" element
     */
    public int sizeOfIdentifiedStockMaintainBundleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIEDSTOCKMAINTAINBUNDLE$2);
        }
    }
    
    /**
     * Sets array of all "IdentifiedStockMaintainBundle" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifiedStockMaintainBundleArray(com.sap.xi.a1s.global.ManageIdentifiedStocksRequest[] identifiedStockMaintainBundleArray)
    {
        check_orphaned();
        arraySetterHelper(identifiedStockMaintainBundleArray, IDENTIFIEDSTOCKMAINTAINBUNDLE$2);
    }
    
    /**
     * Sets ith "IdentifiedStockMaintainBundle" element
     */
    public void setIdentifiedStockMaintainBundleArray(int i, com.sap.xi.a1s.global.ManageIdentifiedStocksRequest identifiedStockMaintainBundle)
    {
        generatedSetterHelperImpl(identifiedStockMaintainBundle, IDENTIFIEDSTOCKMAINTAINBUNDLE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentifiedStockMaintainBundle" element
     */
    public com.sap.xi.a1s.global.ManageIdentifiedStocksRequest insertNewIdentifiedStockMaintainBundle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ManageIdentifiedStocksRequest target = null;
            target = (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest)get_store().insert_element_user(IDENTIFIEDSTOCKMAINTAINBUNDLE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdentifiedStockMaintainBundle" element
     */
    public com.sap.xi.a1s.global.ManageIdentifiedStocksRequest addNewIdentifiedStockMaintainBundle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ManageIdentifiedStocksRequest target = null;
            target = (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest)get_store().add_element_user(IDENTIFIEDSTOCKMAINTAINBUNDLE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "IdentifiedStockMaintainBundle" element
     */
    public void removeIdentifiedStockMaintainBundle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIEDSTOCKMAINTAINBUNDLE$2, i);
        }
    }
}
