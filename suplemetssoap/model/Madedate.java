/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.epetraitis.suplemetssoap.model;

/**
 *This class responsible for getting and setting and printing values
 * @author Eimsntas Petraitis
 * version 1.0
 */
public class Madedate {
        private String year;
    private String month;
    private String day;
/**
 * Getter for year value
 * @return year 
 */
    public String getYear() {
        return year;
    }
/**
 * Setter for year value
 * @param year 
 */
    public void setYear(String year) {
        this.year = year;
    }
/**
 * Getter for month value
 * @return month
 */
    public String getMonth() {
        return month;
    }
/**
 * Setter for month value
 * @param month 
 */
    public void setMonth(String month) {
        this.month = month;
    }
/**
 * Getter for day value
 * @return day
 */
    public String getDay() {
        return day;
    }
/**
 * Setter for day value
 * @param day 
 */
    public void setDay(String day) {
        this.day = day;
    }
/**
 * Printing values
 * @return result
 */
    @Override
    public String toString() {
        String result = String.format("\n\t\t\t\t\t Madedate : " + "\n\t\t\t\t\t\t year : " + year + "\n\t\t\t\t\t\t month : "
                + month + "\n\t\t\t\t\t\t day : " + day) ;
        return result;
    }
    
}
