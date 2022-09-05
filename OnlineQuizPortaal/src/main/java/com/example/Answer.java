package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int PId;
	private int QuizId;
	private int QuestionId;
	private String Ans;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPId() {
		return PId;
	}
	public void setPId(int pId) {
		PId = pId;
	}
	public int getQuizId() {
		return QuizId;
	}
	public void setQuizId(int quizId) {
		QuizId = quizId;
	}
	public int getQuestionId() {
		return QuestionId;
	}
	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}
	public String getAns() {
		return Ans;
	}
	public void setAns(String ans) {
		Ans = ans;
	}
	
	public Answer(int id, int pId, int quizId, int questionId, String ans) {
		this.id = id;
		this.PId = pId;
		this.QuizId = quizId;
		this.QuestionId = questionId;
		this.Ans = ans;
	}
	public Answer(int pId, int quizId, int questionId, String ans) {
		this.PId = pId;
		this.QuizId = quizId;
		this.QuestionId = questionId;
		this.Ans = ans;
	}
	public Answer() {
	
	}
	
	
}
