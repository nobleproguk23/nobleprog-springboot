package org.nobleprog.springboot.data.jpa.repository;

import org.nobleprog.springboot.data.jpa.mode.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Query(value = "select * from customer where customer_id ", nativeQuery = true)
    List<Order> getHighPriorityOrders(BigDecimal orderPrice);
}
