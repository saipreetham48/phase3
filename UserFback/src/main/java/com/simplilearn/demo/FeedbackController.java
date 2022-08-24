package com.simplilearn.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackController {

	@Autowired
	private FeedbackDao dao;

	@PostMapping("/feed")
	public ResponseEntity<String> addFeedback(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NullPointerException {
		String Name = request.getParameter("Name");
		response.setContentType("text/html");
		if (Name.isBlank()) {			
			return new ResponseEntity<String>("You forgot to enter your name <br><br><a href='index.html'>Click here to go back to home page</a>",
					HttpStatus.INTERNAL_SERVER_ERROR);	
		}
		else {
				FeedbackEntity feedback = new FeedbackEntity();
				feedback.setName(Name);
				feedback.setEmail(request.getParameter("Email"));
				feedback.setComment(request.getParameter("Comment"));
				int updated = dao.addFeedback(feedback);
				if (updated > 0) {
					return new ResponseEntity<String>("Feedback submitted <br><br><a href='index.html'>Click here to enter a new feedback</a>", HttpStatus.OK);
				}			
		}
		return null;
	}
}