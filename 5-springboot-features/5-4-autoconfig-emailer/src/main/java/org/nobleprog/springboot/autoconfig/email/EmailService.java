package org.nobleprog.springboot.autoconfig.email;

public interface EmailService {

    public void sendEmail(String subject, String content);
}
