package com.yuan.ngu.spring.boot.oracle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yuan.ngu.spring.boot.oracle.dao")
public class SpringBootOracleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOracleApplication.class, args);
    }

}
