package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Customer {
	private long customerId;
	private String customerName;
	private String email;
	private long phoneNumber;
	
	//Field Injection
	@Autowired
	@Qualifier("billingAddress")
	private Address address;
}
