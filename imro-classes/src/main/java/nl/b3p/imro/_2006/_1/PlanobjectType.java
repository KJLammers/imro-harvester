//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.31 at 04:49:50 PM CEST 
//


package nl.b3p.imro._2006._1;

import java.util.ArrayList;
import java.util.List;
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
 *     &lt;extension base="{http://www.ravi.nl/imro2006}PlanologischGebiedType">
 *       &lt;sequence>
 *         &lt;element name="typePlanobject" type="{http://www.ravi.nl/imro2006}RuimtelijkPlanobjectType"/>
 *         &lt;element name="complex" type="{http://www.ravi.nl/imro2006}ComplexPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatiePlanobject" type="{http://www.ravi.nl/imro2006}PlanobjectPropertyType" maxOccurs="unbounded" minOccurs="0"/>
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
    "typePlanobject",
    "complex",
    "relatiePlanobject"
})
@XmlSeeAlso({
    BestemmingsvlakType.class,
    GebiedType.class,
    VerbindingType.class,
    ComplexType.class,
    AanduidingType.class
})
public abstract class PlanobjectType
    extends PlanologischGebiedType
{

    @XmlElement(required = true)
    protected RuimtelijkPlanobjectType typePlanobject;
    protected List<ComplexPropertyType> complex;
    protected List<PlanobjectPropertyType> relatiePlanobject;

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

    /**
     * Gets the value of the complex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplexPropertyType }
     * 
     * 
     */
    public List<ComplexPropertyType> getComplex() {
        if (complex == null) {
            complex = new ArrayList<ComplexPropertyType>();
        }
        return this.complex;
    }

    /**
     * Gets the value of the relatiePlanobject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatiePlanobject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatiePlanobject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanobjectPropertyType }
     * 
     * 
     */
    public List<PlanobjectPropertyType> getRelatiePlanobject() {
        if (relatiePlanobject == null) {
            relatiePlanobject = new ArrayList<PlanobjectPropertyType>();
        }
        return this.relatiePlanobject;
    }

}
