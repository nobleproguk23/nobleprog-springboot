package org.nobleprog.springboot.mvc.service;

import org.nobleprog.springboot.mvc.mode.Customer;
import org.nobleprog.springboot.mvc.mode.Order;
import org.nobleprog.springboot.mvc.repository.CustomerJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {

    private final CustomerJpaRepository customerRepository;

    @Autowired
    public CustomerService(CustomerJpaRepository customerRepositoryImpl) {
        this.customerRepository = customerRepositoryImpl;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }


    public Customer getCustomer(int id) {
        return customerRepository.findById(id).get();
    }

    public void createCustomer(Customer customer) {
        customerRepository.saveAndFlush(customer);
    }



}
