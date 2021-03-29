package com.redis.api.redis_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTest1 {

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/insertKey")
    public String insertKey() {
        redisTemplate.opsForValue().set("mykey", "myvalue");
        return "insertKey";
    }

}
