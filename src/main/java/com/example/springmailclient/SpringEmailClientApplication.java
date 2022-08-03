package com.example.springmailclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication

public class SpringEmailClientApplication {
	@Autowired
	private EmailSenderService service;
	public static void main(String[] args) {
		SpringApplication.run(SpringEmailClientApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
		service.sendEmailWithAttachment("john.joshy@nintrivalabs.com",
				"ni aahno poopatta gundaa",
				"checking mail",
				"C:\\Users\\ASIF SHAJAHAN\\OneDrive\\Pictures\\IMG_7034.JPG");
//
//
//
//		service.sendSimpleEmail("sreenath@nintrivalabs.com",
//				"hello machaa",
//				"checking mail");

	}

}
