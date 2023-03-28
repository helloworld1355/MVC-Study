package com.example.mvcstudy.entity;


//需要--get--函数，否则取不到数据
public class User {
    private Integer id;
    private String name;
    private String num;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(String num) {
        this.num = num;
    }

}
