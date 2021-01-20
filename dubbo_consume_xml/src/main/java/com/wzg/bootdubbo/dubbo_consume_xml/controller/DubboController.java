package com.wzg.bootdubbo.dubbo_consume_xml.controller;

import com.wzg.boordubbo.dubbo_provider_xml.dubboService.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DubboController {

    @Resource
    private DubboService dubboService;

    @RequestMapping("/getUser/{name}")
    public String getUser(@PathVariable String name){
        return dubboService.getName(name);
    }
}
