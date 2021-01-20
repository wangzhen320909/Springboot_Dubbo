package com.wzg.boordubbo.dubbo_provider_xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo_provider.xml"})
public class DubboProviderXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderXmlApplication.class, args);
    }

}
