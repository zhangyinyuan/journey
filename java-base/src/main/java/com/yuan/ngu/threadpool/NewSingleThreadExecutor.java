package com.yuan.ngu.threadpool;

import java.util.concurrent.*;

public class NewSingleThreadExecutor {

    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>());
        for (int i = 0; i < 10000; i++) {
            executor.execute(() -> {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程池中线程数目：" + executor.getPoolSize()
                        + " , 任务数: " + executor.getTaskCount()
                        + " , 队列中等待的任务数目：" + executor.getQueue().size()
                        + " , 已经执行完的任务数目：" + executor.getCompletedTaskCount()
                        + ",目前最大的线程数：" + executor.getLargestPoolSize()
                );
            });
        }
    }
}
