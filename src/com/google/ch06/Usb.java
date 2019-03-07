package com.google.ch06;

import java.io.Serializable;
//接口就是用来被继承或实现的
//接口和接口之间可以进行继承，如interface Usb extends Bus
//接口和类之间可以进行实现，class Computer implements Usb
//接口可以继承很多接口，注意类只能继承一个基类
//一个类可以实现多个接口
public interface Usb extends Bus, Serializable {

}

interface Bus{
    public abstract void foo();
    //接口中方法的修饰符都是public abstract，即便不写也是。

    public static final int a = 1;
    //接口中的属性都是 public static final，不写也是。

    //以下两个语法点在Java 8中新添加
    public static void goo() {
        System.out.println("goo.....");
    } //static方法可以有实现
       //static方法和类中static方法一样，用接口名或类名调用即可

    public default void hoo(){
        System.out.println("hoo.....");
    } //default方法可以有实现
       //default方法用实现了接口的对象进行调用
      //该方法可以覆盖

}

class Computer implements Usb, Bus{

    @Override
    public void foo() {

    }
}

class Test10{
    public static void main(String[] args) {
        //Bus b = new Bus();接口不能产生对象
        //接口和抽象类在犹豫不决的情况下，优先用接口
        //接口是一个规范或者功能上的实现
        //抽象类侧重父子类关系，在共有功能上进行抽象
        //接口中不能有普通方法，也不能有变量
        Bus.goo();
        Computer computer = new Computer();
        computer.hoo();
    }
}
