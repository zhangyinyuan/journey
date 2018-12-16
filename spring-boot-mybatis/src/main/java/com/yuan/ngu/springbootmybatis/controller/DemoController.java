package com.yuan.ngu.springbootmybatis.controller;

import com.yuan.ngu.springbootmybatis.mapper.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/demo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DemoController {

    @Autowired
    private DemoDao demoDao;

    @RequestMapping(path = "/selectOneDemo", method = RequestMethod.GET)
    public Object selectOneDemo() {
        return demoDao.selectList(null);
    }
}
