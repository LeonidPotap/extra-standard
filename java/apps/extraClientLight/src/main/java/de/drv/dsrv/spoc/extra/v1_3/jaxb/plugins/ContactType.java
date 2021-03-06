//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.24 at 11:30:02 AM CEST 
//


package de.drv.dsrv.spoc.extra.v1_3.jaxb.plugins;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Endpoint" type="{http://www.extra-standard.de/namespace/plugins/1}EndpointType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="usageHint" type="{http://www.extra-standard.de/namespace/plugins/1}UsageHintType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactType", propOrder = {
    "endpoint"
})
public class ContactType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Endpoint", required = true)
    protected List<EndpointType> endpoint;
    @XmlAttribute(name = "usageHint")
    protected String usageHint;

    /**
     * Gets the value of the endpoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endpoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndpoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndpointType }
     * 
     * 
     */
    public List<EndpointType> getEndpoint() {
        if (endpoint == null) {
            endpoint = new ArrayList<EndpointType>();
        }
        return this.endpoint;
    }

    /**
     * Gets the value of the usageHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageHint() {
        return usageHint;
    }

    /**
     * Sets the value of the usageHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageHint(String value) {
        this.usageHint = value;
    }

}
