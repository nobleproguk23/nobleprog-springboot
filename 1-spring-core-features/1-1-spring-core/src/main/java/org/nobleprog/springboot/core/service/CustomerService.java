package org.nobleprog.springboot.core.service;

import org.nobleprog.springboot.core.mode.Customer;
import org.nobleprog.springboot.core.repository.CustomerRepository;

public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public Customer getCustomer(String id) {
        return customerRepository.getCustomerById(id);
    }
}
