package org.nobleprog.springboot.data.jpa.repository;

import org.junit.jupiter.api.Test;
import org.nobleprog.springboot.data.jpa.mode.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    //TODO: Implement tests for CustomerJpaRepository
    @Test
    public void testCustomerById() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("JPA");

        customerRepository.createCustomer(customer);

        Customer persisted = customerRepository.getCustomerById(1);

        assertEquals(persisted.getFirstName(), customer.getFirstName());
        assertEquals(persisted.getLastName(), customer.getLastName());
    }
    @Test
    public void testFindByCustomerFirstNameContains() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("JPA");
        Customer customer1 = new Customer();
        customer1.setFirstName("John");
        customer1.setLastName("JPA");

        customerRepository.createCustomer(customer);
        customerRepository.createCustomer(customer1);

        List<Customer> persisted = customerRepository.getCustomerWithFirstName("oh");

        assertTrue(persisted.size() == 2);
        assertEquals(persisted.get(0).getFirstName(), customer.getFirstName());
        assertEquals(persisted.get(1).getFirstName(), customer1.getFirstName());
    }

}