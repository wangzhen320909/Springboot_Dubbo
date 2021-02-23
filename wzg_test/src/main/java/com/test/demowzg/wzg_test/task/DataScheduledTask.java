package com.test.demowzg.wzg_test.task;

import com.test.demowzg.wzg_test.model.People;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataScheduledTask {

    Logger log = LoggerFactory.getLogger(DataScheduledTask.class);

    public void springContextXmlexecute() throws InterruptedException {
        Thread.sleep(1000);
//        log.info(list.toString());
        log.info("springContextXmlexecute 开始8888888888888888888");
    }
}
