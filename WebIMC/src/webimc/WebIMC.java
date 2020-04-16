/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webimc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author dennis
 */

@WebService
public class WebIMC {

    @WebMethod
    public double getImc(@WebParam(name="altura") int altura, @WebParam(name="peso") int peso){
        return (peso)/(altura*altura);
    }
    
}
