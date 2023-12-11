/*
 * An XML document type.
 * Localname: IdentifiedStockMaintainCheckRequestMessage
 * Namespace: http://sap.com/xi/SAPGlobal20/Global
 * Java type: com.sap.xi.sapglobal20.global.IdentifiedStockMaintainCheckRequestMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.sapglobal20.global.impl;
/**
 * A document containing one IdentifiedStockMaintainCheckRequestMessage(@http://sap.com/xi/SAPGlobal20/Global) element.
 *
 * This is a complex type.
 */
public class IdentifiedStockMaintainCheckRequestMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.sapglobal20.global.IdentifiedStockMaintainCheckRequestMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiedStockMaintainCheckRequestMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKMAINTAINCHECKREQUESTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://sap.com/xi/SAPGlobal20/Global", "IdentifiedStockMaintainCheckRequestMessage");
    
    
    /**
     * Gets the "IdentifiedStockMaintainCheckRequestMessage" element
     */
    public com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage getIdentifiedStockMaintainCheckRequestMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage target = null;
            target = (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage)get_store().find_element_user(IDENTIFIEDSTOCKMAINTAINCHECKREQUESTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IdentifiedStockMaintainCheckRequestMessage" element
     */
    public void setIdentifiedStockMaintainCheckRequestMessage(com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage identifiedStockMaintainCheckRequestMessage)
    {
        generatedSetterHelperImpl(identifiedStockMaintainCheckRequestMessage, IDENTIFIEDSTOCKMAINTAINCHECKREQUESTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdentifiedStockMaintainCheckRequestMessage" element
     */
    public com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage addNewIdentifiedStockMaintainCheckRequestMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage target = null;
            target = (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage)get_store().add_element_user(IDENTIFIEDSTOCKMAINTAINCHECKREQUESTMESSAGE$0);
            return target;
        }
    }
}
