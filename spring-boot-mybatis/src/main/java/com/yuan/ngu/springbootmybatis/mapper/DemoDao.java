package com.yuan.ngu.springbootmybatis.mapper;

import com.yuan.ngu.springbootmybatis.model.Demo;

import java.util.Map;

public interface DemoDao {
    Demo selectList(Map<String, Object> map);
}
