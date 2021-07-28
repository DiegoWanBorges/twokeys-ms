package com.twokeys.tkeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TkEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TkEurekaServerApplication.class, args);
	}

}
