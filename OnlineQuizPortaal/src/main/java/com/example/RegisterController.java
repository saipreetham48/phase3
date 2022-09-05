package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private RegisterService service;
	
	///create new record
	@PostMapping("/")
	public ResponseEntity<Users> addUser(@RequestBody Users u){
		Users user= service.addUser(u);
		if(user!=null)  
			return new ResponseEntity<Users>(user,HttpStatus.CREATED);
		else
			return new ResponseEntity<Users>(user, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/")
	public  List<Users> getAllUser(){
		return service.getAllUser();
	}
}
