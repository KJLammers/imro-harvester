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
 * <p>Java class for TekstReferentieBG_AMBType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TekstReferentieBG_AMBType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="verwijzingNaarTekst" type="{http://www.geonovum.nl/imro/2012/1.0}NotEmptyString"/>
 *         &lt;element name="typeTekst" type="{http://www.geonovum.nl/imro/2012/1.0}TeksttypeBG_AMBType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TekstReferentieBG_AMBType", propOrder = {
    "verwijzingNaarTekst",
    "typeTekst"
})
public class TekstReferentieBGAMBType {

    @XmlElement(required = true)
    protected String verwijzingNaarTekst;
    @XmlElement(required = true)
    protected TeksttypeBGAMBType typeTekst;

    /**
     * Gets the value of the verwijzingNaarTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerwijzingNaarTekst() {
        return verwijzingNaarTekst;
    }

    /**
     * Sets the value of the verwijzingNaarTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerwijzingNaarTekst(String value) {
        this.verwijzingNaarTekst = value;
    }

    /**
     * Gets the value of the typeTekst property.
     * 
     * @return
     *     possible object is
     *     {@link TeksttypeBGAMBType }
     *     
     */
    public TeksttypeBGAMBType getTypeTekst() {
        return typeTekst;
    }

    /**
     * Sets the value of the typeTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeksttypeBGAMBType }
     *     
     */
    public void setTypeTekst(TeksttypeBGAMBType value) {
        this.typeTekst = value;
    }

}
