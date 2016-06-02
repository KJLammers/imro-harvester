//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.31 at 04:49:50 PM CEST 
//


package nl.b3p.imro._2006._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.PointPropertyType;


/**
 * <p>Java class for SymboolCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SymboolCodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ravi.nl/imro2006}SymboolCodeOfFiguurType">
 *       &lt;sequence>
 *         &lt;element name="aanpijlingspunt" type="{http://www.opengis.net/gml}PointPropertyType" minOccurs="0"/>
 *         &lt;element name="hoek" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="plaatsingspunt" type="{http://www.opengis.net/gml}PointPropertyType"/>
 *         &lt;element name="symboolCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymboolCodeType", propOrder = {
    "aanpijlingspunt",
    "hoek",
    "plaatsingspunt",
    "symboolCode"
})
public class SymboolCodeType
    extends SymboolCodeOfFiguurType
{

    protected PointPropertyType aanpijlingspunt;
    protected Double hoek;
    @XmlElement(required = true)
    protected PointPropertyType plaatsingspunt;
    @XmlElement(required = true)
    protected String symboolCode;

    /**
     * Gets the value of the aanpijlingspunt property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getAanpijlingspunt() {
        return aanpijlingspunt;
    }

    /**
     * Sets the value of the aanpijlingspunt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setAanpijlingspunt(PointPropertyType value) {
        this.aanpijlingspunt = value;
    }

    /**
     * Gets the value of the hoek property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHoek() {
        return hoek;
    }

    /**
     * Sets the value of the hoek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHoek(Double value) {
        this.hoek = value;
    }

    /**
     * Gets the value of the plaatsingspunt property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPlaatsingspunt() {
        return plaatsingspunt;
    }

    /**
     * Sets the value of the plaatsingspunt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPlaatsingspunt(PointPropertyType value) {
        this.plaatsingspunt = value;
    }

    /**
     * Gets the value of the symboolCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymboolCode() {
        return symboolCode;
    }

    /**
     * Sets the value of the symboolCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymboolCode(String value) {
        this.symboolCode = value;
    }

}
