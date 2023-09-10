package org.nobleprog.springboot.core.javaconfig.repository;

import org.nobleprog.springboot.core.javaconfig.mode.Customer;

public interface CustomerRepository {
    Customer getCustomerById(String id);
}
