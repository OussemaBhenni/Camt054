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
 * <p>Classe Java pour Price7 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Price7">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}YieldedOrValueType1Choice"/>
 *         &lt;element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}PriceRateOrAmount3Choice"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price7", propOrder = {
    "tp",
    "val"
})
public class Price7 {

    @XmlElement(name = "Tp", required = true)
    protected YieldedOrValueType1Choice tp;
    @XmlElement(name = "Val", required = true)
    protected PriceRateOrAmount3Choice val;

    /**
     * Obtient la valeur de la propri�t� tp.
     * 
     * @return
     *     possible object is
     *     {@link YieldedOrValueType1Choice }
     *     
     */
    public YieldedOrValueType1Choice getTp() {
        return tp;
    }

    /**
     * D�finit la valeur de la propri�t� tp.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldedOrValueType1Choice }
     *     
     */
    public void setTp(YieldedOrValueType1Choice value) {
        this.tp = value;
    }

    /**
     * Obtient la valeur de la propri�t� val.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmount3Choice }
     *     
     */
    public PriceRateOrAmount3Choice getVal() {
        return val;
    }

    /**
     * D�finit la valeur de la propri�t� val.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmount3Choice }
     *     
     */
    public void setVal(PriceRateOrAmount3Choice value) {
        this.val = value;
    }

}
