package com.spring.third.party.cookie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    CookieService cookieService;

    @Autowired
    GlencoreApiService glencoreApiService;

    @Value("${third.party.loginUrl}")
    private String loginUrl;

    @Value("${third.party.username}")
    private String username;

    @Value("${third.party.password}")
    private String password;

    @Value("${third.party.cookie.name}")
    private String cookieName;

    public String getCookies() {
        String cookie = cookieService.getCookie(loginUrl, username, password, cookieName);
        glencoreApiService.callSiteCarrier(cookie);
        return cookie;
    }
}