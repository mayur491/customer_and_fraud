package com.codemayur.customer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerRegistrationRequest {

	private String firstName;
	private String lastName;
	private String email;
	
}
