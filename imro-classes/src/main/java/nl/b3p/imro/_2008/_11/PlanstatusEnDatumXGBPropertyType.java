//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.08 at 11:05:13 AM CEST 
//


package nl.b3p.imro._2008._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanstatusEnDatum_XGBPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanstatusEnDatum_XGBPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.geonovum.nl/imro/2008/1}PlanstatusEnDatum_XGB"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanstatusEnDatum_XGBPropertyType", propOrder = {
    "planstatusEnDatumXGB"
})
public class PlanstatusEnDatumXGBPropertyType {

    @XmlElement(name = "PlanstatusEnDatum_XGB", required = true)
    protected PlanstatusEnDatumXGBType planstatusEnDatumXGB;

    /**
     * Gets the value of the planstatusEnDatumXGB property.
     * 
     * @return
     *     possible object is
     *     {@link PlanstatusEnDatumXGBType }
     *     
     */
    public PlanstatusEnDatumXGBType getPlanstatusEnDatumXGB() {
        return planstatusEnDatumXGB;
    }

    /**
     * Sets the value of the planstatusEnDatumXGB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanstatusEnDatumXGBType }
     *     
     */
    public void setPlanstatusEnDatumXGB(PlanstatusEnDatumXGBType value) {
        this.planstatusEnDatumXGB = value;
    }

}
