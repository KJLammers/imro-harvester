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
 * <p>Java class for RolExternPlan_PVType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RolExternPlan_PVType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="als mutatie opgenomen"/>
 *     &lt;enumeration value="gedeeltelijke herziening van extern plan/besluit"/>
 *     &lt;enumeration value="ten gevolge van extern plan/besluit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RolExternPlan_PVType")
@XmlEnum
public enum RolExternPlanPVType {

    @XmlEnumValue("als mutatie opgenomen")
    ALS_MUTATIE_OPGENOMEN("als mutatie opgenomen"),
    @XmlEnumValue("gedeeltelijke herziening van extern plan/besluit")
    GEDEELTELIJKE_HERZIENING_VAN_EXTERN_PLAN_BESLUIT("gedeeltelijke herziening van extern plan/besluit"),
    @XmlEnumValue("ten gevolge van extern plan/besluit")
    TEN_GEVOLGE_VAN_EXTERN_PLAN_BESLUIT("ten gevolge van extern plan/besluit");
    private final String value;

    RolExternPlanPVType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RolExternPlanPVType fromValue(String v) {
        for (RolExternPlanPVType c: RolExternPlanPVType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
