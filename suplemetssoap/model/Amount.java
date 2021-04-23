/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.epetraitis.suplemetssoap.model;

import java.util.List;
import java.util.stream.Collectors;

/**
 *Models object that has model property
 * Getting and setting objects
 * @author Eimuantas Petraitis
 * @version 1.0
 */
public class Amount {
    private int number;
private List<Units> units;
/**
 * Getter for object
 * @return 
 */
    public int getNumber() {
        return number;
    }
/**
 * Setter for number object
 * @param number 
 */
    public void setNumber(int number) {
        this.number = number;
    }
/**
 * Getter for list object
 * @return units 
 */
    public List<Units> getUnits() {
        return units;
    }
/**
 * Setter for list number object
 * @param units 
 */
    public void setUnits(List<Units> units) {
        this.units = units;
    }
/**
 * Prints all values in console
 * @return result
 */
    @Override
    public String toString() {
        String result;
        return result = String.format("\n\t\t\t\t Amount : " + "\n\t\t\t\t\t number : " + number 
                + units.stream().map(Object::toString).collect(Collectors.joining("\n")));
    }


    
}
