package org.nobleprog.springboot.jdbc.repository;

import org.nobleprog.springboot.jdbc.mode.Customer;

public interface CustomerRepository {
    Customer getCustomerById(String id);
}
