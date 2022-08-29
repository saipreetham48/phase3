package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class FeedbackDao {
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public int addFeedback(FeedbackEntity feedback)
	{
		return jdbctemplate.update("insert into feedback (Name,Email,Comment) values(?,?,?)",feedback.getName(),feedback.getEmail(),feedback.getComment());      
	}
}