//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2023.08.09 � 10:48:17 AM WAT 
//


package entity.camt_054_001_08V;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CardPaymentServiceType2Code.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CardPaymentServiceType2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AGGR"/>
 *     &lt;enumeration value="DCCV"/>
 *     &lt;enumeration value="GRTT"/>
 *     &lt;enumeration value="INSP"/>
 *     &lt;enumeration value="LOYT"/>
 *     &lt;enumeration value="NRES"/>
 *     &lt;enumeration value="PUCO"/>
 *     &lt;enumeration value="RECP"/>
 *     &lt;enumeration value="SOAF"/>
 *     &lt;enumeration value="UNAF"/>
 *     &lt;enumeration value="VCAU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType2Code")
@XmlEnum
public enum CardPaymentServiceType2Code {

    AGGR,
    DCCV,
    GRTT,
    INSP,
    LOYT,
    NRES,
    PUCO,
    RECP,
    SOAF,
    UNAF,
    VCAU;

    public String value() {
        return name();
    }

    public static CardPaymentServiceType2Code fromValue(String v) {
        return valueOf(v);
    }

}
