package com.sai.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sai.demo")
public class SprBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprBootDemoApplication.class, args);
	}

}
