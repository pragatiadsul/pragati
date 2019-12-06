package com.Expense.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Expense.project.SmtpMailSender;

@RestController
@RequestMapping("/mail")
public class EmailController {
	@Autowired
	SmtpMailSender smtpMailSender;

	@GetMapping("/sendMail")
	public String sendMail() throws MessagingException {
		return smtpMailSender.send("pragatiadsul3796@gmail.com", "Testing Mail from Springboot",
				"Mail USing SprinBoot");

	}
}
