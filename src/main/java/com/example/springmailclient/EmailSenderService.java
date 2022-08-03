package com.example.springmailclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;
    public void sendSimpleEmail (String toEmail,
                                 String body,
                                 String subject){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("asifshajahan@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);

        mailSender.send(message);
        System.out.println("mail send");
    }
}
