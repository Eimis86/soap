/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.epetraitis.soapsuplements;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import lt.viko.eif.epetraitis.suplemetssoap.model.Product;
import lt.viko.eif.epetraitis.suplemetssoap.model.Protiens;
import lt.viko.eif.epetraitis.suplemetssoap.model.Suplements;

/**
 *
 * @author Eimucio
 */
@WebService(endpointInterface 
        = "lt.viko.eif.epetraitis.soapsuplements.SuplementsService")
public class SuplementsServiceImpl implements SuplementsService{
    
    private Repository repository;
    
    public SuplementsServiceImpl(){
        repository = new Repository();
    }
/**
 * 
 * @return 
 */
    
    @Override
    public Suplements getProtiens(){
        Suplements suplements = null;
        try{
            suplements = repository.getProtiens();
        }
        catch(Exception ex){
            Logger.getLogger(SuplementsServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return suplements;
    }
   /**
    * printing value 
    * @param arg1
    * @param arg2
    * @param arg3
    * @return 
    */

    @Override
    public String printValue(String arg1, String arg2, String arg3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 /**
 * inserting products threw repository
 * @param protiens 
 */
    @Override
    public void insertProtiens(Product product) {
        try{
            repository.insertProtiens(product);
        }
                catch(Exception ex){
            Logger.getLogger(SuplementsServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * deleting product threw repository
     * @param itemName 
     */
    @Override
    public void deleteConsole(String itemName){
        try{
        repository.deleteProtiens(itemName);
        }        
        catch(Exception ex){
            Logger.getLogger(SuplementsServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

