package com.yuan.ngu.springibatis.service;

import com.yuan.ngu.springibatis.dao.IUserDao;
import com.yuan.ngu.springibatis.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User findById(Integer id) {
        return userDao.selectById(id);
    }

}
