//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 03:43:55 PM CET 
//


package nl.b3p.imro._2012._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IllustratieReferentieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IllustratieReferentieType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="verwijzingNaarIllustratie" type="{http://www.geonovum.nl/imro/2012/1.1}NotEmptyString"/>
 *         &lt;element name="typeIllustratie" type="{http://www.geonovum.nl/imro/2012/1.1}IllustratieType"/>
 *         &lt;element name="legendanaam" type="{http://www.geonovum.nl/imro/2012/1.1}NotEmptyString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IllustratieReferentieType", propOrder = {
    "verwijzingNaarIllustratie",
    "typeIllustratie",
    "legendanaam"
})
public class IllustratieReferentieType {

    @XmlElement(required = true)
    protected String verwijzingNaarIllustratie;
    @XmlElement(required = true)
    protected IllustratieType typeIllustratie;
    protected String legendanaam;

    /**
     * Gets the value of the verwijzingNaarIllustratie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerwijzingNaarIllustratie() {
        return verwijzingNaarIllustratie;
    }

    /**
     * Sets the value of the verwijzingNaarIllustratie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerwijzingNaarIllustratie(String value) {
        this.verwijzingNaarIllustratie = value;
    }

    /**
     * Gets the value of the typeIllustratie property.
     * 
     * @return
     *     possible object is
     *     {@link IllustratieType }
     *     
     */
    public IllustratieType getTypeIllustratie() {
        return typeIllustratie;
    }

    /**
     * Sets the value of the typeIllustratie property.
     * 
     * @param value
     *     allowed object is
     *     {@link IllustratieType }
     *     
     */
    public void setTypeIllustratie(IllustratieType value) {
        this.typeIllustratie = value;
    }

    /**
     * Gets the value of the legendanaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegendanaam() {
        return legendanaam;
    }

    /**
     * Sets the value of the legendanaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegendanaam(String value) {
        this.legendanaam = value;
    }

}