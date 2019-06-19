package com.yuan.ngu.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class AsyncForkJoinPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long beginTime = System.currentTimeMillis();
        Integer begin = 1, end = 1000;
        int count = 0;
        for (int i = begin; i <= end; i++) {
            count += i;
            //模拟耗时操作
            Thread.sleep(5);
        }
        System.out.println("简单的for循环 执行结果 = " + count);
        long endTime = System.currentTimeMillis();
        System.out.println("简单的for循环 执行耗时  = " + (endTime - beginTime));
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        SyncForkJoinPool.ComputeTask computeTask = new SyncForkJoinPool.ComputeTask(begin, end);
        ForkJoinTask<Integer> submit = forkJoinPool.submit(computeTask);
        System.out.println("ForkJoinPool 执行结果 = " + submit.get());
        System.out.println("ForkJoinPool  执行耗时 = " + (System.currentTimeMillis() - endTime));
    }


    static class ComputeTask extends RecursiveTask<Integer> {
        private Integer begin;
        private Integer end;
        private static Integer DIFFENT_VALUE = 10;

        public ComputeTask(Integer begin, Integer end) {
            this.begin = begin;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            int between = end - begin;
            int count = 0;
            if (between < DIFFENT_VALUE) {
                for (int i = begin; i <= end; i++) {
                    count += i;
                    try {
                        //模拟耗时操作
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                int mid = begin + (end - begin) / 2;
                SyncForkJoinPool.ComputeTask leftTask = new SyncForkJoinPool.ComputeTask(begin, mid);
                SyncForkJoinPool.ComputeTask rightTask = new SyncForkJoinPool.ComputeTask(mid + 1, end);
                invokeAll(leftTask, rightTask);
                count = leftTask.join() + rightTask.join();
            }

            this.setRawResult(count);
            return count;
        }
    }
}
