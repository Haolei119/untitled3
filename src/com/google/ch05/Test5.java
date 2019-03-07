package com.google.ch05;

public class Test5 {
    void foo(int i, double...d) {
        System.out.println(i+" ");
        for(int j=0; j<d.length;j++)
        System.out.printf("%-3f",d[j]);
    }


    public static void main(String[] args) {
        Test5 t5 = new Test5();
        t5.foo(1);
        System.out.println("\n=================\n");
        t5.foo(1,2,3,4,5,6);
    }
}
