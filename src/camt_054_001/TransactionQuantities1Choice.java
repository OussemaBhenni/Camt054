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
 * <p>Classe Java pour TransactionQuantities1Choice complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TransactionQuantities1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}FinancialInstrumentQuantityChoice"/>
 *           &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ProprietaryQuantity1"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionQuantities1Choice", propOrder = {
    "qty",
    "prtry"
})
public class TransactionQuantities1Choice {

    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantityChoice qty;
    @XmlElement(name = "Prtry")
    protected ProprietaryQuantity1 prtry;

    /**
     * Obtient la valeur de la propri�t� qty.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getQty() {
        return qty;
    }

    /**
     * D�finit la valeur de la propri�t� qty.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public void setQty(FinancialInstrumentQuantityChoice value) {
        this.qty = value;
    }

    /**
     * Obtient la valeur de la propri�t� prtry.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryQuantity1 }
     *     
     */
    public ProprietaryQuantity1 getPrtry() {
        return prtry;
    }

    /**
     * D�finit la valeur de la propri�t� prtry.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryQuantity1 }
     *     
     */
    public void setPrtry(ProprietaryQuantity1 value) {
        this.prtry = value;
    }

}
