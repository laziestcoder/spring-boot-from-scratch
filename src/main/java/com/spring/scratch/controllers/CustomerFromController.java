package com.spring.scratch.controllers;

import com.spring.scratch.classfiles.Customers;
import com.spring.scratch.entity.CustomerEntity;
import com.spring.scratch.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("customers")
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


}
