//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.24 at 01:09:58 PM CET 
//


package nl.b3p.imro._2012._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NEN3610IDPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NEN3610IDPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.geonovum.nl/imro/2012/1.1}NEN3610ID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NEN3610IDPropertyType", propOrder = {
    "nen3610ID"
})
public class NEN3610IDPropertyType {

    @XmlElement(name = "NEN3610ID", required = true)
    protected NEN3610IDType nen3610ID;

    /**
     * Gets the value of the nen3610ID property.
     * 
     * @return
     *     possible object is
     *     {@link NEN3610IDType }
     *     
     */
    public NEN3610IDType getNEN3610ID() {
        return nen3610ID;
    }

    /**
     * Sets the value of the nen3610ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NEN3610IDType }
     *     
     */
    public void setNEN3610ID(NEN3610IDType value) {
        this.nen3610ID = value;
    }

}
