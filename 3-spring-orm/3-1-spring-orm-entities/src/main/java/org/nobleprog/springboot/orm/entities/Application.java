package org.nobleprog.springboot.orm.entities;

import org.nobleprog.springboot.orm.entities.mode.Customer;
import org.nobleprog.springboot.orm.entities.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService bean = applicationContext.getBean(CustomerService.class);
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Smith-orm-entities");
        Customer customer1 = new Customer();
        customer1.setFirstName("John-1");
        customer1.setLastName("Smith-orm-entities-1");
        bean.createCustomer(customer);
        bean.createCustomer(customer1);
        Customer customerResult = bean.getCustomer(1);
        Customer customerResult1 = bean.getCustomer(2);
        System.out.println(customerResult.getFirstName() + customerResult.getLastName());
        System.out.println(customerResult1.getFirstName() + customerResult1.getLastName());
    }
}
