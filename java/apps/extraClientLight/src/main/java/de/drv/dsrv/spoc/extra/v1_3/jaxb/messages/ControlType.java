//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.24 at 11:30:02 AM CEST 
//


package de.drv.dsrv.spoc.extra.v1_3.jaxb.messages;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaximumPackages" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="MaximumMessages" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="MaximumResults" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="MaximumSize" type="{http://www.extra-standard.de/namespace/message/1}SpaceSizeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlType", propOrder = {
    "maximumPackages",
    "maximumMessages",
    "maximumResults",
    "maximumSize"
})
public class ControlType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MaximumPackages")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumPackages;
    @XmlElement(name = "MaximumMessages")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumMessages;
    @XmlElement(name = "MaximumResults")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumResults;
    @XmlElement(name = "MaximumSize")
    protected String maximumSize;

    /**
     * Gets the value of the maximumPackages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumPackages() {
        return maximumPackages;
    }

    /**
     * Sets the value of the maximumPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumPackages(BigInteger value) {
        this.maximumPackages = value;
    }

    /**
     * Gets the value of the maximumMessages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumMessages() {
        return maximumMessages;
    }

    /**
     * Sets the value of the maximumMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumMessages(BigInteger value) {
        this.maximumMessages = value;
    }

    /**
     * Gets the value of the maximumResults property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumResults() {
        return maximumResults;
    }

    /**
     * Sets the value of the maximumResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumResults(BigInteger value) {
        this.maximumResults = value;
    }

    /**
     * Gets the value of the maximumSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumSize() {
        return maximumSize;
    }

    /**
     * Sets the value of the maximumSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumSize(String value) {
        this.maximumSize = value;
    }

}
