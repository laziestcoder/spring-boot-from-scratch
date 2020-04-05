package com.spring.udemy.service;

import com.spring.udemy.impl.*;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৫/৪/২০
 Time: ৯:৪৭ PM
 ***/
public class HelloWorldFactory {
    public HelloWorldService createHelloWorldService(String language){
        HelloWorldService service = null;

        switch (language){
            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                service = new HelloWorldServiceSpanishImpl();
                break;
            case "fr":
                service = new HelloWorldServiceFrenchImpl();
                break;
            case "de":
                service = new HelloWorldServiceGermanImpl();
                break;
            case "pl":
                service = new HelloWorldServicePolish();
                break;
            case "ru":
                service = new HelloWorldServiceRussianImpl();
                break;
            default: new HelloWorldServiceEnglishImpl();
        }

        return service;
    }
}
