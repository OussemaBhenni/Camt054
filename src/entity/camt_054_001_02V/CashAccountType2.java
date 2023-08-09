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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CashAccountType2 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CashAccountType2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}CashAccountType4Code"/>
 *           &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}Max35Text"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccountType2", propOrder = {
    "cd",
    "prtry"
})
public class CashAccountType2 {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected CashAccountType4Code cd;
    @XmlElement(name = "Prtry")
    protected String prtry;

    /**
     * Obtient la valeur de la propri�t� cd.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountType4Code }
     *     
     */
    public CashAccountType4Code getCd() {
        return cd;
    }

    /**
     * D�finit la valeur de la propri�t� cd.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountType4Code }
     *     
     */
    public void setCd(CashAccountType4Code value) {
        this.cd = value;
    }

    /**
     * Obtient la valeur de la propri�t� prtry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtry() {
        return prtry;
    }

    /**
     * D�finit la valeur de la propri�t� prtry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtry(String value) {
        this.prtry = value;
    }

}
