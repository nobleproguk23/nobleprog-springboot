package org.nobleprog.springboot.jms.listener;

import org.nobleprog.springboot.jms.mode.Customer;
import org.nobleprog.springboot.jms.repository.CustomerJpaRepository;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
public class CustomerConsumer {
    private final CustomerJpaRepository customerJpaRepository;

    public CustomerConsumer(CustomerJpaRepository customerJpaRepository) {
        this.customerJpaRepository = customerJpaRepository;
    }

    @JmsListener(destination = "customers")
    public void consumeCustomer(Customer customer, Message originalMessage) {
        System.out.println(originalMessage);
        customerJpaRepository.saveAndFlush(customer);
    }
}
