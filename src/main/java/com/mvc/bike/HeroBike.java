package com.mvc.bike;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@PropertySource(value = "classpath:bike.properties")
public class HeroBike implements Bike {
	@Value("${bikeName}")
	private String bikeName;
}
