package com.yuan.ngu.springbootmybatis.service.impl;

import com.alibaba.fastjson.JSON;
import com.yuan.ngu.springbootmybatis.mapper.CityMapper;
import com.yuan.ngu.springbootmybatis.model.City;
import com.yuan.ngu.springbootmybatis.model.User;
import com.yuan.ngu.springbootmybatis.service.ICityService;
import com.yuan.ngu.springbootmybatis.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class CityServiceImpl implements ICityService {
    private Logger logger = LoggerFactory.getLogger(CityServiceImpl.class);
    @Resource
    private CityMapper cityMapper;
    @Resource
    private IUserService userService;
    @Autowired
    private ICityService cityService;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return cityMapper.deleteByPrimaryKey(1L);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
    public int insert(City record) {
        User user = new User("xiong", "php");
        int insertSelective = 0;
        try {

            insertSelective = userService.insertSelective(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.debug("user = {}", JSON.toJSONString(user));
        cityMapper.insert(new City("西安", "西安市"));
        //事务不会起作用
        new Thread(() -> newThreadMethod()).start();
        //cityService.newThreadMethod() 事务生效
//        new Thread(() -> cityService.newThreadMethod()).start();
        return insertSelective;
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

    @Override
    @Transactional
    public void newThreadMethod() {
        logger.info("newThreadMethod called");
        cityMapper.insert(new City("西安1", "西安市1"));
        "".substring(0, 10);
    }
}
