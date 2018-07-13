package com.example.testtransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TestTransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestTransactionApplication.class, args);
    }
}
