package com.yuan.ngu.springibatis.service;

import com.yuan.ngu.springibatis.model.User;

public interface IUserService {
    User findById(Integer id);
}
