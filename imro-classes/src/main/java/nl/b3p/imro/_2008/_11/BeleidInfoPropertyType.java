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
 * <p>Java class for BeleidInfoPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeleidInfoPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.geonovum.nl/imro/2008/1}BeleidInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeleidInfoPropertyType", propOrder = {
    "beleidInfo"
})
public class BeleidInfoPropertyType {

    @XmlElement(name = "BeleidInfo", required = true)
    protected BeleidInfoType beleidInfo;

    /**
     * Gets the value of the beleidInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BeleidInfoType }
     *     
     */
    public BeleidInfoType getBeleidInfo() {
        return beleidInfo;
    }

    /**
     * Sets the value of the beleidInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeleidInfoType }
     *     
     */
    public void setBeleidInfo(BeleidInfoType value) {
        this.beleidInfo = value;
    }

}
