package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(
        endpointInterface = "service.ICalculatrice",
        serviceName = "CalculatriceService",
        portName = "CalculatricePort",
        targetNamespace = "http://service/"
)

public class Calculatrice implements ICalculatrice {

    @Override
    @WebMethod(operationName = "addition")
    public int addition(@WebParam(name = "a") int a,
                     @WebParam(name = "b") int b) {
        return a + b;
    }

    @Override
    @WebMethod(operationName = "soustraction")
    public int soustraction(@WebParam(name = "a") int a,
                     @WebParam(name = "b") int b) {
        return a - b;
    }

    @Override
    @WebMethod(operationName = "multiplication")
    public int multiplication(@WebParam(name = "a") int a,
                     @WebParam(name = "b") int b) {
        return a * b;
    }

    @Override
    @WebMethod(operationName = "division")
    public int division(@WebParam(name = "a") int a,
                     @WebParam(name = "b") int b) {
        return a / b;
    }
}