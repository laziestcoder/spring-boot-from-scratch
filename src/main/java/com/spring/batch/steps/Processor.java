package com.spring.batch.steps;

import org.springframework.batch.item.ItemProcessor;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ৫/৪/২০
 Time: ১:৪৫ PM
 ***/
public class Processor implements ItemProcessor<String, String> {

    @Override
    public String process(String data) throws Exception {
        return data.toUpperCase();
    }

}