package com.example.testtransaction;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * DESCRIPTION
 *
 * @author zhangyinyuan
 * @create 2018-07-12 19:03
 **/
public interface UserRepository002 extends JpaRepository<User002, Long> {
    User002 findByName(String name);
    User002 findByAgeGreaterThan(Integer age);
    List<User002> findByNameLike(String name);
}