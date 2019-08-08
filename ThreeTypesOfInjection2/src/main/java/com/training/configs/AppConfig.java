package com.training.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.Address;
import com.training.Customer;
import com.training.OrderBook;
import com.training.Product;

@Configuration 

public class AppConfig {
	@Bean
	public Customer customer() {
		
		//Setter Dependency Injection of simple values
		
		Customer customer=new Customer();
		customer.setCustomerId(929);
		customer.setCustomerName("Ramesh");
		customer.setEmail("ram@abc.com");
		customer.setPhoneNumber(123456789);
		return customer;
	}
//	@Bean
//	public Product product() {
//		//Constructor Dependency Injection of simple values
//		
//		return new Product(101,"Sony tv",1,45000.00D);
//	}
	
	@Bean
	public Product tv() {
		
		
		return new Product(101,"Sony tv",1,45000.00D);
	}
	@Bean
	public Product laptop() {
		
		
		return new Product(102,"Sony Laptop",1,35000.00D);
	}
	@Bean
	public Product mobile() {
		
		
		return new Product(103,"Sony",1,25000.00D);
	}
	
	@Bean(initMethod="init",destroyMethod="destroy")
	public OrderBook orderBook() {
		//Constructor Dependency Injection using simple values and collaborating object
		
//		return new OrderBook(766,customer(),product());
		
		
		//changing into setter dependency
		
		OrderBook bk=new OrderBook();
		bk.setCust(customer());
		bk.setOrderId(2020);
		
		return bk;
	}
	@Bean
	public Address billingAddress() {
		return new Address("Olympia Tech Park","Chennai",600032);
	}
	@Bean
	public Address shippingAddress() {
		return new Address("Gandhi street","Chennai",600117);
	}
	
}
