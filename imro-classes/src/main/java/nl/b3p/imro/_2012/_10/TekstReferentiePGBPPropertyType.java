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
 * <p>Java class for TekstReferentiePG_BPPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TekstReferentiePG_BPPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.geonovum.nl/imro/2012/1.0}TekstReferentiePG_BP"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TekstReferentiePG_BPPropertyType", propOrder = {
    "tekstReferentiePGBP"
})
public class TekstReferentiePGBPPropertyType {

    @XmlElement(name = "TekstReferentiePG_BP", required = true)
    protected TekstReferentiePGBPType tekstReferentiePGBP;

    /**
     * Gets the value of the tekstReferentiePGBP property.
     * 
     * @return
     *     possible object is
     *     {@link TekstReferentiePGBPType }
     *     
     */
    public TekstReferentiePGBPType getTekstReferentiePGBP() {
        return tekstReferentiePGBP;
    }

    /**
     * Sets the value of the tekstReferentiePGBP property.
     * 
     * @param value
     *     allowed object is
     *     {@link TekstReferentiePGBPType }
     *     
     */
    public void setTekstReferentiePGBP(TekstReferentiePGBPType value) {
        this.tekstReferentiePGBP = value;
    }

}
