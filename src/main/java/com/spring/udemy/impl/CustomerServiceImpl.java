package com.spring.udemy.impl;

import com.spring.udemy.domain.Customer;
import com.spring.udemy.domain.DomainObject;
import com.spring.udemy.services.AbstractMapService;
import com.spring.udemy.services.CustomerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৭/৪/২০
 Time: ১২:৩২ AM
 ***/
@Service
@Profile("map")
public class CustomerServiceImpl extends AbstractMapService implements CustomerService {

    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Customer getById(Integer id) {
        return (Customer) super.getById(id);
    }

    @Override
    public Customer saveOrUpdate(Customer domainObject) {
        return (Customer) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }

}