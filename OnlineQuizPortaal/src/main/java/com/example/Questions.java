package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Questions {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String question;
	private String OptionA; 
	private String OptionB; 
	private String OptionC; 
	private String OptionD; 
	private String Answer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOptionA() {
		return OptionA;
	}
	public void setOptionA(String optionA) {
		OptionA = optionA;
	}
	public String getOptionB() {
		return OptionB;
	}
	public void setOptionB(String optionB) {
		OptionB = optionB;
	}
	public String getOptionC() {
		return OptionC;
	}
	public void setOptionC(String optionC) {
		OptionC = optionC;
	}
	public String getOptionD() {
		return OptionD;
	}
	public void setOptionD(String optionD) {
		OptionD = optionD;
	}
	public String getAns() {
		return Answer;
	}
	public void setAnswer(String ans) {
		Answer = ans;
	}
	
	public Questions(String question, String optionA, String optionB, String optionC, String optionD, String answer) {
		this.question = question;
		OptionA = optionA;
		OptionB = optionB;
		OptionC = optionC;
		OptionD = optionD;
		Answer = answer;
	}
	public Questions() {
		
	}
	public Questions(int id, String question, String optionA, String optionB, String optionC, String optionD) {
		this.id = id;
		this.question = question;
		OptionA = optionA;
		OptionB = optionB;
		OptionC = optionC;
		OptionD = optionD;
	}
	
	
}
