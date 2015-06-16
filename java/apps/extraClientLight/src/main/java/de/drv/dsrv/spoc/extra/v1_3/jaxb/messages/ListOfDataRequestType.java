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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfDataRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfDataRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataRequest" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{http://www.extra-standard.de/namespace/message/1}DataRequestModel"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="1.0"/>
 *             &lt;enumeration value="1.1"/>
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
@XmlType(name = "ListOfDataRequestType", propOrder = {
    "dataRequest"
})
public class ListOfDataRequestType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DataRequest", required = true)
    protected List<ListOfDataRequestType.DataRequest> dataRequest;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the dataRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfDataRequestType.DataRequest }
     * 
     * 
     */
    public List<ListOfDataRequestType.DataRequest> getDataRequest() {
        if (dataRequest == null) {
            dataRequest = new ArrayList<ListOfDataRequestType.DataRequest>();
        }
        return this.dataRequest;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;group ref="{http://www.extra-standard.de/namespace/message/1}DataRequestModel"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "query",
        "control"
    })
    public static class DataRequest
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Query", required = true)
        protected DataRequestQueryType query;
        @XmlElement(name = "Control")
        protected ControlType control;

        /**
         * Gets the value of the query property.
         * 
         * @return
         *     possible object is
         *     {@link DataRequestQueryType }
         *     
         */
        public DataRequestQueryType getQuery() {
            return query;
        }

        /**
         * Sets the value of the query property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataRequestQueryType }
         *     
         */
        public void setQuery(DataRequestQueryType value) {
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

    }

}