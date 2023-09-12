package org.nobleprog.springboot.mvc.repository;

import org.nobleprog.springboot.mvc.mode.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerJpaRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findAllByFirstNameContains(String firstName);
}
