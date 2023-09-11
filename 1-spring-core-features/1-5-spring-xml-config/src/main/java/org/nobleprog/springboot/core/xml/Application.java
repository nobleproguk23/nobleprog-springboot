package org.nobleprog.springboot.core.xml;

import org.nobleprog.springboot.core.xml.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        //TODO: Create Application Context using xml configuration
        CustomerService bean1 = applicationContext.getBean(CustomerService.class);
        System.out.println(bean1.getCustomer("1").getFirstName());
    }
}
