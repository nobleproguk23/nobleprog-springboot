package org.nobleprog.springboot.core;

import org.nobleprog.springboot.core.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //TODO: Get Bean from appContext and print customer name
    }
}
