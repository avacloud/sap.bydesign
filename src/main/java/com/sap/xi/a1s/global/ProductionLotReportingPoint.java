/*
 * XML Type:  ProductionLotReportingPoint
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotReportingPoint
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ProductionLotReportingPoint(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ProductionLotReportingPoint extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductionLotReportingPoint.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7274E74C1D219A67E80FDE53A95800C").resolveHandle("productionlotreportingpointdd10type");
    
    /**
     * Gets the "ReportingPointID" element
     */
    java.lang.String getReportingPointID();
    
    /**
     * Gets (as xml) the "ReportingPointID" element
     */
    com.sap.xi.ap.common.gdt.ReportingPointID xgetReportingPointID();
    
    /**
     * True if has "ReportingPointID" element
     */
    boolean isSetReportingPointID();
    
    /**
     * Sets the "ReportingPointID" element
     */
    void setReportingPointID(java.lang.String reportingPointID);
    
    /**
     * Sets (as xml) the "ReportingPointID" element
     */
    void xsetReportingPointID(com.sap.xi.ap.common.gdt.ReportingPointID reportingPointID);
    
    /**
     * Unsets the "ReportingPointID" element
     */
    void unsetReportingPointID();
    
    /**
     * Gets the "ReportingPointUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getReportingPointUUID();
    
    /**
     * True if has "ReportingPointUUID" element
     */
    boolean isSetReportingPointUUID();
    
    /**
     * Sets the "ReportingPointUUID" element
     */
    void setReportingPointUUID(com.sap.xi.ap.common.gdt.UUID reportingPointUUID);
    
    /**
     * Appends and returns a new empty "ReportingPointUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewReportingPointUUID();
    
    /**
     * Unsets the "ReportingPointUUID" element
     */
    void unsetReportingPointUUID();
    
    /**
     * Gets the "ReportingPointStatus" element
     */
    com.sap.xi.ap.logisticsexecution.global.LogisticsLotReportingPointStatus getReportingPointStatus();
    
    /**
     * True if has "ReportingPointStatus" element
     */
    boolean isSetReportingPointStatus();
    
    /**
     * Sets the "ReportingPointStatus" element
     */
    void setReportingPointStatus(com.sap.xi.ap.logisticsexecution.global.LogisticsLotReportingPointStatus reportingPointStatus);
    
    /**
     * Appends and returns a new empty "ReportingPointStatus" element
     */
    com.sap.xi.ap.logisticsexecution.global.LogisticsLotReportingPointStatus addNewReportingPointStatus();
    
    /**
     * Unsets the "ReportingPointStatus" element
     */
    void unsetReportingPointStatus();
    
    /**
     * Gets the "TotalConfirmedQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity getTotalConfirmedQuantity();
    
    /**
     * True if has "TotalConfirmedQuantity" element
     */
    boolean isSetTotalConfirmedQuantity();
    
    /**
     * Sets the "TotalConfirmedQuantity" element
     */
    void setTotalConfirmedQuantity(com.sap.xi.ap.common.gdt.Quantity totalConfirmedQuantity);
    
    /**
     * Appends and returns a new empty "TotalConfirmedQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewTotalConfirmedQuantity();
    
    /**
     * Unsets the "TotalConfirmedQuantity" element
     */
    void unsetTotalConfirmedQuantity();
    
    /**
     * Gets the "ConfirmedQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity getConfirmedQuantity();
    
    /**
     * True if has "ConfirmedQuantity" element
     */
    boolean isSetConfirmedQuantity();
    
    /**
     * Sets the "ConfirmedQuantity" element
     */
    void setConfirmedQuantity(com.sap.xi.ap.common.gdt.Quantity confirmedQuantity);
    
    /**
     * Appends and returns a new empty "ConfirmedQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewConfirmedQuantity();
    
    /**
     * Unsets the "ConfirmedQuantity" element
     */
    void unsetConfirmedQuantity();
    
    /**
     * Gets the "TotalConfirmedScrap" element
     */
    com.sap.xi.ap.common.gdt.Quantity getTotalConfirmedScrap();
    
    /**
     * True if has "TotalConfirmedScrap" element
     */
    boolean isSetTotalConfirmedScrap();
    
    /**
     * Sets the "TotalConfirmedScrap" element
     */
    void setTotalConfirmedScrap(com.sap.xi.ap.common.gdt.Quantity totalConfirmedScrap);
    
    /**
     * Appends and returns a new empty "TotalConfirmedScrap" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewTotalConfirmedScrap();
    
    /**
     * Unsets the "TotalConfirmedScrap" element
     */
    void unsetTotalConfirmedScrap();
    
    /**
     * Gets the "ConfirmedScrap" element
     */
    com.sap.xi.ap.common.gdt.Quantity getConfirmedScrap();
    
    /**
     * True if has "ConfirmedScrap" element
     */
    boolean isSetConfirmedScrap();
    
    /**
     * Sets the "ConfirmedScrap" element
     */
    void setConfirmedScrap(com.sap.xi.ap.common.gdt.Quantity confirmedScrap);
    
    /**
     * Appends and returns a new empty "ConfirmedScrap" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewConfirmedScrap();
    
    /**
     * Unsets the "ConfirmedScrap" element
     */
    void unsetConfirmedScrap();
    
    /**
     * Gets the "OpenQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity getOpenQuantity();
    
    /**
     * True if has "OpenQuantity" element
     */
    boolean isSetOpenQuantity();
    
    /**
     * Sets the "OpenQuantity" element
     */
    void setOpenQuantity(com.sap.xi.ap.common.gdt.Quantity openQuantity);
    
    /**
     * Appends and returns a new empty "OpenQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewOpenQuantity();
    
    /**
     * Unsets the "OpenQuantity" element
     */
    void unsetOpenQuantity();
    
    /**
     * Gets the "DeviationReason" element
     */
    com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode getDeviationReason();
    
    /**
     * True if has "DeviationReason" element
     */
    boolean isSetDeviationReason();
    
    /**
     * Sets the "DeviationReason" element
     */
    void setDeviationReason(com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode deviationReason);
    
    /**
     * Appends and returns a new empty "DeviationReason" element
     */
    com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode addNewDeviationReason();
    
    /**
     * Unsets the "DeviationReason" element
     */
    void unsetDeviationReason();
    
    /**
     * Gets the "PlannedQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity getPlannedQuantity();
    
    /**
     * True if has "PlannedQuantity" element
     */
    boolean isSetPlannedQuantity();
    
    /**
     * Sets the "PlannedQuantity" element
     */
    void setPlannedQuantity(com.sap.xi.ap.common.gdt.Quantity plannedQuantity);
    
    /**
     * Appends and returns a new empty "PlannedQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewPlannedQuantity();
    
    /**
     * Unsets the "PlannedQuantity" element
     */
    void unsetPlannedQuantity();
    
    /**
     * Gets the "ConfirmationFinishedIndicator" element
     */
    boolean getConfirmationFinishedIndicator();
    
    /**
     * Gets (as xml) the "ConfirmationFinishedIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetConfirmationFinishedIndicator();
    
    /**
     * True if has "ConfirmationFinishedIndicator" element
     */
    boolean isSetConfirmationFinishedIndicator();
    
    /**
     * Sets the "ConfirmationFinishedIndicator" element
     */
    void setConfirmationFinishedIndicator(boolean confirmationFinishedIndicator);
    
    /**
     * Sets (as xml) the "ConfirmationFinishedIndicator" element
     */
    void xsetConfirmationFinishedIndicator(com.sap.xi.ap.common.gdt.Indicator confirmationFinishedIndicator);
    
    /**
     * Unsets the "ConfirmationFinishedIndicator" element
     */
    void unsetConfirmationFinishedIndicator();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint newInstance() {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotReportingPoint parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotReportingPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
