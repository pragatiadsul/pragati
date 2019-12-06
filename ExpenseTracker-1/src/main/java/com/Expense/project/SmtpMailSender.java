package com.Expense.project;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class SmtpMailSender {

	@Autowired
	private JavaMailSender javaMailSender;

	public String send(String to, String subject, String body) {
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		try {
			helper.setTo(to);
			helper.setText(body);
			helper.setSubject(subject);
			// helper.addAttachment("download.jpg", new ClassPathResource("download.jpg"));
		} catch (MessagingException e) {
			e.printStackTrace();
			return "Error while sending mail ..";
		}
		javaMailSender.send(message);
		return "Mail Sent to" + to + " Successfully!";
	}

}
