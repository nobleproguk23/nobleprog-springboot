package org.nobleprog.springboot.orm.inheritance.joinedsubclass.mode;

import javax.persistence.*;

//TODO: use joined strategy
@Entity
@Table(name = "ticket")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Ticket {

    @Id
    @GeneratedValue
    @Column(name = "ticket_id")
    private int ticket_id;

    @Column(name = "number")
    private String number;

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
