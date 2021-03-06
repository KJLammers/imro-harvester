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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GemeentelijkComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GemeentelijkComplexType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ravi.nl/imro2006}ComplexType">
 *       &lt;sequence>
 *         &lt;element name="functieInfo" type="{http://www.ravi.nl/imro2006}FunctieElementStructuurvisiePropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="locatieNaam" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="naamVanKaart" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="verwijzingNaarExternPlan" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="verwijzingNaarKaart" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="verwijzingNaarTekst" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="woonplaatsNaam" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="plangebied" type="{http://www.ravi.nl/imro2006}StructuurvisieGebiedPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GemeentelijkComplexType", propOrder = {
    "functieInfo",
    "locatieNaam",
    "naamVanKaart",
    "verwijzingNaarExternPlan",
    "verwijzingNaarKaart",
    "verwijzingNaarTekst",
    "woonplaatsNaam",
    "plangebied"
})
public class GemeentelijkComplexType
    extends ComplexType
{

    @XmlElement(required = true)
    protected List<FunctieElementStructuurvisiePropertyType> functieInfo;
    protected List<String> locatieNaam;
    protected List<String> naamVanKaart;
    protected List<String> verwijzingNaarExternPlan;
    @XmlElement(required = true)
    protected List<String> verwijzingNaarKaart;
    @XmlElement(required = true)
    protected List<String> verwijzingNaarTekst;
    protected List<String> woonplaatsNaam;
    @XmlElement(required = true)
    protected StructuurvisieGebiedPropertyType plangebied;

    /**
     * Gets the value of the functieInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functieInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctieInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctieElementStructuurvisiePropertyType }
     * 
     * 
     */
    public List<FunctieElementStructuurvisiePropertyType> getFunctieInfo() {
        if (functieInfo == null) {
            functieInfo = new ArrayList<FunctieElementStructuurvisiePropertyType>();
        }
        return this.functieInfo;
    }

    /**
     * Gets the value of the locatieNaam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locatieNaam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocatieNaam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocatieNaam() {
        if (locatieNaam == null) {
            locatieNaam = new ArrayList<String>();
        }
        return this.locatieNaam;
    }

    /**
     * Gets the value of the naamVanKaart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the naamVanKaart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNaamVanKaart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNaamVanKaart() {
        if (naamVanKaart == null) {
            naamVanKaart = new ArrayList<String>();
        }
        return this.naamVanKaart;
    }

    /**
     * Gets the value of the verwijzingNaarExternPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verwijzingNaarExternPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerwijzingNaarExternPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVerwijzingNaarExternPlan() {
        if (verwijzingNaarExternPlan == null) {
            verwijzingNaarExternPlan = new ArrayList<String>();
        }
        return this.verwijzingNaarExternPlan;
    }

    /**
     * Gets the value of the verwijzingNaarKaart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verwijzingNaarKaart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerwijzingNaarKaart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVerwijzingNaarKaart() {
        if (verwijzingNaarKaart == null) {
            verwijzingNaarKaart = new ArrayList<String>();
        }
        return this.verwijzingNaarKaart;
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
     * Gets the value of the woonplaatsNaam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the woonplaatsNaam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWoonplaatsNaam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWoonplaatsNaam() {
        if (woonplaatsNaam == null) {
            woonplaatsNaam = new ArrayList<String>();
        }
        return this.woonplaatsNaam;
    }

    /**
     * Gets the value of the plangebied property.
     * 
     * @return
     *     possible object is
     *     {@link StructuurvisieGebiedPropertyType }
     *     
     */
    public StructuurvisieGebiedPropertyType getPlangebied() {
        return plangebied;
    }

    /**
     * Sets the value of the plangebied property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuurvisieGebiedPropertyType }
     *     
     */
    public void setPlangebied(StructuurvisieGebiedPropertyType value) {
        this.plangebied = value;
    }

}
