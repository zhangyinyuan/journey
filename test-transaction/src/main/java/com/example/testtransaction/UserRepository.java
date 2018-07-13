package com.example.testtransaction;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * DESCRIPTION
 *
 * @author zhangyinyuan
 * @create 2018-07-12 19:03
 **/
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
    User findByAgeGreaterThan(Integer age);
    List<User> findByNameLike(String name);
}