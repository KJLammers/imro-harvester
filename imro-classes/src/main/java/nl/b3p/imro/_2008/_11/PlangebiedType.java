//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.08 at 11:05:13 AM CEST 
//


package nl.b3p.imro._2008._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlangebiedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlangebiedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.geonovum.nl/imro/2008/1}PlanologischGebiedType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlangebiedType")
@XmlSeeAlso({
    BesluitgebiedXType.class,
    StructuurvisieplangebiedRType.class,
    StructuurvisieplangebiedPType.class,
    StructuurvisieplangebiedGType.class,
    BestemmingsplangebiedType.class,
    BesluitgebiedAType.class,
    BesluitgebiedPType.class
})
public abstract class PlangebiedType
    extends PlanologischGebiedType
{


}
