//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.01 at 03:04:51 PM CEST 
//


package nl.b3p.imro._2008._11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for FiguurType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiguurType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.geonovum.nl/imro/2008/1}AanduidingType">
 *       &lt;sequence>
 *         &lt;element name="naam" type="{http://www.geonovum.nl/imro/2008/1}FigurenType"/>
 *         &lt;element name="verwijzingNaarIllustratieInfo" type="{http://www.geonovum.nl/imro/2008/1}IllustratieReferentie_BPPropertyType" minOccurs="0"/>
 *         &lt;element name="labelInfo" type="{http://www.geonovum.nl/imro/2008/1}LabelPropertyType" minOccurs="0"/>
 *         &lt;element name="verwijzingNaarObjectgerichteTekst" type="{http://www.geonovum.nl/imro/2008/1}NotEmptyString" minOccurs="0"/>
 *         &lt;element name="geometrie" type="{http://www.geonovum.nl/imro/2008/1}LijnMultiLijnPropertyType"/>
 *         &lt;element name="aanduiding" type="{http://www.geonovum.nl/imro/2008/1}AanduidingPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiguurType", propOrder = {
    "naam",
    "verwijzingNaarIllustratieInfo",
    "labelInfo",
    "verwijzingNaarObjectgerichteTekst",
    "geometrie",
    "aanduiding"
})
public class FiguurType
    extends AanduidingType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String naam;
    protected IllustratieReferentieBPPropertyType verwijzingNaarIllustratieInfo;
    protected LabelPropertyType labelInfo;
    protected String verwijzingNaarObjectgerichteTekst;
    @XmlAnyElement
    protected Element geometrie;
    @XmlAnyElement
    protected List<Element> aanduiding;

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
     * Gets the value of the verwijzingNaarIllustratieInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IllustratieReferentieBPPropertyType }
     *     
     */
    public IllustratieReferentieBPPropertyType getVerwijzingNaarIllustratieInfo() {
        return verwijzingNaarIllustratieInfo;
    }

    /**
     * Sets the value of the verwijzingNaarIllustratieInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IllustratieReferentieBPPropertyType }
     *     
     */
    public void setVerwijzingNaarIllustratieInfo(IllustratieReferentieBPPropertyType value) {
        this.verwijzingNaarIllustratieInfo = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aanduiding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAanduiding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAanduiding() {
        if (aanduiding == null) {
            aanduiding = new ArrayList<Element>();
        }
        return this.aanduiding;
    }

}
