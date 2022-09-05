package com.example;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {


	@Autowired
	private AnswerRepository repo;

	public Answer addAnswer(Answer u) {
		return repo.save(u);
	}
	
	@PersistenceContext
	EntityManager em  ;
	public List<Object[]> getResult(int pId, int quizId)
	{
		Query query = em.createQuery("select a.QuestionId, q.Answer , a.Ans , case when (q.Answer = a.Ans) then 'Correct' else 'Wrong' end "
				+ "from Answer a, Questions q  where (a.PId="+pId+" and a.QuizId="+quizId+") and a.QuestionId = q.id");
		return query.getResultList();
	}
}
