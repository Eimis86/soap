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
 *Represent model and list of objects 
 * Responsible for getting ,setting and printing values
 * @author Eimantas Petraitis
 * version 1.0
 */
public class Company {
    private String companyname;
    private List<Location> location;

    /**
     * Getter for company name value
     * @return company name
     */
    @XmlElement(name="company-name")
    public String getCompanyname() {
        return companyname;
    }
/**
 * Setter for company name
 * @param companyname 
 */
    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }
/**
 * Getter for list location
 * @return location
 */
    public List<Location> getLocation() {
        return location;
    }
/**
 * Setter for list location
 * @param location 
 */
    public void setLocation(List<Location> location) {
        this.location = location;
    }
/**
 * Printing result
 * @return result
 */
    @Override
    public String toString() {
        
        String result = String.format("\n\t\t\t\t company : " + "\n\t\t\t\t\t companyname : " + companyname + location.stream().map(Object::toString).collect(Collectors.joining("\n")));
        return result;
    }
    
}
