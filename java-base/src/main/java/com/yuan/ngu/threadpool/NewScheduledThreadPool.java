package com.yuan.ngu.threadpool;

import java.util.concurrent.*;

/**
 * newScheduledThreadPool
 */
public class NewScheduledThreadPool {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newSingleThreadExecutor();
//        ThreadPoolExecutor newSingleThreadExecutor = new ThreadPoolExecutor(1, 1,
//                0L, TimeUnit.MILLISECONDS,
//                new LinkedBlockingQueue<>());

    }
}
