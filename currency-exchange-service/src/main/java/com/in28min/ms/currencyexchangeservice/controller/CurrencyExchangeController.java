package com.in28min.ms.currencyexchangeservice.controller;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28min.ms.currencyexchangeservice.bean.ExchangeValue;
import com.in28min.ms.currencyexchangeservice.repo.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository repository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue
            (@PathVariable final String from, @PathVariable final String to){

        final ExchangeValue exchangeValue = this.repository.findByFromAndTo(from, to);
        exchangeValue.setPort(Integer.parseInt(Objects.requireNonNull(this.environment.getProperty("local.server.port"))));
        this.logger.info("{}", exchangeValue);
        return exchangeValue;
    }
}
