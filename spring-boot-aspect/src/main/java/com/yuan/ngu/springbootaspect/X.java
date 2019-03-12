package com.yuan.ngu.springbootaspect;

import com.yuan.ngu.springbootaspect.annotation.AspectAnnotation;

public interface X {

     @AspectAnnotation(description = "测试调用其他类的时候的注解,会不会起作用")
     void run();
}
