package com.twokeys.tkuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TkUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(TkUserApplication.class, args);
	}

}
