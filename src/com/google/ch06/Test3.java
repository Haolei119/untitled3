package com.google.ch06;

import java.time.LocalDate;

public class Test3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User1 tom = new User1(1,"Tom", LocalDate.now());

        User1 tomClone = (User1) tom.clone();//tom.clone();克隆

        System.out.println("Tom:"+tom);
        System.out.println("Tom Clone:"+tomClone);
        System.out.println(tom.getBirthday() == tomClone.getBirthday());
        //浅拷贝/克隆只拷贝了基本类型，对于引用类型依然是共用的
        //深拷贝/克隆要对每一个类型都进行拷贝，达到两个对象的每个部分都完全被克隆
        //如何进行深拷贝/克隆？先进行浅拷贝，即super。clone()，机器默认做的就是浅拷贝，在对每一个引用类型单独拷贝
    }
}
