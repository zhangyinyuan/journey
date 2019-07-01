package com.yuan.ngu.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.yuan.ngu.springbootmybatis.mapper")
//@EnableScheduling
@EnableTransactionManagement
public class SpringBootMybatisApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringBootMybatisApplication.class);

    public static void main(String[] args) {
        StackTraceElement[] stacks = (new Throwable()).getStackTrace();
        logger.info("==========================开始打印方法的调用链 开始==========================");
        for (int i = stacks.length - 1; i >= 0; i--) {
            StackTraceElement stack = stacks[i];
            logger.info("开始输出方法调用链 : i =" + (stacks.length - i) + " " + stack.getClassName() + "-" + stack.getMethodName());
        }
        logger.info("==========================开始打印方法的调用链 结束==========================");
        SpringApplication.run(SpringBootMybatisApplication.class, args);
    }
}
