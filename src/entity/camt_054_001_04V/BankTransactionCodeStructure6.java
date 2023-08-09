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
 * <p>Classe Java pour BankTransactionCodeStructure6 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BankTransactionCodeStructure6">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}ExternalBankTransactionFamily1Code"/>
 *         &lt;element name="SubFmlyCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}ExternalBankTransactionSubFamily1Code"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankTransactionCodeStructure6", propOrder = {
    "cd",
    "subFmlyCd"
})
public class BankTransactionCodeStructure6 {

    @XmlElement(name = "Cd", required = true)
    protected String cd;
    @XmlElement(name = "SubFmlyCd", required = true)
    protected String subFmlyCd;

    /**
     * Obtient la valeur de la propri�t� cd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd() {
        return cd;
    }

    /**
     * D�finit la valeur de la propri�t� cd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCd(String value) {
        this.cd = value;
    }

    /**
     * Obtient la valeur de la propri�t� subFmlyCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubFmlyCd() {
        return subFmlyCd;
    }

    /**
     * D�finit la valeur de la propri�t� subFmlyCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubFmlyCd(String value) {
        this.subFmlyCd = value;
    }

}
