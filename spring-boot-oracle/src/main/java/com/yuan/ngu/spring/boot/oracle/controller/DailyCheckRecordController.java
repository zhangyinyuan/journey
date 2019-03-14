package com.yuan.ngu.spring.boot.oracle.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuan.ngu.spring.boot.oracle.dao.DailyCheckRecordMapper;
import com.yuan.ngu.spring.boot.oracle.pojo.dto.ReconciliationDetailDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

@RestController
public class DailyCheckRecordController {

    @Resource
    private DailyCheckRecordMapper dailyCheckRecordMapper;

    @RequestMapping(path = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object test() {
        PageHelper.startPage(1, 10);
        return dailyCheckRecordMapper.selectReconciliationList("2019-02-20", "2019-02-20");
    }

    @RequestMapping(path = "/selectReconciliationDetail", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Map<String, Object> selectReconciliationDetail() {
        PageHelper.startPage(1, 10);
        List<String> versionList = Arrays.asList("1,4".split(","));
        List<ReconciliationDetailDto> reconciliationDetailDtos = dailyCheckRecordMapper.selectReconciliationDetail("2019-02-20", versionList);
        PageInfo<ReconciliationDetailDto> page = new PageInfo<>(reconciliationDetailDtos);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("reconciliationDetailDtos", reconciliationDetailDtos);
        resultMap.put("page", page);
        return resultMap;
    }

    @RequestMapping(path = "/selectLandingAnomaly", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Set<String> selectLandingAnomaly() {
        return dailyCheckRecordMapper.selectLandingAnomaly("2019-02-23", 1,"3101");
    }


}
