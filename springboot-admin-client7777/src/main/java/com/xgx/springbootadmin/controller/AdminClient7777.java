package com.xgx.springbootadmin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot/admin")
public class AdminClient7777 {
    @RequestMapping("/sayHello")
    public String sayHello(String name){
        return "Hello," +name;
    }
}
