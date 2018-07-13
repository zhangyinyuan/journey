package com.example.testtransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * DESCRIPTION
 *
 * @author zhangyinyuan
 * @create 2018-07-12 19:03
 **/
@Service
@Transactional
public class UserService002 {
    @Autowired
    private UserRepository002 userRepository;

    public User002 findUser(String name) {
        return userRepository.findByName(name);
    }

    public List<User002> findList() {
        return userRepository.findAll();
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public Long save(User002 user) {
        Long id = userRepository.save(user).getId();
        "".substring(3);
        return id;
    }

    public void saveListUser(List<User002> list) {
        for (User002 user : list)
            save(user);
    }

}