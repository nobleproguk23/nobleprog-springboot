package org.nobleprog.springboot.orm.inheritance.concretetable.repository;

import org.nobleprog.springboot.orm.inheritance.concretetable.mode.Ticket;
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

    @Override
    public void createTicket(Ticket ticket) {
        entityManager.getTransaction().begin();
        entityManager.persist(ticket);
        entityManager.getTransaction().commit();
    }
}
