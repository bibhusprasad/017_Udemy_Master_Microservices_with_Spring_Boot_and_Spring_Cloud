package com.in28min.ms.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class LimitsServiceApplication {

	public static void main(final String[] args) {
		SpringApplication.run(LimitsServiceApplication.class, args);
	}

}
