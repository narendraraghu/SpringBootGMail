package com.narendra.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class RootController {
	
	@Autowired
	private SmtpMailSender smtpMailSender;

	@RequestMapping("/send-mail")
	public void sendMail() throws MessagingException, MailException {
		
		smtpMailSender.send("ramnaresh.ec@gmail.com", "Test mail from Narendra raghuwanshi", "How r u doing");
		System.out.println("Sent");
		
	}
	

}
