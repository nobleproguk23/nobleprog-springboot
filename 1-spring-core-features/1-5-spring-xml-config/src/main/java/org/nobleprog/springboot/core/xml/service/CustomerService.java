package org.nobleprog.springboot.core.xml.service;

import org.nobleprog.springboot.core.xml.mode.Customer;
import org.nobleprog.springboot.core.xml.repository.CustomerRepository;
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepositoryImpl) {
        this.customerRepository = customerRepositoryImpl;
    }

    public CustomerService() {
    }

    public Customer getCustomer(String id) {
        return customerRepository.getCustomerById(id);
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
