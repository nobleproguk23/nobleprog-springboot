package org.nobleprog.springboot.orm.relationships.mode;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "item")
    private String item;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
