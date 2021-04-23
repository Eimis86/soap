/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.epetraitis.suplemetssoap.model;

import java.util.List;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlElement;

/**
 *Represents category object that has list
 * Responsible for getting and setting
 * @author Eimantas Petraitis
 * version 1.0
 */
public class Category {

    private List<Product> product;
/**
 * Getting list of product
 * @return product 
 */
    public List<Product> getProduct() {
        return product;
    }
/**
 * Setter for list product
 * @param product 
 */
    public void setProduct(List<Product> product) {
        this.product = product;
    }
/**
 * Prints all values
 * @return result
 */
    @Override
    public String toString() {
        String result = String.format("\n\t\t Category : " + product.stream().map(Object::toString).collect(Collectors.joining("\n")));
        return result;
    }

     
    
}
