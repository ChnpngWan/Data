package com.w.java4;
/**
 * （1）定义一个Flower花作为父类
 * 属性：颜色 价格
 * 属性要进行封装（即为每条私有属性写set，get方法）
 * 定义无参构造方法，和传两个参数的有参构造方法一个。
 * 方法：显示详细信息的方法showInfo （15分）
 * （2）定义一个Rose玫瑰花类继承Flower类
 * 玫瑰花自己的属性：产地（要求对产地属性进行封装 私有化属性）
 * 重写父类中的显示详细信息的方法showInfo，在重写的showInfo方法中通过super调用父类的showInfo方法；并显示产地信息。
 * 再定义一个方法warn警告显示：不要摘玫瑰花，小心扎手！ （15分）
 * （3）定义测试类Test完成：（10分）
 * ①实例化Flower类，调用构造方法赋值，并调用方法，输出：
 * 花的颜色是白色，价格是10元
 * ②实例化玫瑰花类，调用方法，输出：
 * 花的颜色是紫色，价格是30元
 * 产地是大理
 * 不要摘玫瑰花，小心扎手！
 *
 * @author Dream*/
public class Flower {
    private String color;
    private double price;

    public Flower() {

    }

    public void showInfo(){
        System.out.println(color+"颜色，卖价:"+price+"￥");
    }

    public Flower(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
