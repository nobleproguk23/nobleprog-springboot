package org.nobleprog.springboot.rest.web;

import org.nobleprog.springboot.rest.mode.Customer;
import org.nobleprog.springboot.rest.mode.Order;
import org.nobleprog.springboot.rest.service.CustomerService;
import org.nobleprog.springboot.rest.service.OrderService;
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
        List<Customer> customers  = customerService.getAllCustomers();
        model.addAttribute("customers", customers);
        return "customers";
    }

    @GetMapping("/orders")
    public String getOrders(Model model) {
        List<Order> orders  = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        return "orders";
    }
}
