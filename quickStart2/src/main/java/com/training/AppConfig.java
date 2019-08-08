package com.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration 


public class AppConfig {
	@Bean
//	@Lazy
	public Doctor doctor() {
		
		Doctor ramesh=new Doctor();
		ramesh.setDoctorName("Ramesh");
		ramesh.setDoctorId(1020);
		ramesh.setPhoneNumber(1234567890);
		ramesh.setAddress(address());
		return ramesh;
	}
	
	@Bean
	public Doctor surgeon() {
		
		Doctor suresh=new Doctor();
		suresh.setDoctorName("Suresh");
		suresh.setDoctorId(1021);
		suresh.setPhoneNumber(1234567890);
		
		return suresh;
	}
	@Bean
	public Address address() {
		
		return new Address("Gandhi Street","Chennai",600117);
	
	}
	
	
	
	

}
