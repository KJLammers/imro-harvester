//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.01 at 08:41:05 AM CEST 
//


package nl.b3p.imro._2012._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IllustratieReferentiePGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IllustratieReferentiePGType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="verwijzingNaarIllustratie" type="{http://www.geonovum.nl/imro/2012/1.0}NotEmptyString"/>
 *         &lt;element name="typeIllustratie" type="{http://www.geonovum.nl/imro/2012/1.0}IllustratieType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IllustratieReferentiePGType", propOrder = {
    "verwijzingNaarIllustratie",
    "typeIllustratie"
})
public class IllustratieReferentiePGType {

    @XmlElement(required = true)
    protected String verwijzingNaarIllustratie;
    @XmlElement(required = true)
    protected IllustratieType typeIllustratie;

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

}
