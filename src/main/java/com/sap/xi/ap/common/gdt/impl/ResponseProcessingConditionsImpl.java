/*
 * XML Type:  ResponseProcessingConditions
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.ResponseProcessingConditions
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML ResponseProcessingConditions(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is a complex type.
 */
public class ResponseProcessingConditionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.common.gdt.ResponseProcessingConditions
{
    private static final long serialVersionUID = 1L;
    
    public ResponseProcessingConditionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETURNEDQUERYHITSNUMBERVALUE$0 = 
        new javax.xml.namespace.QName("", "ReturnedQueryHitsNumberValue");
    private static final javax.xml.namespace.QName MOREHITSAVAILABLEINDICATOR$2 = 
        new javax.xml.namespace.QName("", "MoreHitsAvailableIndicator");
    private static final javax.xml.namespace.QName LASTRETURNEDOBJECTID$4 = 
        new javax.xml.namespace.QName("", "LastReturnedObjectID");
    
    
    /**
     * Gets the "ReturnedQueryHitsNumberValue" element
     */
    public int getReturnedQueryHitsNumberValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURNEDQUERYHITSNUMBERVALUE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReturnedQueryHitsNumberValue" element
     */
    public com.sap.xi.ap.common.gdt.NumberValue xgetReturnedQueryHitsNumberValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NumberValue target = null;
            target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().find_element_user(RETURNEDQUERYHITSNUMBERVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ReturnedQueryHitsNumberValue" element
     */
    public void setReturnedQueryHitsNumberValue(int returnedQueryHitsNumberValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURNEDQUERYHITSNUMBERVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURNEDQUERYHITSNUMBERVALUE$0);
            }
            target.setIntValue(returnedQueryHitsNumberValue);
        }
    }
    
    /**
     * Sets (as xml) the "ReturnedQueryHitsNumberValue" element
     */
    public void xsetReturnedQueryHitsNumberValue(com.sap.xi.ap.common.gdt.NumberValue returnedQueryHitsNumberValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NumberValue target = null;
            target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().find_element_user(RETURNEDQUERYHITSNUMBERVALUE$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().add_element_user(RETURNEDQUERYHITSNUMBERVALUE$0);
            }
            target.set(returnedQueryHitsNumberValue);
        }
    }
    
    /**
     * Gets the "MoreHitsAvailableIndicator" element
     */
    public boolean getMoreHitsAvailableIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOREHITSAVAILABLEINDICATOR$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "MoreHitsAvailableIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetMoreHitsAvailableIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(MOREHITSAVAILABLEINDICATOR$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MoreHitsAvailableIndicator" element
     */
    public void setMoreHitsAvailableIndicator(boolean moreHitsAvailableIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOREHITSAVAILABLEINDICATOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOREHITSAVAILABLEINDICATOR$2);
            }
            target.setBooleanValue(moreHitsAvailableIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "MoreHitsAvailableIndicator" element
     */
    public void xsetMoreHitsAvailableIndicator(com.sap.xi.ap.common.gdt.Indicator moreHitsAvailableIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(MOREHITSAVAILABLEINDICATOR$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(MOREHITSAVAILABLEINDICATOR$2);
            }
            target.set(moreHitsAvailableIndicator);
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
