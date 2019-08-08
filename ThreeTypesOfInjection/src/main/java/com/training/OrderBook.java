package com.training;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class OrderBook {

	private long orderId;
	private Customer cust;
//	private Product product;
	@Autowired
	private List<Product> product;
	
	
	
}
