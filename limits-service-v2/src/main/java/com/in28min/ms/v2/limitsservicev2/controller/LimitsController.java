package com.in28min.ms.v2.limitsservicev2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28min.ms.v2.limitsservicev2.bean.Configuration;
import com.in28min.ms.v2.limitsservicev2.bean.Limits;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        //return new Limits(1000,1);
        return new Limits(this.configuration.getMaximum(),
                this.configuration.getMinimum());
    }

}
