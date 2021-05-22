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

    public static void main(String[] args) {
        System.err.println(getMoney(3420,0.03,41));
        System.err.println(getMoney(3420,0.12,41));
    }

    private static double getMoney(double money, double tax, int year) {
        double reMoney = 0;
        for (int i = 0; i < year; i++) {
            reMoney = reMoney * (1 + tax) + money;
//            System.err.println("money: " + reMoney);
        }
        return reMoney;
    }

}
