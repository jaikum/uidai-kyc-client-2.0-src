//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.05 at 11:34:00 PM IST 
//


package in.gov.uidai.authentication.uid_bfd_request_data._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bios" type="{http://www.uidai.gov.in/authentication/uid-bfd-request-data/1.0}BfdBios"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ts" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ver" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bios"
})
@XmlRootElement(name = "Rbd")
public class Rbd {

    @XmlElement(name = "Bios", required = true)
    protected BfdBios bios;
    @XmlAttribute(name = "ts", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ts;
    @XmlAttribute(name = "ver", required = true)
    protected String ver;

    /**
     * Gets the value of the bios property.
     * 
     * @return
     *     possible object is
     *     {@link BfdBios }
     *     
     */
    public BfdBios getBios() {
        return bios;
    }

    /**
     * Sets the value of the bios property.
     * 
     * @param value
     *     allowed object is
     *     {@link BfdBios }
     *     
     */
    public void setBios(BfdBios value) {
        this.bios = value;
    }

    /**
     * Gets the value of the ts property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTs() {
        return ts;
    }

    /**
     * Sets the value of the ts property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTs(XMLGregorianCalendar value) {
        this.ts = value;
    }

    /**
     * Gets the value of the ver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVer() {
        return ver;
    }

    /**
     * Sets the value of the ver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVer(String value) {
        this.ver = value;
    }

}
