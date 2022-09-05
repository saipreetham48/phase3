package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamService {

	@Autowired
	private ExamRepository repo;

	public List<Questions> getQuizById(int id) {
		return repo.getQuizById(id);
	}
}
