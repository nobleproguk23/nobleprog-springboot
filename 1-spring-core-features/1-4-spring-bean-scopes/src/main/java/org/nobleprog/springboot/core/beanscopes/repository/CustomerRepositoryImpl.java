package org.nobleprog.springboot.core.beanscopes.repository;

import org.nobleprog.springboot.core.beanscopes.mode.Customer;
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
