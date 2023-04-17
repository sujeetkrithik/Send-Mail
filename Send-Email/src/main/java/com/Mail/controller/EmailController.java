package com.Mail.controller;

import com.Mail.entity.EmailDetails;
import com.Mail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/sendMail")
    public String sendMail(@RequestBody EmailDetails emailDetails)
    {
        String status = emailService.sendSimpleMail(emailDetails);

        return status;
    }
    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(@RequestBody EmailDetails details)
    {
        String status = emailService.sendMailWithAttachment(details);

        return status;
    }
}
