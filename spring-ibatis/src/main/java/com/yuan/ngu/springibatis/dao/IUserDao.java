package com.yuan.ngu.springibatis.dao;

import com.yuan.ngu.springibatis.model.User;

public interface IUserDao {
    User selectById(Integer id);
}
