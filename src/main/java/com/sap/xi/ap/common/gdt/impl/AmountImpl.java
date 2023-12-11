/*
 * XML Type:  Amount
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.Amount
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML Amount(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.Amount.
 */
public class AmountImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements com.sap.xi.ap.common.gdt.Amount
{
    private static final long serialVersionUID = 1L;
    
    public AmountImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected AmountImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName CURRENCYCODE$0 = 
        new javax.xml.namespace.QName("", "currencyCode");
    
    
    /**
     * Gets the "currencyCode" attribute
     */
    public java.lang.String getCurrencyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCYCODE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "currencyCode" attribute
     */
    public com.sap.xi.basis.global.CurrencyCode xgetCurrencyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.CurrencyCode target = null;
            target = (com.sap.xi.basis.global.CurrencyCode)get_store().find_attribute_user(CURRENCYCODE$0);
            return target;
        }
    }
    
    /**
     * Sets the "currencyCode" attribute
     */
    public void setCurrencyCode(java.lang.String currencyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCYCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURRENCYCODE$0);
            }
            target.setStringValue(currencyCode);
        }
    }
    
    /**
     * Sets (as xml) the "currencyCode" attribute
     */
    public void xsetCurrencyCode(com.sap.xi.basis.global.CurrencyCode currencyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.CurrencyCode target = null;
            target = (com.sap.xi.basis.global.CurrencyCode)get_store().find_attribute_user(CURRENCYCODE$0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.CurrencyCode)get_store().add_attribute_user(CURRENCYCODE$0);
            }
            target.set(currencyCode);
        }
    }
}
