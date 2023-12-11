/*
 * An XML document type.
 * Localname: IdentifiedStockMaintainResponseMessage
 * Namespace: http://sap.com/xi/SAPGlobal20/Global
 * Java type: com.sap.xi.sapglobal20.global.IdentifiedStockMaintainResponseMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.sapglobal20.global.impl;
/**
 * A document containing one IdentifiedStockMaintainResponseMessage(@http://sap.com/xi/SAPGlobal20/Global) element.
 *
 * This is a complex type.
 */
public class IdentifiedStockMaintainResponseMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.sapglobal20.global.IdentifiedStockMaintainResponseMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiedStockMaintainResponseMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKMAINTAINRESPONSEMESSAGE$0 = 
        new javax.xml.namespace.QName("http://sap.com/xi/SAPGlobal20/Global", "IdentifiedStockMaintainResponseMessage");
    
    
    /**
     * Gets the "IdentifiedStockMaintainResponseMessage" element
     */
    public com.sap.xi.a1s.global.ManageIdentifiedStockResponseMessage getIdentifiedStockMaintainResponseMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ManageIdentifiedStockResponseMessage target = null;
            target = (com.sap.xi.a1s.global.ManageIdentifiedStockResponseMessage)get_store().find_element_user(IDENTIFIEDSTOCKMAINTAINRESPONSEMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IdentifiedStockMaintainResponseMessage" element
     */
    public void setIdentifiedStockMaintainResponseMessage(com.sap.xi.a1s.global.ManageIdentifiedStockResponseMessage identifiedStockMaintainResponseMessage)
    {
        generatedSetterHelperImpl(identifiedStockMaintainResponseMessage, IDENTIFIEDSTOCKMAINTAINRESPONSEMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdentifiedStockMaintainResponseMessage" element
     */
    public com.sap.xi.a1s.global.ManageIdentifiedStockResponseMessage addNewIdentifiedStockMaintainResponseMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ManageIdentifiedStockResponseMessage target = null;
            target = (com.sap.xi.a1s.global.ManageIdentifiedStockResponseMessage)get_store().add_element_user(IDENTIFIEDSTOCKMAINTAINRESPONSEMESSAGE$0);
            return target;
        }
    }
}
