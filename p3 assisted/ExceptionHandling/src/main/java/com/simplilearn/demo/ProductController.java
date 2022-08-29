package com.simplilearn.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@GetMapping("/product/{id}")
	public String getproduct(@PathVariable("id") String id) throws ProductNotfoundException {
		if(id.contentEquals("0"))
			throw new ProductNotfoundException("Not valid id");
		else
			return "product was found";
	}
	

}
