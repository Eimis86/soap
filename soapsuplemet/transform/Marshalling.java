/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.epetraitis.soapsuplemet.transform;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import lt.viko.eif.epetraitis.suplemetssoap.model.Suplements;

/**
 *
 * @author Eimucio
 */

public class Marshalling {
    private String XML_FILE_LOCATION = "proteinxml.xml";
    public void Marshallingmet(Suplements suplements) throws JAXBException {
        /**
         * A Class class suplement class
         * bind it back to xml data
         */
        
        JAXBContext jaxbContext = JAXBContext.newInstance(Suplements.class);
        
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        /**
         * Formats the content and prints it out to new test file
         */
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        
        File file = new File(XML_FILE_LOCATION);
        jaxbMarshaller.marshal(suplements, file);
        jaxbMarshaller.marshal(suplements, System.out);
    }
}
