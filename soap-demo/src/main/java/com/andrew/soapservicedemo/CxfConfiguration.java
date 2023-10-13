package com.andrew.soapservicedemo;

import jakarta.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CxfConfiguration {

    @Bean
    public CalculatorService calculatorService() {
        return new CalculatorServiceImpl();
    }

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
        Endpoint endpoint = new EndpointImpl(bus, new CalculatorServiceImpl());
        endpoint.publish("/calculator");
        return endpoint;
    }

}
