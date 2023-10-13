package com.andrew.soapservicedemo;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.springframework.stereotype.Service;

//@Service
@WebService
public interface CalculatorService {

    @WebMethod
    int add(@WebParam(name = "num1") int num1,@WebParam(name = "num2") int num2);

}
