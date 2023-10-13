package com.andrew.soapservicedemo;

import jakarta.jws.WebService;
import org.apache.cxf.feature.Features;

@Features(features = "org.apache.cxf.feature.LoggingFeature")
@WebService  //(endpointInterface = "com.andrew.CalculatorService")
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public int add(int num1, int num2) {
        return (num1 + num2);
    }

}
