package com.sai.demo;

//import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	@GetMapping("/testme")
	public String hello()
	{
		return "Hello! welcome to the spring boot";
	}

}
