package com.yuan.ngu.springibatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.Logger;

@SpringBootApplication
@MapperScan("com.yuan.ngu.springibatis.dao")
public class SpringIbatisApplication {

    private final static Logger logger = Logger.getLogger(SpringIbatisApplication.class);//给类初始化日志对象

    public static void main(String[] args) {
        logger.info("main called with args ");
        SpringApplication.run(SpringIbatisApplication.class, args);
    }

}

