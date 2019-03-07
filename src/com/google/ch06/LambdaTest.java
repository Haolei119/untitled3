package com.google.ch06;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest {


//    void f(final int i, double d) {
//        //lambda中使用的变量是不能被修改的
//        //i=i+1;
//        d = d + 1;
//        double j = 1.0;
//        Comparator c = (x, y) -> {
//            System.out.println(i);
//            return 0;
//        };
//
//    }


    public static void main (String[]args){
                Integer[] nums = {1, 5, 7, 2, 9, 3, 8};
                Arrays.sort(nums, Integer::compare);
                //Arrays.sort (nums, (x,y)->{
                //return Integer.compare(x,y);
                //});
                //：：方法引用，引用compare （x,y）->{return Integer.compare(x,y);},用lambda表达式简化为上式
                //：：后面的方法有几个参数，就要在替换为lambda中写几个参数
                //（x）->{System.out.println(x)}等价于System.out.println
                //System.out.println(Arrays.toString(nums));
            }
}
