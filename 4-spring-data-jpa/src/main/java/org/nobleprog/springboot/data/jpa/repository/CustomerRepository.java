package org.nobleprog.springboot.data.jpa.repository;

import org.nobleprog.springboot.data.jpa.mode.Customer;
import org.nobleprog.springboot.data.jpa.mode.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public Customer getCustomerById(int id) {
        Customer customer = entityManager.find(Customer.class, id);
        return customer;
    }

    @Transactional
    public void createCustomer(Customer customer) {
        entityManager.persist(customer);
       entityManager.flush();
    }

    public List<Customer> getCustomerWithFirstName(String firstName) {
        return entityManager.createQuery("select c from Customer c where c.firstName like :name")
                .setParameter("name","%" + firstName +"%")
                .getResultList();
    }

    @Transactional
    public void createOrder(Order order) {
        entityManager.persist(order);
       entityManager.flush();
    }

}
