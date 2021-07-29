package com.twokeys.tkpayment.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twokeys.tkpayment.entities.Client;
import com.twokeys.tkpayment.entities.ClientPayment;
import com.twokeys.tkpayment.entities.Payment;
import com.twokeys.tkpayment.feignclients.ClientFeignClients;

@Service
public class ClientPaymentService {
	
	@Autowired
	private ClientFeignClients clientFeignClients;
	
	public ClientPayment generatePayment(Long clientId, Integer parcelNumber, Double value ) {
		Client client = clientFeignClients.findById(clientId).getBody();
		LocalDate date = LocalDate.now();
		ClientPayment clientPayment = new ClientPayment();
		clientPayment.setClient(client);
		Double valueParcel = value/parcelNumber;
		
		for (int i = 0; i < parcelNumber; i++) {
			clientPayment.getPayments().add(new Payment(i+1, date.plusMonths(i+1), valueParcel));
		}
		
		return clientPayment;
	}
}
