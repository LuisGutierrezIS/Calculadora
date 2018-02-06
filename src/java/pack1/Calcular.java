/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author entrar
 */
@WebService(serviceName = "Calcular")
@Stateless()
public class Calcular {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sumar")
    public int sumar(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        return n1+n2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "restar")
    public int restar(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        return n1-n2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplicar")
    public int multiplicar(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        return n1*n2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dividir")
    public double dividir(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        return (double)n1/n2;
    }
}
