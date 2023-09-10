package org.nobleprog.springboot.orm.relationships.repository;

import org.nobleprog.springboot.orm.relationships.mode.Customer;
import org.nobleprog.springboot.orm.relationships.mode.Order;
import org.nobleprog.springboot.orm.relationships.mode.Ticket;

public interface CustomerRepository {
    Customer getCustomerById(int id);

    void createCustomer(Customer customer);

    void createOrder(Order order);

    void createTicket(Ticket ticket);
}
