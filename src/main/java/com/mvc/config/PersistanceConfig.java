package com.mvc.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource(value="classpath:jdbc.properties")
public class PersistanceConfig {

	@Bean
	public DriverManagerDataSource dataSource(@Value("${username1}") String username1,
			@Value("${password}") String password, @Value("${url}") String url,
			@Value("${driverClassName}") String driverClassName) {

		DriverManagerDataSource dataSource = new DriverManagerDataSource(url, username1, password);
		dataSource.setDriverClassName(driverClassName);
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {

		return new JdbcTemplate(dataSource);
	}

}
