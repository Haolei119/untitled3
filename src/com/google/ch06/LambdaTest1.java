package com.google.ch06;

import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.IntToLongFunction;

public class LambdaTest1 {

    public static void main(String[] args) {

        IntToLongFunction f = (a)->{
            return a+1L;
        };

        BinaryOperator<Integer> b = (o1, o2)->{
            return o1+o2;
        };

        BiPredicate<Integer, Double> b1 = (t,u)->t>u;
        //lambda简化：
        //参数只有一个时可以省略小括号
        //方法体只有一句话时可以省略大括号
    }
}
