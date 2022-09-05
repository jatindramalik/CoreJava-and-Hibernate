package com.rakhi.amazonshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class AmazonShoppingApplication {
	@LoadBalanced
	@Bean
	public RestTemplate getTemplet(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(AmazonShoppingApplication.class, args);
	}

}
