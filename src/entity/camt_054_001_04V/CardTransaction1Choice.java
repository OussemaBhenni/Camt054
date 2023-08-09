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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CardTransaction1Choice complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CardTransaction1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Aggtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}CardAggregated1"/>
 *         &lt;element name="Indv" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}CardIndividualTransaction1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransaction1Choice", propOrder = {
    "aggtd",
    "indv"
})
public class CardTransaction1Choice {

    @XmlElement(name = "Aggtd")
    protected CardAggregated1 aggtd;
    @XmlElement(name = "Indv")
    protected CardIndividualTransaction1 indv;

    /**
     * Obtient la valeur de la propri�t� aggtd.
     * 
     * @return
     *     possible object is
     *     {@link CardAggregated1 }
     *     
     */
    public CardAggregated1 getAggtd() {
        return aggtd;
    }

    /**
     * D�finit la valeur de la propri�t� aggtd.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAggregated1 }
     *     
     */
    public void setAggtd(CardAggregated1 value) {
        this.aggtd = value;
    }

    /**
     * Obtient la valeur de la propri�t� indv.
     * 
     * @return
     *     possible object is
     *     {@link CardIndividualTransaction1 }
     *     
     */
    public CardIndividualTransaction1 getIndv() {
        return indv;
    }

    /**
     * D�finit la valeur de la propri�t� indv.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIndividualTransaction1 }
     *     
     */
    public void setIndv(CardIndividualTransaction1 value) {
        this.indv = value;
    }

}
