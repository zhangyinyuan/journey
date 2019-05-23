package com.yuan.ngu.springbootmybatis.service;

import com.yuan.ngu.springbootmybatis.model.City;

public interface ICityService {
    int deleteByPrimaryKey(Long id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

    void newThreadMethod();

    void a();
}
