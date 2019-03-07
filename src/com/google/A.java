package com.google;

public class A {
    void f(){
        System.out.println("h");
    }
}

class B extends A{
    void g(){
        System.out.println("I");
    }
}

class C extends B {
    void f() {
        System.out.println("7777");
    }

    void h() {
        System.out.println("wwwwww");
    }

    public static void main(String[] args) {
            A a = (A) new C();
            a.f();

    }
}

