//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.24 at 01:09:58 PM CET 
//


package nl.b3p.imro._2012._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanobjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanobjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.geonovum.nl/imro/2012/1.1}PlanologischGebiedType">
 *       &lt;sequence>
 *         &lt;element name="typePlanobject" type="{http://www.geonovum.nl/imro/2012/1.1}RuimtelijkPlanobjectType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanobjectType", propOrder = {
    "typePlanobject"
})
@XmlSeeAlso({
    BesluitsubvlakAType.class,
    StructuurvisiecomplexGType.class,
    BestemmingsvlakType.class,
    BesluitvlakAType.class,
    StructuurvisiegebiedGType.class,
    BesluitvlakPType.class,
    StructuurvisiegebiedRType.class,
    StructuurvisiegebiedPType.class,
    BesluitvlakXType.class,
    BesluitsubvlakPType.class,
    StructuurvisieverklaringPType.class,
    StructuurvisiecomplexPType.class,
    BesluitsubvlakXType.class,
    AanduidingType.class,
    StructuurvisiecomplexRType.class
})
public abstract class PlanobjectType
    extends PlanologischGebiedType
{

    @XmlElement(required = true)
    protected RuimtelijkPlanobjectType typePlanobject;

    /**
     * Gets the value of the typePlanobject property.
     * 
     * @return
     *     possible object is
     *     {@link RuimtelijkPlanobjectType }
     *     
     */
    public RuimtelijkPlanobjectType getTypePlanobject() {
        return typePlanobject;
    }

    /**
     * Sets the value of the typePlanobject property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuimtelijkPlanobjectType }
     *     
     */
    public void setTypePlanobject(RuimtelijkPlanobjectType value) {
        this.typePlanobject = value;
    }

}
