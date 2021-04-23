/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.epetraitis.suplemetssoap.model;

/**
 *This class responsible for getting and setting and printing values
 * @author Eimantas Petraitis
 * version 1.0
 */
public class Protientype {
    private String name;
    private String type;
/**
 * Getter for name
 * @return name 
 */
    public String getName() {
        return name;
    }
/**
 * Setter for name
 * @param name 
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * Getter for type
 * @return type
 */
    public String getType() {
        return type;
    }
/**
 * Setter for type
 * @param type 
 */
    public void setType(String type) {
        this.type = type;
    }
/**
 * Printing result
 * @return result
 */
    @Override
    public String toString() {
        String result = String.format("\n\t\t\t\t Protientype : " + "\n\t\t\t\t\t name : " + name 
                + "\n\t\t\t\t\t type : " + type );
        return result;
    }
    
}
