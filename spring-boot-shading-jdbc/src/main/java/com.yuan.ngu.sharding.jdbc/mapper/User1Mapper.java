package com.yuan.ngu.sharding.jdbc.mapper;

import com.yuan.ngu.sharding.jdbc.entity.UserEntity;

import java.util.List;

public interface User1Mapper {
    List<UserEntity> getAll();

    void update(UserEntity user);

    //UserEntity insert(UserEntity user);
}
