package com.spring.scratch.controllers;

import com.spring.scratch.entity.Customers;
import com.spring.scratch.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
public class CustomersController {
//    CRUD
    @Autowired
    CustomersRepository customersRepository;

    @RequestMapping("customers-new")
    public String customerAdd() {
        return "customer-add";
    }

    @RequestMapping("details")
    public String customerAdd(Customers customersEntity) {
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
        Customers customers = customersRepository.findById(cid).orElse(null);
        assert customers != null;
        mv.addObject(customers);
        return mv;
    }

    //REST API METHODS
    //All Customers
    @RequestMapping("customers")
    @ResponseBody
    public List<Customers> getAllCustomers() {
        return customersRepository.findAll();
    }

    //Get Customers By ID
    @RequestMapping("customers/{cid}")
    @ResponseBody
    public Optional<Customers> getCustomersFindById(@PathVariable("cid") int cid) {
        return customersRepository.findById(cid);
    }

    //Post Customer
    @PostMapping("customers")
    public Customers postCustomersData(@RequestBody Customers customers) {
        customersRepository.save(customers);
        return customers;
    }

    //Delete Customer by id
    @DeleteMapping("customers/{cid}")
    public Customers deleteCustomersFindById(@PathVariable("cid") int cid) {
        Customers customers = customersRepository.getOne(cid);
        customersRepository.delete(customers);
        return customers;
    }

    //Update Customer
    @PutMapping(path = "customers/{cid}", consumes = {"application/json"})
    public Customers updateCustomers(@RequestBody Customers customers) {
        customersRepository.save(customers);
        return customers;
    }

}
