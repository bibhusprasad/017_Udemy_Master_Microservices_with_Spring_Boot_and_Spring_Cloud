package com.in28min.ms.v2.currencyexchangeservicev2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;

@RestController
public class CircuitBreakerController {

    private final Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

    @GetMapping("/sample-api")
    //@Retry(name="sample-api", fallbackMethod = "hardcodedResponseMethod")
    //@CircuitBreaker(name = "default", fallbackMethod = "hardcodedResponseMethod")
    //@RateLimiter(name="default")
    @Bulkhead(name="default")
    public String sampleApi() {
        this.logger.info("Sample api call received");
        //final ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080/some-dummy-url", String.class);
        //return forEntity.getBody();
        return "sample-api";
    }

    public String hardcodedResponseMethod(final Exception ex) {
        return "fallback-response";
    }

}
