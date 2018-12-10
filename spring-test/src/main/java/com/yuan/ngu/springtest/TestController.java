package com.yuan.ngu.springtest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(path = "/test")
    public Object test() {
        if (serverPort != null) {
            throw new RuntimeException("测试异常");
        }
        return serverPort;
    }
}
