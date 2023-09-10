package org.nobleprog.springboot.orm.relationships.repository;

import org.nobleprog.springboot.orm.relationships.mode.Customer;
import org.nobleprog.springboot.orm.relationships.mode.Order;
import org.nobleprog.springboot.orm.relationships.mode.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Component
public class CustomerRepositoryImpl implements CustomerRepository {
    private final EntityManager entityManager;

    @Autowired
    public CustomerRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /*
    create a file named "orm-entities.mv.db" under c:\\users\nobleprog
    connect to h2 db using url jdbc:h2:tcp://localhost/~/orm-relationships
    */

    public Customer getCustomerById(int id) {
        Customer customer = entityManager.find(Customer.class, id);
        return customer;
    }

    public void createCustomer(Customer customer) {
        entityManager.getTransaction().begin();
        entityManager.persist(customer);
        entityManager.getTransaction().commit();
    }

    @Override
    public void createOrder(Order order) {
        entityManager.getTransaction().begin();
        entityManager.persist(order);
        entityManager.getTransaction().commit();
    }

    @Override
    public void createTicket(Ticket ticket) {
        entityManager.getTransaction().begin();
        entityManager.persist(ticket);
        entityManager.getTransaction().commit();
    }
}
