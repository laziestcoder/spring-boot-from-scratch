package com.spring.udemy.services.mapservices;

import com.spring.udemy.domain.DomainObject;
import com.spring.udemy.domain.Product;
import com.spring.udemy.services.mapservices.AbstractMapService;
import com.spring.udemy.services.ProductService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৭/৪/২০
 Time: ১২:৩৩ AM
 ***/
@Service
@Profile("map")
public class ProductServiceMapImpl extends AbstractMapService implements ProductService {

    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Product getById(Integer id) {
        return (Product) super.getById(id);
    }

    @Override
    public Product saveOrUpdate(Product domainObject) {
        return (Product) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }

}