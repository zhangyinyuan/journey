package com.yuan.ngu.springbootmybatis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Jobs {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Scheduled(cron = "*/30 * * * * ?")
    public void cronJob() {
        log.info("cronJob called");
    }
}