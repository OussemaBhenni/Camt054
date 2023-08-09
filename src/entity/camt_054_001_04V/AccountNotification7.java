//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2023.08.09 � 10:46:40 AM WAT 
//


package entity.camt_054_001_04V;

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
 * <p>Classe Java pour AccountNotification7 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AccountNotification7">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Max35Text"/>
 *         &lt;element name="NtfctnPgntn" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Pagination" minOccurs="0"/>
 *         &lt;element name="ElctrncSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Number" minOccurs="0"/>
 *         &lt;element name="LglSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Number" minOccurs="0"/>
 *         &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}ISODateTime"/>
 *         &lt;element name="FrToDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}DateTimePeriodDetails" minOccurs="0"/>
 *         &lt;element name="CpyDplctInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}CopyDuplicate1Code" minOccurs="0"/>
 *         &lt;element name="RptgSrc" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}ReportingSource1Choice" minOccurs="0"/>
 *         &lt;element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}CashAccount25"/>
 *         &lt;element name="RltdAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}CashAccount24" minOccurs="0"/>
 *         &lt;element name="Intrst" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}AccountInterest2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TxsSummry" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}TotalTransactions4" minOccurs="0"/>
 *         &lt;element name="Ntry" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}ReportEntry4" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddtlNtfctnInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Max500Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountNotification7", propOrder = {
    "id",
    "ntfctnPgntn",
    "elctrncSeqNb",
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
public class AccountNotification7 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "NtfctnPgntn")
    protected Pagination ntfctnPgntn;
    @XmlElement(name = "ElctrncSeqNb")
    protected BigDecimal elctrncSeqNb;
    @XmlElement(name = "LglSeqNb")
    protected BigDecimal lglSeqNb;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "FrToDt")
    protected DateTimePeriodDetails frToDt;
    @XmlElement(name = "CpyDplctInd")
    @XmlSchemaType(name = "string")
    protected CopyDuplicate1Code cpyDplctInd;
    @XmlElement(name = "RptgSrc")
    protected ReportingSource1Choice rptgSrc;
    @XmlElement(name = "Acct", required = true)
    protected CashAccount25 acct;
    @XmlElement(name = "RltdAcct")
    protected CashAccount24 rltdAcct;
    @XmlElement(name = "Intrst")
    protected List<AccountInterest2> intrst;
    @XmlElement(name = "TxsSummry")
    protected TotalTransactions4 txsSummry;
    @XmlElement(name = "Ntry")
    protected List<ReportEntry4> ntry;
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
     *     {@link Pagination }
     *     
     */
    public Pagination getNtfctnPgntn() {
        return ntfctnPgntn;
    }

    /**
     * D�finit la valeur de la propri�t� ntfctnPgntn.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public void setNtfctnPgntn(Pagination value) {
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
     *     {@link DateTimePeriodDetails }
     *     
     */
    public DateTimePeriodDetails getFrToDt() {
        return frToDt;
    }

    /**
     * D�finit la valeur de la propri�t� frToDt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetails }
     *     
     */
    public void setFrToDt(DateTimePeriodDetails value) {
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
     *     {@link CashAccount25 }
     *     
     */
    public CashAccount25 getAcct() {
        return acct;
    }

    /**
     * D�finit la valeur de la propri�t� acct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount25 }
     *     
     */
    public void setAcct(CashAccount25 value) {
        this.acct = value;
    }

    /**
     * Obtient la valeur de la propri�t� rltdAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getRltdAcct() {
        return rltdAcct;
    }

    /**
     * D�finit la valeur de la propri�t� rltdAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public void setRltdAcct(CashAccount24 value) {
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
     * {@link AccountInterest2 }
     * 
     * 
     */
    public List<AccountInterest2> getIntrst() {
        if (intrst == null) {
            intrst = new ArrayList<AccountInterest2>();
        }
        return this.intrst;
    }

    /**
     * Obtient la valeur de la propri�t� txsSummry.
     * 
     * @return
     *     possible object is
     *     {@link TotalTransactions4 }
     *     
     */
    public TotalTransactions4 getTxsSummry() {
        return txsSummry;
    }

    /**
     * D�finit la valeur de la propri�t� txsSummry.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTransactions4 }
     *     
     */
    public void setTxsSummry(TotalTransactions4 value) {
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
     * {@link ReportEntry4 }
     * 
     * 
     */
    public List<ReportEntry4> getNtry() {
        if (ntry == null) {
            ntry = new ArrayList<ReportEntry4>();
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
