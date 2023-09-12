package org.nobleprog.springboot.orm.inheritance.joinedsubclass.service;

import org.nobleprog.springboot.orm.inheritance.joinedsubclass.mode.Ticket;
import org.nobleprog.springboot.orm.inheritance.joinedsubclass.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepositoryImpl) {
        this.customerRepository = customerRepositoryImpl;
    }

    public void createTicket(Ticket ticket) {
        customerRepository.createTicket(ticket);
    }
}
