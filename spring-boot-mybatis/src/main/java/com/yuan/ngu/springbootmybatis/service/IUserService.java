package com.yuan.ngu.springbootmybatis.service;

import com.yuan.ngu.springbootmybatis.model.User;

public interface IUserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
