package com.yuan.ngu.spring.boot.mybatis.plus;

import com.alibaba.fastjson.JSON;
import com.yuan.ngu.spring.boot.mybatis.plus.dao.UserMapper;
import com.yuan.ngu.spring.boot.mybatis.plus.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringBootMybatisPlusApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        User user = userMapper.selectById(1);
        log.info("user = {}", JSON.toJSONString(user));
    }

}
