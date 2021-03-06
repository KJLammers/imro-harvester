//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.04 at 09:04:24 PM CET 
//


package nl.geonovum.stri._2012._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DossierStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DossierStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="in voorbereiding"/>
 *     &lt;enumeration value="vastgesteld"/>
 *     &lt;enumeration value="geheel in werking"/>
 *     &lt;enumeration value="deels in werking"/>
 *     &lt;enumeration value="niet in werking"/>
 *     &lt;enumeration value="geheel onherroepelijk in werking"/>
 *     &lt;enumeration value="deels onherroepelijk in werking"/>
 *     &lt;enumeration value="vervallen"/>
 *     &lt;enumeration value="geconsolideerd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DossierStatus")
@XmlEnum
public enum DossierStatus {

    @XmlEnumValue("in voorbereiding")
    IN_VOORBEREIDING("in voorbereiding"),
    @XmlEnumValue("vastgesteld")
    VASTGESTELD("vastgesteld"),
    @XmlEnumValue("geheel in werking")
    GEHEEL_IN_WERKING("geheel in werking"),
    @XmlEnumValue("deels in werking")
    DEELS_IN_WERKING("deels in werking"),
    @XmlEnumValue("niet in werking")
    NIET_IN_WERKING("niet in werking"),
    @XmlEnumValue("geheel onherroepelijk in werking")
    GEHEEL_ONHERROEPELIJK_IN_WERKING("geheel onherroepelijk in werking"),
    @XmlEnumValue("deels onherroepelijk in werking")
    DEELS_ONHERROEPELIJK_IN_WERKING("deels onherroepelijk in werking"),
    @XmlEnumValue("vervallen")
    VERVALLEN("vervallen"),
    @XmlEnumValue("geconsolideerd")
    GECONSOLIDEERD("geconsolideerd");
    private final String value;

    DossierStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DossierStatus fromValue(String v) {
        for (DossierStatus c: DossierStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
