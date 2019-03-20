//package com.yuan.ngu.springbootaspect;
//
//import com.alibaba.fastjson.JSON;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
///**
// * 切点的功能是指出切面的通知应该从哪里织入应用的执行流    切面只能织入公共方法
// * execution(* com.tianmaying.service.BlogService.updateBlog(..))  and bean('tianmayingBlog')
// * 这表示将切面应用于BlogService的updateBlog方法上，但是仅限于ID为tianmayingBlog的Bean。
// * 也可以排除特定的Bean： execution(* com.tianmaying.service.BlogService.updateBlog(..))  and !bean('tianmayingBlog')
// * <p>
// * this()是用来限定方法所属的类，比如this(com.tianmaying.service.BlogServiceInterface)
// * 表示实现了com.tianmaying.service.BlogServiceInterface的所有类。如果this括号内是具体类而不是接口的话，则表示单个类
// *
// * @annotation表示具有某个标注的方法，比如@annotation(org.springframework.transaction.annotation.Transactional)表示被Transactional标注的方法 args 表示方法的参数属于一个特定的类
// * <p>
// * within 表示方法属于一个特定的类
// * <p>
// * target 表示方法所属的类
// * 1  任意公共方法（实际应用中一般不会定义这样的切点）
// * @Pointcut("execution(public * *(..))")
// * private void anyPublicOperation() {}
// * 2    在within(com.xyz.someapp.web包或者其子包下任意类的方法
// * @Pointcut("within(com.xyz.someapp.web..*))") private void inTrading() {}
// * <p>
// * 3    同时满足切点1和切点2条件的切点，这里使用了&&符号
// * @Pointcut("anyPublicOperation() && inTrading()")
// * <p>
// * 4     标注了Transactional的类的方法
// * @within(org.springframework.transaction.annotation.Transactional) // 4
// * private void transactionalClass() {}
// * <p>
// * 5    标注了Transactional的方法
// * @annotation(org.springframework.transaction.annotation.Transactional) //5
// * private void transactionalMethod() {}
// * @within(org.springframework.transaction.annotation.Transactional) // 4
// * @annotation(org.springframework.transaction.annotation.Transactional) //5
// * 上面的代码定义了三个切点：
// * <p>
// * 同时满足切点1和切点2条件的切点，这里使用了&&符号
// * 标注了Transactional的类的方法
// * 标注了Transactional的方法
// * <p>
// * 不管是否遇到异常 doAround doAfter 都会执行
// * 没有异常的时候执行顺序      doAround>doBefore>doAfter>doAfterReturning
// * 有异常的时候执行顺序        doAround>doAfter>doAfterThrowing
// */
//@Aspect
//@Component
//public class TestsAspect {
//    private static final Logger log = LoggerFactory.getLogger(TestsAspect.class);
//
//
//    //使用@Piontcut标注，填入切点表达式
//    @Pointcut("execution(public * com.yuan.ngu.springbootaspect.controller.*.*(..))")
//    public void logPointCut() {
//        log.info("logPointCut called");
//    }
//
//    /**
//     * 前置通知 在调用目标方法之前执行通知定义的任务
//     *
//     * @param joinPoint
//     * @throws Throwable
//     */
//    @Before("logPointCut()")
//    public void doBefore(JoinPoint joinPoint) {
//        log.info("doBefore called with joinPoint = ");
//    }
//
//    /**
//     * 后置通知，在目标方法执行结束后，无论执行结果如何都执行通知定义的任务
//     *
//     * @param joinPoint
//     * @throws Throwable
//     */
//    @After("logPointCut()")
//    public void doAfter(JoinPoint joinPoint) {
//        log.info("doAfter called with joinPoint = {}");
//    }
//
//    /**
//     * 后置通知，在目标方法执行结束后，如果执行成功，则执行通知定义的任务
//     *
//     * @param ret
//     * @throws Throwable
//     */
//    @AfterReturning(returning = "ret", pointcut = "logPointCut()")//
//    public void doAfterReturning(Object ret) {
//        log.info("doAfterReturning called with ret = {}", JSON.toJSONString(ret));
//        try {
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 主要用于处理程序中未处理的异常
//     *
//     * @param ex
//     * @throws Throwable
//     */
//    @AfterThrowing(throwing = "ex", pointcut = "logPointCut()")//
//    public void doAfterThrowing(Throwable ex) {
//        log.error("doAfterThrowing called with 目标方法抛出异常 ", ex);
//        try {
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 环绕通知，在目标方法执行前和执行后，都需要执行通知定义的任务
//     *
//     * @param pjp
//     * @return
//     * @throws Throwable
//     */
//    @Around("logPointCut()")
//    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
//        log.info("doAround called with pjp = ");
//        Object ob = pjp.proceed();
//        log.info("doAround called with pjp.proceed 执行结束");
//        return ob;
//    }
//}
