package com.in28min.ms.v2.springcloudconfigserverv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerV2Application {

	public static void main(final String[] args) {
		SpringApplication.run(SpringCloudConfigServerV2Application.class, args);
	}

}
