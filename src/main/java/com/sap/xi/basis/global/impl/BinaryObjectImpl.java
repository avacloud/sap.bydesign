/*
 * XML Type:  BinaryObject
 * Namespace: http://sap.com/xi/BASIS/Global
 * Java type: com.sap.xi.basis.global.BinaryObject
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.basis.global.impl;
/**
 * An XML BinaryObject(@http://sap.com/xi/BASIS/Global).
 *
 * This is an atomic type that is a restriction of com.sap.xi.basis.global.BinaryObject.
 */
public class BinaryObjectImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements com.sap.xi.basis.global.BinaryObject
{
    private static final long serialVersionUID = 1L;
    
    public BinaryObjectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected BinaryObjectImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName MIMECODE$0 = 
        new javax.xml.namespace.QName("", "mimeCode");
    private static final javax.xml.namespace.QName CHARACTERSETCODE$2 = 
        new javax.xml.namespace.QName("", "characterSetCode");
    private static final javax.xml.namespace.QName FORMAT$4 = 
        new javax.xml.namespace.QName("", "format");
    private static final javax.xml.namespace.QName FILENAME$6 = 
        new javax.xml.namespace.QName("", "fileName");
    private static final javax.xml.namespace.QName URI$8 = 
        new javax.xml.namespace.QName("", "uri");
    
    
    /**
     * Gets the "mimeCode" attribute
     */
    public java.lang.String getMimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIMECODE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mimeCode" attribute
     */
    public com.sap.xi.basis.global.MIMECode xgetMimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.MIMECode target = null;
            target = (com.sap.xi.basis.global.MIMECode)get_store().find_attribute_user(MIMECODE$0);
            return target;
        }
    }
    
    /**
     * True if has "mimeCode" attribute
     */
    public boolean isSetMimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MIMECODE$0) != null;
        }
    }
    
    /**
     * Sets the "mimeCode" attribute
     */
    public void setMimeCode(java.lang.String mimeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIMECODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIMECODE$0);
            }
            target.setStringValue(mimeCode);
        }
    }
    
    /**
     * Sets (as xml) the "mimeCode" attribute
     */
    public void xsetMimeCode(com.sap.xi.basis.global.MIMECode mimeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.MIMECode target = null;
            target = (com.sap.xi.basis.global.MIMECode)get_store().find_attribute_user(MIMECODE$0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.MIMECode)get_store().add_attribute_user(MIMECODE$0);
            }
            target.set(mimeCode);
        }
    }
    
    /**
     * Unsets the "mimeCode" attribute
     */
    public void unsetMimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MIMECODE$0);
        }
    }
    
    /**
     * Gets the "characterSetCode" attribute
     */
    public java.lang.String getCharacterSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARACTERSETCODE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "characterSetCode" attribute
     */
    public com.sap.xi.basis.global.CharacterSetCode xgetCharacterSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.CharacterSetCode target = null;
            target = (com.sap.xi.basis.global.CharacterSetCode)get_store().find_attribute_user(CHARACTERSETCODE$2);
            return target;
        }
    }
    
    /**
     * True if has "characterSetCode" attribute
     */
    public boolean isSetCharacterSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHARACTERSETCODE$2) != null;
        }
    }
    
    /**
     * Sets the "characterSetCode" attribute
     */
    public void setCharacterSetCode(java.lang.String characterSetCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARACTERSETCODE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHARACTERSETCODE$2);
            }
            target.setStringValue(characterSetCode);
        }
    }
    
    /**
     * Sets (as xml) the "characterSetCode" attribute
     */
    public void xsetCharacterSetCode(com.sap.xi.basis.global.CharacterSetCode characterSetCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.CharacterSetCode target = null;
            target = (com.sap.xi.basis.global.CharacterSetCode)get_store().find_attribute_user(CHARACTERSETCODE$2);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.CharacterSetCode)get_store().add_attribute_user(CHARACTERSETCODE$2);
            }
            target.set(characterSetCode);
        }
    }
    
    /**
     * Unsets the "characterSetCode" attribute
     */
    public void unsetCharacterSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHARACTERSETCODE$2);
        }
    }
    
    /**
     * Gets the "format" attribute
     */
    public java.lang.String getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "format" attribute
     */
    public org.apache.xmlbeans.XmlToken xgetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(FORMAT$4);
            return target;
        }
    }
    
    /**
     * True if has "format" attribute
     */
    public boolean isSetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORMAT$4) != null;
        }
    }
    
    /**
     * Sets the "format" attribute
     */
    public void setFormat(java.lang.String format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMAT$4);
            }
            target.setStringValue(format);
        }
    }
    
    /**
     * Sets (as xml) the "format" attribute
     */
    public void xsetFormat(org.apache.xmlbeans.XmlToken format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(FORMAT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(FORMAT$4);
            }
            target.set(format);
        }
    }
    
    /**
     * Unsets the "format" attribute
     */
    public void unsetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORMAT$4);
        }
    }
    
    /**
     * Gets the "fileName" attribute
     */
    public java.lang.String getFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILENAME$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fileName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILENAME$6);
            return target;
        }
    }
    
    /**
     * True if has "fileName" attribute
     */
    public boolean isSetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILENAME$6) != null;
        }
    }
    
    /**
     * Sets the "fileName" attribute
     */
    public void setFileName(java.lang.String fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILENAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILENAME$6);
            }
            target.setStringValue(fileName);
        }
    }
    
    /**
     * Sets (as xml) the "fileName" attribute
     */
    public void xsetFileName(org.apache.xmlbeans.XmlString fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILENAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FILENAME$6);
            }
            target.set(fileName);
        }
    }
    
    /**
     * Unsets the "fileName" attribute
     */
    public void unsetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILENAME$6);
        }
    }
    
    /**
     * Gets the "uri" attribute
     */
    public java.lang.String getUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uri" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URI$8);
            return target;
        }
    }
    
    /**
     * True if has "uri" attribute
     */
    public boolean isSetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(URI$8) != null;
        }
    }
    
    /**
     * Sets the "uri" attribute
     */
    public void setUri(java.lang.String uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$8);
            }
            target.setStringValue(uri);
        }
    }
    
    /**
     * Sets (as xml) the "uri" attribute
     */
    public void xsetUri(org.apache.xmlbeans.XmlAnyURI uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URI$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(URI$8);
            }
            target.set(uri);
        }
    }
    
    /**
     * Unsets the "uri" attribute
     */
    public void unsetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(URI$8);
        }
    }
}
