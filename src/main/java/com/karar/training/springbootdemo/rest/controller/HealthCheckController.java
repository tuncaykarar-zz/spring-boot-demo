package com.karar.training.springbootdemo.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @RequestMapping("/api/hello")
    public String hello(){
        return "hello";
    }
}
