package com.in28min.ms.currencyconversionservice.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28min.ms.currencyconversionservice.bean.CurrencyConversionBean;

@RestController
public class CurrencyConversionController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertCurrency(@PathVariable final String from, @PathVariable final String to,
                                                  @PathVariable final BigDecimal quantity) {
        return new CurrencyConversionBean(1L, "USD", "INR", new BigDecimal(65), new BigDecimal(10), new BigDecimal(650), 0);
    }
}
