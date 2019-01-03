//package com.yuan.ngu.springtask;
//
//import com.ule.cachecloud.utils.CacheCloudClientUtil;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//import redis.clients.jedis.Jedis;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//@Component
//public class Jobs2 {
//    private Logger log = LoggerFactory.getLogger(this.getClass());
//    public final static long ONE_Minute = 1000;
//
////    @Scheduled(fixedDelay = ONE_Minute)
////    public void fixedDelayJob() {
////        System.out.println(Dates.format_yyyyMMddHHmmss(new Date()) + " >>fixedDelay执行....");
////    }
//
////    @Scheduled(fixedRate = ONE_Minute)
////    public void fixedRateJob() {
////        System.out.println(Dates.format_yyyyMMddHHmmss(new Date()) + " >>fixedRate执行....");
////    }
//
//    //    @Scheduled(cron = "0 15 3 * * ?")
//    @Scheduled(cron = "*/1 * * * * ?")
//    public void cronJob() {
//        System.out.println(Dates.format_yyyyMMddHHmmss(new Date()) + " >>cron执行....");
//        try {
//            Jedis jedis = CacheCloudClientUtil.getJedis("pcsDataSyn-jedisclient.properties");
//            Long test0212313213s13fa1fda = jedis.setnx("test0212313213s13fa1fda", "12313");
//            log.info("cronJob called test0212313213s13fa1fda = {}", test0212313213s13fa1fda);
//            jedis.del("test0212313213s13fa1fda");
////            jedis.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    static class Dates {
//        public static String format_yyyyMMddHHmmss(Date date) {
//            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
//        }
//    }
//}