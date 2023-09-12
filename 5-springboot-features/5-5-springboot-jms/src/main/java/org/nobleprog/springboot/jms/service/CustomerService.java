package org.nobleprog.springboot.jms.service;

import org.nobleprog.springboot.jms.mode.Customer;
import org.nobleprog.springboot.jms.repository.CustomerJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {

    private final CustomerJpaRepository customerRepository;
    private final JmsTemplate jmsTemplate;

    @Autowired
    public CustomerService(CustomerJpaRepository customerRepositoryImpl, JmsTemplate jmsTemplate) {
        this.customerRepository = customerRepositoryImpl;
        this.jmsTemplate = jmsTemplate;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }


    public Customer getCustomer(int id) {
        return customerRepository.findById(id).get();
    }

    public void createCustomer(Customer customer) {
        jmsTemplate.convertAndSend("customers", customer);
    }



}
