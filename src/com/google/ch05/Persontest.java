package com.google.ch05;

public class Persontest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        System.out.println(p1.toString());
        //打印一个对象和打印一个对象的toString方法是一样的
        //toString就是Object中的方法，会输出“类名@哈希马”
        System.out.println(Integer.toHexString(p1.hashCode()));

        System.out.println(p2);
        System.out.println(Integer.toHexString(p2.hashCode()));
    }
}
