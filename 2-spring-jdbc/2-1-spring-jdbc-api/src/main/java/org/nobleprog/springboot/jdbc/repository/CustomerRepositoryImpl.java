package org.nobleprog.springboot.jdbc.repository;

import org.nobleprog.springboot.jdbc.mode.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class CustomerRepositoryImpl implements CustomerRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomerRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /*
    create a file named "jdbc.mv.db" under c:\\users\nobleprog
    connect to h2 db using url jdbc:h2:tcp://localhost/~/test
    create table customer ( id varchar2(20), first_name varchar2(20), last_name varchar2(20));
   insert into customer values('1', 'John', 'Smith');
    */

    public Customer getCustomerById(String id) {
        Customer customer = jdbcTemplate.queryForObject("select * from customer where id = " + id, mapCustomer());
        return customer;
    }

    private static RowMapper<Customer> mapCustomer() {
        return (resultSet, i) -> {
            Customer customer1 = new Customer();
            customer1.setId(resultSet.getString(1));
            customer1.setFirstName(resultSet.getString(2));
            customer1.setLastName(resultSet.getString(3));
            return customer1;
        };
    }
}
