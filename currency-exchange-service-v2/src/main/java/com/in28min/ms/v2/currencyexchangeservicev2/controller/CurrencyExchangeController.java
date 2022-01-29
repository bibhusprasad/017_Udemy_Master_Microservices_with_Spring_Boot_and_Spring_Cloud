package com.in28min.ms.v2.currencyexchangeservicev2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28min.ms.v2.currencyexchangeservicev2.bean.CurrencyExchange;
import com.in28min.ms.v2.currencyexchangeservicev2.repo.CurrencyExchangeRepository;

@RestController
public class CurrencyExchangeController {

    private final Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);

    @Autowired
    private Environment environment;
    @Autowired
    private CurrencyExchangeRepository repository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(
            @PathVariable final String from,
            @PathVariable final String to) {

        this.logger.info("retrieveExchangeValue called with {} to {}", from, to);

        final CurrencyExchange currencyExchange
                = this.repository.findByFromAndTo(from, to);
        if(currencyExchange ==null) {
            throw new RuntimeException
                    ("Unable to Find data for " + from + " to " + to);
        }
        final String port = this.environment.getProperty("local.server.port");
        currencyExchange.setEnvironment(port);
        return currencyExchange;

    }
}
