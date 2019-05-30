package com.yuan.ngu.springbootaspect.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//解决跨域.如果@CrossOrigin注解controller上,表示这个类下的所有接口都支持跨域.如果是在方法上.表示当前方法支持跨域
@CrossOrigin
public class TestsAspectController {

    @RequestMapping(path = "/testsAspect")
    public Object testsAspect(@RequestHeader HttpHeaders headers) {
        //获取请求头属性
        String token = headers.get("token").get(0);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result","0000");
        return jsonObject;
    }
}
