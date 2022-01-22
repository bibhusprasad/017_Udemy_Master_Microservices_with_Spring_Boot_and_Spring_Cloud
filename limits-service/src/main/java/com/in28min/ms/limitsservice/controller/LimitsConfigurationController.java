package com.in28min.ms.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28min.ms.limitsservice.bean.Configuration;
import com.in28min.ms.limitsservice.bean.LimitConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations() {
        //hard coded value
        //return new LimitConfiguration(1000, 1);

        //read from properties file
        return new LimitConfiguration(this.configuration.getMaximum(), this.configuration.getMinimum());
    }

    @GetMapping("/fault-tolerance-example")
    @HystrixCommand(fallbackMethod="fallbackRetrieveConfiguration")
    public LimitConfiguration retrieveConfigurations(){
        throw new RuntimeException("Service Not available");
    }

    public LimitConfiguration fallbackRetrieveConfiguration() {
        return new LimitConfiguration(555, 555);
    }
}
