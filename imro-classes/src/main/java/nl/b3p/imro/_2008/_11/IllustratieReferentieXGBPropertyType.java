//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.01 at 03:04:51 PM CEST 
//


package nl.b3p.imro._2008._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IllustratieReferentie_XGBPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IllustratieReferentie_XGBPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.geonovum.nl/imro/2008/1}IllustratieReferentie_XGB"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IllustratieReferentie_XGBPropertyType", propOrder = {
    "illustratieReferentieXGB"
})
public class IllustratieReferentieXGBPropertyType {

    @XmlElement(name = "IllustratieReferentie_XGB", required = true)
    protected IllustratieReferentieXGBType illustratieReferentieXGB;

    /**
     * Gets the value of the illustratieReferentieXGB property.
     * 
     * @return
     *     possible object is
     *     {@link IllustratieReferentieXGBType }
     *     
     */
    public IllustratieReferentieXGBType getIllustratieReferentieXGB() {
        return illustratieReferentieXGB;
    }

    /**
     * Sets the value of the illustratieReferentieXGB property.
     * 
     * @param value
     *     allowed object is
     *     {@link IllustratieReferentieXGBType }
     *     
     */
    public void setIllustratieReferentieXGB(IllustratieReferentieXGBType value) {
        this.illustratieReferentieXGB = value;
    }

}
