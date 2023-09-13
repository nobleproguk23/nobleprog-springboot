package org.nobleprog.springboot.autoconfig.client;

import org.nobleprog.springboot.autoconfig.email.EmailService;

public class ClientSpecificEmailService implements EmailService {
    @Override
    public void sendEmail(String subject, String content) {
        //ignore sending email for lower envs
        System.out.println("Client specific email service");
    }
}
