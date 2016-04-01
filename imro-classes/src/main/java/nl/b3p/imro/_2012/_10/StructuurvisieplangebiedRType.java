//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.01 at 08:41:05 AM CEST 
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
 * <p>Java class for Structuurvisieplangebied_RType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Structuurvisieplangebied_RType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.geonovum.nl/imro/2012/1.0}PlangebiedType">
 *       &lt;sequence>
 *         &lt;element name="typePlan" type="{http://www.geonovum.nl/imro/2012/1.0}RuimtelijkPlanOfBesluit_SVType"/>
 *         &lt;element name="beleidsmatigVerantwoordelijkeOverheid" type="{http://www.geonovum.nl/imro/2012/1.0}Overheden_RType"/>
 *         &lt;element name="naamOverheid" type="{http://www.geonovum.nl/imro/2012/1.0}NotEmptyString" maxOccurs="unbounded"/>
 *         &lt;element name="overheidsCode" type="{http://www.geonovum.nl/imro/2012/1.0}NotEmptyString"/>
 *         &lt;element name="naam" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="locatieNaam" type="{http://www.geonovum.nl/imro/2012/1.0}NotEmptyString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="planstatusInfo" type="{http://www.geonovum.nl/imro/2012/1.0}PlanstatusEnDatumPropertyType"/>
 *         &lt;element name="besluitnummer" type="{http://www.geonovum.nl/imro/2012/1.0}NotEmptyString" minOccurs="0"/>
 *         &lt;element name="verwijzingNaarVaststellingsbesluit" type="{http://www.geonovum.nl/imro/2012/1.0}NotEmptyString" minOccurs="0"/>
 *         &lt;element name="verwijzingNaarIllustratieInfo" type="{http://www.geonovum.nl/imro/2012/1.0}IllustratieReferentiePGPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="verwijzingNaarTekstInfo" type="{http://www.geonovum.nl/imro/2012/1.0}TekstReferentiePG_SVPropertyType" maxOccurs="3"/>
 *         &lt;element name="ondergrondInfo" type="{http://www.geonovum.nl/imro/2012/1.0}OndergrondReferentiePropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="verwijzingNaarExternPlanInfo" type="{http://www.geonovum.nl/imro/2012/1.0}ExternPlanReferentiePG_SVPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="verwijzingNorm" type="{http://www.geonovum.nl/imro/2012/1.0}NotEmptyString" maxOccurs="3" minOccurs="2"/>
 *         &lt;element name="begrenzing" type="{http://www.geonovum.nl/imro/2012/1.0}GeometriePlangebiedPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Structuurvisieplangebied_RType", propOrder = {
    "typePlan",
    "beleidsmatigVerantwoordelijkeOverheid",
    "naamOverheid",
    "overheidsCode",
    "naam",
    "locatieNaam",
    "planstatusInfo",
    "besluitnummer",
    "verwijzingNaarVaststellingsbesluit",
    "verwijzingNaarIllustratieInfo",
    "verwijzingNaarTekstInfo",
    "ondergrondInfo",
    "verwijzingNaarExternPlanInfo",
    "verwijzingNorm",
    "begrenzing"
})
public class StructuurvisieplangebiedRType
    extends PlangebiedType
{

    @XmlElement(required = true)
    protected RuimtelijkPlanOfBesluitSVType typePlan;
    @XmlElement(required = true)
    protected OverhedenRType beleidsmatigVerantwoordelijkeOverheid;
    @XmlElement(required = true)
    protected List<String> naamOverheid;
    @XmlElement(required = true)
    protected String overheidsCode;
    @XmlElement(required = true)
    protected CodeType naam;
    protected List<String> locatieNaam;
    @XmlElement(required = true)
    protected PlanstatusEnDatumPropertyType planstatusInfo;
    protected String besluitnummer;
    protected String verwijzingNaarVaststellingsbesluit;
    protected List<IllustratieReferentiePGPropertyType> verwijzingNaarIllustratieInfo;
    @XmlElement(required = true)
    protected List<TekstReferentiePGSVPropertyType> verwijzingNaarTekstInfo;
    @XmlElement(required = true)
    protected List<OndergrondReferentiePropertyType> ondergrondInfo;
    protected List<ExternPlanReferentiePGSVPropertyType> verwijzingNaarExternPlanInfo;
    @XmlElement(required = true)
    protected List<String> verwijzingNorm;
    @XmlAnyElement
    protected Element begrenzing;

    /**
     * Gets the value of the typePlan property.
     * 
     * @return
     *     possible object is
     *     {@link RuimtelijkPlanOfBesluitSVType }
     *     
     */
    public RuimtelijkPlanOfBesluitSVType getTypePlan() {
        return typePlan;
    }

    /**
     * Sets the value of the typePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuimtelijkPlanOfBesluitSVType }
     *     
     */
    public void setTypePlan(RuimtelijkPlanOfBesluitSVType value) {
        this.typePlan = value;
    }

    /**
     * Gets the value of the beleidsmatigVerantwoordelijkeOverheid property.
     * 
     * @return
     *     possible object is
     *     {@link OverhedenRType }
     *     
     */
    public OverhedenRType getBeleidsmatigVerantwoordelijkeOverheid() {
        return beleidsmatigVerantwoordelijkeOverheid;
    }

    /**
     * Sets the value of the beleidsmatigVerantwoordelijkeOverheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverhedenRType }
     *     
     */
    public void setBeleidsmatigVerantwoordelijkeOverheid(OverhedenRType value) {
        this.beleidsmatigVerantwoordelijkeOverheid = value;
    }

    /**
     * Gets the value of the naamOverheid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the naamOverheid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNaamOverheid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNaamOverheid() {
        if (naamOverheid == null) {
            naamOverheid = new ArrayList<String>();
        }
        return this.naamOverheid;
    }

    /**
     * Gets the value of the overheidsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverheidsCode() {
        return overheidsCode;
    }

    /**
     * Sets the value of the overheidsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverheidsCode(String value) {
        this.overheidsCode = value;
    }

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
     * Gets the value of the planstatusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PlanstatusEnDatumPropertyType }
     *     
     */
    public PlanstatusEnDatumPropertyType getPlanstatusInfo() {
        return planstatusInfo;
    }

    /**
     * Sets the value of the planstatusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanstatusEnDatumPropertyType }
     *     
     */
    public void setPlanstatusInfo(PlanstatusEnDatumPropertyType value) {
        this.planstatusInfo = value;
    }

    /**
     * Gets the value of the besluitnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBesluitnummer() {
        return besluitnummer;
    }

    /**
     * Sets the value of the besluitnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBesluitnummer(String value) {
        this.besluitnummer = value;
    }

    /**
     * Gets the value of the verwijzingNaarVaststellingsbesluit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerwijzingNaarVaststellingsbesluit() {
        return verwijzingNaarVaststellingsbesluit;
    }

    /**
     * Sets the value of the verwijzingNaarVaststellingsbesluit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerwijzingNaarVaststellingsbesluit(String value) {
        this.verwijzingNaarVaststellingsbesluit = value;
    }

    /**
     * Gets the value of the verwijzingNaarIllustratieInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verwijzingNaarIllustratieInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerwijzingNaarIllustratieInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IllustratieReferentiePGPropertyType }
     * 
     * 
     */
    public List<IllustratieReferentiePGPropertyType> getVerwijzingNaarIllustratieInfo() {
        if (verwijzingNaarIllustratieInfo == null) {
            verwijzingNaarIllustratieInfo = new ArrayList<IllustratieReferentiePGPropertyType>();
        }
        return this.verwijzingNaarIllustratieInfo;
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
     * {@link TekstReferentiePGSVPropertyType }
     * 
     * 
     */
    public List<TekstReferentiePGSVPropertyType> getVerwijzingNaarTekstInfo() {
        if (verwijzingNaarTekstInfo == null) {
            verwijzingNaarTekstInfo = new ArrayList<TekstReferentiePGSVPropertyType>();
        }
        return this.verwijzingNaarTekstInfo;
    }

    /**
     * Gets the value of the ondergrondInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ondergrondInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOndergrondInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OndergrondReferentiePropertyType }
     * 
     * 
     */
    public List<OndergrondReferentiePropertyType> getOndergrondInfo() {
        if (ondergrondInfo == null) {
            ondergrondInfo = new ArrayList<OndergrondReferentiePropertyType>();
        }
        return this.ondergrondInfo;
    }

    /**
     * Gets the value of the verwijzingNaarExternPlanInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verwijzingNaarExternPlanInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerwijzingNaarExternPlanInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternPlanReferentiePGSVPropertyType }
     * 
     * 
     */
    public List<ExternPlanReferentiePGSVPropertyType> getVerwijzingNaarExternPlanInfo() {
        if (verwijzingNaarExternPlanInfo == null) {
            verwijzingNaarExternPlanInfo = new ArrayList<ExternPlanReferentiePGSVPropertyType>();
        }
        return this.verwijzingNaarExternPlanInfo;
    }

    /**
     * Gets the value of the verwijzingNorm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verwijzingNorm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerwijzingNorm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVerwijzingNorm() {
        if (verwijzingNorm == null) {
            verwijzingNorm = new ArrayList<String>();
        }
        return this.verwijzingNorm;
    }

    /**
     * Gets the value of the begrenzing property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getBegrenzing() {
        return begrenzing;
    }

    /**
     * Sets the value of the begrenzing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setBegrenzing(Element value) {
        this.begrenzing = value;
    }

}
