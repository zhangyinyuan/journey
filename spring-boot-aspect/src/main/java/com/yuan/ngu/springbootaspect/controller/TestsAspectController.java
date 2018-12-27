package com.yuan.ngu.springbootaspect.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/testsAspect")
public class TestsAspectController {

    @RequestMapping(path = "/")
    public Object testsAspect() {
//        if ("".length() == 0){
//            throw new RuntimeException("测试异常0000");
//        }
        return "testsAspect";
    }
}
