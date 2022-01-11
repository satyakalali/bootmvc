package com.mvc.address;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@PropertySource(value = { "classpath:address.properties" })
public class Address {
	@Value("${city}")
	private String city;

	@PostConstruct
	public void intialize() {
		System.out.println("Address bean Intilizing..");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Address bean destroy..");
	}
}
