package com.training.apps;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.DiscountNotification;
import com.training.DiscountService;
import com.training.OrderBook;
import com.training.configs.AppConfig;
import com.training.configs.LookupConfig;

public class LookupApplication {
	public static void main(String[] args) {
		
		Logger log= Logger.getAnonymousLogger();
		//IoC container is instantiated by passing c0onfiguration metadata
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(LookupConfig.class);
		
		 DiscountService service = ctx.getBean(DiscountService.class);
		 
		 DiscountNotification notifyBean = service.getDiscount("tv");
		 
		 log.info(Double.toString(notifyBean.showDiscount()));
		
	}

}
