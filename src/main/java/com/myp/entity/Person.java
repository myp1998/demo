package com.myp.entity;

import java.util.Date;

/**
 * Person 表示联系人
 */
public class Person {
    private int id;
    private String name;//姓名
    private String mobile;//手机号
    private String city;//城市
    private Date birthday;//生日

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 无参构造方法
     */
    public Person() {
    }

    /**
     * 构造方法
     */
    public Person(String name, String mobile, String city, Date birthday) {
        this.name = name;
        this.mobile = mobile;
        this.city = city;
        this.birthday = birthday;
    }

    public Person(int id, String name, String mobile, String city, Date birthday) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.city = city;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", city='" + city + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
