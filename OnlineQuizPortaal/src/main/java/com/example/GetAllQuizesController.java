package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/protected")
public class GetAllQuizesController {
	
	@Autowired
	private AnswerService service;

	@Autowired
	private ExamService qservice;
	
	@GetMapping("/{id}")
	public List<Questions> getUserById(@PathVariable int id){
		  return qservice.getQuizById(id);
	}
	
	@PostMapping("/answer")
	public ResponseEntity<Answer> saveAnswer(@RequestBody Answer a)
	{
		Answer answer = service.addAnswer(a);
		if(answer!=null)  
			return new ResponseEntity<Answer>(answer,HttpStatus.CREATED);
		else
			return new ResponseEntity<Answer>(answer, HttpStatus.INTERNAL_SERVER_ERROR); 
	}
	
	@GetMapping("/result/{pId}/{quizId}")
	public ResponseEntity<Object> getResult(@PathVariable int pId, @PathVariable int quizId)  {
		List<Object[]> list = service.getResult(pId,quizId);
		if(list!=null)
			return new ResponseEntity<Object>(list,HttpStatus.FOUND);
		else
			return new ResponseEntity<Object>(list,HttpStatus.NOT_FOUND);
	}
	

}
