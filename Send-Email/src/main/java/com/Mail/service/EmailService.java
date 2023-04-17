package com.Mail.service;

import com.Mail.entity.EmailDetails;

public interface EmailService {

    String sendSimpleMail(EmailDetails emailDetails);

    String sendMailWithAttachment(EmailDetails details);
}
