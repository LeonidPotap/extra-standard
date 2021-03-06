//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.24 at 11:30:02 AM CEST 
//


package de.drv.dsrv.spoc.extra.v1_3.jaxb.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for AbstractArgumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractArgumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="EQ" type="{http://www.extra-standard.de/namespace/message/1}OperandType"/>
 *         &lt;element name="LE" type="{http://www.extra-standard.de/namespace/message/1}OperandType"/>
 *         &lt;element name="LT" type="{http://www.extra-standard.de/namespace/message/1}OperandType"/>
 *         &lt;sequence>
 *           &lt;choice>
 *             &lt;element name="GE" type="{http://www.extra-standard.de/namespace/message/1}OperandType"/>
 *             &lt;element name="GT" type="{http://www.extra-standard.de/namespace/message/1}OperandType"/>
 *           &lt;/choice>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="LE" type="{http://www.extra-standard.de/namespace/message/1}OperandType"/>
 *             &lt;element name="LT" type="{http://www.extra-standard.de/namespace/message/1}OperandType"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element name="IN" type="{http://www.extra-standard.de/namespace/message/1}OperandSetType"/>
 *       &lt;/choice>
 *       &lt;attribute name="type" type="{http://www.extra-standard.de/namespace/message/1}XSDPrefixedTypeCodes" default="xs:string" />
 *       &lt;attribute name="event" type="{http://www.extra-standard.de/namespace/message/1}EventNamesType" default="http://www.extra-standard.de/event/Default" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractArgumentType", propOrder = {
    "content"
})
@XmlSeeAlso({
    StatusRequestArgumentType.class,
    DataRequestArgumentType.class
})
public abstract class AbstractArgumentType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRefs({
        @XmlElementRef(name = "LT", namespace = "http://www.extra-standard.de/namespace/message/1", type = JAXBElement.class),
        @XmlElementRef(name = "EQ", namespace = "http://www.extra-standard.de/namespace/message/1", type = JAXBElement.class),
        @XmlElementRef(name = "LE", namespace = "http://www.extra-standard.de/namespace/message/1", type = JAXBElement.class),
        @XmlElementRef(name = "GT", namespace = "http://www.extra-standard.de/namespace/message/1", type = JAXBElement.class),
        @XmlElementRef(name = "IN", namespace = "http://www.extra-standard.de/namespace/message/1", type = JAXBElement.class),
        @XmlElementRef(name = "GE", namespace = "http://www.extra-standard.de/namespace/message/1", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends Serializable>> content;
    @XmlAttribute(name = "type")
    protected QName type;
    @XmlAttribute(name = "event")
    protected EventNamesType event;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "LE" is used by two different parts of a schema. See: 
     * line 514 of file:/var/lib/jenkins/jobs/SPoC_Rollout/workspace/source/SPoCeXTra-1.3/schema/eXTra-messages-1.xsd
     * line 506 of file:/var/lib/jenkins/jobs/SPoC_Rollout/workspace/source/SPoCeXTra-1.3/schema/eXTra-messages-1.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OperandType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperandType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperandType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperandType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperandSetType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperandType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.content;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getType() {
        if (type == null) {
            return new QName("http://www.w3.org/2001/XMLSchema", "string", "xs");
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setType(QName value) {
        this.type = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link EventNamesType }
     *     
     */
    public EventNamesType getEvent() {
        if (event == null) {
            return EventNamesType.Default;
        } else {
            return event;
        }
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventNamesType }
     *     
     */
    public void setEvent(EventNamesType value) {
        this.event = value;
    }

}
