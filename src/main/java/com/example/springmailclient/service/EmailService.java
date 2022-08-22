package com.example.springmailclient.service;

import com.example.springmailclient.vo.MailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {


    @Autowired
    private JavaMailSender mailSender;

    public void sendSimpleEmail(MailVo mailVo) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(mailVo.getFromEmailId());
        message.setTo(mailVo.getToEmailId());
        message.setText(mailVo.getBody());
        message.setSubject(mailVo.getSubject());

        mailSender.send(message);
        System.out.println("mail send");
    }
}
//    public void sendEmailWithAttachment(String toEmail,
//                                         String body,
//                                         String subject,
//                                         String attachment) throws MessagingException {
//        MimeMessage mimeMessage =mailSender.createMimeMessage();
//        MimeMessageHelper mimeMessageHelper =new MimeMessageHelper(mimeMessage,true);
//
//        mimeMessageHelper.setFrom("asifshajahan@gmail.com");
//        mimeMessageHelper.setTo(toEmail);
//        mimeMessageHelper.setText(body);
//        mimeMessageHelper.setSubject(subject);
//
//        FileSystemResource fileSystem = new FileSystemResource(new File(attachment));
//        mimeMessageHelper.addAttachment(fileSystem.getFilename(),fileSystem);
//
//        mailSender.send(mimeMessage);
//        System.out.println("mail Send........");
//    }
//
//}
