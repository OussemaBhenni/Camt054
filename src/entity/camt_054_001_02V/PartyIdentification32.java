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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PartyIdentification32 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentification32">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}Max140Text" minOccurs="0"/>
 *         &lt;element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}PostalAddress6" minOccurs="0"/>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}Party6Choice" minOccurs="0"/>
 *         &lt;element name="CtryOfRes" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}CountryCode" minOccurs="0"/>
 *         &lt;element name="CtctDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ContactDetails2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification32", propOrder = {
    "nm",
    "pstlAdr",
    "id",
    "ctryOfRes",
    "ctctDtls",
    "IBAN"
})
public class PartyIdentification32 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "IBAN")
    protected String IBAN;
    @XmlElement(name = "PstlAdr")
    protected PostalAddress6 pstlAdr;
    @XmlElement(name = "Id")
    protected Party6Choice id;
    @XmlElement(name = "CtryOfRes")
    protected String ctryOfRes;
    @XmlElement(name = "CtctDtls")
    protected ContactDetails2 ctctDtls;

    /**
     * Obtient la valeur de la propri�t� nm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }
    

    public String getIban() {
		return IBAN;
	}


	public void setIban(String iban) {
		this.IBAN = iban;
	}


	/**
     * D�finit la valeur de la propri�t� nm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Obtient la valeur de la propri�t� pstlAdr.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress6 }
     *     
     */
    public PostalAddress6 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * D�finit la valeur de la propri�t� pstlAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress6 }
     *     
     */
    public void setPstlAdr(PostalAddress6 value) {
        this.pstlAdr = value;
    }

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     * @return
     *     possible object is
     *     {@link Party6Choice }
     *     
     */
    public Party6Choice getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     * @param value
     *     allowed object is
     *     {@link Party6Choice }
     *     
     */
    public void setId(Party6Choice value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri�t� ctryOfRes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfRes() {
        return ctryOfRes;
    }

    /**
     * D�finit la valeur de la propri�t� ctryOfRes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfRes(String value) {
        this.ctryOfRes = value;
    }

    /**
     * Obtient la valeur de la propri�t� ctctDtls.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails2 }
     *     
     */
    public ContactDetails2 getCtctDtls() {
        return ctctDtls;
    }

    /**
     * D�finit la valeur de la propri�t� ctctDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails2 }
     *     
     */
    public void setCtctDtls(ContactDetails2 value) {
        this.ctctDtls = value;
    }

}
