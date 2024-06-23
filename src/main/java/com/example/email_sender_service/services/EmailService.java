package com.example.email_sender_service.services;

import jakarta.mail.MessagingException;

import java.io.File;
import java.io.InputStream;

public interface EmailService {

    //Send email to single person
    void sendEmail(String to, String subject, String message);

    //Send email to multiple person
    void sendEmailToMany(String[] to, String subject, String message);

    //Send email with html
    void sendEmailWithHTML(String to, String subject, String htmlContent);

    //Send email with file
    void sendEmailWithFile(String to, String subject, String message, File file);

    //Send file with input stream
    void sendEmailWithStream(String to, String subject, String message, InputStream inputStream);

}
