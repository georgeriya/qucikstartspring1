package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
				
		Doctor ram = (Doctor)ctx.getBean("doctor");
		
		System.out.println(ram);
		System.out.println(ram.getAddress());
		
		Doctor shyam = (Doctor)ctx.getBean("surgeon");
		
		System.out.println(shyam);
		
		ctx.close();
	}
}
