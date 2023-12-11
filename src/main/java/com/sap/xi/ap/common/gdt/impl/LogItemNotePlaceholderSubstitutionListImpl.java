/*
 * XML Type:  LogItemNotePlaceholderSubstitutionList
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.LogItemNotePlaceholderSubstitutionList
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML LogItemNotePlaceholderSubstitutionList(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is a complex type.
 */
public class LogItemNotePlaceholderSubstitutionListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.common.gdt.LogItemNotePlaceholderSubstitutionList
{
    private static final long serialVersionUID = 1L;
    
    public LogItemNotePlaceholderSubstitutionListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIRSTPLACEHOLDERID$0 = 
        new javax.xml.namespace.QName("", "FirstPlaceholderID");
    private static final javax.xml.namespace.QName SECONDPLACEHOLDERID$2 = 
        new javax.xml.namespace.QName("", "SecondPlaceholderID");
    private static final javax.xml.namespace.QName THIRDPLACEHOLDERID$4 = 
        new javax.xml.namespace.QName("", "ThirdPlaceholderID");
    private static final javax.xml.namespace.QName FOURTHPLACEHOLDERID$6 = 
        new javax.xml.namespace.QName("", "FourthPlaceholderID");
    private static final javax.xml.namespace.QName FIRSTPLACEHOLDERSUBSTITUTIONTEXT$8 = 
        new javax.xml.namespace.QName("", "FirstPlaceholderSubstitutionText");
    private static final javax.xml.namespace.QName SECONDPLACEHOLDERSUBSTITUTIONTEXT$10 = 
        new javax.xml.namespace.QName("", "SecondPlaceholderSubstitutionText");
    private static final javax.xml.namespace.QName THIRDPLACEHOLDERSUBSTITUTIONTEXT$12 = 
        new javax.xml.namespace.QName("", "ThirdPlaceholderSubstitutionText");
    private static final javax.xml.namespace.QName FOURTHPLACEHOLDERSUBSTITUTIONTEXT$14 = 
        new javax.xml.namespace.QName("", "FourthPlaceholderSubstitutionText");
    
    
    /**
     * Gets the "FirstPlaceholderID" element
     */
    public java.lang.String getFirstPlaceholderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTPLACEHOLDERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FirstPlaceholderID" element
     */
    public com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID xgetFirstPlaceholderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID)get_store().find_element_user(FIRSTPLACEHOLDERID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FirstPlaceholderID" element
     */
    public void setFirstPlaceholderID(java.lang.String firstPlaceholderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTPLACEHOLDERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTPLACEHOLDERID$0);
            }
            target.setStringValue(firstPlaceholderID);
        }
    }
    
    /**
     * Sets (as xml) the "FirstPlaceholderID" element
     */
    public void xsetFirstPlaceholderID(com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID firstPlaceholderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID)get_store().find_element_user(FIRSTPLACEHOLDERID$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID)get_store().add_element_user(FIRSTPLACEHOLDERID$0);
            }
            target.set(firstPlaceholderID);
        }
    }
    
    /**
     * Gets the "SecondPlaceholderID" element
     */
    public java.lang.String getSecondPlaceholderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDPLACEHOLDERID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SecondPlaceholderID" element
     */
    public com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID xgetSecondPlaceholderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID)get_store().find_element_user(SECONDPLACEHOLDERID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "SecondPlaceholderID" element
     */
    public boolean isSetSecondPlaceholderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDPLACEHOLDERID$2) != 0;
        }
    }
    
    /**
     * Sets the "SecondPlaceholderID" element
     */
    public void setSecondPlaceholderID(java.lang.String secondPlaceholderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDPLACEHOLDERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDPLACEHOLDERID$2);
            }
            target.setStringValue(secondPlaceholderID);
        }
    }
    
    /**
     * Sets (as xml) the "SecondPlaceholderID" element
     */
    public void xsetSecondPlaceholderID(com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID secondPlaceholderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID)get_store().find_element_user(SECONDPLACEHOLDERID$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID)get_store().add_element_user(SECONDPLACEHOLDERID$2);
            }
            target.set(secondPlaceholderID);
        }
    }
    
    /**
     * Unsets the "SecondPlaceholderID" element
     */
    public void unsetSecondPlaceholderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDPLACEHOLDERID$2, 0);
        }
    }
    
    /**
     * Gets the "ThirdPlaceholderID" element
     */
    public java.lang.String getThirdPlaceholderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THIRDPLACEHOLDERID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ThirdPlaceholderID" element
     */
    public com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID xgetThirdPlaceholderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID)get_store().find_element_user(THIRDPLACEHOLDERID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ThirdPlaceholderID" element
     */
    public boolean isSetThirdPlaceholderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THIRDPLACEHOLDERID$4) != 0;
        }
    }
    
    /**
     * Sets the "ThirdPlaceholderID" element
     */
    public void setThirdPlaceholderID(java.lang.String thirdPlaceholderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THIRDPLACEHOLDERID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(THIRDPLACEHOLDERID$4);
            }
            target.setStringValue(thirdPlaceholderID);
        }
    }
    
    /**
     * Sets (as xml) the "ThirdPlaceholderID" element
     */
    public void xsetThirdPlaceholderID(com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID thirdPlaceholderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID)get_store().find_element_user(THIRDPLACEHOLDERID$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID)get_store().add_element_user(THIRDPLACEHOLDERID$4);
            }
            target.set(thirdPlaceholderID);
        }
    }
    
    /**
     * Unsets the "ThirdPlaceholderID" element
     */
    public void unsetThirdPlaceholderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THIRDPLACEHOLDERID$4, 0);
        }
    }
    
    /**
     * Gets the "FourthPlaceholderID" element
     */
    public java.lang.String getFourthPlaceholderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOURTHPLACEHOLDERID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FourthPlaceholderID" element
     */
    public com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID xgetFourthPlaceholderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID)get_store().find_element_user(FOURTHPLACEHOLDERID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "FourthPlaceholderID" element
     */
    public boolean isSetFourthPlaceholderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOURTHPLACEHOLDERID$6) != 0;
        }
    }
    
    /**
     * Sets the "FourthPlaceholderID" element
     */
    public void setFourthPlaceholderID(java.lang.String fourthPlaceholderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOURTHPLACEHOLDERID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOURTHPLACEHOLDERID$6);
            }
            target.setStringValue(fourthPlaceholderID);
        }
    }
    
    /**
     * Sets (as xml) the "FourthPlaceholderID" element
     */
    public void xsetFourthPlaceholderID(com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID fourthPlaceholderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID)get_store().find_element_user(FOURTHPLACEHOLDERID$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogItemTemplatePlaceholderID)get_store().add_element_user(FOURTHPLACEHOLDERID$6);
            }
            target.set(fourthPlaceholderID);
        }
    }
    
    /**
     * Unsets the "FourthPlaceholderID" element
     */
    public void unsetFourthPlaceholderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOURTHPLACEHOLDERID$6, 0);
        }
    }
    
    /**
     * Gets the "FirstPlaceholderSubstitutionText" element
     */
    public java.lang.String getFirstPlaceholderSubstitutionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTPLACEHOLDERSUBSTITUTIONTEXT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FirstPlaceholderSubstitutionText" element
     */
    public com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText xgetFirstPlaceholderSubstitutionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText)get_store().find_element_user(FIRSTPLACEHOLDERSUBSTITUTIONTEXT$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FirstPlaceholderSubstitutionText" element
     */
    public void setFirstPlaceholderSubstitutionText(java.lang.String firstPlaceholderSubstitutionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTPLACEHOLDERSUBSTITUTIONTEXT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTPLACEHOLDERSUBSTITUTIONTEXT$8);
            }
            target.setStringValue(firstPlaceholderSubstitutionText);
        }
    }
    
    /**
     * Sets (as xml) the "FirstPlaceholderSubstitutionText" element
     */
    public void xsetFirstPlaceholderSubstitutionText(com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText firstPlaceholderSubstitutionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText)get_store().find_element_user(FIRSTPLACEHOLDERSUBSTITUTIONTEXT$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText)get_store().add_element_user(FIRSTPLACEHOLDERSUBSTITUTIONTEXT$8);
            }
            target.set(firstPlaceholderSubstitutionText);
        }
    }
    
    /**
     * Gets the "SecondPlaceholderSubstitutionText" element
     */
    public java.lang.String getSecondPlaceholderSubstitutionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDPLACEHOLDERSUBSTITUTIONTEXT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SecondPlaceholderSubstitutionText" element
     */
    public com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText xgetSecondPlaceholderSubstitutionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText)get_store().find_element_user(SECONDPLACEHOLDERSUBSTITUTIONTEXT$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "SecondPlaceholderSubstitutionText" element
     */
    public boolean isSetSecondPlaceholderSubstitutionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDPLACEHOLDERSUBSTITUTIONTEXT$10) != 0;
        }
    }
    
    /**
     * Sets the "SecondPlaceholderSubstitutionText" element
     */
    public void setSecondPlaceholderSubstitutionText(java.lang.String secondPlaceholderSubstitutionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDPLACEHOLDERSUBSTITUTIONTEXT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDPLACEHOLDERSUBSTITUTIONTEXT$10);
            }
            target.setStringValue(secondPlaceholderSubstitutionText);
        }
    }
    
    /**
     * Sets (as xml) the "SecondPlaceholderSubstitutionText" element
     */
    public void xsetSecondPlaceholderSubstitutionText(com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText secondPlaceholderSubstitutionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText)get_store().find_element_user(SECONDPLACEHOLDERSUBSTITUTIONTEXT$10, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText)get_store().add_element_user(SECONDPLACEHOLDERSUBSTITUTIONTEXT$10);
            }
            target.set(secondPlaceholderSubstitutionText);
        }
    }
    
    /**
     * Unsets the "SecondPlaceholderSubstitutionText" element
     */
    public void unsetSecondPlaceholderSubstitutionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDPLACEHOLDERSUBSTITUTIONTEXT$10, 0);
        }
    }
    
    /**
     * Gets the "ThirdPlaceholderSubstitutionText" element
     */
    public java.lang.String getThirdPlaceholderSubstitutionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THIRDPLACEHOLDERSUBSTITUTIONTEXT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ThirdPlaceholderSubstitutionText" element
     */
    public com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText xgetThirdPlaceholderSubstitutionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText)get_store().find_element_user(THIRDPLACEHOLDERSUBSTITUTIONTEXT$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "ThirdPlaceholderSubstitutionText" element
     */
    public boolean isSetThirdPlaceholderSubstitutionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THIRDPLACEHOLDERSUBSTITUTIONTEXT$12) != 0;
        }
    }
    
    /**
     * Sets the "ThirdPlaceholderSubstitutionText" element
     */
    public void setThirdPlaceholderSubstitutionText(java.lang.String thirdPlaceholderSubstitutionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THIRDPLACEHOLDERSUBSTITUTIONTEXT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(THIRDPLACEHOLDERSUBSTITUTIONTEXT$12);
            }
            target.setStringValue(thirdPlaceholderSubstitutionText);
        }
    }
    
    /**
     * Sets (as xml) the "ThirdPlaceholderSubstitutionText" element
     */
    public void xsetThirdPlaceholderSubstitutionText(com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText thirdPlaceholderSubstitutionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText)get_store().find_element_user(THIRDPLACEHOLDERSUBSTITUTIONTEXT$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText)get_store().add_element_user(THIRDPLACEHOLDERSUBSTITUTIONTEXT$12);
            }
            target.set(thirdPlaceholderSubstitutionText);
        }
    }
    
    /**
     * Unsets the "ThirdPlaceholderSubstitutionText" element
     */
    public void unsetThirdPlaceholderSubstitutionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THIRDPLACEHOLDERSUBSTITUTIONTEXT$12, 0);
        }
    }
    
    /**
     * Gets the "FourthPlaceholderSubstitutionText" element
     */
    public java.lang.String getFourthPlaceholderSubstitutionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOURTHPLACEHOLDERSUBSTITUTIONTEXT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FourthPlaceholderSubstitutionText" element
     */
    public com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText xgetFourthPlaceholderSubstitutionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText)get_store().find_element_user(FOURTHPLACEHOLDERSUBSTITUTIONTEXT$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "FourthPlaceholderSubstitutionText" element
     */
    public boolean isSetFourthPlaceholderSubstitutionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOURTHPLACEHOLDERSUBSTITUTIONTEXT$14) != 0;
        }
    }
    
    /**
     * Sets the "FourthPlaceholderSubstitutionText" element
     */
    public void setFourthPlaceholderSubstitutionText(java.lang.String fourthPlaceholderSubstitutionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOURTHPLACEHOLDERSUBSTITUTIONTEXT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOURTHPLACEHOLDERSUBSTITUTIONTEXT$14);
            }
            target.setStringValue(fourthPlaceholderSubstitutionText);
        }
    }
    
    /**
     * Sets (as xml) the "FourthPlaceholderSubstitutionText" element
     */
    public void xsetFourthPlaceholderSubstitutionText(com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText fourthPlaceholderSubstitutionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText)get_store().find_element_user(FOURTHPLACEHOLDERSUBSTITUTIONTEXT$14, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogItemPlaceholderSubstitutionText)get_store().add_element_user(FOURTHPLACEHOLDERSUBSTITUTIONTEXT$14);
            }
            target.set(fourthPlaceholderSubstitutionText);
        }
    }
    
    /**
     * Unsets the "FourthPlaceholderSubstitutionText" element
     */
    public void unsetFourthPlaceholderSubstitutionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOURTHPLACEHOLDERSUBSTITUTIONTEXT$14, 0);
        }
    }
}
