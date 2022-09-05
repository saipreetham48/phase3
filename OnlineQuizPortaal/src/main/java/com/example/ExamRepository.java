package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Questions,Integer>{

	@Query("select new com.example.Questions(q.id,q.question,q.OptionA,q.OptionB,q.OptionC,q.OptionD) from Questions q inner join QuizCompetition qz on q.id=qz.questionId where qz.quizId=:id")
	public List<Questions> getQuizById(int id);	
}
