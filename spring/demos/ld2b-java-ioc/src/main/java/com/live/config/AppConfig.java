package com.live.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.live.repository.OracleRepository;
import com.live.repository.ProductRepository;

@Configuration
public class AppConfig {
	@Bean
	@Scope("prototype")
	public ProductRepository productRepository() {
		return new OracleRepository();
	}
}
