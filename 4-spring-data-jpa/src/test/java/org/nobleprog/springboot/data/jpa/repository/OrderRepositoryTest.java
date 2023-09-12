package org.nobleprog.springboot.data.jpa.repository;

import org.junit.jupiter.api.Test;
import org.nobleprog.springboot.data.jpa.mode.Customer;
import org.nobleprog.springboot.data.jpa.mode.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderRepositoryTest {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CustomerJpaRepository customerJpaRepository;

    @Test
    public void testHighPriorityOrders() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("JPA");
        customer.setCustomerType("Premium");


        Order order1 = new Order();
        order1.setTotalPrice(BigDecimal.valueOf(2000));
        order1.setItem("Item1");
        order1.setCustomer(customer);

        Order order2 = new Order();
        order2.setTotalPrice(BigDecimal.valueOf(200));
        order2.setItem("Item2");
        order2.setCustomer(customer);

        customer.setOrders(Arrays.asList(order1, order2));

        customerJpaRepository.save(customer);

        orderRepository.saveAll(Arrays.asList(order1, order2));

        List<Order> highPriorityOrders = orderRepository.getHighPriorityOrders(BigDecimal.valueOf(1500));

        assertEquals(highPriorityOrders.size(),1);
        assertEquals(highPriorityOrders.get(0).getItem(),"Item1");
    }
}