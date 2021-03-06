//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.17 at 10:51:25 AM CEST 
//


package nl.b3p.imro._2006._1;

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
 *     &lt;extension base="{http://www.ravi.nl/imro2006}AanduidingType">
 *       &lt;sequence>
 *         &lt;element name="labelInfo" type="{http://www.ravi.nl/imro2006}LabelPropertyType" minOccurs="0"/>
 *         &lt;element name="symboolInfo" type="{http://www.ravi.nl/imro2006}SymboolCodePropertyType" minOccurs="0"/>
 *         &lt;element name="verwijzingNaarTekst" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="artikelnummer" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="geometrie" type="{http://www.ravi.nl/imro2006}PuntLijnVlakCombiPropertyType" minOccurs="0"/>
 *         &lt;element name="aanduiding" type="{http://www.ravi.nl/imro2006}AanduidingPropertyType" minOccurs="0"/>
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
    "labelInfo",
    "symboolInfo",
    "verwijzingNaarTekst",
    "artikelnummer",
    "geometrie",
    "aanduiding"
})
public class FiguurType
    extends AanduidingType
{

    protected LabelPropertyType labelInfo;
    protected SymboolCodePropertyType symboolInfo;
    @XmlElement(required = true)
    protected List<String> verwijzingNaarTekst;
    @XmlElement(required = true)
    protected List<String> artikelnummer;
    @XmlAnyElement
    protected Element geometrie;
    protected AanduidingPropertyType aanduiding;

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
     * Gets the value of the symboolInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SymboolCodePropertyType }
     *     
     */
    public SymboolCodePropertyType getSymboolInfo() {
        return symboolInfo;
    }

    /**
     * Sets the value of the symboolInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymboolCodePropertyType }
     *     
     */
    public void setSymboolInfo(SymboolCodePropertyType value) {
        this.symboolInfo = value;
    }

    /**
     * Gets the value of the verwijzingNaarTekst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verwijzingNaarTekst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerwijzingNaarTekst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVerwijzingNaarTekst() {
        if (verwijzingNaarTekst == null) {
            verwijzingNaarTekst = new ArrayList<String>();
        }
        return this.verwijzingNaarTekst;
    }

    /**
     * Gets the value of the artikelnummer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artikelnummer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtikelnummer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getArtikelnummer() {
        if (artikelnummer == null) {
            artikelnummer = new ArrayList<String>();
        }
        return this.artikelnummer;
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
     *     {@link AanduidingPropertyType }
     *     
     */
    public AanduidingPropertyType getAanduiding() {
        return aanduiding;
    }

    /**
     * Sets the value of the aanduiding property.
     * 
     * @param value
     *     allowed object is
     *     {@link AanduidingPropertyType }
     *     
     */
    public void setAanduiding(AanduidingPropertyType value) {
        this.aanduiding = value;
    }

}
