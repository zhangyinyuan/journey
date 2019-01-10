package com.yuan.ngu.springibatis.controller;

import com.yuan.ngu.springibatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(path = "/findById", method = RequestMethod.GET)
    public Object findById(Integer userId) {
        return userService.findById(userId);
    }
}