package com.mvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value={ServiceConfig.class,PersistanceConfig.class})
public class JdbcConfig {

}
