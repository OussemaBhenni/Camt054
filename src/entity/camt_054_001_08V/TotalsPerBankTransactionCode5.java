//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2023.08.09 � 10:48:17 AM WAT 
//


package entity.camt_054_001_08V;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TotalsPerBankTransactionCode5 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TotalsPerBankTransactionCode5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NbOfNtries" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Max15NumericText" minOccurs="0"/>
 *         &lt;element name="Sum" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}DecimalNumber" minOccurs="0"/>
 *         &lt;element name="TtlNetNtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}AmountAndDirection35" minOccurs="0"/>
 *         &lt;element name="CdtNtries" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}NumberAndSumOfTransactions1" minOccurs="0"/>
 *         &lt;element name="DbtNtries" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}NumberAndSumOfTransactions1" minOccurs="0"/>
 *         &lt;element name="FcstInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}TrueFalseIndicator" minOccurs="0"/>
 *         &lt;element name="BkTxCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}BankTransactionCodeStructure4"/>
 *         &lt;element name="Avlbty" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CashAvailability1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}DateAndDateTime2Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalsPerBankTransactionCode5", propOrder = {
    "nbOfNtries",
    "sum",
    "ttlNetNtry",
    "cdtNtries",
    "dbtNtries",
    "fcstInd",
    "bkTxCd",
    "avlbty",
    "dt"
})
public class TotalsPerBankTransactionCode5 {

    @XmlElement(name = "NbOfNtries")
    protected String nbOfNtries;
    @XmlElement(name = "Sum")
    protected BigDecimal sum;
    @XmlElement(name = "TtlNetNtry")
    protected AmountAndDirection35 ttlNetNtry;
    @XmlElement(name = "CdtNtries")
    protected NumberAndSumOfTransactions1 cdtNtries;
    @XmlElement(name = "DbtNtries")
    protected NumberAndSumOfTransactions1 dbtNtries;
    @XmlElement(name = "FcstInd")
    protected Boolean fcstInd;
    @XmlElement(name = "BkTxCd", required = true)
    protected BankTransactionCodeStructure4 bkTxCd;
    @XmlElement(name = "Avlbty")
    protected List<CashAvailability1> avlbty;
    @XmlElement(name = "Dt")
    protected DateAndDateTime2Choice dt;

    /**
     * Obtient la valeur de la propri�t� nbOfNtries.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfNtries() {
        return nbOfNtries;
    }

    /**
     * D�finit la valeur de la propri�t� nbOfNtries.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfNtries(String value) {
        this.nbOfNtries = value;
    }

    /**
     * Obtient la valeur de la propri�t� sum.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSum() {
        return sum;
    }

    /**
     * D�finit la valeur de la propri�t� sum.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSum(BigDecimal value) {
        this.sum = value;
    }

    /**
     * Obtient la valeur de la propri�t� ttlNetNtry.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection35 }
     *     
     */
    public AmountAndDirection35 getTtlNetNtry() {
        return ttlNetNtry;
    }

    /**
     * D�finit la valeur de la propri�t� ttlNetNtry.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection35 }
     *     
     */
    public void setTtlNetNtry(AmountAndDirection35 value) {
        this.ttlNetNtry = value;
    }

    /**
     * Obtient la valeur de la propri�t� cdtNtries.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndSumOfTransactions1 }
     *     
     */
    public NumberAndSumOfTransactions1 getCdtNtries() {
        return cdtNtries;
    }

    /**
     * D�finit la valeur de la propri�t� cdtNtries.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndSumOfTransactions1 }
     *     
     */
    public void setCdtNtries(NumberAndSumOfTransactions1 value) {
        this.cdtNtries = value;
    }

    /**
     * Obtient la valeur de la propri�t� dbtNtries.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndSumOfTransactions1 }
     *     
     */
    public NumberAndSumOfTransactions1 getDbtNtries() {
        return dbtNtries;
    }

    /**
     * D�finit la valeur de la propri�t� dbtNtries.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndSumOfTransactions1 }
     *     
     */
    public void setDbtNtries(NumberAndSumOfTransactions1 value) {
        this.dbtNtries = value;
    }

    /**
     * Obtient la valeur de la propri�t� fcstInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFcstInd() {
        return fcstInd;
    }

    /**
     * D�finit la valeur de la propri�t� fcstInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFcstInd(Boolean value) {
        this.fcstInd = value;
    }

    /**
     * Obtient la valeur de la propri�t� bkTxCd.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public BankTransactionCodeStructure4 getBkTxCd() {
        return bkTxCd;
    }

    /**
     * D�finit la valeur de la propri�t� bkTxCd.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public void setBkTxCd(BankTransactionCodeStructure4 value) {
        this.bkTxCd = value;
    }

    /**
     * Gets the value of the avlbty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avlbty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvlbty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAvailability1 }
     * 
     * 
     */
    public List<CashAvailability1> getAvlbty() {
        if (avlbty == null) {
            avlbty = new ArrayList<CashAvailability1>();
        }
        return this.avlbty;
    }

    /**
     * Obtient la valeur de la propri�t� dt.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getDt() {
        return dt;
    }

    /**
     * D�finit la valeur de la propri�t� dt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setDt(DateAndDateTime2Choice value) {
        this.dt = value;
    }

}
