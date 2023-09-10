package org.nobleprog.springboot.core.beanscopes;

import org.nobleprog.springboot.core.beanscopes.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService bean1 = applicationContext.getBean(CustomerService.class);
        CustomerService bean2 = applicationContext.getBean(CustomerService.class);
        System.out.println(bean1);
        System.out.println(bean2);
    }
}
