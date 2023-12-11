/*
 * XML Type:  AgencyIdentificationCode
 * Namespace: http://sap.com/xi/BASIS/Global
 * Java type: com.sap.xi.basis.global.AgencyIdentificationCode
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.basis.global;


/**
 * An XML AgencyIdentificationCode(@http://sap.com/xi/BASIS/Global).
 *
 * This is an atomic type that is a restriction of com.sap.xi.basis.global.AgencyIdentificationCode.
 */
public interface AgencyIdentificationCode extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AgencyIdentificationCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("agencyidentificationcode337dtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum X_1 = Enum.forString("1");
    static final Enum X_5 = Enum.forString("5");
    static final Enum X_6 = Enum.forString("6");
    static final Enum X_16 = Enum.forString("16");
    static final Enum X_17 = Enum.forString("17");
    static final Enum X_84 = Enum.forString("84");
    static final Enum X_107 = Enum.forString("107");
    static final Enum X_109 = Enum.forString("109");
    static final Enum X_112 = Enum.forString("112");
    static final Enum X_113 = Enum.forString("113");
    static final Enum X_114 = Enum.forString("114");
    static final Enum X_116 = Enum.forString("116");
    static final Enum X_117 = Enum.forString("117");
    static final Enum X_124 = Enum.forString("124");
    static final Enum X_130 = Enum.forString("130");
    static final Enum X_131 = Enum.forString("131");
    static final Enum X_138 = Enum.forString("138");
    static final Enum X_142 = Enum.forString("142");
    static final Enum X_146 = Enum.forString("146");
    static final Enum X_262 = Enum.forString("262");
    static final Enum X_296 = Enum.forString("296");
    static final Enum X_310 = Enum.forString("310");
    
    static final int INT_X_1 = Enum.INT_X_1;
    static final int INT_X_5 = Enum.INT_X_5;
    static final int INT_X_6 = Enum.INT_X_6;
    static final int INT_X_16 = Enum.INT_X_16;
    static final int INT_X_17 = Enum.INT_X_17;
    static final int INT_X_84 = Enum.INT_X_84;
    static final int INT_X_107 = Enum.INT_X_107;
    static final int INT_X_109 = Enum.INT_X_109;
    static final int INT_X_112 = Enum.INT_X_112;
    static final int INT_X_113 = Enum.INT_X_113;
    static final int INT_X_114 = Enum.INT_X_114;
    static final int INT_X_116 = Enum.INT_X_116;
    static final int INT_X_117 = Enum.INT_X_117;
    static final int INT_X_124 = Enum.INT_X_124;
    static final int INT_X_130 = Enum.INT_X_130;
    static final int INT_X_131 = Enum.INT_X_131;
    static final int INT_X_138 = Enum.INT_X_138;
    static final int INT_X_142 = Enum.INT_X_142;
    static final int INT_X_146 = Enum.INT_X_146;
    static final int INT_X_262 = Enum.INT_X_262;
    static final int INT_X_296 = Enum.INT_X_296;
    static final int INT_X_310 = Enum.INT_X_310;
    
    /**
     * Enumeration value class for com.sap.xi.basis.global.AgencyIdentificationCode.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_X_1
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
        
        static final int INT_X_1 = 1;
        static final int INT_X_5 = 2;
        static final int INT_X_6 = 3;
        static final int INT_X_16 = 4;
        static final int INT_X_17 = 5;
        static final int INT_X_84 = 6;
        static final int INT_X_107 = 7;
        static final int INT_X_109 = 8;
        static final int INT_X_112 = 9;
        static final int INT_X_113 = 10;
        static final int INT_X_114 = 11;
        static final int INT_X_116 = 12;
        static final int INT_X_117 = 13;
        static final int INT_X_124 = 14;
        static final int INT_X_130 = 15;
        static final int INT_X_131 = 16;
        static final int INT_X_138 = 17;
        static final int INT_X_142 = 18;
        static final int INT_X_146 = 19;
        static final int INT_X_262 = 20;
        static final int INT_X_296 = 21;
        static final int INT_X_310 = 22;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("1", INT_X_1),
                new Enum("5", INT_X_5),
                new Enum("6", INT_X_6),
                new Enum("16", INT_X_16),
                new Enum("17", INT_X_17),
                new Enum("84", INT_X_84),
                new Enum("107", INT_X_107),
                new Enum("109", INT_X_109),
                new Enum("112", INT_X_112),
                new Enum("113", INT_X_113),
                new Enum("114", INT_X_114),
                new Enum("116", INT_X_116),
                new Enum("117", INT_X_117),
                new Enum("124", INT_X_124),
                new Enum("130", INT_X_130),
                new Enum("131", INT_X_131),
                new Enum("138", INT_X_138),
                new Enum("142", INT_X_142),
                new Enum("146", INT_X_146),
                new Enum("262", INT_X_262),
                new Enum("296", INT_X_296),
                new Enum("310", INT_X_310),
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
        public static com.sap.xi.basis.global.AgencyIdentificationCode newValue(java.lang.Object obj) {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) type.newValue( obj ); }
        
        public static com.sap.xi.basis.global.AgencyIdentificationCode newInstance() {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.basis.global.AgencyIdentificationCode newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.basis.global.AgencyIdentificationCode parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.basis.global.AgencyIdentificationCode parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.basis.global.AgencyIdentificationCode parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.basis.global.AgencyIdentificationCode parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.basis.global.AgencyIdentificationCode parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.basis.global.AgencyIdentificationCode parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.basis.global.AgencyIdentificationCode parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.basis.global.AgencyIdentificationCode parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.basis.global.AgencyIdentificationCode parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.basis.global.AgencyIdentificationCode parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.basis.global.AgencyIdentificationCode parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.basis.global.AgencyIdentificationCode parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.basis.global.AgencyIdentificationCode parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.basis.global.AgencyIdentificationCode parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.basis.global.AgencyIdentificationCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.basis.global.AgencyIdentificationCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.basis.global.AgencyIdentificationCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
