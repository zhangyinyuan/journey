package com.yuan.ngu.springbootmybatis.controller;

import com.github.pagehelper.PageHelper;
import com.yuan.ngu.springbootmybatis.mapper.DemoDao;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(path = "/demo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DemoController {

    @Resource
    private DemoDao demoDao;

    @RequestMapping(path = "/selectOneDemo", method = RequestMethod.GET)
    public Object selectOneDemo(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return demoDao.selectList(null);
    }
}
