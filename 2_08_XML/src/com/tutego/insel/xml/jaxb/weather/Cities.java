//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.03.13 um 07:41:29 PM CET 
//


package com.tutego.insel.xml.jaxb.weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calctime" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="list">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="city">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="coord">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="lon" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="sun">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="rise" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                               &lt;attribute name="set" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="temperature">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="humidity">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="pressure">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="wind">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="speed">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="direction">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="clouds">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="precipitation">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="weather">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="icon" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="lastupdate">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                     &lt;attribute name="unix" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "calctime",
    "count",
    "mode",
    "list"
})
@XmlRootElement(name = "cities")
public class Cities {

    @XmlElement(required = true)
    protected BigDecimal calctime;
    protected int count;
    @XmlElement(required = true)
    protected String mode;
    @XmlElement(required = true)
    protected Cities.List list;

    /**
     * Ruft den Wert der calctime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalctime() {
        return calctime;
    }

    /**
     * Legt den Wert der calctime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalctime(BigDecimal value) {
        this.calctime = value;
    }

    /**
     * Ruft den Wert der count-Eigenschaft ab.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Legt den Wert der count-Eigenschaft fest.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Ruft den Wert der mode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Legt den Wert der mode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Ruft den Wert der list-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Cities.List }
     *     
     */
    public Cities.List getList() {
        return list;
    }

    /**
     * Legt den Wert der list-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Cities.List }
     *     
     */
    public void setList(Cities.List value) {
        this.list = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="city">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="coord">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="lon" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="sun">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="rise" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                     &lt;attribute name="set" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="temperature">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="humidity">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="pressure">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="wind">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="speed">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="direction">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="clouds">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="precipitation">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="weather">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="icon" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="lastupdate">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                           &lt;attribute name="unix" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class List {

        @XmlElement(required = true)
        protected Cities.List.Item item;

        /**
         * Ruft den Wert der item-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Cities.List.Item }
         *     
         */
        public Cities.List.Item getItem() {
            return item;
        }

        /**
         * Legt den Wert der item-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Cities.List.Item }
         *     
         */
        public void setItem(Cities.List.Item value) {
            this.item = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="city">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="coord">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="lon" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="sun">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="rise" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                           &lt;attribute name="set" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="temperature">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="humidity">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="pressure">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="wind">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="speed">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="direction">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="clouds">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="precipitation">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="weather">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="icon" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="lastupdate">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                 &lt;attribute name="unix" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "city",
            "temperature",
            "humidity",
            "pressure",
            "wind",
            "clouds",
            "precipitation",
            "weather",
            "lastupdate"
        })
        public static class Item {

            @XmlElement(required = true)
            protected Cities.List.Item.City city;
            @XmlElement(required = true)
            protected Cities.List.Item.Temperature temperature;
            @XmlElement(required = true)
            protected Cities.List.Item.Humidity humidity;
            @XmlElement(required = true)
            protected Cities.List.Item.Pressure pressure;
            @XmlElement(required = true)
            protected Cities.List.Item.Wind wind;
            @XmlElement(required = true)
            protected Cities.List.Item.Clouds clouds;
            @XmlElement(required = true)
            protected Cities.List.Item.Precipitation precipitation;
            @XmlElement(required = true)
            protected Cities.List.Item.Weather weather;
            @XmlElement(required = true)
            protected Cities.List.Item.Lastupdate lastupdate;

            /**
             * Ruft den Wert der city-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Cities.List.Item.City }
             *     
             */
            public Cities.List.Item.City getCity() {
                return city;
            }

            /**
             * Legt den Wert der city-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Cities.List.Item.City }
             *     
             */
            public void setCity(Cities.List.Item.City value) {
                this.city = value;
            }

            /**
             * Ruft den Wert der temperature-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Cities.List.Item.Temperature }
             *     
             */
            public Cities.List.Item.Temperature getTemperature() {
                return temperature;
            }

            /**
             * Legt den Wert der temperature-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Cities.List.Item.Temperature }
             *     
             */
            public void setTemperature(Cities.List.Item.Temperature value) {
                this.temperature = value;
            }

            /**
             * Ruft den Wert der humidity-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Cities.List.Item.Humidity }
             *     
             */
            public Cities.List.Item.Humidity getHumidity() {
                return humidity;
            }

            /**
             * Legt den Wert der humidity-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Cities.List.Item.Humidity }
             *     
             */
            public void setHumidity(Cities.List.Item.Humidity value) {
                this.humidity = value;
            }

            /**
             * Ruft den Wert der pressure-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Cities.List.Item.Pressure }
             *     
             */
            public Cities.List.Item.Pressure getPressure() {
                return pressure;
            }

            /**
             * Legt den Wert der pressure-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Cities.List.Item.Pressure }
             *     
             */
            public void setPressure(Cities.List.Item.Pressure value) {
                this.pressure = value;
            }

            /**
             * Ruft den Wert der wind-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Cities.List.Item.Wind }
             *     
             */
            public Cities.List.Item.Wind getWind() {
                return wind;
            }

            /**
             * Legt den Wert der wind-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Cities.List.Item.Wind }
             *     
             */
            public void setWind(Cities.List.Item.Wind value) {
                this.wind = value;
            }

            /**
             * Ruft den Wert der clouds-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Cities.List.Item.Clouds }
             *     
             */
            public Cities.List.Item.Clouds getClouds() {
                return clouds;
            }

            /**
             * Legt den Wert der clouds-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Cities.List.Item.Clouds }
             *     
             */
            public void setClouds(Cities.List.Item.Clouds value) {
                this.clouds = value;
            }

            /**
             * Ruft den Wert der precipitation-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Cities.List.Item.Precipitation }
             *     
             */
            public Cities.List.Item.Precipitation getPrecipitation() {
                return precipitation;
            }

            /**
             * Legt den Wert der precipitation-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Cities.List.Item.Precipitation }
             *     
             */
            public void setPrecipitation(Cities.List.Item.Precipitation value) {
                this.precipitation = value;
            }

            /**
             * Ruft den Wert der weather-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Cities.List.Item.Weather }
             *     
             */
            public Cities.List.Item.Weather getWeather() {
                return weather;
            }

            /**
             * Legt den Wert der weather-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Cities.List.Item.Weather }
             *     
             */
            public void setWeather(Cities.List.Item.Weather value) {
                this.weather = value;
            }

            /**
             * Ruft den Wert der lastupdate-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Cities.List.Item.Lastupdate }
             *     
             */
            public Cities.List.Item.Lastupdate getLastupdate() {
                return lastupdate;
            }

            /**
             * Legt den Wert der lastupdate-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Cities.List.Item.Lastupdate }
             *     
             */
            public void setLastupdate(Cities.List.Item.Lastupdate value) {
                this.lastupdate = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="coord">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="lon" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="sun">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="rise" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *                 &lt;attribute name="set" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "coord",
                "country",
                "sun"
            })
            public static class City {

                @XmlElement(required = true)
                protected Cities.List.Item.City.Coord coord;
                @XmlElement(required = true)
                protected String country;
                @XmlElement(required = true)
                protected Cities.List.Item.City.Sun sun;
                @XmlAttribute(name = "id")
                protected Integer id;
                @XmlAttribute(name = "name")
                protected String name;

                /**
                 * Ruft den Wert der coord-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Cities.List.Item.City.Coord }
                 *     
                 */
                public Cities.List.Item.City.Coord getCoord() {
                    return coord;
                }

                /**
                 * Legt den Wert der coord-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Cities.List.Item.City.Coord }
                 *     
                 */
                public void setCoord(Cities.List.Item.City.Coord value) {
                    this.coord = value;
                }

                /**
                 * Ruft den Wert der country-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountry() {
                    return country;
                }

                /**
                 * Legt den Wert der country-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountry(String value) {
                    this.country = value;
                }

                /**
                 * Ruft den Wert der sun-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Cities.List.Item.City.Sun }
                 *     
                 */
                public Cities.List.Item.City.Sun getSun() {
                    return sun;
                }

                /**
                 * Legt den Wert der sun-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Cities.List.Item.City.Sun }
                 *     
                 */
                public void setSun(Cities.List.Item.City.Sun value) {
                    this.sun = value;
                }

                /**
                 * Ruft den Wert der id-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getId() {
                    return id;
                }

                /**
                 * Legt den Wert der id-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setId(Integer value) {
                    this.id = value;
                }

                /**
                 * Ruft den Wert der name-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Legt den Wert der name-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="lon" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Coord {

                    @XmlAttribute(name = "lon")
                    protected BigDecimal lon;
                    @XmlAttribute(name = "lat")
                    protected BigDecimal lat;

                    /**
                     * Ruft den Wert der lon-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getLon() {
                        return lon;
                    }

                    /**
                     * Legt den Wert der lon-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setLon(BigDecimal value) {
                        this.lon = value;
                    }

                    /**
                     * Ruft den Wert der lat-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getLat() {
                        return lat;
                    }

                    /**
                     * Legt den Wert der lat-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setLat(BigDecimal value) {
                        this.lat = value;
                    }

                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="rise" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *       &lt;attribute name="set" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Sun {

                    @XmlAttribute(name = "rise")
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar rise;
                    @XmlAttribute(name = "set")
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar set;

                    /**
                     * Ruft den Wert der rise-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getRise() {
                        return rise;
                    }

                    /**
                     * Legt den Wert der rise-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setRise(XMLGregorianCalendar value) {
                        this.rise = value;
                    }

                    /**
                     * Ruft den Wert der set-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getSet() {
                        return set;
                    }

                    /**
                     * Legt den Wert der set-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setSet(XMLGregorianCalendar value) {
                        this.set = value;
                    }

                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Clouds {

                @XmlAttribute(name = "value")
                protected Integer value;
                @XmlAttribute(name = "name")
                protected String name;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setValue(Integer value) {
                    this.value = value;
                }

                /**
                 * Ruft den Wert der name-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Legt den Wert der name-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Humidity {

                @XmlAttribute(name = "value")
                protected Integer value;
                @XmlAttribute(name = "unit")
                protected String unit;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setValue(Integer value) {
                    this.value = value;
                }

                /**
                 * Ruft den Wert der unit-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnit() {
                    return unit;
                }

                /**
                 * Legt den Wert der unit-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnit(String value) {
                    this.unit = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *       &lt;attribute name="unix" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Lastupdate {

                @XmlAttribute(name = "value")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar value;
                @XmlAttribute(name = "unix")
                protected Integer unix;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setValue(XMLGregorianCalendar value) {
                    this.value = value;
                }

                /**
                 * Ruft den Wert der unix-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getUnix() {
                    return unix;
                }

                /**
                 * Legt den Wert der unix-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setUnix(Integer value) {
                    this.unix = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Precipitation {

                @XmlAttribute(name = "mode")
                protected String mode;

                /**
                 * Ruft den Wert der mode-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMode() {
                    return mode;
                }

                /**
                 * Legt den Wert der mode-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMode(String value) {
                    this.mode = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Pressure {

                @XmlAttribute(name = "value")
                protected Integer value;
                @XmlAttribute(name = "unit")
                protected String unit;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setValue(Integer value) {
                    this.value = value;
                }

                /**
                 * Ruft den Wert der unit-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnit() {
                    return unit;
                }

                /**
                 * Legt den Wert der unit-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnit(String value) {
                    this.unit = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Temperature {

                @XmlAttribute(name = "value")
                protected BigDecimal value;
                @XmlAttribute(name = "min")
                protected BigDecimal min;
                @XmlAttribute(name = "max")
                protected Integer max;
                @XmlAttribute(name = "unit")
                protected String unit;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValue(BigDecimal value) {
                    this.value = value;
                }

                /**
                 * Ruft den Wert der min-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMin() {
                    return min;
                }

                /**
                 * Legt den Wert der min-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMin(BigDecimal value) {
                    this.min = value;
                }

                /**
                 * Ruft den Wert der max-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getMax() {
                    return max;
                }

                /**
                 * Legt den Wert der max-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setMax(Integer value) {
                    this.max = value;
                }

                /**
                 * Ruft den Wert der unit-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnit() {
                    return unit;
                }

                /**
                 * Legt den Wert der unit-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnit(String value) {
                    this.unit = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="icon" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Weather {

                @XmlAttribute(name = "number")
                protected Integer number;
                @XmlAttribute(name = "value")
                protected String value;
                @XmlAttribute(name = "icon")
                protected String icon;

                /**
                 * Ruft den Wert der number-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getNumber() {
                    return number;
                }

                /**
                 * Legt den Wert der number-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setNumber(Integer value) {
                    this.number = value;
                }

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Ruft den Wert der icon-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIcon() {
                    return icon;
                }

                /**
                 * Legt den Wert der icon-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIcon(String value) {
                    this.icon = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="speed">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="direction">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "speed",
                "direction"
            })
            public static class Wind {

                @XmlElement(required = true)
                protected Cities.List.Item.Wind.Speed speed;
                @XmlElement(required = true)
                protected Cities.List.Item.Wind.Direction direction;

                /**
                 * Ruft den Wert der speed-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Cities.List.Item.Wind.Speed }
                 *     
                 */
                public Cities.List.Item.Wind.Speed getSpeed() {
                    return speed;
                }

                /**
                 * Legt den Wert der speed-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Cities.List.Item.Wind.Speed }
                 *     
                 */
                public void setSpeed(Cities.List.Item.Wind.Speed value) {
                    this.speed = value;
                }

                /**
                 * Ruft den Wert der direction-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Cities.List.Item.Wind.Direction }
                 *     
                 */
                public Cities.List.Item.Wind.Direction getDirection() {
                    return direction;
                }

                /**
                 * Legt den Wert der direction-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Cities.List.Item.Wind.Direction }
                 *     
                 */
                public void setDirection(Cities.List.Item.Wind.Direction value) {
                    this.direction = value;
                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Direction {

                    @XmlAttribute(name = "value")
                    protected BigDecimal value;
                    @XmlAttribute(name = "code")
                    protected String code;
                    @XmlAttribute(name = "name")
                    protected String name;

                    /**
                     * Ruft den Wert der value-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValue() {
                        return value;
                    }

                    /**
                     * Legt den Wert der value-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setValue(BigDecimal value) {
                        this.value = value;
                    }

                    /**
                     * Ruft den Wert der code-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCode() {
                        return code;
                    }

                    /**
                     * Legt den Wert der code-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCode(String value) {
                        this.code = value;
                    }

                    /**
                     * Ruft den Wert der name-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Legt den Wert der name-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Speed {

                    @XmlAttribute(name = "value")
                    protected BigDecimal value;
                    @XmlAttribute(name = "name")
                    protected String name;

                    /**
                     * Ruft den Wert der value-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValue() {
                        return value;
                    }

                    /**
                     * Legt den Wert der value-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setValue(BigDecimal value) {
                        this.value = value;
                    }

                    /**
                     * Ruft den Wert der name-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Legt den Wert der name-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                }

            }

        }

    }

}
