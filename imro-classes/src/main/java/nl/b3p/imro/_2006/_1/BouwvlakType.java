//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.31 at 02:05:22 PM CEST 
//


package nl.b3p.imro._2006._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for BouwvlakType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BouwvlakType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ravi.nl/imro2006}AanduidingType">
 *       &lt;sequence>
 *         &lt;element name="eigenGeometrie" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="geometrie" type="{http://www.ravi.nl/imro2006}VlakMultiVlakPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BouwvlakType", propOrder = {
    "eigenGeometrie",
    "geometrie"
})
public class BouwvlakType
    extends AanduidingType
{

    protected Boolean eigenGeometrie;
    @XmlAnyElement
    protected Element geometrie;

    /**
     * Gets the value of the eigenGeometrie property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEigenGeometrie() {
        return eigenGeometrie;
    }

    /**
     * Sets the value of the eigenGeometrie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEigenGeometrie(Boolean value) {
        this.eigenGeometrie = value;
    }

    /**
     * Gets the value of the geometrie property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getGeometrie() {
        return geometrie;
    }

    /**
     * Sets the value of the geometrie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setGeometrie(Element value) {
        this.geometrie = value;
    }

}
