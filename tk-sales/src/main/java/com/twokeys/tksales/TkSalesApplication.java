package com.twokeys.tksales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TkSalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TkSalesApplication.class, args);
	}

}
