package com.spring.third.party.cookie.controller;

import com.spring.third.party.cookie.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @Autowired
    AuthenticationService authenticationService;

    @GetMapping("")
    public String getCookies() {
        return authenticationService.getCookies();
    }

}
