package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LEI
 * @date 2021/5/5 0:07
 */
@RestController
public class HelloWorld {

    @GetMapping("test")
    public String getTest(){
        System.err.println("test");
        return "Hello World";
    }
}
