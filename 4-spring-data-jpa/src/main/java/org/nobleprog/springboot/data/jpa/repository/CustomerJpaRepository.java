package org.nobleprog.springboot.data.jpa.repository;

import org.nobleprog.springboot.data.jpa.mode.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerJpaRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findAllByFirstNameContains(String firstName);
    List<Customer> findAllByFirstNameOrLastNameNotContains(String firstName, String lastName);
    List<Customer> findAllByFirstNameAndLastNameEquals(String firstName, String lastName);

    //And, Or, No, Equals, Like, StartingWith, EndingWith, LessThan, GreaterThan(Equals)

    // countByFirstNameContains

}
