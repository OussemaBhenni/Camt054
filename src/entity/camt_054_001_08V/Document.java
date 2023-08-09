//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2023.08.09 � 10:48:17 AM WAT 
//


package entity.camt_054_001_08V;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Document complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BkToCstmrDbtCdtNtfctn" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}BankToCustomerDebitCreditNotificationV08"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "bkToCstmrDbtCdtNtfctn"
})
public class Document {

    @XmlElement(name = "BkToCstmrDbtCdtNtfctn", required = true)
    protected BankToCustomerDebitCreditNotificationV08 bkToCstmrDbtCdtNtfctn;

    /**
     * Obtient la valeur de la propri�t� bkToCstmrDbtCdtNtfctn.
     * 
     * @return
     *     possible object is
     *     {@link BankToCustomerDebitCreditNotificationV08 }
     *     
     */
    public BankToCustomerDebitCreditNotificationV08 getBkToCstmrDbtCdtNtfctn() {
        return bkToCstmrDbtCdtNtfctn;
    }

    /**
     * D�finit la valeur de la propri�t� bkToCstmrDbtCdtNtfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link BankToCustomerDebitCreditNotificationV08 }
     *     
     */
    public void setBkToCstmrDbtCdtNtfctn(BankToCustomerDebitCreditNotificationV08 value) {
        this.bkToCstmrDbtCdtNtfctn = value;
    }

}
