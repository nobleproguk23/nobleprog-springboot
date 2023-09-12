package org.nobleprog.springboot.orm.inheritance.joinedsubclass;

import org.nobleprog.springboot.orm.inheritance.joinedsubclass.mode.OneWayTicket;
import org.nobleprog.springboot.orm.inheritance.joinedsubclass.mode.ReturnTicket;
import org.nobleprog.springboot.orm.inheritance.joinedsubclass.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService bean = applicationContext.getBean(CustomerService.class);

        OneWayTicket oneWayTicket = new OneWayTicket();
        oneWayTicket.setNumber("One123");
        oneWayTicket.setDepartureDate(LocalDate.now().plusDays(1));

        ReturnTicket returnTicket = new ReturnTicket();
        returnTicket.setNumber("Ret123");
        returnTicket.setArrivalDate(LocalDate.now().plusDays(2));

        bean.createTicket(oneWayTicket);
        bean.createTicket(returnTicket);

    }
}
