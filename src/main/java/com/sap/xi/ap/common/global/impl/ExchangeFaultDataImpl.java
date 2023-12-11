/*
 * XML Type:  ExchangeFaultData
 * Namespace: http://sap.com/xi/AP/Common/Global
 * Java type: com.sap.xi.ap.common.global.ExchangeFaultData
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.global.impl;
/**
 * An XML ExchangeFaultData(@http://sap.com/xi/AP/Common/Global).
 *
 * This is a complex type.
 */
public class ExchangeFaultDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.common.global.ExchangeFaultData
{
    private static final long serialVersionUID = 1L;
    
    public ExchangeFaultDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAULTTEXT$0 = 
        new javax.xml.namespace.QName("", "faultText");
    private static final javax.xml.namespace.QName FAULTURL$2 = 
        new javax.xml.namespace.QName("", "faultUrl");
    private static final javax.xml.namespace.QName FAULTDETAIL$4 = 
        new javax.xml.namespace.QName("", "faultDetail");
    
    
    /**
     * Gets the "faultText" element
     */
    public java.lang.String getFaultText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "faultText" element
     */
    public org.apache.xmlbeans.XmlString xgetFaultText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAULTTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "faultText" element
     */
    public void setFaultText(java.lang.String faultText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAULTTEXT$0);
            }
            target.setStringValue(faultText);
        }
    }
    
    /**
     * Sets (as xml) the "faultText" element
     */
    public void xsetFaultText(org.apache.xmlbeans.XmlString faultText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAULTTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAULTTEXT$0);
            }
            target.set(faultText);
        }
    }
    
    /**
     * Gets the "faultUrl" element
     */
    public java.lang.String getFaultUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTURL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "faultUrl" element
     */
    public org.apache.xmlbeans.XmlString xgetFaultUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAULTURL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "faultUrl" element
     */
    public boolean isSetFaultUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAULTURL$2) != 0;
        }
    }
    
    /**
     * Sets the "faultUrl" element
     */
    public void setFaultUrl(java.lang.String faultUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTURL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAULTURL$2);
            }
            target.setStringValue(faultUrl);
        }
    }
    
    /**
     * Sets (as xml) the "faultUrl" element
     */
    public void xsetFaultUrl(org.apache.xmlbeans.XmlString faultUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAULTURL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAULTURL$2);
            }
            target.set(faultUrl);
        }
    }
    
    /**
     * Unsets the "faultUrl" element
     */
    public void unsetFaultUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAULTURL$2, 0);
        }
    }
    
    /**
     * Gets array of all "faultDetail" elements
     */
    public com.sap.xi.ap.common.global.ExchangeLogData[] getFaultDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FAULTDETAIL$4, targetList);
            com.sap.xi.ap.common.global.ExchangeLogData[] result = new com.sap.xi.ap.common.global.ExchangeLogData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "faultDetail" element
     */
    public com.sap.xi.ap.common.global.ExchangeLogData getFaultDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.ExchangeLogData target = null;
            target = (com.sap.xi.ap.common.global.ExchangeLogData)get_store().find_element_user(FAULTDETAIL$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "faultDetail" element
     */
    public int sizeOfFaultDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAULTDETAIL$4);
        }
    }
    
    /**
     * Sets array of all "faultDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFaultDetailArray(com.sap.xi.ap.common.global.ExchangeLogData[] faultDetailArray)
    {
        check_orphaned();
        arraySetterHelper(faultDetailArray, FAULTDETAIL$4);
    }
    
    /**
     * Sets ith "faultDetail" element
     */
    public void setFaultDetailArray(int i, com.sap.xi.ap.common.global.ExchangeLogData faultDetail)
    {
        generatedSetterHelperImpl(faultDetail, FAULTDETAIL$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "faultDetail" element
     */
    public com.sap.xi.ap.common.global.ExchangeLogData insertNewFaultDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.ExchangeLogData target = null;
            target = (com.sap.xi.ap.common.global.ExchangeLogData)get_store().insert_element_user(FAULTDETAIL$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "faultDetail" element
     */
    public com.sap.xi.ap.common.global.ExchangeLogData addNewFaultDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.ExchangeLogData target = null;
            target = (com.sap.xi.ap.common.global.ExchangeLogData)get_store().add_element_user(FAULTDETAIL$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "faultDetail" element
     */
    public void removeFaultDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAULTDETAIL$4, i);
        }
    }
}
