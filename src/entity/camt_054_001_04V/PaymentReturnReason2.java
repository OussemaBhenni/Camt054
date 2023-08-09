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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PaymentReturnReason2 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PaymentReturnReason2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrgnlBkTxCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}BankTransactionCodeStructure4" minOccurs="0"/>
 *         &lt;element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}PartyIdentification43" minOccurs="0"/>
 *         &lt;element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}ReturnReason5Choice" minOccurs="0"/>
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Max105Text" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReturnReason2", propOrder = {
    "orgnlBkTxCd",
    "orgtr",
    "rsn",
    "addtlInf"
})
public class PaymentReturnReason2 {

    @XmlElement(name = "OrgnlBkTxCd")
    protected BankTransactionCodeStructure4 orgnlBkTxCd;
    @XmlElement(name = "Orgtr")
    protected PartyIdentification43 orgtr;
    @XmlElement(name = "Rsn")
    protected ReturnReason5Choice rsn;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Obtient la valeur de la propri�t� orgnlBkTxCd.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public BankTransactionCodeStructure4 getOrgnlBkTxCd() {
        return orgnlBkTxCd;
    }

    /**
     * D�finit la valeur de la propri�t� orgnlBkTxCd.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public void setOrgnlBkTxCd(BankTransactionCodeStructure4 value) {
        this.orgnlBkTxCd = value;
    }

    /**
     * Obtient la valeur de la propri�t� orgtr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getOrgtr() {
        return orgtr;
    }

    /**
     * D�finit la valeur de la propri�t� orgtr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setOrgtr(PartyIdentification43 value) {
        this.orgtr = value;
    }

    /**
     * Obtient la valeur de la propri�t� rsn.
     * 
     * @return
     *     possible object is
     *     {@link ReturnReason5Choice }
     *     
     */
    public ReturnReason5Choice getRsn() {
        return rsn;
    }

    /**
     * D�finit la valeur de la propri�t� rsn.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnReason5Choice }
     *     
     */
    public void setRsn(ReturnReason5Choice value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<String>();
        }
        return this.addtlInf;
    }

}
