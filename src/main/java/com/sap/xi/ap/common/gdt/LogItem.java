/*
 * XML Type:  LogItem
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.LogItem
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt;


/**
 * An XML LogItem(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is a complex type.
 */
public interface LogItem extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LogItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("logitemf74ftype");
    
    /**
     * Gets the "TypeID" element
     */
    java.lang.String getTypeID();
    
    /**
     * Gets (as xml) the "TypeID" element
     */
    com.sap.xi.ap.common.gdt.LogItemTypeID xgetTypeID();
    
    /**
     * True if has "TypeID" element
     */
    boolean isSetTypeID();
    
    /**
     * Sets the "TypeID" element
     */
    void setTypeID(java.lang.String typeID);
    
    /**
     * Sets (as xml) the "TypeID" element
     */
    void xsetTypeID(com.sap.xi.ap.common.gdt.LogItemTypeID typeID);
    
    /**
     * Unsets the "TypeID" element
     */
    void unsetTypeID();
    
    /**
     * Gets the "CategoryCode" element
     */
    com.sap.xi.ap.common.gdt.LogItemCategoryCode getCategoryCode();
    
    /**
     * True if has "CategoryCode" element
     */
    boolean isSetCategoryCode();
    
    /**
     * Sets the "CategoryCode" element
     */
    void setCategoryCode(com.sap.xi.ap.common.gdt.LogItemCategoryCode categoryCode);
    
    /**
     * Appends and returns a new empty "CategoryCode" element
     */
    com.sap.xi.ap.common.gdt.LogItemCategoryCode addNewCategoryCode();
    
    /**
     * Unsets the "CategoryCode" element
     */
    void unsetCategoryCode();
    
    /**
     * Gets the "SeverityCode" element
     */
    java.lang.String getSeverityCode();
    
    /**
     * Gets (as xml) the "SeverityCode" element
     */
    com.sap.xi.ap.common.gdt.LogItemSeverityCode xgetSeverityCode();
    
    /**
     * True if has "SeverityCode" element
     */
    boolean isSetSeverityCode();
    
    /**
     * Sets the "SeverityCode" element
     */
    void setSeverityCode(java.lang.String severityCode);
    
    /**
     * Sets (as xml) the "SeverityCode" element
     */
    void xsetSeverityCode(com.sap.xi.ap.common.gdt.LogItemSeverityCode severityCode);
    
    /**
     * Unsets the "SeverityCode" element
     */
    void unsetSeverityCode();
    
    /**
     * Gets the "ReferenceObjectNodeSenderTechnicalID" element
     */
    java.lang.String getReferenceObjectNodeSenderTechnicalID();
    
    /**
     * Gets (as xml) the "ReferenceObjectNodeSenderTechnicalID" element
     */
    com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID xgetReferenceObjectNodeSenderTechnicalID();
    
    /**
     * True if has "ReferenceObjectNodeSenderTechnicalID" element
     */
    boolean isSetReferenceObjectNodeSenderTechnicalID();
    
    /**
     * Sets the "ReferenceObjectNodeSenderTechnicalID" element
     */
    void setReferenceObjectNodeSenderTechnicalID(java.lang.String referenceObjectNodeSenderTechnicalID);
    
    /**
     * Sets (as xml) the "ReferenceObjectNodeSenderTechnicalID" element
     */
    void xsetReferenceObjectNodeSenderTechnicalID(com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID referenceObjectNodeSenderTechnicalID);
    
    /**
     * Unsets the "ReferenceObjectNodeSenderTechnicalID" element
     */
    void unsetReferenceObjectNodeSenderTechnicalID();
    
    /**
     * Gets the "ReferenceMessageElementName" element
     */
    java.lang.String getReferenceMessageElementName();
    
    /**
     * Gets (as xml) the "ReferenceMessageElementName" element
     */
    com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName xgetReferenceMessageElementName();
    
    /**
     * True if has "ReferenceMessageElementName" element
     */
    boolean isSetReferenceMessageElementName();
    
    /**
     * Sets the "ReferenceMessageElementName" element
     */
    void setReferenceMessageElementName(java.lang.String referenceMessageElementName);
    
    /**
     * Sets (as xml) the "ReferenceMessageElementName" element
     */
    void xsetReferenceMessageElementName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName referenceMessageElementName);
    
    /**
     * Unsets the "ReferenceMessageElementName" element
     */
    void unsetReferenceMessageElementName();
    
    /**
     * Gets the "Note" element
     */
    java.lang.String getNote();
    
    /**
     * Gets (as xml) the "Note" element
     */
    com.sap.xi.ap.common.gdt.LogItemNote xgetNote();
    
    /**
     * Sets the "Note" element
     */
    void setNote(java.lang.String note);
    
    /**
     * Sets (as xml) the "Note" element
     */
    void xsetNote(com.sap.xi.ap.common.gdt.LogItemNote note);
    
    /**
     * Gets the "NoteTemplateText" element
     */
    java.lang.String getNoteTemplateText();
    
    /**
     * Gets (as xml) the "NoteTemplateText" element
     */
    com.sap.xi.ap.common.gdt.LogItemNoteTemplateText xgetNoteTemplateText();
    
    /**
     * True if has "NoteTemplateText" element
     */
    boolean isSetNoteTemplateText();
    
    /**
     * Sets the "NoteTemplateText" element
     */
    void setNoteTemplateText(java.lang.String noteTemplateText);
    
    /**
     * Sets (as xml) the "NoteTemplateText" element
     */
    void xsetNoteTemplateText(com.sap.xi.ap.common.gdt.LogItemNoteTemplateText noteTemplateText);
    
    /**
     * Unsets the "NoteTemplateText" element
     */
    void unsetNoteTemplateText();
    
    /**
     * Gets the "LogItemNotePlaceholderSubstitutionList" element
     */
    com.sap.xi.ap.common.gdt.LogItemNotePlaceholderSubstitutionList getLogItemNotePlaceholderSubstitutionList();
    
    /**
     * True if has "LogItemNotePlaceholderSubstitutionList" element
     */
    boolean isSetLogItemNotePlaceholderSubstitutionList();
    
    /**
     * Sets the "LogItemNotePlaceholderSubstitutionList" element
     */
    void setLogItemNotePlaceholderSubstitutionList(com.sap.xi.ap.common.gdt.LogItemNotePlaceholderSubstitutionList logItemNotePlaceholderSubstitutionList);
    
    /**
     * Appends and returns a new empty "LogItemNotePlaceholderSubstitutionList" element
     */
    com.sap.xi.ap.common.gdt.LogItemNotePlaceholderSubstitutionList addNewLogItemNotePlaceholderSubstitutionList();
    
    /**
     * Unsets the "LogItemNotePlaceholderSubstitutionList" element
     */
    void unsetLogItemNotePlaceholderSubstitutionList();
    
    /**
     * Gets the "WebURI" element
     */
    java.lang.String getWebURI();
    
    /**
     * Gets (as xml) the "WebURI" element
     */
    com.sap.xi.ap.common.gdt.WebURI xgetWebURI();
    
    /**
     * True if has "WebURI" element
     */
    boolean isSetWebURI();
    
    /**
     * Sets the "WebURI" element
     */
    void setWebURI(java.lang.String webURI);
    
    /**
     * Sets (as xml) the "WebURI" element
     */
    void xsetWebURI(com.sap.xi.ap.common.gdt.WebURI webURI);
    
    /**
     * Unsets the "WebURI" element
     */
    void unsetWebURI();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.ap.common.gdt.LogItem newInstance() {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.ap.common.gdt.LogItem newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.ap.common.gdt.LogItem parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.LogItem parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.ap.common.gdt.LogItem parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.LogItem parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.LogItem parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.LogItem parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.LogItem parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.LogItem parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.LogItem parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.LogItem parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.LogItem parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.LogItem parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.LogItem parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.LogItem parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.LogItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.LogItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.LogItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
