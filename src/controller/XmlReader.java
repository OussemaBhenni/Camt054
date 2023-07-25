package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.eclipse.persistence.jaxb.JAXBContextFactory;
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
            System.out.println("You have "+xmlFiles.length+" xml File(s)");

            for (File file : xmlFiles) {
			    System.out.println("Processing file: " + file.getName());

			    JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);
			    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			    FileInputStream fis = null;
			    InputStreamReader isr = null;
			    try {
			        fis = new FileInputStream(file);
			        isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

			        Document rootElement = (Document) jaxbUnmarshaller.unmarshal(isr);

			        // Now you have the data from the XML file in the rootElement object
			        System.out.println("MSGID: " + rootElement.getBkToCstmrDbtCdtNtfctn().getGrpHdr().getMsgId());
			        System.out.println("Element 2: " + rootElement.getBkToCstmrDbtCdtNtfctn().getGrpHdr().getCreDtTm().getYear());
			        System.out.println("NB NTRY: " + rootElement.getBkToCstmrDbtCdtNtfctn().getNtfctn().getNtry().size());
			        int nbNtry = rootElement.getBkToCstmrDbtCdtNtfctn().getNtfctn().getNtry().size();
			        List listNtry = rootElement.getBkToCstmrDbtCdtNtfctn().getNtfctn().getNtry();
			        for(int i=0;i<nbNtry;i++) {
			        	Object n = listNtry.get(i);
			        	System.out.println();
			        	
			        }

			        // You can add more processing or saving logic here for each file
			    } catch (Exception  e) {
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
