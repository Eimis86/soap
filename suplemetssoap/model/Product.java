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
 *Class responsible for getting, setting and printing values
 * @author Eimantas Petraitis
 * version 1.0
 */
public class Product {
    private List<Protientype> protientype;
    private List<Company> company;
    private String productname;
    private List<Date> date;
    private List<Amount> amount;
/**
 * Getter for list protein type
 * @return protein type 
 */
    @XmlElement(name="protien-type")
    public List<Protientype> getProtientype() {
        return protientype;
    }
/**
 * Setter for list protein type
 * @param protientype 
 */
    public void setProtientype(List<Protientype> protientype) {
        this.protientype = protientype;
    }
/**
 * Getter for list company
 * @return company
 */
    public List<Company> getCompany() {
        return company;
    }
/**
 * Setter for list company
 * @param company 
 */
    public void setCompany(List<Company> company) {
        this.company = company;
    }
    /**
     * Getter for product name
     * @return product name
     */
@XmlElement(name="product-name")
    public String getProductname() {
        return productname;
    }
/**
 * Setter for product name
 * @param productname 
 */
    public void setProductname(String productname) {
        this.productname = productname;
    }
/**
 * Getter for list date
 * @return  date
 */
    public List<Date> getDate() {
        return date;
    }
/**
 * Setter for list date
 * @param date 
 */
    public void setDate(List<Date> date) {
        this.date = date;
    }
/**
 * Getter for list amount
 * @return amount
 */
    public List<Amount> getAmount() {
        return amount;
    }
/**
 * Setter for list amount
 * @param amount 
 */
    public void setAmount(List<Amount> amount) {
        this.amount = amount;
    }
/**
 * Printing result values
 * @return result 
 */
    @Override
    public String toString() {
        String result = String.format("\n\t\t\t Product :"  + protientype.stream().map(Object::toString).collect(Collectors.joining("\n"))
                + company.stream().map(Object::toString).collect(Collectors.joining("\n")) + "\n\t\t\t\t productname : " 
                + productname + date.stream().map(Object::toString).collect(Collectors.joining("\n"))  
                + amount.stream().map(Object::toString).collect(Collectors.joining("\n")) );
        return result;
    }    
}
