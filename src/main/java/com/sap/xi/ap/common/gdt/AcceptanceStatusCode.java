/*
 * XML Type:  AcceptanceStatusCode
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.AcceptanceStatusCode
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt;


/**
 * An XML AcceptanceStatusCode(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.AcceptanceStatusCode.
 */
public interface AcceptanceStatusCode extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AcceptanceStatusCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC3CE6D3D93732D21BBFB9685A6096211").resolveHandle("acceptancestatuscode5440type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum AJ = Enum.forString("AJ");
    static final Enum AP = Enum.forString("AP");
    static final Enum RE = Enum.forString("RE");
    
    static final int INT_AJ = Enum.INT_AJ;
    static final int INT_AP = Enum.INT_AP;
    static final int INT_RE = Enum.INT_RE;
    
    /**
     * Enumeration value class for com.sap.xi.ap.common.gdt.AcceptanceStatusCode.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_AJ
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_AJ = 1;
        static final int INT_AP = 2;
        static final int INT_RE = 3;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("AJ", INT_AJ),
                new Enum("AP", INT_AP),
                new Enum("RE", INT_RE),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode newValue(java.lang.Object obj) {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) type.newValue( obj ); }
        
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode newInstance() {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.AcceptanceStatusCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
