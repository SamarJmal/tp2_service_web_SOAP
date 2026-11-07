package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name = "ICalculatrice", targetNamespace = "http://service/")

public interface ICalculatrice {
        @WebMethod(operationName = "addition")
        int addition(@WebParam(name = "a") int a,
                  @WebParam(name = "b") int b);

        @WebMethod(operationName = "soustraction")
        int soustraction(@WebParam(name = "a") int a,
                  @WebParam(name = "b") int b);

        @WebMethod(operationName = "multiplication")
        int multiplication(@WebParam(name = "a") int a,
                  @WebParam(name = "b") int b);

        @WebMethod(operationName = "division")
        int division(@WebParam(name = "a") int a,
                  @WebParam(name = "b") int b);
}