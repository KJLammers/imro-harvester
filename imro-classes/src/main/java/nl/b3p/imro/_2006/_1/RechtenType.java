//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.31 at 02:05:22 PM CEST 
//


package nl.b3p.imro._2006._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RechtenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RechtenType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="rechtsType" type="{http://www.ravi.nl/imro2006}RechtstypeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechtenType", propOrder = {
    "rechtsType"
})
public class RechtenType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected RechtstypeType rechtsType;

    /**
     * Gets the value of the rechtsType property.
     * 
     * @return
     *     possible object is
     *     {@link RechtstypeType }
     *     
     */
    public RechtstypeType getRechtsType() {
        return rechtsType;
    }

    /**
     * Sets the value of the rechtsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechtstypeType }
     *     
     */
    public void setRechtsType(RechtstypeType value) {
        this.rechtsType = value;
    }

}
