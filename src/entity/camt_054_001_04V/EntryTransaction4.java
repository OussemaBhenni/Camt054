//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2023.08.09 � 10:46:40 AM WAT 
//


package entity.camt_054_001_04V;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EntryTransaction4 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EntryTransaction4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Refs" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}TransactionReferences3" minOccurs="0"/>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}ActiveOrHistoricCurrencyAndAmount"/>
 *         &lt;element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}CreditDebitCode"/>
 *         &lt;element name="AmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}AmountAndCurrencyExchange3" minOccurs="0"/>
 *         &lt;element name="Avlbty" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}CashBalanceAvailability2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BkTxCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}BankTransactionCodeStructure4" minOccurs="0"/>
 *         &lt;element name="Chrgs" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Charges4" minOccurs="0"/>
 *         &lt;element name="Intrst" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}TransactionInterest3" minOccurs="0"/>
 *         &lt;element name="RltdPties" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}TransactionParties3" minOccurs="0"/>
 *         &lt;element name="RltdAgts" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}TransactionAgents3" minOccurs="0"/>
 *         &lt;element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Purpose2Choice" minOccurs="0"/>
 *         &lt;element name="RltdRmtInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}RemittanceLocation2" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="RmtInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}RemittanceInformation7" minOccurs="0"/>
 *         &lt;element name="RltdDts" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}TransactionDates2" minOccurs="0"/>
 *         &lt;element name="RltdPric" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}TransactionPrice3Choice" minOccurs="0"/>
 *         &lt;element name="RltdQties" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}TransactionQuantities2Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}SecurityIdentification14" minOccurs="0"/>
 *         &lt;element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}TaxInformation3" minOccurs="0"/>
 *         &lt;element name="RtrInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}PaymentReturnReason2" minOccurs="0"/>
 *         &lt;element name="CorpActn" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}CorporateAction9" minOccurs="0"/>
 *         &lt;element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}SecuritiesAccount13" minOccurs="0"/>
 *         &lt;element name="CshDpst" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}CashDeposit1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CardTx" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}CardTransaction1" minOccurs="0"/>
 *         &lt;element name="AddtlTxInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Max500Text" minOccurs="0"/>
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntryTransaction4", propOrder = {
    "refs",
    "amt",
    "cdtDbtInd",
    "amtDtls",
    "avlbty",
    "bkTxCd",
    "chrgs",
    "intrst",
    "rltdPties",
    "rltdAgts",
    "purp",
    "rltdRmtInf",
    "rmtInf",
    "rltdDts",
    "rltdPric",
    "rltdQties",
    "finInstrmId",
    "tax",
    "rtrInf",
    "corpActn",
    "sfkpgAcct",
    "cshDpst",
    "cardTx",
    "addtlTxInf",
    "splmtryData"
})
public class EntryTransaction4 {

    @XmlElement(name = "Refs")
    protected TransactionReferences3 refs;
    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "AmtDtls")
    protected AmountAndCurrencyExchange3 amtDtls;
    @XmlElement(name = "Avlbty")
    protected List<CashBalanceAvailability2> avlbty;
    @XmlElement(name = "BkTxCd")
    protected BankTransactionCodeStructure4 bkTxCd;
    @XmlElement(name = "Chrgs")
    protected Charges4 chrgs;
    @XmlElement(name = "Intrst")
    protected TransactionInterest3 intrst;
    @XmlElement(name = "RltdPties")
    protected TransactionParties3 rltdPties;
    @XmlElement(name = "RltdAgts")
    protected TransactionAgents3 rltdAgts;
    @XmlElement(name = "Purp")
    protected Purpose2Choice purp;
    @XmlElement(name = "RltdRmtInf")
    protected List<RemittanceLocation2> rltdRmtInf;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation7 rmtInf;
    @XmlElement(name = "RltdDts")
    protected TransactionDates2 rltdDts;
    @XmlElement(name = "RltdPric")
    protected TransactionPrice3Choice rltdPric;
    @XmlElement(name = "RltdQties")
    protected List<TransactionQuantities2Choice> rltdQties;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "Tax")
    protected TaxInformation3 tax;
    @XmlElement(name = "RtrInf")
    protected PaymentReturnReason2 rtrInf;
    @XmlElement(name = "CorpActn")
    protected CorporateAction9 corpActn;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount13 sfkpgAcct;
    @XmlElement(name = "CshDpst")
    protected List<CashDeposit1> cshDpst;
    @XmlElement(name = "CardTx")
    protected CardTransaction1 cardTx;
    @XmlElement(name = "AddtlTxInf")
    protected String addtlTxInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtient la valeur de la propri�t� refs.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReferences3 }
     *     
     */
    public TransactionReferences3 getRefs() {
        return refs;
    }

    /**
     * D�finit la valeur de la propri�t� refs.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReferences3 }
     *     
     */
    public void setRefs(TransactionReferences3 value) {
        this.refs = value;
    }

    /**
     * Obtient la valeur de la propri�t� amt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * D�finit la valeur de la propri�t� amt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Obtient la valeur de la propri�t� cdtDbtInd.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * D�finit la valeur de la propri�t� cdtDbtInd.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
    }

    /**
     * Obtient la valeur de la propri�t� amtDtls.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchange3 }
     *     
     */
    public AmountAndCurrencyExchange3 getAmtDtls() {
        return amtDtls;
    }

    /**
     * D�finit la valeur de la propri�t� amtDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchange3 }
     *     
     */
    public void setAmtDtls(AmountAndCurrencyExchange3 value) {
        this.amtDtls = value;
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
     * {@link CashBalanceAvailability2 }
     * 
     * 
     */
    public List<CashBalanceAvailability2> getAvlbty() {
        if (avlbty == null) {
            avlbty = new ArrayList<CashBalanceAvailability2>();
        }
        return this.avlbty;
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
     * Obtient la valeur de la propri�t� chrgs.
     * 
     * @return
     *     possible object is
     *     {@link Charges4 }
     *     
     */
    public Charges4 getChrgs() {
        return chrgs;
    }

    /**
     * D�finit la valeur de la propri�t� chrgs.
     * 
     * @param value
     *     allowed object is
     *     {@link Charges4 }
     *     
     */
    public void setChrgs(Charges4 value) {
        this.chrgs = value;
    }

    /**
     * Obtient la valeur de la propri�t� intrst.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInterest3 }
     *     
     */
    public TransactionInterest3 getIntrst() {
        return intrst;
    }

    /**
     * D�finit la valeur de la propri�t� intrst.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInterest3 }
     *     
     */
    public void setIntrst(TransactionInterest3 value) {
        this.intrst = value;
    }

    /**
     * Obtient la valeur de la propri�t� rltdPties.
     * 
     * @return
     *     possible object is
     *     {@link TransactionParties3 }
     *     
     */
    public TransactionParties3 getRltdPties() {
        return rltdPties;
    }

    /**
     * D�finit la valeur de la propri�t� rltdPties.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionParties3 }
     *     
     */
    public void setRltdPties(TransactionParties3 value) {
        this.rltdPties = value;
    }

    /**
     * Obtient la valeur de la propri�t� rltdAgts.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAgents3 }
     *     
     */
    public TransactionAgents3 getRltdAgts() {
        return rltdAgts;
    }

    /**
     * D�finit la valeur de la propri�t� rltdAgts.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAgents3 }
     *     
     */
    public void setRltdAgts(TransactionAgents3 value) {
        this.rltdAgts = value;
    }

    /**
     * Obtient la valeur de la propri�t� purp.
     * 
     * @return
     *     possible object is
     *     {@link Purpose2Choice }
     *     
     */
    public Purpose2Choice getPurp() {
        return purp;
    }

    /**
     * D�finit la valeur de la propri�t� purp.
     * 
     * @param value
     *     allowed object is
     *     {@link Purpose2Choice }
     *     
     */
    public void setPurp(Purpose2Choice value) {
        this.purp = value;
    }

    /**
     * Gets the value of the rltdRmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdRmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemittanceLocation2 }
     * 
     * 
     */
    public List<RemittanceLocation2> getRltdRmtInf() {
        if (rltdRmtInf == null) {
            rltdRmtInf = new ArrayList<RemittanceLocation2>();
        }
        return this.rltdRmtInf;
    }

    /**
     * Obtient la valeur de la propri�t� rmtInf.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation7 }
     *     
     */
    public RemittanceInformation7 getRmtInf() {
        return rmtInf;
    }

    /**
     * D�finit la valeur de la propri�t� rmtInf.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation7 }
     *     
     */
    public void setRmtInf(RemittanceInformation7 value) {
        this.rmtInf = value;
    }

    /**
     * Obtient la valeur de la propri�t� rltdDts.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDates2 }
     *     
     */
    public TransactionDates2 getRltdDts() {
        return rltdDts;
    }

    /**
     * D�finit la valeur de la propri�t� rltdDts.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDates2 }
     *     
     */
    public void setRltdDts(TransactionDates2 value) {
        this.rltdDts = value;
    }

    /**
     * Obtient la valeur de la propri�t� rltdPric.
     * 
     * @return
     *     possible object is
     *     {@link TransactionPrice3Choice }
     *     
     */
    public TransactionPrice3Choice getRltdPric() {
        return rltdPric;
    }

    /**
     * D�finit la valeur de la propri�t� rltdPric.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionPrice3Choice }
     *     
     */
    public void setRltdPric(TransactionPrice3Choice value) {
        this.rltdPric = value;
    }

    /**
     * Gets the value of the rltdQties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdQties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdQties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionQuantities2Choice }
     * 
     * 
     */
    public List<TransactionQuantities2Choice> getRltdQties() {
        if (rltdQties == null) {
            rltdQties = new ArrayList<TransactionQuantities2Choice>();
        }
        return this.rltdQties;
    }

    /**
     * Obtient la valeur de la propri�t� finInstrmId.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * D�finit la valeur de la propri�t� finInstrmId.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
    }

    /**
     * Obtient la valeur de la propri�t� tax.
     * 
     * @return
     *     possible object is
     *     {@link TaxInformation3 }
     *     
     */
    public TaxInformation3 getTax() {
        return tax;
    }

    /**
     * D�finit la valeur de la propri�t� tax.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInformation3 }
     *     
     */
    public void setTax(TaxInformation3 value) {
        this.tax = value;
    }

    /**
     * Obtient la valeur de la propri�t� rtrInf.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReturnReason2 }
     *     
     */
    public PaymentReturnReason2 getRtrInf() {
        return rtrInf;
    }

    /**
     * D�finit la valeur de la propri�t� rtrInf.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReturnReason2 }
     *     
     */
    public void setRtrInf(PaymentReturnReason2 value) {
        this.rtrInf = value;
    }

    /**
     * Obtient la valeur de la propri�t� corpActn.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction9 }
     *     
     */
    public CorporateAction9 getCorpActn() {
        return corpActn;
    }

    /**
     * D�finit la valeur de la propri�t� corpActn.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction9 }
     *     
     */
    public void setCorpActn(CorporateAction9 value) {
        this.corpActn = value;
    }

    /**
     * Obtient la valeur de la propri�t� sfkpgAcct.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount13 }
     *     
     */
    public SecuritiesAccount13 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * D�finit la valeur de la propri�t� sfkpgAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount13 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount13 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the cshDpst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshDpst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshDpst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashDeposit1 }
     * 
     * 
     */
    public List<CashDeposit1> getCshDpst() {
        if (cshDpst == null) {
            cshDpst = new ArrayList<CashDeposit1>();
        }
        return this.cshDpst;
    }

    /**
     * Obtient la valeur de la propri�t� cardTx.
     * 
     * @return
     *     possible object is
     *     {@link CardTransaction1 }
     *     
     */
    public CardTransaction1 getCardTx() {
        return cardTx;
    }

    /**
     * D�finit la valeur de la propri�t� cardTx.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransaction1 }
     *     
     */
    public void setCardTx(CardTransaction1 value) {
        this.cardTx = value;
    }

    /**
     * Obtient la valeur de la propri�t� addtlTxInf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlTxInf() {
        return addtlTxInf;
    }

    /**
     * D�finit la valeur de la propri�t� addtlTxInf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlTxInf(String value) {
        this.addtlTxInf = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
