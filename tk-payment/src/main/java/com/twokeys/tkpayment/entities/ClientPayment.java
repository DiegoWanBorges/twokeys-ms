package com.twokeys.tkpayment.entities;

import java.util.ArrayList;
import java.util.List;

public class ClientPayment {
	private Client client;
	private List<Payment> payments = new ArrayList<>();
	
	public ClientPayment() {
	}

	public ClientPayment(Client client) {
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Payment> getPayments() {
		return payments;
	}
}
