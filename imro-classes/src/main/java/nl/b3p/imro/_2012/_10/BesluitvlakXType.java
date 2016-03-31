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
import nl.b3p.imro.gml4nl.CodeType;
import org.w3c.dom.Element;


/**
 * <p>Java class for Besluitvlak_XType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Besluitvlak_XType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.geonovum.nl/imro/2012/1.0}PlanobjectType">
 *       &lt;sequence>
 *         &lt;element name="naam" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="verwijzingNaarTekstInfo" type="{http://www.geonovum.nl/imro/2012/1.0}TekstReferentie_XGBPropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="geometrie" type="{http://www.geonovum.nl/imro/2012/1.0}VlakMultiVlakPropertyType"/>
 *         &lt;element name="besluitgebied" type="{http://www.geonovum.nl/imro/2012/1.0}Besluitgebied_XPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Besluitvlak_XType", propOrder = {
    "naam",
    "verwijzingNaarTekstInfo",
    "geometrie",
    "besluitgebied"
})
public class BesluitvlakXType
    extends PlanobjectType
{

    @XmlElement(required = true)
    protected CodeType naam;
    @XmlElement(required = true)
    protected List<TekstReferentieXGBPropertyType> verwijzingNaarTekstInfo;
    @XmlAnyElement
    protected Element geometrie;
    @XmlAnyElement
    protected Element besluitgebied;

    /**
     * Gets the value of the naam property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getNaam() {
        return naam;
    }

    /**
     * Sets the value of the naam property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setNaam(CodeType value) {
        this.naam = value;
    }

    /**
     * Gets the value of the verwijzingNaarTekstInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verwijzingNaarTekstInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerwijzingNaarTekstInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TekstReferentieXGBPropertyType }
     * 
     * 
     */
    public List<TekstReferentieXGBPropertyType> getVerwijzingNaarTekstInfo() {
        if (verwijzingNaarTekstInfo == null) {
            verwijzingNaarTekstInfo = new ArrayList<TekstReferentieXGBPropertyType>();
        }
        return this.verwijzingNaarTekstInfo;
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
     * Gets the value of the besluitgebied property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getBesluitgebied() {
        return besluitgebied;
    }

    /**
     * Sets the value of the besluitgebied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setBesluitgebied(Element value) {
        this.besluitgebied = value;
    }

}