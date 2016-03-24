//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.24 at 01:09:58 PM CET 
//


package nl.b3p.imro._2012._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuimtelijkPlanobjectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RuimtelijkPlanobjectType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="enkelbestemming"/>
 *     &lt;enumeration value="dubbelbestemming"/>
 *     &lt;enumeration value="bouwvlak"/>
 *     &lt;enumeration value="functieaanduiding"/>
 *     &lt;enumeration value="bouwaanduiding"/>
 *     &lt;enumeration value="maatvoering"/>
 *     &lt;enumeration value="figuur"/>
 *     &lt;enumeration value="gebiedsaanduiding"/>
 *     &lt;enumeration value="structuurvisiegebied_G"/>
 *     &lt;enumeration value="structuurvisiegebied_P"/>
 *     &lt;enumeration value="structuurvisiegebied_R"/>
 *     &lt;enumeration value="structuurvisiecomplex_G"/>
 *     &lt;enumeration value="structuurvisiecomplex_P"/>
 *     &lt;enumeration value="structuurvisiecomplex_R"/>
 *     &lt;enumeration value="structuurvisieverklaring_P"/>
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
@XmlType(name = "RuimtelijkPlanobjectType")
@XmlEnum
public enum RuimtelijkPlanobjectType {

    @XmlEnumValue("enkelbestemming")
    ENKELBESTEMMING("enkelbestemming"),
    @XmlEnumValue("dubbelbestemming")
    DUBBELBESTEMMING("dubbelbestemming"),
    @XmlEnumValue("bouwvlak")
    BOUWVLAK("bouwvlak"),
    @XmlEnumValue("functieaanduiding")
    FUNCTIEAANDUIDING("functieaanduiding"),
    @XmlEnumValue("bouwaanduiding")
    BOUWAANDUIDING("bouwaanduiding"),
    @XmlEnumValue("maatvoering")
    MAATVOERING("maatvoering"),
    @XmlEnumValue("figuur")
    FIGUUR("figuur"),
    @XmlEnumValue("gebiedsaanduiding")
    GEBIEDSAANDUIDING("gebiedsaanduiding"),
    @XmlEnumValue("structuurvisiegebied_G")
    STRUCTUURVISIEGEBIED_G("structuurvisiegebied_G"),
    @XmlEnumValue("structuurvisiegebied_P")
    STRUCTUURVISIEGEBIED_P("structuurvisiegebied_P"),
    @XmlEnumValue("structuurvisiegebied_R")
    STRUCTUURVISIEGEBIED_R("structuurvisiegebied_R"),
    @XmlEnumValue("structuurvisiecomplex_G")
    STRUCTUURVISIECOMPLEX_G("structuurvisiecomplex_G"),
    @XmlEnumValue("structuurvisiecomplex_P")
    STRUCTUURVISIECOMPLEX_P("structuurvisiecomplex_P"),
    @XmlEnumValue("structuurvisiecomplex_R")
    STRUCTUURVISIECOMPLEX_R("structuurvisiecomplex_R"),
    @XmlEnumValue("structuurvisieverklaring_P")
    STRUCTUURVISIEVERKLARING_P("structuurvisieverklaring_P"),
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

    RuimtelijkPlanobjectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RuimtelijkPlanobjectType fromValue(String v) {
        for (RuimtelijkPlanobjectType c: RuimtelijkPlanobjectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
