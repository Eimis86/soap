/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.epetraitis.soapsuplements;

import javax.jws.WebMethod;
import javax.jws.WebService;
import lt.viko.eif.epetraitis.suplemetssoap.model.Product;
import lt.viko.eif.epetraitis.suplemetssoap.model.Protiens;
import lt.viko.eif.epetraitis.suplemetssoap.model.Suplements;

/**
 *
 * @author Eimucio
 */
@WebService(name="SuplementsService")
public interface SuplementsService {
    /**
     * implementing web methods
     * @return 
     */
    @WebMethod
    Suplements getProtiens();
    
    @WebMethod
    String printValue(String arg1, String arg2, String arg3);
    
    @WebMethod
    void insertProtiens(Product product);
    
    @WebMethod
    void deleteConsole(String itemName);
}
