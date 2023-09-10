package org.nobleprog.springboot.core.xml.repository;

import org.nobleprog.springboot.core.xml.mode.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepositoryImpl implements CustomerRepository {
    public Customer getCustomerById(String id) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName("Sam-xml-config1");
        customer.setLastName("Doe");
        return customer;
    }
}
