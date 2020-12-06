package com.bit;//当前包的路径，标识当前类所在的包

/**
 * ClassName TestDemo
 * Description TODO
 * Author 30712
 * Date 2020-08-01
 * Time 16:32
 */
/**
 * 继承：  is  a  的关系
 * 程序层面上表达继承关系：extends 关键字
 * Cat：子类，派生类
 * Animal：父类，基类，超类
 * 注意：
 * 1.java属于单继承，只能继承一个父类
 * 2.子类会继承父类除构造方法外的所有东西
 * 面试问题：this  和 super 关键字
 * this代表的是当前对象的引用。super 代表父类的引用
 * this.data  访问当前对象的成员变量
 * this.func()
 * this()
 */
class Animal {
    protected String name;//protected 关键字
    public Animal(String name) {
        this.name =name;
    }
    public  void eat() {
        System.out.println(this.name + "正在吃！");
    }
}
class Cat extends Animal {
    public  Cat (String name){
        super(name);
    }
    public  int age;//特有属性
    public void jump() {
        System.out.println(super.name);
        super.eat();
        System.out.println(this.name + "正在跳");
    }
}
class Bird extends Animal{
    public  Bird (String name){
        super(name);//必须放到第一行
        System.out.println("heugfcuydvbc");

    }
    public void fly() {
        System.out.println(this.name + "正在飞");
    }
}

public class TestDemo {
    public static void main(String[] args) {

/*        Cat cat =new Cat();
        cat.name = "咪咪";
        cat.eat();*/
        //咪咪正在吃

        Cat cat = new Cat("咪咪");
        cat.eat();
    }
}
