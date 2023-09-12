package org.nobleprog.springboot.autoconfig.email;

public class EmailServiceImpl implements EmailService {
    private final EmailProperties emailProperties;

    public EmailServiceImpl(EmailProperties emailProperties) {
        this.emailProperties = emailProperties;
    }

    @Override
    public void sendEmail(String subject, String content) {
        System.out.println("Sending email.. from " + emailProperties.getFrom() + " to " + emailProperties.getTo());
        System.out.println("Subject " + subject + " content " + content);
    }
}
