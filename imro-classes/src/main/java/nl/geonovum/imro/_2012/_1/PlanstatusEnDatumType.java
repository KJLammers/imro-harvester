//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.07 at 09:54:50 AM CET 
//


package nl.geonovum.imro._2012._1;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Java class for PlanstatusEnDatumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanstatusEnDatumType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="planstatus" type="{http://www.geonovum.nl/imro/2012/1.1}PlanstatusType"/>
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanstatusEnDatumType", propOrder = {
    "planstatus",
    "datum"
})
public class PlanstatusEnDatumType {

    @XmlElement(required = true)
    protected PlanstatusType planstatus;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar datum;

    /**
     * Gets the value of the planstatus property.
     * 
     * @return
     *     possible object is
     *     {@link PlanstatusType }
     *     
     */
    public PlanstatusType getPlanstatus() {
        return planstatus;
    }

    /**
     * Sets the value of the planstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanstatusType }
     *     
     */
    public void setPlanstatus(PlanstatusType value) {
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
    public Calendar getDatum() {
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
    public void setDatum(Calendar value) {
        this.datum = value;
    }

}