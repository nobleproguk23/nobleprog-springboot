package org.nobleprog.springboot.core.xml.repository;

import org.nobleprog.springboot.core.xml.mode.Customer;

public interface CustomerRepository {
    Customer getCustomerById(String id);
}
