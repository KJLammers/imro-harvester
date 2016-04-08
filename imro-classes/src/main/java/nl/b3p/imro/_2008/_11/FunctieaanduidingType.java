//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.08 at 11:05:13 AM CEST 
//


package nl.b3p.imro._2008._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for FunctieaanduidingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctieaanduidingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.geonovum.nl/imro/2008/1}AanduidingType">
 *       &lt;sequence>
 *         &lt;element name="naam" type="{http://www.geonovum.nl/imro/2008/1}FunctieaanduidingenType"/>
 *         &lt;element name="labelInfo" type="{http://www.geonovum.nl/imro/2008/1}LabelPropertyType"/>
 *         &lt;element name="verwijzingNaarObjectgerichteTekst" type="{http://www.geonovum.nl/imro/2008/1}NotEmptyString" minOccurs="0"/>
 *         &lt;element name="geometrie" type="{http://www.opengis.net/gml}SurfacePropertyType"/>
 *         &lt;element name="aanduiding" type="{http://www.geonovum.nl/imro/2008/1}AanduidingPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctieaanduidingType", propOrder = {
    "naam",
    "labelInfo",
    "verwijzingNaarObjectgerichteTekst",
    "geometrie",
    "aanduiding"
})
public class FunctieaanduidingType
    extends AanduidingType
{

    @XmlElement(required = true)
    protected String naam;
    @XmlElement(required = true)
    protected LabelPropertyType labelInfo;
    protected String verwijzingNaarObjectgerichteTekst;
    @XmlAnyElement
    protected Element geometrie;
    @XmlAnyElement
    protected Element aanduiding;

    /**
     * Gets the value of the naam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Sets the value of the naam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaam(String value) {
        this.naam = value;
    }

    /**
     * Gets the value of the labelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LabelPropertyType }
     *     
     */
    public LabelPropertyType getLabelInfo() {
        return labelInfo;
    }

    /**
     * Sets the value of the labelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelPropertyType }
     *     
     */
    public void setLabelInfo(LabelPropertyType value) {
        this.labelInfo = value;
    }

    /**
     * Gets the value of the verwijzingNaarObjectgerichteTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerwijzingNaarObjectgerichteTekst() {
        return verwijzingNaarObjectgerichteTekst;
    }

    /**
     * Sets the value of the verwijzingNaarObjectgerichteTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerwijzingNaarObjectgerichteTekst(String value) {
        this.verwijzingNaarObjectgerichteTekst = value;
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

    /**
     * Gets the value of the aanduiding property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getAanduiding() {
        return aanduiding;
    }

    /**
     * Sets the value of the aanduiding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setAanduiding(Element value) {
        this.aanduiding = value;
    }

}
