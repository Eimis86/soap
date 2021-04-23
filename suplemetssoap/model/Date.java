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
 *This class responsible for getters, setters and printing values
 * @author Eimantas Petraitis
 * version 1.0
 */
public class Date {
    private List<Expiredate> expiredate;
    private List<Madedate> madedate;
/**
 * Getter for list of expiredate
 * @return expiredate
 */
    @XmlElement(name="expire-date")
    public List<Expiredate> getExpiredate() {
        return expiredate;
    }
/**
 * Setter for list of expiredate
 * @param expiredate 
 */
    public void setExpiredate(List<Expiredate> expiredate) {
        this.expiredate = expiredate;
    }
    /**
     * Getter for list of madedate
     * @return madedate
     */
@XmlElement(name="made-date")
    public List<Madedate> getMadedate() {
        return madedate;
    }
/**
 * Setter for list of madedate
 * @param madedate 
 */
    public void setMadedate(List<Madedate> madedate) {
        this.madedate = madedate;
    }
/**
 * printing values
 * @return result
 */
    @Override
    public String toString() {
        String result = String.format("\n\t\t\t\t Date : " 
                + expiredate.stream().map(Object::toString).collect(Collectors.joining("\n"))
                + madedate.stream().map(Object::toString).collect(Collectors.joining("\n")));
        return result;
    }
    
}
