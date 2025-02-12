package com.StudentResults.configuration1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Configuration1 {
	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}

}
