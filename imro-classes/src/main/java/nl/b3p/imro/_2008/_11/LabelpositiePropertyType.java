//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.30 at 11:41:45 AM CEST 
//


package nl.b3p.imro._2008._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelpositiePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelpositiePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.geonovum.nl/imro/2008/1}Labelpositie"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelpositiePropertyType", propOrder = {
    "labelpositie"
})
public class LabelpositiePropertyType {

    @XmlElement(name = "Labelpositie", required = true)
    protected LabelpositieType labelpositie;

    /**
     * Gets the value of the labelpositie property.
     * 
     * @return
     *     possible object is
     *     {@link LabelpositieType }
     *     
     */
    public LabelpositieType getLabelpositie() {
        return labelpositie;
    }

    /**
     * Sets the value of the labelpositie property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelpositieType }
     *     
     */
    public void setLabelpositie(LabelpositieType value) {
        this.labelpositie = value;
    }

}