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
 * <p>Java class for ExternPlanReferentiePG_SVType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternPlanReferentiePG_SVType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="naamExternPlan" type="{http://www.geonovum.nl/imro/2008/1}NotEmptyString"/>
 *         &lt;element name="idnExternPlan" type="{http://www.geonovum.nl/imro/2008/1}NotEmptyString" minOccurs="0"/>
 *         &lt;element name="rolExternPlan" type="{http://www.geonovum.nl/imro/2008/1}RolExternPlanPG_SVType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternPlanReferentiePG_SVType", propOrder = {
    "naamExternPlan",
    "idnExternPlan",
    "rolExternPlan"
})
public class ExternPlanReferentiePGSVType {

    @XmlElement(required = true)
    protected String naamExternPlan;
    protected String idnExternPlan;
    @XmlElement(required = true)
    protected RolExternPlanPGSVType rolExternPlan;

    /**
     * Gets the value of the naamExternPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaamExternPlan() {
        return naamExternPlan;
    }

    /**
     * Sets the value of the naamExternPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaamExternPlan(String value) {
        this.naamExternPlan = value;
    }

    /**
     * Gets the value of the idnExternPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdnExternPlan() {
        return idnExternPlan;
    }

    /**
     * Sets the value of the idnExternPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdnExternPlan(String value) {
        this.idnExternPlan = value;
    }

    /**
     * Gets the value of the rolExternPlan property.
     * 
     * @return
     *     possible object is
     *     {@link RolExternPlanPGSVType }
     *     
     */
    public RolExternPlanPGSVType getRolExternPlan() {
        return rolExternPlan;
    }

    /**
     * Sets the value of the rolExternPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link RolExternPlanPGSVType }
     *     
     */
    public void setRolExternPlan(RolExternPlanPGSVType value) {
        this.rolExternPlan = value;
    }

}
