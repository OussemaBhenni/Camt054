//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2023.08.09 � 10:44:17 AM WAT 
//


package camt_054_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Rate3 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Rate3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}RateType4Choice"/>
 *         &lt;element name="VldtyRg" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}CurrencyAndAmountRange2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rate3", propOrder = {
    "tp",
    "vldtyRg"
})
public class Rate3 {

    @XmlElement(name = "Tp", required = true)
    protected RateType4Choice tp;
    @XmlElement(name = "VldtyRg")
    protected CurrencyAndAmountRange2 vldtyRg;

    /**
     * Obtient la valeur de la propri�t� tp.
     * 
     * @return
     *     possible object is
     *     {@link RateType4Choice }
     *     
     */
    public RateType4Choice getTp() {
        return tp;
    }

    /**
     * D�finit la valeur de la propri�t� tp.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType4Choice }
     *     
     */
    public void setTp(RateType4Choice value) {
        this.tp = value;
    }

    /**
     * Obtient la valeur de la propri�t� vldtyRg.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmountRange2 }
     *     
     */
    public CurrencyAndAmountRange2 getVldtyRg() {
        return vldtyRg;
    }

    /**
     * D�finit la valeur de la propri�t� vldtyRg.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmountRange2 }
     *     
     */
    public void setVldtyRg(CurrencyAndAmountRange2 value) {
        this.vldtyRg = value;
    }

}
