package com.yuan.ngu.threadpool.deep;

/**
 * 深入学习指南
 * https://www.cnblogs.com/exe19/p/5359885.html
 */
public class MyCommand implements Runnable {
    public  String taskName;
    public MyCommand(String taskName){
        this.taskName = taskName;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 正在执行任务： " +taskName );
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println("MyCommand 执行出错");
            e.printStackTrace();
        }
    }
}
