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
 * <p>Classe Java pour TransactionParties6 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TransactionParties6">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Party40Choice" minOccurs="0"/>
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Party40Choice" minOccurs="0"/>
 *         &lt;element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CashAccount38" minOccurs="0"/>
 *         &lt;element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Party40Choice" minOccurs="0"/>
 *         &lt;element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Party40Choice" minOccurs="0"/>
 *         &lt;element name="CdtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CashAccount38" minOccurs="0"/>
 *         &lt;element name="UltmtCdtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Party40Choice" minOccurs="0"/>
 *         &lt;element name="TradgPty" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Party40Choice" minOccurs="0"/>
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}ProprietaryParty5" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionParties6", propOrder = {
    "initgPty",
    "dbtr",
    "dbtrAcct",
    "ultmtDbtr",
    "cdtr",
    "cdtrAcct",
    "ultmtCdtr",
    "tradgPty",
    "prtry"
})
public class TransactionParties6 {

    @XmlElement(name = "InitgPty")
    protected Party40Choice initgPty;
    @XmlElement(name = "Dbtr")
    protected Party40Choice dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount38 dbtrAcct;
    @XmlElement(name = "UltmtDbtr")
    protected Party40Choice ultmtDbtr;
    @XmlElement(name = "Cdtr")
    protected Party40Choice cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount38 cdtrAcct;
    @XmlElement(name = "UltmtCdtr")
    protected Party40Choice ultmtCdtr;
    @XmlElement(name = "TradgPty")
    protected Party40Choice tradgPty;
    @XmlElement(name = "Prtry")
    protected List<ProprietaryParty5> prtry;

    /**
     * Obtient la valeur de la propri�t� initgPty.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getInitgPty() {
        return initgPty;
    }

    /**
     * D�finit la valeur de la propri�t� initgPty.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setInitgPty(Party40Choice value) {
        this.initgPty = value;
    }

    /**
     * Obtient la valeur de la propri�t� dbtr.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getDbtr() {
        return dbtr;
    }

    /**
     * D�finit la valeur de la propri�t� dbtr.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setDbtr(Party40Choice value) {
        this.dbtr = value;
    }

    /**
     * Obtient la valeur de la propri�t� dbtrAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * D�finit la valeur de la propri�t� dbtrAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setDbtrAcct(CashAccount38 value) {
        this.dbtrAcct = value;
    }

    /**
     * Obtient la valeur de la propri�t� ultmtDbtr.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * D�finit la valeur de la propri�t� ultmtDbtr.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setUltmtDbtr(Party40Choice value) {
        this.ultmtDbtr = value;
    }

    /**
     * Obtient la valeur de la propri�t� cdtr.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getCdtr() {
        return cdtr;
    }

    /**
     * D�finit la valeur de la propri�t� cdtr.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setCdtr(Party40Choice value) {
        this.cdtr = value;
    }

    /**
     * Obtient la valeur de la propri�t� cdtrAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * D�finit la valeur de la propri�t� cdtrAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setCdtrAcct(CashAccount38 value) {
        this.cdtrAcct = value;
    }

    /**
     * Obtient la valeur de la propri�t� ultmtCdtr.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * D�finit la valeur de la propri�t� ultmtCdtr.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setUltmtCdtr(Party40Choice value) {
        this.ultmtCdtr = value;
    }

    /**
     * Obtient la valeur de la propri�t� tradgPty.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getTradgPty() {
        return tradgPty;
    }

    /**
     * D�finit la valeur de la propri�t� tradgPty.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setTradgPty(Party40Choice value) {
        this.tradgPty = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryParty5 }
     * 
     * 
     */
    public List<ProprietaryParty5> getPrtry() {
        if (prtry == null) {
            prtry = new ArrayList<ProprietaryParty5>();
        }
        return this.prtry;
    }

}
