package com.spring.securityapp.cookie.security;

public class CookieVerificationFailedException extends RuntimeException {
    public CookieVerificationFailedException(String message) {
        super(message);
    }
}
