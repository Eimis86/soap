/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.epetraitis.soapsuplements;

import java.io.Console;
import java.io.IOException;
import static java.lang.System.console;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import javax.xml.bind.JAXBException;
import lt.viko.eif.epetraitis.soapsuplemet.transform.Marshalling;
import lt.viko.eif.epetraitis.soapsuplemet.transform.Unmarshalling;
import lt.viko.eif.epetraitis.suplemetssoap.model.Category;
import lt.viko.eif.epetraitis.suplemetssoap.model.Product;
import lt.viko.eif.epetraitis.suplemetssoap.model.Protiens;
import lt.viko.eif.epetraitis.suplemetssoap.model.Suplements;

/**
 *
 * @author Eimucio
 */
public class Repository {
  
    /**
     * 
     */
private final static String DEFAULT_XML_PATH = "proteinxml.xml";
private Marshalling marshalling = new Marshalling();
private Unmarshalling unmarshalling = new Unmarshalling();
/**
 * 
 * @return
 * @throws JAXBException
 * @throws IOException 
 */
public Suplements getProtiens() throws JAXBException, IOException{
    String filePath = DEFAULT_XML_PATH;
    Path path = Path.of(filePath);
    
    String xmlContent = Files.readString(path);
    
    Suplements suplements = unmarshalling.Unmarshallingmet(xmlContent);
    return suplements;
}
/**
 * 
 * @param protiens
 * @throws JAXBException
 * @throws IOException 
 */
public void insertProtiens(Product product)throws JAXBException, IOException{
  
    Suplements suplements = getProtiens();
    /**
     * going threw xml objects
     */
    
    List<Protiens> protiens = suplements.getProtiens();
    
    List<Category> categories =  protiens.get(0).getCategory();
    
    List<Product> prodList = categories.get(0).getProduct();
    
    prodList.add(product);
     //List<Protiens> categoryy = suplements.getProtiens();
  
     //marshalling = new Marshalling();
     marshalling.Marshallingmet(suplements);
}

public void deleteProtiens(String itemName) throws JAXBException, IOException{
    Suplements suplements = getProtiens();
    //getting proteins list
    List<Protiens> protiens = suplements.getProtiens();
    List<Category> categories = protiens.get(0).getCategory();
    List<Product> products = categories.get(0).getProduct();
    products.removeIf(p -> p.getProductname().equals(itemName));
    
    //marshalling = new Marshalling();
    marshalling.Marshallingmet(suplements);
}
}
