package org.nobleprog.springboot.data.jpa.repository;

import org.nobleprog.springboot.data.jpa.mode.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    //TODO: implement high priority order using query
    //select o from Order o where o.customer.customerType = 'Premium' and o.totalPrice >= :orderPrice
    List<Order> getHighPriorityOrders(BigDecimal orderPrice);
}
