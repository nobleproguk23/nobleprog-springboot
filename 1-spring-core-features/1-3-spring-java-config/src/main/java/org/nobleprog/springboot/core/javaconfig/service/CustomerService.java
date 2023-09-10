package org.nobleprog.springboot.core.javaconfig.service;

import org.nobleprog.springboot.core.javaconfig.mode.Customer;
import org.nobleprog.springboot.core.javaconfig.repository.CustomerRepository;
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
