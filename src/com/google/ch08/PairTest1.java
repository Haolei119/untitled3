package com.google.ch08;

import java.time.LocalDate;
import java.util.ArrayList;

public class PairTest1 {
    public static void main(String[] args) {
        class Employee {}
        //类型限定：自定义泛型类，自定义泛型方法
        class User<T extends Cloneable>{}

        //统配泛型：统配泛型一定带？
        //通配泛型是一种类型，用在赋值运算符的左侧
        Pair<? extends Number> num1 = new Pair<Integer>();
        //<子类 extends 父类>

        Pair<? super Number> num2 = new Pair<Object>();
        //<子类 super 父类>

        Pair<?> num4 = new Pair<LocalDate>();

        Number n = new Integer(1);

        ArrayList list1 = new ArrayList<Employee>();
        ArrayList list2 = new ArrayList<Number>();

    }

}
