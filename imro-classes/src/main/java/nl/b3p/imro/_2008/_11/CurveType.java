//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.01 at 03:04:51 PM CEST 
//


package nl.b3p.imro._2008._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Curve is a 1-dimensional primitive. Curves are continuous,
 *             connected, and have a measurable length in terms of the
 *             coordinate system. 
 *             A curve is composed of one or more curve segments.
 *             The curve segments are connected to one another, with the
 *             end point of each segment except the last being the start
 *             point of the next segment in the segment list.
 *             The orientation of the curve is positive.
 *          
 * 
 * <p>Java class for CurveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCurveType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}segments"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurveType", namespace = "http://www.opengis.net/gml", propOrder = {
    "segments"
})
public class CurveType
    extends AbstractCurveType
{

    @XmlElement(required = true)
    protected CurveSegmentArrayPropertyType segments;

    /**
     * 
     *                         This element encapsulates the segments of the
     *                         curve.
     *                      
     * 
     * @return
     *     possible object is
     *     {@link CurveSegmentArrayPropertyType }
     *     
     */
    public CurveSegmentArrayPropertyType getSegments() {
        return segments;
    }

    /**
     * Sets the value of the segments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveSegmentArrayPropertyType }
     *     
     */
    public void setSegments(CurveSegmentArrayPropertyType value) {
        this.segments = value;
    }

}
