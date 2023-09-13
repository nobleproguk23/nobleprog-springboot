package org.nobleprog.springboot.rest.mode;

import javax.persistence.*;

@Entity
@Table(name = "shipment")
public class ShipmentInstruction {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "item")
    private String item;

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
}
