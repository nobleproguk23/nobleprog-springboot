package org.nobleprog.springboot.core.beanscopes;


import org.nobleprog.springboot.core.beanscopes.repository.CustomerRepository;
import org.nobleprog.springboot.core.beanscopes.repository.CustomerRepositoryImpl;
import org.nobleprog.springboot.core.beanscopes.service.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

public class AppConfig {

    @Bean
    @Scope(scopeName = "prototype")
    public CustomerService customerService() {
        CustomerService customerService = new CustomerService(customerRepository());
        return customerService;
    }

    @Bean
    public CustomerRepository customerRepository() {
        return new CustomerRepositoryImpl();
    }
}
