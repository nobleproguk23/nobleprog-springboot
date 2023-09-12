package org.nobleprog.springboot.orm.inheritance.joinedsubclass.repository;

import org.nobleprog.springboot.orm.inheritance.joinedsubclass.mode.Ticket;

public interface CustomerRepository {

    void createTicket(Ticket ticket);
}
