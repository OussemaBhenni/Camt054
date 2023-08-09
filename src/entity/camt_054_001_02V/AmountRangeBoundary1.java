//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2023.08.09 � 10:44:17 AM WAT 
//


package entity.camt_054_001_02V;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AmountRangeBoundary1 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AmountRangeBoundary1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BdryAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ImpliedCurrencyAndAmount"/>
 *         &lt;element name="Incl" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}YesNoIndicator"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountRangeBoundary1", propOrder = {
    "bdryAmt",
    "incl"
})
public class AmountRangeBoundary1 {

    @XmlElement(name = "BdryAmt", required = true)
    protected BigDecimal bdryAmt;
    @XmlElement(name = "Incl")
    protected boolean incl;

    /**
     * Obtient la valeur de la propri�t� bdryAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBdryAmt() {
        return bdryAmt;
    }

    /**
     * D�finit la valeur de la propri�t� bdryAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBdryAmt(BigDecimal value) {
        this.bdryAmt = value;
    }

    /**
     * Obtient la valeur de la propri�t� incl.
     * 
     */
    public boolean isIncl() {
        return incl;
    }

    /**
     * D�finit la valeur de la propri�t� incl.
     * 
     */
    public void setIncl(boolean value) {
        this.incl = value;
    }

}
