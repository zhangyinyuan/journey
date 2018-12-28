package com.yuan.ngu.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/Hi")
    public String sayHello() {
        return "hello.html";
    }
}
