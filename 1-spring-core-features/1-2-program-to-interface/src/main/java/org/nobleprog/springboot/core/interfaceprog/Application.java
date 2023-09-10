package org.nobleprog.springboot.core.interfaceprog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService bean = applicationContext.getBean(CustomerService.class);
        System.out.println(bean.getCustomer("1").getFirstName());
    }
}
