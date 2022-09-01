package com.simplilearn.demo;

public class FeedbackEntity {
	private int Id;
	private String Name;
	private String Email;
	private String Comment;
	
	public FeedbackEntity()
	{ }

	public FeedbackEntity(String name, String email, String comment) {
		super();
		Name = name;
		Email = email;
		Comment = comment;
	}
	 
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}
	
	@Override
	public String toString() {
		return "Feedback [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Comment=" + Comment + "]";
	}
	
	
}