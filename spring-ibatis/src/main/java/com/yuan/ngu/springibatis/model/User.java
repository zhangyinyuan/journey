package com.yuan.ngu.springibatis.model;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = -3963147100573795726L;
    private Integer id;

    private String name;

    private Integer addr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAddr() {
        return addr;
    }

    public void setAddr(Integer addr) {
        this.addr = addr;
    }
}
