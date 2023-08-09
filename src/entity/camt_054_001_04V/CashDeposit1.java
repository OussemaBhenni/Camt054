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
 * <p>Classe Java pour CashDeposit1 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CashDeposit1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoteDnmtn" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}ActiveCurrencyAndAmount"/>
 *         &lt;element name="NbOfNotes" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Max15NumericText"/>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}ActiveCurrencyAndAmount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashDeposit1", propOrder = {
    "noteDnmtn",
    "nbOfNotes",
    "amt"
})
public class CashDeposit1 {

    @XmlElement(name = "NoteDnmtn", required = true)
    protected ActiveCurrencyAndAmount noteDnmtn;
    @XmlElement(name = "NbOfNotes", required = true)
    protected String nbOfNotes;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;

    /**
     * Obtient la valeur de la propri�t� noteDnmtn.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNoteDnmtn() {
        return noteDnmtn;
    }

    /**
     * D�finit la valeur de la propri�t� noteDnmtn.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNoteDnmtn(ActiveCurrencyAndAmount value) {
        this.noteDnmtn = value;
    }

    /**
     * Obtient la valeur de la propri�t� nbOfNotes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfNotes() {
        return nbOfNotes;
    }

    /**
     * D�finit la valeur de la propri�t� nbOfNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfNotes(String value) {
        this.nbOfNotes = value;
    }

    /**
     * Obtient la valeur de la propri�t� amt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * D�finit la valeur de la propri�t� amt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

}
