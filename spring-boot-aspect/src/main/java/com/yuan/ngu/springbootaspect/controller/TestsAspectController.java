package com.yuan.ngu.springbootaspect.controller;

import com.yuan.ngu.springbootaspect.AAA;
import com.yuan.ngu.springbootaspect.annotation.AspectAnnotation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/testsAspect")
public class TestsAspectController {

    @RequestMapping(path = "/")
//    @AspectAnnotation(description = "注解加在这里,AnnotationAspect可以扫描到")
    public Object testsAspect() {
//        if ("".length() == 0){
//            throw new RuntimeException("测试异常0000");
//        }
        new AAA().run();
        return "testsAspect";
    }
}
