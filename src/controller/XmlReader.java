package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.eclipse.persistence.jaxb.JAXBContextFactory;

import DAO.GetIban;
import entity.Document;
import entity.Document.BkToCstmrDbtCdtNtfctn.Ntfctn.Ntry;

public class XmlReader {
	public static void main(String[] args) {
		try {
			// Set the system property to use the EclipseLink MOXy implementation
			System.setProperty("javax.xml.bind.context.factory", "org.eclipse.persistence.jaxb.JAXBContextFactory");

			// Path to the folder containing XML files
			String folderPath = "C:\\Users\\obenhenni\\Downloads\\Flux CAMT054 AT6.22.3";

			// Get all XML files in the folder
			File folder = new File(folderPath);
			File[] xmlFiles = folder.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.toLowerCase().endsWith(".xml");
				}
			});
			System.out.println("You have " + xmlFiles.length + " xml File(s)");
			boolean affected = false;

			for (File file : xmlFiles) {
				System.out.println("Processing file: " + file.getName());

				JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

				FileInputStream fis = null;
				InputStreamReader isr = null;
				try {
					fis = new FileInputStream(file);
					isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

					Document document = (Document) jaxbUnmarshaller.unmarshal(isr);

					// Now you have the data from the XML file in the rootElement object
					// System.out.println("MSGID: " +
					// document.getBkToCstmrDbtCdtNtfctn().getGrpHdr().getMsgId());
					System.out.println("NB NTRY: " + document.getBkToCstmrDbtCdtNtfctn().getNtfctn().getNtry().size());
					List<Ntry> listNtry = document.getBkToCstmrDbtCdtNtfctn().getNtfctn().getNtry();

					for (Ntry elem : listNtry) {
						if (elem.getBkTxCd().getDomn().getCd().equals("PMNT")
								&& elem.getBkTxCd().getDomn().getFmly().getCd().equals("RCDT")
								&& elem.getBkTxCd().getDomn().getFmly().getSubFmlyCd().equals("ESCT")) {

							if (elem.getNtryDtls() != null && elem.getNtryDtls().getTxDtls() != null
									&& elem.getNtryDtls().getTxDtls().getRefs() != null
									&& elem.getNtryDtls().getTxDtls().getRefs().getAcctSvcrRef() != null) {
								// System.out.println("TransactionID :
								// "+elem.getNtryDtls().getTxDtls().getRefs().getAcctSvcrRef()+"
								// ==>iban1:"+GetIban.getIbanWithTransactionID(elem.getNtryDtls().getTxDtls().getRefs().getAcctSvcrRef()));
								if (GetIban.getIbanWithTransactionID(
										elem.getNtryDtls().getTxDtls().getRefs().getAcctSvcrRef()) != null) {
									elem.getNtryDtls().getTxDtls().getRltdPties().getDbtr()
											.setIBAN(GetIban.getIbanWithTransactionID(
													elem.getNtryDtls().getTxDtls().getRefs().getAcctSvcrRef()));
									affected = true;
								}

							}

							else if (elem.getNtryDtls() != null && elem.getNtryDtls().getTxDtls() != null
									&& elem.getNtryDtls().getTxDtls().getRefs() != null
									&& elem.getNtryDtls().getTxDtls().getRefs().getEndToEndId() != null) {
								// System.out.println("EndToEndID :
								// "+elem.getNtryDtls().getTxDtls().getRefs().getEndToEndId()+"
								// ==>iban2:"+GetIban.getIbanWithEndToEndID(elem.getNtryDtls().getTxDtls().getRefs().getEndToEndId()));
								if (GetIban.getIbanWithEndToEndID(
										elem.getNtryDtls().getTxDtls().getRefs().getEndToEndId()) != null) {
									elem.getNtryDtls().getTxDtls().getRltdPties().getDbtr()
											.setIBAN(GetIban.getIbanWithEndToEndID(
													elem.getNtryDtls().getTxDtls().getRefs().getEndToEndId()));
									affected = true;
								}

							} else if (elem.getAmt() != null && elem.getAmt().getValue() != null
									&& elem.getAmt().getCcy() != null && elem.getValDt() != null
									&& elem.getValDt().getDt() != null && elem.getNtryDtls() != null
									&& elem.getNtryDtls().getTxDtls() != null
									&& elem.getNtryDtls().getTxDtls().getRltdPties() != null
									&& elem.getNtryDtls().getTxDtls().getRltdPties().getDbtr() != null
									&& elem.getNtryDtls().getTxDtls().getRltdPties().getDbtr().getNm() != null) {

								/*
								 * System.out.println("\n mantant :"+elem.getAmt().getValue()+
								 * "\n curency : "+elem.getAmt().getCcy()+"\n" +
								 * "date :"+elem.getValDt().getDt() +
								 * "Doneur : "+elem.getNtryDtls().getTxDtls().getRltdPties().getDbtr().getNm() +
								 * " iban3:"+GetIban.getIbanWithMontantDeviseDate(elem.getAmt().getValue(),elem.
								 * getAmt().getCcy() , elem.getValDt().getDt(),
								 * elem.getNtryDtls().getTxDtls().getRltdPties().getDbtr().getNm()));
								 */
								if (GetIban.getIbanWithMontantDeviseDate(elem.getAmt().getValue(),
										elem.getAmt().getCcy(), elem.getValDt().getDt(),
										elem.getNtryDtls().getTxDtls().getRltdPties().getDbtr().getNm()) != null) {
									elem.getNtryDtls().getTxDtls().getRltdPties().getDbtr()
											.setIBAN(GetIban.getIbanWithMontantDeviseDate(elem.getAmt().getValue(),
													elem.getAmt().getCcy(), elem.getValDt().getDt(),
													elem.getNtryDtls().getTxDtls().getRltdPties().getDbtr().getNm()));
									affected = true;
								}
							}
						}

					}
					if (affected) {
						affected = false;
						String outputFolderPath = "C:\\Users\\obenhenni\\Documents\\Result\\";

						// Create the output file stream and writer
						FileOutputStream fos = new FileOutputStream(outputFolderPath + file.getName());
						OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

						// Marshal the Document object into the XML file
						Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
						jaxbMarshaller.marshal(document, osw);
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					// Close the input streams in the finally block
					if (isr != null) {
						try {
							isr.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					if (fis != null) {
						try {
							fis.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
