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
 * <p>Java class for AggregationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AggregationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="set"/>
 *     &lt;enumeration value="bag"/>
 *     &lt;enumeration value="sequence"/>
 *     &lt;enumeration value="array"/>
 *     &lt;enumeration value="record"/>
 *     &lt;enumeration value="table"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AggregationType", namespace = "http://www.opengis.net/gml/3.2")
@XmlEnum
public enum AggregationType {

    @XmlEnumValue("set")
    SET("set"),
    @XmlEnumValue("bag")
    BAG("bag"),
    @XmlEnumValue("sequence")
    SEQUENCE("sequence"),
    @XmlEnumValue("array")
    ARRAY("array"),
    @XmlEnumValue("record")
    RECORD("record"),
    @XmlEnumValue("table")
    TABLE("table");
    private final String value;

    AggregationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AggregationType fromValue(String v) {
        for (AggregationType c: AggregationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
