//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.16 at 04:28:47 PM CST 
//


package com.github.tonygregg.flight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="airline" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightDetails", propOrder = {
    "id",
    "airline",
    "fromCity",
    "toCity"
})
public class FlightDetails {

    protected int id;
    @XmlElement(required = true)
    protected String airline;
    @XmlElement(required = true)
    protected String fromCity;
    @XmlElement(required = true)
    protected String toCity;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirline(String value) {
        this.airline = value;
    }

    /**
     * Gets the value of the fromCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCity() {
        return fromCity;
    }

    /**
     * Sets the value of the fromCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCity(String value) {
        this.fromCity = value;
    }

    /**
     * Gets the value of the toCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCity() {
        return toCity;
    }

    /**
     * Sets the value of the toCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCity(String value) {
        this.toCity = value;
    }

}