package org.nobleprog.springboot.core.javaconfig.repository;

import org.nobleprog.springboot.core.javaconfig.mode.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepositoryImpl implements CustomerRepository {
    public Customer getCustomerById(String id) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName("Sam-java-config");
        customer.setLastName("Doe");
        return customer;
    }
}
