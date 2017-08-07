//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.05 at 11:34:00 PM IST 
//


package in.gov.uidai.authentication.common.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Meta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Meta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="udc" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="20"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="pip" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="60"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="fdc" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="10"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="idc" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="10"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="lot" use="required" type="{http://www.uidai.gov.in/authentication/common/types/1.0}LocationType" /&gt;
 *       &lt;attribute name="lov" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="50"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Meta")
public class Meta {

    @XmlAttribute(name = "udc", required = true)
    protected String udc;
    @XmlAttribute(name = "pip", required = true)
    protected String pip;
    @XmlAttribute(name = "fdc", required = true)
    protected String fdc;
    @XmlAttribute(name = "idc", required = true)
    protected String idc;
    @XmlAttribute(name = "lot", required = true)
    protected LocationType lot;
    @XmlAttribute(name = "lov", required = true)
    protected String lov;

    /**
     * Gets the value of the udc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdc() {
        return udc;
    }

    /**
     * Sets the value of the udc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdc(String value) {
        this.udc = value;
    }

    /**
     * Gets the value of the pip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPip() {
        return pip;
    }

    /**
     * Sets the value of the pip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPip(String value) {
        this.pip = value;
    }

    /**
     * Gets the value of the fdc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdc() {
        return fdc;
    }

    /**
     * Sets the value of the fdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdc(String value) {
        this.fdc = value;
    }

    /**
     * Gets the value of the idc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdc() {
        return idc;
    }

    /**
     * Sets the value of the idc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdc(String value) {
        this.idc = value;
    }

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLot(LocationType value) {
        this.lot = value;
    }

    /**
     * Gets the value of the lov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLov() {
        return lov;
    }

    /**
     * Sets the value of the lov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLov(String value) {
        this.lov = value;
    }

}
