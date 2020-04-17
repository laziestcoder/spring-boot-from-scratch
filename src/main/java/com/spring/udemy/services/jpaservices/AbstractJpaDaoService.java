package com.spring.udemy.services.jpaservices;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ১১/৪/২০
 Time: ৯:০৬ PM
 ***/
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

public class AbstractJpaDaoService {

    protected EntityManagerFactory emf;

    @PersistenceUnit
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }
}