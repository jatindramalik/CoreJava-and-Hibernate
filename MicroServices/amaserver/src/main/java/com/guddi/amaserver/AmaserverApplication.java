package com.guddi.amaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AmaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmaserverApplication.class, args);
	}

}
