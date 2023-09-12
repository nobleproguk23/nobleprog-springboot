package org.nobleprog.springboot.rest.rest;

import org.nobleprog.springboot.rest.mode.Customer;
import org.nobleprog.springboot.rest.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//TODO: Add Orders rest operation
@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void createCustomer(Customer customer) {
        //TODO: create customers

    }

    //TODO: mark customer inactive and fetch active customers only
}
