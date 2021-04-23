/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.epetraitis.soapsuplements;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Eimucio
 */
public class JAXWS1 {
    /**
     * creating local server
     * @param args 
     */
    public static void main(String [] args){
        Endpoint.publish(
        "http://localhost:5055/SuplementsService/Suplements",
                new SuplementsServiceImpl());
    }
}
