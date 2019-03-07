package com.google.ch05;

public class Test1 {

    public static void main(String[] args) {

        Fu z = new Zi();
        z.foo();
        //b.goo(1,3.1);
        //多态不能直接调用子类方法
        ((Zi) z).goo(1,3.1);


        Fu z1 = new Fu();
        z1.foo();

        //为了不让程序在运行时出错
        if (z1 instanceof Zi)
            //(变量 instanceof 类名) 用于判断变量的真实类型是否是后面的类型
            //如果是执行 如果不是就不执行

        ((Zi) z1).goo(1,3.1);
        //编译时没有错误，运行时出错
        //父类对象无法通过强制类型转换为子类对象
    }
}
