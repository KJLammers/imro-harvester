//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.08 at 11:05:13 AM CEST 
//


package nl.b3p.imro._2008._11;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Planstatus_XGBType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Planstatus_XGBType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="concept"/>
 *     &lt;enumeration value="voorontwerp"/>
 *     &lt;enumeration value="ontwerp"/>
 *     &lt;enumeration value="vastgesteld"/>
 *     &lt;enumeration value="onherroepelijk"/>
 *     &lt;enumeration value="geconsolideerde versie"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Planstatus_XGBType")
@XmlEnum
public enum PlanstatusXGBType {

    @XmlEnumValue("concept")
    CONCEPT("concept"),
    @XmlEnumValue("voorontwerp")
    VOORONTWERP("voorontwerp"),
    @XmlEnumValue("ontwerp")
    ONTWERP("ontwerp"),
    @XmlEnumValue("vastgesteld")
    VASTGESTELD("vastgesteld"),
    @XmlEnumValue("onherroepelijk")
    ONHERROEPELIJK("onherroepelijk"),
    @XmlEnumValue("geconsolideerde versie")
    GECONSOLIDEERDE_VERSIE("geconsolideerde versie");
    private final String value;

    PlanstatusXGBType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlanstatusXGBType fromValue(String v) {
        for (PlanstatusXGBType c: PlanstatusXGBType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
