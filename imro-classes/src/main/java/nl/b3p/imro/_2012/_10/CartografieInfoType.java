//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.01 at 02:40:57 PM CEST 
//


package nl.b3p.imro._2012._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CartografieInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CartografieInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kaartnummer" type="{http://www.geonovum.nl/imro/2012/1.0}NotEmptyString"/>
 *         &lt;element name="kaartnaam" type="{http://www.geonovum.nl/imro/2012/1.0}NotEmptyString"/>
 *         &lt;element name="symboolcode" type="{http://www.geonovum.nl/imro/2012/1.0}NotEmptyString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CartografieInfoType", propOrder = {
    "kaartnummer",
    "kaartnaam",
    "symboolcode"
})
public class CartografieInfoType {

    @XmlElement(required = true)
    protected String kaartnummer;
    @XmlElement(required = true)
    protected String kaartnaam;
    protected String symboolcode;

    /**
     * Gets the value of the kaartnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKaartnummer() {
        return kaartnummer;
    }

    /**
     * Sets the value of the kaartnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKaartnummer(String value) {
        this.kaartnummer = value;
    }

    /**
     * Gets the value of the kaartnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKaartnaam() {
        return kaartnaam;
    }

    /**
     * Sets the value of the kaartnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKaartnaam(String value) {
        this.kaartnaam = value;
    }

    /**
     * Gets the value of the symboolcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymboolcode() {
        return symboolcode;
    }

    /**
     * Sets the value of the symboolcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymboolcode(String value) {
        this.symboolcode = value;
    }

}
