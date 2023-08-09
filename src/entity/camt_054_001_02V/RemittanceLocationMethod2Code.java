//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2023.08.09 � 10:44:17 AM WAT 
//


package entity.camt_054_001_02V;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RemittanceLocationMethod2Code.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RemittanceLocationMethod2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FAXI"/>
 *     &lt;enumeration value="EDIC"/>
 *     &lt;enumeration value="URID"/>
 *     &lt;enumeration value="EMAL"/>
 *     &lt;enumeration value="POST"/>
 *     &lt;enumeration value="SMSM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RemittanceLocationMethod2Code")
@XmlEnum
public enum RemittanceLocationMethod2Code {

    FAXI,
    EDIC,
    URID,
    EMAL,
    POST,
    SMSM;

    public String value() {
        return name();
    }

    public static RemittanceLocationMethod2Code fromValue(String v) {
        return valueOf(v);
    }

}
