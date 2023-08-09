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
 * <p>Classe Java pour CardDataReading1Code.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CardDataReading1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TAGC"/>
 *     &lt;enumeration value="PHYS"/>
 *     &lt;enumeration value="BRCD"/>
 *     &lt;enumeration value="MGST"/>
 *     &lt;enumeration value="CICC"/>
 *     &lt;enumeration value="DFLE"/>
 *     &lt;enumeration value="CTLS"/>
 *     &lt;enumeration value="ECTL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardDataReading1Code")
@XmlEnum
public enum CardDataReading1Code {

    TAGC,
    PHYS,
    BRCD,
    MGST,
    CICC,
    DFLE,
    CTLS,
    ECTL;

    public String value() {
        return name();
    }

    public static CardDataReading1Code fromValue(String v) {
        return valueOf(v);
    }

}
