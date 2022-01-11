package com.mvc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mvc.config.JdbcConfig;
import com.mvc.entity.VogoBike;
import com.mvc.service.VogoBikeService;

public class JdbcTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JdbcConfig.class);
		VogoBikeService vogoBikeService = applicationContext.getBean(VogoBikeService.class);
		List<VogoBike> bikeDetails = vogoBikeService.getBikeDetails();
		bikeDetails.forEach(bike -> System.out.println(bike));
	}
}
