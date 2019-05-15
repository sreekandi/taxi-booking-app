package com.capgemini.cab.driversignupsigninservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DriverSignupSigninServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriverSignupSigninServiceApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
