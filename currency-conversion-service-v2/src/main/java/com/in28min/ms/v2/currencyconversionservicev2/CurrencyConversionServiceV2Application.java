package com.in28min.ms.v2.currencyconversionservicev2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.in28min.ms.v2.currencyconversionservicev2")
public class CurrencyConversionServiceV2Application {

	public static void main(final String[] args) {
		SpringApplication.run(CurrencyConversionServiceV2Application.class, args);
	}

}
