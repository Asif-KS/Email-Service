package com.example.springmailclient.vo;

import lombok.Data;

@Data
public class MailVo {
    private String resetPasswordUrl;
    private  String fromEmailId;
    private String body;
    private  String subject;
//    private String attachment;
    private String toEmailId;
}
