package com.w.java9;

public class Bird extends Animal implements A{
    @Override
    public void fly() {
        System.out.println("鸟儿飞翔");
    }

    @Override
    public void eat() {
        System.out.println("鸟儿吃虫");
    }
}
