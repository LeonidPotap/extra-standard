//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.24 at 11:30:02 AM CEST 
//


package de.drv.dsrv.spoc.extra.v1_3.jaxb.plugins;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSourceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.extra-standard.de/namespace/plugins/1}AbstractPlugInType">
 *       &lt;sequence>
 *         &lt;element name="DataContainer" type="{http://www.extra-standard.de/namespace/plugins/1}DataContainerType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.extra-standard.de/namespace/components/1}AbstractVersionType">
 *             &lt;enumeration value="1.0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSourceType", propOrder = {
    "dataContainer"
})
public class DataSourceType
    extends AbstractPlugInType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DataContainer", required = true)
    protected DataContainerType dataContainer;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the dataContainer property.
     * 
     * @return
     *     possible object is
     *     {@link DataContainerType }
     *     
     */
    public DataContainerType getDataContainer() {
        return dataContainer;
    }

    /**
     * Sets the value of the dataContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataContainerType }
     *     
     */
    public void setDataContainer(DataContainerType value) {
        this.dataContainer = value;
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
