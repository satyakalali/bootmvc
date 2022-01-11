package com.mvc.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mvc.config.JavaConfig;
import com.mvc.math.Addition;

public class TestApplicationContext {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Addition add = context.getBean(Addition.class);
		System.out.println(add.exceptionRaise(4, 0));
		//((ConfigurableApplicationContext)context).registerShutdownHook();
	}

}
