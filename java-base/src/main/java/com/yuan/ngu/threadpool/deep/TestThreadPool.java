package com.yuan.ngu.threadpool.deep;

import java.util.concurrent.*;

/**
 * 举个例子
 * 假如有一个工厂，工厂里面有10个工人（corePoolSize），每个工人同时只能做一件任务。
 * 　　因此只要当10个工人中有工人是空闲的，来了任务就分配给空闲的工人(空闲线程)做；
 * 　　当10个工人都有任务在做时，如果还来了任务，就把任务进行排队(WorkQueue)等待；
 * 　　如果说新任务数目增长的速度远远大于工人做任务的速度，那么此时工厂主管可能会想补救措施，比如重新招4个临时工人(maximumPoolSize - corePoolSize)进来；
 * 　　然后就将任务也分配给这4个临时工人做；
 * 　　如果说着14个工人做任务的速度还是不够，此时工厂主管可能就要考虑不再接收新的任务或者抛弃前面的一些任务了(reject 拒绝策略)。
 * 　　当这14个工人当中有人空闲时，而新任务增长的速度又比较缓慢，工厂主管可能就考虑辞掉4个临时工了（回收空闲线程），只保持原来的10个工人，毕竟请额外的工人是要花钱的。
 */
public class TestThreadPool {

    /**
     * API详细说明 https://www.cnblogs.com/exe19/p/5359885.html
     * https://blog.csdn.net/qq_23078761/article/details/86506503
     * 常用的四种线程池 https://www.cnblogs.com/webglcn/p/5265901.html
     */
    public static void main(String[] args) throws InterruptedException {
        //当线程池中的线程数目大于核心线程数的时候，任务将会被放到缓存队列中去。
        //当队列满了之后，便创建新的线程 ？？？怎么理解
        int corePoolSize = 5;
        //池中最大可以容纳的线程数
        int maximumPoolSize = 10;
        //空闲线程：没有执行任务的线程叫做空闲线程
        //默认情况下，该参数只当线程数 > corePoolSize的时候，才会起作用。
        // 若想线程数 < corePoolSize的时候也起作用。需要设置executor.allowCoreThreadTimeOut(true);
        // 例如当前设置，当空闲线程超过200毫秒,则将空闲线程回收（销毁该空闲线程）
        long keepAliveTime = 200;
        int capacity = 10;
        //任务缓存队列，即workQueue，它用来存放等待执行的任务
        //　workQueue的类型为BlockingQueue<Runnable>，通常可以取下面三种类型：
        //　　1）ArrayBlockingQueue：基于数组的先进先出队列，此队列创建时必须指定大小；
        //　　2）LinkedBlockingQueue：基于链表的先进先出队列，如果创建时没有指定此队列大小，则默认为Integer.MAX_VALUE；
        //　　3）synchronousQueue：这个队列比较特殊，它不会保存提交的任务，而是将直接新建一个线程来执行新来的任务。
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                corePoolSize,
                maximumPoolSize,
                keepAliveTime,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(capacity));
        //动态修改核心线程数和最大线程数
        //executor.setCorePoolSize(corePoolSize);
        //executor.setMaximumPoolSize(maximumPoolSize);
        //拒绝策略：当未执行完的任务数（队列中等待的任务数 + 正在执行但是还没有执行结束的任务数） > maximunPoolSize 时，线程池将会执行拒绝新任务的策略
        //设置拒绝策略
        //ThreadPoolExecutor.AbortPolicy:丢弃任务并抛出RejectedExecutionException异常。
        //ThreadPoolExecutor.DiscardPolicy：也是丢弃任务，但是不抛出异常。
        //ThreadPoolExecutor.DiscardOldestPolicy：丢弃队列最前面的任务，然后重新尝试执行任务（重复此过程）
        //ThreadPoolExecutor.CallerRunsPolicy：由调用线程处理该任务
        //executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        for (int i = 0; i < 20; i++) {
            MyCommand command = new MyCommand("task-" + (i + 1));
            executor.execute(command);
            //Thread.sleep(1);
            //largestPoolSize() 用来记录线程池中曾经出现过的最大线程数
//            System.out.println("线程池中线程数目：" + executor.getPoolSize()
//                    + " , 任务数: " + executor.getTaskCount()
//                    + " , 队列中等待的任务数目：" + executor.getQueue().size()
//                    + " , 已经执行完的任务数目：" + executor.getCompletedTaskCount()
//                    + ",目前最大的线程数：" + executor.getLargestPoolSize()
//            );
        }
        //优雅关闭，不再接收新的任务，直到队列中的所有任务全部执行完毕后，再关闭
        executor.shutdown();
        //暴力关闭。不管任务是否执行完毕，都会强行关闭线程池
        //executor.shutdownNow();
        System.out.println("executor.shutdown()");
    }
}
