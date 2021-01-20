package com.wzg.springbootdubbo.provider_dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wzg.springbootdubbo.dubbo_api.model.User;
import com.wzg.springbootdubbo.dubbo_api.service.UserService;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {
        User user = new User();
        user.setAge(12);
        user.setName("alis");
        user.setSex("girl");
        return user.toString();
    }
}
