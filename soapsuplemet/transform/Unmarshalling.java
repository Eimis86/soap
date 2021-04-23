/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.epetraitis.soapsuplemet.transform;

import java.io.IOException;
import java.io.StringReader;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import lt.viko.eif.epetraitis.suplemetssoap.model.Suplements;
/**
 *
 * @author Eimucio
 */
public class Unmarshalling {
    public Suplements Unmarshallingmet(String suplement)throws JAXBException, IOException{
        /**
         * creates jacxb that deserialize suplements class data
         */
        JAXBContext jaxbContext = JAXBContext.newInstance(Suplements.class);
        /**
         * creates unmarshaller
         */
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        /**
         * reads the content in suplements
         */
        StringReader reader = new StringReader(suplement);
        Suplements suplements = (Suplements) unmarshaller.unmarshal(reader);
        System.out.println(suplements);
        return suplements;
    }
}
