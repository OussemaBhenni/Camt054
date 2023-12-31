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
import entity.camt_054_001_04V.AccountNotification7;
import entity.camt_054_001_04V.EntryDetails3;
import entity.camt_054_001_04V.EntryTransaction4;
import entity.camt_054_001_04V.ReportEntry4;
import entity.camt_054_001_08V.AccountNotification17;
import entity.camt_054_001_08V.EntryDetails9;
import entity.camt_054_001_08V.EntryTransaction10;
import entity.camt_054_001_08V.ReportEntry10;

public class Main {
	public static void main(String[] args) {
		try {
			// Set the system property to use the EclipseLink MOXy implementation
			

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

				JAXBContext jaxbContext = JAXBContext.newInstance(entity.camt_054_001_02V.Document.class);
				JAXBContext jaxbContext4 = JAXBContext.newInstance(entity.camt_054_001_04V.Document.class);
				JAXBContext jaxbContext8 = JAXBContext.newInstance(entity.camt_054_001_08V.Document.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Unmarshaller jaxbUnmarshaller4 = jaxbContext4.createUnmarshaller();
				Unmarshaller jaxbUnmarshaller8 = jaxbContext8.createUnmarshaller();

				FileInputStream fis = null;
				InputStreamReader isr = null;

				try {
					

					Document document = null;

					try {
						fis = new FileInputStream(file);
						isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
						document = (Document) jaxbUnmarshaller.unmarshal(isr);
						//System.out.println(file.getName()+" its  A camt.054.001.02 version ");
						List<AccountNotification2> listNtry = document.getBkToCstmrDbtCdtNtfctn().getNtfctn();
						List<ReportEntry2> allNtry = new ArrayList<ReportEntry2>();
						for (AccountNotification2 elem : listNtry) {
							allNtry.addAll(elem.getNtry());
						}

						for (ReportEntry2 elem : allNtry) {
							if (elem.getBkTxCd().getDomn().getCd().equals("PMNT")
									&& elem.getBkTxCd().getDomn().getFmly().getCd().equals("RCDT")
									&& elem.getBkTxCd().getDomn().getFmly().getSubFmlyCd().equals("ESCT")) {
								// System.out.println("ROV");
								List<EntryTransaction2> allTxDtls = new ArrayList<EntryTransaction2>();
								for (EntryDetails1 e : elem.getNtryDtls()) {
									allTxDtls.addAll(e.getTxDtls());
								}
								for (EntryTransaction2 txD : allTxDtls) {
									//System.out.println("TransactionID :" + txD.getRefs().getAcctSvcrRef() );
									
									if (elem.getNtryDtls() != null && txD != null && txD.getRefs() != null
											&& txD.getRefs().getAcctSvcrRef() != null
											&& GetIban.getIbanWithTransactionID(txD.getRefs().getAcctSvcrRef()) != null) {
										//System.out.println("TransactionID :" + txD.getRefs().getAcctSvcrRef() + "==>iban1:"
										//		+ GetIban.getIbanWithTransactionID(txD.getRefs().getAcctSvcrRef()));

										txD.getRltdPties().getDbtr()
												.setIban(GetIban.getIbanWithTransactionID(txD.getRefs().getAcctSvcrRef()));
										affected = true;

									}

									else if (elem.getNtryDtls() != null && txD != null && txD.getRefs() != null
											&& txD.getRefs().getEndToEndId() != null
											&& GetIban.getIbanWithEndToEndID(txD.getRefs().getEndToEndId()) != null) {
										// System.out.println("EndToEndID
										// :"+elem.getNtryDtls().getTxDtls().getRefs().getEndToEndId()
										// +"==>iban2:"+GetIban.getIbanWithEndToEndID(elem.getNtryDtls().getTxDtls().getRefs().getEndToEndId()));

										txD.getRltdPties().getDbtr()
												.setIban(GetIban.getIbanWithEndToEndID(txD.getRefs().getEndToEndId()));
										affected = true;

									} else if (elem.getAmt() != null && elem.getAmt().getValue() != null
											&& elem.getAmt().getCcy() != null && elem.getValDt() != null
											&& elem.getValDt().getDt() != null && elem.getNtryDtls() != null && txD != null
											&& txD.getRltdPties() != null && txD.getRltdPties().getDbtr() != null
											&& txD.getRltdPties().getDbtr().getNm() != null
											&& GetIban.getIbanWithMontantDeviseDate(elem.getAmt().getValue(),
													elem.getAmt().getCcy(), elem.getValDt().getDt(),
													txD.getRltdPties().getDbtr().getNm()) != null) {

										

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
							String outputFolderPath = "C:\\Users\\obenhenni\\resultat\\";

							// Create the output file stream and writer
							FileOutputStream fos = new FileOutputStream(outputFolderPath + file.getName());
							OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

							// Marshal the Document object into the XML file
							Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
							jaxbMarshaller.marshal(document, osw);
						}
					} catch (Exception e) {
						//isr.reset(); // Reset the input stream
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
					entity.camt_054_001_04V.Document documentV4 = null;
					if (document == null) {
						try {
							fis = new FileInputStream(file);
							isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
							//System.out.println("PreV04");
							
							if (jaxbUnmarshaller4.unmarshal(isr) instanceof entity.camt_054_001_04V.Document) {
								documentV4 = (entity.camt_054_001_04V.Document) jaxbUnmarshaller4.unmarshal(isr);
							    // ... (rest of your processing code for V04)
							
							
							System.out.println(documentV4);
							System.out.println(file.getName()+" its  A camt.054.001.04 version ");
							List<AccountNotification7> listNtry = documentV4.getBkToCstmrDbtCdtNtfctn().getNtfctn();
							List<ReportEntry4> allNtry = new ArrayList<ReportEntry4>();
							for (AccountNotification7 elem : listNtry) {
								allNtry.addAll(elem.getNtry());
							}

							for (ReportEntry4 elem : allNtry) {
								if (elem.getBkTxCd().getDomn().getCd().equals("PMNT")
										&& elem.getBkTxCd().getDomn().getFmly().getCd().equals("RCDT")
										&& elem.getBkTxCd().getDomn().getFmly().getSubFmlyCd().equals("ESCT")) {
									// System.out.println("ROV");
									List<EntryTransaction4> allTxDtls = new ArrayList<EntryTransaction4>();
									for (EntryDetails3 e : elem.getNtryDtls()) {
										allTxDtls.addAll(e.getTxDtls());
									}
									for (EntryTransaction4 txD : allTxDtls) {
										if (elem.getNtryDtls() != null && txD != null && txD.getRefs() != null
												&& txD.getRefs().getAcctSvcrRef() != null
												&& GetIban.getIbanWithTransactionID(txD.getRefs().getAcctSvcrRef()) != null) {
											System.out.println("TransactionID :" + txD.getRefs().getAcctSvcrRef() + "==>iban1:"
													+ GetIban.getIbanWithTransactionID(txD.getRefs().getAcctSvcrRef()));

											txD.getRltdPties().getDbtr()
													.setIBAN(GetIban.getIbanWithTransactionID(txD.getRefs().getAcctSvcrRef()));
											affected = true;

										}

										else if (elem.getNtryDtls() != null && txD != null && txD.getRefs() != null
												&& txD.getRefs().getEndToEndId() != null
												&& GetIban.getIbanWithEndToEndID(txD.getRefs().getEndToEndId()) != null) {
											// System.out.println("EndToEndID
											// :"+elem.getNtryDtls().getTxDtls().getRefs().getEndToEndId()
											// +"==>iban2:"+GetIban.getIbanWithEndToEndID(elem.getNtryDtls().getTxDtls().getRefs().getEndToEndId()));

											txD.getRltdPties().getDbtr()
													.setIBAN(GetIban.getIbanWithEndToEndID(txD.getRefs().getEndToEndId()));
											affected = true;

										} else if (elem.getAmt() != null && elem.getAmt().getValue() != null
												&& elem.getAmt().getCcy() != null && elem.getValDt() != null
												&& elem.getValDt().getDt() != null && elem.getNtryDtls() != null && txD != null
												&& txD.getRltdPties() != null && txD.getRltdPties().getDbtr() != null
												&& txD.getRltdPties().getDbtr().getNm() != null
												&& GetIban.getIbanWithMontantDeviseDate(elem.getAmt().getValue(),
														elem.getAmt().getCcy(), elem.getValDt().getDt(),
														txD.getRltdPties().getDbtr().getNm()) != null) {

											System.out.println("\n mantant :" + elem.getAmt().getValue() + "\n curency : "
													+ elem.getAmt().getCcy() + "\n" + "date :" + elem.getValDt().getDt()
													+ "Doneur : " + txD.getRltdPties().getDbtr().getNm() + " iban3:"
													+ GetIban.getIbanWithMontantDeviseDate(elem.getAmt().getValue(),
															elem.getAmt().getCcy(), elem.getValDt().getDt(),
															txD.getRltdPties().getDbtr().getNm()));

											txD.getRltdPties().getDbtr()
													.setIBAN(GetIban.getIbanWithMontantDeviseDate(elem.getAmt().getValue(),
															elem.getAmt().getCcy(), elem.getValDt().getDt(),
															txD.getRltdPties().getDbtr().getNm()));
											affected = true;

										}

									}

								}

							}
							if (affected) {
								affected = false;
								String outputFolderPath = "C:\\Users\\obenhenni\\resultat\\";

								// Create the output file stream and writer
								FileOutputStream fos = new FileOutputStream(outputFolderPath + file.getName());
								OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

								// Marshal the Document object into the XML file
								Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
								jaxbMarshaller.marshal(document, osw);
							}
							} else {
							    System.out.println(file.getName()+" its not A camt.054.001.04 version ");
							}
						} catch (Exception e) {
							//isr.reset(); // Reset the input stream
							e.printStackTrace();
						}
					}
					entity.camt_054_001_08V.Document documentV8 = null;

					if (documentV4 == null && document == null) {
						try {
							fis = new FileInputStream(file);
							isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
							
							
							if (jaxbUnmarshaller8.unmarshal(isr) instanceof entity.camt_054_001_08V.Document) {
								documentV8 = (entity.camt_054_001_08V.Document) jaxbUnmarshaller8.unmarshal(isr);
							    
							
							
							
							System.out.println(file.getName()+" its  A camt.054.001.08 version ");
							List<AccountNotification17> listNtry = documentV8.getBkToCstmrDbtCdtNtfctn().getNtfctn();
							List<ReportEntry10> allNtry = new ArrayList<ReportEntry10>();
							for (AccountNotification17 elem : listNtry) {
								allNtry.addAll(elem.getNtry());
							}

							for (ReportEntry10 elem : allNtry) {
								if (elem.getBkTxCd().getDomn().getCd().equals("PMNT")
										&& elem.getBkTxCd().getDomn().getFmly().getCd().equals("RCDT")
										&& elem.getBkTxCd().getDomn().getFmly().getSubFmlyCd().equals("ESCT")) {
									// System.out.println("ROV");
									List<EntryTransaction10> allTxDtls = new ArrayList<EntryTransaction10>();
									for (EntryDetails9 e : elem.getNtryDtls()) {
										allTxDtls.addAll(e.getTxDtls());
									}
									for (EntryTransaction10 txD : allTxDtls) {
										if (elem.getNtryDtls() != null && txD != null && txD.getRefs() != null
												&& txD.getRefs().getAcctSvcrRef() != null
												&& GetIban.getIbanWithTransactionID(txD.getRefs().getAcctSvcrRef()) != null) {
											System.out.println("TransactionID :" + txD.getRefs().getAcctSvcrRef() + "==>iban1:"
													+ GetIban.getIbanWithTransactionID(txD.getRefs().getAcctSvcrRef()));

											txD.getRltdPties().getDbtr()
													.setIBAN(GetIban.getIbanWithTransactionID(txD.getRefs().getAcctSvcrRef()));
											affected = true;

										}

										else if (elem.getNtryDtls() != null && txD != null && txD.getRefs() != null
												&& txD.getRefs().getEndToEndId() != null
												&& GetIban.getIbanWithEndToEndID(txD.getRefs().getEndToEndId()) != null) {
											// System.out.println("EndToEndID
											// :"+elem.getNtryDtls().getTxDtls().getRefs().getEndToEndId()
											// +"==>iban2:"+GetIban.getIbanWithEndToEndID(elem.getNtryDtls().getTxDtls().getRefs().getEndToEndId()));

											txD.getRltdPties().getDbtr()
													.setIBAN(GetIban.getIbanWithEndToEndID(txD.getRefs().getEndToEndId()));
											affected = true;

										} else if (elem.getAmt() != null && elem.getAmt().getValue() != null
												&& elem.getAmt().getCcy() != null && elem.getValDt() != null
												&& elem.getValDt().getDt() != null && elem.getNtryDtls() != null && txD != null
												&& txD.getRltdPties() != null && txD.getRltdPties().getDbtr() != null
												&& txD.getRltdPties().getDbtr().getPty().getNm() != null
												&& GetIban.getIbanWithMontantDeviseDate(elem.getAmt().getValue(),
														elem.getAmt().getCcy(), elem.getValDt().getDt(),
														txD.getRltdPties().getDbtr().getPty().getNm()) != null) {

											System.out.println("\n mantant :" + elem.getAmt().getValue() + "\n curency : "
													+ elem.getAmt().getCcy() + "\n" + "date :" + elem.getValDt().getDt()
													+ "Doneur : " + txD.getRltdPties().getDbtr().getPty().getNm() + " iban3:"
													+ GetIban.getIbanWithMontantDeviseDate(elem.getAmt().getValue(),
															elem.getAmt().getCcy(), elem.getValDt().getDt(),
															txD.getRltdPties().getDbtr().getPty().getNm()));

											txD.getRltdPties().getDbtr()
													.setIBAN(GetIban.getIbanWithMontantDeviseDate(elem.getAmt().getValue(),
															elem.getAmt().getCcy(), elem.getValDt().getDt(),
															txD.getRltdPties().getDbtr().getPty().getNm()));
											affected = true;

										}

									}

								}

							}
							if (affected) {
								affected = false;
								String outputFolderPath = "C:\\Users\\obenhenni\\resultat\\";

								// Create the output file stream and writer
								FileOutputStream fos = new FileOutputStream(outputFolderPath + file.getName());
								OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

								// Marshal the Document object into the XML file
								Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
								jaxbMarshaller.marshal(document, osw);
							}
							} else {
							    System.out.println(file.getName()+" its not A camt.054.001.04 version ");
							}
						} catch (Exception e) {
							//isr.reset(); // Reset the input stream
							e.printStackTrace();
						}
					}

					// System.out.println(document);

					// Now you have the data from the XML file in the rootElement object
					// System.out.println("MSGID: " +
					// document.getBkToCstmrDbtCdtNtfctn().getGrpHdr().getMsgId());
					// System.out.println("NB NTRY: " +
					// document.getBkToCstmrDbtCdtNtfctn().getNtfctn().getNtry().size());
					

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
