/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webimc;

import javax.xml.ws.Endpoint;

/**
 *
 * @author dennis
 */
public class Servidor {
    public static void main(String[] args) {
        WebIMC imcWS = new WebIMC();
        String url = "http://localhost:8080/imcws";
        System.out.println("ImcWS rodando em "+url);
        Endpoint.publish(url, imcWS);
    }
}
