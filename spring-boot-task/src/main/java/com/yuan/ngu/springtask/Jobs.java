package com.yuan.ngu.springtask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Jobs {
    public final static long ONE_Minute = 1000;

    @Scheduled(fixedDelay = ONE_Minute)
    public void fixedDelayJob() {
        System.out.println(Dates.format_yyyyMMddHHmmss(new Date()) + " >>fixedDelay执行....");
    }

    @Scheduled(fixedRate = ONE_Minute)
    public void fixedRateJob() {
        System.out.println(Dates.format_yyyyMMddHHmmss(new Date()) + " >>fixedRate执行....");
    }

//    @Scheduled(cron = "0 15 3 * * ?")
    @Scheduled(cron = "*/5 * * * * ?")
    public void cronJob() {
        System.out.println(Dates.format_yyyyMMddHHmmss(new Date()) + " >>cron执行....");
    }

    static class Dates {
        public static String format_yyyyMMddHHmmss(Date date) {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        }
    }
}