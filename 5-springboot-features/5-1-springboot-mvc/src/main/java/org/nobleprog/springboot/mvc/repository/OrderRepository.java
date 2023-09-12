package org.nobleprog.springboot.mvc.repository;

import org.nobleprog.springboot.mvc.mode.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Query(value = "select o from Order o where o.customer.customerType = 'Premium' and o.totalPrice >= :orderPrice")
    List<Order> getHighPriorityOrders(BigDecimal orderPrice);
}
