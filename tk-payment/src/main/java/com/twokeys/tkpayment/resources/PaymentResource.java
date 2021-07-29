package com.twokeys.tkpayment.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.twokeys.tkpayment.entities.ClientPayment;
import com.twokeys.tkpayment.service.ClientPaymentService;

@RestController
@RequestMapping(value="/payments")
public class PaymentResource {
	@Autowired
	private ClientPaymentService service;
	
	@GetMapping
	public ResponseEntity<ClientPayment> generatePayment(@RequestParam(value = "clientId") Long clientId,
														 @RequestParam(value = "parcel") Integer  parcel,
														 @RequestParam(value = "value") Double value){
		ClientPayment obj = service.generatePayment(clientId, parcel, value);
		return ResponseEntity.ok().body(obj);
	}
}
