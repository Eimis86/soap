/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.epetraitis.suplemetssoap.model;

import java.util.List;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *Class responsible for getting, setting and printing values
 * @author Eimantas Petraitis
 * version 1.0
 */
@XmlRootElement
public class Suplements {
    private List<Protiens> protiens;
/**
 * getting list of proteins
 * @return 
 */
    public List<Protiens> getProtiens() {
        return protiens;
    }
/**
 * Setting list of proteins
 * @param protiens 
 */
    public void setProtiens(List<Protiens> protiens) {
        this.protiens = protiens;
    }
/**
 * Printing list of values
 * @return result
 */
    @Override
    public String toString() {
        String result = String.format("Suplements :" + protiens.stream().map(Object::toString).collect(Collectors.joining("\n")));
        return result;
    }
    
}
