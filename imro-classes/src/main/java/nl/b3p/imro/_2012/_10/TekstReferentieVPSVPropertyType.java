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
 * <p>Java class for TekstReferentieV_PSVPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TekstReferentieV_PSVPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.geonovum.nl/imro/2012/1.0}TekstReferentieV_PSV"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TekstReferentieV_PSVPropertyType", propOrder = {
    "tekstReferentieVPSV"
})
public class TekstReferentieVPSVPropertyType {

    @XmlElement(name = "TekstReferentieV_PSV", required = true)
    protected TekstReferentieVPSVType tekstReferentieVPSV;

    /**
     * Gets the value of the tekstReferentieVPSV property.
     * 
     * @return
     *     possible object is
     *     {@link TekstReferentieVPSVType }
     *     
     */
    public TekstReferentieVPSVType getTekstReferentieVPSV() {
        return tekstReferentieVPSV;
    }

    /**
     * Sets the value of the tekstReferentieVPSV property.
     * 
     * @param value
     *     allowed object is
     *     {@link TekstReferentieVPSVType }
     *     
     */
    public void setTekstReferentieVPSV(TekstReferentieVPSVType value) {
        this.tekstReferentieVPSV = value;
    }

}
