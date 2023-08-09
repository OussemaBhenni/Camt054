package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import DAO.GetIban;
import entity.camt_054_001_02V.AccountNotification2;
import entity.camt_054_001_02V.Document;
import entity.camt_054_001_02V.EntryDetails1;
import entity.camt_054_001_02V.EntryTransaction2;
import entity.camt_054_001_02V.ReportEntry2;


public class Main {
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
					System.out.println(jaxbUnmarshaller.unmarshal(isr));
					Document document = (Document) jaxbUnmarshaller.unmarshal(isr);
/*
					// Now you have the data from the XML file in the rootElement object
					// System.out.println("MSGID: " +
					// document.getBkToCstmrDbtCdtNtfctn().getGrpHdr().getMsgId());
					//System.out.println("NB NTRY: " + document.getBkToCstmrDbtCdtNtfctn().getNtfctn().getNtry().size());
					List<AccountNotification2> listNtry = document.getBkToCstmrDbtCdtNtfctn().getNtfctn();
					List<ReportEntry2> allNtry =new ArrayList<ReportEntry2>();
					for(AccountNotification2 elem : listNtry) {
						allNtry.addAll(elem.getNtry());
					}

					for (ReportEntry2 elem : allNtry) {
						if (elem.getBkTxCd().getDomn().getCd().equals("PMNT")
								&& elem.getBkTxCd().getDomn().getFmly().getCd().equals("RCDT")
								&& elem.getBkTxCd().getDomn().getFmly().getSubFmlyCd().equals("ESCT")) {
							//System.out.println("ROV");
							List<EntryTransaction2> allTxDtls =new ArrayList <EntryTransaction2>();
							for(EntryDetails1 e : elem.getNtryDtls()) {
								allTxDtls.addAll(e.getTxDtls());
							}
							for(EntryTransaction2 txD :allTxDtls) {
								if (elem.getNtryDtls() != null && txD != null
												&& txD.getRefs() != null
										&& txD.getRefs().getAcctSvcrRef() != null
										&& GetIban.getIbanWithTransactionID(
												txD.getRefs().getAcctSvcrRef()) != null){
									System.out.println("TransactionID :"+txD.getRefs().getAcctSvcrRef()
											+"==>iban1:"+GetIban.getIbanWithTransactionID(txD.getRefs().getAcctSvcrRef()));
									
									txD.getRltdPties().getDbtr()
												.setIban(GetIban.getIbanWithTransactionID(
														txD.getRefs().getAcctSvcrRef()));
										affected = true;
									

								}

								else if (elem.getNtryDtls() != null && txD != null
										&& txD.getRefs() != null
										&& txD.getRefs().getEndToEndId() != null
										&& GetIban.getIbanWithEndToEndID(txD.getRefs().getEndToEndId()) != null ) {
									//System.out.println("EndToEndID :"+elem.getNtryDtls().getTxDtls().getRefs().getEndToEndId()
									//		+"==>iban2:"+GetIban.getIbanWithEndToEndID(elem.getNtryDtls().getTxDtls().getRefs().getEndToEndId()));
									
									txD.getRltdPties().getDbtr()
												.setIban(GetIban.getIbanWithEndToEndID(
														txD.getRefs().getEndToEndId()));
										affected = true;
									

								} else if (elem.getAmt() != null && elem.getAmt().getValue() != null
										&& elem.getAmt().getCcy() != null && elem.getValDt() != null
										&& elem.getValDt().getDt() != null && elem.getNtryDtls() != null
										&& txD != null
										&& txD.getRltdPties() != null
										&& txD.getRltdPties().getDbtr() != null
										&& txD.getRltdPties().getDbtr().getNm() != null
										&&		GetIban.getIbanWithMontantDeviseDate(elem.getAmt().getValue(),
														elem.getAmt().getCcy(), elem.getValDt().getDt(),
														txD.getRltdPties().getDbtr().getNm()) != null ){

									
									 System.out.println("\n mantant :"+elem.getAmt().getValue()+
									 "\n curency : "+elem.getAmt().getCcy()+"\n" +
									 "date :"+elem.getValDt().getDt() +
									 "Doneur : "+txD.getRltdPties().getDbtr().getNm() +
									 " iban3:"+GetIban.getIbanWithMontantDeviseDate(elem.getAmt().getValue(),elem.
									 getAmt().getCcy() , elem.getValDt().getDt(),
									 txD.getRltdPties().getDbtr().getNm()));
									 
								
									 txD.getRltdPties().getDbtr()
												.setIban(GetIban.getIbanWithMontantDeviseDate(elem.getAmt().getValue(),
														elem.getAmt().getCcy(), elem.getValDt().getDt(),
														txD.getRltdPties().getDbtr().getNm()));
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
*/
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
		System.out.println("Done");
	}
}
