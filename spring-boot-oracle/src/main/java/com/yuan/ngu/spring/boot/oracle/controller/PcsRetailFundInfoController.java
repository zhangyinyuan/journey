package com.yuan.ngu.spring.boot.oracle.controller;

import com.yuan.ngu.spring.boot.oracle.dao.PcsRetailFundInfoMapper;
import com.yuan.ngu.spring.boot.oracle.pojo.po.PcsRetailFundInfo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(path = "/pcsRetailFundInfo")
public class PcsRetailFundInfoController {

    @Resource
    private PcsRetailFundInfoMapper pcsRetailFundInfoMapper;

    @RequestMapping(path = "/instert",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object insert(){
        PcsRetailFundInfo pcsRetailFundInfo = new PcsRetailFundInfo();
        pcsRetailFundInfo.setRemark("测试主键");
        pcsRetailFundInfoMapper.insertSelective(pcsRetailFundInfo);
        return pcsRetailFundInfo;
    }
}
