/*
 * XML Type:  QueryProcessingConditions
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.QueryProcessingConditions
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML QueryProcessingConditions(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is a complex type.
 */
public class QueryProcessingConditionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.common.gdt.QueryProcessingConditions
{
    private static final long serialVersionUID = 1L;
    
    public QueryProcessingConditionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYHITSMAXIMUMNUMBERVALUE$0 = 
        new javax.xml.namespace.QName("", "QueryHitsMaximumNumberValue");
    private static final javax.xml.namespace.QName QUERYHITSUNLIMITEDINDICATOR$2 = 
        new javax.xml.namespace.QName("", "QueryHitsUnlimitedIndicator");
    private static final javax.xml.namespace.QName LASTRETURNEDOBJECTID$4 = 
        new javax.xml.namespace.QName("", "LastReturnedObjectID");
    
    
    /**
     * Gets the "QueryHitsMaximumNumberValue" element
     */
    public int getQueryHitsMaximumNumberValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYHITSMAXIMUMNUMBERVALUE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "QueryHitsMaximumNumberValue" element
     */
    public com.sap.xi.ap.common.gdt.NumberValue xgetQueryHitsMaximumNumberValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NumberValue target = null;
            target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().find_element_user(QUERYHITSMAXIMUMNUMBERVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "QueryHitsMaximumNumberValue" element
     */
    public boolean isSetQueryHitsMaximumNumberValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYHITSMAXIMUMNUMBERVALUE$0) != 0;
        }
    }
    
    /**
     * Sets the "QueryHitsMaximumNumberValue" element
     */
    public void setQueryHitsMaximumNumberValue(int queryHitsMaximumNumberValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYHITSMAXIMUMNUMBERVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYHITSMAXIMUMNUMBERVALUE$0);
            }
            target.setIntValue(queryHitsMaximumNumberValue);
        }
    }
    
    /**
     * Sets (as xml) the "QueryHitsMaximumNumberValue" element
     */
    public void xsetQueryHitsMaximumNumberValue(com.sap.xi.ap.common.gdt.NumberValue queryHitsMaximumNumberValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NumberValue target = null;
            target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().find_element_user(QUERYHITSMAXIMUMNUMBERVALUE$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().add_element_user(QUERYHITSMAXIMUMNUMBERVALUE$0);
            }
            target.set(queryHitsMaximumNumberValue);
        }
    }
    
    /**
     * Unsets the "QueryHitsMaximumNumberValue" element
     */
    public void unsetQueryHitsMaximumNumberValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYHITSMAXIMUMNUMBERVALUE$0, 0);
        }
    }
    
    /**
     * Gets the "QueryHitsUnlimitedIndicator" element
     */
    public boolean getQueryHitsUnlimitedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYHITSUNLIMITEDINDICATOR$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "QueryHitsUnlimitedIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetQueryHitsUnlimitedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(QUERYHITSUNLIMITEDINDICATOR$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "QueryHitsUnlimitedIndicator" element
     */
    public void setQueryHitsUnlimitedIndicator(boolean queryHitsUnlimitedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYHITSUNLIMITEDINDICATOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYHITSUNLIMITEDINDICATOR$2);
            }
            target.setBooleanValue(queryHitsUnlimitedIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "QueryHitsUnlimitedIndicator" element
     */
    public void xsetQueryHitsUnlimitedIndicator(com.sap.xi.ap.common.gdt.Indicator queryHitsUnlimitedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(QUERYHITSUNLIMITEDINDICATOR$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(QUERYHITSUNLIMITEDINDICATOR$2);
            }
            target.set(queryHitsUnlimitedIndicator);
        }
    }
    
    /**
     * Gets the "LastReturnedObjectID" element
     */
    public com.sap.xi.ap.common.gdt.ObjectID getLastReturnedObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectID)get_store().find_element_user(LASTRETURNEDOBJECTID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LastReturnedObjectID" element
     */
    public boolean isSetLastReturnedObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTRETURNEDOBJECTID$4) != 0;
        }
    }
    
    /**
     * Sets the "LastReturnedObjectID" element
     */
    public void setLastReturnedObjectID(com.sap.xi.ap.common.gdt.ObjectID lastReturnedObjectID)
    {
        generatedSetterHelperImpl(lastReturnedObjectID, LASTRETURNEDOBJECTID$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LastReturnedObjectID" element
     */
    public com.sap.xi.ap.common.gdt.ObjectID addNewLastReturnedObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectID)get_store().add_element_user(LASTRETURNEDOBJECTID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "LastReturnedObjectID" element
     */
    public void unsetLastReturnedObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTRETURNEDOBJECTID$4, 0);
        }
    }
}
