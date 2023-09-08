package org.nobleprog.springboot.core.repository;

import org.nobleprog.springboot.core.mode.Customer;

public class CustomerRepository {
    public Customer getCustomerById(String id) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName("John");
        customer.setLastName("Doe");
        return customer;
    }
}
