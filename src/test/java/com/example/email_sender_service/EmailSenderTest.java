package com.example.email_sender_service;

import com.example.email_sender_service.services.EmailService;
import jakarta.mail.MessagingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
public class EmailSenderTest {

    @Autowired
    private EmailService emailService;

    @Test
    void emailSendTest(){
        System.out.println("Sending Email");
        emailService.sendEmail("jashanpreet0100@gmail.com",
                                "Email from spring boot test",
                                "This service is developed by Jashan Preet Singh in Spring Boot");
    }

    @Test
    void emailSendToManyTest(){
        System.out.println("Sending Email to All");
        emailService.sendEmailToMany(new String[]{"jashanpreet0100@gmail.com", "deeps3711@gmail.com"},
                "Email from spring boot test to Many",
                "This service is developed by Jashan Preet Singh in Spring Boot to Test sending multiple emails");
    }

    @Test
    void sendEmailWithFile() throws MessagingException {
        System.out.println("Sending Email to All");
        try {
            emailService.sendEmailWithFile("jashanpreet0100@gmail.com",
                    "Email from spring boot test with file",
                    "This service is developed by Jashan Preet Singh in Spring Boot test with file",
                    new File("C:/Users/Jashan/Desktop/file-test"));
        } catch (Exception e){
            System.out.println("File Path not found");
        }
    }

    @Test
    void sendHtmlTest(){
        String html = "" +
                "<h1 style='color:blue;border:5px solid red;'>This Service is build by Jashan Preet Singh</h1>" +
                "";
        emailService.sendEmailWithHTML("jashanpreet0100@gmail.com",
                "Email from spring boot with html",
                html);
    }
}
