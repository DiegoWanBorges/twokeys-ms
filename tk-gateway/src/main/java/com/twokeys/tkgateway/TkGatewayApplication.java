package com.twokeys.tkgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class TkGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TkGatewayApplication.class, args);
	}

}
