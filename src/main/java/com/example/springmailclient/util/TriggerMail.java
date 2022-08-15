package com.example.springmailclient.util;

import com.example.springmailclient.service.EmailService;
import com.example.springmailclient.vo.MailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
@Component
public class TriggerMail {
    @Autowired
    private EmailService service;


    public void triggerMail(MailVo mailVo1) throws MessagingException {
        MailVo mailVo = new MailVo();
        mailVo.setFromEmailId("asifshajahan@gmail.com");
        mailVo.setToEmailId("asif.ks@nintrivalabs.gmail.com");
        mailVo.setBody("reset your password");
        mailVo.setSubject("testing mail service");


        service.sendSimpleEmail(mailVo);

    }
}
