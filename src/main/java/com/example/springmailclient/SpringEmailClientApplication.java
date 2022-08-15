package com.example.springmailclient;

import com.example.springmailclient.util.TriggerMail;
import com.example.springmailclient.vo.MailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;


import javax.mail.MessagingException;


@SpringBootApplication
public class  SpringEmailClientApplication {

	@Autowired

	private TriggerMail triggerMail;
	public static void main(String[] args) {

		SpringApplication.run(SpringEmailClientApplication.class, args);

	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(MailVo mailVo) throws MessagingException{
		triggerMail.triggerMail(mailVo);
	}


}
