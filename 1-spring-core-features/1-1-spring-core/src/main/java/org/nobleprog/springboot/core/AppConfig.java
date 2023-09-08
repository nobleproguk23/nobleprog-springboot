package org.nobleprog.springboot.core;

import org.nobleprog.springboot.core.mode.Customer;
import org.nobleprog.springboot.core.repository.CustomerRepository;
import org.nobleprog.springboot.core.service.CustomerService;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    public CustomerService customerService() {
        CustomerService customerService = new CustomerService(customerRepository());
        return customerService;
    }

    @Bean
    public CustomerRepository customerRepository() {
        return new CustomerRepository();
    }
}
