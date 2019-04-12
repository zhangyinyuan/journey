//package com.yuan.ngu.springbootaspect.aspect;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class AnnotationAspect {
//    private Logger logger = LoggerFactory.getLogger(AnnotationAspect.class);
//
//    @Pointcut("execution(public * com.yuan.ngu.springbootaspect.*.*(..))")
//    public void pointCut(){}
//
//
//    @Before(value = "pointCut()")
//    public void before(JoinPoint joinPoint){
//        logger.info("before called with joinPoint = {} joinPoint");
//    }
//
//
//    @Around(value = "pointCut()")
//    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        logger.info("around called with proceedingJoinPoint = {} proceedingJoinPoint");
//        proceedingJoinPoint.proceed();
//    }
//}
