package com.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages={"com.mvc.aspect","com.mvc.math"})
@EnableAspectJAutoProxy
public class AddConfig {

}
