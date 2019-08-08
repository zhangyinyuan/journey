package com.example.logdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LogDemoApplication {

    public static final Logger logger = LoggerFactory.getLogger(LogDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LogDemoApplication.class, args);
    }

    @RequestMapping("/testRequest")
    public void testRequest() {
        System.out.println("testRequest");
        logger.debug("logger.debug");
        logger.info("logger.info");
        logger.error("logger.error");
    }

}
