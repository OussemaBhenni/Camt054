//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2023.08.09 � 10:46:40 AM WAT 
//


package entity.camt_054_001_04V;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EntryDetails3 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EntryDetails3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Btch" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}BatchInformation2" minOccurs="0"/>
 *         &lt;element name="TxDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}EntryTransaction4" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntryDetails3", propOrder = {
    "btch",
    "txDtls"
})
public class EntryDetails3 {

    @XmlElement(name = "Btch")
    protected BatchInformation2 btch;
    @XmlElement(name = "TxDtls")
    protected List<EntryTransaction4> txDtls;

    /**
     * Obtient la valeur de la propri�t� btch.
     * 
     * @return
     *     possible object is
     *     {@link BatchInformation2 }
     *     
     */
    public BatchInformation2 getBtch() {
        return btch;
    }

    /**
     * D�finit la valeur de la propri�t� btch.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchInformation2 }
     *     
     */
    public void setBtch(BatchInformation2 value) {
        this.btch = value;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryTransaction4 }
     * 
     * 
     */
    public List<EntryTransaction4> getTxDtls() {
        if (txDtls == null) {
            txDtls = new ArrayList<EntryTransaction4>();
        }
        return this.txDtls;
    }

}
