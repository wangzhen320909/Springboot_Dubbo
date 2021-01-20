package com.wzg.boordubbo.dubbo_provider_xml.dubboService.impl;

import org.springframework.stereotype.Service;
import com.wzg.boordubbo.dubbo_provider_xml.dubboService.DubboService;

@Service
public class DubboServiceImpl implements DubboService {
    @Override
    public String getName(String name) {
        return "姓名："+name;
    }
}
