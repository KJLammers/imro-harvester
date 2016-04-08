//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.08 at 11:05:13 AM CEST 
//


package nl.b3p.imro._2008._11;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for GeometriePlangebied_PType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeometriePlangebied_PType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="geometrie" type="{http://www.geonovum.nl/imro/2008/1}VlakMultiVlakPropertyType"/>
 *         &lt;element name="inwinningsschaal" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="idealisatie" type="{http://www.geonovum.nl/imro/2008/1}Idealisatie_1Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometriePlangebied_PType", propOrder = {
    "geometrie",
    "inwinningsschaal",
    "idealisatie"
})
public class GeometriePlangebiedPType
    extends AbstractFeatureType
{

    @XmlAnyElement
    protected Element geometrie;
    protected BigInteger inwinningsschaal;
    @XmlElement(required = true)
    protected Idealisatie1Type idealisatie;

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

    /**
     * Gets the value of the inwinningsschaal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInwinningsschaal() {
        return inwinningsschaal;
    }

    /**
     * Sets the value of the inwinningsschaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInwinningsschaal(BigInteger value) {
        this.inwinningsschaal = value;
    }

    /**
     * Gets the value of the idealisatie property.
     * 
     * @return
     *     possible object is
     *     {@link Idealisatie1Type }
     *     
     */
    public Idealisatie1Type getIdealisatie() {
        return idealisatie;
    }

    /**
     * Sets the value of the idealisatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Idealisatie1Type }
     *     
     */
    public void setIdealisatie(Idealisatie1Type value) {
        this.idealisatie = value;
    }

}
