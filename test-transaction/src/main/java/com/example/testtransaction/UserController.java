package com.example.testtransaction;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * DESCRIPTION
 *
 * @author zhangyinyuan
 * @create 2018-07-12 19:04
 **/
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/find")
    public String findUser(String name) throws Exception {
        return userService.findUser(name).getName();
    }

    @RequestMapping("list")
    public String list() throws JSONException {
        JSONObject out = new JSONObject();
        out.put("list", userService.findList());
        return out.toString();
    }

    @RequestMapping("/save")
    public String save(String name, Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        Long id = userService.save(user);
        return id.toString();
    }

    @RequestMapping("/saveList")
    public String saveList(String name, Integer age) {
        List<User> list = new ArrayList<User>();
        for (int i = 6; i < 11; i++) {
            User user = new User();
            user.setName(name + "_0000" + i);
            user.setAge(age);
            list.add(user);
        }
        userService.saveListUser(list);
        return "OK";
    }
}