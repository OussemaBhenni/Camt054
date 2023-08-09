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
 * <p>Classe Java pour CardSequenceNumberRange1 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CardSequenceNumberRange1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrstTx" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Max35Text" minOccurs="0"/>
 *         &lt;element name="LastTx" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardSequenceNumberRange1", propOrder = {
    "frstTx",
    "lastTx"
})
public class CardSequenceNumberRange1 {

    @XmlElement(name = "FrstTx")
    protected String frstTx;
    @XmlElement(name = "LastTx")
    protected String lastTx;

    /**
     * Obtient la valeur de la propri�t� frstTx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrstTx() {
        return frstTx;
    }

    /**
     * D�finit la valeur de la propri�t� frstTx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrstTx(String value) {
        this.frstTx = value;
    }

    /**
     * Obtient la valeur de la propri�t� lastTx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTx() {
        return lastTx;
    }

    /**
     * D�finit la valeur de la propri�t� lastTx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTx(String value) {
        this.lastTx = value;
    }

}
