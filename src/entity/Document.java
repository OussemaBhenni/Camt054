

package entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bkToCstmrDbtCdtNtfctn"
})
@XmlRootElement(name = "Document")
public class Document {

    @XmlElement(name = "BkToCstmrDbtCdtNtfctn", required = true)
    protected Document.BkToCstmrDbtCdtNtfctn bkToCstmrDbtCdtNtfctn;

    public Document.BkToCstmrDbtCdtNtfctn getBkToCstmrDbtCdtNtfctn() {
        return bkToCstmrDbtCdtNtfctn;
    }


    public void setBkToCstmrDbtCdtNtfctn(Document.BkToCstmrDbtCdtNtfctn value) {
        this.bkToCstmrDbtCdtNtfctn = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     *
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="GrpHdr">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MsgId" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
     *                   &lt;element name="CreDtTm" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Ntfctn">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CreDtTm" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="Acct">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Id">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Nm" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Svcr">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="FinInstnId">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TxsSummry">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TtlCdtNtries">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="NbOfNtries" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                                       &lt;element name="Sum" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TtlDbtNtries">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="NbOfNtries" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                                       &lt;element name="Sum" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Ntry" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Amt">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                                     &lt;attribute name="Ccy" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="CdtDbtInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Sts" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="BookgDt">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Dt" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="BkTxCd">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Domn">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Fmly">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="SubFmlyCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Prtry">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="NtryDtls">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TxDtls">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Refs" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="EndToEndId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="RltdPties">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Dbtr">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="Nm" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "grpHdr",
        "ntfctn"
    })
    public static class BkToCstmrDbtCdtNtfctn {

        @XmlElement(name = "GrpHdr", required = true)
        protected Document.BkToCstmrDbtCdtNtfctn.GrpHdr grpHdr;
        @XmlElement(name = "Ntfctn", required = true)
        protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn ntfctn;

        /**
         * Obtient la valeur de la propri�t� grpHdr.
         *
         * @return
         *     possible object is
         *     {@link Document.BkToCstmrDbtCdtNtfctn.GrpHdr }
         *
         */
        public Document.BkToCstmrDbtCdtNtfctn.GrpHdr getGrpHdr() {
            return grpHdr;
        }

        /**
         * D�finit la valeur de la propri�t� grpHdr.
         *
         * @param value
         *     allowed object is
         *     {@link Document.BkToCstmrDbtCdtNtfctn.GrpHdr }
         *
         */
        public void setGrpHdr(Document.BkToCstmrDbtCdtNtfctn.GrpHdr value) {
            this.grpHdr = value;
        }

        /**
         * Obtient la valeur de la propri�t� ntfctn.
         *
         * @return
         *     possible object is
         *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn }
         *
         */
        public Document.BkToCstmrDbtCdtNtfctn.Ntfctn getNtfctn() {
            return ntfctn;
        }

        /**
         * D�finit la valeur de la propri�t� ntfctn.
         *
         * @param value
         *     allowed object is
         *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn }
         *
         */
        public void setNtfctn(Document.BkToCstmrDbtCdtNtfctn.Ntfctn value) {
            this.ntfctn = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         *
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="MsgId" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
         *         &lt;element name="CreDtTm" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "msgId",
            "creDtTm"
        })
        public static class GrpHdr {

            @XmlElement(name = "MsgId")
            @XmlSchemaType(name = "unsignedShort")
            protected int msgId;
            @XmlElement(name = "CreDtTm", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar creDtTm;

            /**
             * Obtient la valeur de la propri�t� msgId.
             *
             */
            public int getMsgId() {
                return msgId;
            }

            /**
             * D�finit la valeur de la propri�t� msgId.
             *
             */
            public void setMsgId(int value) {
                this.msgId = value;
            }

            /**
             * Obtient la valeur de la propri�t� creDtTm.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getCreDtTm() {
                return creDtTm;
            }

            /**
             * D�finit la valeur de la propri�t� creDtTm.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setCreDtTm(XMLGregorianCalendar value) {
                this.creDtTm = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         *
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CreDtTm" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="Acct">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Id">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Nm" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Svcr">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="FinInstnId">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TxsSummry">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TtlCdtNtries">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="NbOfNtries" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                             &lt;element name="Sum" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TtlDbtNtries">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="NbOfNtries" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                             &lt;element name="Sum" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Ntry" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Amt">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *                           &lt;attribute name="Ccy" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="CdtDbtInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Sts" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="BookgDt">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Dt" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="BkTxCd">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Domn">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Fmly">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="SubFmlyCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Prtry">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="NtryDtls">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TxDtls">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Refs" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="EndToEndId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="RltdPties">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Dbtr">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="Nm" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "creDtTm",
            "acct",
            "txsSummry",
            "ntry"
        })
        public static class Ntfctn {

            @XmlElement(name = "Id", required = true)
            protected String id;
            @XmlElement(name = "CreDtTm", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar creDtTm;
            @XmlElement(name = "Acct", required = true)
            protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct acct;
            @XmlElement(name = "TxsSummry", required = true)
            protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.TxsSummry txsSummry;
            @XmlElement(name = "Ntry", required = true)
            protected List<Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry> ntry;

            /**
             * Obtient la valeur de la propri�t� id.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getId() {
                return id;
            }

            /**
             * D�finit la valeur de la propri�t� id.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Obtient la valeur de la propri�t� creDtTm.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getCreDtTm() {
                return creDtTm;
            }

            /**
             * D�finit la valeur de la propri�t� creDtTm.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setCreDtTm(XMLGregorianCalendar value) {
                this.creDtTm = value;
            }

            /**
             * Obtient la valeur de la propri�t� acct.
             *
             * @return
             *     possible object is
             *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct }
             *
             */
            public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct getAcct() {
                return acct;
            }

            /**
             * D�finit la valeur de la propri�t� acct.
             *
             * @param value
             *     allowed object is
             *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct }
             *
             */
            public void setAcct(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct value) {
                this.acct = value;
            }

            /**
             * Obtient la valeur de la propri�t� txsSummry.
             *
             * @return
             *     possible object is
             *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.TxsSummry }
             *
             */
            public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.TxsSummry getTxsSummry() {
                return txsSummry;
            }

            /**
             * D�finit la valeur de la propri�t� txsSummry.
             *
             * @param value
             *     allowed object is
             *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.TxsSummry }
             *
             */
            public void setTxsSummry(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.TxsSummry value) {
                this.txsSummry = value;
            }

            /**
             * Gets the value of the ntry property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ntry property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNtry().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry }
             *
             *
             */
            public List<Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry> getNtry() {
                if (ntry == null) {
                    ntry = new ArrayList<>();
                }
                return this.ntry;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             *
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Id">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Nm" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Svcr">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="FinInstnId">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "ccy",
                "nm",
                "svcr"
            })
            public static class Acct {

                @XmlElement(name = "Id", required = true)
                protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct.Id id;
                @XmlElement(name = "Ccy", required = true)
                protected String ccy;
                @XmlElement(name = "Nm", required = true)
                protected String nm;
                @XmlElement(name = "Svcr", required = true)
                protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct.Svcr svcr;

                /**
                 * Obtient la valeur de la propri�t� id.
                 *
                 * @return
                 *     possible object is
                 *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct.Id }
                 *
                 */
                public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct.Id getId() {
                    return id;
                }

                /**
                 * D�finit la valeur de la propri�t� id.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct.Id }
                 *
                 */
                public void setId(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct.Id value) {
                    this.id = value;
                }

                /**
                 * Obtient la valeur de la propri�t� ccy.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCcy() {
                    return ccy;
                }

                /**
                 * D�finit la valeur de la propri�t� ccy.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCcy(String value) {
                    this.ccy = value;
                }

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
                 * Obtient la valeur de la propri�t� svcr.
                 *
                 * @return
                 *     possible object is
                 *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct.Svcr }
                 *
                 */
                public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct.Svcr getSvcr() {
                    return svcr;
                }

                /**
                 * D�finit la valeur de la propri�t� svcr.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct.Svcr }
                 *
                 */
                public void setSvcr(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct.Svcr value) {
                    this.svcr = value;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 *
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "iban"
                })
                public static class Id {

                    @XmlElement(name = "IBAN", required = true)
                    protected String iban;

                    /**
                     * Obtient la valeur de la propri�t� iban.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getIBAN() {
                        return iban;
                    }

                    /**
                     * D�finit la valeur de la propri�t� iban.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setIBAN(String value) {
                        this.iban = value;
                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 *
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="FinInstnId">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "finInstnId"
                })
                public static class Svcr {

                    @XmlElement(name = "FinInstnId", required = true)
                    protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct.Svcr.FinInstnId finInstnId;

                    /**
                     * Obtient la valeur de la propri�t� finInstnId.
                     *
                     * @return
                     *     possible object is
                     *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct.Svcr.FinInstnId }
                     *
                     */
                    public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct.Svcr.FinInstnId getFinInstnId() {
                        return finInstnId;
                    }

                    /**
                     * D�finit la valeur de la propri�t� finInstnId.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct.Svcr.FinInstnId }
                     *
                     */
                    public void setFinInstnId(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Acct.Svcr.FinInstnId value) {
                        this.finInstnId = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     *
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "bic"
                    })
                    public static class FinInstnId {

                        @XmlElement(name = "BIC", required = true)
                        protected String bic;

                        /**
                         * Obtient la valeur de la propri�t� bic.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getBIC() {
                            return bic;
                        }

                        /**
                         * D�finit la valeur de la propri�t� bic.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setBIC(String value) {
                            this.bic = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             *
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Amt">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
             *                 &lt;attribute name="Ccy" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="CdtDbtInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Sts" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="BookgDt">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Dt" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="BkTxCd">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Domn">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Fmly">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="SubFmlyCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Prtry">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="NtryDtls">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TxDtls">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Refs" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="EndToEndId" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="RltdPties">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Dbtr">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="Nm" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "amt",
                "cdtDbtInd",
                "sts",
                "bookgDt",
                "bkTxCd",
                "ntryDtls"
            })
            public static class Ntry {

                @XmlElement(name = "Amt", required = true)
                protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.Amt amt;
                @XmlElement(name = "CdtDbtInd", required = true)
                protected String cdtDbtInd;
                @XmlElement(name = "Sts", required = true)
                protected String sts;
                @XmlElement(name = "BookgDt", required = true)
                protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BookgDt bookgDt;
                @XmlElement(name = "BkTxCd", required = true)
                protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd bkTxCd;
                @XmlElement(name = "NtryDtls", required = true)
                protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls ntryDtls;

                /**
                 * Obtient la valeur de la propri�t� amt.
                 *
                 * @return
                 *     possible object is
                 *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.Amt }
                 *
                 */
                public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.Amt getAmt() {
                    return amt;
                }

                /**
                 * D�finit la valeur de la propri�t� amt.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.Amt }
                 *
                 */
                public void setAmt(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.Amt value) {
                    this.amt = value;
                }

                /**
                 * Obtient la valeur de la propri�t� cdtDbtInd.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCdtDbtInd() {
                    return cdtDbtInd;
                }

                /**
                 * D�finit la valeur de la propri�t� cdtDbtInd.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCdtDbtInd(String value) {
                    this.cdtDbtInd = value;
                }

                /**
                 * Obtient la valeur de la propri�t� sts.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSts() {
                    return sts;
                }

                /**
                 * D�finit la valeur de la propri�t� sts.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSts(String value) {
                    this.sts = value;
                }

                /**
                 * Obtient la valeur de la propri�t� bookgDt.
                 *
                 * @return
                 *     possible object is
                 *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BookgDt }
                 *
                 */
                public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BookgDt getBookgDt() {
                    return bookgDt;
                }

                /**
                 * D�finit la valeur de la propri�t� bookgDt.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BookgDt }
                 *
                 */
                public void setBookgDt(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BookgDt value) {
                    this.bookgDt = value;
                }

                /**
                 * Obtient la valeur de la propri�t� bkTxCd.
                 *
                 * @return
                 *     possible object is
                 *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd }
                 *
                 */
                public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd getBkTxCd() {
                    return bkTxCd;
                }

                /**
                 * D�finit la valeur de la propri�t� bkTxCd.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd }
                 *
                 */
                public void setBkTxCd(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd value) {
                    this.bkTxCd = value;
                }

                /**
                 * Obtient la valeur de la propri�t� ntryDtls.
                 *
                 * @return
                 *     possible object is
                 *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls }
                 *
                 */
                public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls getNtryDtls() {
                    return ntryDtls;
                }

                /**
                 * D�finit la valeur de la propri�t� ntryDtls.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls }
                 *
                 */
                public void setNtryDtls(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls value) {
                    this.ntryDtls = value;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 *
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                 *       &lt;attribute name="Ccy" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Amt {

                    @XmlValue
                    protected BigDecimal value;
                    @XmlAttribute(name = "Ccy", required = true)
                    protected String ccy;

                    /**
                     * Obtient la valeur de la propri�t� value.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getValue() {
                        return value;
                    }

                    /**
                     * D�finit la valeur de la propri�t� value.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setValue(BigDecimal value) {
                        this.value = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� ccy.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getCcy() {
                        return ccy;
                    }

                    /**
                     * D�finit la valeur de la propri�t� ccy.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setCcy(String value) {
                        this.ccy = value;
                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 *
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Domn">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Fmly">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="SubFmlyCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Prtry">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "domn",
                    "prtry"
                })
                public static class BkTxCd {

                    @XmlElement(name = "Domn", required = true)
                    protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd.Domn domn;
                    @XmlElement(name = "Prtry", required = true)
                    protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd.Prtry prtry;

                    /**
                     * Obtient la valeur de la propri�t� domn.
                     *
                     * @return
                     *     possible object is
                     *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd.Domn }
                     *
                     */
                    public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd.Domn getDomn() {
                        return domn;
                    }

                    /**
                     * D�finit la valeur de la propri�t� domn.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd.Domn }
                     *
                     */
                    public void setDomn(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd.Domn value) {
                        this.domn = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� prtry.
                     *
                     * @return
                     *     possible object is
                     *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd.Prtry }
                     *
                     */
                    public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd.Prtry getPrtry() {
                        return prtry;
                    }

                    /**
                     * D�finit la valeur de la propri�t� prtry.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd.Prtry }
                     *
                     */
                    public void setPrtry(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd.Prtry value) {
                        this.prtry = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     *
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Fmly">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="SubFmlyCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "cd",
                        "fmly"
                    })
                    public static class Domn {

                        @XmlElement(name = "Cd", required = true)
                        protected String cd;
                        @XmlElement(name = "Fmly", required = true)
                        protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd.Domn.Fmly fmly;

                        /**
                         * Obtient la valeur de la propri�t� cd.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getCd() {
                            return cd;
                        }

                        /**
                         * D�finit la valeur de la propri�t� cd.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setCd(String value) {
                            this.cd = value;
                        }

                        /**
                         * Obtient la valeur de la propri�t� fmly.
                         *
                         * @return
                         *     possible object is
                         *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd.Domn.Fmly }
                         *
                         */
                        public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd.Domn.Fmly getFmly() {
                            return fmly;
                        }

                        /**
                         * D�finit la valeur de la propri�t� fmly.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd.Domn.Fmly }
                         *
                         */
                        public void setFmly(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.BkTxCd.Domn.Fmly value) {
                            this.fmly = value;
                        }


                        /**
                         * <p>Classe Java pour anonymous complex type.
                         *
                         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                         *
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="Cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="SubFmlyCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         *
                         *
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "cd",
                            "subFmlyCd"
                        })
                        public static class Fmly {

                            @XmlElement(name = "Cd", required = true)
                            protected String cd;
                            @XmlElement(name = "SubFmlyCd", required = true)
                            protected String subFmlyCd;

                            /**
                             * Obtient la valeur de la propri�t� cd.
                             *
                             * @return
                             *     possible object is
                             *     {@link String }
                             *
                             */
                            public String getCd() {
                                return cd;
                            }

                            /**
                             * D�finit la valeur de la propri�t� cd.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *
                             */
                            public void setCd(String value) {
                                this.cd = value;
                            }

                            /**
                             * Obtient la valeur de la propri�t� subFmlyCd.
                             *
                             * @return
                             *     possible object is
                             *     {@link String }
                             *
                             */
                            public String getSubFmlyCd() {
                                return subFmlyCd;
                            }

                            /**
                             * D�finit la valeur de la propri�t� subFmlyCd.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *
                             */
                            public void setSubFmlyCd(String value) {
                                this.subFmlyCd = value;
                            }

                        }

                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     *
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "cd"
                    })
                    public static class Prtry {

                        @XmlElement(name = "Cd", required = true)
                        protected String cd;

                        /**
                         * Obtient la valeur de la propri�t� cd.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getCd() {
                            return cd;
                        }

                        /**
                         * D�finit la valeur de la propri�t� cd.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setCd(String value) {
                            this.cd = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 *
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Dt" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "dt"
                })
                public static class BookgDt {

                    @XmlElement(name = "Dt", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dt;

                    /**
                     * Obtient la valeur de la propri�t� dt.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getDt() {
                        return dt;
                    }

                    /**
                     * D�finit la valeur de la propri�t� dt.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setDt(XMLGregorianCalendar value) {
                        this.dt = value;
                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 *
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="TxDtls">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Refs" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="EndToEndId" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="RltdPties">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Dbtr">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="Nm" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "txDtls"
                })
                public static class NtryDtls {

                    @XmlElement(name = "TxDtls", required = true)
                    protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls txDtls;

                    /**
                     * Obtient la valeur de la propri�t� txDtls.
                     *
                     * @return
                     *     possible object is
                     *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls }
                     *
                     */
                    public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls getTxDtls() {
                        return txDtls;
                    }

                    /**
                     * D�finit la valeur de la propri�t� txDtls.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls }
                     *
                     */
                    public void setTxDtls(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls value) {
                        this.txDtls = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     *
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Refs" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="EndToEndId" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="RltdPties">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Dbtr">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="Nm" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "refs",
                        "rltdPties"
                    })
                    public static class TxDtls {

                        @XmlElement(name = "Refs")
                        protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls.Refs refs;
                        @XmlElement(name = "RltdPties", required = true)
                        protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls.RltdPties rltdPties;

                        /**
                         * Obtient la valeur de la propri�t� refs.
                         *
                         * @return
                         *     possible object is
                         *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls.Refs }
                         *
                         */
                        public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls.Refs getRefs() {
                            return refs;
                        }

                        /**
                         * D�finit la valeur de la propri�t� refs.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls.Refs }
                         *
                         */
                        public void setRefs(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls.Refs value) {
                            this.refs = value;
                        }

                        /**
                         * Obtient la valeur de la propri�t� rltdPties.
                         *
                         * @return
                         *     possible object is
                         *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls.RltdPties }
                         *
                         */
                        public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls.RltdPties getRltdPties() {
                            return rltdPties;
                        }

                        /**
                         * D�finit la valeur de la propri�t� rltdPties.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls.RltdPties }
                         *
                         */
                        public void setRltdPties(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls.RltdPties value) {
                            this.rltdPties = value;
                        }


                        /**
                         * <p>Classe Java pour anonymous complex type.
                         *
                         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                         *
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="EndToEndId" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         *
                         *
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "endToEndId"
                        })
                        public static class Refs {

                            @XmlElement(name = "EndToEndId", required = true)
                            protected String endToEndId;

                            /**
                             * Obtient la valeur de la propri�t� endToEndId.
                             *
                             * @return
                             *     possible object is
                             *     {@link String }
                             *
                             */
                            public String getEndToEndId() {
                                return endToEndId;
                            }

                            /**
                             * D�finit la valeur de la propri�t� endToEndId.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *
                             */
                            public void setEndToEndId(String value) {
                                this.endToEndId = value;
                            }

                        }


                        /**
                         * <p>Classe Java pour anonymous complex type.
                         *
                         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                         *
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="Dbtr">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="Nm" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         *
                         *
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "dbtr"
                        })
                        public static class RltdPties {

                            @XmlElement(name = "Dbtr", required = true)
                            protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls.RltdPties.Dbtr dbtr;

                            /**
                             * Obtient la valeur de la propri�t� dbtr.
                             *
                             * @return
                             *     possible object is
                             *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls.RltdPties.Dbtr }
                             *
                             */
                            public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls.RltdPties.Dbtr getDbtr() {
                                return dbtr;
                            }

                            /**
                             * D�finit la valeur de la propri�t� dbtr.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls.RltdPties.Dbtr }
                             *
                             */
                            public void setDbtr(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry.NtryDtls.TxDtls.RltdPties.Dbtr value) {
                                this.dbtr = value;
                            }


                            /**
                             * <p>Classe Java pour anonymous complex type.
                             *
                             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                             *
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="Nm" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             *
                             *
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "nm"
                            })
                            public static class Dbtr {

                                @XmlElement(name = "Nm", required = true)
                                protected String nm;

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

                            }

                        }

                    }

                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             *
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="TtlCdtNtries">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="NbOfNtries" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *                   &lt;element name="Sum" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TtlDbtNtries">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="NbOfNtries" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *                   &lt;element name="Sum" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "ttlCdtNtries",
                "ttlDbtNtries"
            })
            public static class TxsSummry {

                @XmlElement(name = "TtlCdtNtries", required = true)
                protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.TxsSummry.TtlCdtNtries ttlCdtNtries;
                @XmlElement(name = "TtlDbtNtries", required = true)
                protected Document.BkToCstmrDbtCdtNtfctn.Ntfctn.TxsSummry.TtlDbtNtries ttlDbtNtries;

                /**
                 * Obtient la valeur de la propri�t� ttlCdtNtries.
                 *
                 * @return
                 *     possible object is
                 *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.TxsSummry.TtlCdtNtries }
                 *
                 */
                public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.TxsSummry.TtlCdtNtries getTtlCdtNtries() {
                    return ttlCdtNtries;
                }

                /**
                 * D�finit la valeur de la propri�t� ttlCdtNtries.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.TxsSummry.TtlCdtNtries }
                 *
                 */
                public void setTtlCdtNtries(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.TxsSummry.TtlCdtNtries value) {
                    this.ttlCdtNtries = value;
                }

                /**
                 * Obtient la valeur de la propri�t� ttlDbtNtries.
                 *
                 * @return
                 *     possible object is
                 *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.TxsSummry.TtlDbtNtries }
                 *
                 */
                public Document.BkToCstmrDbtCdtNtfctn.Ntfctn.TxsSummry.TtlDbtNtries getTtlDbtNtries() {
                    return ttlDbtNtries;
                }

                /**
                 * D�finit la valeur de la propri�t� ttlDbtNtries.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Document.BkToCstmrDbtCdtNtfctn.Ntfctn.TxsSummry.TtlDbtNtries }
                 *
                 */
                public void setTtlDbtNtries(Document.BkToCstmrDbtCdtNtfctn.Ntfctn.TxsSummry.TtlDbtNtries value) {
                    this.ttlDbtNtries = value;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 *
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="NbOfNtries" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
                 *         &lt;element name="Sum" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "nbOfNtries",
                    "sum"
                })
                public static class TtlCdtNtries {

                    @XmlElement(name = "NbOfNtries")
                    @XmlSchemaType(name = "unsignedByte")
                    protected short nbOfNtries;
                    @XmlElement(name = "Sum")
                    @XmlSchemaType(name = "unsignedByte")
                    protected short sum;

                    /**
                     * Obtient la valeur de la propri�t� nbOfNtries.
                     *
                     */
                    public short getNbOfNtries() {
                        return nbOfNtries;
                    }

                    /**
                     * D�finit la valeur de la propri�t� nbOfNtries.
                     *
                     */
                    public void setNbOfNtries(short value) {
                        this.nbOfNtries = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� sum.
                     *
                     */
                    public short getSum() {
                        return sum;
                    }

                    /**
                     * D�finit la valeur de la propri�t� sum.
                     *
                     */
                    public void setSum(short value) {
                        this.sum = value;
                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 *
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="NbOfNtries" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
                 *         &lt;element name="Sum" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "nbOfNtries",
                    "sum"
                })
                public static class TtlDbtNtries {

                    @XmlElement(name = "NbOfNtries")
                    @XmlSchemaType(name = "unsignedByte")
                    protected short nbOfNtries;
                    @XmlElement(name = "Sum", required = true)
                    protected BigDecimal sum;

                    /**
                     * Obtient la valeur de la propri�t� nbOfNtries.
                     *
                     */
                    public short getNbOfNtries() {
                        return nbOfNtries;
                    }

                    /**
                     * D�finit la valeur de la propri�t� nbOfNtries.
                     *
                     */
                    public void setNbOfNtries(short value) {
                        this.nbOfNtries = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� sum.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getSum() {
                        return sum;
                    }

                    /**
                     * D�finit la valeur de la propri�t� sum.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setSum(BigDecimal value) {
                        this.sum = value;
                    }

                }

            }

        }

    }

}
