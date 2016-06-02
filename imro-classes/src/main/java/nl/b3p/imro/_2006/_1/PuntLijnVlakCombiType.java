//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.31 at 04:49:50 PM CEST 
//


package nl.b3p.imro._2006._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CurvePropertyType;
import net.opengis.gml.MultiGeometryPropertyType;
import net.opengis.gml.PointPropertyType;
import net.opengis.gml.SurfacePropertyType;


/**
 * <p>Java class for PuntLijnVlakCombiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PuntLijnVlakCombiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="geometriePunt" type="{http://www.opengis.net/gml}PointPropertyType"/>
 *         &lt;element name="geometrieLijn" type="{http://www.opengis.net/gml}CurvePropertyType"/>
 *         &lt;element name="geometrieVlak" type="{http://www.opengis.net/gml}SurfacePropertyType"/>
 *         &lt;element name="geometrieCombi" type="{http://www.opengis.net/gml}MultiGeometryPropertyType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PuntLijnVlakCombiType", propOrder = {
    "geometriePunt",
    "geometrieLijn",
    "geometrieVlak",
    "geometrieCombi"
})
public class PuntLijnVlakCombiType {

    protected PointPropertyType geometriePunt;
    protected CurvePropertyType geometrieLijn;
    protected SurfacePropertyType geometrieVlak;
    protected MultiGeometryPropertyType geometrieCombi;

    /**
     * Gets the value of the geometriePunt property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getGeometriePunt() {
        return geometriePunt;
    }

    /**
     * Sets the value of the geometriePunt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setGeometriePunt(PointPropertyType value) {
        this.geometriePunt = value;
    }

    /**
     * Gets the value of the geometrieLijn property.
     * 
     * @return
     *     possible object is
     *     {@link CurvePropertyType }
     *     
     */
    public CurvePropertyType getGeometrieLijn() {
        return geometrieLijn;
    }

    /**
     * Sets the value of the geometrieLijn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurvePropertyType }
     *     
     */
    public void setGeometrieLijn(CurvePropertyType value) {
        this.geometrieLijn = value;
    }

    /**
     * Gets the value of the geometrieVlak property.
     * 
     * @return
     *     possible object is
     *     {@link SurfacePropertyType }
     *     
     */
    public SurfacePropertyType getGeometrieVlak() {
        return geometrieVlak;
    }

    /**
     * Sets the value of the geometrieVlak property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfacePropertyType }
     *     
     */
    public void setGeometrieVlak(SurfacePropertyType value) {
        this.geometrieVlak = value;
    }

    /**
     * Gets the value of the geometrieCombi property.
     * 
     * @return
     *     possible object is
     *     {@link MultiGeometryPropertyType }
     *     
     */
    public MultiGeometryPropertyType getGeometrieCombi() {
        return geometrieCombi;
    }

    /**
     * Sets the value of the geometrieCombi property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiGeometryPropertyType }
     *     
     */
    public void setGeometrieCombi(MultiGeometryPropertyType value) {
        this.geometrieCombi = value;
    }

}
