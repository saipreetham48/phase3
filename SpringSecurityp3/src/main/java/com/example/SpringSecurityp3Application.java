package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class SpringSecurityp3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityp3Application.class, args);
	}

}
