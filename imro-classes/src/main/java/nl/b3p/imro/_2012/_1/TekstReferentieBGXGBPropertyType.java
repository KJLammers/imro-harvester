//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.25 at 03:20:11 PM CET 
//


package nl.b3p.imro._2012._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TekstReferentieBG_XGBPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TekstReferentieBG_XGBPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.geonovum.nl/imro/2012/1.1}TekstReferentieBG_XGB"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TekstReferentieBG_XGBPropertyType", propOrder = {
    "tekstReferentieBGXGB"
})
public class TekstReferentieBGXGBPropertyType {

    @XmlElement(name = "TekstReferentieBG_XGB", required = true)
    protected TekstReferentieBGXGBType tekstReferentieBGXGB;

    /**
     * Gets the value of the tekstReferentieBGXGB property.
     * 
     * @return
     *     possible object is
     *     {@link TekstReferentieBGXGBType }
     *     
     */
    public TekstReferentieBGXGBType getTekstReferentieBGXGB() {
        return tekstReferentieBGXGB;
    }

    /**
     * Sets the value of the tekstReferentieBGXGB property.
     * 
     * @param value
     *     allowed object is
     *     {@link TekstReferentieBGXGBType }
     *     
     */
    public void setTekstReferentieBGXGB(TekstReferentieBGXGBType value) {
        this.tekstReferentieBGXGB = value;
    }

}
