package com.compass.board.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.compass.board.email.Mailer;
import com.compass.board.email.SMTPAuthenticator;

@Controller
public class EmailContoller {
	@GetMapping("/contact")
	
	
	public String contact() {
		return "contact/contact";
	}

	@PostMapping("/contact")
	@ResponseBody
	public String contactPost(String email, String comment) {
		Mailer mailer = new Mailer();
		mailer.sendMail(
				"kangkang119@naver.com", "문의내용 : " + email,
				comment, new SMTPAuthenticator());
				return "ok";

	}
}
