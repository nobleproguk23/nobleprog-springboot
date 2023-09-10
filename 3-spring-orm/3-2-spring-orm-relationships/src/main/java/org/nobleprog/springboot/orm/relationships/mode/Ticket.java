package org.nobleprog.springboot.orm.relationships.mode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ticket")
public class Ticket {

    @EmbeddedId
    private TicketKey ticketKey;

    @Column(name = "origin")
    private String origin;
    @Column(name = "destination")
    private String destination;

    @ManyToMany
    private List<Customer> customers;

    public TicketKey getTicketKey() {
        return ticketKey;
    }

    public void setTicketKey(TicketKey ticketKey) {
        this.ticketKey = ticketKey;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
