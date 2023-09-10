package org.nobleprog.springboot.orm.relationships;

import org.nobleprog.springboot.orm.relationships.mode.Customer;
import org.nobleprog.springboot.orm.relationships.mode.Order;
import org.nobleprog.springboot.orm.relationships.mode.Ticket;
import org.nobleprog.springboot.orm.relationships.mode.TicketKey;
import org.nobleprog.springboot.orm.relationships.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.Collections;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService bean = applicationContext.getBean(CustomerService.class);

        //Customers
        Customer customer1 = new Customer();
        customer1.setFirstName("John-1");
        customer1.setLastName("Smith-1");
        customer1.setStreet("street1");
        customer1.setNumber("1A");
        customer1.setZipcode("1ABC");
        customer1.setPrefix("PR1");
        customer1.setAreacode("1Area");
        customer1.setLine("123");

        Customer customer2 = new Customer();
        customer2.setFirstName("John-2");
        customer2.setLastName("Smith-2");
        customer2.setStreet("street2");
        customer2.setNumber("2A");
        customer2.setZipcode("2ABC");
        customer2.setPrefix("PR2");
        customer2.setAreacode("2Area");
        customer2.setLine("231");

        //Orders
        Order order1 = new Order();
        order1.setItem("Printer");
        Order order2 = new Order();
        order2.setItem("Laptop");

        //Customer orders
        customer1.setOrders(Arrays.asList(order1, order2));
        order1.setCustomer(customer1);
        order2.setCustomer(customer1);

        //Tickets
        TicketKey ticket1Key = new TicketKey();
        ticket1Key.setType("single");
        ticket1Key.setId("1");
        Ticket ticket1 = new Ticket();
        ticket1.setTicketKey(ticket1Key);
        ticket1.setOrigin("London");
        ticket1.setDestination("Delhi");

        TicketKey ticket2Key = new TicketKey();
        ticket2Key.setType("single");
        ticket2Key.setId("2");
        Ticket ticket2 = new Ticket();
        ticket2.setTicketKey(ticket2Key);
        ticket2.setOrigin("London");
        ticket2.setDestination("Mumbai");

        //Customer Tickets
        customer1.setTickets(Arrays.asList(ticket1, ticket2));
        customer2.setTickets(Arrays.asList(ticket1));
        ticket1.setCustomers(Arrays.asList(customer1, customer2));
        ticket2.setCustomers(Arrays.asList(customer1));

        bean.createCustomer(customer1);
        bean.createCustomer(customer2);
        bean.createOrder(order1);
        bean.createOrder(order2);
        bean.createTicket(ticket1);
        bean.createTicket(ticket2);

    }
}
