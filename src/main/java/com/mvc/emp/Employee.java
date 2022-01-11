package com.mvc.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.mvc.address.Address;
import com.mvc.bike.Bike;

import lombok.Data;

@Component
@Data
@PropertySource(value = { "classpath:employee.properties" })
public class Employee {
	@Value("${empId}")
	private int empId;
	@Value("${empName}")
	private String empName;
	@Autowired
	private Address address;
	@Autowired
	@Qualifier("heroBike")
	private Bike bike;
	
}
