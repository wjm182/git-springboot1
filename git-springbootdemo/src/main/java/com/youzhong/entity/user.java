package com.youzhong.entity;

public class user {

    private int id;
    private int age;
    private int name;
    private String  sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getName() {
        return name;

    }

    public void setName(int name) {
        this.name = name;
    }

    public user(int id) {
        this.id = id;
    }



}
