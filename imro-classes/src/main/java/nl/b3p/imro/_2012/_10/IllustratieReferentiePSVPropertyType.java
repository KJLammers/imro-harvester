//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.31 at 03:43:56 PM CEST 
//


package nl.b3p.imro._2012._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IllustratieReferentie_PSVPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IllustratieReferentie_PSVPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.geonovum.nl/imro/2012/1.0}IllustratieReferentie_PSV"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IllustratieReferentie_PSVPropertyType", propOrder = {
    "illustratieReferentiePSV"
})
public class IllustratieReferentiePSVPropertyType {

    @XmlElement(name = "IllustratieReferentie_PSV", required = true)
    protected IllustratieReferentiePSVType illustratieReferentiePSV;

    /**
     * Gets the value of the illustratieReferentiePSV property.
     * 
     * @return
     *     possible object is
     *     {@link IllustratieReferentiePSVType }
     *     
     */
    public IllustratieReferentiePSVType getIllustratieReferentiePSV() {
        return illustratieReferentiePSV;
    }

    /**
     * Sets the value of the illustratieReferentiePSV property.
     * 
     * @param value
     *     allowed object is
     *     {@link IllustratieReferentiePSVType }
     *     
     */
    public void setIllustratieReferentiePSV(IllustratieReferentiePSVType value) {
        this.illustratieReferentiePSV = value;
    }

}
