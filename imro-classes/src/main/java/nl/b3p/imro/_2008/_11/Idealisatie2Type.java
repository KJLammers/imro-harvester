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
 * <p>Java class for Idealisatie_2Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Idealisatie_2Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="exact"/>
 *     &lt;enumeration value="indicatief"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Idealisatie_2Type")
@XmlEnum
public enum Idealisatie2Type {

    @XmlEnumValue("exact")
    EXACT("exact"),
    @XmlEnumValue("indicatief")
    INDICATIEF("indicatief");
    private final String value;

    Idealisatie2Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Idealisatie2Type fromValue(String v) {
        for (Idealisatie2Type c: Idealisatie2Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
