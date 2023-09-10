package org.nobleprog.springboot.orm.entities;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;

@Configuration
@ComponentScan 
public class AppConfig {

    @Bean
    public EntityManager entityManager() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("orm-entities");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }

}
