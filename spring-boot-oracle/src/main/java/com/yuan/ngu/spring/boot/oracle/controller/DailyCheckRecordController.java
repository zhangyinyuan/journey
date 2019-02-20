package com.yuan.ngu.spring.boot.oracle.controller;

import com.github.pagehelper.PageHelper;
import com.yuan.ngu.spring.boot.oracle.dao.DailyCheckRecordMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DailyCheckRecordController {

    @Resource
    private DailyCheckRecordMapper dailyCheckRecordMapper;

    @RequestMapping(path = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object test() {
        PageHelper.startPage(1, 10);
        return dailyCheckRecordMapper.selectReconciliationList(null, null);
    }
}
