package com.wzg.springbootdubbo.dubbo_consume.controller;

import com.wzg.springbootdubbo.dubbo_api.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private OrderService orderService;

    @RequestMapping("/getUser")
    public String getUser(){
        return orderService.getUser();
    }
}
