//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.01 at 03:04:51 PM CEST 
//


package nl.b3p.imro._2008._11;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuimtelijkPlanobject_GBType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RuimtelijkPlanobject_GBType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="besluitvlak_X"/>
 *     &lt;enumeration value="besluitsubvlak_X"/>
 *     &lt;enumeration value="besluitvlak_P"/>
 *     &lt;enumeration value="besluitsubvlak_P"/>
 *     &lt;enumeration value="besluitvlak_A"/>
 *     &lt;enumeration value="besluitsubvlak_A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RuimtelijkPlanobject_GBType")
@XmlEnum
public enum RuimtelijkPlanobjectGBType {

    @XmlEnumValue("besluitvlak_X")
    BESLUITVLAK_X("besluitvlak_X"),
    @XmlEnumValue("besluitsubvlak_X")
    BESLUITSUBVLAK_X("besluitsubvlak_X"),
    @XmlEnumValue("besluitvlak_P")
    BESLUITVLAK_P("besluitvlak_P"),
    @XmlEnumValue("besluitsubvlak_P")
    BESLUITSUBVLAK_P("besluitsubvlak_P"),
    @XmlEnumValue("besluitvlak_A")
    BESLUITVLAK_A("besluitvlak_A"),
    @XmlEnumValue("besluitsubvlak_A")
    BESLUITSUBVLAK_A("besluitsubvlak_A");
    private final String value;

    RuimtelijkPlanobjectGBType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RuimtelijkPlanobjectGBType fromValue(String v) {
        for (RuimtelijkPlanobjectGBType c: RuimtelijkPlanobjectGBType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
