package com.yuan.ngu.springbootmybatis.controller;

import com.yuan.ngu.springbootmybatis.service.ICityService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(path = "/city", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CityController {

    @Resource
    private ICityService service;

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public Object test() {
        return service.insert(null);
    }
}
