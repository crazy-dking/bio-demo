package com.cn.zj.io;

import java.io.Serializable;

/**
 * @Description:
 * @Author: wangdakai
 * @Date: 2021/11/12
 */
public class Person implements Serializable {
    private int age;
    private String name;
    private transient  int hight;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hight=" + hight +
                '}';
    }
}
