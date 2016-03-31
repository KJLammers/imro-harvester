//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.31 at 03:43:56 PM CEST 
//


package nl.b3p.imro._2012._10;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Teksttype_XGBType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Teksttype_XGBType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="besluittekst"/>
 *     &lt;enumeration value="voorschriften/regels"/>
 *     &lt;enumeration value="toelichting"/>
 *     &lt;enumeration value="bijlage bij besluittekst"/>
 *     &lt;enumeration value="bijlage bij voorschriften/regels"/>
 *     &lt;enumeration value="bijlage bij toelichting"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Teksttype_XGBType")
@XmlEnum
public enum TeksttypeXGBType {

    @XmlEnumValue("besluittekst")
    BESLUITTEKST("besluittekst"),
    @XmlEnumValue("voorschriften/regels")
    VOORSCHRIFTEN_REGELS("voorschriften/regels"),
    @XmlEnumValue("toelichting")
    TOELICHTING("toelichting"),
    @XmlEnumValue("bijlage bij besluittekst")
    BIJLAGE_BIJ_BESLUITTEKST("bijlage bij besluittekst"),
    @XmlEnumValue("bijlage bij voorschriften/regels")
    BIJLAGE_BIJ_VOORSCHRIFTEN_REGELS("bijlage bij voorschriften/regels"),
    @XmlEnumValue("bijlage bij toelichting")
    BIJLAGE_BIJ_TOELICHTING("bijlage bij toelichting");
    private final String value;

    TeksttypeXGBType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TeksttypeXGBType fromValue(String v) {
        for (TeksttypeXGBType c: TeksttypeXGBType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
