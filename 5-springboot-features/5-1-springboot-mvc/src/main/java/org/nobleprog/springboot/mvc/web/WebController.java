package org.nobleprog.springboot.mvc.web;

import org.nobleprog.springboot.mvc.mode.Customer;
import org.nobleprog.springboot.mvc.mode.Order;
import org.nobleprog.springboot.mvc.service.CustomerService;
import org.nobleprog.springboot.mvc.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WebController {
    private final CustomerService customerService;
    private final OrderService orderService;

    public WebController(CustomerService customerService, OrderService orderService) {
        this.customerService = customerService;
        this.orderService = orderService;
    }

    @GetMapping("/customers")
    public String getCustomers(Model model) {
        //TODO: get all customers and add to model attribute
        return "customers";
    }

    @GetMapping("/orders")
    public String getOrders(Model model) {
        //TODO: get all orders and add to model attribute
        return "orders";
    }
}
