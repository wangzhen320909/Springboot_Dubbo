package com.wzg.bootdubbo.dubbo_consume_xml.controller;

import com.wzg.boordubbo.dubbo_provider_xml.dubboService.DubboService;
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

    public static void main(String[] args) {
        String ss = "Receive=123456\r\n";
        int start = ss.indexOf("Receive=") + "Receive=".length();
        int end = ss.indexOf("\r\n", start);
        System.out.println(start);
        System.out.println(end);
        System.out.println(Integer.parseInt(ss.substring(start, end)));
    }
}
