package de.riewek.minimal.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class RiewekMinimalWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(RiewekMinimalWebApplication.class, args);
	}
}
