package com.live.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.live.repository.OracleRepository;
import com.live.repository.ProductRepository;

@Configuration
public class AppConfig {
	@Bean
	public ProductRepository productRepository() {
		return new OracleRepository();
	}
}
