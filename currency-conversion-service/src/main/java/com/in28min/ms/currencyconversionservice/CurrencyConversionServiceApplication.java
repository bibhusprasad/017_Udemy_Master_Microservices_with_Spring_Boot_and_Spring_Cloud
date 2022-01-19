package com.in28min.ms.currencyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.in28min.ms.currencyconversionservice")
public class CurrencyConversionServiceApplication {

	public static void main(final String[] args) {
		SpringApplication.run(CurrencyConversionServiceApplication.class, args);
	}

}
