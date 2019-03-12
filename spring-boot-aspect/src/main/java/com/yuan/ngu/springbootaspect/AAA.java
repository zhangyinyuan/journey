package com.yuan.ngu.springbootaspect;

import com.yuan.ngu.springbootaspect.annotation.AspectAnnotation;

public class AAA implements X{


    @Override
    @AspectAnnotation(description = "注解加在这里,AnnotationAspect就扫描不到了  Why?")  // FIXME: 2019/3/12
    public void run() {
        System.out.println("run");
    }
}
