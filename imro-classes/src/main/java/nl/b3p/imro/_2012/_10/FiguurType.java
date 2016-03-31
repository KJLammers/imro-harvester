//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.31 at 03:43:56 PM CEST 
//


package nl.b3p.imro._2012._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{http://www.geonovum.nl/imro/2012/1.0}AanduidingType">
 *       &lt;sequence>
 *         &lt;element name="naam" type="{http://www.geonovum.nl/imro/2012/1.0}FigurenType"/>
 *         &lt;element name="verwijzingNaarIllustratieInfo" type="{http://www.geonovum.nl/imro/2012/1.0}IllustratieReferentie_BPPropertyType" minOccurs="0"/>
 *         &lt;element name="labelInfo" type="{http://www.geonovum.nl/imro/2012/1.0}LabelPropertyType" minOccurs="0"/>
 *         &lt;element name="verwijzingNaarTekstInfo" type="{http://www.geonovum.nl/imro/2012/1.0}TekstReferentie_BPPropertyType" minOccurs="0"/>
 *         &lt;element name="geometrie" type="{http://www.geonovum.nl/imro/2012/1.0}LijnMultiLijnPropertyType"/>
 *         &lt;element name="aanduiding" type="{http://www.geonovum.nl/imro/2012/1.0}AanduidingPropertyType" maxOccurs="unbounded" minOccurs="0"/>
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
    "verwijzingNaarTekstInfo",
    "geometrie",
    "aanduiding"
})
public class FiguurType
    extends AanduidingType
{

    @XmlElement(required = true)
    protected String naam;
    protected IllustratieReferentieBPPropertyType verwijzingNaarIllustratieInfo;
    protected LabelPropertyType labelInfo;
    protected TekstReferentieBPPropertyType verwijzingNaarTekstInfo;
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
     * Gets the value of the verwijzingNaarTekstInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TekstReferentieBPPropertyType }
     *     
     */
    public TekstReferentieBPPropertyType getVerwijzingNaarTekstInfo() {
        return verwijzingNaarTekstInfo;
    }

    /**
     * Sets the value of the verwijzingNaarTekstInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TekstReferentieBPPropertyType }
     *     
     */
    public void setVerwijzingNaarTekstInfo(TekstReferentieBPPropertyType value) {
        this.verwijzingNaarTekstInfo = value;
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
