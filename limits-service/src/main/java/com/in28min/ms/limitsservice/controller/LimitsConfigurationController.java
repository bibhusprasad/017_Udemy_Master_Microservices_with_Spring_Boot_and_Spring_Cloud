package com.in28min.ms.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28min.ms.limitsservice.bean.Configuration;
import com.in28min.ms.limitsservice.bean.LimitConfiguration;

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
}
