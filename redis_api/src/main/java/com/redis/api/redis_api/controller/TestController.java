package com.redis.api.redis_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/getUser")
    public String getUser(){
        System.out.println("getUser");
        return "getUser";
    }
}
