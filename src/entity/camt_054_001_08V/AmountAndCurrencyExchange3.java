//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2023.08.09 � 10:48:17 AM WAT 
//


package entity.camt_054_001_08V;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AmountAndCurrencyExchange3 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AmountAndCurrencyExchange3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}AmountAndCurrencyExchangeDetails3" minOccurs="0"/>
 *         &lt;element name="TxAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}AmountAndCurrencyExchangeDetails3" minOccurs="0"/>
 *         &lt;element name="CntrValAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}AmountAndCurrencyExchangeDetails3" minOccurs="0"/>
 *         &lt;element name="AnncdPstngAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}AmountAndCurrencyExchangeDetails3" minOccurs="0"/>
 *         &lt;element name="PrtryAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}AmountAndCurrencyExchangeDetails4" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountAndCurrencyExchange3", propOrder = {
    "instdAmt",
    "txAmt",
    "cntrValAmt",
    "anncdPstngAmt",
    "prtryAmt"
})
public class AmountAndCurrencyExchange3 {

    @XmlElement(name = "InstdAmt")
    protected AmountAndCurrencyExchangeDetails3 instdAmt;
    @XmlElement(name = "TxAmt")
    protected AmountAndCurrencyExchangeDetails3 txAmt;
    @XmlElement(name = "CntrValAmt")
    protected AmountAndCurrencyExchangeDetails3 cntrValAmt;
    @XmlElement(name = "AnncdPstngAmt")
    protected AmountAndCurrencyExchangeDetails3 anncdPstngAmt;
    @XmlElement(name = "PrtryAmt")
    protected List<AmountAndCurrencyExchangeDetails4> prtryAmt;

    /**
     * Obtient la valeur de la propri�t� instdAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public AmountAndCurrencyExchangeDetails3 getInstdAmt() {
        return instdAmt;
    }

    /**
     * D�finit la valeur de la propri�t� instdAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public void setInstdAmt(AmountAndCurrencyExchangeDetails3 value) {
        this.instdAmt = value;
    }

    /**
     * Obtient la valeur de la propri�t� txAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public AmountAndCurrencyExchangeDetails3 getTxAmt() {
        return txAmt;
    }

    /**
     * D�finit la valeur de la propri�t� txAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public void setTxAmt(AmountAndCurrencyExchangeDetails3 value) {
        this.txAmt = value;
    }

    /**
     * Obtient la valeur de la propri�t� cntrValAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public AmountAndCurrencyExchangeDetails3 getCntrValAmt() {
        return cntrValAmt;
    }

    /**
     * D�finit la valeur de la propri�t� cntrValAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public void setCntrValAmt(AmountAndCurrencyExchangeDetails3 value) {
        this.cntrValAmt = value;
    }

    /**
     * Obtient la valeur de la propri�t� anncdPstngAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public AmountAndCurrencyExchangeDetails3 getAnncdPstngAmt() {
        return anncdPstngAmt;
    }

    /**
     * D�finit la valeur de la propri�t� anncdPstngAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public void setAnncdPstngAmt(AmountAndCurrencyExchangeDetails3 value) {
        this.anncdPstngAmt = value;
    }

    /**
     * Gets the value of the prtryAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtryAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtryAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountAndCurrencyExchangeDetails4 }
     * 
     * 
     */
    public List<AmountAndCurrencyExchangeDetails4> getPrtryAmt() {
        if (prtryAmt == null) {
            prtryAmt = new ArrayList<AmountAndCurrencyExchangeDetails4>();
        }
        return this.prtryAmt;
    }

}
