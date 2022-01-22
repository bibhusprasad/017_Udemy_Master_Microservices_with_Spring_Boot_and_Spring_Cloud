package com.in28min.ms.v2.netflixeurekanamingserverv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekaNamingServerV2Application {

	public static void main(final String[] args) {
		SpringApplication.run(NetflixEurekaNamingServerV2Application.class, args);
	}

}
