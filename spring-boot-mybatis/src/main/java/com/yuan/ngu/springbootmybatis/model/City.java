package com.yuan.ngu.springbootmybatis.model;

public class City {
    private Long id;

    private String country;

    private String map;

    private String name;

    private String state;

    private Integer testInt;

    public City(String country, String name) {
        this.country = country;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map == null ? null : map.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getTestInt() {
        return testInt;
    }

    public void setTestInt(Integer testInt) {
        this.testInt = testInt;
    }
}