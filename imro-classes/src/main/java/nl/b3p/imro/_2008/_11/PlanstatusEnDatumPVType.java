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
 * <p>Java class for PlanstatusEnDatum_PVType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanstatusEnDatum_PVType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="planstatus" type="{http://www.geonovum.nl/imro/2008/1}Planstatus_PVType"/>
 *         &lt;element name="datum" type="{http://www.geonovum.nl/imro/2008/1}NotEmptyString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanstatusEnDatum_PVType", propOrder = {
    "planstatus",
    "datum"
})
public class PlanstatusEnDatumPVType {

    @XmlElement(required = true)
    protected PlanstatusPVType planstatus;
    @XmlElement(required = true)
    protected String datum;

    /**
     * Gets the value of the planstatus property.
     * 
     * @return
     *     possible object is
     *     {@link PlanstatusPVType }
     *     
     */
    public PlanstatusPVType getPlanstatus() {
        return planstatus;
    }

    /**
     * Sets the value of the planstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanstatusPVType }
     *     
     */
    public void setPlanstatus(PlanstatusPVType value) {
        this.planstatus = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatum(String value) {
        this.datum = value;
    }

}
