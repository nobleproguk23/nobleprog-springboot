package org.nobleprog.springboot.aop.service;

import org.nobleprog.springboot.aop.annotation.Log;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Log
    public void createCustomer() {
        System.out.println("Creating customer..");
    }

    public void createCustomer(Long id) {
        System.out.println("Creating customer.. with id " + id);
    }
}
