//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2023.08.09 � 10:46:40 AM WAT 
//


package entity.camt_054_001_04V;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DateOrDateTimePeriodChoice complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DateOrDateTimePeriodChoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}DatePeriodDetails"/>
 *         &lt;element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}DateTimePeriodDetails"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateOrDateTimePeriodChoice", propOrder = {
    "dt",
    "dtTm"
})
public class DateOrDateTimePeriodChoice {

    @XmlElement(name = "Dt")
    protected DatePeriodDetails dt;
    @XmlElement(name = "DtTm")
    protected DateTimePeriodDetails dtTm;

    /**
     * Obtient la valeur de la propri�t� dt.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodDetails }
     *     
     */
    public DatePeriodDetails getDt() {
        return dt;
    }

    /**
     * D�finit la valeur de la propri�t� dt.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodDetails }
     *     
     */
    public void setDt(DatePeriodDetails value) {
        this.dt = value;
    }

    /**
     * Obtient la valeur de la propri�t� dtTm.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetails }
     *     
     */
    public DateTimePeriodDetails getDtTm() {
        return dtTm;
    }

    /**
     * D�finit la valeur de la propri�t� dtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetails }
     *     
     */
    public void setDtTm(DateTimePeriodDetails value) {
        this.dtTm = value;
    }

}
