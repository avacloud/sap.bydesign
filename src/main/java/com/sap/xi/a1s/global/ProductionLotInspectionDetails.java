/*
 * XML Type:  ProductionLotInspectionDetails
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotInspectionDetails
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ProductionLotInspectionDetails(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ProductionLotInspectionDetails extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductionLotInspectionDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7274E74C1D219A67E80FDE53A95800C").resolveHandle("productionlotinspectiondetails27a2type");
    
    /**
     * Gets the "EvaluationMode" element
     */
    java.lang.String getEvaluationMode();
    
    /**
     * Gets (as xml) the "EvaluationMode" element
     */
    com.sap.xi.ap.common.gdt.InspectionResultEvaluationTypeCode xgetEvaluationMode();
    
    /**
     * True if has "EvaluationMode" element
     */
    boolean isSetEvaluationMode();
    
    /**
     * Sets the "EvaluationMode" element
     */
    void setEvaluationMode(java.lang.String evaluationMode);
    
    /**
     * Sets (as xml) the "EvaluationMode" element
     */
    void xsetEvaluationMode(com.sap.xi.ap.common.gdt.InspectionResultEvaluationTypeCode evaluationMode);
    
    /**
     * Unsets the "EvaluationMode" element
     */
    void unsetEvaluationMode();
    
    /**
     * Gets the "InspectedQuantity" element
     */
    com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity getInspectedQuantity();
    
    /**
     * True if has "InspectedQuantity" element
     */
    boolean isSetInspectedQuantity();
    
    /**
     * Sets the "InspectedQuantity" element
     */
    void setInspectedQuantity(com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity inspectedQuantity);
    
    /**
     * Appends and returns a new empty "InspectedQuantity" element
     */
    com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity addNewInspectedQuantity();
    
    /**
     * Unsets the "InspectedQuantity" element
     */
    void unsetInspectedQuantity();
    
    /**
     * Gets the "DestructedQuantity" element
     */
    com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity getDestructedQuantity();
    
    /**
     * True if has "DestructedQuantity" element
     */
    boolean isSetDestructedQuantity();
    
    /**
     * Sets the "DestructedQuantity" element
     */
    void setDestructedQuantity(com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity destructedQuantity);
    
    /**
     * Appends and returns a new empty "DestructedQuantity" element
     */
    com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity addNewDestructedQuantity();
    
    /**
     * Unsets the "DestructedQuantity" element
     */
    void unsetDestructedQuantity();
    
    /**
     * Gets the "NonConformingUnits" element
     */
    int getNonConformingUnits();
    
    /**
     * Gets (as xml) the "NonConformingUnits" element
     */
    com.sap.xi.ap.common.gdt.NumberValue xgetNonConformingUnits();
    
    /**
     * True if has "NonConformingUnits" element
     */
    boolean isSetNonConformingUnits();
    
    /**
     * Sets the "NonConformingUnits" element
     */
    void setNonConformingUnits(int nonConformingUnits);
    
    /**
     * Sets (as xml) the "NonConformingUnits" element
     */
    void xsetNonConformingUnits(com.sap.xi.ap.common.gdt.NumberValue nonConformingUnits);
    
    /**
     * Unsets the "NonConformingUnits" element
     */
    void unsetNonConformingUnits();
    
    /**
     * Gets the "InspectedBy" element
     */
    com.sap.xi.ap.common.gdt.EmployeeID getInspectedBy();
    
    /**
     * True if has "InspectedBy" element
     */
    boolean isSetInspectedBy();
    
    /**
     * Sets the "InspectedBy" element
     */
    void setInspectedBy(com.sap.xi.ap.common.gdt.EmployeeID inspectedBy);
    
    /**
     * Appends and returns a new empty "InspectedBy" element
     */
    com.sap.xi.ap.common.gdt.EmployeeID addNewInspectedBy();
    
    /**
     * Unsets the "InspectedBy" element
     */
    void unsetInspectedBy();
    
    /**
     * Gets the "EmployeeName" element
     */
    java.lang.String getEmployeeName();
    
    /**
     * Gets (as xml) the "EmployeeName" element
     */
    com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName xgetEmployeeName();
    
    /**
     * True if has "EmployeeName" element
     */
    boolean isSetEmployeeName();
    
    /**
     * Sets the "EmployeeName" element
     */
    void setEmployeeName(java.lang.String employeeName);
    
    /**
     * Sets (as xml) the "EmployeeName" element
     */
    void xsetEmployeeName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName employeeName);
    
    /**
     * Unsets the "EmployeeName" element
     */
    void unsetEmployeeName();
    
    /**
     * Gets the "ProposedEvaluation" element
     */
    com.sap.xi.ap.common.gdt.AcceptanceStatusCode.Enum getProposedEvaluation();
    
    /**
     * Gets (as xml) the "ProposedEvaluation" element
     */
    com.sap.xi.ap.common.gdt.AcceptanceStatusCode xgetProposedEvaluation();
    
    /**
     * True if has "ProposedEvaluation" element
     */
    boolean isSetProposedEvaluation();
    
    /**
     * Sets the "ProposedEvaluation" element
     */
    void setProposedEvaluation(com.sap.xi.ap.common.gdt.AcceptanceStatusCode.Enum proposedEvaluation);
    
    /**
     * Sets (as xml) the "ProposedEvaluation" element
     */
    void xsetProposedEvaluation(com.sap.xi.ap.common.gdt.AcceptanceStatusCode proposedEvaluation);
    
    /**
     * Unsets the "ProposedEvaluation" element
     */
    void unsetProposedEvaluation();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails newInstance() {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotInspectionDetails parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
