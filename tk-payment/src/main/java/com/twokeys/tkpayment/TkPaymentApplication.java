package com.twokeys.tkpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class TkPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(TkPaymentApplication.class, args);
	}

}
