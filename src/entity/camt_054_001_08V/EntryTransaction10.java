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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EntryTransaction10 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EntryTransaction10">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Refs" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}TransactionReferences6" minOccurs="0"/>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CreditDebitCode" minOccurs="0"/>
 *         &lt;element name="AmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}AmountAndCurrencyExchange3" minOccurs="0"/>
 *         &lt;element name="Avlbty" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CashAvailability1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BkTxCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}BankTransactionCodeStructure4" minOccurs="0"/>
 *         &lt;element name="Chrgs" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Charges6" minOccurs="0"/>
 *         &lt;element name="Intrst" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}TransactionInterest4" minOccurs="0"/>
 *         &lt;element name="RltdPties" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}TransactionParties6" minOccurs="0"/>
 *         &lt;element name="RltdAgts" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}TransactionAgents5" minOccurs="0"/>
 *         &lt;element name="LclInstrm" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}LocalInstrument2Choice" minOccurs="0"/>
 *         &lt;element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Purpose2Choice" minOccurs="0"/>
 *         &lt;element name="RltdRmtInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}RemittanceLocation7" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="RmtInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}RemittanceInformation16" minOccurs="0"/>
 *         &lt;element name="RltdDts" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}TransactionDates3" minOccurs="0"/>
 *         &lt;element name="RltdPric" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}TransactionPrice4Choice" minOccurs="0"/>
 *         &lt;element name="RltdQties" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}TransactionQuantities3Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}SecurityIdentification19" minOccurs="0"/>
 *         &lt;element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}TaxInformation8" minOccurs="0"/>
 *         &lt;element name="RtrInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}PaymentReturnReason5" minOccurs="0"/>
 *         &lt;element name="CorpActn" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CorporateAction9" minOccurs="0"/>
 *         &lt;element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}SecuritiesAccount19" minOccurs="0"/>
 *         &lt;element name="CshDpst" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CashDeposit1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CardTx" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CardTransaction17" minOccurs="0"/>
 *         &lt;element name="AddtlTxInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Max500Text" minOccurs="0"/>
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntryTransaction10", propOrder = {
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
    "lclInstrm",
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
public class EntryTransaction10 {

    @XmlElement(name = "Refs")
    protected TransactionReferences6 refs;
    @XmlElement(name = "Amt")
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "AmtDtls")
    protected AmountAndCurrencyExchange3 amtDtls;
    @XmlElement(name = "Avlbty")
    protected List<CashAvailability1> avlbty;
    @XmlElement(name = "BkTxCd")
    protected BankTransactionCodeStructure4 bkTxCd;
    @XmlElement(name = "Chrgs")
    protected Charges6 chrgs;
    @XmlElement(name = "Intrst")
    protected TransactionInterest4 intrst;
    @XmlElement(name = "RltdPties")
    protected TransactionParties6 rltdPties;
    @XmlElement(name = "RltdAgts")
    protected TransactionAgents5 rltdAgts;
    @XmlElement(name = "LclInstrm")
    protected LocalInstrument2Choice lclInstrm;
    @XmlElement(name = "Purp")
    protected Purpose2Choice purp;
    @XmlElement(name = "RltdRmtInf")
    protected List<RemittanceLocation7> rltdRmtInf;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation16 rmtInf;
    @XmlElement(name = "RltdDts")
    protected TransactionDates3 rltdDts;
    @XmlElement(name = "RltdPric")
    protected TransactionPrice4Choice rltdPric;
    @XmlElement(name = "RltdQties")
    protected List<TransactionQuantities3Choice> rltdQties;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "Tax")
    protected TaxInformation8 tax;
    @XmlElement(name = "RtrInf")
    protected PaymentReturnReason5 rtrInf;
    @XmlElement(name = "CorpActn")
    protected CorporateAction9 corpActn;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "CshDpst")
    protected List<CashDeposit1> cshDpst;
    @XmlElement(name = "CardTx")
    protected CardTransaction17 cardTx;
    @XmlElement(name = "AddtlTxInf")
    protected String addtlTxInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtient la valeur de la propri�t� refs.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReferences6 }
     *     
     */
    public TransactionReferences6 getRefs() {
        return refs;
    }

    /**
     * D�finit la valeur de la propri�t� refs.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReferences6 }
     *     
     */
    public void setRefs(TransactionReferences6 value) {
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
     *     {@link Charges6 }
     *     
     */
    public Charges6 getChrgs() {
        return chrgs;
    }

    /**
     * D�finit la valeur de la propri�t� chrgs.
     * 
     * @param value
     *     allowed object is
     *     {@link Charges6 }
     *     
     */
    public void setChrgs(Charges6 value) {
        this.chrgs = value;
    }

    /**
     * Obtient la valeur de la propri�t� intrst.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInterest4 }
     *     
     */
    public TransactionInterest4 getIntrst() {
        return intrst;
    }

    /**
     * D�finit la valeur de la propri�t� intrst.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInterest4 }
     *     
     */
    public void setIntrst(TransactionInterest4 value) {
        this.intrst = value;
    }

    /**
     * Obtient la valeur de la propri�t� rltdPties.
     * 
     * @return
     *     possible object is
     *     {@link TransactionParties6 }
     *     
     */
    public TransactionParties6 getRltdPties() {
        return rltdPties;
    }

    /**
     * D�finit la valeur de la propri�t� rltdPties.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionParties6 }
     *     
     */
    public void setRltdPties(TransactionParties6 value) {
        this.rltdPties = value;
    }

    /**
     * Obtient la valeur de la propri�t� rltdAgts.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAgents5 }
     *     
     */
    public TransactionAgents5 getRltdAgts() {
        return rltdAgts;
    }

    /**
     * D�finit la valeur de la propri�t� rltdAgts.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAgents5 }
     *     
     */
    public void setRltdAgts(TransactionAgents5 value) {
        this.rltdAgts = value;
    }

    /**
     * Obtient la valeur de la propri�t� lclInstrm.
     * 
     * @return
     *     possible object is
     *     {@link LocalInstrument2Choice }
     *     
     */
    public LocalInstrument2Choice getLclInstrm() {
        return lclInstrm;
    }

    /**
     * D�finit la valeur de la propri�t� lclInstrm.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalInstrument2Choice }
     *     
     */
    public void setLclInstrm(LocalInstrument2Choice value) {
        this.lclInstrm = value;
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
     * {@link RemittanceLocation7 }
     * 
     * 
     */
    public List<RemittanceLocation7> getRltdRmtInf() {
        if (rltdRmtInf == null) {
            rltdRmtInf = new ArrayList<RemittanceLocation7>();
        }
        return this.rltdRmtInf;
    }

    /**
     * Obtient la valeur de la propri�t� rmtInf.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation16 }
     *     
     */
    public RemittanceInformation16 getRmtInf() {
        return rmtInf;
    }

    /**
     * D�finit la valeur de la propri�t� rmtInf.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation16 }
     *     
     */
    public void setRmtInf(RemittanceInformation16 value) {
        this.rmtInf = value;
    }

    /**
     * Obtient la valeur de la propri�t� rltdDts.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDates3 }
     *     
     */
    public TransactionDates3 getRltdDts() {
        return rltdDts;
    }

    /**
     * D�finit la valeur de la propri�t� rltdDts.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDates3 }
     *     
     */
    public void setRltdDts(TransactionDates3 value) {
        this.rltdDts = value;
    }

    /**
     * Obtient la valeur de la propri�t� rltdPric.
     * 
     * @return
     *     possible object is
     *     {@link TransactionPrice4Choice }
     *     
     */
    public TransactionPrice4Choice getRltdPric() {
        return rltdPric;
    }

    /**
     * D�finit la valeur de la propri�t� rltdPric.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionPrice4Choice }
     *     
     */
    public void setRltdPric(TransactionPrice4Choice value) {
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
     * {@link TransactionQuantities3Choice }
     * 
     * 
     */
    public List<TransactionQuantities3Choice> getRltdQties() {
        if (rltdQties == null) {
            rltdQties = new ArrayList<TransactionQuantities3Choice>();
        }
        return this.rltdQties;
    }

    /**
     * Obtient la valeur de la propri�t� finInstrmId.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * D�finit la valeur de la propri�t� finInstrmId.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Obtient la valeur de la propri�t� tax.
     * 
     * @return
     *     possible object is
     *     {@link TaxInformation8 }
     *     
     */
    public TaxInformation8 getTax() {
        return tax;
    }

    /**
     * D�finit la valeur de la propri�t� tax.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInformation8 }
     *     
     */
    public void setTax(TaxInformation8 value) {
        this.tax = value;
    }

    /**
     * Obtient la valeur de la propri�t� rtrInf.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReturnReason5 }
     *     
     */
    public PaymentReturnReason5 getRtrInf() {
        return rtrInf;
    }

    /**
     * D�finit la valeur de la propri�t� rtrInf.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReturnReason5 }
     *     
     */
    public void setRtrInf(PaymentReturnReason5 value) {
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
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * D�finit la valeur de la propri�t� sfkpgAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount19 value) {
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
     *     {@link CardTransaction17 }
     *     
     */
    public CardTransaction17 getCardTx() {
        return cardTx;
    }

    /**
     * D�finit la valeur de la propri�t� cardTx.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransaction17 }
     *     
     */
    public void setCardTx(CardTransaction17 value) {
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
