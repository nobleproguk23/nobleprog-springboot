package org.nobleprog.springboot.orm.inheritance.concretetable.repository;

import org.nobleprog.springboot.orm.inheritance.concretetable.mode.Ticket;

public interface CustomerRepository {

    void createTicket(Ticket ticket);
}
