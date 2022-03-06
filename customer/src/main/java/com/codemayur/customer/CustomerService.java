package com.codemayur.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	public void registerCustomer(CustomerRegistrationRequest request) {
		Customer customer = Customer.builder()
				.firstName(request.getFirstName())
				.lastName(request.getLastName())
				.email(request.getEmail())
				.build();

		// TODO: check if email is valid
		// TODO: check if email is not already taken
		// TODO: store customer in db
		
	}

}
