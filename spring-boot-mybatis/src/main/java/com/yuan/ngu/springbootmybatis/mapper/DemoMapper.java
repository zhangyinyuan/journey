package com.yuan.ngu.springbootmybatis.mapper;

import com.yuan.ngu.springbootmybatis.model.Demo;

public interface DemoMapper {
    int deleteByPrimaryKey(String demoId);

    int insert(Demo record);

    int insertSelective(Demo record);

    Demo selectByPrimaryKey(String demoId);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
}