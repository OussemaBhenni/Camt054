//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2023.08.09 � 10:48:17 AM WAT 
//


package entity.camt_054_001_08V;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ImpliedCurrencyAmountRange1Choice complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ImpliedCurrencyAmountRange1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="FrAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}AmountRangeBoundary1"/>
 *         &lt;element name="ToAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}AmountRangeBoundary1"/>
 *         &lt;element name="FrToAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}FromToAmountRange1"/>
 *         &lt;element name="EQAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}ImpliedCurrencyAndAmount"/>
 *         &lt;element name="NEQAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}ImpliedCurrencyAndAmount"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpliedCurrencyAmountRange1Choice", propOrder = {
    "frAmt",
    "toAmt",
    "frToAmt",
    "eqAmt",
    "neqAmt"
})
public class ImpliedCurrencyAmountRange1Choice {

    @XmlElement(name = "FrAmt")
    protected AmountRangeBoundary1 frAmt;
    @XmlElement(name = "ToAmt")
    protected AmountRangeBoundary1 toAmt;
    @XmlElement(name = "FrToAmt")
    protected FromToAmountRange1 frToAmt;
    @XmlElement(name = "EQAmt")
    protected BigDecimal eqAmt;
    @XmlElement(name = "NEQAmt")
    protected BigDecimal neqAmt;

    /**
     * Obtient la valeur de la propri�t� frAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountRangeBoundary1 }
     *     
     */
    public AmountRangeBoundary1 getFrAmt() {
        return frAmt;
    }

    /**
     * D�finit la valeur de la propri�t� frAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRangeBoundary1 }
     *     
     */
    public void setFrAmt(AmountRangeBoundary1 value) {
        this.frAmt = value;
    }

    /**
     * Obtient la valeur de la propri�t� toAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountRangeBoundary1 }
     *     
     */
    public AmountRangeBoundary1 getToAmt() {
        return toAmt;
    }

    /**
     * D�finit la valeur de la propri�t� toAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRangeBoundary1 }
     *     
     */
    public void setToAmt(AmountRangeBoundary1 value) {
        this.toAmt = value;
    }

    /**
     * Obtient la valeur de la propri�t� frToAmt.
     * 
     * @return
     *     possible object is
     *     {@link FromToAmountRange1 }
     *     
     */
    public FromToAmountRange1 getFrToAmt() {
        return frToAmt;
    }

    /**
     * D�finit la valeur de la propri�t� frToAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link FromToAmountRange1 }
     *     
     */
    public void setFrToAmt(FromToAmountRange1 value) {
        this.frToAmt = value;
    }

    /**
     * Obtient la valeur de la propri�t� eqAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEQAmt() {
        return eqAmt;
    }

    /**
     * D�finit la valeur de la propri�t� eqAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEQAmt(BigDecimal value) {
        this.eqAmt = value;
    }

    /**
     * Obtient la valeur de la propri�t� neqAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNEQAmt() {
        return neqAmt;
    }

    /**
     * D�finit la valeur de la propri�t� neqAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNEQAmt(BigDecimal value) {
        this.neqAmt = value;
    }

}
