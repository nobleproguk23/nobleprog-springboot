package org.nobleprog.springboot.core.interfaceprog;

public class CustomerRepositoryImpl implements CustomerRepository{
    public Customer getCustomerById(String id) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName("John-program-to-interface");
        customer.setLastName("Doe");
        return customer;
    }
}
