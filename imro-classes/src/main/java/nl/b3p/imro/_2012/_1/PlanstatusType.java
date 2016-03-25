//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.25 at 03:20:11 PM CET 
//


package nl.b3p.imro._2012._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanstatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlanstatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="concept"/>
 *     &lt;enumeration value="voorontwerp"/>
 *     &lt;enumeration value="ontwerp"/>
 *     &lt;enumeration value="vastgesteld"/>
 *     &lt;enumeration value="geconsolideerd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlanstatusType")
@XmlEnum
public enum PlanstatusType {

    @XmlEnumValue("concept")
    CONCEPT("concept"),
    @XmlEnumValue("voorontwerp")
    VOORONTWERP("voorontwerp"),
    @XmlEnumValue("ontwerp")
    ONTWERP("ontwerp"),
    @XmlEnumValue("vastgesteld")
    VASTGESTELD("vastgesteld"),
    @XmlEnumValue("geconsolideerd")
    GECONSOLIDEERD("geconsolideerd");
    private final String value;

    PlanstatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlanstatusType fromValue(String v) {
        for (PlanstatusType c: PlanstatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
