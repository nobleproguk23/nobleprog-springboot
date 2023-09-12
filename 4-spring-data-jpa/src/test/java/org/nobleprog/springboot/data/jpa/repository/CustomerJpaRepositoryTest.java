package org.nobleprog.springboot.data.jpa.repository;

import org.junit.jupiter.api.Test;
import org.nobleprog.springboot.data.jpa.mode.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerJpaRepositoryTest {

    @Autowired
    private CustomerJpaRepository customerJpaRepository;

    @Test
    public void testCustomerById() {
        //Given
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("JPA");

        customerJpaRepository.save(customer);

        //When
        Customer persisted = customerJpaRepository.findById(1).get();

        assertEquals(persisted.getFirstName(), customer.getFirstName());
        assertEquals(persisted.getLastName(), customer.getLastName());
    }

    @Test
    public void testFindByCustomerFirstNameContains() {
        //Given
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("JPA");
        Customer customer1 = new Customer();
        customer1.setFirstName("John");
        customer1.setLastName("JPA");

        customerJpaRepository.saveAll(Arrays.asList(customer, customer1));


        //When
        List<Customer> persisted = customerJpaRepository.findAllByFirstNameContains("oh");

        //Then
        assertTrue(persisted.size() == 2);
        assertEquals(persisted.get(0).getFirstName(), customer.getFirstName());
        assertEquals(persisted.get(1).getFirstName(), customer1.getFirstName());
    }
}