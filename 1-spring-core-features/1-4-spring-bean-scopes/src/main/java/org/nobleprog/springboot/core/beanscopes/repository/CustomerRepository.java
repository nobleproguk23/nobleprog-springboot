package org.nobleprog.springboot.core.beanscopes.repository;

import org.nobleprog.springboot.core.beanscopes.mode.Customer;

public interface CustomerRepository {
    Customer getCustomerById(String id);
}
