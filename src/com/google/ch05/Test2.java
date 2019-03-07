package com.google.ch05;
 class A{}
public class Test2 {
    public static void main(String[] args) {
       A a1 = new A();
       A a2 = new A();
       A a3 = a1;

       System.out.println(a1.equals(a2));
       System.out.println(a1==a2);
       //==比较的是两个对象地址是否相同，与对象中的内容无关


        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1.equals(s2));//ture
        //String的equals对object的equals做了覆盖
        //覆盖后的规则是比较两个字符串的内容是否相同
        System.out.println(s1==s2);//false
        //new 出来的各个对象彼此都不==

        String s3 = "Hello";
        String s4 = "Hello";
        System.out.println(s3.equals(s4));//true
        System.out.println(s3==s4);//true

    }
}
