package org.nobleprog.springboot.autoconfig.client;


import org.nobleprog.springboot.autoconfig.email.EmailService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AutoConfigClientService implements CommandLineRunner {
    private final EmailService emailService;

    public AutoConfigClientService(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void run(String... args) throws Exception {
        emailService.sendEmail("subject", "content");
    }
}
