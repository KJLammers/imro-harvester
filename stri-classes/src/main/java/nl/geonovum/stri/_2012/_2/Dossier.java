//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.04 at 09:04:24 PM CET 
//


package nl.geonovum.stri._2012._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Plan" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Naam" type="{http://www.geonovum.nl/stri/2012/2.0}Naam"/>
 *                   &lt;element name="Datum" type="{http://www.geonovum.nl/stri/2012/2.0}Datum"/>
 *                   &lt;element name="GeleideFormulier" type="{http://www.geonovum.nl/stri/2012/2.0}GeleideFormulierURL"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.geonovum.nl/stri/2012/2.0}PlanID" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.geonovum.nl/stri/2012/2.0}DossierID" />
 *       &lt;attribute name="Status" use="required" type="{http://www.geonovum.nl/stri/2012/2.0}DossierStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "plan"
})
@XmlRootElement(name = "Dossier")
public class Dossier {

    @XmlElement(name = "Plan", required = true)
    protected List<Dossier.Plan> plan;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "Status", required = true)
    protected DossierStatus status;

    /**
     * Gets the value of the plan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dossier.Plan }
     * 
     * 
     */
    public List<Dossier.Plan> getPlan() {
        if (plan == null) {
            plan = new ArrayList<Dossier.Plan>();
        }
        return this.plan;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DossierStatus }
     *     
     */
    public DossierStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DossierStatus }
     *     
     */
    public void setStatus(DossierStatus value) {
        this.status = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Naam" type="{http://www.geonovum.nl/stri/2012/2.0}Naam"/>
     *         &lt;element name="Datum" type="{http://www.geonovum.nl/stri/2012/2.0}Datum"/>
     *         &lt;element name="GeleideFormulier" type="{http://www.geonovum.nl/stri/2012/2.0}GeleideFormulierURL"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.geonovum.nl/stri/2012/2.0}PlanID" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "naam",
        "datum",
        "geleideFormulier"
    })
    public static class Plan {

        @XmlElement(name = "Naam", required = true)
        protected String naam;
        @XmlElement(name = "Datum", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datum;
        @XmlElement(name = "GeleideFormulier", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String geleideFormulier;
        @XmlAttribute(name = "Id", required = true)
        protected String id;

        /**
         * Gets the value of the naam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNaam() {
            return naam;
        }

        /**
         * Sets the value of the naam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNaam(String value) {
            this.naam = value;
        }

        /**
         * Gets the value of the datum property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDatum() {
            return datum;
        }

        /**
         * Sets the value of the datum property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatum(XMLGregorianCalendar value) {
            this.datum = value;
        }

        /**
         * Gets the value of the geleideFormulier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGeleideFormulier() {
            return geleideFormulier;
        }

        /**
         * Sets the value of the geleideFormulier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGeleideFormulier(String value) {
            this.geleideFormulier = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
