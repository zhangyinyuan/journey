package com.example.testtransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * DESCRIPTION
 *
 * @author zhangyinyuan
 * @create 2018-07-12 19:03
 **/
@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService002 userService002;

    @Autowired
    private UserService userService;

    public User findUser(String name) {
        return userRepository.findByName(name);
    }

    public List<User> findList() {
        return userRepository.findAll();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Long save(User user) {
        List<User> list = new ArrayList<User>();
        list.add(new User("abc", 123));
        try {
            userService.saveListUser(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Long id = userRepository.save(user).getId();
        Assert.isNull(id, "id只能为空");
        return id;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void saveListUser(List<User> list) {
        for (User user : list) {
            userRepository.save(user);
        }
    }

}