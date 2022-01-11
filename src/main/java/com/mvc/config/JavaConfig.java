package com.mvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { AddressConfig.class, BikeConfig.class, EmpConfig.class ,AddConfig.class})
public class JavaConfig {

}
