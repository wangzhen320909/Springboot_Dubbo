package com.wzg.bootdubbo.dubbo_consume_xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo_provider.xml"})
public class DubboConsumeXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumeXmlApplication.class, args);
    }

}
