//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.17 at 10:51:25 AM CEST 
//


package nl.b3p.imro._2006._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GemeentelijkVerbindingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GemeentelijkVerbindingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ravi.nl/imro2006}VerbindingType">
 *       &lt;sequence>
 *         &lt;element name="functieInfo" type="{http://www.ravi.nl/imro2006}FunctieElementStructuurvisiePropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="gebruikteOndergrond" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="geoNauwkeurigheidInfo" type="{http://www.ravi.nl/imro2006}GeografischeNauwkeurigheidPropertyType"/>
 *         &lt;element name="locatieNaam" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="naamVanKaart" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="verwijzingNaarExternPlan" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="verwijzingNaarKaart" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="verwijzingNaarTekst" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="woonplaatsNaam" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="plangebied" type="{http://www.ravi.nl/imro2006}StructuurvisieGebiedPropertyType"/>
 *         &lt;element name="categorieVerbindingen" type="{http://www.ravi.nl/imro2006}GemeentelijkVerbindingPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="verbinding" type="{http://www.ravi.nl/imro2006}GemeentelijkVerbindingPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GemeentelijkVerbindingType", propOrder = {
    "rest"
})
public class GemeentelijkVerbindingType
    extends VerbindingType
{

    @XmlElementRefs({
        @XmlElementRef(name = "verbinding", namespace = "http://www.ravi.nl/imro2006", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "geoNauwkeurigheidInfo", namespace = "http://www.ravi.nl/imro2006", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "naamVanKaart", namespace = "http://www.ravi.nl/imro2006", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "verwijzingNaarExternPlan", namespace = "http://www.ravi.nl/imro2006", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "verwijzingNaarTekst", namespace = "http://www.ravi.nl/imro2006", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gebruikteOndergrond", namespace = "http://www.ravi.nl/imro2006", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "verwijzingNaarKaart", namespace = "http://www.ravi.nl/imro2006", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "woonplaatsNaam", namespace = "http://www.ravi.nl/imro2006", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "locatieNaam", namespace = "http://www.ravi.nl/imro2006", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "categorieVerbindingen", namespace = "http://www.ravi.nl/imro2006", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "functieInfo", namespace = "http://www.ravi.nl/imro2006", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "plangebied", namespace = "http://www.ravi.nl/imro2006", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "GeoNauwkeurigheidInfo" is used by two different parts of a schema. See: 
     * line 947 of file:/home/meine/dev/imro-harvester/imro-classes/src/main/resources/IMRO2006/XSD-Resolver/finalized/IMRO2006XML_resolved.xsd
     * line 1741 of file:/home/meine/dev/imro-harvester/imro-classes/src/main/resources/IMRO2006/XSD-Resolver/finalized/IMRO2006XML_resolved.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link GemeentelijkVerbindingPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeografischeNauwkeurigheidPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link GemeentelijkVerbindingPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link FunctieElementStructuurvisiePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link StructuurvisieGebiedPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
