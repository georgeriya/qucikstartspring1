package com.training;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.*;
import java.util.logging.Logger;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class OrderBook {

	private long orderId;
	private Customer cust;
//	private Product product;
	
	Logger log = Logger.getAnonymousLogger();
	
	@Autowired
	private List<Product> product;
	
	public void init() {
		
		log.info("Init Method called");
	}
	
	public void destroy() {
		log.info("Destroy called");
	}
	
}
