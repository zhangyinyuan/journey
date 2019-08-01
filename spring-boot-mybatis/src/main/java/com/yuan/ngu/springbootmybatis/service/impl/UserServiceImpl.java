package com.yuan.ngu.springbootmybatis.service.impl;

import com.yuan.ngu.springbootmybatis.mapper.UserMapper;
import com.yuan.ngu.springbootmybatis.model.User;
import com.yuan.ngu.springbootmybatis.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int deleteByPrimaryKey = userMapper.deleteByPrimaryKey(id);
        return deleteByPrimaryKey;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int insertSelective(User record) {
        int insertSelective = userMapper.insertSelective(record);
        //TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        "".substring(10);
        return insertSelective;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }
}
