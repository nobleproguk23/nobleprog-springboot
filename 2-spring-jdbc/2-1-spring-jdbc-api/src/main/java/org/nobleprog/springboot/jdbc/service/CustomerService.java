package org.nobleprog.springboot.jdbc.service;

import org.nobleprog.springboot.jdbc.mode.Customer;
import org.nobleprog.springboot.jdbc.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepositoryImpl) {
        this.customerRepository = customerRepositoryImpl;
    }


    public Customer getCustomer(String id) {
        return customerRepository.getCustomerById(id);
    }
}
