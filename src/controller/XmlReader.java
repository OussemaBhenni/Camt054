package controller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import DAO.Conection;
import entity.Document;



public class XmlReader {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\obenhenni\\Downloads\\Flux CAMT054 AT6.22.3\\AVI1.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            //Document rootElement = (Document) jaxbUnmarshaller.unmarshal(file);

            // Now you have the data from the XML file in the rootElement object
            //System.out.println("Element 1: " + rootElement.getBkToCstmrDbtCdtNtfctn().getGrpHdr().getMsgId());
            //System.out.println("Element 2: " + rootElement.getBkToCstmrDbtCdtNtfctn().getGrpHdr().getMsgId());

            Conection c = new Conection();
            c.getData();c.getData();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
