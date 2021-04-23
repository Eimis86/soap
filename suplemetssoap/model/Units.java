/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.epetraitis.suplemetssoap.model;

/**
 *Class responsible for getting and setting and printing values
 * @author Eimantas Petraitis
 * version 1.0
 */
public class Units {
    private String kilograms;
    private String oz;
/**
 * Getting value of kilograms
 * @return kilograms 
 */
    public String getKilograms() {
        return kilograms;
    }
/**
 * Setting value of kilograms
 * @param kilograms 
 */
    public void setKilograms(String kilograms) {
        this.kilograms = kilograms;
    }
/**
 * Getting value of oz
 * @return oz 
 */
    public String getOz() {
        return oz;
    }
/**
 * Setting value of oz
 * @param oz 
 */
    public void setOz(String oz) {
        this.oz = oz;
    }
/**
 * Printing values
 * @return result
 */
    @Override
    public String toString() {
        String result = String.format("\n\t\t\t\t\t Units : " + "\n\t\t\t\t\t\t kilograms : " 
                + kilograms + "\n\t\t\t\t\t\t oz : " + oz );
        return result;
        }
    
}
