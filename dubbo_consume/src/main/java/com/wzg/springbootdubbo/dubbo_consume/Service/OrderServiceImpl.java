package com.wzg.springbootdubbo.dubbo_consume.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wzg.springbootdubbo.dubbo_api.service.OrderService;
import com.wzg.springbootdubbo.dubbo_api.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    private UserService userService;

    @Override
    public String getUser() {
        return userService.getUser();
    }
}
