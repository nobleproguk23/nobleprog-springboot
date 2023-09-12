package org.nobleprog.springboot.data.jpa.mode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
@SecondaryTables({
        @SecondaryTable(name = "address", pkJoinColumns = @PrimaryKeyJoinColumn(name = "customer_id", referencedColumnName = "customer_id")),
        @SecondaryTable(name = "phone", pkJoinColumns = @PrimaryKeyJoinColumn(name = "customer_id", referencedColumnName = "customer_id")),
})
public class Customer {

    @Id
    @GeneratedValue
    @Column(name = "customer_id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    @Column
    private String customerType;

    @Column(name = "street", table = "address")
    private String street;

    @Column(name = "number", table = "address")
    private String number;

    @Column(name = "zipcode", table = "address")
    private String zipcode;
    @Column(name = "areacode", table = "phone")
    private String areacode;

    @Column(name = "prefix", table = "phone")
    private String prefix;

    @Column(name = "line", table = "phone")
    private String line;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }


    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}
