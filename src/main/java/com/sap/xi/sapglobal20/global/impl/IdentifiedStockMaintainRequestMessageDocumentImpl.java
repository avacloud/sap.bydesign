/*
 * An XML document type.
 * Localname: IdentifiedStockMaintainRequestMessage
 * Namespace: http://sap.com/xi/SAPGlobal20/Global
 * Java type: com.sap.xi.sapglobal20.global.IdentifiedStockMaintainRequestMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.sapglobal20.global.impl;
/**
 * A document containing one IdentifiedStockMaintainRequestMessage(@http://sap.com/xi/SAPGlobal20/Global) element.
 *
 * This is a complex type.
 */
public class IdentifiedStockMaintainRequestMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.sapglobal20.global.IdentifiedStockMaintainRequestMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiedStockMaintainRequestMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKMAINTAINREQUESTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://sap.com/xi/SAPGlobal20/Global", "IdentifiedStockMaintainRequestMessage");
    
    
    /**
     * Gets the "IdentifiedStockMaintainRequestMessage" element
     */
    public com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage getIdentifiedStockMaintainRequestMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage target = null;
            target = (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage)get_store().find_element_user(IDENTIFIEDSTOCKMAINTAINREQUESTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IdentifiedStockMaintainRequestMessage" element
     */
    public void setIdentifiedStockMaintainRequestMessage(com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage identifiedStockMaintainRequestMessage)
    {
        generatedSetterHelperImpl(identifiedStockMaintainRequestMessage, IDENTIFIEDSTOCKMAINTAINREQUESTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdentifiedStockMaintainRequestMessage" element
     */
    public com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage addNewIdentifiedStockMaintainRequestMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage target = null;
            target = (com.sap.xi.a1s.global.ManageIdentifiedStockRequestMessage)get_store().add_element_user(IDENTIFIEDSTOCKMAINTAINREQUESTMESSAGE$0);
            return target;
        }
    }
}
