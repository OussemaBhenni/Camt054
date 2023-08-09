//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2023.08.09 � 10:46:40 AM WAT 
//


package entity.camt_054_001_04V;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PartyType4Code.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyType4Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MERC"/>
 *     &lt;enumeration value="ACCP"/>
 *     &lt;enumeration value="ITAG"/>
 *     &lt;enumeration value="ACQR"/>
 *     &lt;enumeration value="CISS"/>
 *     &lt;enumeration value="TAXH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PartyType4Code")
@XmlEnum
public enum PartyType4Code {

    MERC,
    ACCP,
    ITAG,
    ACQR,
    CISS,
    TAXH;

    public String value() {
        return name();
    }

    public static PartyType4Code fromValue(String v) {
        return valueOf(v);
    }

}
