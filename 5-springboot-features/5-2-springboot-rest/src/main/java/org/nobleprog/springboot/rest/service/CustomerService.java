package org.nobleprog.springboot.rest.service;

import org.nobleprog.springboot.rest.mode.Customer;
import org.nobleprog.springboot.rest.mode.ShipmentInstruction;
import org.nobleprog.springboot.rest.repository.CustomerJpaRepository;
import org.nobleprog.springboot.rest.repository.OrderRepository;
import org.nobleprog.springboot.rest.repository.ShipmentInstructionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class CustomerService {

    private final CustomerJpaRepository customerRepository;
    private final OrderRepository orderRepository;
    private final ShipmentInstructionRepository shipmentInstructionRepository;

    @Autowired
    public CustomerService(CustomerJpaRepository customerRepositoryImpl, OrderRepository orderService, ShipmentInstructionRepository shipmentInstructionRepository) {
        this.customerRepository = customerRepositoryImpl;
        this.orderRepository = orderService;
        this.shipmentInstructionRepository = shipmentInstructionRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }


    public Customer getCustomer(int id) {
        return customerRepository.findById(id).get();
    }

    @Transactional()
    public void createCustomer(Customer customer) {
      ///  orderRepository.saveAll(customer.getOrders());
        customerRepository.saveAndFlush(customer);
        if(customer.getOrders() != null) {
            customer.getOrders().forEach(order -> order.setCustomer(customer));
        }
        orderRepository.saveAll(customer.getOrders());

        //Transaction management
        if("Premium".equals(customer.getCustomerType()) && customer.getOrders() != null) {
            ShipmentInstruction shipmentInstruction = new ShipmentInstruction();
            shipmentInstruction.setItem(customer.getOrders().get(0).getItem());
            if("Phone".equals(customer.getOrders().get(0).getItem())) {
                throw new RuntimeException("Phone can not be shipped right away");
            }
            shipmentInstructionRepository.save(shipmentInstruction);
        }
    }


    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }

    public void updateCustomer(Customer customer, int id) {
        customerRepository.save(customer);
    }
}
