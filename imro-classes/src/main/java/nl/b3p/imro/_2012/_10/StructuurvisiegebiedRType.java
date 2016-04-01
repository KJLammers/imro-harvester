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
 * <p>Java class for Structuurvisiegebied_RType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Structuurvisiegebied_RType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.geonovum.nl/imro/2012/1.0}PlanobjectType">
 *       &lt;sequence>
 *         &lt;element name="naam" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="thema" type="{http://www.geonovum.nl/imro/2012/1.0}NotEmptyString" maxOccurs="unbounded"/>
 *         &lt;element name="beleidInfo" type="{http://www.geonovum.nl/imro/2012/1.0}BeleidInfo_RSVPropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="verwijzingNaarTekstInfo" type="{http://www.geonovum.nl/imro/2012/1.0}TekstReferentie_SVPropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="verwijzingNaarIllustratieInfo" type="{http://www.geonovum.nl/imro/2012/1.0}IllustratieReferentiePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="verwijzingNaarExternPlanInfo" type="{http://www.geonovum.nl/imro/2012/1.0}ExternPlanReferentie_SVPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cartografieInfo" type="{http://www.geonovum.nl/imro/2012/1.0}CartografieInfoPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="begrenzing" type="{http://www.geonovum.nl/imro/2012/1.0}GeometrieStructuurvisieObjectPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="plangebied" type="{http://www.geonovum.nl/imro/2012/1.0}Structuurvisieplangebied_RPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Structuurvisiegebied_RType", propOrder = {
    "naam",
    "thema",
    "beleidInfo",
    "verwijzingNaarTekstInfo",
    "verwijzingNaarIllustratieInfo",
    "verwijzingNaarExternPlanInfo",
    "cartografieInfo",
    "begrenzing",
    "plangebied"
})
public class StructuurvisiegebiedRType
    extends PlanobjectType
{

    @XmlElement(required = true)
    protected CodeType naam;
    @XmlElement(required = true)
    protected List<String> thema;
    @XmlElement(required = true)
    protected List<BeleidInfoRSVPropertyType> beleidInfo;
    @XmlElement(required = true)
    protected List<TekstReferentieSVPropertyType> verwijzingNaarTekstInfo;
    protected List<IllustratieReferentiePropertyType> verwijzingNaarIllustratieInfo;
    protected List<ExternPlanReferentieSVPropertyType> verwijzingNaarExternPlanInfo;
    protected List<CartografieInfoPropertyType> cartografieInfo;
    @XmlAnyElement
    protected List<Element> begrenzing;
    @XmlAnyElement
    protected Element plangebied;

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
     * Gets the value of the thema property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thema property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThema().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getThema() {
        if (thema == null) {
            thema = new ArrayList<String>();
        }
        return this.thema;
    }

    /**
     * Gets the value of the beleidInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beleidInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeleidInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeleidInfoRSVPropertyType }
     * 
     * 
     */
    public List<BeleidInfoRSVPropertyType> getBeleidInfo() {
        if (beleidInfo == null) {
            beleidInfo = new ArrayList<BeleidInfoRSVPropertyType>();
        }
        return this.beleidInfo;
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
     * {@link TekstReferentieSVPropertyType }
     * 
     * 
     */
    public List<TekstReferentieSVPropertyType> getVerwijzingNaarTekstInfo() {
        if (verwijzingNaarTekstInfo == null) {
            verwijzingNaarTekstInfo = new ArrayList<TekstReferentieSVPropertyType>();
        }
        return this.verwijzingNaarTekstInfo;
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
     * {@link IllustratieReferentiePropertyType }
     * 
     * 
     */
    public List<IllustratieReferentiePropertyType> getVerwijzingNaarIllustratieInfo() {
        if (verwijzingNaarIllustratieInfo == null) {
            verwijzingNaarIllustratieInfo = new ArrayList<IllustratieReferentiePropertyType>();
        }
        return this.verwijzingNaarIllustratieInfo;
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
     * {@link ExternPlanReferentieSVPropertyType }
     * 
     * 
     */
    public List<ExternPlanReferentieSVPropertyType> getVerwijzingNaarExternPlanInfo() {
        if (verwijzingNaarExternPlanInfo == null) {
            verwijzingNaarExternPlanInfo = new ArrayList<ExternPlanReferentieSVPropertyType>();
        }
        return this.verwijzingNaarExternPlanInfo;
    }

    /**
     * Gets the value of the cartografieInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartografieInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartografieInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CartografieInfoPropertyType }
     * 
     * 
     */
    public List<CartografieInfoPropertyType> getCartografieInfo() {
        if (cartografieInfo == null) {
            cartografieInfo = new ArrayList<CartografieInfoPropertyType>();
        }
        return this.cartografieInfo;
    }

    /**
     * Gets the value of the begrenzing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the begrenzing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBegrenzing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getBegrenzing() {
        if (begrenzing == null) {
            begrenzing = new ArrayList<Element>();
        }
        return this.begrenzing;
    }

    /**
     * Gets the value of the plangebied property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getPlangebied() {
        return plangebied;
    }

    /**
     * Sets the value of the plangebied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setPlangebied(Element value) {
        this.plangebied = value;
    }

}
