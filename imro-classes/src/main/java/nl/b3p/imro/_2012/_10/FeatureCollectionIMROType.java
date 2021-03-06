//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.01 at 02:40:57 PM CEST 
//


package nl.b3p.imro._2012._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureCollectionIMROType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureCollectionIMROType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="featureMember">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureMemberType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractFeature"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureCollectionIMROType", propOrder = {
    "featureMember"
})
public class FeatureCollectionIMROType
    extends AbstractFeatureType
{

    protected List<FeatureCollectionIMROType.FeatureMember> featureMember;

    /**
     * Gets the value of the featureMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureCollectionIMROType.FeatureMember }
     * 
     * 
     */
    public List<FeatureCollectionIMROType.FeatureMember> getFeatureMember() {
        if (featureMember == null) {
            featureMember = new ArrayList<FeatureCollectionIMROType.FeatureMember>();
        }
        return this.featureMember;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureMemberType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractFeature"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "abstractFeature"
    })
    public static class FeatureMember
        extends AbstractFeatureMemberType
    {

        @XmlElementRef(name = "AbstractFeature", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractFeatureType> abstractFeature;

        /**
         * Gets the value of the abstractFeature property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AanduidingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MetadataIMRObestandType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisieplangebiedPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitsubvlakXType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitvlakXType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeometrieStructuurvisieObjectType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitgebiedAType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisiegebiedRType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisiegebiedGType }{@code >}
         *     {@link JAXBElement }{@code <}{@link PlangebiedType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MaatvoeringType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisieplangebiedGType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeometrieBesluitobjectP3Type }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisieplangebiedRType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitvlakPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BestemmingsplangebiedType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisiecomplexRType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitvlakAType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FiguurType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitgebiedXType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FeatureCollectionIMROType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisiecomplexPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitgebiedPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisieverklaringPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitsubvlakAType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BouwvlakType }{@code >}
         *     {@link JAXBElement }{@code <}{@link PlanologischGebiedType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeometrieBesluitobjectP1Type }{@code >}
         *     {@link JAXBElement }{@code <}{@link DubbelbestemmingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeometrieBesluitobjectAType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BestemmingsvlakType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BouwaanduidingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisiegebiedPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EnkelbestemmingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeoObjectType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitsubvlakPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeometriePlangebiedPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GebiedsaanduidingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisiecomplexGType }{@code >}
         *     {@link JAXBElement }{@code <}{@link PlanobjectType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeometriePlangebiedType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeometrieStructuurvisieObjectPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FunctieaanduidingType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractFeatureType> getAbstractFeature() {
            return abstractFeature;
        }

        /**
         * Sets the value of the abstractFeature property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AanduidingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MetadataIMRObestandType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisieplangebiedPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitsubvlakXType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitvlakXType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeometrieStructuurvisieObjectType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitgebiedAType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisiegebiedRType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisiegebiedGType }{@code >}
         *     {@link JAXBElement }{@code <}{@link PlangebiedType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MaatvoeringType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisieplangebiedGType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeometrieBesluitobjectP3Type }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisieplangebiedRType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitvlakPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BestemmingsplangebiedType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisiecomplexRType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitvlakAType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FiguurType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitgebiedXType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FeatureCollectionIMROType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisiecomplexPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitgebiedPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisieverklaringPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitsubvlakAType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BouwvlakType }{@code >}
         *     {@link JAXBElement }{@code <}{@link PlanologischGebiedType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeometrieBesluitobjectP1Type }{@code >}
         *     {@link JAXBElement }{@code <}{@link DubbelbestemmingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeometrieBesluitobjectAType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BestemmingsvlakType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BouwaanduidingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisiegebiedPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EnkelbestemmingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeoObjectType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BesluitsubvlakPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeometriePlangebiedPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GebiedsaanduidingType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StructuurvisiecomplexGType }{@code >}
         *     {@link JAXBElement }{@code <}{@link PlanobjectType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeometriePlangebiedType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeometrieStructuurvisieObjectPType }{@code >}
         *     {@link JAXBElement }{@code <}{@link FunctieaanduidingType }{@code >}
         *     
         */
        public void setAbstractFeature(JAXBElement<? extends AbstractFeatureType> value) {
            this.abstractFeature = value;
        }

    }

}
