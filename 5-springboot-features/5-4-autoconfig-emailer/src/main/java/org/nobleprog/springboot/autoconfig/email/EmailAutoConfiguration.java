package org.nobleprog.springboot.autoconfig.email;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = EmailProperties.class)
public class EmailAutoConfiguration {

    //TODO: Configure this Bean using Condition of missing its presence
    public EmailService emailService(EmailProperties emailProperties) {
        return new EmailServiceImpl(emailProperties);
    }
}
