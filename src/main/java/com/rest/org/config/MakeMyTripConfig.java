package com.rest.org.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MakeMyTripConfig {

	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
