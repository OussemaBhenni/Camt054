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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CardAggregated1 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CardAggregated1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddtlSvc" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}CardPaymentServiceType2Code" minOccurs="0"/>
 *         &lt;element name="TxCtgy" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}ExternalCardTransactionCategory1Code" minOccurs="0"/>
 *         &lt;element name="SaleRcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Max35Text" minOccurs="0"/>
 *         &lt;element name="SeqNbRg" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}CardSequenceNumberRange1" minOccurs="0"/>
 *         &lt;element name="TxDtRg" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}DateOrDateTimePeriodChoice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAggregated1", propOrder = {
    "addtlSvc",
    "txCtgy",
    "saleRcncltnId",
    "seqNbRg",
    "txDtRg"
})
public class CardAggregated1 {

    @XmlElement(name = "AddtlSvc")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType2Code addtlSvc;
    @XmlElement(name = "TxCtgy")
    protected String txCtgy;
    @XmlElement(name = "SaleRcncltnId")
    protected String saleRcncltnId;
    @XmlElement(name = "SeqNbRg")
    protected CardSequenceNumberRange1 seqNbRg;
    @XmlElement(name = "TxDtRg")
    protected DateOrDateTimePeriodChoice txDtRg;

    /**
     * Obtient la valeur de la propri�t� addtlSvc.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType2Code }
     *     
     */
    public CardPaymentServiceType2Code getAddtlSvc() {
        return addtlSvc;
    }

    /**
     * D�finit la valeur de la propri�t� addtlSvc.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType2Code }
     *     
     */
    public void setAddtlSvc(CardPaymentServiceType2Code value) {
        this.addtlSvc = value;
    }

    /**
     * Obtient la valeur de la propri�t� txCtgy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxCtgy() {
        return txCtgy;
    }

    /**
     * D�finit la valeur de la propri�t� txCtgy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxCtgy(String value) {
        this.txCtgy = value;
    }

    /**
     * Obtient la valeur de la propri�t� saleRcncltnId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRcncltnId() {
        return saleRcncltnId;
    }

    /**
     * D�finit la valeur de la propri�t� saleRcncltnId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRcncltnId(String value) {
        this.saleRcncltnId = value;
    }

    /**
     * Obtient la valeur de la propri�t� seqNbRg.
     * 
     * @return
     *     possible object is
     *     {@link CardSequenceNumberRange1 }
     *     
     */
    public CardSequenceNumberRange1 getSeqNbRg() {
        return seqNbRg;
    }

    /**
     * D�finit la valeur de la propri�t� seqNbRg.
     * 
     * @param value
     *     allowed object is
     *     {@link CardSequenceNumberRange1 }
     *     
     */
    public void setSeqNbRg(CardSequenceNumberRange1 value) {
        this.seqNbRg = value;
    }

    /**
     * Obtient la valeur de la propri�t� txDtRg.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDateTimePeriodChoice }
     *     
     */
    public DateOrDateTimePeriodChoice getTxDtRg() {
        return txDtRg;
    }

    /**
     * D�finit la valeur de la propri�t� txDtRg.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDateTimePeriodChoice }
     *     
     */
    public void setTxDtRg(DateOrDateTimePeriodChoice value) {
        this.txDtRg = value;
    }

}
