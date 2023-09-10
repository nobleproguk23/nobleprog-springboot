package org.nobleprog.springboot.core.interfaceprog;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    public CustomerService customerService() {
        CustomerService customerService = new CustomerService(customerRepository());
        return customerService;
    }

    @Bean
    public CustomerRepository customerRepository() {
        return new CustomerRepositoryImpl();
    }
}
