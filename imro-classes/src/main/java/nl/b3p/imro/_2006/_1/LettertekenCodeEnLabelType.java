//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.17 at 10:51:25 AM CEST 
//


package nl.b3p.imro._2006._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LettertekenCodeEnLabelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LettertekenCodeEnLabelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ravi.nl/imro2006}LettertekenOfSymboolType">
 *       &lt;sequence>
 *         &lt;element name="labelInfo" type="{http://www.ravi.nl/imro2006}LabelPropertyType"/>
 *         &lt;element name="lettertekenCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LettertekenCodeEnLabelType", propOrder = {
    "labelInfo",
    "lettertekenCode"
})
public class LettertekenCodeEnLabelType
    extends LettertekenOfSymboolType
{

    @XmlElement(required = true)
    protected LabelPropertyType labelInfo;
    protected String lettertekenCode;

    /**
     * Gets the value of the labelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LabelPropertyType }
     *     
     */
    public LabelPropertyType getLabelInfo() {
        return labelInfo;
    }

    /**
     * Sets the value of the labelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelPropertyType }
     *     
     */
    public void setLabelInfo(LabelPropertyType value) {
        this.labelInfo = value;
    }

    /**
     * Gets the value of the lettertekenCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLettertekenCode() {
        return lettertekenCode;
    }

    /**
     * Sets the value of the lettertekenCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLettertekenCode(String value) {
        this.lettertekenCode = value;
    }

}
