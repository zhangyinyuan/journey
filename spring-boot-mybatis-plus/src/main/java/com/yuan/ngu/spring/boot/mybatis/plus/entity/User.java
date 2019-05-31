package com.yuan.ngu.spring.boot.mybatis.plus.entity;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class User implements Serializable {
    private Integer id;

    private String name;

    private String address;
}
