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
 * <p>Classe Java pour BranchAndFinancialInstitutionIdentification5 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BranchAndFinancialInstitutionIdentification5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinInstnId" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}FinancialInstitutionIdentification8"/>
 *         &lt;element name="BrnchId" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}BranchData2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification5", propOrder = {
    "finInstnId",
    "brnchId"
})
public class BranchAndFinancialInstitutionIdentification5 {

    @XmlElement(name = "FinInstnId", required = true)
    protected FinancialInstitutionIdentification8 finInstnId;
    @XmlElement(name = "BrnchId")
    protected BranchData2 brnchId;

    /**
     * Obtient la valeur de la propri�t� finInstnId.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification8 }
     *     
     */
    public FinancialInstitutionIdentification8 getFinInstnId() {
        return finInstnId;
    }

    /**
     * D�finit la valeur de la propri�t� finInstnId.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification8 }
     *     
     */
    public void setFinInstnId(FinancialInstitutionIdentification8 value) {
        this.finInstnId = value;
    }

    /**
     * Obtient la valeur de la propri�t� brnchId.
     * 
     * @return
     *     possible object is
     *     {@link BranchData2 }
     *     
     */
    public BranchData2 getBrnchId() {
        return brnchId;
    }

    /**
     * D�finit la valeur de la propri�t� brnchId.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData2 }
     *     
     */
    public void setBrnchId(BranchData2 value) {
        this.brnchId = value;
    }

}
