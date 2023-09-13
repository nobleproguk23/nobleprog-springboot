package org.nobleprog.springboot.autoconfig.client;

import org.nobleprog.springboot.autoconfig.email.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {

    @Bean
    //@Profile("Dev")
    public EmailService emailService(){
        return new ClientSpecificEmailService();
    }
}
