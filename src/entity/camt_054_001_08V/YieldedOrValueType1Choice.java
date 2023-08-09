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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour YieldedOrValueType1Choice complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="YieldedOrValueType1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Yldd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}YesNoIndicator"/>
 *         &lt;element name="ValTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}PriceValueType1Code"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YieldedOrValueType1Choice", propOrder = {
    "yldd",
    "valTp"
})
public class YieldedOrValueType1Choice {

    @XmlElement(name = "Yldd")
    protected Boolean yldd;
    @XmlElement(name = "ValTp")
    @XmlSchemaType(name = "string")
    protected PriceValueType1Code valTp;

    /**
     * Obtient la valeur de la propri�t� yldd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYldd() {
        return yldd;
    }

    /**
     * D�finit la valeur de la propri�t� yldd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setYldd(Boolean value) {
        this.yldd = value;
    }

    /**
     * Obtient la valeur de la propri�t� valTp.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueType1Code }
     *     
     */
    public PriceValueType1Code getValTp() {
        return valTp;
    }

    /**
     * D�finit la valeur de la propri�t� valTp.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueType1Code }
     *     
     */
    public void setValTp(PriceValueType1Code value) {
        this.valTp = value;
    }

}
