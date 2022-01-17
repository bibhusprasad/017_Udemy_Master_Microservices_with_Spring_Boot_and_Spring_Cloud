package com.in28min.ms.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28min.ms.currencyexchangeservice.bean.ExchangeValue;

@RestController
public class CurrencyExchangeController {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue
            (@PathVariable final String from, @PathVariable final String to){
        return new ExchangeValue(1L, "USD", "INR", new BigDecimal(75));
    }
}
