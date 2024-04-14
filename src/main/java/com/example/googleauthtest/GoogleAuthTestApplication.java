package com.example.googleauthtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class GoogleAuthTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleAuthTestApplication.class, args);
	}

}
