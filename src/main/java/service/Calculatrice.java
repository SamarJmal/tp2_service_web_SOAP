package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(
        endpointInterface = "service.ICalculatrice",
        serviceName = "CalculatriceService",
        portName = "CalculatricePort",
        targetNamespace = "http://service/"
)
public class Calculatrice implements ICalculatrice {

    @Override
    @WebMethod(operationName = "somme")
    public double somme(@WebParam(name = "a") double a,
                        @WebParam(name = "b") double b) {
        return a + b;
    }
}