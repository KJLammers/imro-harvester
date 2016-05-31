//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.31 at 02:05:22 PM CEST 
//


package nl.b3p.imro._2006._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProvinciaalGebiedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProvinciaalGebiedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ravi.nl/imro2006}GebiedType">
 *       &lt;sequence>
 *         &lt;element name="beschikbaarheidInfo" type="{http://www.ravi.nl/imro2006}BeschikbaarheidEnDatumPropertyType" minOccurs="0"/>
 *         &lt;element name="classificatie" type="{http://www.ravi.nl/imro2006}ClassificatiePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="functieInfo" type="{http://www.ravi.nl/imro2006}FunctieElementPropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="gebruikteOndergrond" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gemeenteCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locatieNaam" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="omvangWaarde" type="{http://www.ravi.nl/imro2006}OmvangWaardePPPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.ravi.nl/imro2006}ProductType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reikwijdte" type="{http://www.ravi.nl/imro2006}NiveauType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sBICodeBedrijvigheid" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statusInfo" type="{http://www.ravi.nl/imro2006}StatusEnBestuurlijkeDoorwerkingPropertyType" minOccurs="0"/>
 *         &lt;element name="typeBeleidsbeslissing" type="{http://www.ravi.nl/imro2006}BeleidsbeslissingType"/>
 *         &lt;element name="verwijzingNaarExternPlan" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="verwijzingNaarKaart" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="verwijzingNaarTekst" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="woonplaatsNaam" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="beleidssector" type="{http://www.ravi.nl/imro2006}BeleidssectorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="plangebied" type="{http://www.ravi.nl/imro2006}ProvinciaalPlangebiedPropertyType"/>
 *         &lt;element name="rechtenOpObject" type="{http://www.ravi.nl/imro2006}RechtenPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProvinciaalGebiedType", propOrder = {
    "beschikbaarheidInfo",
    "classificatie",
    "functieInfo",
    "gebruikteOndergrond",
    "gemeenteCode",
    "locatieNaam",
    "omvangWaarde",
    "product",
    "reikwijdte",
    "sbiCodeBedrijvigheid",
    "statusInfo",
    "typeBeleidsbeslissing",
    "verwijzingNaarExternPlan",
    "verwijzingNaarKaart",
    "verwijzingNaarTekst",
    "woonplaatsNaam",
    "beleidssector",
    "plangebied",
    "rechtenOpObject"
})
public class ProvinciaalGebiedType
    extends GebiedType
{

    protected BeschikbaarheidEnDatumPropertyType beschikbaarheidInfo;
    protected List<ClassificatiePropertyType> classificatie;
    @XmlElement(required = true)
    protected List<FunctieElementPropertyType> functieInfo;
    protected List<String> gebruikteOndergrond;
    protected List<String> gemeenteCode;
    protected List<String> locatieNaam;
    protected List<OmvangWaardePPPropertyType> omvangWaarde;
    protected List<ProductType> product;
    protected List<NiveauType> reikwijdte;
    @XmlElement(name = "sBICodeBedrijvigheid")
    protected List<String> sbiCodeBedrijvigheid;
    protected StatusEnBestuurlijkeDoorwerkingPropertyType statusInfo;
    @XmlElement(required = true)
    protected BeleidsbeslissingType typeBeleidsbeslissing;
    protected List<String> verwijzingNaarExternPlan;
    protected List<String> verwijzingNaarKaart;
    @XmlElement(required = true)
    protected List<String> verwijzingNaarTekst;
    protected List<String> woonplaatsNaam;
    protected List<String> beleidssector;
    @XmlElement(required = true)
    protected ProvinciaalPlangebiedPropertyType plangebied;
    protected List<RechtenPropertyType> rechtenOpObject;

    /**
     * Gets the value of the beschikbaarheidInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BeschikbaarheidEnDatumPropertyType }
     *     
     */
    public BeschikbaarheidEnDatumPropertyType getBeschikbaarheidInfo() {
        return beschikbaarheidInfo;
    }

    /**
     * Sets the value of the beschikbaarheidInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeschikbaarheidEnDatumPropertyType }
     *     
     */
    public void setBeschikbaarheidInfo(BeschikbaarheidEnDatumPropertyType value) {
        this.beschikbaarheidInfo = value;
    }

    /**
     * Gets the value of the classificatie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classificatie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificatie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificatiePropertyType }
     * 
     * 
     */
    public List<ClassificatiePropertyType> getClassificatie() {
        if (classificatie == null) {
            classificatie = new ArrayList<ClassificatiePropertyType>();
        }
        return this.classificatie;
    }

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
     * {@link FunctieElementPropertyType }
     * 
     * 
     */
    public List<FunctieElementPropertyType> getFunctieInfo() {
        if (functieInfo == null) {
            functieInfo = new ArrayList<FunctieElementPropertyType>();
        }
        return this.functieInfo;
    }

    /**
     * Gets the value of the gebruikteOndergrond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gebruikteOndergrond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGebruikteOndergrond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGebruikteOndergrond() {
        if (gebruikteOndergrond == null) {
            gebruikteOndergrond = new ArrayList<String>();
        }
        return this.gebruikteOndergrond;
    }

    /**
     * Gets the value of the gemeenteCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gemeenteCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGemeenteCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGemeenteCode() {
        if (gemeenteCode == null) {
            gemeenteCode = new ArrayList<String>();
        }
        return this.gemeenteCode;
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
     * Gets the value of the omvangWaarde property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the omvangWaarde property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOmvangWaarde().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OmvangWaardePPPropertyType }
     * 
     * 
     */
    public List<OmvangWaardePPPropertyType> getOmvangWaarde() {
        if (omvangWaarde == null) {
            omvangWaarde = new ArrayList<OmvangWaardePPPropertyType>();
        }
        return this.omvangWaarde;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductType }
     * 
     * 
     */
    public List<ProductType> getProduct() {
        if (product == null) {
            product = new ArrayList<ProductType>();
        }
        return this.product;
    }

    /**
     * Gets the value of the reikwijdte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reikwijdte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReikwijdte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NiveauType }
     * 
     * 
     */
    public List<NiveauType> getReikwijdte() {
        if (reikwijdte == null) {
            reikwijdte = new ArrayList<NiveauType>();
        }
        return this.reikwijdte;
    }

    /**
     * Gets the value of the sbiCodeBedrijvigheid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbiCodeBedrijvigheid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSBICodeBedrijvigheid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSBICodeBedrijvigheid() {
        if (sbiCodeBedrijvigheid == null) {
            sbiCodeBedrijvigheid = new ArrayList<String>();
        }
        return this.sbiCodeBedrijvigheid;
    }

    /**
     * Gets the value of the statusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StatusEnBestuurlijkeDoorwerkingPropertyType }
     *     
     */
    public StatusEnBestuurlijkeDoorwerkingPropertyType getStatusInfo() {
        return statusInfo;
    }

    /**
     * Sets the value of the statusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusEnBestuurlijkeDoorwerkingPropertyType }
     *     
     */
    public void setStatusInfo(StatusEnBestuurlijkeDoorwerkingPropertyType value) {
        this.statusInfo = value;
    }

    /**
     * Gets the value of the typeBeleidsbeslissing property.
     * 
     * @return
     *     possible object is
     *     {@link BeleidsbeslissingType }
     *     
     */
    public BeleidsbeslissingType getTypeBeleidsbeslissing() {
        return typeBeleidsbeslissing;
    }

    /**
     * Sets the value of the typeBeleidsbeslissing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeleidsbeslissingType }
     *     
     */
    public void setTypeBeleidsbeslissing(BeleidsbeslissingType value) {
        this.typeBeleidsbeslissing = value;
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
     * Gets the value of the beleidssector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beleidssector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeleidssector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBeleidssector() {
        if (beleidssector == null) {
            beleidssector = new ArrayList<String>();
        }
        return this.beleidssector;
    }

    /**
     * Gets the value of the plangebied property.
     * 
     * @return
     *     possible object is
     *     {@link ProvinciaalPlangebiedPropertyType }
     *     
     */
    public ProvinciaalPlangebiedPropertyType getPlangebied() {
        return plangebied;
    }

    /**
     * Sets the value of the plangebied property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvinciaalPlangebiedPropertyType }
     *     
     */
    public void setPlangebied(ProvinciaalPlangebiedPropertyType value) {
        this.plangebied = value;
    }

    /**
     * Gets the value of the rechtenOpObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rechtenOpObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRechtenOpObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RechtenPropertyType }
     * 
     * 
     */
    public List<RechtenPropertyType> getRechtenOpObject() {
        if (rechtenOpObject == null) {
            rechtenOpObject = new ArrayList<RechtenPropertyType>();
        }
        return this.rechtenOpObject;
    }

}
