package com.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 


public class AppConfig {
	@Bean
	public Doctor doctor() {
		
		Doctor ramesh=new Doctor();
		ramesh.setDoctorName("Ramesh");
		ramesh.setDoctorId(1020);
		ramesh.setPhoneNumber(1234567890);
		
		return ramesh;
	}
	
	
	
	
	
	

}
