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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour AccountNotification17 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AccountNotification17">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Max35Text"/>
 *         &lt;element name="NtfctnPgntn" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Pagination1" minOccurs="0"/>
 *         &lt;element name="ElctrncSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Number" minOccurs="0"/>
 *         &lt;element name="RptgSeq" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}SequenceRange1Choice" minOccurs="0"/>
 *         &lt;element name="LglSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Number" minOccurs="0"/>
 *         &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}ISODateTime" minOccurs="0"/>
 *         &lt;element name="FrToDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}DateTimePeriod1" minOccurs="0"/>
 *         &lt;element name="CpyDplctInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CopyDuplicate1Code" minOccurs="0"/>
 *         &lt;element name="RptgSrc" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}ReportingSource1Choice" minOccurs="0"/>
 *         &lt;element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CashAccount39"/>
 *         &lt;element name="RltdAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CashAccount38" minOccurs="0"/>
 *         &lt;element name="Intrst" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}AccountInterest4" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TxsSummry" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}TotalTransactions6" minOccurs="0"/>
 *         &lt;element name="Ntry" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}ReportEntry10" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddtlNtfctnInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Max500Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountNotification17", propOrder = {
    "id",
    "ntfctnPgntn",
    "elctrncSeqNb",
    "rptgSeq",
    "lglSeqNb",
    "creDtTm",
    "frToDt",
    "cpyDplctInd",
    "rptgSrc",
    "acct",
    "rltdAcct",
    "intrst",
    "txsSummry",
    "ntry",
    "addtlNtfctnInf"
})
public class AccountNotification17 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "NtfctnPgntn")
    protected Pagination1 ntfctnPgntn;
    @XmlElement(name = "ElctrncSeqNb")
    protected BigDecimal elctrncSeqNb;
    @XmlElement(name = "RptgSeq")
    protected SequenceRange1Choice rptgSeq;
    @XmlElement(name = "LglSeqNb")
    protected BigDecimal lglSeqNb;
    @XmlElement(name = "CreDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "FrToDt")
    protected DateTimePeriod1 frToDt;
    @XmlElement(name = "CpyDplctInd")
    @XmlSchemaType(name = "string")
    protected CopyDuplicate1Code cpyDplctInd;
    @XmlElement(name = "RptgSrc")
    protected ReportingSource1Choice rptgSrc;
    @XmlElement(name = "Acct", required = true)
    protected CashAccount39 acct;
    @XmlElement(name = "RltdAcct")
    protected CashAccount38 rltdAcct;
    @XmlElement(name = "Intrst")
    protected List<AccountInterest4> intrst;
    @XmlElement(name = "TxsSummry")
    protected TotalTransactions6 txsSummry;
    @XmlElement(name = "Ntry")
    protected List<ReportEntry10> ntry;
    @XmlElement(name = "AddtlNtfctnInf")
    protected String addtlNtfctnInf;

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri�t� ntfctnPgntn.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getNtfctnPgntn() {
        return ntfctnPgntn;
    }

    /**
     * D�finit la valeur de la propri�t� ntfctnPgntn.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public void setNtfctnPgntn(Pagination1 value) {
        this.ntfctnPgntn = value;
    }

    /**
     * Obtient la valeur de la propri�t� elctrncSeqNb.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElctrncSeqNb() {
        return elctrncSeqNb;
    }

    /**
     * D�finit la valeur de la propri�t� elctrncSeqNb.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setElctrncSeqNb(BigDecimal value) {
        this.elctrncSeqNb = value;
    }

    /**
     * Obtient la valeur de la propri�t� rptgSeq.
     * 
     * @return
     *     possible object is
     *     {@link SequenceRange1Choice }
     *     
     */
    public SequenceRange1Choice getRptgSeq() {
        return rptgSeq;
    }

    /**
     * D�finit la valeur de la propri�t� rptgSeq.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceRange1Choice }
     *     
     */
    public void setRptgSeq(SequenceRange1Choice value) {
        this.rptgSeq = value;
    }

    /**
     * Obtient la valeur de la propri�t� lglSeqNb.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLglSeqNb() {
        return lglSeqNb;
    }

    /**
     * D�finit la valeur de la propri�t� lglSeqNb.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLglSeqNb(BigDecimal value) {
        this.lglSeqNb = value;
    }

    /**
     * Obtient la valeur de la propri�t� creDtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * D�finit la valeur de la propri�t� creDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    /**
     * Obtient la valeur de la propri�t� frToDt.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getFrToDt() {
        return frToDt;
    }

    /**
     * D�finit la valeur de la propri�t� frToDt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public void setFrToDt(DateTimePeriod1 value) {
        this.frToDt = value;
    }

    /**
     * Obtient la valeur de la propri�t� cpyDplctInd.
     * 
     * @return
     *     possible object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public CopyDuplicate1Code getCpyDplctInd() {
        return cpyDplctInd;
    }

    /**
     * D�finit la valeur de la propri�t� cpyDplctInd.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public void setCpyDplctInd(CopyDuplicate1Code value) {
        this.cpyDplctInd = value;
    }

    /**
     * Obtient la valeur de la propri�t� rptgSrc.
     * 
     * @return
     *     possible object is
     *     {@link ReportingSource1Choice }
     *     
     */
    public ReportingSource1Choice getRptgSrc() {
        return rptgSrc;
    }

    /**
     * D�finit la valeur de la propri�t� rptgSrc.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingSource1Choice }
     *     
     */
    public void setRptgSrc(ReportingSource1Choice value) {
        this.rptgSrc = value;
    }

    /**
     * Obtient la valeur de la propri�t� acct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount39 }
     *     
     */
    public CashAccount39 getAcct() {
        return acct;
    }

    /**
     * D�finit la valeur de la propri�t� acct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount39 }
     *     
     */
    public void setAcct(CashAccount39 value) {
        this.acct = value;
    }

    /**
     * Obtient la valeur de la propri�t� rltdAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getRltdAcct() {
        return rltdAcct;
    }

    /**
     * D�finit la valeur de la propri�t� rltdAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setRltdAcct(CashAccount38 value) {
        this.rltdAcct = value;
    }

    /**
     * Gets the value of the intrst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountInterest4 }
     * 
     * 
     */
    public List<AccountInterest4> getIntrst() {
        if (intrst == null) {
            intrst = new ArrayList<AccountInterest4>();
        }
        return this.intrst;
    }

    /**
     * Obtient la valeur de la propri�t� txsSummry.
     * 
     * @return
     *     possible object is
     *     {@link TotalTransactions6 }
     *     
     */
    public TotalTransactions6 getTxsSummry() {
        return txsSummry;
    }

    /**
     * D�finit la valeur de la propri�t� txsSummry.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTransactions6 }
     *     
     */
    public void setTxsSummry(TotalTransactions6 value) {
        this.txsSummry = value;
    }

    /**
     * Gets the value of the ntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportEntry10 }
     * 
     * 
     */
    public List<ReportEntry10> getNtry() {
        if (ntry == null) {
            ntry = new ArrayList<ReportEntry10>();
        }
        return this.ntry;
    }

    /**
     * Obtient la valeur de la propri�t� addtlNtfctnInf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlNtfctnInf() {
        return addtlNtfctnInf;
    }

    /**
     * D�finit la valeur de la propri�t� addtlNtfctnInf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlNtfctnInf(String value) {
        this.addtlNtfctnInf = value;
    }

}
