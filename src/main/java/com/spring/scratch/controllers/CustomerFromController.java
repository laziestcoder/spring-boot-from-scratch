package com.spring.scratch.controllers;

import com.spring.scratch.classfiles.Customers;
import com.spring.scratch.entity.CustomerEntity;
import com.spring.scratch.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * User: towfiq
 * Date: ২৩/৩/২০
 * Time: ৯:৫৮ PM
 **/
@Controller
public class CustomerFromController {
    @Autowired
    CustomersRepository customersRepository;

    @RequestMapping("customers-new")
    public String customerAdd() {
        return "customer-add";
    }

    @RequestMapping("details")
    public String customerAdd(CustomerEntity customersEntity) {
        customersRepository.save(customersEntity);
        return "customer-add";
    }

    @GetMapping("getdetails")
    public String getDetails() {
        return "viewcustomers";
    }

    @PostMapping("getdetails")
    public ModelAndView getdetails(@RequestParam int cid) {
        ModelAndView mv = new ModelAndView("retrieve");
        CustomerEntity customerEntity = customersRepository.findById(cid).orElse(null);
        assert customerEntity != null;
        mv.addObject(customerEntity);
        return mv;
    }

    //REST API METHODS
    //All Customers
    @RequestMapping("customers")
    @ResponseBody
    public List<CustomerEntity> getAllCustomers() {
        return customersRepository.findAll();
    }

    //Get Customers By ID
    @RequestMapping("customers/{cid}")
    @ResponseBody
    public Optional<CustomerEntity> getCustomersFindById(@PathVariable("cid") int cid) {
        return customersRepository.findById(cid);
    }

    //Post Customer
    @PostMapping("customers")
    public CustomerEntity postCustomersData(@RequestBody CustomerEntity customerEntity) {
        customersRepository.save(customerEntity);
        return customerEntity;
    }

    //Delete Customer by id
    @DeleteMapping("customers/{cid}")
    public CustomerEntity deleteCustomersFindById(@PathVariable("cid") int cid) {
        CustomerEntity customerEntity = customersRepository.getOne(cid);
        customersRepository.delete(customerEntity);
        return customerEntity;
    }

    //Update Customer
    @PutMapping(path = "customers/{cid}", consumes = {"application/json"})
    public CustomerEntity updateCustomers(@RequestBody CustomerEntity customerEntity) {
        customersRepository.save(customerEntity);
        return customerEntity;
    }

}
