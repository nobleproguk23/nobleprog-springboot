package org.nobleprog.springboot.core.interfaceprog;

public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public Customer getCustomer(String id) {
        return customerRepository.getCustomerById(id);
    }
}
