//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.24 at 01:09:58 PM CET 
//


package nl.b3p.imro._2012._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NEN3610IDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NEN3610IDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="namespace" type="{http://www.geonovum.nl/imro/2012/1.1}NotEmptyString"/>
 *         &lt;element name="lokaalID" type="{http://www.geonovum.nl/imro/2012/1.1}NotEmptyString"/>
 *         &lt;element name="versie" type="{http://www.geonovum.nl/imro/2012/1.1}NotEmptyString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NEN3610IDType", propOrder = {
    "namespace",
    "lokaalID",
    "versie"
})
public class NEN3610IDType {

    @XmlElement(required = true)
    protected String namespace;
    @XmlElement(required = true)
    protected String lokaalID;
    protected String versie;

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the lokaalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLokaalID() {
        return lokaalID;
    }

    /**
     * Sets the value of the lokaalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLokaalID(String value) {
        this.lokaalID = value;
    }

    /**
     * Gets the value of the versie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersie() {
        return versie;
    }

    /**
     * Sets the value of the versie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersie(String value) {
        this.versie = value;
    }

}
