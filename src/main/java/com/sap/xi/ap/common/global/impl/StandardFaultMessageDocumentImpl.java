/*
 * An XML document type.
 * Localname: StandardFaultMessage
 * Namespace: http://sap.com/xi/AP/Common/Global
 * Java type: com.sap.xi.ap.common.global.StandardFaultMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.global.impl;
/**
 * A document containing one StandardFaultMessage(@http://sap.com/xi/AP/Common/Global) element.
 *
 * This is a complex type.
 */
public class StandardFaultMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.common.global.StandardFaultMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public StandardFaultMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STANDARDFAULTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://sap.com/xi/AP/Common/Global", "StandardFaultMessage");
    
    
    /**
     * Gets the "StandardFaultMessage" element
     */
    public com.sap.xi.ap.common.global.StandardFaultMessageDocument.StandardFaultMessage getStandardFaultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.StandardFaultMessageDocument.StandardFaultMessage target = null;
            target = (com.sap.xi.ap.common.global.StandardFaultMessageDocument.StandardFaultMessage)get_store().find_element_user(STANDARDFAULTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StandardFaultMessage" element
     */
    public void setStandardFaultMessage(com.sap.xi.ap.common.global.StandardFaultMessageDocument.StandardFaultMessage standardFaultMessage)
    {
        generatedSetterHelperImpl(standardFaultMessage, STANDARDFAULTMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StandardFaultMessage" element
     */
    public com.sap.xi.ap.common.global.StandardFaultMessageDocument.StandardFaultMessage addNewStandardFaultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.StandardFaultMessageDocument.StandardFaultMessage target = null;
            target = (com.sap.xi.ap.common.global.StandardFaultMessageDocument.StandardFaultMessage)get_store().add_element_user(STANDARDFAULTMESSAGE$0);
            return target;
        }
    }
    /**
     * An XML StandardFaultMessage(@http://sap.com/xi/AP/Common/Global).
     *
     * This is a complex type.
     */
    public static class StandardFaultMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.common.global.StandardFaultMessageDocument.StandardFaultMessage
    {
        private static final long serialVersionUID = 1L;
        
        public StandardFaultMessageImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STANDARD$0 = 
            new javax.xml.namespace.QName("", "standard");
        private static final javax.xml.namespace.QName ADDITION$2 = 
            new javax.xml.namespace.QName("", "addition");
        
        
        /**
         * Gets the "standard" element
         */
        public com.sap.xi.ap.common.global.ExchangeFaultData getStandard()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sap.xi.ap.common.global.ExchangeFaultData target = null;
                target = (com.sap.xi.ap.common.global.ExchangeFaultData)get_store().find_element_user(STANDARD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "standard" element
         */
        public void setStandard(com.sap.xi.ap.common.global.ExchangeFaultData standard)
        {
            generatedSetterHelperImpl(standard, STANDARD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "standard" element
         */
        public com.sap.xi.ap.common.global.ExchangeFaultData addNewStandard()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sap.xi.ap.common.global.ExchangeFaultData target = null;
                target = (com.sap.xi.ap.common.global.ExchangeFaultData)get_store().add_element_user(STANDARD$0);
                return target;
            }
        }
        
        /**
         * Gets the "addition" element
         */
        public com.sap.xi.ap.common.global.StandardFaultMessageExtension getAddition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sap.xi.ap.common.global.StandardFaultMessageExtension target = null;
                target = (com.sap.xi.ap.common.global.StandardFaultMessageExtension)get_store().find_element_user(ADDITION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "addition" element
         */
        public void setAddition(com.sap.xi.ap.common.global.StandardFaultMessageExtension addition)
        {
            generatedSetterHelperImpl(addition, ADDITION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "addition" element
         */
        public com.sap.xi.ap.common.global.StandardFaultMessageExtension addNewAddition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sap.xi.ap.common.global.StandardFaultMessageExtension target = null;
                target = (com.sap.xi.ap.common.global.StandardFaultMessageExtension)get_store().add_element_user(ADDITION$2);
                return target;
            }
        }
    }
}
