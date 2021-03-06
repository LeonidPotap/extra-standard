//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.24 at 11:30:02 AM CEST 
//


package de.drv.dsrv.spoc.extra.v1_3.jaxb.components;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import de.drv.dsrv.spoc.extra.v1_3.jaxb.plugins.TransformedDataType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.drv.dsrv.spoc.extra.v1_3.jaxb.components package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResponseDetails_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "ResponseDetails");
    private final static QName _Stack_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Stack");
    private final static QName _Procedure_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Procedure");
    private final static QName _Product_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Product");
    private final static QName _Sender_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Sender");
    private final static QName _RequestDetails_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "RequestDetails");
    private final static QName _Signatures_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Signatures");
    private final static QName _Application_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Application");
    private final static QName _XPath_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "XPath");
    private final static QName _ResponseID_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "ResponseID");
    private final static QName _Code_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Code");
    private final static QName _CharSequence_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "CharSequence");
    private final static QName _XMLFragment_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "XMLFragment");
    private final static QName _ReceiverID_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "ReceiverID");
    private final static QName _AnyXML_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "AnyXML");
    private final static QName _Name_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Name");
    private final static QName _Property_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Property");
    private final static QName _TimeStamp_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "TimeStamp");
    private final static QName _DataType_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "DataType");
    private final static QName _Data_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Data");
    private final static QName _Receiver_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Receiver");
    private final static QName _SenderID_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "SenderID");
    private final static QName _Scenario_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Scenario");
    private final static QName _Report_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Report");
    private final static QName _ComponentID_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "ComponentID");
    private final static QName _ElementSequence_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "ElementSequence");
    private final static QName _Base64CharSequence_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Base64CharSequence");
    private final static QName _ProcessID_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "ProcessID");
    private final static QName _TransformedData_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "TransformedData");
    private final static QName _RegistrationID_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "RegistrationID");
    private final static QName _Text_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Text");
    private final static QName _Originator_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Originator");
    private final static QName _Flag_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Flag");
    private final static QName _RequestID_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "RequestID");
    private final static QName _Manufacturer_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "Manufacturer");
    private final static QName _TestIndicator_QNAME = new QName("http://www.extra-standard.de/namespace/components/1", "TestIndicator");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.drv.dsrv.spoc.extra.v1_3.jaxb.components
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnyPlugInContainerType }
     * 
     */
    public AnyPlugInContainerType createAnyPlugInContainerType() {
        return new AnyPlugInContainerType();
    }

    /**
     * Create an instance of {@link Base64CharSequenceType }
     * 
     */
    public Base64CharSequenceType createBase64CharSequenceType() {
        return new Base64CharSequenceType();
    }

    /**
     * Create an instance of {@link DataType }
     * 
     */
    public DataType createDataType() {
        return new DataType();
    }

    /**
     * Create an instance of {@link ClassifiableIDType }
     * 
     */
    public ClassifiableIDType createClassifiableIDType() {
        return new ClassifiableIDType();
    }

    /**
     * Create an instance of {@link FlagType }
     * 
     */
    public FlagType createFlagType() {
        return new FlagType();
    }

    /**
     * Create an instance of {@link FlagCodeType }
     * 
     */
    public FlagCodeType createFlagCodeType() {
        return new FlagCodeType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link ReceiverType }
     * 
     */
    public ReceiverType createReceiverType() {
        return new ReceiverType();
    }

    /**
     * Create an instance of {@link RequestDetailsType }
     * 
     */
    public RequestDetailsType createRequestDetailsType() {
        return new RequestDetailsType();
    }

    /**
     * Create an instance of {@link ReportType }
     * 
     */
    public ReportType createReportType() {
        return new ReportType();
    }

    /**
     * Create an instance of {@link SenderType }
     * 
     */
    public SenderType createSenderType() {
        return new SenderType();
    }

    /**
     * Create an instance of {@link CharSequenceType }
     * 
     */
    public CharSequenceType createCharSequenceType() {
        return new CharSequenceType();
    }

    /**
     * Create an instance of {@link SignaturesType }
     * 
     */
    public SignaturesType createSignaturesType() {
        return new SignaturesType();
    }

    /**
     * Create an instance of {@link ResponseDetailsType }
     * 
     */
    public ResponseDetailsType createResponseDetailsType() {
        return new ResponseDetailsType();
    }

    /**
     * Create an instance of {@link XMLFragmentType }
     * 
     */
    public XMLFragmentType createXMLFragmentType() {
        return new XMLFragmentType();
    }

    /**
     * Create an instance of {@link AnyXMLType }
     * 
     */
    public AnyXMLType createAnyXMLType() {
        return new AnyXMLType();
    }

    /**
     * Create an instance of {@link ApplicationType }
     * 
     */
    public ApplicationType createApplicationType() {
        return new ApplicationType();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link ElementSequenceType }
     * 
     */
    public ElementSequenceType createElementSequenceType() {
        return new ElementSequenceType();
    }

    /**
     * Create an instance of {@link LoggingType }
     * 
     */
    public LoggingType createLoggingType() {
        return new LoggingType();
    }

    /**
     * Create an instance of {@link ClassifiableStringType }
     * 
     */
    public ClassifiableStringType createClassifiableStringType() {
        return new ClassifiableStringType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "ResponseDetails")
    public JAXBElement<ResponseDetailsType> createResponseDetails(ResponseDetailsType value) {
        return new JAXBElement<ResponseDetailsType>(_ResponseDetails_QNAME, ResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Stack")
    public JAXBElement<TextType> createStack(TextType value) {
        return new JAXBElement<TextType>(_Stack_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Procedure")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProcedure(String value) {
        return new JAXBElement<String>(_Procedure_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Product")
    public JAXBElement<TextType> createProduct(TextType value) {
        return new JAXBElement<TextType>(_Product_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Sender")
    public JAXBElement<SenderType> createSender(SenderType value) {
        return new JAXBElement<SenderType>(_Sender_QNAME, SenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "RequestDetails")
    public JAXBElement<RequestDetailsType> createRequestDetails(RequestDetailsType value) {
        return new JAXBElement<RequestDetailsType>(_RequestDetails_QNAME, RequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Signatures")
    public JAXBElement<SignaturesType> createSignatures(SignaturesType value) {
        return new JAXBElement<SignaturesType>(_Signatures_QNAME, SignaturesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Application")
    public JAXBElement<ApplicationType> createApplication(ApplicationType value) {
        return new JAXBElement<ApplicationType>(_Application_QNAME, ApplicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "XPath")
    public JAXBElement<TextType> createXPath(TextType value) {
        return new JAXBElement<TextType>(_XPath_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassifiableIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "ResponseID")
    public JAXBElement<ClassifiableIDType> createResponseID(ClassifiableIDType value) {
        return new JAXBElement<ClassifiableIDType>(_ResponseID_QNAME, ClassifiableIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlagCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Code")
    public JAXBElement<FlagCodeType> createCode(FlagCodeType value) {
        return new JAXBElement<FlagCodeType>(_Code_QNAME, FlagCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharSequenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "CharSequence")
    public JAXBElement<CharSequenceType> createCharSequence(CharSequenceType value) {
        return new JAXBElement<CharSequenceType>(_CharSequence_QNAME, CharSequenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLFragmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "XMLFragment")
    public JAXBElement<XMLFragmentType> createXMLFragment(XMLFragmentType value) {
        return new JAXBElement<XMLFragmentType>(_XMLFragment_QNAME, XMLFragmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassifiableIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "ReceiverID")
    public JAXBElement<ClassifiableIDType> createReceiverID(ClassifiableIDType value) {
        return new JAXBElement<ClassifiableIDType>(_ReceiverID_QNAME, ClassifiableIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyXMLType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "AnyXML")
    public JAXBElement<AnyXMLType> createAnyXML(AnyXMLType value) {
        return new JAXBElement<AnyXMLType>(_AnyXML_QNAME, AnyXMLType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Name")
    public JAXBElement<TextType> createName(TextType value) {
        return new JAXBElement<TextType>(_Name_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Property")
    public JAXBElement<PropertyType> createProperty(PropertyType value) {
        return new JAXBElement<PropertyType>(_Property_QNAME, PropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "TimeStamp")
    public JAXBElement<XMLGregorianCalendar> createTimeStamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TimeStamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "DataType")
    public JAXBElement<String> createDataType(String value) {
        return new JAXBElement<String>(_DataType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Data")
    public JAXBElement<DataType> createData(DataType value) {
        return new JAXBElement<DataType>(_Data_QNAME, DataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiverType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Receiver")
    public JAXBElement<ReceiverType> createReceiver(ReceiverType value) {
        return new JAXBElement<ReceiverType>(_Receiver_QNAME, ReceiverType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassifiableIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "SenderID")
    public JAXBElement<ClassifiableIDType> createSenderID(ClassifiableIDType value) {
        return new JAXBElement<ClassifiableIDType>(_SenderID_QNAME, ClassifiableIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Scenario")
    public JAXBElement<String> createScenario(String value) {
        return new JAXBElement<String>(_Scenario_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Report")
    public JAXBElement<ReportType> createReport(ReportType value) {
        return new JAXBElement<ReportType>(_Report_QNAME, ReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "ComponentID")
    public JAXBElement<String> createComponentID(String value) {
        return new JAXBElement<String>(_ComponentID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElementSequenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "ElementSequence")
    public JAXBElement<ElementSequenceType> createElementSequence(ElementSequenceType value) {
        return new JAXBElement<ElementSequenceType>(_ElementSequence_QNAME, ElementSequenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Base64CharSequenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Base64CharSequence")
    public JAXBElement<Base64CharSequenceType> createBase64CharSequence(Base64CharSequenceType value) {
        return new JAXBElement<Base64CharSequenceType>(_Base64CharSequence_QNAME, Base64CharSequenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "ProcessID")
    public JAXBElement<String> createProcessID(String value) {
        return new JAXBElement<String>(_ProcessID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformedDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "TransformedData")
    public JAXBElement<TransformedDataType> createTransformedData(TransformedDataType value) {
        return new JAXBElement<TransformedDataType>(_TransformedData_QNAME, TransformedDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassifiableIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "RegistrationID")
    public JAXBElement<ClassifiableIDType> createRegistrationID(ClassifiableIDType value) {
        return new JAXBElement<ClassifiableIDType>(_RegistrationID_QNAME, ClassifiableIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Text")
    public JAXBElement<TextType> createText(TextType value) {
        return new JAXBElement<TextType>(_Text_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Originator")
    public JAXBElement<TextType> createOriginator(TextType value) {
        return new JAXBElement<TextType>(_Originator_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlagType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Flag")
    public JAXBElement<FlagType> createFlag(FlagType value) {
        return new JAXBElement<FlagType>(_Flag_QNAME, FlagType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassifiableIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "RequestID")
    public JAXBElement<ClassifiableIDType> createRequestID(ClassifiableIDType value) {
        return new JAXBElement<ClassifiableIDType>(_RequestID_QNAME, ClassifiableIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "Manufacturer")
    public JAXBElement<String> createManufacturer(String value) {
        return new JAXBElement<String>(_Manufacturer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.extra-standard.de/namespace/components/1", name = "TestIndicator")
    public JAXBElement<String> createTestIndicator(String value) {
        return new JAXBElement<String>(_TestIndicator_QNAME, String.class, null, value);
    }

}
