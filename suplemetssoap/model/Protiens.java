/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.epetraitis.suplemetssoap.model;

import java.util.List;
import java.util.stream.Collectors;

/**
 *Class responsible for getting, setting and printing values
 * @author Eimantas Petraitis
 * version 1.0
 */
public class Protiens {
    private List<Category> category;
/**
 * getter for list category
 * @return 
 */
    public List<Category> getCategory() {
        return category;
    }
/**
 * setter for list category
 * @param category 
 */
    public void setCategory(List<Category> category) {
        this.category = category;
    }
/**
 * Printing values
 * @return result
 */
    @Override
    public String toString() {
        String result = String.format("\n\t Protiens : "
                + category.stream().map(Object::toString).collect(Collectors.joining("\n")));
        return result;
    }
    
}
