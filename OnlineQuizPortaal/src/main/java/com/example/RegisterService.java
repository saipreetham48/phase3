package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RegisterService {

	@Autowired
	private RegisterRepo repo;
	
	//add method or CREATE RECORD
	public Users addUser(Users u) {
		return repo.save(u);
	}

	public List<Users> getAllUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
}
