/*
 * XML Type:  MaterialByElementsResponseMaterialGlobaldTradeItemNumber
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialGlobaldTradeItemNumber
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterialGlobaldTradeItemNumber(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialGlobaldTradeItemNumberImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialGlobaldTradeItemNumber
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialGlobaldTradeItemNumberImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRADINGUNITCODE$0 = 
        new javax.xml.namespace.QName("", "TradingUnitCode");
    private static final javax.xml.namespace.QName GLOBALTRADEID$2 = 
        new javax.xml.namespace.QName("", "GlobalTradeID");
    
    
    /**
     * Gets the "TradingUnitCode" element
     */
    public com.sap.xi.ap.common.gdt.QuantityTypeCode getTradingUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.QuantityTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.QuantityTypeCode)get_store().find_element_user(TRADINGUNITCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TradingUnitCode" element
     */
    public boolean isSetTradingUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRADINGUNITCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "TradingUnitCode" element
     */
    public void setTradingUnitCode(com.sap.xi.ap.common.gdt.QuantityTypeCode tradingUnitCode)
    {
        generatedSetterHelperImpl(tradingUnitCode, TRADINGUNITCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TradingUnitCode" element
     */
    public com.sap.xi.ap.common.gdt.QuantityTypeCode addNewTradingUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.QuantityTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.QuantityTypeCode)get_store().add_element_user(TRADINGUNITCODE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "TradingUnitCode" element
     */
    public void unsetTradingUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRADINGUNITCODE$0, 0);
        }
    }
    
    /**
     * Gets the "GlobalTradeID" element
     */
    public com.sap.xi.ap.common.gdt.ProductStandardIDV1 getGlobalTradeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductStandardIDV1 target = null;
            target = (com.sap.xi.ap.common.gdt.ProductStandardIDV1)get_store().find_element_user(GLOBALTRADEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GlobalTradeID" element
     */
    public boolean isSetGlobalTradeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GLOBALTRADEID$2) != 0;
        }
    }
    
    /**
     * Sets the "GlobalTradeID" element
     */
    public void setGlobalTradeID(com.sap.xi.ap.common.gdt.ProductStandardIDV1 globalTradeID)
    {
        generatedSetterHelperImpl(globalTradeID, GLOBALTRADEID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GlobalTradeID" element
     */
    public com.sap.xi.ap.common.gdt.ProductStandardIDV1 addNewGlobalTradeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductStandardIDV1 target = null;
            target = (com.sap.xi.ap.common.gdt.ProductStandardIDV1)get_store().add_element_user(GLOBALTRADEID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "GlobalTradeID" element
     */
    public void unsetGlobalTradeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GLOBALTRADEID$2, 0);
        }
    }
}
