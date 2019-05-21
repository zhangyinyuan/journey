package com.yuan.ngu.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class newScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        //延迟后只执行一次
        scheduledThreadPool.schedule(new Runnable() {
            public void run() {
                System.out.println("delay 3 seconds");
            }
        }, 3, TimeUnit.SECONDS);

        //延迟0秒后,每隔3s重新执行一次 (延迟循环执行)
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("delay 0 seconds, and excute every 3 seconds");
            }
        }, 0, 3, TimeUnit.SECONDS);
        System.out.println("main execute end");
    }
}
