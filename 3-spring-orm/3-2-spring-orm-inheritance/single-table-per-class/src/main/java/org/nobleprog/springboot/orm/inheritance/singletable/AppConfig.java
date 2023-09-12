package org.nobleprog.springboot.orm.inheritance.singletable;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Configuration
@ComponentScan 
public class AppConfig {

    @Bean
    public EntityManager entityManager() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("orm-inheritance");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }

}
