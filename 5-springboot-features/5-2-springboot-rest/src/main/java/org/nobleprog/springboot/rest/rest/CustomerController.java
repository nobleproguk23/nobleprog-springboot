package org.nobleprog.springboot.rest.rest;

import org.nobleprog.springboot.rest.mode.Customer;
import org.nobleprog.springboot.rest.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/customers")
@Validated
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void createCustomer(@Valid Customer customer) {
        //TODO: create customers
        customerService.createCustomer(customer);
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable(value="id") @Min(value=1, message = "customer id starts with 1") int id, @RequestParam(value = "firstName", required = false) String firstName) {
        try {
            Customer customer = customerService.getCustomer(id);
            if(customer == null) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer not found ");
            }
            return customer; //http://localhost:8080/customers/customer/2
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer not found ");
        }
    }

    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable(value="id") int id){
        customerService.deleteCustomer(id);
    }

    @PutMapping("/{id}")
    public void updateCustomer(@PathVariable(value="id") int id, Customer customer) {
       customerService.updateCustomer(customer, id);
    }

}
