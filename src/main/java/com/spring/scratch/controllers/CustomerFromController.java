package com.spring.scratch.controllers;

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
    @GetMapping("add-customer")
    public String customerAdd() {
        return "customer-add";
    }

    @PostMapping("details")
    public String viewDetails(
            @RequestParam("cid") int cid,
            @RequestParam("cname") String cname,
            @RequestParam("cemail") String cemail, ModelMap modelMap
    ) {
        modelMap.put("cid", cid);
        modelMap.put("cname", cname);
        modelMap.put("cemail", cemail);
        return "viewcustomers";
    }


}
