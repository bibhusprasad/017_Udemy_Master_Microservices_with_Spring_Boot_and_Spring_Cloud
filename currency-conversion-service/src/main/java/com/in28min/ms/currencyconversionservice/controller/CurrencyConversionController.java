package com.in28min.ms.currencyconversionservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.in28min.ms.currencyconversionservice.bean.CurrencyConversionBean;

@RestController
public class CurrencyConversionController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertCurrency(@PathVariable final String from, @PathVariable final String to,
                                                  @PathVariable final BigDecimal quantity) {

        final String uri = "http://localhost:8000/currency-exchange/from/{from}/to/{to}";
        final Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);

        final ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity(uri, CurrencyConversionBean.class, uriVariables);
        final CurrencyConversionBean response = responseEntity.getBody();
        return new CurrencyConversionBean(
                response.getId(),
                from,
                to,
                response.getConversionMultiple(),
                quantity,
                quantity.multiply(response.getConversionMultiple()),
                response.getPort());
    }
}
