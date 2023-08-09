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
 * <p>Classe Java pour CardTransaction17 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CardTransaction17">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Card" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}PaymentCard4" minOccurs="0"/>
 *         &lt;element name="POI" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}PointOfInteraction1" minOccurs="0"/>
 *         &lt;element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CardTransaction3Choice" minOccurs="0"/>
 *         &lt;element name="PrePdAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CashAccount38" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransaction17", propOrder = {
    "card",
    "poi",
    "tx",
    "prePdAcct"
})
public class CardTransaction17 {

    @XmlElement(name = "Card")
    protected PaymentCard4 card;
    @XmlElement(name = "POI")
    protected PointOfInteraction1 poi;
    @XmlElement(name = "Tx")
    protected CardTransaction3Choice tx;
    @XmlElement(name = "PrePdAcct")
    protected CashAccount38 prePdAcct;

    /**
     * Obtient la valeur de la propri�t� card.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard4 }
     *     
     */
    public PaymentCard4 getCard() {
        return card;
    }

    /**
     * D�finit la valeur de la propri�t� card.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard4 }
     *     
     */
    public void setCard(PaymentCard4 value) {
        this.card = value;
    }

    /**
     * Obtient la valeur de la propri�t� poi.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction1 }
     *     
     */
    public PointOfInteraction1 getPOI() {
        return poi;
    }

    /**
     * D�finit la valeur de la propri�t� poi.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction1 }
     *     
     */
    public void setPOI(PointOfInteraction1 value) {
        this.poi = value;
    }

    /**
     * Obtient la valeur de la propri�t� tx.
     * 
     * @return
     *     possible object is
     *     {@link CardTransaction3Choice }
     *     
     */
    public CardTransaction3Choice getTx() {
        return tx;
    }

    /**
     * D�finit la valeur de la propri�t� tx.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransaction3Choice }
     *     
     */
    public void setTx(CardTransaction3Choice value) {
        this.tx = value;
    }

    /**
     * Obtient la valeur de la propri�t� prePdAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getPrePdAcct() {
        return prePdAcct;
    }

    /**
     * D�finit la valeur de la propri�t� prePdAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setPrePdAcct(CashAccount38 value) {
        this.prePdAcct = value;
    }

}
