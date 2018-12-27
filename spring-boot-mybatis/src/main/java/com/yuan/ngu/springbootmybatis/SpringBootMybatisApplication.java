package com.yuan.ngu.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.yuan.ngu.springbootmybatis.mapper")
@EnableScheduling
public class SpringBootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisApplication.class, args);
    }
}
