package com.yuan.ngu.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewFixedThreadPool {

    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        for (int i = 0; i < 1000; i++) {
            final int index = i;
            fixedThreadPool.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " " + (index + 1));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
