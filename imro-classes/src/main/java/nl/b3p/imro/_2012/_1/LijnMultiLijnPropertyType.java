//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.25 at 03:20:11 PM CET 
//


package nl.b3p.imro._2012._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LijnMultiLijnPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LijnMultiLijnPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}Curve"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}MultiCurve"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LijnMultiLijnPropertyType", propOrder = {
    "curve",
    "multiCurve"
})
public class LijnMultiLijnPropertyType {

    @XmlElement(name = "Curve", namespace = "http://www.opengis.net/gml/3.2")
    protected CurveType curve;
    @XmlElement(name = "MultiCurve", namespace = "http://www.opengis.net/gml/3.2")
    protected MultiCurveType multiCurve;

    /**
     * Gets the value of the curve property.
     * 
     * @return
     *     possible object is
     *     {@link CurveType }
     *     
     */
    public CurveType getCurve() {
        return curve;
    }

    /**
     * Sets the value of the curve property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveType }
     *     
     */
    public void setCurve(CurveType value) {
        this.curve = value;
    }

    /**
     * Gets the value of the multiCurve property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurveType }
     *     
     */
    public MultiCurveType getMultiCurve() {
        return multiCurve;
    }

    /**
     * Sets the value of the multiCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurveType }
     *     
     */
    public void setMultiCurve(MultiCurveType value) {
        this.multiCurve = value;
    }

}
