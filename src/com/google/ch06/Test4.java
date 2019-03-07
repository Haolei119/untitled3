package com.google.ch06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

 public class Test4 {
         public static void main(String[] args)throws CloneNotSupportedException {
        User1[] user1s = {};
        Comparator<User1>userSort=(o1, o2)->{
            if(o1.getId() > o2.getId()) return 1;
            else if(o1.getId() > o2.getId()) return 0;
            else return -1;
        };


        //java中的两个类型：
        //1 引用类型：类类型，数组类型，lambda类型
        //2 基本类型 8个

        Runnable r=() ->{};

        Supplier s=() ->0;

        Consumer c=(o) ->{};

      //lambda的语法：（）->{}
      //lambda本质上就是一个方法，（）是方法的参数，{}内是方法体
      //由于lambda本质上是方法，而方法的参数类型已经确定，所以（）内的参数不需要类型


        Arrays.sort(user1s, userSort);

        Lambda l =(num1, num2)->{
            System.out.println(num1+num2);
            return 0;
        };
        //lambda表达式其实就是一个方法
        //接收这个表达式的必须是一个函数式接口（仅包含一个抽象方法的接口）
        //所有的函数式接口都可以用来存放lambda表达式
    }
}
