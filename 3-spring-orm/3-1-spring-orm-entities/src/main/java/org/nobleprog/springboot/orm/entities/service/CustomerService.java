package org.nobleprog.springboot.orm.entities.service;

import org.nobleprog.springboot.orm.entities.mode.Customer;
import org.nobleprog.springboot.orm.entities.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepositoryImpl) {
        this.customerRepository = customerRepositoryImpl;
    }


    public Customer getCustomer(int id) {
        return customerRepository.getCustomerById(id);
    }

    public void createCustomer(Customer customer) {
        customerRepository.createCustomer(customer);
    }
}
