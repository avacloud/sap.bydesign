/*
 * An XML document type.
 * Localname: IdentifiedStockQueryResponseMessage
 * Namespace: http://sap.com/xi/SAPGlobal20/Global
 * Java type: com.sap.xi.sapglobal20.global.IdentifiedStockQueryResponseMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.sapglobal20.global.impl;
/**
 * A document containing one IdentifiedStockQueryResponseMessage(@http://sap.com/xi/SAPGlobal20/Global) element.
 *
 * This is a complex type.
 */
public class IdentifiedStockQueryResponseMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.sapglobal20.global.IdentifiedStockQueryResponseMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiedStockQueryResponseMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKQUERYRESPONSEMESSAGE$0 = 
        new javax.xml.namespace.QName("http://sap.com/xi/SAPGlobal20/Global", "IdentifiedStockQueryResponseMessage");
    
    
    /**
     * Gets the "IdentifiedStockQueryResponseMessage" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage getIdentifiedStockQueryResponseMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage)get_store().find_element_user(IDENTIFIEDSTOCKQUERYRESPONSEMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IdentifiedStockQueryResponseMessage" element
     */
    public void setIdentifiedStockQueryResponseMessage(com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage identifiedStockQueryResponseMessage)
    {
        generatedSetterHelperImpl(identifiedStockQueryResponseMessage, IDENTIFIEDSTOCKQUERYRESPONSEMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdentifiedStockQueryResponseMessage" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage addNewIdentifiedStockQueryResponseMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockQueryResponseMessage)get_store().add_element_user(IDENTIFIEDSTOCKQUERYRESPONSEMESSAGE$0);
            return target;
        }
    }
}
