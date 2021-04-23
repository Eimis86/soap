/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.epetraitis.soapsuplements;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author Eimucio
 */
public class JAXWS1_Client {
    public static void main(String[] args) throws MalformedURLException{
/**
* URL of our local host server
*/
URL url = new URL("http://localhost:5055/SuplementsService/Suplements?wsdl");
QName qname = new QName("http://soapsuplements.epetraitis.eif.viko.lt/", "SuplementsServiceImplService");
/**
* Sukuriame nauja service
*/
Service service = Service.create(url, qname);
/**
* Setting ComputersService to port that we get from service, providing ComputerService.class
*/
SuplementsService eif = service.getPort(SuplementsService.class);
}
}
