//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2023.08.09 � 10:44:17 AM WAT 
//


package entity.camt_054_001_02V;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TaxRecord1 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TaxRecord1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}Max35Text" minOccurs="0"/>
 *         &lt;element name="Ctgy" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}Max35Text" minOccurs="0"/>
 *         &lt;element name="CtgyDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}Max35Text" minOccurs="0"/>
 *         &lt;element name="DbtrSts" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}Max35Text" minOccurs="0"/>
 *         &lt;element name="CertId" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}Max35Text" minOccurs="0"/>
 *         &lt;element name="FrmsCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}Max35Text" minOccurs="0"/>
 *         &lt;element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}TaxPeriod1" minOccurs="0"/>
 *         &lt;element name="TaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}TaxAmount1" minOccurs="0"/>
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}Max140Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRecord1", propOrder = {
    "tp",
    "ctgy",
    "ctgyDtls",
    "dbtrSts",
    "certId",
    "frmsCd",
    "prd",
    "taxAmt",
    "addtlInf"
})
public class TaxRecord1 {

    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Ctgy")
    protected String ctgy;
    @XmlElement(name = "CtgyDtls")
    protected String ctgyDtls;
    @XmlElement(name = "DbtrSts")
    protected String dbtrSts;
    @XmlElement(name = "CertId")
    protected String certId;
    @XmlElement(name = "FrmsCd")
    protected String frmsCd;
    @XmlElement(name = "Prd")
    protected TaxPeriod1 prd;
    @XmlElement(name = "TaxAmt")
    protected TaxAmount1 taxAmt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Obtient la valeur de la propri�t� tp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * D�finit la valeur de la propri�t� tp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Obtient la valeur de la propri�t� ctgy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtgy() {
        return ctgy;
    }

    /**
     * D�finit la valeur de la propri�t� ctgy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtgy(String value) {
        this.ctgy = value;
    }

    /**
     * Obtient la valeur de la propri�t� ctgyDtls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtgyDtls() {
        return ctgyDtls;
    }

    /**
     * D�finit la valeur de la propri�t� ctgyDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtgyDtls(String value) {
        this.ctgyDtls = value;
    }

    /**
     * Obtient la valeur de la propri�t� dbtrSts.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtrSts() {
        return dbtrSts;
    }

    /**
     * D�finit la valeur de la propri�t� dbtrSts.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbtrSts(String value) {
        this.dbtrSts = value;
    }

    /**
     * Obtient la valeur de la propri�t� certId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertId() {
        return certId;
    }

    /**
     * D�finit la valeur de la propri�t� certId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertId(String value) {
        this.certId = value;
    }

    /**
     * Obtient la valeur de la propri�t� frmsCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrmsCd() {
        return frmsCd;
    }

    /**
     * D�finit la valeur de la propri�t� frmsCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrmsCd(String value) {
        this.frmsCd = value;
    }

    /**
     * Obtient la valeur de la propri�t� prd.
     * 
     * @return
     *     possible object is
     *     {@link TaxPeriod1 }
     *     
     */
    public TaxPeriod1 getPrd() {
        return prd;
    }

    /**
     * D�finit la valeur de la propri�t� prd.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPeriod1 }
     *     
     */
    public void setPrd(TaxPeriod1 value) {
        this.prd = value;
    }

    /**
     * Obtient la valeur de la propri�t� taxAmt.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmount1 }
     *     
     */
    public TaxAmount1 getTaxAmt() {
        return taxAmt;
    }

    /**
     * D�finit la valeur de la propri�t� taxAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmount1 }
     *     
     */
    public void setTaxAmt(TaxAmount1 value) {
        this.taxAmt = value;
    }

    /**
     * Obtient la valeur de la propri�t� addtlInf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * D�finit la valeur de la propri�t� addtlInf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
