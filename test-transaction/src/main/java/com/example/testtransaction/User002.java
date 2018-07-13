package com.example.testtransaction;

import javax.persistence.*;

/**
 * DESCRIPTION
 *
 * @author zhangyinyuan
 * @create 2018-07-12 19:02
 **/
@Entity(name = "User002")
public class User002 {
    private Long id;
    private String name;
    private Integer age;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(nullable = false)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}