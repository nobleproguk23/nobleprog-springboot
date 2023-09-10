package org.nobleprog.springboot.orm.entities.repository;

import org.nobleprog.springboot.orm.entities.mode.Customer;

public interface CustomerRepository {
    Customer getCustomerById(int id);

    void createCustomer(Customer customer);
}
