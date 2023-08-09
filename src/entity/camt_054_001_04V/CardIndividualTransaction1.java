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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour CardIndividualTransaction1 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CardIndividualTransaction1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddtlSvc" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}CardPaymentServiceType2Code" minOccurs="0"/>
 *         &lt;element name="TxCtgy" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}ExternalCardTransactionCategory1Code" minOccurs="0"/>
 *         &lt;element name="SaleRcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Max35Text" minOccurs="0"/>
 *         &lt;element name="SaleRefNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Max35Text" minOccurs="0"/>
 *         &lt;element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Max35Text" minOccurs="0"/>
 *         &lt;element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}TransactionIdentifier1" minOccurs="0"/>
 *         &lt;element name="Pdct" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Product2" minOccurs="0"/>
 *         &lt;element name="VldtnDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}ISODate" minOccurs="0"/>
 *         &lt;element name="VldtnSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardIndividualTransaction1", propOrder = {
    "addtlSvc",
    "txCtgy",
    "saleRcncltnId",
    "saleRefNb",
    "seqNb",
    "txId",
    "pdct",
    "vldtnDt",
    "vldtnSeqNb"
})
public class CardIndividualTransaction1 {

    @XmlElement(name = "AddtlSvc")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType2Code addtlSvc;
    @XmlElement(name = "TxCtgy")
    protected String txCtgy;
    @XmlElement(name = "SaleRcncltnId")
    protected String saleRcncltnId;
    @XmlElement(name = "SaleRefNb")
    protected String saleRefNb;
    @XmlElement(name = "SeqNb")
    protected String seqNb;
    @XmlElement(name = "TxId")
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "Pdct")
    protected Product2 pdct;
    @XmlElement(name = "VldtnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vldtnDt;
    @XmlElement(name = "VldtnSeqNb")
    protected String vldtnSeqNb;

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
     * Obtient la valeur de la propri�t� saleRefNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefNb() {
        return saleRefNb;
    }

    /**
     * D�finit la valeur de la propri�t� saleRefNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRefNb(String value) {
        this.saleRefNb = value;
    }

    /**
     * Obtient la valeur de la propri�t� seqNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNb() {
        return seqNb;
    }

    /**
     * D�finit la valeur de la propri�t� seqNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNb(String value) {
        this.seqNb = value;
    }

    /**
     * Obtient la valeur de la propri�t� txId.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getTxId() {
        return txId;
    }

    /**
     * D�finit la valeur de la propri�t� txId.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public void setTxId(TransactionIdentifier1 value) {
        this.txId = value;
    }

    /**
     * Obtient la valeur de la propri�t� pdct.
     * 
     * @return
     *     possible object is
     *     {@link Product2 }
     *     
     */
    public Product2 getPdct() {
        return pdct;
    }

    /**
     * D�finit la valeur de la propri�t� pdct.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2 }
     *     
     */
    public void setPdct(Product2 value) {
        this.pdct = value;
    }

    /**
     * Obtient la valeur de la propri�t� vldtnDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVldtnDt() {
        return vldtnDt;
    }

    /**
     * D�finit la valeur de la propri�t� vldtnDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVldtnDt(XMLGregorianCalendar value) {
        this.vldtnDt = value;
    }

    /**
     * Obtient la valeur de la propri�t� vldtnSeqNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVldtnSeqNb() {
        return vldtnSeqNb;
    }

    /**
     * D�finit la valeur de la propri�t� vldtnSeqNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVldtnSeqNb(String value) {
        this.vldtnSeqNb = value;
    }

}
