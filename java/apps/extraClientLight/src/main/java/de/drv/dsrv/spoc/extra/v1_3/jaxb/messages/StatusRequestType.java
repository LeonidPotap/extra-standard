//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.24 at 11:30:02 AM CEST 
//


package de.drv.dsrv.spoc.extra.v1_3.jaxb.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Query" type="{http://www.extra-standard.de/namespace/message/1}StatusRequestQueryType"/>
 *         &lt;element name="Control" type="{http://www.extra-standard.de/namespace/message/1}ControlType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="1.0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusRequestType", propOrder = {
    "query",
    "control"
})
public class StatusRequestType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Query", required = true)
    protected StatusRequestQueryType query;
    @XmlElement(name = "Control")
    protected ControlType control;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link StatusRequestQueryType }
     *     
     */
    public StatusRequestQueryType getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusRequestQueryType }
     *     
     */
    public void setQuery(StatusRequestQueryType value) {
        this.query = value;
    }

    /**
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link ControlType }
     *     
     */
    public ControlType getControl() {
        return control;
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlType }
     *     
     */
    public void setControl(ControlType value) {
        this.control = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
