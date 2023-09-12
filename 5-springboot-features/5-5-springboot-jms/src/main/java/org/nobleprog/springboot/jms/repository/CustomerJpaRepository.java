package org.nobleprog.springboot.jms.repository;

import org.nobleprog.springboot.jms.mode.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerJpaRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findAllByFirstNameContains(String firstName);
}
