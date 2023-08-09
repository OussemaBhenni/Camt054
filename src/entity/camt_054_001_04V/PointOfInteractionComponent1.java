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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PointOfInteractionComponent1 complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PointOfInteractionComponent1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POICmpntTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}POIComponentType1Code"/>
 *         &lt;element name="ManfctrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Max35Text" minOccurs="0"/>
 *         &lt;element name="Mdl" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Max35Text" minOccurs="0"/>
 *         &lt;element name="VrsnNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Max16Text" minOccurs="0"/>
 *         &lt;element name="SrlNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Max35Text" minOccurs="0"/>
 *         &lt;element name="ApprvlNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.04}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponent1", propOrder = {
    "poiCmpntTp",
    "manfctrId",
    "mdl",
    "vrsnNb",
    "srlNb",
    "apprvlNb"
})
public class PointOfInteractionComponent1 {

    @XmlElement(name = "POICmpntTp", required = true)
    @XmlSchemaType(name = "string")
    protected POIComponentType1Code poiCmpntTp;
    @XmlElement(name = "ManfctrId")
    protected String manfctrId;
    @XmlElement(name = "Mdl")
    protected String mdl;
    @XmlElement(name = "VrsnNb")
    protected String vrsnNb;
    @XmlElement(name = "SrlNb")
    protected String srlNb;
    @XmlElement(name = "ApprvlNb")
    protected List<String> apprvlNb;

    /**
     * Obtient la valeur de la propri�t� poiCmpntTp.
     * 
     * @return
     *     possible object is
     *     {@link POIComponentType1Code }
     *     
     */
    public POIComponentType1Code getPOICmpntTp() {
        return poiCmpntTp;
    }

    /**
     * D�finit la valeur de la propri�t� poiCmpntTp.
     * 
     * @param value
     *     allowed object is
     *     {@link POIComponentType1Code }
     *     
     */
    public void setPOICmpntTp(POIComponentType1Code value) {
        this.poiCmpntTp = value;
    }

    /**
     * Obtient la valeur de la propri�t� manfctrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManfctrId() {
        return manfctrId;
    }

    /**
     * D�finit la valeur de la propri�t� manfctrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManfctrId(String value) {
        this.manfctrId = value;
    }

    /**
     * Obtient la valeur de la propri�t� mdl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdl() {
        return mdl;
    }

    /**
     * D�finit la valeur de la propri�t� mdl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdl(String value) {
        this.mdl = value;
    }

    /**
     * Obtient la valeur de la propri�t� vrsnNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsnNb() {
        return vrsnNb;
    }

    /**
     * D�finit la valeur de la propri�t� vrsnNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsnNb(String value) {
        this.vrsnNb = value;
    }

    /**
     * Obtient la valeur de la propri�t� srlNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrlNb() {
        return srlNb;
    }

    /**
     * D�finit la valeur de la propri�t� srlNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrlNb(String value) {
        this.srlNb = value;
    }

    /**
     * Gets the value of the apprvlNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apprvlNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprvlNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApprvlNb() {
        if (apprvlNb == null) {
            apprvlNb = new ArrayList<String>();
        }
        return this.apprvlNb;
    }

}
