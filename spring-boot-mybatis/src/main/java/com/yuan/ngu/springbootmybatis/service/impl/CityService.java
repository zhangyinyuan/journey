package com.yuan.ngu.springbootmybatis.service.impl;

import com.alibaba.fastjson.JSON;
import com.yuan.ngu.springbootmybatis.mapper.CityMapper;
import com.yuan.ngu.springbootmybatis.model.City;
import com.yuan.ngu.springbootmybatis.model.User;
import com.yuan.ngu.springbootmybatis.service.ICityService;
import com.yuan.ngu.springbootmybatis.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class CityService implements ICityService {

    @Resource
    private CityMapper cityMapper;
    @Resource
    private IUserService userService;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cityMapper.deleteByPrimaryKey(1L);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
    public int insert(City record) {
        User user = new User("xiong", "php");
        userService.insertSelective(user);
        System.out.println("user = " + JSON.toJSONString(user));
        cityMapper.insert(new City("西安", "西安市"));
        userService.deleteByPrimaryKey(1);
        "".substring(10);
        return 1;
    }

    @Override
    public int insertSelective(City record) {
        return 0;
    }

    @Override
    public City selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(City record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(City record) {
        return 0;
    }
}
