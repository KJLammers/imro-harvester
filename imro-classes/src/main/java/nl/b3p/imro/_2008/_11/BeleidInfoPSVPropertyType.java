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
 * <p>Java class for BeleidInfo_PSVPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeleidInfo_PSVPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.geonovum.nl/imro/2008/1}BeleidInfo_PSV"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeleidInfo_PSVPropertyType", propOrder = {
    "beleidInfoPSV"
})
public class BeleidInfoPSVPropertyType {

    @XmlElement(name = "BeleidInfo_PSV", required = true)
    protected BeleidInfoPSVType beleidInfoPSV;

    /**
     * Gets the value of the beleidInfoPSV property.
     * 
     * @return
     *     possible object is
     *     {@link BeleidInfoPSVType }
     *     
     */
    public BeleidInfoPSVType getBeleidInfoPSV() {
        return beleidInfoPSV;
    }

    /**
     * Sets the value of the beleidInfoPSV property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeleidInfoPSVType }
     *     
     */
    public void setBeleidInfoPSV(BeleidInfoPSVType value) {
        this.beleidInfoPSV = value;
    }

}