package com.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.mvc.service","com.mvc.dal"})
public class ServiceConfig {

}
