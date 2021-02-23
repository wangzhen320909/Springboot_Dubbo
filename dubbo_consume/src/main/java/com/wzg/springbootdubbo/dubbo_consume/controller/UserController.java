package com.wzg.springbootdubbo.dubbo_consume.controller;

import com.wzg.springbootdubbo.dubbo_api.service.OrderService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import org.slf4j.Logger;

@RestController
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Resource
    private OrderService orderService;

    @RequestMapping("/getUser")
    public String getUser(){
        logger.info("start visit getUser");
        return orderService.getUser();
    }
}
