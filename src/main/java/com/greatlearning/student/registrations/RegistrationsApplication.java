package com.greatlearning.student.registrations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class RegistrationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationsApplication.class, args);
	}

}
