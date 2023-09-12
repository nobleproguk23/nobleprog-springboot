package org.nobleprog.springboot.rest.repository;

import org.nobleprog.springboot.rest.mode.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerJpaRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findAllByFirstNameContains(String firstName);
}
