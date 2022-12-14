package com.w.java425;

import java.util.Objects;

public class User {
    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(sex, user.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age);
    }

    @Override
    public String toString() {
        return this.name+""+this.sex+""+this.age;
    }

}
