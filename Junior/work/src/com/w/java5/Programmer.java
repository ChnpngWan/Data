package com.w.java5;
/**
 * （1）首先定义一个程序员的接口Programmer,接口中定义一个抽象方法ACode（）； （10分）
 * （2）创建一个Student类，实现接口Programmer并实现ACode（）方法，ACode（）方法可输出输出“程序员在敲代码”，
 * Student类有年龄，姓名，班级，性别私有属性（封装），各个属性的set，get方法，写空参构造方法，和一个有参构造方法包含这四个属性。 （10分）
 * （3）定义测试类，在main方法中创建一个Student对象，将自己的年龄，姓名，班级，性别，赋值给这个对象，并在控制台打印出对象的各个属性。调用所有的方法。（10分）*/
public interface Programmer {
    public void ACode();
}
class Student implements Programmer{
    private String name;
    private String stuClass;
    private int age;
    private String sex;
    public Student(String name, String stuClass, int age, String sex) {
        this.name = name;
        this.stuClass = stuClass;
        this.age = age;
        this.sex = sex;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void ACode() {
        System.out.println("程序员在敲代码");
    }
}
