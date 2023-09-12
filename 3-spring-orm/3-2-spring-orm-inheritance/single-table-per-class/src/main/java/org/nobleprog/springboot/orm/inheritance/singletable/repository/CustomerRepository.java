package org.nobleprog.springboot.orm.inheritance.singletable.repository;

import org.nobleprog.springboot.orm.inheritance.singletable.mode.Ticket;

public interface CustomerRepository {

    void createTicket(Ticket ticket);
}
