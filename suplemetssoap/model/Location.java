/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.epetraitis.suplemetssoap.model;

/**
 *This class responsible for getters and setters and printing values;
 * @author Eimantas Petraitis
 * version 1.0
 */
public class Location {
    private String country;
    private String city;
/**
 * Getter for country value;
 * @return country 
 */
    public String getCountry() {
        return country;
    }
/**
 * Setter for country value
 * @param country 
 */
    public void setCountry(String country) {
        this.country = country;
    }
/**
 * Getter for city value
 * @return city
 */
    public String getCity() {
        return city;
    }
/**
 * Setter for city value
 * @param city 
 */
    public void setCity(String city) {
        this.city = city;
    }
/**
 * Printing values
 * @return result
 */
    @Override
    public String toString() {
        String result = String.format("\n\t\t\t\t\t Location : " + "\n\t\t\t\t\t\t country : " + country
                + "\n\t\t\t\t\t\t city : " + city );
        return result;
    }
    
}
