package com.test.demowzg.wzg_test.task;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@ImportResource(locations={"quartz-config.xml"})
@ImportResource(locations={"spring-task.xml"})
public class ConfigClass {
}
