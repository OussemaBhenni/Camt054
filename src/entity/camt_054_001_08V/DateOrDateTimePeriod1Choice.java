//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2023.08.09 � 10:48:17 AM WAT 
//


package entity.camt_054_001_08V;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DateOrDateTimePeriod1Choice complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DateOrDateTimePeriod1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}DatePeriod2"/>
 *         &lt;element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}DateTimePeriod1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateOrDateTimePeriod1Choice", propOrder = {
    "dt",
    "dtTm"
})
public class DateOrDateTimePeriod1Choice {

    @XmlElement(name = "Dt")
    protected DatePeriod2 dt;
    @XmlElement(name = "DtTm")
    protected DateTimePeriod1 dtTm;

    /**
     * Obtient la valeur de la propri�t� dt.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2 }
     *     
     */
    public DatePeriod2 getDt() {
        return dt;
    }

    /**
     * D�finit la valeur de la propri�t� dt.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2 }
     *     
     */
    public void setDt(DatePeriod2 value) {
        this.dt = value;
    }

    /**
     * Obtient la valeur de la propri�t� dtTm.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getDtTm() {
        return dtTm;
    }

    /**
     * D�finit la valeur de la propri�t� dtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public void setDtTm(DateTimePeriod1 value) {
        this.dtTm = value;
    }

}
