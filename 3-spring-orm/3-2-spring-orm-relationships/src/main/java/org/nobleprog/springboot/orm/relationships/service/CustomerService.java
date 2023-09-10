package org.nobleprog.springboot.orm.relationships.service;

import org.nobleprog.springboot.orm.relationships.mode.Customer;
import org.nobleprog.springboot.orm.relationships.mode.Order;
import org.nobleprog.springboot.orm.relationships.mode.Ticket;
import org.nobleprog.springboot.orm.relationships.repository.CustomerRepository;
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

    public void createOrder(Order order) {
        customerRepository.createOrder(order);
    }

    public void createTicket(Ticket ticket) {
        customerRepository.createTicket(ticket);
    }
}
