package com.yuan.ngu.threadpool;

import java.util.concurrent.*;

/**
 * 定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
 */
public class NewFixedThreadPool {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
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
        Future<Integer> feature = fixedThreadPool.submit(() -> 1 + 2);
        Integer integer = feature.get();
        System.out.println(integer);
    }
}
