//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.24 at 01:09:58 PM CET 
//


package nl.b3p.imro._2012._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TekstReferentie_XGBType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TekstReferentie_XGBType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="verwijzingNaarTekst" type="{http://www.geonovum.nl/imro/2012/1.1}NotEmptyString"/>
 *         &lt;element name="typeTekst" type="{http://www.geonovum.nl/imro/2012/1.1}Teksttype_XGBType"/>
 *         &lt;element name="normadressant" type="{http://www.geonovum.nl/imro/2012/1.1}Normadressant_XGBType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TekstReferentie_XGBType", propOrder = {
    "verwijzingNaarTekst",
    "typeTekst",
    "normadressant"
})
public class TekstReferentieXGBType {

    @XmlElement(required = true)
    protected String verwijzingNaarTekst;
    @XmlElement(required = true)
    protected TeksttypeXGBType typeTekst;
    protected List<NormadressantXGBType> normadressant;

    /**
     * Gets the value of the verwijzingNaarTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerwijzingNaarTekst() {
        return verwijzingNaarTekst;
    }

    /**
     * Sets the value of the verwijzingNaarTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerwijzingNaarTekst(String value) {
        this.verwijzingNaarTekst = value;
    }

    /**
     * Gets the value of the typeTekst property.
     * 
     * @return
     *     possible object is
     *     {@link TeksttypeXGBType }
     *     
     */
    public TeksttypeXGBType getTypeTekst() {
        return typeTekst;
    }

    /**
     * Sets the value of the typeTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeksttypeXGBType }
     *     
     */
    public void setTypeTekst(TeksttypeXGBType value) {
        this.typeTekst = value;
    }

    /**
     * Gets the value of the normadressant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the normadressant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNormadressant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NormadressantXGBType }
     * 
     * 
     */
    public List<NormadressantXGBType> getNormadressant() {
        if (normadressant == null) {
            normadressant = new ArrayList<NormadressantXGBType>();
        }
        return this.normadressant;
    }

}
