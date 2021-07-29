package com.twokeys.tkpayment.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.twokeys.tkpayment.entities.Client;

@Component
@FeignClient(name="tk-sales", path = "/clients")
public interface ClientFeignClients {
	@GetMapping(value="/{id}")
	ResponseEntity<Client> findById(@PathVariable Long id);
		
}
