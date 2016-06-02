//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.31 at 04:49:50 PM CEST 
//


package nl.b3p.imro._2006._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoObjectPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoObjectPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.ravi.nl/imro2006}GeoObject"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml}AssociationAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoObjectPropertyType", propOrder = {
    "geoObject"
})
public class GeoObjectPropertyType {

    @XmlElementRef(name = "GeoObject", namespace = "http://www.ravi.nl/imro2006", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends GeoObjectType> geoObject;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected String type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected String show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected String actuate;

    /**
     * Gets the value of the geoObject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OnthoudingsgebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GemeentelijkComplexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProvinciaalPlangebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FiguurType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LettertekenaanduidingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GebiedsaanduidingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProvinciaalComplexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GemeentelijkVerbindingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaatvoeringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlangebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GemeentelijkGebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AanduidingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BestemmingsvlakType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BesluitgebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StructuurvisieGebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NationaalGebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DubbelbestemmingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BouwvlakType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BestemmingsplangebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerbindingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlanologischGebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnkelbestemmingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComplexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NationaalVerbindingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NationaalPlangebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeoObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NationaalComplexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProvinciaalVerbindingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlanobjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProvinciaalGebiedType }{@code >}
     *     
     */
    public JAXBElement<? extends GeoObjectType> getGeoObject() {
        return geoObject;
    }

    /**
     * Sets the value of the geoObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OnthoudingsgebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GemeentelijkComplexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProvinciaalPlangebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FiguurType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LettertekenaanduidingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GebiedsaanduidingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProvinciaalComplexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GemeentelijkVerbindingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaatvoeringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlangebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GemeentelijkGebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AanduidingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BestemmingsvlakType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BesluitgebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StructuurvisieGebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NationaalGebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DubbelbestemmingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BouwvlakType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BestemmingsplangebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerbindingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlanologischGebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnkelbestemmingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComplexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NationaalVerbindingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NationaalPlangebiedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeoObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NationaalComplexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProvinciaalVerbindingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlanobjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProvinciaalGebiedType }{@code >}
     *     
     */
    public void setGeoObject(JAXBElement<? extends GeoObjectType> value) {
        this.geoObject = value;
    }

    /**
     * Gets the value of the remoteSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Sets the value of the remoteSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "simple";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

}
