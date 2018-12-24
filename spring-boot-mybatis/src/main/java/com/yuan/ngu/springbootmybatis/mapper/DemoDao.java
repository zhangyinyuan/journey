package com.yuan.ngu.springbootmybatis.mapper;

import com.yuan.ngu.springbootmybatis.model.Demo;

import java.util.List;
import java.util.Map;

public interface DemoDao {
    List<Demo> selectList(Map<String, Object> map);
}
