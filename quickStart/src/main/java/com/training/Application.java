package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Doctor ram = ctx.getBean(Doctor.class);
		
		System.out.println(ram);
		
		ctx.close();
	}
}
