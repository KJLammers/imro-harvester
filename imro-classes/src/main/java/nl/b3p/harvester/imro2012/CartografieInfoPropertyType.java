//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.07 at 09:45:45 AM CET 
//


package nl.b3p.harvester.imro2012;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CartografieInfoPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CartografieInfoPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.geonovum.nl/imro/2012/1.1}CartografieInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CartografieInfoPropertyType", propOrder = {
    "cartografieInfo"
})
public class CartografieInfoPropertyType {

    @XmlElement(name = "CartografieInfo", required = true)
    protected CartografieInfoType cartografieInfo;

    /**
     * Gets the value of the cartografieInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CartografieInfoType }
     *     
     */
    public CartografieInfoType getCartografieInfo() {
        return cartografieInfo;
    }

    /**
     * Sets the value of the cartografieInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CartografieInfoType }
     *     
     */
    public void setCartografieInfo(CartografieInfoType value) {
        this.cartografieInfo = value;
    }

}
