package com.yuan.ngu.spring.boot.mybatis.plus.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuan.ngu.spring.boot.mybatis.plus.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
