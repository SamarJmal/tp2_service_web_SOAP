package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "ICalculatrice", targetNamespace = "http://service/")

public interface ICalculatrice {
        @WebMethod(operationName = "somme")
        double somme(@WebParam(name = "a") double a,
                     @WebParam(name = "b") double b);
}